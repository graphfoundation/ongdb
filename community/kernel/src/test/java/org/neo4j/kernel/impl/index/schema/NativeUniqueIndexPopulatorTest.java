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

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.values.storable.ValueType;

import static java.util.Arrays.asList;
import static org.apache.commons.lang3.exception.ExceptionUtils.hasCause;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.api.index.PhaseTracker.nullInstance;

abstract class NativeUniqueIndexPopulatorTest<KEY extends NativeIndexKey<KEY>> extends NativeIndexPopulatorTests<KEY>
{
    private final IndexDescriptor uniqueDescriptor =
            IndexPrototype.uniqueForSchema( SchemaDescriptors.forLabel( 42, 666 ) ).withName( "constraint" )
                    .withIndexType( indexType() ).materialise( 0 );

    private final NativeIndexPopulatorTestCases.PopulatorFactory<KEY> populatorFactory;
    private final ValueType[] typesOfGroup;

    NativeUniqueIndexPopulatorTest( NativeIndexPopulatorTestCases.PopulatorFactory<KEY> populatorFactory, ValueType[] typesOfGroup, IndexLayout<KEY> layout )
    {
        this.populatorFactory = populatorFactory;
        this.typesOfGroup = typesOfGroup;
        this.layout = layout;
    }

    abstract IndexType indexType();

    @Override
    NativeIndexPopulator<KEY> createPopulator( PageCache pageCache ) throws IOException
    {
        DatabaseIndexContext context = DatabaseIndexContext.builder( pageCache, fs, DEFAULT_DATABASE_NAME ).build();
        return populatorFactory.create( context, indexFiles, layout, indexDescriptor, tokenNameLookup );
    }

    @Override
    ValueCreatorUtil<KEY> createValueCreatorUtil()
    {
        return new ValueCreatorUtil<>( uniqueDescriptor, typesOfGroup, ValueCreatorUtil.FRACTION_DUPLICATE_UNIQUE );
    }

    @Override
    IndexLayout<KEY> layout()
    {
        return layout;
    }

    @Override
    IndexDescriptor indexDescriptor()
    {
        return uniqueDescriptor;
    }

    @Test
    void addShouldThrowOnDuplicateValues() throws IOException
    {
        // given
        populator.create();
        IndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdatesWithDuplicateValues( random );

        assertThrows( IndexEntryConflictException.class, () ->
        {
            populator.add( asList( updates ), NULL );
            populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        } );

        populator.close( true, NULL );
    }

    @Test
    void updaterShouldThrowOnDuplicateValues() throws Exception
    {
        // given
        populator.create();
        IndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdatesWithDuplicateValues( random );
        IndexUpdater updater = populator.newPopulatingUpdater( null_property_accessor, NULL );

        // when
        for ( IndexEntryUpdate<IndexDescriptor> update : updates )
        {
            updater.process( update );
        }
        var e = assertThrows( Exception.class, () ->
        {
            updater.close();
            populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        } );
        assertTrue( hasCause( e, IndexEntryConflictException.class ), e.getMessage() );

        populator.close( true, NULL );
    }

    @Test
    void shouldSampleUpdates() throws Exception
    {
        // GIVEN
        populator.create();
        IndexEntryUpdate<IndexDescriptor>[] updates = valueCreatorUtil.someUpdates( random );

        // WHEN
        populator.add( asList( updates ), NULL );
        for ( IndexEntryUpdate<IndexDescriptor> update : updates )
        {
            populator.includeSample( update );
        }
        populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
        IndexSample sample = populator.sample( NULL );

        // THEN
        assertEquals( updates.length, sample.sampleSize() );
        assertEquals( updates.length, sample.uniqueValues() );
        assertEquals( updates.length, sample.indexSize() );
        populator.close( true, NULL );
    }
}
