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
package org.neo4j.kernel.impl.newapi;

import org.junit.jupiter.api.Test;

import org.neo4j.internal.kernel.api.exceptions.EntityNotFoundException;
import org.neo4j.internal.kernel.api.helpers.StubNodeCursor;
import org.neo4j.internal.kernel.api.helpers.StubPropertyCursor;
import org.neo4j.internal.kernel.api.helpers.StubRead;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.internal.helpers.collection.MapUtil.genericMap;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.values.storable.Values.NO_VALUE;

class CursorPropertyAccessorTest
{
    @Test
    void shouldLookupProperty() throws EntityNotFoundException
    {
        // given
        long nodeId = 10;
        Value value = Values.of( "abc" );
        int propertyKeyId = 0;
        StubNodeCursor nodeCursor = new StubNodeCursor().withNode( nodeId, new long[]{}, genericMap( 999, Values.of( 12345 ), propertyKeyId, value ) );
        CursorPropertyAccessor accessor = new CursorPropertyAccessor( nodeCursor, new StubPropertyCursor(), new StubRead() );

        // when
        Value readValue = accessor.getNodePropertyValue( nodeId, propertyKeyId, NULL );

        // then
        assertEquals( value, readValue );
    }

    @Test
    void shouldReturnNoValueOnMissingProperty() throws EntityNotFoundException
    {
        // given
        long nodeId = 10;
        StubNodeCursor nodeCursor = new StubNodeCursor().withNode( nodeId, new long[]{}, genericMap( 999, Values.of( 12345 ) ) );
        CursorPropertyAccessor accessor = new CursorPropertyAccessor( nodeCursor, new StubPropertyCursor(), new StubRead() );

        // when
        Value readValue = accessor.getNodePropertyValue( nodeId, 0, NULL );

        // then
        assertEquals( NO_VALUE, readValue );
    }

    @Test
    void shouldThrowOnEntityNotFound()
    {
        // given
        long nodeId = 10;
        Value value = Values.of( "abc" );
        int propertyKeyId = 0;
        StubNodeCursor nodeCursor = new StubNodeCursor().withNode( nodeId, new long[]{}, genericMap( 999, Values.of( 12345 ), propertyKeyId, value ) );
        CursorPropertyAccessor accessor = new CursorPropertyAccessor( nodeCursor, new StubPropertyCursor(), new StubRead() );

        // when
        assertThrows( EntityNotFoundException.class, () -> accessor.getNodePropertyValue( nodeId + 1, propertyKeyId, NULL ) );
    }
}
