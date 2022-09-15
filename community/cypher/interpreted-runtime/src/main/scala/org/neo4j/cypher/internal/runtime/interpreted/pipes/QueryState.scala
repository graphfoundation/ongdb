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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.config.MemoryTrackingController
import org.neo4j.cypher.internal.macros.AssertMacros
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.ExpressionCursors
import org.neo4j.cypher.internal.runtime.InputDataStream
import org.neo4j.cypher.internal.runtime.MapCypherRow
import org.neo4j.cypher.internal.runtime.NoInput
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.QueryStatistics
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.CSVResources
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.PathValueBuilder
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.InCheckContainer
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.InLRUCache
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.SingleThreadedLRUCache
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState.createDefaultInCache
import org.neo4j.cypher.internal.runtime.memory.MemoryTrackerForOperatorProvider
import org.neo4j.cypher.internal.runtime.memory.QueryMemoryTracker
import org.neo4j.internal.kernel
import org.neo4j.internal.kernel.api.IndexReadSession
import org.neo4j.internal.kernel.api.TokenReadSession
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.AnyValue

class QueryState(val query: QueryContext,
                 val resources: ExternalCSVResource,
                 val params: Array[AnyValue],
                 val cursors: ExpressionCursors,
                 val queryIndexes: Array[IndexReadSession],
                 val nodeLabelTokenReadSession: Option[TokenReadSession],
                 val relTypeTokenReadSession: Option[TokenReadSession],
                 val expressionVariables: Array[AnyValue],
                 val subscriber: QuerySubscriber,
                 val queryMemoryTracker: QueryMemoryTracker,
                 val memoryTrackerForOperatorProvider: MemoryTrackerForOperatorProvider,
                 val decorator: PipeDecorator = NullPipeDecorator,
                 val initialContext: Option[CypherRow] = None,
                 val cachedIn: InLRUCache[Any, InCheckContainer] = createDefaultInCache(),
                 val lenientCreateRelationship: Boolean = false,
                 val prePopulateResults: Boolean = false,
                 val input: InputDataStream = NoInput) extends AutoCloseable {

  private var _pathValueBuilder: PathValueBuilder = _
  private var _rowFactory: CypherRowFactory = _
  private var _closed = false

  def newRow(rowFactory: CypherRowFactory): CypherRow = {
    initialContext match {
      case Some(init) => rowFactory.copyWith(init)
      case None => rowFactory.newRow()
    }
  }

  /**
   * When running on the RHS of an Apply, this method will fill the new row with argument data
   */
  def newRowWithArgument(rowFactory: CypherRowFactory): CypherRow = {
    initialContext match {
      case Some(init) => rowFactory.copyArgumentOf(init)
      case None => rowFactory.newRow()
    }
  }

  def clearPathValueBuilder: PathValueBuilder = {
    if (_pathValueBuilder == null) {
      _pathValueBuilder = new PathValueBuilder(this)
    }
    _pathValueBuilder.clear()
  }

  def getStatistics: QueryStatistics = query.getOptStatistics.getOrElse(QueryState.defaultStatistics)

  def withDecorator(decorator: PipeDecorator): QueryState  =
    new QueryState(query, resources, params, cursors, queryIndexes, nodeLabelTokenReadSession, relTypeTokenReadSession,
      expressionVariables, subscriber, queryMemoryTracker, memoryTrackerForOperatorProvider, decorator, initialContext, cachedIn, lenientCreateRelationship, prePopulateResults, input)

  def withInitialContext(initialContext: CypherRow): QueryState  =
    new QueryState(query, resources, params, cursors, queryIndexes, nodeLabelTokenReadSession, relTypeTokenReadSession,
      expressionVariables, subscriber, queryMemoryTracker, memoryTrackerForOperatorProvider, decorator, Some(initialContext), cachedIn, lenientCreateRelationship, prePopulateResults, input)

  def withInitialContextAndDecorator(initialContext: CypherRow, newDecorator: PipeDecorator): QueryState  =
    new QueryState(query, resources, params, cursors, queryIndexes, nodeLabelTokenReadSession, relTypeTokenReadSession,
      expressionVariables, subscriber, queryMemoryTracker, memoryTrackerForOperatorProvider, newDecorator, Some(initialContext), cachedIn, lenientCreateRelationship, prePopulateResults, input)

  def withQueryContext(query: QueryContext): QueryState =
    new QueryState(query, resources, params, cursors, queryIndexes, nodeLabelTokenReadSession, relTypeTokenReadSession,
      expressionVariables, subscriber, queryMemoryTracker, memoryTrackerForOperatorProvider, decorator, initialContext, cachedIn, lenientCreateRelationship, prePopulateResults, input)

  def withNewTransaction(): QueryState  = {
    val newQuery = query.contextWithNewTransaction()

    val newCursors = newQuery.createExpressionCursors()

    // This method is not supported when we run with PERIODIC COMMIT, so we assert that we do not have such resources.
    AssertMacros.checkOnlyWhenAssertionsAreEnabled(resources.isInstanceOf[CSVResources])
    val newResources = new CSVResources(newQuery.resources)

    // IndexReadSession and TokenReadSession are bound to the outer transaction.
    // They use a ValueIndexReader / TokenIndexReader that is cached and closed together with the transaction.
    // But apart from that they seem to be safe to be used from different transactions from the same thread.
    // Nevertheless we create new sessions here to protect against future modifications of IndexReadSession and TokenReadSession that
    // would actually break from two different transaction.
    // An optimization could be to only create new sessions for those indexes that are actually used in the new transaction.
    val newQueryIndexes = queryIndexes.map(i => newQuery.transactionalContext.dataRead.indexReadSession(i.reference()))
    val newNodeLabelTokenReadSession = nodeLabelTokenReadSession.map(t => newQuery.transactionalContext.dataRead.tokenReadSession(t.reference()))
    val newRelTypeTokenReadSession = relTypeTokenReadSession.map(t => newQuery.transactionalContext.dataRead.tokenReadSession(t.reference()))

    // Reusing the expressionVariables should work as long as we do not implement parallelism
    val newExpressionVariables = expressionVariables

    val newDecorator = decorator

    // Reusing the IN cache should work as long as we do not implement parallelism
    val newCachedIn = cachedIn

    QueryState(newQuery,
      newResources,
      params,
      newCursors,
      newQueryIndexes,
      newNodeLabelTokenReadSession,
      newRelTypeTokenReadSession,
      newExpressionVariables,
      subscriber,
      queryMemoryTracker,
      newDecorator,
      initialContext,
      newCachedIn,
      lenientCreateRelationship,
      prePopulateResults,
      input)
  }

  def setExecutionContextFactory(rowFactory: CypherRowFactory): Unit = {
    _rowFactory = rowFactory
  }

  def rowFactory: CypherRowFactory = _rowFactory

  def kernelQueryContext: kernel.api.QueryContext = query.transactionalContext.kernelQueryContext

  override def close(): Unit = {
    if (!_closed) {
      cursors.close()
      cachedIn.cache.foreach {
        case (_, g) => g.checker.close()
      }
      query.close()
    }
    _closed = true
  }
}

