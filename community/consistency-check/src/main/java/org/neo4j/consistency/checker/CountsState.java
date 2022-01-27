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
package org.neo4j.consistency.checker;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.consistency.checking.cache.CacheAccess;
import org.neo4j.consistency.report.ConsistencyReporter;
import org.neo4j.consistency.store.synthetic.CountsEntry;
import org.neo4j.counts.CountsVisitor;
import org.neo4j.internal.batchimport.cache.LongArray;
import org.neo4j.internal.batchimport.cache.NumberArrayFactories;
import org.neo4j.internal.batchimport.cache.OffHeapLongArray;
import org.neo4j.internal.counts.CountsKey;
import org.neo4j.internal.recordstorage.RelationshipCounter;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.collection.PrimitiveLongCollections.EMPTY_LONG_ARRAY;
import static org.neo4j.consistency.checking.cache.CacheSlots.NodeLink.SLOT_HAS_INLINED_LABELS;
import static org.neo4j.consistency.checking.cache.CacheSlots.NodeLink.SLOT_HAS_SINGLE_LABEL;
import static org.neo4j.consistency.checking.cache.CacheSlots.NodeLink.SLOT_LABELS;
import static org.neo4j.internal.counts.GBPTreeCountsStore.nodeKey;
import static org.neo4j.internal.counts.GBPTreeCountsStore.relationshipKey;
import static org.neo4j.internal.recordstorage.RelationshipCounter.labelsCountsLength;
import static org.neo4j.internal.recordstorage.RelationshipCounter.wildcardCountsLength;
import static org.neo4j.kernel.impl.store.InlineNodeLabels.parseInlined;
import static org.neo4j.token.api.TokenConstants.ANY_LABEL;
import static org.neo4j.token.api.TokenConstants.ANY_RELATIONSHIP_TYPE;

/**
 * Keeps observed counts when checking nodes and relationships. This counts state can then be checked against the counts store.
 */
class CountsState implements AutoCloseable
{
    private static final long COUNT_VISITED_MARK = 0x40000000_00000000L;
    private final long highLabelId;
    private final long highRelationshipTypeId;
    private final long highNodeId;
    private final CacheAccess cacheAccess;
    private final OffHeapLongArray nodeCounts;
    private final ConcurrentMap<CountsKey,AtomicLong> nodeCountsStray = new ConcurrentHashMap<>();
    private final LongArray relationshipLabelCounts;
    private final LongArray relationshipWildcardCounts;
    private final ConcurrentMap<CountsKey,AtomicLong> relationshipCountsStray = new ConcurrentHashMap<>();
    private final DynamicNodeLabelsCache dynamicNodeLabelsCache;

    CountsState( NeoStores neoStores, CacheAccess cacheAccess, MemoryTracker memoryTracker )
    {
        this( neoStores.getLabelTokenStore().getHighId(), neoStores.getRelationshipTypeTokenStore().getHighId(), neoStores.getNodeStore().getHighId(),
                cacheAccess, memoryTracker );
    }

    CountsState( long highLabelId, long highRelationshipTypeId, long highNodeId, CacheAccess cacheAccess, MemoryTracker memoryTracker )
    {
        this.highLabelId = highLabelId;
        this.highRelationshipTypeId = highRelationshipTypeId;
        this.highNodeId = highNodeId;
        this.cacheAccess = cacheAccess;
        var arrayFactory = NumberArrayFactories.OFF_HEAP;
        this.nodeCounts = (OffHeapLongArray) arrayFactory.newLongArray( highLabelId + 1, 0, memoryTracker );
        this.relationshipLabelCounts = arrayFactory.newLongArray( labelsCountsLength( highLabelId, highRelationshipTypeId ), 0, memoryTracker );
        this.relationshipWildcardCounts = arrayFactory.newLongArray( wildcardCountsLength( highRelationshipTypeId ), 0, memoryTracker );
        this.dynamicNodeLabelsCache = new DynamicNodeLabelsCache( memoryTracker );
    }

    @Override
    public void close()
    {
        nodeCounts.close();
        relationshipLabelCounts.close();
        relationshipWildcardCounts.close();
        dynamicNodeLabelsCache.close();
    }

