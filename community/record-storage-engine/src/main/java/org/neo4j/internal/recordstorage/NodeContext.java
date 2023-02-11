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
package org.neo4j.internal.recordstorage;

import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;

import org.neo4j.collection.trackable.HeapTrackingCollections;
import org.neo4j.internal.recordstorage.RecordAccess.RecordProxy;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.internal.recordstorage.RelationshipGroupGetter.RelationshipGroupMonitor.EMPTY;
import static org.neo4j.kernel.impl.store.record.Record.NULL_REFERENCE;
import static org.neo4j.kernel.impl.store.record.Record.isNull;
import static org.neo4j.memory.HeapEstimator.shallowSizeOfInstance;
import static org.neo4j.memory.HeapEstimator.shallowSizeOfObjectArray;

/**
 * Acts as a place to gather all context about locking and relevant data that has been read as {@link RelationshipModifier} goes through
 * and makes all necessary changes. This is partly performance optimization where some things that have been read can be cached
 * instead of read again, and partly to remember e.g. to what extent a particular node has been locked.
 */
class NodeContext
{
    private static final long SHALLOW_SIZE = shallowSizeOfInstance( NodeContext.class );

    private final MemoryTracker memoryTracker;
    private boolean hasExclusiveGroupLock;
    private boolean hasAnyEmptyGroup;
    private boolean hasEmptyFirstGroup;
    private RecordProxy<NodeRecord,Void> node;
    private MutableIntObjectMap<DenseContext> denseContexts;
    /**
     * A relationship group ID which is a cached ID of how far a relationship group traversal has come for a node.
     * A NodeContext is used for all interactions with a node, but relationship changes are made per type so therefore the context
     * how far the relationship group traversal has come is kept between such invocations and can therefore be continued instead of restarted
     * from the beginning every time.
     */
    private long groupStartingId;
    /**
     * A cached value of the previous relationship group ID for the group with the ID of {@link #groupStartingId}, since the {@link RelationshipGroupRecord}
     * doesn't have this value and it would require a new group traversal to find this ID otherwise.
     */
    private long groupStartingPrevId = NULL_REFERENCE.longValue();

    static NodeContext createNodeContext( RecordProxy<NodeRecord,Void> node, MemoryTracker memoryTracker )
    {
        memoryTracker.allocateHeap( SHALLOW_SIZE );
        return new NodeContext( node, memoryTracker );
    }

    private NodeContext( RecordProxy<NodeRecord,Void> node, MemoryTracker memoryTracker )
    {
        this.node = node;
        this.groupStartingId = node.forReadingLinkage().getNextRel();
        this.memoryTracker = memoryTracker;
    }

    DenseContext denseContext( int type )
    {
        if ( denseContexts == null )
        {
            denseContexts = HeapTrackingCollections.newIntObjectHashMap( memoryTracker );
        }
        return denseContexts.getIfAbsentPut( type, () -> new DenseContext( memoryTracker ) );
    }

    DenseContext denseContextIfExists( int type )
    {
        return denseContexts != null ? denseContexts.get( type ) : null;
    }

    void clearDenseContext()
    {
        if ( denseContexts != null )
        {
            denseContexts.forEachValue( ctx -> ctx.group = null );
        }
        groupStartingPrevId = NULL_REFERENCE.longValue();
    }

    void markExclusiveGroupLock()
    {
        hasExclusiveGroupLock = true;
        clearDenseContext();
    }

    boolean hasExclusiveGroupLock()
    {
        return hasExclusiveGroupLock;
    }

    RecordProxy<NodeRecord,Void> node()
    {
        return node;
    }

    void setNode( RecordProxy<NodeRecord,Void> node )
    {
        this.node = node;
    }

    void setCurrentGroup( RecordProxy<RelationshipGroupRecord,Integer> group )
    {
        if ( group != null )
        {
            groupStartingId = group.getKey();
            groupStartingPrevId = group.forReadingLinkage().getPrev();
        }
        else
        {
            groupStartingId = NULL_REFERENCE.longValue();
            groupStartingPrevId = NULL_REFERENCE.longValue();
        }
    }

    void checkEmptyGroup( RelationshipGroupRecord group )
    {
        if ( !group.isCreated() && group.inUse() && RelationshipGroupGetter.groupIsEmpty( group ) )
        {
            hasAnyEmptyGroup = true;
            if ( isNull( group.getPrev() ) )
            {
                hasEmptyFirstGroup = true;
            }
        }
    }

    boolean hasAnyEmptyGroup()
    {
        return hasAnyEmptyGroup;
    }

    boolean hasEmptyFirstGroup()
    {
        return hasEmptyFirstGroup;
    }

    long groupStartingId()
    {
        return groupStartingId;
    }

    long groupStartingPrevId()
    {
        return groupStartingPrevId;
    }

    /**
     * Additional context for dense nodes, since dense nodes have split relationship chains by direction.
     */
    static class DenseContext
    {
        private static final int NUM_INSERTION_POINTS = 3;
        private static final long SHALLOW_SIZE = shallowSizeOfInstance( DenseContext.class ) + shallowSizeOfObjectArray( NUM_INSERTION_POINTS );

        /**
         * Places in each relationship chain (out, in, loop) that have been exclusive locked and suitable for inserting new relationships at.
         * The insertion point is between {@link RelationshipRecord#getId()} and {@link RelationshipRecord#getNextRel(long)}.
         * If an insertion point is {@code null} it means that the insertion point is first in the chain.
         */
        private final RecordProxy<RelationshipRecord,Void>[] insertionPoints = new RecordProxy[NUM_INSERTION_POINTS];
        private long groupId = NULL_REFERENCE.longValue();
        private RecordProxy<RelationshipGroupRecord,Integer> group;

        DenseContext( MemoryTracker memoryTracker )
        {
            memoryTracker.allocateHeap( SHALLOW_SIZE );
        }

        RelationshipGroupRecord getOrLoadGroup( RelationshipGroupGetter relationshipGroupGetter, NodeRecord node, int type,
                RecordAccess<RelationshipGroupRecord,Integer> relGroupRecords )
        {
            if ( group == null )
            {
                if ( !isNull( groupId ) )
                {
                    group = relGroupRecords.getOrLoad( groupId, null );
                }
                else
                {
                    setGroup( relationshipGroupGetter.getRelationshipGroup( node, type, relGroupRecords, EMPTY ).group() );
                }
            }
            return group.forReadingLinkage();
        }

        void setGroup( RecordProxy<RelationshipGroupRecord,Integer> group )
        {
            this.group = group;
            this.groupId = group.getKey();
        }

        RecordProxy<RelationshipGroupRecord,Integer> group()
        {
            return group;
        }

        RecordProxy<RelationshipRecord,Void> insertionPoint( int directionIndex )
        {
            return insertionPoints[directionIndex];
        }

        void setInsertionPoint( int directionIndex, RecordProxy<RelationshipRecord,Void> insertionPoint )
        {
            insertionPoints[directionIndex] = insertionPoint;
        }

        void markInsertionPointsAsChanged()
        {
            for ( RecordProxy<RelationshipRecord,Void> insertion : insertionPoints )
            {
                if ( insertion != null )
                {
                    // Since this insertion point may be used for other relationships, i.e. it may be loaded again for another
                    // insertion point, we have to pin the relationship so that they get the same proxy
                    insertion.forChangingData();
                }
            }
        }
    }
}
