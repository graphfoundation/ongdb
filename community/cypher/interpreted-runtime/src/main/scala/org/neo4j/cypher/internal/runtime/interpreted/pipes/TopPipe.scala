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

import java.util.Comparator

import org.neo4j.collection.trackable.HeapTrackingCollections
import org.neo4j.cypher.internal.collection.DefaultComparatorTopTable
import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.memory.MemoryTracker

import scala.collection.JavaConverters.asScalaIteratorConverter

/*
 * TopPipe is used when a query does a ORDER BY ... LIMIT query. Instead of ordering the whole result set and then
 * returning the matching top results, we only keep the top results in heap, which allows us to release memory earlier
 */
case class TopNPipe(source: Pipe, countExpression: Expression, comparator: Comparator[ReadableRow])
                   (val id: Id = Id.INVALID_ID) extends PipeWithSource(source) {

  protected override def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    val limit = SkipPipe.evaluateStaticSkipOrLimitNumberOrThrow(countExpression, state, "LIMIT")
    if (limit == 0 || input.isEmpty) return ClosingIterator.empty

    val scopedMemoryTracker = state.memoryTrackerForOperatorProvider.memoryTrackerForOperator(id.x).getScopedMemoryTracker
    val topTable = new DefaultComparatorTopTable[CypherRow](comparator, limit, scopedMemoryTracker)
    state.query.resources.trace(topTable)

    var i = 1L
    while (input.hasNext) {
      val row = input.next()
      val evictedRow = topTable.addAndGetEvicted(row)
      if (row ne evictedRow) {
        scopedMemoryTracker.allocateHeap(row.estimatedHeapUsage())
        if (evictedRow != null)
          scopedMemoryTracker.releaseHeap(evictedRow.estimatedHeapUsage())
      }
      i += 1
    }

    topTable.sort()

    ClosingIterator(topTable.autoClosingIterator(scopedMemoryTracker).asScala).closing(topTable)
  }
}

/*
 * Special case for when we only have one element, in this case it is no idea to store
 * an array, instead just store a single value.
 */
case class Top1Pipe(source: Pipe, comparator: Comparator[ReadableRow])
                   (val id: Id = Id.INVALID_ID) extends PipeWithSource(source) {

  protected override def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    if (input.isEmpty) ClosingIterator.empty
    else {

      val first = input.next()
      var result = first

      while (input.hasNext) {
        val ctx = input.next()
        if (comparator.compare(ctx, result) < 0) {
          result = ctx
        }
      }
      ClosingIterator.single(result)
    }
  }
}

/*
 * Special case for when we only want one element, and all others that have the same value (tied for first place)
 */
case class Top1WithTiesPipe(source: Pipe, comparator: Comparator[ReadableRow])
                           (val id: Id = Id.INVALID_ID) extends PipeWithSource(source) {

  protected override def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    if (input.isEmpty)
      ClosingIterator.empty
    else {
      val memoryTracker = state.memoryTrackerForOperatorProvider.memoryTrackerForOperator(id.x)
      val first = input.next()
      var best = first
      val matchingRows = init(best, memoryTracker)

      while (input.hasNext) {
        val ctx = input.next()
        val comparison = comparator.compare(ctx, best)
        if (comparison < 0) { // Found a new best
          best = ctx
          matchingRows.clear()
          matchingRows.add(ctx)
        }

        if (comparison == 0) { // Found a tie
          matchingRows.add(ctx)
        }
      }
      ClosingIterator(matchingRows.iterator.asScala)
    }
  }

  @inline
  private def init(first: CypherRow, memoryTracker: MemoryTracker) = {
    val list = HeapTrackingCollections.newArrayList[CypherRow](memoryTracker)
    list.add(first)
    list
  }
}