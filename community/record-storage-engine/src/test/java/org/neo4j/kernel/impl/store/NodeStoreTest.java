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
package org.neo4j.kernel.impl.store;

import org.apache.commons.lang3.mutable.MutableBoolean;
import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.set.mutable.primitive.LongHashSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.LongSupplier;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.id.IdSlotDistribution;
import org.neo4j.internal.id.IdType;
import org.neo4j.internal.id.indexed.IndexedIdGenerator;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.allocator.ReusableRecordsAllocator;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.util.IdUpdateListener;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;

import static java.util.Arrays.asList;
import static org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_LABEL_STORE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.DynamicArrayStore.allocateFromNumbers;
import static org.neo4j.kernel.impl.store.NodeStore.readOwnerFromDynamicLabelsRecord;
import static org.neo4j.kernel.impl.store.record.Record.NO_LABELS_FIELD;
import static org.neo4j.kernel.impl.store.record.Record.NO_NEXT_PROPERTY;
import static org.neo4j.kernel.impl.store.record.Record.NO_NEXT_RELATIONSHIP;
import static org.neo4j.kernel.impl.store.record.Record.NULL_REFERENCE;
import static org.neo4j.kernel.impl.store.record.RecordLoad.NORMAL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@EphemeralNeo4jLayoutExtension
class NodeStoreTest
{
    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension();
    @Inject
    private EphemeralFileSystemAbstraction fs;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    private NodeStore nodeStore;
    private NeoStores neoStores;
    private PageCache pageCache;
    private CachedStoreCursors storeCursors;

    @AfterEach
    void tearDown()
    {
        if ( storeCursors != null )
        {
            storeCursors.close();
        }
        if ( neoStores != null )
        {
            neoStores.close();
        }
        if ( pageCache != null )
        {
            pageCache.close();
        }
    }

    @Test
    void shouldReadFirstFromSingleRecordDynamicLongArray()
    {
        // GIVEN
        Long expectedId = 12L;
        long[] ids = new long[]{expectedId, 23L, 42L};
        DynamicRecord firstRecord = new DynamicRecord( 0L );
        allocateFromNumbers( new ArrayList<>(), ids, new ReusableRecordsAllocator( 60, firstRecord ), NULL, INSTANCE );

        // WHEN
        Long firstId = readOwnerFromDynamicLabelsRecord( firstRecord );

        // THEN
        assertEquals( expectedId, firstId );
    }

    @Test
    void shouldReadFirstAsNullFromEmptyDynamicLongArray()
    {
        // GIVEN
        Long expectedId = null;
        long[] ids = new long[]{};
        DynamicRecord firstRecord = new DynamicRecord( 0L );
        allocateFromNumbers( new ArrayList<>(), ids, new ReusableRecordsAllocator( 60, firstRecord ), NULL, INSTANCE );

        // WHEN
        Long firstId = readOwnerFromDynamicLabelsRecord( firstRecord );

        // THEN
        assertEquals( expectedId, firstId );
    }

    @Test
    void shouldReadFirstFromTwoRecordDynamicLongArray()
    {
        // GIVEN
        Long expectedId = 12L;
        long[] ids = new long[]{expectedId, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L};
        DynamicRecord firstRecord = new DynamicRecord( 0L );
        allocateFromNumbers( new ArrayList<>(), ids,
                new ReusableRecordsAllocator( 8, firstRecord, new DynamicRecord( 1L ) ), NULL, INSTANCE );

        // WHEN
        Long firstId = readOwnerFromDynamicLabelsRecord( firstRecord );

        // THEN
        assertEquals( expectedId, firstId );
    }