    RelationshipCounter instantiateRelationshipCounter()
    {
        return new RelationshipCounter( nodeLabelsLookup(), highLabelId, highRelationshipTypeId, relationshipWildcardCounts, relationshipLabelCounts,
                ( array, index ) -> ((OffHeapLongArray) array).getAndAdd( index, 1 ) );
    }

    long cacheDynamicNodeLabels( long[] labelIds )
    {
        return dynamicNodeLabelsCache.put( labelIds );
    }

    void clearDynamicNodeLabelsCache()
    {
        dynamicNodeLabelsCache.clear();
    }

    RelationshipCounter.NodeLabelsLookup nodeLabelsLookup()
    {
        return new RelationshipCounter.NodeLabelsLookup()
        {
            private final CacheAccess.Client cacheAccessClient = cacheAccess.client();
            private final long[] labelsHolder = new long[20]; // should be big enough for most cases, right?

            @Override
            public long[] nodeLabels( long nodeId )
            {
                if ( nodeId >= highNodeId )
                {
                    return EMPTY_LONG_ARRAY;
                }
                boolean hasSingleLabel = cacheAccessClient.getBooleanFromCache( nodeId, SLOT_HAS_SINGLE_LABEL );
                long labelField = cacheAccessClient.getFromCache( nodeId, SLOT_LABELS );
                if ( hasSingleLabel )
                {
                    // Just grab the field, which represents a single label and then terminate the array with -1
                    labelsHolder[0] = labelField;
                    labelsHolder[1] = -1;
                    return labelsHolder;
                }
                else
                {
                    boolean hasInlinedLabels = cacheAccessClient.getBooleanFromCache( nodeId, SLOT_HAS_INLINED_LABELS );
                    return hasInlinedLabels ? parseInlined( labelField ) : dynamicNodeLabelsCache.get( labelField, labelsHolder );
                }
            }
        };
    }

    void incrementNodeLabel( int label, long increment )
    {
        if ( isValidLabelId( label ) )
        {
            nodeCounts.getAndAdd( labelIdArrayPos( label ), increment );
        }
        else
        {
            nodeCountsStray.computeIfAbsent( nodeKey( label ), k -> new AtomicLong() ).addAndGet( increment );
        }
    }

    private boolean isValidLabelId( int label )
    {
        return label == ANY_LABEL || (label >= 0 && label < highLabelId);
    }

    /**
     * Increments counts for the given {@code relationship}, counts that revolve around the relationship type, not its nodes or node labels.
     * @param counter {@link RelationshipCounter} used for incrementing.
     * @param relationship {@link RelationshipRecord} containing type information.
     */
    void incrementRelationshipTypeCounts( RelationshipCounter counter, RelationshipRecord relationship )
    {
        counter.processRelationshipTypeCounts( relationship,
                ( s, t, e ) -> relationshipCountsStray.computeIfAbsent( relationshipKey( s, t, e ), k -> new AtomicLong() ).incrementAndGet() );
    }

    /**
     * Increments counts for the given {@code relationship}, counts that revolve around the nodes and node labels.
     * @param counter {@link RelationshipCounter} used for incrementing.
     * @param relationship {@link RelationshipRecord} containing type information.
     * @param processStartNode whether or not to increment counts for the start node.
     * @param processEndNode whether or not to increment counts for the end node.
     */
    void incrementRelationshipNodeCounts( RelationshipCounter counter, RelationshipRecord relationship, boolean processStartNode, boolean processEndNode )
    {
        counter.processRelationshipNodeCounts( relationship,
                ( s, t, e ) -> relationshipCountsStray.computeIfAbsent( relationshipKey( s, t, e ), k -> new AtomicLong() ).incrementAndGet(),
                processStartNode, processEndNode );
    }

    private static boolean hasVisitedCountMark( long countValue )
    {
        return (countValue & COUNT_VISITED_MARK) != 0;
    }

    private static long markCountVisited( long countValue )
    {
        return countValue | COUNT_VISITED_MARK;
    }

    private static long unmarkCountVisited( long countValue )
    {
        return countValue & ~COUNT_VISITED_MARK;
    }

