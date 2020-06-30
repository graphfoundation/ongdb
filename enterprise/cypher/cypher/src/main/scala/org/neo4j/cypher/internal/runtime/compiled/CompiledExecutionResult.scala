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
package org.neo4j.cypher.internal.runtime.compiled

import java.lang
import java.util.Optional

import org.neo4j.cypher.internal.executionplan.GeneratedQueryExecution
import org.neo4j.cypher.internal.runtime._
import org.neo4j.cypher.result.NaiveQuerySubscription
import org.neo4j.cypher.result.QueryProfile
import org.neo4j.cypher.result.QueryResult.QueryResultVisitor
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.cypher.result.RuntimeResult.ConsumptionState
import org.neo4j.kernel.impl.query.QuerySubscriber

/**
 * Main class for compiled runtime results.
 */
class CompiledExecutionResult(context: QueryContext,
                              compiledCode: GeneratedQueryExecution,
                              override val queryProfile: QueryProfile,
                              prePopulateResults: Boolean,
                              subscriber: QuerySubscriber,
                              fieldNames: Array[String]
                             )
  extends NaiveQuerySubscription(subscriber) {

  private var resultRequested = false

  def executionMode: ExecutionMode = compiledCode.executionMode()

  override def fieldNames(): Array[String] = compiledCode.fieldNames()

  def accept[EX <: Exception](visitor: QueryResultVisitor[EX]): Unit = {
    if (this.prePopulateResults) {
      this.compiledCode.accept((row) => {

        val fields = row.fields
        for (i <- 0 until fields.length) {
          ValuePopulation.populate(fields(i))
        }
        visitor.visit(row)

      })
    } else {
      compiledCode.accept(visitor)
    }
    resultRequested = true
  }

  override def queryStatistics() = QueryStatistics()

  override def consumptionState: RuntimeResult.ConsumptionState =
    if (!resultRequested) {
      ConsumptionState.NOT_STARTED
    } else {
      ConsumptionState.EXHAUSTED
    }

  override def close(): Unit = {}

  override def totalAllocatedMemory(): Optional[lang.Long] = Optional.empty[lang.Long]

}