    @Test
    void shouldCombineProperFiveByteLabelField()
    {
        // GIVEN
        // -- a store
        nodeStore = newNodeStore( fs );

        // -- a record with the msb carrying a negative value
        long nodeId = 0;
        long labels = 0x8000000001L;
        NodeRecord record = new NodeRecord( nodeId ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, NO_NEXT_RELATIONSHIP.intValue(), 0 );
        record.setInUse( true );
        record.setLabelField( labels, Collections.emptyList() );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // WHEN
        // -- reading that record back
        NodeRecord readRecord = nodeStore.getRecordByCursor( nodeId, nodeStore.newRecord(), NORMAL, storeCursors.readCursor( NODE_CURSOR ) );
        // THEN
        // -- the label field must be the same
        assertEquals( labels, readRecord.getLabelField() );
    }

    @Test
    void shouldKeepRecordLightWhenSettingLabelFieldWithoutDynamicRecords()
    {
        // GIVEN
        NodeRecord record = new NodeRecord( 0 ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, NO_NEXT_RELATIONSHIP.intValue(), 0 );

        // WHEN
        record.setLabelField( 0, Collections.emptyList() );

        // THEN
        assertTrue( record.isLight() );
    }

    @Test
    void shouldMarkRecordHeavyWhenSettingLabelFieldWithDynamicRecords()
    {
        // GIVEN
        NodeRecord record = new NodeRecord( 0 ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, NO_NEXT_RELATIONSHIP.intValue(), 0 );

        // WHEN
        DynamicRecord dynamicRecord = new DynamicRecord( 1 );
        record.setLabelField( 0x8000000001L, asList( dynamicRecord ) );

        // THEN
        assertFalse( record.isLight() );
    }

