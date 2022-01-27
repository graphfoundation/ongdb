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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.IsList
import org.neo4j.cypher.internal.runtime.PrimitiveLongHelper
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.values.virtual.ListValue
import org.neo4j.values.virtual.VirtualValues

sealed trait SeekArgs {
  def expressions(ctx: ReadableRow, state: QueryState): ListValue
}

object SeekArgs {
  object empty extends SeekArgs {
    def expressions(ctx: ReadableRow, state: QueryState):  ListValue = VirtualValues.EMPTY_LIST
  }
}

case class SingleSeekArg(expr: Expression) extends SeekArgs {
  def expressions(ctx: ReadableRow, state: QueryState): ListValue =
    expr(ctx, state) match {
      case value => VirtualValues.list(value)
    }
}

case class ManySeekArgs(coll: Expression) extends SeekArgs {
  def expressions(ctx: ReadableRow, state: QueryState): ListValue = {
    coll(ctx, state) match {
      case IsList(values) => values
    }
  }
}

case class NodeByIdSeekPipe(ident: String, nodeIdsExpr: SeekArgs)
                           (val id: Id = Id.INVALID_ID) extends Pipe {

  protected def internalCreateResults(state: QueryState): ClosingIterator[CypherRow] = {
    val ctx = state.newRowWithArgument(rowFactory)
    val nodeIds = nodeIdsExpr.expressions(ctx, state)
    val nodes = new NodeIdSeekIterator(nodeIds.iterator(), state.query)
    PrimitiveLongHelper.map(nodes, n =>  rowFactory.copyWith(ctx, ident, VirtualValues.node(n)))
  }
}
