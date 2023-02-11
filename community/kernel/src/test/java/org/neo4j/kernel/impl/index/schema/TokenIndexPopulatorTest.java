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
package org.neo4j.kernel.impl.index.schema;

import org.eclipse.collections.api.map.primitive.MutableLongObjectMap;
import org.eclipse.collections.impl.factory.primitive.LongObjectMaps;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.CommonDatabaseFile;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.TokenIndexEntryUpdate;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.collection.PrimitiveLongCollections.EMPTY_LONG_ARRAY;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forAnyEntityTokens;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.api.index.PhaseTracker.nullInstance;

class TokenIndexPopulatorTest extends IndexPopulatorTests<TokenScanKey,TokenScanValue,TokenScanLayout>
{
    @Override
    IndexFiles createIndexFiles( FileSystemAbstraction fs, TestDirectory directory, IndexDescriptor indexDescriptor )
    {
        return new IndexFiles.SingleFile( fs, directory.homePath().resolve( CommonDatabaseFile.LABEL_SCAN_STORE.getName() ) );
    }

    @Override
    IndexDescriptor indexDescriptor()
    {
        return forSchema( forAnyEntityTokens( EntityType.NODE ), TokenIndexProvider.DESCRIPTOR ).withName( "index" ).materialise( 0 );
    }

    @Override
    TokenScanLayout layout()
    {
        return new TokenScanLayout();
    }

    @Override
    byte failureByte()
    {
        return TokenIndex.FAILED;
    }

    @Override
    byte populatingByte()
    {
        return TokenIndex.POPULATING;
    }

    @Override
    byte onlineByte()
    {
        return TokenIndex.ONLINE;
    }

    @Override
    TokenIndexPopulator createPopulator( PageCache pageCache )
    {
        return createPopulator( pageCache, new Monitors(), "" );
    }

    private TokenIndexPopulator createPopulator( PageCache pageCache, Monitors monitors, String monitorTag )
    {
        DatabaseIndexContext context =
                DatabaseIndexContext.builder( pageCache, fs, DEFAULT_DATABASE_NAME ).withMonitors( monitors ).withTag( monitorTag ).withReadOnlyChecker(
                        writable() ).build();
        return new TokenIndexPopulator( context, DatabaseLayout.ofFlat( directory.homePath() ), indexFiles, Config.defaults(), indexDescriptor );
    }

    @Test
    void addShouldApplyAllUpdatesOnce() throws Exception
    {
        // Give
        MutableLongObjectMap<long[]> entityTokens = LongObjectMaps.mutable.empty();

        populator.create();

        List<TokenIndexEntryUpdate<?>> updates = TokenIndexUtility.generateSomeRandomUpdates( entityTokens, random );
        // Add updates to populator
        populator.add( updates, NULL );

        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );

