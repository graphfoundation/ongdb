/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.cypher.internal.runtime.parallel

import java.util.concurrent._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.duration.Duration

/**
  * A simple implementation of the Scheduler trait
  */
class SimpleScheduler(executor: Executor, waitTimeout: Duration) extends Scheduler {

  private val executionService = new ExecutorCompletionService[TaskResult](executor)

  override def execute(task: Task, tracer: SchedulerTracer): QueryExecution = {
    val queryTracer: QueryExecutionTracer = tracer.traceQuery()
    new SimpleQueryExecution(schedule(task, None, queryTracer), this, queryTracer, waitTimeout.toMillis)
  }

  def isMultiThreaded: Boolean = true

  def schedule(task: Task, upstreamWorkUnit: Option[WorkUnitEvent], queryTracer: QueryExecutionTracer): Future[TaskResult] = {
    val scheduledWorkUnitEvent = queryTracer.scheduleWorkUnit(task, upstreamWorkUnit)
    val callableTask =
      new Callable[TaskResult] {
        override def call(): TaskResult = {
          val workUnitEvent = scheduledWorkUnitEvent.start()
          try {
            TaskResult(task, workUnitEvent, task.executeWorkUnit())
          } finally {
            workUnitEvent.stop()
          }
        }
      }

    executionService.submit(callableTask)
  }

  class SimpleQueryExecution(initialTask: Future[TaskResult],
                             scheduler: SimpleScheduler,
                             queryTracer: QueryExecutionTracer,
                             waitTimeoutMilli: Long) extends QueryExecution {

    var inFlightTasks = new ArrayBuffer[Future[TaskResult]]
    inFlightTasks += initialTask

    override def await(): Option[Throwable] = {
      while (inFlightTasks.nonEmpty) {
        val newInFlightTasks = new ArrayBuffer[Future[TaskResult]]
        for (future <- inFlightTasks) {
          try {
            val taskResult = future.get(waitTimeoutMilli, TimeUnit.MILLISECONDS)
            for (newTask <- taskResult.newDownstreamTasks)
              newInFlightTasks += scheduler.schedule(newTask, Some(taskResult.workUnitEvent), queryTracer)

            if (taskResult.task.canContinue)
              newInFlightTasks += scheduler.schedule(taskResult.task, Some(taskResult.workUnitEvent), queryTracer)
          } catch {
            case e: TimeoutException =>
              // got tired of waiting for future to complete, put it back into the queue
              newInFlightTasks += future
            case e: ExecutionException =>
              queryTracer.stopQuery()
              return Some(e.getCause)
            case e: Throwable =>
              queryTracer.stopQuery()
              return Some(e)
          }
        }
        inFlightTasks = newInFlightTasks
      }
      queryTracer.stopQuery()
      None
    }
  }

}

case class TaskResult(task: Task, workUnitEvent: WorkUnitEvent, newDownstreamTasks: Seq[Task])
