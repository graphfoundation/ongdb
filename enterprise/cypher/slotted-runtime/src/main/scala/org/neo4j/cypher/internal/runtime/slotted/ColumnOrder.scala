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

package org.neo4j.cypher.internal.runtime.slotted

import org.neo4j.cypher.internal.physicalplanning.Slot
import org.neo4j.values.AnyValue

sealed trait ColumnOrder {
  def slot: org.neo4j.cypher.internal.physicalplanning.Slot

  def compareValues(a: AnyValue, b: AnyValue): Int

  def compareLongs(a: Long, b: Long): Int

  def compareNullableLongs(a: Long, b: Long): Int
}

case class Ascending(val slot: Slot) extends ColumnOrder {
  override def compareValues(a: AnyValue, b: AnyValue): Int = {
    0
  }

  override def compareLongs(a: Long, b: Long): Int = {
    0
  }

  override def compareNullableLongs(a: Long, b: Long): Int = {
    0
  }
}

case class Descending(val slot: Slot) extends ColumnOrder {
  override def compareValues(a: AnyValue, b: AnyValue): Int = {
    0
  }

  override def compareLongs(a: Long, b: Long): Int = {
    0
  }

  override def compareNullableLongs(a: Long, b: Long): Int = {
    0
  }
}
