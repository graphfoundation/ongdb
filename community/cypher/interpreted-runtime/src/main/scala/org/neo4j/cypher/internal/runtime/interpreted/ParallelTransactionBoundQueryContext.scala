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
package org.neo4j.cypher.internal.runtime.interpreted

import org.eclipse.collections.api.map.primitive.IntObjectMap
import org.eclipse.collections.api.set.primitive.IntSet
import org.neo4j.common.EntityType
import org.neo4j.configuration.Config
import org.neo4j.cypher.internal.runtime.ClosingLongIterator
import org.neo4j.cypher.internal.runtime.NodeOperations
import org.neo4j.cypher.internal.runtime.Operations
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.RelationshipOperations
import org.neo4j.cypher.internal.runtime.ResourceManager
import org.neo4j.cypher.internal.runtime.WriteQueryContext
import org.neo4j.cypher.internal.runtime.interpreted.ParallelTransactionBoundQueryContext.UnsupportedWriteQueryContext
import org.neo4j.cypher.internal.runtime.interpreted.TransactionBoundQueryContext.IndexSearchMonitor
import org.neo4j.dbms.database.DatabaseContext
import org.neo4j.dbms.database.DatabaseManager
import org.neo4j.internal.kernel.api.NodeCursor
import org.neo4j.internal.kernel.api.PropertyCursor
import org.neo4j.internal.kernel.api.RelationshipScanCursor
import org.neo4j.internal.schema.IndexConfig
import org.neo4j.internal.schema.IndexDescriptor
import org.neo4j.internal.schema.IndexProviderDescriptor
import org.neo4j.values.storable.Value
import org.neo4j.values.virtual.VirtualNodeValue
import org.neo4j.values.virtual.VirtualRelationshipValue

import scala.collection.Iterator

sealed class ParallelTransactionBoundQueryContext(transactionalContext: TransactionalContextWrapper,
                                                  resources: ResourceManager,
                                                  closeable: Option[AutoCloseable] = None)
                                                 (implicit indexSearchMonitor: IndexSearchMonitor)
  extends TransactionBoundReadQueryContext(transactionalContext, resources, closeable) with QueryContext with UnsupportedWriteQueryContext {

  override def createParallelQueryContext(): QueryContext = {
    // TODO: Create a single-threaded copy of ResourceManager attach to the ThreadSafeResourceManager coming in
    val parallelTransactionalContext = transactionalContext.createParallelTransactionalContext()
    new ParallelTransactionBoundQueryContext(parallelTransactionalContext, resources, closeable)(indexSearchMonitor)
  }
}

