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

import org.eclipse.collections.api.iterator.LongIterator
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.QueryMemoryTracker
import org.neo4j.cypher.internal.runtime.RelationshipIterator
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.v4_0.expressions.SemanticDirection
import org.neo4j.exceptions.InternalException
import org.neo4j.storageengine.api.RelationshipVisitor

import scala.collection.mutable

/**
 * Used by pipes that needs to expand between two known nodes.
 *
 * Given a pattern (a)-->(b) it will do the following:
 * - if both a and b are dense nodes, start from the one with the lesser degree
 * - if just one of the nodes is dense, start from the non-dense node
 * - if both are non-dense, randomly pick one or the other
 * - cache all found connecting relationships.
 *
 */
trait PrimitiveCachingExpandInto {

  private var alternateState = false

  /**
   * Finds all relationships connecting fromNode and toNode.
   */
  protected def findRelationships(state: QueryState, fromNode: Long, toNode: Long,
                                  relCache: PrimitiveRelationshipsCache, dir: SemanticDirection, relTypes: => Array[Int]): LongIterator = {

    val fromNodeIsDense: Boolean = state.query.nodeIsDense(fromNode, state.cursors.nodeCursor)
    val toNodeIsDense: Boolean = state.query.nodeIsDense(toNode, state.cursors.nodeCursor)

    //if both nodes are dense, start from the one with the lesser degree
    if (fromNodeIsDense && toNodeIsDense) {
      //check degree and iterate from the node with smaller degree
      val fromDegree = getDegree(fromNode, relTypes, dir, state)
      if (fromDegree == 0) {
        return RelationshipIterator.EMPTY
      }

      val toDegree = getDegree(toNode, relTypes, dir.reversed, state)
      if (toDegree == 0) {
        return RelationshipIterator.EMPTY
      }

      relIterator(state.query, fromNode, toNode, preserveDirection = fromDegree < toDegree, relTypes, relCache, dir)
    }
    // iterate from a non-dense node
    else if (toNodeIsDense) {
      relIterator(state.query, fromNode, toNode, preserveDirection = true, relTypes, relCache, dir)
    } else if (fromNodeIsDense) {
      relIterator(state.query, fromNode, toNode, preserveDirection = false, relTypes, relCache, dir)
    } //both nodes are non-dense, choose a random starting point
    else {
      relIterator(state.query, fromNode, toNode, alternate(), relTypes, relCache, dir)
    }
  }

  private def alternate(): Boolean = {
    val result = !alternateState
    alternateState = result
    result
  }

  private def relIterator(query: QueryContext, fromNode: Long, toNode: Long, preserveDirection: Boolean,
                          relTypes: Array[Int], relCache: PrimitiveRelationshipsCache, dir: SemanticDirection): LongIterator = {
    val (start, localDirection, end) = if (preserveDirection) (fromNode, dir, toNode) else (toNode, dir.reversed, fromNode)
    val relationships: RelationshipIterator = query.getRelationshipsForIdsPrimitive(start, localDirection, relTypes)

    val connectedRelationships = mutable.ArrayBuilder.make[Long]
    var connected: Boolean = false

    val relVisitor = new RelationshipVisitor[InternalException] {

      override def visit(relationshipId: Long, typeId: Int, startNodeId: Long, endNodeId: Long): Unit =
        if ((end == startNodeId && start == endNodeId) || (start == startNodeId && end == endNodeId)) {
          connectedRelationships += relationshipId
          connected = true
        }
    }

    new LongIterator {
      var nextRelId: Long = -1
      // used to ensure consecutive calls to hasNext(), without interleaved next(),
      // return same result & don't consume additional inner iterator elements
      var consumed: Boolean = true

      override def next: Long = {
        consumed = true
        nextRelId
      }

      override def hasNext: Boolean = !consumed || computeNext

      private def computeNext = {
        connected = false
        while (relationships.hasNext && !connected) {
          nextRelId = relationships.next()
          relationships.relationshipVisit(nextRelId, relVisitor)
        }
        if (!relationships.hasNext) {
          relCache.put(fromNode, toNode, connectedRelationships.result(), dir)
        }
        // if connected is true, the following next() invocation has something to return
        // if connected is false, we have exhausted the iterator and nothing more needs to be returned
        consumed = !connected
        connected
      }
    }
  }

  private def getDegree(node: Long, relTypes: Array[Int], direction: SemanticDirection, state: QueryState) = {

    if (relTypes == null) {
      state.query.nodeGetDegree(node, direction, state.cursors.nodeCursor)
    } else if (relTypes.length == 1) {
      state.query.nodeGetDegree(node, direction, relTypes(0), state.cursors.nodeCursor)
    } else {
      relTypes.foldLeft(0)(
        (acc, rel) => acc + state.query.nodeGetDegree(node, direction, rel, state.cursors.nodeCursor)
      )
    }

  }
}

protected final class PrimitiveRelationshipsCache(capacity: Int, memoryManager: QueryMemoryTracker) {

  val table = new mutable.OpenHashMap[(Long, Long), Array[Long]]()

  def get(start: Long, end: Long, dir: SemanticDirection): Option[LongIterator] = {
    table.get(key(start, end, dir)).map(rels => {
      new LongIterator {
        var index: Int = 0

        override def next(): Long = {
          val r = rels(index)
          index = index + 1
          r
        }

        override def hasNext: Boolean = index < rels.length
      }
    })
  }

  def put(start: Long, end: Long, rels: Array[Long], dir: SemanticDirection): Any = {
    if (table.size < capacity) {
      table.put(key(start, end, dir), rels)
      memoryManager.allocated(((2 + rels.length) * 8))
    }
  }

  @inline
  private def key(start: Long, end: Long, dir: SemanticDirection) = {
    // if direction is BOTH than we keep the key sorted, otherwise direction is important and we keep key as is
    if (dir != SemanticDirection.BOTH) {
      (start, end)
    } else {
      if (start < end) {
        (start, end)
      } else {
        (end, start)
      }
    }
  }
}
