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
package org.neo4j.kernel.impl.transaction.state.storeview;

import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.PropertySelection;
import org.neo4j.storageengine.api.StorageNodeCursor;
import org.neo4j.storageengine.api.StoragePropertyCursor;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.values.storable.Value;

import static org.neo4j.values.storable.Values.NO_VALUE;

public class DefaultNodePropertyAccessor implements NodePropertyAccessor
{
    private final StorageReader reader;
    private final StoreCursors storeCursors;
    private final StorageNodeCursor nodeCursor;
    private final StoragePropertyCursor propertyCursor;

    public DefaultNodePropertyAccessor( StorageReader reader, CursorContext cursorContext, StoreCursors storeCursors, MemoryTracker memoryTracker )
    {
        this.reader = reader;
        this.storeCursors = storeCursors;
        nodeCursor = reader.allocateNodeCursor( cursorContext, storeCursors );
        propertyCursor = reader.allocatePropertyCursor( cursorContext, storeCursors, memoryTracker );
    }

    @Override
    public Value getNodePropertyValue( long nodeId, int propertyKeyId, CursorContext cursorContext )
    {
        nodeCursor.single( nodeId );
        if ( nodeCursor.next() && nodeCursor.hasProperties() )
        {
            nodeCursor.properties( propertyCursor, PropertySelection.selection( propertyKeyId ) );
            if ( propertyCursor.next() )
            {
                return propertyCursor.propertyValue();
            }
        }
        return NO_VALUE;
    }

    @Override
    public void close()
    {
        IOUtils.closeAllUnchecked( nodeCursor, propertyCursor, reader, storeCursors );
    }
}
