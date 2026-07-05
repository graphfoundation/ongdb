/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled

import java.util

import org.neo4j.cypher.internal.runtime._
import org.neo4j.cypher.internal.v3_5.executionplan.GeneratedQueryExecution
import org.neo4j.cypher.result.{QueryProfile, RuntimeResult}
import org.neo4j.cypher.result.QueryResult.QueryResultVisitor
import org.neo4j.cypher.result.RuntimeResult.ConsumptionState
import org.neo4j.graphdb.ResourceIterator

/**
  * Main class for compiled runtime results.
  */
class CompiledExecutionResult(compiledCode: GeneratedQueryExecution,
                              override val queryProfile: QueryProfile)
  extends RuntimeResult {

  private var resultRequested = false

  def executionMode: ExecutionMode = compiledCode.executionMode()

  override def fieldNames(): Array[String] = compiledCode.fieldNames()

  override def isIterable: Boolean = false

  override def asIterator(): ResourceIterator[util.Map[String, AnyRef]] =
    throw new UnsupportedOperationException("The compiled runtime is not iterable")

  override def consumptionState: RuntimeResult.ConsumptionState =
    if (!resultRequested) ConsumptionState.NOT_STARTED
    else ConsumptionState.EXHAUSTED

  override def accept[EX <: Exception](visitor: QueryResultVisitor[EX]): Unit = {
    compiledCode.accept(visitor)
    resultRequested = true
  }

  override def queryStatistics(): QueryStatistics = QueryStatistics()

  override def close(): Unit = {}
}
