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
package org.neo4j.cypher.internal.runtime.vectorized.operators

import org.neo4j.cypher.internal.compatibility.v3_6.runtime.{SlotConfiguration, SlottedIndexedProperty}
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.{QueryState => OldQueryState}
import org.neo4j.cypher.internal.runtime.vectorized._
import org.neo4j.internal.kernel.api._
import org.neo4j.values.storable.{TextValue, Values}
import org.neo4j.cypher.internal.v3_6.util.CypherTypeException

class NodeIndexContainsScanOperator(nodeOffset: Int,
                                    label: Int,
                                    property: SlottedIndexedProperty,
                                    valueExpr: Expression,
                                    argumentSize: SlotConfiguration.Size)
  extends NodeIndexOperatorWithValues[NodeValueIndexCursor](nodeOffset, property.maybeCachedNodePropertySlot) {

  override def init(context: QueryContext,
                    state: QueryState,
                    inputMorsel: MorselExecutionContext): ContinuableOperatorTask = {
    val valueIndexCursor: NodeValueIndexCursor = context.transactionalContext.cursors.allocateNodeValueIndexCursor()
    val index = context.transactionalContext.schemaRead.index(label, property.propertyKeyId)
    new OTask(valueIndexCursor, index)
  }

  class OTask(valueIndexCursor: NodeValueIndexCursor, index: IndexReference) extends ContinuableOperatorTask {

    var hasMore = false
    override def operate(currentRow: MorselExecutionContext,
                         context: QueryContext,
                         state: QueryState): Unit = {

      val read = context.transactionalContext.dataRead

      var nullExpression: Boolean = false

      if (!hasMore) {
        val queryState = new OldQueryState(context, resources = null, params = state.params)
        val value = valueExpr(currentRow, queryState)

        value match {
          case value: TextValue =>
            read.nodeIndexSeek(index,
                               valueIndexCursor,
                               IndexOrder.NONE,
                               property.maybeCachedNodePropertySlot.isDefined,
                               IndexQuery.stringContains(index.properties()(0), value))

          case Values.NO_VALUE =>
            // CONTAINS null does not produce any rows
            nullExpression = true

          case x => throw new CypherTypeException(s"Expected a string value, but got $x")
        }
      }

      if (!nullExpression)
        hasMore = iterate(currentRow, valueIndexCursor, argumentSize)
      else
        hasMore = false
    }

    override def canContinue: Boolean = hasMore
  }
}
