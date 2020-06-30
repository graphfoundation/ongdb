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

package org.neo4j.cypher.internal.physicalplanning

import org.neo4j.cypher.internal.runtime.EntityById
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.v4_0.util.symbols.CypherType
import org.neo4j.values.AnyValue

object SlotConfigurationUtils {
  val PRIMITIVE_NULL: Long = {
    0
  }
  val NO_ENTITY_FUNCTION: java.util.function.ToLongFunction[ExecutionContext] = {
    ???
  }

  def makeGetValueFromSlotFunctionFor(slot: Slot): Function1[ExecutionContext, AnyValue] = {
    ???
  }

  def makeGetPrimitiveFromSlotFunctionFor(slot: Slot,
                                          returnType: CypherType,
                                          throwOfTypeError: Boolean = {
                                            false
                                          }): java.util.function.ToLongFunction[ExecutionContext] = {
    ???
  }

  def makeGetPrimitiveNodeFromSlotFunctionFor(slot: Slot, throwOnTypeError: Boolean = {
    false
  }): java.util.function.ToLongFunction[ExecutionContext] = {
    ???
  }

  def makeGetPrimitiveRelationshipFromSlotFunctionFor(slot: Slot, throwOfTypeError: Boolean = {
    false
  }): java.util.function.ToLongFunction[ExecutionContext] = {
    ???
  }

  def makeSetValueInSlotFunctionFor(slot: Slot): Function2[ExecutionContext, AnyValue, Unit] = {
    ???
  }

  def makeSetPrimitiveInSlotFunctionFor(slot: Slot,
                                        valueType: CypherType): Function3[ExecutionContext, Long, EntityById, Unit] = {
    ???
  }

  def makeSetPrimitiveNodeInSlotFunctionFor(slot: Slot): Function3[ExecutionContext, Long, EntityById, Unit] = {
    ???
  }

  def makeSetPrimitiveRelationshipInSlotFunctionFor(slot: Slot): Function3[ExecutionContext, Long, EntityById, Unit] = {
    ???
  }

  def generateSlotAccessorFunctions(slots: SlotConfiguration): Unit = {
    ???
  }
}
