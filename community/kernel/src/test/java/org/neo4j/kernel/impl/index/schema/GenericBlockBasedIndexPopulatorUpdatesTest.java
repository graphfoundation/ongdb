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

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Collections.singleton;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.api.index.PhaseTracker.nullInstance;
import static org.neo4j.kernel.impl.index.schema.IndexEntryTestUtil.generateStringValueResultingInIndexEntrySize;
import static org.neo4j.storageengine.api.IndexEntryUpdate.add;

abstract class GenericBlockBasedIndexPopulatorUpdatesTest<KEY extends GenericKey<KEY>> extends BlockBasedIndexPopulatorUpdatesTest<KEY>
{
    @Test
    void shouldHandleEntriesOfMaxSize() throws IndexEntryConflictException, IOException
    {
        // given
        BlockBasedIndexPopulator<KEY> populator = instantiatePopulator( INDEX_DESCRIPTOR );
        try
        {
            int maxKeyValueSize = populator.tree.keyValueSizeCap();
            ValueIndexEntryUpdate<IndexDescriptor> update =
                    add( 1, INDEX_DESCRIPTOR, generateStringValueResultingInIndexEntrySize( populator.layout, maxKeyValueSize ) );

            // when
            Collection<ValueIndexEntryUpdate<?>> updates = singleton( update );
            populator.add( updates, NULL );
            populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );

            // then
            assertHasEntry( populator, update.values()[0], 1 );
        }
        finally
        {
            populator.close( true, NULL );
        }
    }

    @Test
    void shouldThrowForEntriesLargerThanMaxSize() throws IOException
    {
        // given
        BlockBasedIndexPopulator<KEY> populator = instantiatePopulator( INDEX_DESCRIPTOR );
        try
        {
            int maxKeyValueSize = populator.tree.keyValueSizeCap();
            ValueIndexEntryUpdate<IndexDescriptor> update =
                    add( 1, INDEX_DESCRIPTOR, generateStringValueResultingInIndexEntrySize( populator.layout, maxKeyValueSize + 1 ) );
            IllegalArgumentException e = assertThrows( IllegalArgumentException.class, () ->
            {
                Collection<ValueIndexEntryUpdate<?>> updates = singleton( update );
                populator.add( updates, NULL );
                populator.scanCompleted( nullInstance, populationWorkScheduler, NULL );
            } );
            // then
            assertThat( e.getMessage(), Matchers.containsString(
                    "Property value is too large to index, please see index documentation for limitations. Index: Index( id=1, name='index', " +
                            "type='GENERAL " + indexType() + "', schema=(:Label1 {property1}), indexProvider='Undecided-0' ), entity id: 1, property size: " +
                            "8176, value: [String(\"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...." ) );

        }
        finally
        {
            populator.close( true, NULL );
        }
    }

    @Override
    Value supportedValue( int identifier )
    {
        return Values.stringValue( "StringValue " + identifier );
    }
}
