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
package org.neo4j.internal.counts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.counts.CountsAccessor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.counts.GBPTreeCountsStore.NO_MONITOR;
import static org.neo4j.internal.counts.GBPTreeCountsStore.keyToString;
import static org.neo4j.internal.counts.GBPTreeCountsStore.nodeKey;
import static org.neo4j.internal.counts.GBPTreeCountsStore.relationshipKey;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.storageengine.api.TransactionIdStore.BASE_TX_ID;

@PageCacheExtension
class GBPTreeCountsStoreTest
{
    private static final int LABEL_ID_1 = 1;
    private static final int LABEL_ID_2 = 2;
    private static final int RELATIONSHIP_TYPE_ID_1 = 1;
    private static final int RELATIONSHIP_TYPE_ID_2 = 2;

    @Inject
    private TestDirectory directory;

    @Inject
    private PageCache pageCache;

    @Inject
    private FileSystemAbstraction fs;

    private GBPTreeCountsStore countsStore;

    @BeforeEach
    void openCountsStore() throws Exception
    {
        openCountsStore( CountsBuilder.EMPTY );
    }

    @AfterEach
    void closeCountsStore()
    {
        countsStore.close();
    }

    @Test
    void shouldUpdateAndReadSomeCounts() throws IOException
    {
        // given
        long txId = BASE_TX_ID;
        try ( CountsAccessor.Updater updater = countsStore.apply( ++txId, NULL ) )
        {
            updater.incrementNodeCount( LABEL_ID_1, 10 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, 3 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2, 7 );
        }
        try ( CountsAccessor.Updater updater = countsStore.apply( ++txId, NULL ) )
        {
            updater.incrementNodeCount( LABEL_ID_1, 5 ); // now at 15
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, 2 ); // now at 5
        }

        countsStore.checkpoint( NULL );

        // when/then
        assertEquals( 15, countsStore.nodeCount( LABEL_ID_1, NULL ) );
        assertEquals( 5, countsStore.relationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, NULL ) );
        assertEquals( 7, countsStore.relationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2, NULL ) );

        // and when
        try ( CountsAccessor.Updater updater = countsStore.apply( ++txId, NULL ) )
        {
            updater.incrementNodeCount( LABEL_ID_1, -7 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, -5 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2, -2 );
        }

        // then
        assertEquals( 8, countsStore.nodeCount( LABEL_ID_1, NULL ) );
        assertEquals( 0, countsStore.relationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, NULL ) );
        assertEquals( 5, countsStore.relationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2, NULL ) );
    }

    @Test
    void shouldUseCountsBuilderOnCreation() throws Exception
    {
        // given
        long rebuiltAtTransactionId = 5;
        int labelId = 3;
        int labelId2 = 6;
        int relationshipTypeId = 7;
        closeCountsStore();
        deleteCountsStore();

        // when
        TestableCountsBuilder builder = new TestableCountsBuilder( rebuiltAtTransactionId )
        {
            @Override
            public void initialize( CountsAccessor.Updater updater, CursorContext cursorContext, MemoryTracker memoryTracker )
            {
                super.initialize( updater, cursorContext, memoryTracker );
                updater.incrementNodeCount( labelId, 10 );
                updater.incrementRelationshipCount( labelId, relationshipTypeId, labelId2, 14 );
            }
        };
        openCountsStore( builder );
        assertTrue( builder.lastCommittedTxIdCalled );
        assertTrue( builder.initializeCalled );
        assertEquals( 10, countsStore.nodeCount( labelId, NULL ) );
        assertEquals( 0, countsStore.nodeCount( labelId2, NULL ) );
        assertEquals( 14, countsStore.relationshipCount( labelId, relationshipTypeId, labelId2, NULL ) );

        // and when
        checkpointAndRestartCountsStore();
        // Re-applying a txId below or equal to the "rebuild transaction id" should not apply it
        incrementNodeCount( rebuiltAtTransactionId - 1, labelId, 100 );
        assertEquals( 10, countsStore.nodeCount( labelId, NULL ) );
        incrementNodeCount( rebuiltAtTransactionId, labelId, 100 );
        assertEquals( 10, countsStore.nodeCount( labelId, NULL ) );

        // then
        incrementNodeCount( rebuiltAtTransactionId + 1, labelId, 100 );
        assertEquals( 110, countsStore.nodeCount( labelId, NULL ) );
    }

    @Test
    void shouldDumpCountsStore() throws IOException
    {
        // given
        long txId = BASE_TX_ID + 1;
        try ( CountsAccessor.Updater updater = countsStore.apply( txId, NULL ) )
        {
            updater.incrementNodeCount( LABEL_ID_1, 10 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2, 3 );
            updater.incrementRelationshipCount( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2, 7 );
        }
        countsStore.checkpoint( NULL );
        closeCountsStore();

        // when
        ByteArrayOutputStream out = new ByteArrayOutputStream( 1024 );
        GBPTreeCountsStore.dump( pageCache, countsStoreFile(), new PrintStream( out ), NULL );

        // then
        String dump = out.toString();
        assertThat( dump ).contains( keyToString( nodeKey( LABEL_ID_1 ) ) + " = 10" );
        assertThat( dump ).contains( keyToString( relationshipKey( LABEL_ID_1, RELATIONSHIP_TYPE_ID_1, LABEL_ID_2 ) ) + " = 3" );
        assertThat( dump ).contains( keyToString( relationshipKey( LABEL_ID_1, RELATIONSHIP_TYPE_ID_2, LABEL_ID_2 ) ) + " = 7" );
        assertThat( dump ).contains( "Highest gap-free txId: " + txId );
    }

    private void incrementNodeCount( long txId, int labelId, int delta )
    {
        try ( CountsAccessor.Updater updater = countsStore.apply( txId, NULL ) )
        {
            updater.incrementNodeCount( labelId, delta );
        }
    }

    private void checkpointAndRestartCountsStore() throws Exception
    {
        countsStore.checkpoint( NULL );
        closeCountsStore();
        openCountsStore();
    }

    private void deleteCountsStore() throws IOException
    {
        directory.getFileSystem().deleteFile( countsStoreFile() );
    }

    private Path countsStoreFile()
    {
        return directory.file( "counts.db" );
    }

    private void openCountsStore( CountsBuilder builder ) throws IOException
    {
        instantiateCountsStore( builder, writable(), NO_MONITOR );
        countsStore.start( NULL, StoreCursors.NULL, INSTANCE );
    }

    private void instantiateCountsStore( CountsBuilder builder, DatabaseReadOnlyChecker readOnlyChecker, GBPTreeCountsStore.Monitor monitor ) throws IOException
    {
        countsStore = new GBPTreeCountsStore( pageCache, countsStoreFile(), fs, immediate(), builder, readOnlyChecker, PageCacheTracer.NULL, monitor,
                DEFAULT_DATABASE_NAME, 10, NullLogProvider.getInstance() );
    }

    private static class TestableCountsBuilder implements CountsBuilder
    {
        private final long rebuiltAtTransactionId;
        boolean lastCommittedTxIdCalled;
        boolean initializeCalled;

        TestableCountsBuilder( long rebuiltAtTransactionId )
        {
            this.rebuiltAtTransactionId = rebuiltAtTransactionId;
        }

        @Override
        public void initialize( CountsAccessor.Updater updater, CursorContext cursorContext, MemoryTracker memoryTracker )
        {
            initializeCalled = true;
        }

        @Override
        public long lastCommittedTxId()
        {
            lastCommittedTxIdCalled = true;
            return rebuiltAtTransactionId;
        }
    }
}
