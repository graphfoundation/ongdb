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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.Test;

import org.neo4j.storageengine.api.StorageNodeCursor;
import org.neo4j.storageengine.api.StorageRelationshipScanCursor;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.graphdb.RelationshipType.withName;
import static org.neo4j.internal.helpers.collection.MapUtil.map;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

/**
 * Test reading committed node and relationships from disk.
 */
class RecordStorageReaderNodeAndRelTest extends RecordStorageReaderTestBase
{
    @Test
    void shouldTellIfNodeExists() throws Exception
    {
        // Given
        long created = createNode( map() );
        long createdAndRemoved = createNode( map() );
        long neverExisted = createdAndRemoved + 99;

        deleteNode( createdAndRemoved );

        // When & then
        assertTrue(  nodeExists( created ));
        assertFalse( nodeExists( createdAndRemoved ) );
        assertFalse( nodeExists( neverExisted ) );
    }

    @Test
    void shouldTellIfRelExists() throws Exception
    {
        // Given
        long node = createNode( map() );
        long created = createRelationship( createNode( map() ), createNode( map() ), withName( "Banana" ) );
        long createdAndRemoved = createRelationship( createNode( map() ), createNode( map() ), withName( "Banana" ) );
        long neverExisted = created + 99;

        deleteRelationship( createdAndRemoved );

        // When & then
        assertTrue(  relationshipExists( node ));
        assertFalse( relationshipExists( createdAndRemoved ) );
        assertFalse( relationshipExists( neverExisted ) );
    }

    private boolean nodeExists( long id )
    {
        try ( StorageNodeCursor node = storageReader.allocateNodeCursor( NULL, StoreCursors.NULL ) )
        {
            node.single( id );
            return node.next();
        }
    }

    private boolean relationshipExists( long id )
    {
        try ( StorageRelationshipScanCursor relationship = storageReader.allocateRelationshipScanCursor( NULL, StoreCursors.NULL ) )
        {
            relationship.single( id );
            return relationship.next();
        }
    }
}
