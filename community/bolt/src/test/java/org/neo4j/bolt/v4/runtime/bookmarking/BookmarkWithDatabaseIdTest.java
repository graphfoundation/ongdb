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
package org.neo4j.bolt.v4.runtime.bookmarking;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import org.neo4j.bolt.runtime.BoltResponseHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.kernel.database.DatabaseIdFactory.from;
import static org.neo4j.values.storable.Values.stringValue;

class BookmarkWithDatabaseIdTest
{
    @Test
    void shouldHaveTransactionIdAndDatabaseId()
    {
        var txId = 42;
        var databaseId = from( "morty", UUID.randomUUID() );

        var bookmark = new BookmarkWithDatabaseId( txId, databaseId );

        assertEquals( txId, bookmark.txId() );
        assertEquals( databaseId, bookmark.databaseId() );
    }

    @Test
    void shouldAttachToMetadata()
    {
        var txId = 42;
        var namedDatabaseId = from( "morty", UUID.randomUUID() );
        var responseHandler = mock( BoltResponseHandler.class );
        var bookmark = new BookmarkWithDatabaseId( txId, namedDatabaseId );

        bookmark.attachTo( responseHandler );

        verify( responseHandler ).onMetadata( "bookmark",
                stringValue( String.format( "%s:42", namedDatabaseId.databaseId().uuid() ) ) );
    }

    @Test
    void shouldFormatAsString()
    {
        var txId = 424242;
        var namedDatabaseId = from( "morty", UUID.randomUUID() );

        var bookmark = new BookmarkWithDatabaseId( txId, namedDatabaseId );

        assertEquals( String.format( "%s:424242", namedDatabaseId.databaseId().uuid() ), bookmark.toString() );
    }
}

