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
package org.neo4j.values.storable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UTF8StringValueBuilderTest
{

    @Test
    void shouldHandleSingleByteCodePoints()
    {
        // Given
        UTF8StringValueBuilder builder = new UTF8StringValueBuilder();
        int codepoint = "$".codePointAt( 0 );

        // When
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );

        // Then
        TextValue textValue = builder.build();
        assertThat( textValue.stringValue() ).isEqualTo( "$$$" );
    }

    @Test
    void shouldHandleTwoByteCodePoints()
    {
        // Given
        UTF8StringValueBuilder builder = new UTF8StringValueBuilder();
        int codepoint = "¢".codePointAt( 0 );

        // When
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );

        // Then
        TextValue textValue = builder.build();
        assertThat( textValue.stringValue() ).isEqualTo( "¢¢¢" );
    }

    @Test
    void shouldHandleThreeByteCodePoints()
    {
        // Given
        UTF8StringValueBuilder builder = new UTF8StringValueBuilder();
        int codepoint = "€".codePointAt( 0 );

        // When
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );

        // Then
        TextValue textValue = builder.build();
        assertThat( textValue.stringValue() ).isEqualTo( "€€€" );
    }

    @Test
    void shouldHandleFourByteCodePoints()
    {
        // Given
        UTF8StringValueBuilder builder = new UTF8StringValueBuilder();
        int codepoint = "\uD800\uDF48".codePointAt( 0 );

        // When
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );
        builder.addCodePoint( codepoint );

        // Then
        TextValue textValue = builder.build();
        assertThat( textValue.stringValue() ).isEqualTo( "\uD800\uDF48\uD800\uDF48\uD800\uDF48" );
    }
}
