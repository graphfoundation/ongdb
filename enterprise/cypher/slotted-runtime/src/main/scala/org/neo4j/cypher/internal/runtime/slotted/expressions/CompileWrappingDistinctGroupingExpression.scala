/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.cypher.internal.runtime.slotted.expressions

import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.compiled.expressions.CompiledGroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.values.AnyValue

case class CompileWrappingDistinctGroupingExpression(val grouping: CompiledGroupingExpression,
                                                     val isEmpty: Boolean) extends GroupingExpression {
  override type KeyType = AnyValue

  override def registerOwningPipe(pipe: Pipe): Unit = {
    ???
  }

  override def computeGroupingKey(context: ExecutionContext,
                                  state: QueryState): AnyValue = {
    ???
  }

  override def computeOrderedGroupingKey(groupingKey: AnyValue): AnyValue = {
    ???
  }

  override def getGroupingKey(context: ExecutionContext): AnyValue = {
    ???
  }

  override def project(context: ExecutionContext, groupingKey: AnyValue): Unit = {
    ???
  }
}
