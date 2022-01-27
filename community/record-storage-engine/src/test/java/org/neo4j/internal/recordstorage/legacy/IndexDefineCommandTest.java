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
package org.neo4j.internal.recordstorage.legacy;

import org.eclipse.collections.api.map.primitive.MutableObjectIntMap;
import org.eclipse.collections.impl.map.mutable.primitive.ObjectIntHashMap;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.storageengine.api.CommandReader;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.internal.recordstorage.RecordStorageCommandReaderFactory.LATEST_LOG_SERIALIZATION;

class IndexDefineCommandTest
{
    @Test
    void testIndexCommandCreationEnforcesLimit()
    {
        // Given
        IndexDefineCommand idc = new IndexDefineCommand();
        int count = IndexDefineCommand.HIGHEST_POSSIBLE_ID;

        // When
        for ( int i = 0; i < count; i++ )
        {
            idc.getOrAssignKeyId( "key" + i );
            idc.getOrAssignIndexNameId( "index" + i );
        }

        // Then
        // it should break on too many
        assertThrows( IllegalStateException.class, () -> idc.getOrAssignKeyId( "dropThatOverflows" ) );
        assertThrows( IllegalStateException.class, () -> idc.getOrAssignIndexNameId( "dropThatOverflows" ) );
    }

    @Test
    void shouldWriteIndexDefineCommandIfMapWithinShortRange() throws IOException
    {
        // GIVEN
        InMemoryClosableChannel channel =  new InMemoryClosableChannel( 10_000 );
        IndexDefineCommand command = initIndexDefineCommand( 300 );

        // WHEN
        command.serialize( channel );

        // THEN
        assertThrows( IOException.class, () -> ((CommandReader) LATEST_LOG_SERIALIZATION).read( channel ) );
    }

    @Test
    void shouldFailToWriteIndexDefineCommandIfMapIsLargerThanShort()
    {
        // GIVEN
        InMemoryClosableChannel channel =  new InMemoryClosableChannel( 1000 );
        IndexDefineCommand command = new IndexDefineCommand();
        MutableObjectIntMap<String> largeMap = initMap( 0xFFFF + 1 );
        command.init( largeMap, largeMap );

        // WHEN
        assertThrows( AssertionError.class, () -> command.serialize( channel ) );
    }

    private static IndexDefineCommand initIndexDefineCommand( int nbrOfEntries )
    {
        IndexDefineCommand command = new IndexDefineCommand();
        MutableObjectIntMap<String> indexNames = initMap( nbrOfEntries );
        MutableObjectIntMap<String> keys = initMap( nbrOfEntries );
        command.init( indexNames, keys );
        return command;
    }

    private static MutableObjectIntMap<String> initMap( int nbrOfEntries )
    {
        MutableObjectIntMap<String> toReturn = new ObjectIntHashMap<>();
        while ( nbrOfEntries-- > 0 )
        {
            toReturn.put( "key" + nbrOfEntries, nbrOfEntries );
        }
        return toReturn;
    }
}
