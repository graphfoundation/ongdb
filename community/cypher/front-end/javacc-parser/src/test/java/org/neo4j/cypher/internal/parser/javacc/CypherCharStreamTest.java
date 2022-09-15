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
package org.neo4j.cypher.internal.parser.javacc;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CypherCharStreamTest
{
    @Test
    void basicHappyPath() throws IOException
    {
        CypherCharStream x = new CypherCharStream( "abc d  \nö\r\n\t" );

        assertEquals( 'a', x.readChar() );
        assertEquals( 'b', x.readChar() );
        assertEquals( 'c', x.readChar() );
        assertEquals( ' ', x.readChar() );
        assertEquals( 'd', x.readChar() );
        assertEquals( ' ', x.readChar() );
        assertEquals( ' ', x.readChar() );
        assertEquals( '\n', x.readChar() );
        assertEquals( 'ö', x.readChar() );
        assertEquals( '\r', x.readChar() );
        assertEquals( '\n', x.readChar() );
        assertEquals( '\t', x.readChar() );
    }

    @Test
    void throwOnEOF()
    {
        CypherCharStream x = new CypherCharStream( "" );
        assertThrows( IOException.class, x::readChar );
    }

    @Test
    void convertEscapedUnicode() throws IOException
    {
        // java allows multiple u's in encoded unicode characters
        // see: The Java Language Specification
        //      James Gosling, Bill Joy, Guy Steele, Gilad Bracha
        CypherCharStream x = new CypherCharStream( "a\uD83D\\uD83D\\uuuuD83D" );

        assertEquals( 'a', x.readChar() );
        assertEquals( '\uD83D', x.readChar() );
        assertEquals( '\uD83D', x.readChar() );
        assertEquals( '\uD83D', x.readChar() );
    }

    @Test
    void doNodeConvertBackslash() throws IOException
    {
        CypherCharStream x = new CypherCharStream( "\\\\ \\a \\\\" );

        assertEquals( '\\', x.readChar() );
        assertEquals( '\\', x.readChar() );
        assertEquals( ' ', x.readChar() );
        assertEquals( '\\', x.readChar() );
        assertEquals( 'a', x.readChar() );
        assertEquals( ' ', x.readChar() );
        assertEquals( '\\', x.readChar() );
        assertEquals( '\\', x.readChar() );
        assertThrows( IOException.class, x::readChar );
    }

    @Test
    void convertEscapedBackslashUnicodeMix() throws IOException
    {
        CypherCharStream x = new CypherCharStream( "\\\\uaa3a \\\\\\uaa3a \\\\\\\\uaa3a \\\\\\\\\\uaa3a" );

        char[] expected = "\\\\uaa3a \\\\\uaa3a \\\\\\\\uaa3a \\\\\\\\\uaa3a".toCharArray();

        for ( char c : expected )
        {
            assertEquals( c, x.readChar() );
        }
        assertThrows( IOException.class, x::readChar );
    }

    @Test
    void handleBackslashEOF()
    {
        // We could either throw directly, or return the backslash
        // and throw on the next read. Since this is not a valid
        // query anyway, we're throwing directly.
        CypherCharStream x = new CypherCharStream( "\\" );
        assertThrows( IOException.class, x::readChar );
    }

    @Test
    void basicBackup() throws IOException
    {
        CypherCharStream x = new CypherCharStream( "a \nö" );
        x.readChar();
        x.readChar();
        x.readChar();
        assertEquals( 'ö', x.readChar() );

        x.backup( 3 );
        assertEquals( ' ', x.readChar() );
    }

    String Q1 = "ab \nö\r\n\tpk\\uD83D x";
    String Q1_unescaped = "ab \nö\r\n\tpk\uD83D x";
    int[] Q1_offset = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 16, 17};
    int[] Q1_line = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3};
    int[] Q1_column = {1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 9, 10, 11};

    @Test
    void endPosition() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        for ( int i = 0; i < Q1_offset.length; i++ )
        {
            x.readChar();
            assertEquals( Q1_column[i], x.getEndColumn() );
            assertEquals( Q1_line[i], x.getEndLine() );
        }
    }

    @Test
    void beginPosition() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        for ( int i = 0; i + 1 < Q1_offset.length; i += 2 )
        {
            x.beginToken();
            assertEquals( Q1_column[i], x.getBeginColumn() );
            assertEquals( Q1_line[i], x.getBeginLine() );

            x.readChar(); // does not change getBegin*
            assertEquals( Q1_offset[i], x.getBeginOffset() );
            assertEquals( Q1_column[i], x.getBeginColumn() );
            assertEquals( Q1_line[i], x.getBeginLine() );

            assertEquals( Q1_column[i + 1], x.getEndColumn() );
            assertEquals( Q1_line[i + 1], x.getEndLine() );
        }
    }

    @Test
    void beginPosition2() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        for ( int i = 0; i + 1 < Q1_offset.length; i++ )
        {
            x.beginToken();
            assertEquals( Q1_offset[i], x.getBeginOffset() );
            assertEquals( Q1_column[i], x.getBeginColumn() );
            assertEquals( Q1_line[i], x.getBeginLine() );

            int remaining = Q1_offset.length - i - 1;
            for ( int j = 0; j < remaining; j++ )
            {
                x.readChar();
                assertEquals( Q1_offset[i], x.getBeginOffset() );
                assertEquals( Q1_column[i], x.getBeginColumn() );
                assertEquals( Q1_line[i], x.getBeginLine() );
            }
            x.backup( remaining );
        }
    }

    @Test
    void backupShouldMaintainPosition() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        for ( int i = 0; i < Q1_offset.length; i++ )
        {
            x.readChar();
        }

        for ( int i = Q1_offset.length - 2; i >= 0; i-- )
        {
            x.backup( 1 );
            assertEquals( Q1_column[i], x.getEndColumn() );
            assertEquals( Q1_line[i], x.getEndLine() );
        }
    }

    @Test
    void image() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        x.beginToken();
        for ( int i = 1; i < Q1_offset.length; i++ )
        {
            x.readChar();
            assertEquals( Q1_unescaped.substring( 0, i + 1 ), x.getImage() );
        }
    }

    @Test
    void suffix() throws IOException
    {
        CypherCharStream x = new CypherCharStream( Q1 );

        for ( int i = 0; i < Q1_offset.length; i++ )
        {
            x.readChar();
            for ( int j = 0; j < i + 1; j++ )
            {
                char[] expected = Q1_unescaped.substring( j, i + 1 ).toCharArray();
                char[] got = x.getSuffix( (i + 1) - j );
                assertArrayEquals( expected, got );
            }
        }
    }
}
