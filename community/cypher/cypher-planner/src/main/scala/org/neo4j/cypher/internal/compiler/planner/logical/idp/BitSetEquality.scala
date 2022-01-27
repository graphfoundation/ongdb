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
package org.neo4j.cypher.internal.compiler.planner.logical.idp

import java.util

import scala.collection.immutable.BitSet
import scala.collection.immutable.BitSet.BitSet1
import scala.collection.immutable.BitSet.BitSet2
import scala.collection.immutable.BitSet.BitSetN

/**
 * More efficient implementations of [[equals()]] and [[hashCode()]] for [[BitSet]].
 * These methods must only be used when objects are stored in strictly only BitSet collections.
 *
 * For example, a Set that contains both BitSets and other Set[Int]s must not make use of these methods.
 */
object BitSetEquality {
  private def all0From(array: Array[Long], startIndex: Int): Boolean = {
    var i = startIndex
    while(i < array.length) {
      if (array(i) != 0L) return false
      i += 1
    }
    true
  }

  private def hashCode(a: Array[Long]): Int = {
    if (a == null) return 0
    var result = 1
    for (element <- a) {
      val elementHash = (element ^ (element >>> 32)).toInt
      result = 31 * result + elementHash
    }
    result
  }

  private def hashCode(element: Long): Int = {
    val elementHash = (element ^ (element >>> 32)).toInt
    31 + elementHash
  }

  /**
   * @return `true` if the two bitsets are identical.
   */
  def equalBitSets(bitSet1: BitSet, bitSet2: BitSet): Boolean = {
    bitSet1 match {
      case bs1: BitSet1 => bitSet2 match {
        case bs2: BitSet1 => bs1.elems == bs2.elems
        case bs2: BitSet2 => bs1.elems == bs2.elems0 && bs2.toBitMask(1) == 0L
        case bs2: BitSetN => bs1.elems == bs2.elems(0) && all0From(bs2.elems, 1)
        case _ => bitSet1.equals(bitSet2)
      }
      case bs1: BitSet2 => bitSet2 match {
        case bs2: BitSet1 => bs1.elems0 == bs2.elems && bs1.toBitMask(1) == 0L
        case bs2: BitSet2 => bs1.elems0 == bs2.elems0 && bs1.toBitMask(1) == bs2.toBitMask(1)
        case bs2: BitSetN => bs1.elems0 == bs2.elems(0) && bs1.toBitMask(1) == bs2.elems(1) && all0From(bs2.elems, 2)
        case _ => bitSet1.equals(bitSet2)
      }
      case bs1: BitSetN => bitSet2 match {
        case bs2: BitSet1 => bs1.elems(0) == bs2.elems && all0From(bs1.elems, 1)
        case bs2: BitSet2 => bs1.elems(0) == bs2.elems0 && bs1.elems(1) == bs2.toBitMask(1) && all0From(bs1.elems, 2)
        case bs2: BitSetN => util.Arrays.equals(bs1.elems, bs2.elems)
        case _ => bitSet1.equals(bitSet2)
      }
      case _ => bitSet1.equals(bitSet2)
    }
  }

  /**
   * @return a hashcode based on the underlying bitmask of the BitSet.
   */
  def hashCode(bitSet: BitSet): Int = {
    bitSet match {
      case bs: BitSet1 => hashCode(bs.elems)
      case bs: BitSet2 => hashCode(bs.toBitMask)
      case bs: BitSetN => hashCode(bs.elems)
      case bs => hashCode(bs.toBitMask)
    }
  }
}
