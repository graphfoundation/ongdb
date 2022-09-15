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
package org.neo4j.kernel.impl.index.schema;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.Collection;

import org.neo4j.index.internal.gbptree.Layout;
import org.neo4j.index.internal.gbptree.Seeker;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.test.Race;
import org.neo4j.values.storable.Value;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.api.index.PhaseTracker.nullInstance;
import static org.neo4j.kernel.impl.index.schema.BlockStorage.Monitor.NO_MONITOR;
import static org.neo4j.kernel.impl.index.schema.IndexEntryTestUtil.generateStringValueResultingInIndexEntrySize;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.values.storable.Values.stringValue;

abstract class GenericBlockBasedIndexPopulatorTest<KEY extends GenericKey<KEY>> extends BlockBasedIndexPopulatorTest<KEY>
{
    @ValueSource( booleans = {true, false} )
    @ParameterizedTest
    void shouldAcceptUpdatedMaxSizeValue( boolean updateBeforeScanCompleted ) throws Throwable
    {
        // given
        ByteBufferFactory bufferFactory = new ByteBufferFactory( UnsafeDirectByteBufferAllocator::new, SUFFICIENTLY_LARGE_BUFFER_SIZE );
        BlockBasedIndexPopulator<KEY> populator = instantiatePopulator( NO_MONITOR, bufferFactory, INSTANCE );
        try
        {
            int size = populator.tree.keyValueSizeCap();
            Layout<KEY,NullValue> layout = layout();
            Value value = generateStringValueResultingInIndexEntrySize( layout, size );
            IndexEntryUpdate<IndexDescriptor> update = IndexEntryUpdate.add( 0, INDEX_DESCRIPTOR, value );
            Race.ThrowingRunnable updateAction = () ->
            {
                try ( IndexUpdater updater = populator.newPopulatingUpdater( NULL ) )
                {
                    updater.process( update );
                }
            };
            if ( updateBeforeScanCompleted )
            {
                updateAction.run();
                populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
            }
            else
            {
                populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
                updateAction.run();
            }

            // when
            try ( Seeker<KEY,NullValue> seek = seek( populator.tree, layout ) )
            {
                // then
                assertTrue( seek.next() );
                assertEquals( value, seek.key().asValues()[0] );
                assertFalse( seek.next() );
            }
        }
        finally
        {
            populator.close( true, NULL );
        }
    }

    @Test
    void shouldAcceptBatchAddedMaxSizeValue() throws IndexEntryConflictException, IOException
    {
        // given
        ByteBufferFactory bufferFactory = new ByteBufferFactory( UnsafeDirectByteBufferAllocator::new, SUFFICIENTLY_LARGE_BUFFER_SIZE );
        BlockBasedIndexPopulator<KEY> populator = instantiatePopulator( NO_MONITOR, bufferFactory, INSTANCE );
        try
        {
            int size = populator.tree.keyValueSizeCap();
            Layout<KEY,NullValue> layout = layout();
            Value value = generateStringValueResultingInIndexEntrySize( layout, size );
            Collection<? extends IndexEntryUpdate<?>> data = singletonList( IndexEntryUpdate.add( 0, INDEX_DESCRIPTOR, value ) );
            populator.add( data, NULL );
            populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );

            // when
            try ( Seeker<KEY,NullValue> seek = seek( populator.tree, layout ) )
            {
                // then
                assertTrue( seek.next() );
                assertEquals( value, seek.key().asValues()[0] );
                assertFalse( seek.next() );
            }
        }
        finally
        {
            populator.close( true, NULL );
        }
    }

    @Override
    protected Value supportedValue( int i )
    {
        return stringValue( "Value" + i );
    }
}
