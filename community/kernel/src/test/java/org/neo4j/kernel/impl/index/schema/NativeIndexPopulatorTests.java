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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexDirectoryStructure;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.Values;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.api.index.IndexDirectoryStructure.directoriesByProvider;
import static org.neo4j.kernel.impl.api.index.PhaseTracker.nullInstance;
import static org.neo4j.kernel.impl.index.schema.NativeIndexPopulator.BYTE_FAILED;
import static org.neo4j.kernel.impl.index.schema.NativeIndexPopulator.BYTE_ONLINE;
import static org.neo4j.kernel.impl.index.schema.NativeIndexPopulator.BYTE_POPULATING;

abstract class NativeIndexPopulatorTests<KEY extends NativeIndexKey<KEY>>
        extends IndexPopulatorTests<KEY,NullValue,IndexLayout<KEY>>
{
    private static final int LARGE_AMOUNT_OF_UPDATES = 1_000;
    NativeValueIndexUtility<KEY> valueUtil;
    ValueCreatorUtil<KEY> valueCreatorUtil;

    @BeforeEach
    void setupValueCreator()
    {
        valueCreatorUtil = createValueCreatorUtil();
        valueUtil = new NativeValueIndexUtility<>( valueCreatorUtil, layout );
    }

    @Override
    IndexFiles createIndexFiles( FileSystemAbstraction fs, TestDirectory directory, IndexDescriptor indexDescriptor )
    {
        IndexDirectoryStructure indexDirectoryStructure =
                directoriesByProvider( directory.directory( "root" ) ).forProvider( indexDescriptor.getIndexProvider() );
        return new IndexFiles.Directory( fs, indexDirectoryStructure, indexDescriptor.getId() );
    }

    byte failureByte()
    {
        return BYTE_FAILED;
    }

    byte populatingByte()
    {
        return BYTE_POPULATING;
    }

    byte onlineByte()
    {
        return BYTE_ONLINE;
    }

    abstract ValueCreatorUtil<KEY> createValueCreatorUtil();

    @Test
    void dropShouldDeleteExistingDirectory() throws IOException
    {
        // given
        populator.create();

        // when
        assertTrue( fs.fileExists( indexFiles.getBase() ) );
        populator.drop();

        // then
        assertFalse( fs.fileExists( indexFiles.getBase() ), "expected drop to delete index base" );
    }

    @Test
    void addShouldApplyAllUpdatesOnce() throws Exception
    {
        // given
        populator.create();
        ValueIndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdates( random );

        // when
        populator.add( asList( updates ), NULL );
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );

        // then
        populator.close( true, NULL );
        valueUtil.verifyUpdates( updates, this::getTree );
    }

    @Test
    void updaterShouldApplyUpdates() throws Exception
    {
        // given
        populator.create();
        ValueIndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdates( random );
        try ( IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL ) )
        {
            // when
            for ( ValueIndexEntryUpdate<IndexDescriptor> update : updates )
            {
                updater.process( update );
            }
        }

        // then
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );
        valueUtil.verifyUpdates( updates, this::getTree );
    }

    @Test
    void updaterMustThrowIfProcessAfterClose() throws Exception
    {
        // given
        populator.create();
        IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL );

        // when
        updater.close();

        assertThrows( IllegalStateException.class, () -> updater.process( valueCreatorUtil.add( 1, Values.of( Long.MAX_VALUE ) ) ) );
        populator.close( true, NULL );
    }

    @Test
    void shouldApplyInterleavedUpdatesFromAddAndUpdater() throws Exception
    {
        // given
        populator.create();
        ValueIndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdates( random );

        // when
        applyInterleaved( updates, populator );

        // then
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );
        valueUtil.verifyUpdates( updates, this::getTree );
    }

    @Test
    void shouldApplyLargeAmountOfInterleavedRandomUpdates() throws Exception
    {
        // given
        populator.create();
        random.reset();
        Random updaterRandom = new Random( random.seed() );
        Iterator<ValueIndexEntryUpdate<IndexDescriptor>> updates = valueCreatorUtil.randomUpdateGenerator( random );

        // when
        int count = interleaveLargeAmountOfUpdates( updaterRandom, updates );

        // then
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        populator.close( true, NULL );
        random.reset();
        verifyUpdates( valueCreatorUtil.randomUpdateGenerator( random ), count );
    }

    private void verifyUpdates( Iterator<ValueIndexEntryUpdate<IndexDescriptor>> indexEntryUpdateIterator, int count )
            throws IOException
    {
        @SuppressWarnings( "unchecked" )
        ValueIndexEntryUpdate<IndexDescriptor>[] updates = new ValueIndexEntryUpdate[count];
        for ( int i = 0; i < count; i++ )
        {
            updates[i] = indexEntryUpdateIterator.next();
        }
        valueUtil.verifyUpdates( updates, this::getTree );
    }

    void applyInterleaved( IndexEntryUpdate<IndexDescriptor>[] updates, IndexPopulator populator )
            throws IndexEntryConflictException
    {
        boolean useUpdater = true;
        Collection<IndexEntryUpdate<IndexDescriptor>> populatorBatch = new ArrayList<>();
        IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL );
        for ( IndexEntryUpdate<IndexDescriptor> update : updates )
        {
            if ( random.nextInt( 100 ) < 20 )
            {
                if ( useUpdater )
                {
                    updater.close();
                    populatorBatch = new ArrayList<>();
                }
                else
                {
                    populator.add( populatorBatch, NULL );
                    updater = populator.newPopulatingUpdater( null_property_accessor, NULL );
                }
                useUpdater = !useUpdater;
            }
            if ( useUpdater )
            {
                updater.process( update );
            }
            else
            {
                populatorBatch.add( update );
            }
        }
        if ( useUpdater )
        {
            updater.close();
        }
        else
        {
            populator.add( populatorBatch, NULL );
        }
    }

    int interleaveLargeAmountOfUpdates( Random updaterRandom,
            Iterator<? extends IndexEntryUpdate<IndexDescriptor>> updates ) throws IndexEntryConflictException
    {
        int count = 0;
        for ( int i = 0; i < LARGE_AMOUNT_OF_UPDATES; i++ )
        {
            if ( updaterRandom.nextFloat() < 0.1 )
            {
                try ( IndexUpdater indexUpdater = populator.newPopulatingUpdater( null_property_accessor, NULL ) )
                {
                    int numberOfUpdaterUpdates = updaterRandom.nextInt( 100 );
                    for ( int j = 0; j < numberOfUpdaterUpdates; j++ )
                    {
                        indexUpdater.process( updates.next() );
                        count++;
                    }
                }
            }
            populator.add( Collections.singletonList( updates.next() ), NULL );
            count++;
        }
        return count;
    }
}
