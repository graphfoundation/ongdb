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
package org.neo4j.kernel.impl.newapi;

import org.neo4j.common.EntityType;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.exceptions.EntityNotFoundException;
import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.PropertySelection;
import org.neo4j.values.storable.Value;

import static org.neo4j.values.storable.Values.NO_VALUE;

/**
 * Generic single-threaded {@link NodePropertyAccessor} given a {@link NodeCursor} and {@link PropertyCursor}.
 */
class CursorPropertyAccessor implements NodePropertyAccessor, AutoCloseable
{
    private final NodeCursor nodeCursor;
    private final PropertyCursor propertyCursor;
    private final Read read;

    CursorPropertyAccessor( NodeCursor nodeCursor, PropertyCursor propertyCursor, Read read )
    {
        this.nodeCursor = nodeCursor;
        this.propertyCursor = propertyCursor;
        this.read = read;
    }

    @Override
    public void close()
    {
        IOUtils.closeAllSilently( propertyCursor, nodeCursor );
    }

    @Override
    public Value getNodePropertyValue( long nodeId, int propertyKeyId, CursorContext cursorContext ) throws EntityNotFoundException
    {
        read.singleNode( nodeId, nodeCursor );
        if ( !nodeCursor.next() )
        {
            throw new EntityNotFoundException( EntityType.NODE, nodeId );
        }

        nodeCursor.properties( propertyCursor, PropertySelection.selection( propertyKeyId ) );
        return propertyCursor.next() ? propertyCursor.propertyValue() : NO_VALUE;
    }
}
