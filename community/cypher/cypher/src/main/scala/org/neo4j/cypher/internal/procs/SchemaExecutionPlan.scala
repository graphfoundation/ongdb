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
package org.neo4j.cypher.internal.procs

import org.neo4j.cypher.internal.ExecutionPlan
import org.neo4j.cypher.internal.runtime.ExecutionMode
import org.neo4j.cypher.internal.runtime.InputDataStream
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.interpreted.UpdateCountingQueryContext
import org.neo4j.cypher.internal.RuntimeName
import org.neo4j.cypher.internal.SchemaRuntimeName
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.virtual.MapValue

/**
 * Execution plan for performing schema writes, i.e. creating or dropping indexes and constraints.
 *
 * @param name        A name of the schema write
 * @param schemaWrite The actual schema write to perform
 */
case class SchemaExecutionPlan(name: String, schemaWrite: (QueryContext, MapValue) => SchemaExecutionResult, source: Option[ExecutionPlan] = None)
  extends ChainedExecutionPlan[UpdateCountingQueryContext](source) {
  override def createContext(originalCtx: QueryContext) = new UpdateCountingQueryContext(originalCtx)
  override def querySubscriber(context: UpdateCountingQueryContext, qs : QuerySubscriber): QuerySubscriber = qs

  override def runtimeName: RuntimeName = SchemaRuntimeName

  override def runSpecific(ctx: UpdateCountingQueryContext,
                   executionMode: ExecutionMode,
                   params: MapValue,
                   prePopulateResults: Boolean,
                   ignore: InputDataStream,
                   subscriber: QuerySubscriber): RuntimeResult = {

    ctx.assertSchemaWritesAllowed()

    if (schemaWrite(ctx, params) == SuccessResult) {
      ctx.transactionalContext.close()
      val runtimeResult = SchemaRuntimeResult(ctx, subscriber)
      runtimeResult
    } else {
      IgnoredRuntimeResult
    }
  }
}

sealed trait SchemaExecutionResult

case object SuccessResult extends SchemaExecutionResult
case object IgnoredResult extends SchemaExecutionResult