object QueryState {

  val defaultStatistics: QueryStatistics = QueryStatistics()

  val inCacheMaxSize: Int = 16

  def createDefaultInCache(): InLRUCache[Any, InCheckContainer] = new SingleThreadedLRUCache(maxSize = inCacheMaxSize)

  def apply(query: QueryContext,
            resources: ExternalCSVResource,
            params: Array[AnyValue],
            cursors: ExpressionCursors,
            queryIndexes: Array[IndexReadSession],
            nodeLabelTokenReadSession: Option[TokenReadSession],
            relTypeTokenReadSession: Option[TokenReadSession],
            expressionVariables: Array[AnyValue],
            subscriber: QuerySubscriber,
            memoryTrackingController: MemoryTrackingController,
            doProfile: Boolean,
            decorator: PipeDecorator,
            initialContext: Option[CypherRow],
            cachedIn: InLRUCache[Any, InCheckContainer],
            lenientCreateRelationship: Boolean,
            prePopulateResults: Boolean,
            input: InputDataStream): QueryState = {
    val queryHeapHighWatermarkTracker = QueryMemoryTracker(memoryTrackingController.memoryTracking(doProfile))
    apply(
      query,
      resources,
      params,
      cursors,
      queryIndexes,
      nodeLabelTokenReadSession,
      relTypeTokenReadSession,
      expressionVariables,
      subscriber,
      queryHeapHighWatermarkTracker,
      decorator,
      initialContext,
      cachedIn,
      lenientCreateRelationship,
      prePopulateResults,
      input
    )
  }

