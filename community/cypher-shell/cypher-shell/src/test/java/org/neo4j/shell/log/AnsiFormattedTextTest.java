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
package org.neo4j.shell.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnsiFormattedTextTest
{

    @Test
    void simpleString()
    {
        AnsiFormattedText st = AnsiFormattedText.from( "hello" );
        assertEquals( "hello", st.plainString() );
        assertEquals( "hello", st.formattedString() );
    }

    @Test
    void noStyleShouldBePlain()
    {
        AnsiFormattedText st = AnsiFormattedText.s()
                                                .colorDefault()
                                                .boldOff()
                                                .append( "yo" );

        assertEquals( "yo", st.plainString() );
        assertEquals( "yo", st.formattedString() );
    }

    @Test
    void withFormatting()
    {
        AnsiFormattedText st = AnsiFormattedText.s()
                                                .colorRed()
                                                .bold( "hello" )
                                                .colorDefault()
                                                .append( " world" );

        assertEquals( "hello world", st.plainString() );
        assertEquals( "@|RED,BOLD hello|@ world", st.formattedString() );
    }

    @Test
    void nestedFormattingWorks()
    {
        AnsiFormattedText st = AnsiFormattedText.s()
                                                .colorDefault()
                                                .bold()
                                                .append( "hello" )
                                                .boldOff()
                                                .append( " world" );
        st = AnsiFormattedText.s().colorRed().append( st );

        assertEquals( "hello world", st.plainString() );
        assertEquals( "@|RED,BOLD hello|@@|RED  world|@", st.formattedString() );
    }

    @Test
    void outerAttributeTakesColorPrecedence()
    {
        AnsiFormattedText st = AnsiFormattedText.s().colorRed().append( "inner" );

        assertEquals( "@|RED inner|@", st.formattedString() );

        st = AnsiFormattedText.s().colorDefault().append( st );

        assertEquals( "inner", st.formattedString() );
    }

    @Test
    void outerAttributeTakesBoldPrecedence()
    {
        AnsiFormattedText st = AnsiFormattedText.s().colorRed().bold().append( "inner" );

        assertEquals( "@|RED,BOLD inner|@", st.formattedString() );

        st = AnsiFormattedText.s().boldOff().append( st );

        assertEquals( "@|RED inner|@", st.formattedString() );
    }

    @Test
    void shouldAppend()
    {
        AnsiFormattedText st = AnsiFormattedText.from( "hello" );

        st = st.append( " world" );

        assertEquals( "hello world", st.plainString() );
    }
}
