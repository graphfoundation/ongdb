/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.scheduler;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;

import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.MonitoredJobInfo;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.util.VisibleForTesting;

final class TimeBasedTaskScheduler implements Runnable
{
    private static final long NO_TASKS_PARK = TimeUnit.MINUTES.toNanos( 10 );
    private static final Comparator<ScheduledJobHandle<?>> DEADLINE_COMPARATOR =
            Comparator.comparingLong( handle -> handle.nextDeadlineNanos );

    private final SystemNanoClock clock;
    private final ThreadPoolManager pools;
    private final FailedJobRunsStore failedJobRunsStore;
    private final Set<ScheduledJobHandle<?>> monitoredJobs = ConcurrentHashMap.newKeySet();
    private final PriorityBlockingQueue<ScheduledJobHandle<?>> delayedTasks;
    private final ConcurrentLinkedQueue<ScheduledJobHandle<?>> canceledTasks;
    private final LongSupplier jobIdSupplier;
    private volatile Thread timeKeeper;
    private volatile boolean stopped;

    TimeBasedTaskScheduler( SystemNanoClock clock, ThreadPoolManager pools, FailedJobRunsStore failedJobRunsStore, LongSupplier jobIdSupplier )
    {
        this.clock = clock;
        this.pools = pools;
        this.failedJobRunsStore = failedJobRunsStore;
        this.jobIdSupplier = jobIdSupplier;
        delayedTasks = new PriorityBlockingQueue<>( 42, DEADLINE_COMPARATOR );
        canceledTasks = new ConcurrentLinkedQueue<>();
    }

    public JobHandle<?> submit( Group group, Runnable job, long initialDelayNanos, long reschedulingDelayNanos )
    {
        return submit( group, JobMonitoringParams.NOT_MONITORED, job, initialDelayNanos, reschedulingDelayNanos );
    }

    public JobHandle<?> submit( Group group, JobMonitoringParams jobMonitoringParams, Runnable job, long initialDelayNanos, long reschedulingDelayNanos )
    {
        long now = clock.nanos();
        long nextDeadlineNanos = now + initialDelayNanos;

        long jobId = -1;
        if ( jobMonitoringParams != JobMonitoringParams.NOT_MONITORED )
        {
            jobId = jobIdSupplier.getAsLong();
        }

        ScheduledJobHandle<?> task = new ScheduledJobHandle<>( this,
                group,
                job,
                nextDeadlineNanos,
                reschedulingDelayNanos,
                jobMonitoringParams,
                clock.nanos(),
                monitoredJobs,
                failedJobRunsStore,
                clock,
                jobId );

        if ( jobMonitoringParams != JobMonitoringParams.NOT_MONITORED )
        {
            monitoredJobs.add( task );
        }
        enqueueTask( task );
        return task;
    }

    void enqueueTask( ScheduledJobHandle<?> newTasks )
    {
        delayedTasks.offer( newTasks );
        LockSupport.unpark( timeKeeper );
    }

    @Override
    public void run()
    {
        timeKeeper = Thread.currentThread();
        while ( !stopped )
        {
            long timeToNextTickNanos = tick();
            if ( stopped )
            {
                return;
            }
            LockSupport.parkNanos( this, timeToNextTickNanos );
        }
    }

    public long tick()
    {
        long now = clock.nanos();
        long timeToNextDeadlineSinceStart = scheduleDueTasks( now );
        long processingTime = clock.nanos() - now;
        return timeToNextDeadlineSinceStart - processingTime;
    }

    private long scheduleDueTasks( long now )
    {
        if ( delayedTasks.isEmpty() )
        {
            // We have no tasks to run. Park until we're woken up by an enqueueTask() call.
            return NO_TASKS_PARK;
        }
        while ( !canceledTasks.isEmpty() )
        {
            ScheduledJobHandle<?> canceled = canceledTasks.poll();
            delayedTasks.remove( canceled );
            monitoredJobs.remove( canceled );
        }
        while ( !stopped && !delayedTasks.isEmpty() && delayedTasks.peek().nextDeadlineNanos <= now )
        {
            ScheduledJobHandle<?> task = delayedTasks.poll();
            task.submitIfRunnable( pools );
        }
        return delayedTasks.isEmpty() ? NO_TASKS_PARK : delayedTasks.peek().nextDeadlineNanos - now;
    }

    @VisibleForTesting
    int tasksLeft()
    {
        return delayedTasks.size();
    }

    public void stop()
    {
        stopped = true;
        LockSupport.unpark( timeKeeper );
    }

    void cancelTask( ScheduledJobHandle<?> job )
    {
        canceledTasks.add( job );
    }

    List<MonitoredJobInfo> getMonitoredJobs()
    {
        return monitoredJobs.stream()
                            .map( ScheduledJobHandle::getMonitoringInfo )
                            .collect( Collectors.toList() );
    }
}
