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
package org.neo4j.cypher.internal.runtime.memory

import org.neo4j.cypher.internal.runtime.memory.TransactionBoundMemoryTrackerForOperatorProvider.TransactionBoundMemoryTracker
import org.neo4j.cypher.result.OperatorProfile
import org.neo4j.cypher.result.QueryProfile
import org.neo4j.memory.EmptyMemoryTracker
import org.neo4j.memory.HeapHighWaterMarkTracker
import org.neo4j.memory.HeapMemoryTracker
import org.neo4j.memory.MemoryTracker
import org.neo4j.memory.ScopedMemoryTracker

/**
 * Gives the ability to track memory per operator.
 */
trait MemoryTrackerForOperatorProvider {

  /**
   * Get the memory tracker for the operator with the given id.
   *
   * @param operatorId the id of the operator
   */
  def memoryTrackerForOperator(operatorId: Int): MemoryTracker
}

object MemoryTrackerForOperatorProvider {

  /**
   * Convert a value returned from [[TrackingQueryMemoryTracker.heapHighWaterMark]]
   * or [[TrackingQueryMemoryTracker.heapHighWaterMarkOfOperator]] to a value to be given to a [[QueryProfile]].
   */
  def memoryAsProfileData(value: Long): Long = value match {
    case HeapHighWaterMarkTracker.ALLOCATIONS_NOT_TRACKED => OperatorProfile.NO_DATA
    case x => x
  }
}

/**
 * Doesn't actually track anything.
 */
case object NoOpMemoryTrackerForOperatorProvider extends MemoryTrackerForOperatorProvider {

  override def memoryTrackerForOperator(operatorId: Int): MemoryTracker = EmptyMemoryTracker.INSTANCE
}

object TransactionBoundMemoryTrackerForOperatorProvider {

  /**
   * Forward heap allocations and de-allocations to both a transaction memory tracker
   * and a tracker for this scope spanning multiple transactions in the same query.
   *
   * This tracker can be used both for the whole query and a single operator in a query,
   * given the right arguments.
   */
  class TransactionBoundMemoryTracker(transactionMemoryTracker: MemoryTracker,
                                      queryGlobalMemoryTracker: HeapMemoryTracker)
    extends ScopedMemoryTracker(transactionMemoryTracker) {

    override def allocateHeap(bytes: Long): Unit = {
      // Forward to transaction memory tracker
      super.allocateHeap(bytes)
      // Forward to the queryGlobalMemoryTracker
      queryGlobalMemoryTracker.allocateHeap(bytes)
    }

    override def releaseHeap(bytes: Long): Unit = {
      // Forward to transaction memory tracker
      super.releaseHeap(bytes)
      // Forward to the queryGlobalMemoryTracker
      queryGlobalMemoryTracker.releaseHeap(bytes)
    }
  }
}

/**
 * Tracks memory per operator.
 * Also forwards all allocations to a transactionMemoryTracker.
 * Also forwards all allocations to a queryHeapHighWatermarkTracker, which tracks the heap high water mark of a query,
 * over potentially multiple transactions.
 *
 */
class TransactionBoundMemoryTrackerForOperatorProvider(transactionMemoryTracker: MemoryTracker, queryHeapHighWatermarkTracker: TrackingQueryMemoryTracker)
  extends TransactionBoundMemoryTracker(transactionMemoryTracker, queryHeapHighWatermarkTracker)
  with MemoryTrackerForOperatorProvider {

  override def memoryTrackerForOperator(operatorId: Int): MemoryTracker = {
    new TransactionBoundMemoryTracker(transactionMemoryTracker, queryHeapHighWatermarkTracker.memoryTrackerForOperator(operatorId))
  }
}