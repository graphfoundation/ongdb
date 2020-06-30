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

import org.neo4j.cypher.internal.physicalplanning.Slot
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.PrimitiveLongHelper
import org.neo4j.cypher.internal.runtime.RelationshipIterator
import org.neo4j.cypher.internal.runtime.interpreted.pipes._
import org.neo4j.cypher.internal.runtime.slotted.SlottedExecutionContext
import org.neo4j.cypher.internal.runtime.slotted.helpers.NullChecker
import org.neo4j.cypher.internal.runtime.slotted.helpers.SlottedPipeBuilderUtils.makeGetPrimitiveNodeFromSlotFunctionFor
import org.neo4j.cypher.internal.v4_0.expressions.SemanticDirection
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
import org.neo4j.exceptions.InternalException
import org.neo4j.storageengine.api.RelationshipVisitor

abstract class OptionalExpandAllSlottedPipe(source: Pipe,
                                            fromSlot: Slot,
                                            relOffset: Int,
                                            toOffset: Int,
                                            dir: SemanticDirection,
                                            types: RelationshipTypes,
                                            slots: SlotConfiguration)
                                           (val id: Id = Id.INVALID_ID) extends PipeWithSource(source) with Pipe {

  //===========================================================================
  // Compile-time initializations
  //===========================================================================
  private val getFromNodeFunction = makeGetPrimitiveNodeFromSlotFunctionFor(fromSlot)

  def filter(iterator: Iterator[SlottedExecutionContext], state: QueryState): Iterator[SlottedExecutionContext]

  //===========================================================================
  // Runtime code
  //===========================================================================
  protected def internalCreateResults(input: Iterator[ExecutionContext], state: QueryState): Iterator[ExecutionContext] = {
    input.flatMap {
      (inputRow: ExecutionContext) =>
        val fromNode = getFromNodeFunction(inputRow)

        if (NullChecker.entityIsNull(fromNode)) {
          Iterator(withNulls(inputRow))
        } else {
          val relationships: RelationshipIterator = state.query.getRelationshipsForIdsPrimitive(fromNode, dir, types.types(state.query))
          var otherSide: Long = 0

          val relVisitor = new RelationshipVisitor[InternalException] {
            override def visit(relationshipId: Long, typeId: Int, startNodeId: Long, endNodeId: Long): Unit =
              if (fromNode == startNodeId) {
                otherSide = endNodeId
              } else {
                otherSide = startNodeId
              }
          }

          val matchIterator = PrimitiveLongHelper.map(relationships, relId => {
            relationships.relationshipVisit(relId, relVisitor)
            val outputRow = SlottedExecutionContext(slots)
            inputRow.copyTo(outputRow)
            outputRow.setLongAt(relOffset, relId)
            outputRow.setLongAt(toOffset, otherSide)
            outputRow
          });

          if (matchIterator.isEmpty) {
            Iterator(withNulls(inputRow))
          } else {
            matchIterator
          }
        }
    }
  }

  private def withNulls(inputRow: ExecutionContext) = {
    val outputRow = SlottedExecutionContext(slots)
    inputRow.copyTo(outputRow)
    outputRow.setLongAt(relOffset, -1)
    outputRow.setLongAt(toOffset, -1)
    outputRow
  }

}

// TODO : Implement.
object OptionalExpandAllSlottedPipe {
  def apply(source: org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe,
            fromSlot: org.neo4j.cypher.internal.physicalplanning.Slot,
            relOffset: Int,
            toOffset: Int,
            dir: org.neo4j.cypher.internal.v4_0.expressions.SemanticDirection,
            types: org.neo4j.cypher.internal.runtime.interpreted.pipes.RelationshipTypes,
            slots: org.neo4j.cypher.internal.physicalplanning.SlotConfiguration,
            maybePredicate: Option[org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression])
           (id: org.neo4j.cypher.internal.v4_0.util.attribution.Id = {
             org.neo4j.cypher.internal.v4_0.util.attribution.Id(0)
           }): org.neo4j.cypher.internal.runtime.slotted.pipes.OptionalExpandAllSlottedPipe = {
    null
  }
}
