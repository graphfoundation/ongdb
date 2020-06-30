/*
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.cypher.internal.runtime.slotted

import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.ExpressionCursors
import org.neo4j.cypher.internal.runtime.InputDataStream
import org.neo4j.cypher.internal.runtime.QueryMemoryTracker
import org.neo4j.internal.kernel.api.IndexReadSession
import org.neo4j.kernel.impl.query.QuerySubscriber
//import org.neo4j.cypher.internal.compatibility.v3_5.runtime.SlotConfiguration
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.InCheckContainer
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.SingleThreadedLRUCache
import org.neo4j.cypher.internal.runtime.interpreted.pipes._
//import org.neo4j.cypher.internal.runtime.interpreted.{ExecutionContext, MutableMaps}
import org.neo4j.values.AnyValue

class SlottedQueryState(query: QueryContext,
                        resources: ExternalCSVResource,
                        params: Array[AnyValue],
                        cursors: ExpressionCursors,
                        queryIndexes: Array[IndexReadSession],
                        expressionVariables: Array[AnyValue],
                        subscriber: QuerySubscriber,
                        memoryTracker: QueryMemoryTracker,
                        decorator: PipeDecorator = NullPipeDecorator, // TODO: Review
                        initialContext: Option[ExecutionContext] = None,
                        cachedIn: SingleThreadedLRUCache[Any, InCheckContainer] = new SingleThreadedLRUCache(maxSize = 16),
                        lenientCreateRelationship: Boolean = false,
                        prePopulateResults: Boolean,
                        input: InputDataStream

                       )
  extends QueryState(query, resources, params, cursors, queryIndexes, expressionVariables, subscriber, memoryTracker, decorator, initialContext, cachedIn, lenientCreateRelationship, prePopulateResults, input) {

  override def withDecorator(decorator: PipeDecorator) =
    new SlottedQueryState(query, resources, params, cursors, queryIndexes, expressionVariables, subscriber, memoryTracker, decorator, initialContext, cachedIn, lenientCreateRelationship, prePopulateResults, input)

  override def withInitialContext(initialContext: ExecutionContext) =
    new SlottedQueryState(query, resources, params, cursors, queryIndexes, expressionVariables, subscriber, memoryTracker, decorator, Option(initialContext), cachedIn, lenientCreateRelationship, prePopulateResults, input)

  override def withQueryContext(query: QueryContext) =
    new SlottedQueryState(query, resources, params, cursors, queryIndexes, expressionVariables, subscriber, memoryTracker, decorator, initialContext, cachedIn, lenientCreateRelationship, prePopulateResults, input)
}

case class SlottedExecutionContextFactory(slots: SlotConfiguration) extends ExecutionContextFactory {
  override def newExecutionContext(): ExecutionContext = SlottedExecutionContext(slots)

  override def copyWith(row: ExecutionContext): ExecutionContext = {
    val newCtx = SlottedExecutionContext(slots)
    row.copyTo(newCtx)
    newCtx
  }

  override def copyWith(row: ExecutionContext, newEntries: Seq[(String, AnyValue)]): ExecutionContext = {
    val newCopy = SlottedExecutionContext(slots)
    row.copyTo(newCopy)
    for ((key, value) <- newEntries) {
      newCopy.set(key, value)
    }
    newCopy
  }

  override def copyWith(row: ExecutionContext, key: String, value: AnyValue): ExecutionContext = {
    val newCtx = SlottedExecutionContext(slots)
    row.copyTo(newCtx)
    newCtx.set(key, value)
    newCtx
  }

  override def copyWith(row: ExecutionContext,
                        key1: String, value1: AnyValue,
                        key2: String, value2: AnyValue): ExecutionContext = {
    val newCopy = SlottedExecutionContext(slots)
    row.copyTo(newCopy)
    newCopy.set(key1, value1)
    newCopy.set(key2, value2)
    newCopy
  }

  override def copyWith(row: ExecutionContext,
                        key1: String, value1: AnyValue,
                        key2: String, value2: AnyValue,
                        key3: String, value3: AnyValue): ExecutionContext = {
    val newCopy = SlottedExecutionContext(slots)
    row.copyTo(newCopy)
    newCopy.set(key1, value1)
    newCopy.set(key2, value2)
    newCopy.set(key3, value3)
    newCopy
  }
}