object ParallelTransactionBoundQueryContext {
  sealed trait UnsupportedWriteQueryContext extends WriteQueryContext {
    override def nodeWriteOps: NodeOperations = new UnsupportedNodeOperations
    override def relationshipWriteOps: RelationshipOperations = new UnsupportedRelationshipOperations
    override def createNodeId(labels: Array[Int]): Long = unsupported()
    override def createRelationshipId(start: Long, end: Long, relType: Int): Long = unsupported()
    override def getOrCreateRelTypeId(relTypeName: String): Int = unsupported()
    override def getOrCreateLabelId(labelName: String): Int = unsupported()
    override def getOrCreateTypeId(relTypeName: String): Int = unsupported()
    override def setLabelsOnNode(node: Long, labelIds: Iterator[Int]): Int = unsupported()
    override def removeLabelsFromNode(node: Long, labelIds: Iterator[Int]): Int = unsupported()
    override def getOrCreatePropertyKeyId(propertyKey: String): Int = unsupported()
    override def getOrCreatePropertyKeyIds(propertyKeys: Array[String]): Array[Int] = unsupported()
    override def addBtreeIndexRule(entityId: Int, entityType: EntityType, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[String], indexConfig: IndexConfig): IndexDescriptor = unsupported()
    override def addRangeIndexRule(entityId: Int, entityType: EntityType, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[IndexProviderDescriptor]): IndexDescriptor = unsupported()
    override def addLookupIndexRule(entityType: EntityType, name: Option[String], provider: Option[IndexProviderDescriptor]): IndexDescriptor = unsupported()
    override def addFulltextIndexRule(entityIds: List[Int], entityType: EntityType, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[IndexProviderDescriptor], indexConfig: IndexConfig): IndexDescriptor = unsupported()
    override def addTextIndexRule(entityId: Int, entityType: EntityType, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[IndexProviderDescriptor]): IndexDescriptor = unsupported()
    override def addPointIndexRule(entityId: Int, entityType: EntityType, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[IndexProviderDescriptor], indexConfig: IndexConfig): IndexDescriptor = unsupported()
    override def dropIndexRule(labelId: Int, propertyKeyIds: Seq[Int]): Unit = unsupported()
    override def dropIndexRule(name: String): Unit = unsupported()
    override def createNodeKeyConstraint(labelId: Int, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[String], indexConfig: IndexConfig): Unit = unsupported()
    override def dropNodeKeyConstraint(labelId: Int, propertyKeyIds: Seq[Int]): Unit = unsupported()
    override def createUniqueConstraint(labelId: Int, propertyKeyIds: Seq[Int], name: Option[String], provider: Option[String], indexConfig: IndexConfig): Unit = unsupported()
    override def dropUniqueConstraint(labelId: Int, propertyKeyIds: Seq[Int]): Unit = unsupported()
    override def createNodePropertyExistenceConstraint(labelId: Int, propertyKeyId: Int, name: Option[String]): Unit = unsupported()
    override def dropNodePropertyExistenceConstraint(labelId: Int, propertyKeyId: Int): Unit = unsupported()
    override def createRelationshipPropertyExistenceConstraint(relTypeId: Int, propertyKeyId: Int, name: Option[String]): Unit = unsupported()
    override def dropRelationshipPropertyExistenceConstraint(relTypeId: Int, propertyKeyId: Int): Unit = unsupported()
    override def dropNamedConstraint(name: String): Unit = unsupported()
    override def detachDeleteNode(id: Long): Int = unsupported()
    override def assertSchemaWritesAllowed(): Unit = unsupported()
    override def getDatabaseManager: DatabaseManager[DatabaseContext] = unsupported()
    override def getConfig: Config = unsupported()
    override def nodeApplyChanges(node: Long,
                                  addedLabels: IntSet,
                                  removedLabels: IntSet,
                                  properties: IntObjectMap[Value]): Unit = unsupported()
    override def relationshipApplyChanges(relationship: Long,
                                          properties: IntObjectMap[Value]): Unit = unsupported()
  }

  private sealed class UnsupportedOperations[T, CURSOR] extends Operations[T, CURSOR] {
    override def getProperty(obj: Long, propertyKeyId: Int, cursor: CURSOR, propertyCursor: PropertyCursor, throwOnDeleted: Boolean): Value = unsupported()
    override def hasProperty(obj: Long, propertyKeyId: Int, cursor: CURSOR, propertyCursor: PropertyCursor): Boolean = unsupported()
    override def getTxStateProperty(obj: Long, propertyKeyId: Int): Value = unsupported()
    override def hasTxStatePropertyForCachedProperty(entityId: Long, propertyKeyId: Int): Option[Boolean] = unsupported()
    override def propertyKeyIds(obj: Long, cursor: CURSOR, propertyCursor: PropertyCursor): Array[Int] = unsupported()
    override def getById(id: Long): T = unsupported()
    override def isDeletedInThisTx(id: Long): Boolean = unsupported()
    override def all: ClosingLongIterator = unsupported()
    override def acquireExclusiveLock(obj: Long): Unit = unsupported()
    override def releaseExclusiveLock(obj: Long): Unit = unsupported()
    override def entityExists(id: Long): Boolean = unsupported()
    override def delete(id: Long): Boolean = unsupported()
    override def setProperty(obj: Long, propertyKeyId: Int, value: Value): Unit = unsupported()
    override def removeProperty(obj: Long, propertyKeyId: Int): Boolean = unsupported()
    override def setProperties(obj: Long,
                               properties: IntObjectMap[Value]): Unit = unsupported()
  }
  private sealed class UnsupportedNodeOperations extends UnsupportedOperations[VirtualNodeValue, NodeCursor] with NodeOperations
  private sealed class UnsupportedRelationshipOperations extends UnsupportedOperations[VirtualRelationshipValue, RelationshipScanCursor] with RelationshipOperations

  private def unsupported(): Nothing = {
    throw new UnsupportedOperationException("Not supported with parallel runtime.")
  }
}
