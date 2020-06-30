/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.cypher.internal.runtime.slotted.pipes

import org.neo4j.cypher.internal.logical.plans.IndexOrder
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.physicalplanning.SlottedIndexedProperty
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.v4_0.expressions.LabelToken
import org.neo4j.cypher.internal.v4_0.util.attribution.Id

case class NodeIndexScanSlottedPipe(ident: String,
                                    label: LabelToken,
                                    properties: Seq[SlottedIndexedProperty],
                                    queryIndexId: Int,
                                    indexOrder: IndexOrder,
                                    slots: SlotConfiguration,
                                    argumentSize: SlotConfiguration.Size)
                                   (val id: Id = Id.INVALID_ID)
  extends Pipe with IndexSlottedPipeWithValues {

  override val offset: Int = slots.getLongOffsetFor(ident)

  override val indexPropertySlotOffsets: Array[Int] = properties.flatMap(_.maybeCachedNodePropertySlot).toArray
  override val indexPropertyIndices: Array[Int] = properties.zipWithIndex.filter(_._1.getValueFromIndex).map(_._2).toArray
  private val needsValues: Boolean = indexPropertyIndices.nonEmpty

  def canEqual(other: Any): Boolean = other.isInstanceOf[NodeIndexSeekSlottedPipe]

  override def equals(other: Any): Boolean = other match {
    case that: NodeIndexSeekSlottedPipe =>
      (that canEqual this) &&
        ident == that.ident &&
        label == that.label &&
        (properties == that.properties) &&
        queryIndexId == that.queryIndexId &&
        indexOrder == that.indexOrder &&
        slots == that.slots &&
        argumentSize == that.argumentSize
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(ident, label, properties, queryIndexId, indexOrder, slots, argumentSize)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  protected def internalCreateResults(state: QueryState): Iterator[ExecutionContext] = {
    val cursor = state.query.indexScan(state.queryIndexes(queryIndexId), needsValues, indexOrder)

    new SlottedIndexIterator(state, slots, cursor)
  }

}
