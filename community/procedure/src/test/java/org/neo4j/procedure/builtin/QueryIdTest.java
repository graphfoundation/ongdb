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
package org.neo4j.procedure.builtin;

import org.junit.jupiter.api.Test;

import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QueryIdTest
{
    @Test
    void printsQueryIds() throws InvalidArgumentsException
    {
        assertThat( new QueryId( 12L ).toString() ).isEqualTo( "query-12" );
    }

    @Test
    void doesNotConstructNegativeQueryIds()
    {
        assertThrows( InvalidArgumentsException.class, () -> new QueryId( -15L ) );
    }

    @Test
    void parsesQueryIds() throws InvalidArgumentsException
    {
        assertThat( QueryId.parse( "query-14" ) ).isEqualTo( new QueryId( 14L ) );
    }

    @Test
    void doesNotParseNegativeQueryIds()
    {
        assertThrows( InvalidArgumentsException.class, () -> QueryId.parse( "query--12" ) );
    }

    @Test
    void doesNotParseWrongPrefix()
    {
        assertThrows( InvalidArgumentsException.class, () -> QueryId.parse( "querr-12" ) );
    }

    @Test
    void doesNotParseRandomText()
    {
        assertThrows( InvalidArgumentsException.class, () -> QueryId.parse( "blarglbarf" ) );
    }

    @Test
    void doesNotParseTrailingRandomText()
    {
        assertThrows( InvalidArgumentsException.class, () -> QueryId.parse( "query-12  " ) );
    }

    @Test
    void doesNotParseEmptyText()
    {
        assertThrows( InvalidArgumentsException.class, () -> QueryId.parse( "" ) );
    }
}
