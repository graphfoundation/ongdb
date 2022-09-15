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

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;

import static org.neo4j.kernel.impl.index.schema.TokenIndex.FAILED;
import static org.neo4j.kernel.impl.index.schema.TokenIndex.ONLINE;
import static org.neo4j.kernel.impl.index.schema.TokenIndex.POPULATING;

public final class TokenIndexes
{
    private TokenIndexes()
    {}

    public static InternalIndexState readState( PageCache pageCache, Path indexFile, String databaseName, CursorContext cursorContext ) throws IOException
    {
        NativeIndexHeaderReader headerReader = new NativeIndexHeaderReader( FAILED );
        GBPTree.readHeader( pageCache, indexFile, headerReader, databaseName, cursorContext );
        switch ( headerReader.state )
        {
        case FAILED:
            return InternalIndexState.FAILED;
        case ONLINE:
            return InternalIndexState.ONLINE;
        case POPULATING:
            return InternalIndexState.POPULATING;
        default:
            throw new IllegalStateException( "Unexpected initial state byte value " + headerReader.state );
        }
    }

    static String readFailureMessage( PageCache pageCache, Path indexFile, String databaseName, CursorContext cursorContext )
            throws IOException
    {
        NativeIndexHeaderReader headerReader = new NativeIndexHeaderReader( FAILED );
        GBPTree.readHeader( pageCache, indexFile, headerReader, databaseName, cursorContext );
        return headerReader.failureMessage;
    }
}
