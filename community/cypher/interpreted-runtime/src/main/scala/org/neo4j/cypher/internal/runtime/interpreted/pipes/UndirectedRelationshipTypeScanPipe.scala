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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.logical.plans.IndexOrder
import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.values.virtual.VirtualNodeValue
import org.neo4j.values.virtual.VirtualRelationshipValue

case class UndirectedRelationshipTypeScanPipe(ident: String, fromNode: String, typ: LazyType, toNode: String, indexOrder: IndexOrder)
                                             (val id: Id = Id.INVALID_ID) extends Pipe {

  protected def internalCreateResults(state: QueryState): ClosingIterator[CypherRow] = {
    val typeId = typ.getId(state.query)
    if (typeId == LazyType.UNKNOWN) ClosingIterator.empty
    else {
      new UndirectedIterator(ident, typeId, fromNode, toNode, rowFactory, state, indexOrder)
    }
  }
}

private class UndirectedIterator(relName: String,
                                 relToken: Int,
                                 fromNode: String,
                                 toNode: String,
                                 rowFactory: CypherRowFactory,
                                 state: QueryState,
                                 indexOrder: IndexOrder) extends ClosingIterator[CypherRow] {

  private var emitSibling = false
  private var lastRelationship: VirtualRelationshipValue = _
  private var lastStart: VirtualNodeValue = _
  private var lastEnd: VirtualNodeValue = _

  private val baseContext = state.newRowWithArgument(rowFactory)
  private val query = state.query
  private val relIterator = query.getRelationshipsByType(state.relTypeTokenReadSession.get, relToken, indexOrder)

  def next(): CypherRow = {
    if (emitSibling) {
      emitSibling = false
      rowFactory.copyWith(baseContext, relName, lastRelationship, fromNode, lastEnd, toNode, lastStart)
    } else {
      emitSibling = true
      lastRelationship = query.relationshipById(relIterator.next())
      lastStart = query.nodeById(relIterator.startNodeId())
      lastEnd = query.nodeById(relIterator.endNodeId())
      rowFactory.copyWith(baseContext, relName, lastRelationship, fromNode, lastStart, toNode, lastEnd)
    }
  }

  override protected[this] def closeMore(): Unit = {
    relIterator.close()
  }
  override protected[this] def innerHasNext: Boolean = emitSibling || relIterator.hasNext
}
