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
package org.neo4j.bolt.v43.messaging.decoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import org.neo4j.bolt.messaging.RequestMessage;
import org.neo4j.bolt.messaging.RequestMessageDecoder;
import org.neo4j.bolt.packstream.Neo4jPack;
import org.neo4j.bolt.runtime.BoltResponseHandler;
import org.neo4j.bolt.runtime.Bookmark;
import org.neo4j.bolt.runtime.BookmarksParser;
import org.neo4j.bolt.v43.messaging.request.RouteMessage;
import org.neo4j.values.storable.TextValue;

import static org.neo4j.values.storable.Values.NO_VALUE;

/**
 * Responsible for decoding the RouteMessage and its fields.
 */
public class RouteMessageDecoder implements RequestMessageDecoder
{
    private final BoltResponseHandler responseHandler;
    private final BookmarksParser bookmarksParser;

    public RouteMessageDecoder( BoltResponseHandler responseHandler, BookmarksParser bookmarksParser )
    {
        this.responseHandler = responseHandler;
        this.bookmarksParser = bookmarksParser;
    }

    @Override
    public int signature()
    {
        return RouteMessage.SIGNATURE;
    }

    @Override
    public BoltResponseHandler responseHandler()
    {
        return responseHandler;
    }

    @Override
    public RequestMessage decode( Neo4jPack.Unpacker unpacker ) throws IOException
    {
        var routingContext = unpacker.unpackMap();

        var bookmarkList = bookmarksParser.parseBookmarks( unpacker.unpack() );
        var databaseName = Optional.of( unpacker.unpack() )
                                   .filter( any -> any != NO_VALUE && any instanceof TextValue )
                                   .map( any -> ((TextValue) any).stringValue() )
                                   .orElse( null );
        return new RouteMessage( routingContext, bookmarkList, databaseName );
    }
}