    @Test
    void shouldTellNodeInUse()
    {
        // Given
        NodeStore store = newNodeStore( fs );

        long exists = store.nextId( NULL );
        long deleted = store.nextId( NULL );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            store.updateRecord( new NodeRecord( exists ).initialize( true, 20, false, 10, 0 ), storeCursor, NULL, storeCursors );

            store.updateRecord( new NodeRecord( deleted ).initialize( true, 20, false, 10, 0 ), storeCursor, NULL, storeCursors );
            store.updateRecord( new NodeRecord( deleted ).initialize( false, 20, false, 10, 0 ), storeCursor, NULL, storeCursors );
        }
        // When & then
        assertTrue( store.isInUse( exists, storeCursors.readCursor( NODE_CURSOR ) ) );
        assertFalse( store.isInUse( deleted, storeCursors.readCursor( NODE_CURSOR ) ) );
        assertFalse( store.isInUse( nodeStore.recordFormat.getMaxId(), storeCursors.readCursor( NODE_CURSOR ) ) );
    }

    @Test
    void scanningRecordsShouldVisitEachInUseRecordOnce() throws IOException
    {
        // GIVEN we have a NodeStore with data that spans several pages...
        nodeStore = newNodeStore( fs );

        ThreadLocalRandom rng = ThreadLocalRandom.current();
        final MutableLongSet nextRelSet = new LongHashSet();
        for ( int i = 0; i < 10_000; i++ )
        {
            // Enough records to span several pages
            int nextRelCandidate = rng.nextInt( 0, Integer.MAX_VALUE );
            if ( nextRelSet.add( nextRelCandidate ) )
            {
                long nodeId = nodeStore.nextId( NULL );
                NodeRecord record = new NodeRecord( nodeId ).initialize( true, 20, false, nextRelCandidate, 0 );
                try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
                {
                    nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
                }
                if ( rng.nextInt( 0, 10 ) < 3 )
                {
                    nextRelSet.remove( nextRelCandidate );
                    record.setInUse( false );
                    try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
                    {
                        nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
                    }
                }
            }
        }

        // ...WHEN we now have an interesting set of node records, and we
        // visit each and remove that node from our nextRelSet...

        Visitor<NodeRecord, IOException> scanner = record ->
        {
            // ...THEN we should observe that no nextRel is ever removed twice...
            assertTrue( nextRelSet.remove( record.getNextRel() ) );
            return false;
        };
        nodeStore.scanAllRecords( scanner, storeCursors.readCursor( NODE_CURSOR ) );

        // ...NOR do we have anything left in the set afterwards.
        assertTrue( nextRelSet.isEmpty() );
    }

    @Test
    void shouldCloseStoreFileOnFailureToOpen()
    {
        // GIVEN
        final MutableBoolean fired = new MutableBoolean();

        // WHEN
        Exception exception = assertThrows( Exception.class, () ->
        {
            try ( PageCache pageCache = pageCacheExtension.getPageCache( fs ) )
            {
                PageCache customPageCache = new DelegatingPageCache( pageCache )
                {
                    @Override
                    public PagedFile map( Path path, int pageSize, String databaseName,
                            ImmutableSet<OpenOption> openOptions, IOController ioController ) throws IOException
                    {
                        if ( path.getFileName().toString().toLowerCase().endsWith( ".id" ) )
                        {
                            fired.setTrue();
                            throw new IOException( "Proving a point here" );
                        }
                        return super.map( path, pageSize, databaseName, openOptions, ioController );
                    }
                };

                newNodeStore( fs, customPageCache );
            }
        } );
        assertTrue( indexOfThrowable( exception, IOException.class ) != -1 );
        assertTrue( fired.booleanValue() );
    }

    @Test
    void shouldFreeSecondaryUnitIdOfDeletedRecord()
    {
        // GIVEN
        nodeStore = newNodeStore( fs );
        NodeRecord record = new NodeRecord( 5L );
        record.setSecondaryUnitIdOnLoad( 10L );
        record.setInUse( true );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }
        nodeStore.setHighestPossibleIdInUse( 10L );

        // WHEN
        record.setInUse( false );
        IdUpdateListener idUpdateListener = mock( IdUpdateListener.class );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, idUpdateListener, storeCursor, NULL, storeCursors );
        }

        // THEN
        verify( idUpdateListener ).markIdAsUnused( any(), eq( 5L ), eq( 1 ), any( CursorContext.class ) );
        verify( idUpdateListener ).markIdAsUnused( any(), eq( 10L ), eq( 1 ), any( CursorContext.class ) );
    }

    @Test
    void shouldFreeSecondaryUnitIdOfShrunkRecord()
    {
        // GIVEN
        nodeStore = newNodeStore( fs );
        NodeRecord record = new NodeRecord( 5L );
        record.setSecondaryUnitIdOnLoad( 10L );
        record.setInUse( true );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }
        nodeStore.setHighestPossibleIdInUse( 10L );

        // WHEN
        record.setRequiresSecondaryUnit( false );
        IdUpdateListener idUpdateListener = mock( IdUpdateListener.class );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, idUpdateListener, storeCursor, NULL, storeCursors );
        }

        // THEN
        verify( idUpdateListener, never() ).markIdAsUnused( any(), eq( 5L ), eq( 1 ), any( CursorContext.class ) );
        verify( idUpdateListener ).markIdAsUnused( any(), eq( 10L ), eq( 1 ), any( CursorContext.class ) );
    }

    @Test
    void shouldMarkSecondaryUnitAsUsedOnCreatedAsBigRecord()
    {
        // given
        long primaryUnitId = 5L;
        long secondaryUnitId = 10L;
        nodeStore = newNodeStore( fs );
        NodeRecord record = new NodeRecord( primaryUnitId );
        record.setSecondaryUnitIdOnCreate( secondaryUnitId );
        record.setInUse( true );
        record.setCreated();

        // when
        IdUpdateListener idUpdateListener = mock( IdUpdateListener.class );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, idUpdateListener, storeCursor, NULL, storeCursors );
        }

        // then
        verify( idUpdateListener ).markIdAsUsed( any(), eq( primaryUnitId ), eq( 1 ), any( CursorContext.class ) );
        verify( idUpdateListener ).markIdAsUsed( any(), eq( secondaryUnitId ), eq( 1 ), any( CursorContext.class ) );
    }

    @Test
    void shouldMarkSecondaryUnitAsUsedOnGrowing()
    {
        // given
        long primaryUnitId = 5L;
        long secondaryUnitId = 10L;
        nodeStore = newNodeStore( fs );
        NodeRecord record = new NodeRecord( primaryUnitId );
        record.setInUse( true );
        record.setCreated();
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // when
        nodeStore.getRecordByCursor( primaryUnitId, record, NORMAL, storeCursors.readCursor( NODE_CURSOR ) );
        record.setSecondaryUnitIdOnCreate( secondaryUnitId );
        IdUpdateListener idUpdateListener = mock( IdUpdateListener.class );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, idUpdateListener, storeCursor, NULL, storeCursors );
        }

        // then
        verify( idUpdateListener, never() ).markIdAsUsed( any(), eq( primaryUnitId ), eq( 1 ), any( CursorContext.class ) );
        verify( idUpdateListener ).markIdAsUsed( any(), eq( secondaryUnitId ), eq( 1 ), any( CursorContext.class ) );
    }

    @Test
    public void shouldIncludeNodeRecordInExceptionLoadingDynamicLabelRecords()
    {
        // given a node with reference to a dynamic label record
        nodeStore = newNodeStore( fs );
        NodeRecord record = new NodeRecord( 5L ).initialize( true, NULL_REFERENCE.longValue(), false, 1234, NO_LABELS_FIELD.longValue() );
        NodeLabels labels = NodeLabelsField.parseLabelsField( record );
        DynamicArrayStore dynamicLabelStore = nodeStore.getDynamicLabelStore();
        labels.put( new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nodeStore, dynamicLabelStore, NULL, storeCursors, INSTANCE );
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // ... and where e.g. the dynamic label record is unused
        try ( var dynamicCursor = storeCursors.writeCursor( DYNAMIC_LABEL_STORE_CURSOR ) )
        {
            for ( DynamicRecord dynamicLabelRecord : record.getDynamicLabelRecords() )
            {
                dynamicLabelRecord.setInUse( false );
                dynamicLabelStore.updateRecord( dynamicLabelRecord, dynamicCursor, NULL, storeCursors );
            }
        }

        // when loading that node and making it heavy
        NodeRecord loadedRecord = nodeStore.newRecord();
        nodeStore.getRecordByCursor( record.getId(), loadedRecord, NORMAL, storeCursors.readCursor( NODE_CURSOR ) );
        InvalidRecordException e = assertThrows( InvalidRecordException.class, () -> nodeStore.ensureHeavy( loadedRecord, storeCursors ) );

        // then
        assertThat( e.getMessage(), containsString( loadedRecord.toString() ) );
    }

    private NodeStore newNodeStore( FileSystemAbstraction fs )
    {
        pageCache = pageCacheExtension.getPageCache( fs );
        return newNodeStore( fs, pageCache );
    }

    private NodeStore newNodeStore( FileSystemAbstraction fs, PageCache pageCache )
    {
        IdGeneratorFactory idGeneratorFactory = spy( new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() )
        {
            @Override
            protected IndexedIdGenerator instantiate( FileSystemAbstraction fs, PageCache pageCache, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector,
                    Path fileName, LongSupplier highIdSupplier, long maxValue, IdType idType, DatabaseReadOnlyChecker readOnlyChecker, Config config,
                    CursorContext cursorContext, String databaseName, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution )
            {
                return spy( super.instantiate( fs, pageCache, recoveryCleanupWorkCollector, fileName, highIdSupplier, maxValue, idType, readOnlyChecker, config,
                        cursorContext, databaseName, openOptions, slotDistribution ) );
            }
        } );
        StoreFactory factory = new StoreFactory( databaseLayout, Config.defaults(), idGeneratorFactory, pageCache, fs, NullLogProvider.getInstance(),
                PageCacheTracer.NULL, writable() );
        neoStores = factory.openAllNeoStores( true );
        storeCursors = new CachedStoreCursors( neoStores, NULL );
        nodeStore = neoStores.getNodeStore();
        return nodeStore;
    }
}
