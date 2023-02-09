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
package org.neo4j.bolt.v4.messaging;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

import org.neo4j.bolt.messaging.BoltIOException;
import org.neo4j.kernel.impl.util.ValueUtils;
import org.neo4j.values.virtual.MapValue;

import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.internal.helpers.collection.MapUtil.map;
import static org.neo4j.kernel.impl.util.ValueUtils.asMapValue;

class DiscardMessageTest
{
    @ParameterizedTest
    @ValueSource( longs = {-1L, 100L} )
    void shouldParseDiscardMetadataCorrectly( long value ) throws Throwable
    {
        // When
        DiscardMessage message = new DiscardMessage( asMapValue( singletonMap( "n", value ) ) );

        // Then
        assertThat( message.n() ).isEqualTo( value );
    }

    @Test
    void shouldThrowExceptionIfFailedToParseTransactionMetadataCorrectly() throws Throwable
    {
        // Given
        Map<String,Object> msgMetadata = map( "n", "invalid value type" );
        MapValue meta = ValueUtils.asMapValue( msgMetadata );
        // When & Then
        BoltIOException exception = assertThrows( BoltIOException.class, () -> new DiscardMessage( meta ) );
        assertThat( exception.getMessage() ).startsWith( "Expecting DISCARD size n to be a Long value, but got: String(\"invalid value type\")" );
    }

    @ParameterizedTest
    @ValueSource( longs = {-100L, 0L} )
    void shouldThrowExceptionIfZero( long value ) throws Throwable
    {
        // When & Then
        BoltIOException exception = assertThrows( BoltIOException.class, () -> new DiscardMessage( asMapValue( singletonMap( "n", value ) ) ) );
        assertThat( exception.getMessage() ).startsWith( "Expecting DISCARD size to be at least 1" );
    }

    @Test
    void shouldThrowExceptionIfMissingMeta() throws Throwable
    {
        // When & Then
        BoltIOException exception = assertThrows( BoltIOException.class, () -> new DiscardMessage( MapValue.EMPTY ) );
        assertThat( exception.getMessage() ).startsWith( "Expecting DISCARD size n to be a Long value, but got: NO_VALUE" );
    }

    @Test
    void shouldBeEqual() throws Throwable
    {
        // Given
        DiscardMessage message = new DiscardMessage( asMapValue( singletonMap( "n", 100L ) ) );

        DiscardMessage messageEqual = new DiscardMessage( asMapValue( singletonMap( "n", 100L ) ) );

        // When & Then
        assertEquals( message, messageEqual );
    }
}
