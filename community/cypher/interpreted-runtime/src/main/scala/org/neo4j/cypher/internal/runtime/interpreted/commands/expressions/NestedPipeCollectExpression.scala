/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.cypher.internal.runtime.interpreted.commands.expressions

import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.values.AnyValue

/**
 * Expression that is really a pipe. On evaluation, the pipe is evaluated. For each returned row, a projection
 * is applied, and the resulting values are collected in a list and returned.
 */
case class NestedPipeCollectExpression(pipe: Pipe,
                                       projection: Expression,
                                       availableExpressionVariables: Array[ExpressionVariable],
                                       owningPlanId: Id)
  extends NestedPipeExpression(pipe, availableExpressionVariables, owningPlanId) {

  override def apply(row: ReadableRow, state: QueryState): AnyValue = {
    val results = createNestedResults(row, state)
    collectResults(state, results, projection, state.memoryTrackerForOperatorProvider.memoryTrackerForOperator(owningPlanId.x))
  }

  override def rewrite(f: Expression => Expression): Expression = f(NestedPipeCollectExpression(pipe, projection.rewrite(f), availableExpressionVariables, owningPlanId))

  override def arguments: Seq[Expression] = Seq(projection)

  override def children: Seq[AstNode[_]] = Seq(projection) ++ availableExpressionVariables
}
