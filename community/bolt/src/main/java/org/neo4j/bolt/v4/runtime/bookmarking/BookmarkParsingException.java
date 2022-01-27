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
package org.neo4j.bolt.v4.runtime.bookmarking;

import java.util.UUID;

import org.neo4j.bolt.messaging.BoltIOException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.values.virtual.ListValue;

class BookmarkParsingException extends BoltIOException
{
    private BookmarkParsingException( Status status, String message, Throwable cause )
    {
        super( status, message, cause );
    }

    private BookmarkParsingException( Status status, String message )
    {
        super( status, message );
    }

    static BookmarkParsingException newInvalidBookmarkError( String message )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmark, message );
    }

    static BookmarkParsingException newInvalidBookmarkError( String message, Throwable cause )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmark, message, cause );
    }

    static BookmarkParsingException newInvalidSingleBookmarkError( Object bookmarkObject, String message, Throwable cause )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmark,
                String.format( "Supplied bookmark '%s' does not conform to pattern {database_id}:{tx_id}. %s", bookmarkObject, message ),
                cause );
    }

    static BookmarkParsingException newInvalidSingleBookmarkError( Object bookmarkObject )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmark,
                String.format( "Supplied bookmarks '%s' does not conform to pattern {database_id}:{tx_id}.", bookmarkObject ) );
    }

    static BookmarkParsingException newInvalidBookmarkMixtureError( ListValue bookmarks )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmarkMixture,
                String.format( "Supplied bookmarks are from different databases. Bookmarks: %s.", bookmarks ) );
    }

    static BookmarkParsingException newInvalidBookmarkForUnknownDatabaseError( UUID databaseUuid )
    {
        return new BookmarkParsingException( Status.Transaction.InvalidBookmark,
                String.format( "Supplied bookmark is for an unknown database: %s.", databaseUuid ) );
    }
}
