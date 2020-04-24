/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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

import org.neo4j.cypher.internal.compatibility.v3_6.runtime.SlotConfiguration
import org.neo4j.cypher.internal.runtime.interpreted.ExecutionContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.{Pipe, QueryState}
import org.neo4j.cypher.internal.runtime.slotted.SlottedExecutionContext
import org.neo4j.cypher.internal.v3_6.util.attribution.Id
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.Values.NO_VALUE
// See:  https://github.com/graphfoundation/ongdb/blob/2df152552eae2164934ccc2f8f6174fe46848b5f/community/cypher/interpreted-runtime/src/main/scala/org/neo4j/cypher/internal/runtime/interpreted/pipes/ValueHashJoinPipe.scala
case class ValueHashJoinSlottedPipe(leftSide: Expression,
                                    rightSide: Expression,
                                    left: Pipe,
                                    right: Pipe,
                                    slots: SlotConfiguration,
                                    longOffset: Int,
                                    refsOffset: Int,
                                    argumentSize: SlotConfiguration.Size)
                                   (val id: Id = Id.INVALID_ID)
  extends AbstractHashJoinPipe[AnyValue, Expression](left, right, slots) {
  leftSide.registerOwningPipe(this)
  rightSide.registerOwningPipe(this)
  override def computeKey(context: ExecutionContext, keyColumns: Expression, queryState: QueryState): Option[AnyValue] = {
    val value = keyColumns.apply(context, queryState)
    if (value == NO_VALUE)
      None
    else
      Some(value)
  }

  override def copyDataFromRhs(newRow: SlottedExecutionContext, rhs: ExecutionContext): Unit =
    rhs.copyTo(newRow,
      fromLongOffset = argumentSize.nLongs, fromRefOffset = argumentSize.nReferences,
      toLongOffset = longOffset, toRefOffset = refsOffset)
}