  def apply(query: QueryContext,
            resources: ExternalCSVResource,
            params: Array[AnyValue],
            cursors: ExpressionCursors,
            queryIndexes: Array[IndexReadSession],
            nodeLabelTokenReadSession: Option[TokenReadSession],
            relTypeTokenReadSession: Option[TokenReadSession],
            expressionVariables: Array[AnyValue],
            subscriber: QuerySubscriber,
            queryHeapHighWatermarkTracker: QueryMemoryTracker,
            decorator: PipeDecorator,
            initialContext: Option[CypherRow],
            cachedIn: InLRUCache[Any, InCheckContainer],
            lenientCreateRelationship: Boolean,
            prePopulateResults: Boolean,
            input: InputDataStream): QueryState = {
    val memoryTrackerForOperatorProvider = queryHeapHighWatermarkTracker.newMemoryTrackerForOperatorProvider(query.transactionalContext.memoryTracker)
    new QueryState(
      query,
      resources,
      params,
      cursors,
      queryIndexes,
      nodeLabelTokenReadSession,
      relTypeTokenReadSession,
      expressionVariables,
      subscriber,
      queryHeapHighWatermarkTracker,
      memoryTrackerForOperatorProvider,
      decorator,
      initialContext,
      cachedIn,
      lenientCreateRelationship,
      prePopulateResults,
      input
    )
  }
}

trait CypherRowFactory {

  def newRow(): CypherRow

  def copyArgumentOf(row: ReadableRow): CypherRow

  def copyWith(row: ReadableRow): CypherRow

  def copyWith(row: ReadableRow, newEntries: Seq[(String, AnyValue)]): CypherRow

  def copyWith(row: ReadableRow, key: String, value: AnyValue): CypherRow

  def copyWith(row: ReadableRow, key1: String, value1: AnyValue, key2: String, value2: AnyValue): CypherRow

  def copyWith(row: ReadableRow,
               key1: String, value1: AnyValue,
               key2: String, value2: AnyValue,
               key3: String, value3: AnyValue): CypherRow
}

case class CommunityCypherRowFactory() extends CypherRowFactory {

  override def newRow(): CypherRow = CypherRow.empty

  override def copyArgumentOf(row: ReadableRow): CypherRow = copyWith(row)

  // Not using polymorphism here, instead cast since the cost of being megamorhpic is too high
  override def copyWith(row: ReadableRow): CypherRow = row match {
    case context: MapCypherRow =>
      context.createClone()
  }

  // Not using polymorphism here, instead cast since the cost of being megamorhpic is too high
  override def copyWith(row: ReadableRow, newEntries: Seq[(String, AnyValue)]): CypherRow = row match {
    case context: MapCypherRow =>
      context.copyWith(newEntries)
  }

  // Not using polymorphism here, instead cast since the cost of being megamorhpic is too high
  override def copyWith(row: ReadableRow, key: String, value: AnyValue): CypherRow = row match {
    case context: MapCypherRow =>
      context.copyWith(key, value)
  }

  // Not using polymorphism here, instead cast since the cost of being megamorhpic is too high
  override def copyWith(row: ReadableRow, key1: String, value1: AnyValue, key2: String, value2: AnyValue): CypherRow = row match {
    case context: MapCypherRow =>
      context.copyWith(key1, value1, key2, value2)
    }

  // Not using polymorphism here, instead cast since the cost of being megamorhpic is too high
  override def copyWith(row: ReadableRow, key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): CypherRow = row match {
    case context: MapCypherRow =>
      context.copyWith(key1, value1, key2, value2, key3, value3)
  }
}
