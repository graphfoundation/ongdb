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
package org.neo4j.internal.batchimport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.BitSet;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.internal.batchimport.cache.NumberArrayFactories;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.RecordStore;
import org.neo4j.kernel.impl.store.RelationshipGroupStore;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.format.ForcedSecondaryUnitRecordFormats;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.of;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.GROUP_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.io.IOUtils.closeAllUnchecked;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.format.standard.Standard.LATEST_RECORD_FORMATS;
import static org.neo4j.kernel.impl.store.record.RecordLoad.CHECK;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
@ExtendWith( RandomExtension.class )
class RelationshipGroupDefragmenterTest
{
    private static final Configuration CONFIG = Configuration.DEFAULT;

    @Inject
    private TestDirectory testDirectory;
    @Inject
    private RecordDatabaseLayout databaseLayout;
    @Inject
    private RandomSupport random;

    private static Stream<Arguments> parameters()
    {
        return Stream.of(
            of( LATEST_RECORD_FORMATS, 1 ),
            of( new ForcedSecondaryUnitRecordFormats( LATEST_RECORD_FORMATS ), 2 )
        );
    }

    private StoreCursors storeCursors;
    private BatchingNeoStores stores;
    private JobScheduler jobScheduler;
    private int units;

    private void init( RecordFormats format, int units ) throws IOException
    {
        this.units = units;
        jobScheduler = new ThreadPoolJobScheduler();
        stores = BatchingNeoStores.batchingNeoStores( testDirectory.getFileSystem(), databaseLayout, format, CONFIG, NullLogService.getInstance(),
            AdditionalInitialIds.EMPTY, Config.defaults(), jobScheduler, PageCacheTracer.NULL, INSTANCE );
        stores.createNew();
        storeCursors = new CachedStoreCursors( stores.getNeoStores(), NULL );
    }

    @AfterEach
    void stop()
    {
        closeAllUnchecked( storeCursors, stores, jobScheduler );
    }

    @Test
    void tracePageCacheAccessOnDefragmentation() throws IOException
    {
        init( LATEST_RECORD_FORMATS, 1 );

        int nodeCount = 10;
        int relationshipTypeCount = 5;
        RecordStore<RelationshipGroupRecord> groupStore = stores.getTemporaryRelationshipGroupStore();
        prepareData( nodeCount, relationshipTypeCount, groupStore );
        var pageCacheTracer = new DefaultPageCacheTracer();
        defrag( nodeCount, groupStore, pageCacheTracer );

        assertThat( pageCacheTracer.pins() ).isEqualTo( 8 );
        assertThat( pageCacheTracer.unpins() ).isEqualTo( 8 );
        assertThat( pageCacheTracer.hits() ).isEqualTo( 8 );
    }

    @ParameterizedTest
    @MethodSource( "parameters" )
    void shouldDefragmentRelationshipGroupsWhenAllDense( RecordFormats format, int units ) throws IOException
    {
        init( format, units );
        // GIVEN some nodes which has their groups scattered
        int nodeCount = 100;
        int relationshipTypeCount = 50;
        RecordStore<RelationshipGroupRecord> groupStore = stores.getTemporaryRelationshipGroupStore();
        prepareData( nodeCount, relationshipTypeCount, groupStore );

        // WHEN
        defrag( nodeCount, groupStore );

        // THEN all groups should sit sequentially in the store
        verifyGroupsAreSequentiallyOrderedByNode();
    }

    @ParameterizedTest
    @MethodSource( "parameters" )
    void shouldDefragmentRelationshipGroupsWhenSomeDense( RecordFormats format, int units ) throws IOException
    {
        init( format, units );
        // GIVEN some nodes which has their groups scattered
        int nodeCount = 100;
        int relationshipTypeCount = 50;
        RecordStore<RelationshipGroupRecord> groupStore = stores.getTemporaryRelationshipGroupStore();
        RelationshipGroupRecord groupRecord = groupStore.newRecord();
        RecordStore<NodeRecord> nodeStore = stores.getNodeStore();
        NodeRecord nodeRecord = nodeStore.newRecord();
        long cursor = 0;
        BitSet initializedNodes = new BitSet();
        // note that group store is separate and not covered by store cursors here
        try ( var groupCursor = groupStore.openPageCursorForWriting( 0, NULL );
              var nodeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            for ( int typeId = relationshipTypeCount - 1; typeId >= 0; typeId-- )
            {
                for ( int nodeId = 0; nodeId < nodeCount; nodeId++, cursor++ )
                {
                    // Reasoning behind this thing is that we want to have roughly 10% of the nodes dense
                    // right from the beginning and then some stray dense nodes coming into this in the
                    // middle of the type range somewhere
                    double comparison = typeId == 0 || initializedNodes.get( nodeId ) ? 0.1 : 0.001;

                    if ( random.nextDouble() < comparison )
                    {
                        // next doesn't matter at all, as we're rewriting it anyway
                        // firstOut/In/Loop we could use in verification phase later
                        groupRecord.initialize( true, typeId, cursor, cursor + 1, cursor + 2, nodeId, 4 );
                        groupRecord.setId( groupStore.nextId( NULL ) );
                        groupStore.updateRecord( groupRecord, groupCursor, NULL, storeCursors );

                        if ( !initializedNodes.get( nodeId ) )
                        {
                            nodeRecord.initialize( true, -1, true, groupRecord.getId(), 0 );
                            nodeRecord.setId( nodeId );
                            nodeStore.updateRecord( nodeRecord, nodeCursor, NULL, storeCursors );
                            nodeStore.setHighestPossibleIdInUse( nodeId );
                            initializedNodes.set( nodeId );
                        }
                    }
                }
            }
        }

        // WHEN
        defrag( nodeCount, groupStore );

        // THEN all groups should sit sequentially in the store
        verifyGroupsAreSequentiallyOrderedByNode();
    }