    CountsChecker checker( ConsistencyReporter reporter )
    {
        return new CountsChecker()
        {
            final RelationshipCounter relationshipCounter = instantiateRelationshipCounter();

            @Override
            public void visitNodeCount( int labelId, long count )
            {
                if ( isValidLabelId( labelId ) )
                {
                    long pos = labelIdArrayPos( labelId );
                    long expected = unmarkCountVisited( nodeCounts.get( pos ) );
                    if ( expected != count )
                    {
                        reporter.forCounts( new CountsEntry( nodeKey( labelId ), count ) ).inconsistentNodeCount( expected );
                    }
                    nodeCounts.set( pos, markCountVisited( expected ) );
                }
                else
                {
                    AtomicLong expected = nodeCountsStray.remove( nodeKey( labelId ) );
                    if ( expected != null )
                    {
                        if ( expected.longValue() != count )
                        {
                            reporter.forCounts( new CountsEntry( nodeKey( labelId ), count ) ).inconsistentNodeCount( expected.longValue() );
                        }
                    }
                    else
                    {
                        reporter.forCounts( new CountsEntry( nodeKey( labelId ), count ) ).inconsistentNodeCount( 0 );
                    }
                }
            }

            @Override
            public void visitRelationshipCount( int startLabelId, int relTypeId, int endLabelId, long count )
            {
                CountsKey countsKey = relationshipKey( startLabelId, relTypeId, endLabelId );
                if ( relationshipCounter.isValid( startLabelId, relTypeId, endLabelId ) )
                {
                    long expected = unmarkCountVisited( relationshipCounter.get( startLabelId, relTypeId, endLabelId ) );
                    if ( expected != count )
                    {
                        reporter.forCounts( new CountsEntry( countsKey, count ) ).inconsistentRelationshipCount( expected );
                    }
                    relationshipCounter.set( startLabelId, relTypeId, endLabelId, markCountVisited( expected ) );
                }
                else
                {
                    AtomicLong expected = relationshipCountsStray.remove( countsKey );
                    if ( expected != null )
                    {
                        if ( expected.longValue() != count )
                        {
                            reporter.forCounts( new CountsEntry( countsKey, count ) ).inconsistentRelationshipCount( expected.longValue() );
                        }
                    }
                    else
                    {
                        reporter.forCounts( new CountsEntry( countsKey, count ) ).inconsistentRelationshipCount( 0 );
                    }
                }
            }

            @Override
            public void close()
            {
                // Report counts that have been collected in this consistency check, but aren't in the existing store
                for ( int labelId = 0; labelId < highLabelId; labelId++ )
                {
                    long count = nodeCounts.get( labelId );
                    if ( !hasVisitedCountMark( count ) && count > 0 )
                    {
                        reporter.forCounts( new CountsEntry( nodeKey( labelId ), 0 ) ).inconsistentNodeCount( count );
                    }
                }
                for ( int start = ANY_LABEL; start < highLabelId; start++ )
                {
                    for ( int end = ANY_LABEL; end < highLabelId; end++ )
                    {
                        for ( int type = ANY_RELATIONSHIP_TYPE; type < highRelationshipTypeId; type++ )
                        {
                            if ( start == ANY_LABEL || end == ANY_LABEL ) // we only keep counts for where at least one of start/end is ANY
                            {
                                long count = relationshipCounter.get( start, type, end );
                                if ( !hasVisitedCountMark( count ) && count > 0 )
                                {
                                    reporter.forCounts( new CountsEntry( relationshipKey( start, type, end ), 0 ) ).inconsistentRelationshipCount( count );
                                }
                            }
                        }
                    }
                }

                nodeCountsStray.forEach( ( countsKey, count ) -> reporter.forCounts( new CountsEntry( countsKey, count.get() ) ) );
                relationshipCountsStray.forEach( ( countsKey, count ) -> reporter.forCounts( new CountsEntry( countsKey, count.get() ) ) );
            }
        };
    }

    /**
     * Valid label ids are [0,highLabelId) AND -1 (ANY_LABEL). -1 will be placed at highLabelId.
     */
    private long labelIdArrayPos( int labelId )
    {
        return labelId == ANY_LABEL ? highLabelId : labelId;
    }

    interface CountsChecker extends CountsVisitor, AutoCloseable
    {
        @Override
        void close();
    }
}
