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
package org.neo4j.storageengine.api;

import org.neo4j.lock.LockTracer;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;

public interface StorageLocks
{
    //Transaction api locks
    void acquireExclusiveNodeLock( LockTracer lockTracer, long... ids );
    void releaseExclusiveNodeLock( long... ids );
    void acquireSharedNodeLock( LockTracer lockTracer, long... ids );
    void releaseSharedNodeLock( long... ids );

    void acquireExclusiveRelationshipLock( LockTracer lockTracer, long... ids );
    void releaseExclusiveRelationshipLock( long... ids );
    void acquireSharedRelationshipLock( LockTracer lockTracer, long... ids );
    void releaseSharedRelationshipLock( long... ids );

    //Creation locks
    /**
     * Acquire the required locks (during transaction creation phase) for creating a relationship
     * Additional locks may be taken during transaction commit
     * @param txState The transaction state
     * @param sourceNode The source node id of the relationship to be created
     * @param targetNode The target node id of the relationship to be created
     */
    void acquireRelationshipCreationLock( ReadableTransactionState txState, LockTracer lockTracer, long sourceNode, long targetNode );

    /**
     * Acquire the required locks (during transaction creation phase) for deleting a relationship
     * Additional locks may be taken during transaction commit
     *
     * @param txState The transaction state
     * @param sourceNode The source node id of the relationship to be deleted
     * @param targetNode The target node id of the relationship to be deleted
     * @param relationship The id of the relationship to be deleted
     */
    void acquireRelationshipDeletionLock( ReadableTransactionState txState, LockTracer lockTracer, long sourceNode, long targetNode, long relationship );

    /**
     * Acquire the required locks (during transaction creation phase) for deleting a node
     * Additional locks may be taken during transaction commit
     *
     * @param txState The transaction state
     * @param node The id of the node to be deleted
     */
    void acquireNodeDeletionLock( ReadableTransactionState txState, LockTracer lockTracer, long node );

    /**
     * Acquire the required locks (during transaction creation phase) for removing or adding a label from a node
     * Additional locks may be taken during transaction commit
     *
     * @param node The id of the node to be deleted
     * @param labelId The id of the label to be deleted
     */
    void acquireNodeLabelChangeLock( LockTracer lockTracer, long node, int labelId );
}