    private void prepareData( int nodeCount, int relationshipTypeCount, RecordStore<RelationshipGroupRecord> groupStore )
    {
        RelationshipGroupRecord groupRecord = groupStore.newRecord();
        RecordStore<NodeRecord> nodeStore = stores.getNodeStore();
        NodeRecord nodeRecord = nodeStore.newRecord();
        long cursor = 0;
        // note that group store is separate and not covered by store cursors here
        try ( var groupCursor = groupStore.openPageCursorForWriting( 0, NULL );
              var nodeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            for ( int typeId = relationshipTypeCount - 1; typeId >= 0; typeId-- )
            {
                for ( long nodeId = 0; nodeId < nodeCount; nodeId++, cursor++ )
                {
                    // next doesn't matter at all, as we're rewriting it anyway
                    // firstOut/In/Loop we could use in verification phase later
                    groupRecord.initialize( true, typeId, cursor, cursor + 1, cursor + 2, nodeId, 4 );
                    groupRecord.setId( groupStore.nextId( NULL ) );
                    groupStore.updateRecord( groupRecord, groupCursor, NULL, storeCursors );

                    if ( typeId == 0 )
                    {
                        // first round also create the nodes
                        nodeRecord.initialize( true, -1, true, groupRecord.getId(), 0 );
                        nodeRecord.setId( nodeId );
                        nodeStore.updateRecord( nodeRecord, nodeCursor, NULL, storeCursors );
                        nodeStore.setHighestPossibleIdInUse( nodeId );
                    }
                }
            }
        }
    }

    private void defrag( int nodeCount, RecordStore<RelationshipGroupRecord> groupStore )
    {
        defrag( nodeCount, groupStore, PageCacheTracer.NULL );
    }

    private void defrag( int nodeCount, RecordStore<RelationshipGroupRecord> groupStore, PageCacheTracer pageCacheTracer )
    {
        RelationshipGroupDefragmenter.Monitor monitor = mock( RelationshipGroupDefragmenter.Monitor.class );
        RelationshipGroupDefragmenter defragmenter = new RelationshipGroupDefragmenter( CONFIG, ExecutionMonitor.INVISIBLE, monitor,
                                                                                        NumberArrayFactories.AUTO_WITHOUT_PAGECACHE, pageCacheTracer,
                                                                                        INSTANCE );

        // Calculation below correlates somewhat to calculation in RelationshipGroupDefragmenter.
        // Anyway we verify below that we exercise the multi-pass bit, which is what we want
        long memory = groupStore.getHighId() * 15 + 200;
        defragmenter.run( memory, stores, nodeCount );

        // Verify that we exercise the multi-pass functionality
        verify( monitor, atLeast( 2 ) ).defragmentingNodeRange( anyLong(), anyLong() );
        verify( monitor, atMost( 10 ) ).defragmentingNodeRange( anyLong(), anyLong() );
    }

    private void verifyGroupsAreSequentiallyOrderedByNode()
    {
        RelationshipGroupStore store = stores.getRelationshipGroupStore();
        long firstId = store.getNumberOfReservedLowIds();
        long groupCount = store.getHighId() - firstId;
        RelationshipGroupRecord groupRecord = store.newRecord();
        long highGroupId = store.getHighId();
        long currentNodeId = -1;
        int currentTypeId = -1;
        int newGroupCount = 0;
        int currentGroupLength = 0;
        for ( long id = firstId; id < highGroupId; id++, newGroupCount++ )
        {
            store.getRecordByCursor( id, groupRecord, CHECK, storeCursors.readCursor( GROUP_CURSOR ) );
            if ( !groupRecord.inUse() )
            {
                // This will be the case if we have double record units, just assert that fact
                assertTrue( units > 1 );
                assertTrue( currentGroupLength > 0 );
                currentGroupLength--;
                continue;
            }

            long nodeId = groupRecord.getOwningNode();
            assertTrue(
                nodeId >= currentNodeId, "Expected a group for node >= " + currentNodeId + ", but was " + nodeId + " in " + groupRecord );
            if ( nodeId != currentNodeId )
            {
                currentNodeId = nodeId;
                currentTypeId = -1;
                if ( units > 1 )
                {
                    assertEquals( 0, currentGroupLength );
                }
                currentGroupLength = 0;
            }
            currentGroupLength++;

            assertTrue(
                groupRecord.getNext() == groupRecord.getId() + 1 ||
                    groupRecord.getNext() == Record.NO_NEXT_RELATIONSHIP.intValue(), "Expected this group to have a next of current + " + units + " OR NULL, " +
                    "but was " + groupRecord );
            assertTrue(
                groupRecord.getType() > currentTypeId, "Expected " + groupRecord + " to have type > " + currentTypeId );
            currentTypeId = groupRecord.getType();
        }
        assertEquals( groupCount, newGroupCount );
    }
}
