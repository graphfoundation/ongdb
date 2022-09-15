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
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.UpdateMode;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.memory.ByteBufferFactory.heapBufferFactory;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@TestDirectoryExtension
@ExtendWith( RandomExtension.class )
class IndexUpdateStorageTest
{
    private static final IndexSpecificSpaceFillingCurveSettings spatialSettings = IndexSpecificSpaceFillingCurveSettings.fromConfig( Config.defaults() );
    private static final SchemaDescriptorSupplier descriptor = () -> SchemaDescriptors.forLabel( 1, 1 );

    @Inject
    protected TestDirectory directory;

    @Inject
    protected RandomSupport random;

    private final GenericLayout layout = new GenericLayout( 1, spatialSettings );

    @Test
    void shouldAddZeroEntries() throws IOException
    {
        // given
        try ( IndexUpdateStorage<BtreeKey> storage = new IndexUpdateStorage<>( directory.getFileSystem(), directory.file( "file" ),
                heapBufferFactory( 0 ).globalAllocator(), 1000, layout, INSTANCE
        ) )
        {
            // when
            List<IndexEntryUpdate<SchemaDescriptorSupplier>> expected = generateSomeUpdates( 0 );
            storeAll( storage, expected );

            // then
            verify( expected, storage );
        }
    }

    @Test
    void shouldAddFewEntries() throws IOException
    {
        // given
        try ( IndexUpdateStorage<BtreeKey> storage = new IndexUpdateStorage<>( directory.getFileSystem(), directory.file( "file" ),
                heapBufferFactory( 0 ).globalAllocator(), 1000, layout, INSTANCE
        ) )
        {
            // when
            List<IndexEntryUpdate<SchemaDescriptorSupplier>> expected = generateSomeUpdates( 5 );
            storeAll( storage, expected );

            // then
            verify( expected, storage );
        }
    }

    @Test
    void shouldAddManyEntries() throws IOException
    {
        // given
        try ( IndexUpdateStorage<BtreeKey> storage = new IndexUpdateStorage<>( directory.getFileSystem(), directory.file( "file" ),
                heapBufferFactory( 0 ).globalAllocator(), 10_000, layout, INSTANCE
        ) )
        {
            // when
            List<IndexEntryUpdate<SchemaDescriptorSupplier>> expected = generateSomeUpdates( 1_000 );
            storeAll( storage, expected );

            // then
            verify( expected, storage );
        }
    }

    private static void storeAll( IndexUpdateStorage<BtreeKey> storage, List<IndexEntryUpdate<SchemaDescriptorSupplier>> expected )
            throws IOException
    {
        for ( IndexEntryUpdate<SchemaDescriptorSupplier> update : expected )
        {
            storage.add( update );
        }
        storage.doneAdding();
    }

    private static void verify( List<IndexEntryUpdate<SchemaDescriptorSupplier>> expected, IndexUpdateStorage<BtreeKey> storage )
            throws IOException
    {
        try ( IndexUpdateCursor<BtreeKey,NullValue> reader = storage.reader() )
        {
            for ( IndexEntryUpdate<SchemaDescriptorSupplier> expectedUpdate : expected )
            {
                assertTrue( reader.next() );
                assertEquals( expectedUpdate, asUpdate( reader ) );
            }
            assertFalse( reader.next() );
        }
    }

    private static IndexEntryUpdate<SchemaDescriptorSupplier> asUpdate( IndexUpdateCursor<BtreeKey,NullValue> reader )
    {
        switch ( reader.updateMode() )
        {
        case ADDED:
            return IndexEntryUpdate.add( reader.key().getEntityId(), descriptor, reader.key().asValue() );
        case CHANGED:
            return IndexEntryUpdate.change( reader.key().getEntityId(), descriptor, reader.key().asValue(), reader.key2().asValue() );
        case REMOVED:
            return IndexEntryUpdate.remove( reader.key().getEntityId(), descriptor, reader.key().asValue() );
        default:
            throw new IllegalArgumentException();
        }
    }

    private List<IndexEntryUpdate<SchemaDescriptorSupplier>> generateSomeUpdates( int count )
    {
        List<IndexEntryUpdate<SchemaDescriptorSupplier>> updates = new ArrayList<>();
        for ( int i = 0; i < count; i++ )
        {
            long entityId = random.nextLong( 10_000_000 );
            switch ( random.among( UpdateMode.MODES ) )
            {
            case ADDED:
                updates.add( IndexEntryUpdate.add( entityId, descriptor, random.nextValue() ) );
                break;
            case REMOVED:
                updates.add( IndexEntryUpdate.remove( entityId, descriptor, random.nextValue() ) );
                break;
            case CHANGED:
                updates.add( IndexEntryUpdate.change( entityId, descriptor, random.nextValue(), random.nextValue() ) );
                break;
            default:
                throw new IllegalArgumentException();
            }
        }
        return updates;
    }
}