        TokenIndexUtility.verifyUpdates( entityTokens, layout, this::getTree );
    }

    @Test
    void updaterShouldApplyUpdates() throws Exception
    {
        // Give
        MutableLongObjectMap<long[]> entityTokens = LongObjectMaps.mutable.empty();

        populator.create();

        List<TokenIndexEntryUpdate<?>> updates = TokenIndexUtility.generateSomeRandomUpdates( entityTokens, random );

        try ( IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL ) )
        {
            for ( TokenIndexEntryUpdate<?> update : updates )
            {
                updater.process( update );
            }
        }

        // then
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );
        TokenIndexUtility.verifyUpdates( entityTokens, layout, this::getTree );
    }

    @Test
    void updaterMustThrowIfProcessAfterClose() throws Exception
    {
        // given
        populator.create();
        IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL );

        // when
        updater.close();

        IllegalStateException e = assertThrows( IllegalStateException.class,
                () -> updater
                        .process( IndexEntryUpdate.change( random.nextInt(), null, EMPTY_LONG_ARRAY, TokenIndexUtility.generateRandomTokens( random ) ) ) );
        assertThat( e ).hasMessageContaining( "Updater has been closed" );
        populator.close( true, NULL );
    }

    @Test
    void shouldHandleInterleavedRandomizedUpdates() throws IndexEntryConflictException, IOException
    {
        // Give
        int numberOfEntities = 1_000;
        long currentScanId = 0;
        MutableLongObjectMap<long[]> entityTokens = LongObjectMaps.mutable.empty();

        populator.create();

        while ( currentScanId < numberOfEntities )
        {
            // Collect a batch of max 100 updates from scan
            List<TokenIndexEntryUpdate<?>> updates = new ArrayList<>();
            for ( int i = 0; i < 100 && currentScanId < numberOfEntities; i++ )
            {
                TokenIndexUtility.generateRandomUpdate( currentScanId, entityTokens, updates, random );

                // Advance scan
                currentScanId++;
            }
            // Add updates to populator
            populator.add( updates, NULL );

            // Interleave external updates in id range lower than currentScanId
            try ( IndexUpdater updater = populator.newPopulatingUpdater( NodePropertyAccessor.EMPTY, NULL ) )
            {
                for ( int i = 0; i < 100; i++ )
                {
                    long entityId = random.nextLong( currentScanId );
                    // Current tokens for the entity in the tree
                    long[] beforeTokens = entityTokens.get( entityId );
                    if ( beforeTokens == null )
                    {
                        beforeTokens = EMPTY_LONG_ARRAY;
                    }
                    long[] afterTokens = TokenIndexUtility.generateRandomTokens( random );
                    entityTokens.put( entityId, Arrays.copyOf( afterTokens, afterTokens.length ) );
                    updater.process( IndexEntryUpdate.change( entityId, null, beforeTokens, afterTokens ) );
                }
            }
        }

        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );

        TokenIndexUtility.verifyUpdates( entityTokens, layout, this::getTree );
    }

    @Test
    void shouldRelayMonitorCallsToRegisteredGBPTreeMonitorWithoutTag() throws IOException
    {
        // Given
        AtomicBoolean checkpointCompletedCall = new AtomicBoolean();
        Monitors monitors = new Monitors();
        monitors.addMonitorListener( getCheckpointCompletedListener( checkpointCompletedCall ) );
        populator = createPopulator( pageCache, monitors, "tag" );

        // When
        populator.create();
        populator.close( true, NULL );

        // Then
        assertTrue( checkpointCompletedCall.get() );
    }

    @Test
    void shouldNotRelayMonitorCallsToRegisteredGBPTreeMonitorWithDifferentTag() throws IOException
    {
        // Given
        AtomicBoolean checkpointCompletedCall = new AtomicBoolean();
        Monitors monitors = new Monitors();
        monitors.addMonitorListener( getCheckpointCompletedListener( checkpointCompletedCall ), "differentTag" );
        populator = createPopulator( pageCache, monitors, "tag" );

        // When
        populator.create();
        populator.close( true, NULL );

        // Then
        assertFalse( checkpointCompletedCall.get() );
    }

    @Test
    void shouldRelayMonitorCallsToRegisteredGBPTreeMonitorWithTag() throws IOException
    {
        // Given
        AtomicBoolean checkpointCompletedCall = new AtomicBoolean();
        Monitors monitors = new Monitors();
        monitors.addMonitorListener( getCheckpointCompletedListener( checkpointCompletedCall ), "tag" );
        populator = createPopulator( pageCache, monitors, "tag" );

        // When
        populator.create();
        populator.close( true, NULL );

        // Then
        assertTrue( checkpointCompletedCall.get() );
    }

    private static GBPTree.Monitor.Adaptor getCheckpointCompletedListener( AtomicBoolean checkpointCompletedCall )
    {
        return new GBPTree.Monitor.Adaptor()
        {
            @Override
            public void checkpointCompleted()
            {
                checkpointCompletedCall.set( true );
            }
        };
    }
}
