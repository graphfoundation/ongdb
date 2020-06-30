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

import java.util

import org.eclipse.collections.impl.factory.Sets
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.PrefetchingIterator
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.PipeWithSource
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
import org.neo4j.values.storable.LongArray
import org.neo4j.values.storable.Values

case class DistinctSlottedPrimitivePipe(source: Pipe,
                                        slots: SlotConfiguration,
                                        primitiveSlots: Array[Int],
                                        groupingExpression: GroupingExpression)
                                       (val id: Id = Id.INVALID_ID)
  extends PipeWithSource(source) {

  //===========================================================================
  // Runtime code
  //===========================================================================
  protected def internalCreateResults(input: Iterator[ExecutionContext],
                                      state: QueryState): Iterator[ExecutionContext] = {
    new PrefetchingIterator[ExecutionContext] {
      private val seen = Sets.mutable.empty[LongArray]()

      override def produceNext(): Option[ExecutionContext] = {
        while (input.nonEmpty) {
          val next: ExecutionContext = input.next()

          var groupingVal: LongArray = buildGroupingVal(next, primitiveSlots);


          if (seen.add(groupingVal)) {
            // Found something! Set it as the next element to yield, and exit
            state.memoryTracker.allocated(groupingVal);
            var key = groupingExpression.computeGroupingKey(next, state);
            groupingExpression.project(next, key);
            return new Some(next);
          }
        }

        None
      }
    }
  }

  groupingExpression.registerOwningPipe(this)

  //===========================================================================
  // Compile-time initializations
  //===========================================================================

  private def buildGroupingVal(next: ExecutionContext, slots: Array[Int]): LongArray = {
    val keys = new Array[Long](slots.length)
    for (i <- 0 until slots.length) {
      keys(i) = next.getLongAt(slots(i))
    }
    return Values.longArray(keys)
  }

  private def buildKey(next: ExecutionContext): Array[Long] = {
    val keys = new Array[Long](primitiveSlots.length)
    var i = 0
    while (i < primitiveSlots.length) {
      keys(i) = next.getLongAt(primitiveSlots(i))
      i += 1
    }
    keys
  }
}

/**
 * This little class is here to make sure we have the expected behaviour of our primitive arrays.
 * In the JVM, long[] are do not have reasonable hashcode or equal()
 */
class Key(val inner: Array[Long]) {

  override val hashCode: Int = util.Arrays.hashCode(inner)

  override def equals(other: Any): Boolean =
    if (other == null || getClass() != other.getClass()) {
      false
    } else {
      val otherKey = other.asInstanceOf[Key]

      if (otherKey eq this) {
        return true
      }
      util.Arrays.hashCode(inner) == util.Arrays.hashCode(inner) && util.Arrays.equals(inner, otherKey.inner)
    }

  override def toString: String = util.Arrays.toString(inner)
}