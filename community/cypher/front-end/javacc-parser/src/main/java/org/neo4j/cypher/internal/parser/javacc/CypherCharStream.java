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

import java.io.IOException;

/**
 * CharStream operating over an input String.
 * <p>
 * This class unescapes escaped unicode characters, and to do that efficiently
 * it keeps an internal incremental copy of the input
 * <p>
 * <pre>
 * Example
 *      query: "WITH 1 AS x
 *              RETURN '\\u01FF' AS y"
 *     result: [W, I, T, H,  , 1,  , A, S,  , x,\n, R, E, T, U, R, N,  , ', ǿ, ',  , A, S,  , y]
 *      lines: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
 *    columns: [1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12, 1, 2, 3, 4, 5, 6, 7, 8, 9,16,17,18,19,20,21]
 *     offset: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,27,28,29,30,31,32]
 *                                                                          ^
 *                                                                          un-escaped unicode
 * </pre>
 * <p>
 * As parsing progresses, the {@link CypherCharStream} will convert more and more
 * of `query` into `result`, while updating `lines`, `columns` and `offset`.
 */
public class CypherCharStream implements CharStream
{
    private static final char BACKSLASH = '\\';
    private static final IOException END_OF_INPUT = new IOException( "End of input" );

    private final String query;
    private int queryCursor = -1;
    private int queryCursorColumn;
    private int queryCursorLine = 1;
    private boolean queryCursorIsCR;
    private boolean queryCursorIsLF;

    private char[] result;
    private int resultCursor = -1;
    private int resultHighMark;

    private final int[] lines;
    private final int[] columns;
    private final int[] offsets;

    private int beginOffset;

    private int tabSize = 1;

    public CypherCharStream( String query )
    {
        this.query = query;
        this.result = new char[query.length()];
        this.lines = new int[query.length()];
        this.columns = new int[query.length()];
        this.offsets = new int[query.length()];
    }

    @Override
    public char readChar() throws IOException
    {
        if ( resultCursor + 1 == resultHighMark )
        {
            convertChar();
        }
        resultCursor++;

        return result[resultCursor];
    }

    private void convertChar() throws IOException
    {
        char c = nextQueryChar();

        if ( c == BACKSLASH )
        {
            char c2 = nextQueryChar();
            if ( c2 == 'u' )
            {
                c = convertUnicode( c2 );
            }
            else
            {
                appendToResult( c );
                c = c2;
            }
        }

        appendToResult( c );
    }

    private void appendToResult( char c )
    {
        result[resultHighMark] = c;
        lines[resultHighMark] = queryCursorLine;
        columns[resultHighMark] = queryCursorColumn;
        offsets[resultHighMark] = queryCursor;
        resultHighMark++;
    }

    private char nextQueryChar() throws IOException
    {
        if ( queryCursor + 1 >= query.length() )
        {
            throw END_OF_INPUT;
        }
        queryCursor++;

        char c = query.charAt( queryCursor );
        updateLineColumn( c );

        return c;
    }

    private void updateLineColumn( char c )
    {
        queryCursorColumn++;

        if ( queryCursorIsLF )
        {
            queryCursorIsLF = false;
            queryCursorColumn = 1;
            queryCursorLine++;
        }
        else if ( queryCursorIsCR )
        {
            queryCursorIsCR = false;
            if ( c == '\n' )
            {
                queryCursorIsLF = true;
            }
            else
            {
                queryCursorColumn = 1;
                queryCursorLine++;
            }
        }

        switch ( c )
        {
        case '\r':
            queryCursorIsCR = true;
            break;
        case '\n':
            queryCursorIsLF = true;
            break;
        case '\t':
            queryCursorColumn--;
            queryCursorColumn += tabSize - (queryCursorColumn % tabSize);
            break;
        default:
            break;
        }
    }

    private char convertUnicode( char c )
    {
        try
        {
            while ( c == 'u' )
            {
                c = nextQueryChar();
            }

            return (char) (hexval( c ) << 12 |
                           hexval( nextQueryChar() ) << 8 |
                           hexval( nextQueryChar() ) << 4 |
                           hexval( nextQueryChar() ));
        }
        catch ( final IOException e )
        {
            throw new InvalidUnicodeLiteral( e.getMessage(), queryCursor, queryCursorLine, queryCursorColumn );
        }
    }

    @Override
    public void backup( int amount )
    {
        resultCursor -= amount;
    }

    @Override
    public int getBeginColumn()
    {
        return columns[beginOffset];
    }

    @Override
    public int getBeginLine()
    {
        return lines[beginOffset];
    }

    public int getBeginOffset()
    {
        return offsets[beginOffset];
    }

    @Override
    public int getEndColumn()
    {
        return columns[resultCursor];
    }

    @Override
    public int getEndLine()
    {
        return lines[resultCursor];
    }

    public int getEndOffset()
    {
        return offsets[resultCursor];
    }

    @Override
    public char beginToken() throws IOException
    {
        var c = readChar();
        beginOffset = resultCursor;
        return c;
    }

    @Override
    public String getImage()
    {
        return new String( result, beginOffset, nextOffset() - beginOffset );
    }

    private int nextOffset()
    {
        return resultCursor + 1;
    }

    @Override
    public char[] getSuffix( int len )
    {
        char[] suffix = new char[len];
        int endOffset = nextOffset();
        System.arraycopy( result, endOffset - len, suffix, 0, len );
        return suffix;
    }

    @Override
    public void done()
    {
    }

    @Override
    public void setTabSize( int i )
    {
        throw new UnsupportedOperationException( "not implemented" );
    }

    @Override
    public int getTabSize()
    {
        throw new UnsupportedOperationException( "not implemented" );
    }

    @Override
    public void setTrackLineColumn( boolean trackLineColumn )
    {
        throw new UnsupportedOperationException( "not implemented" );
    }

    @Override
    public boolean isTrackLineColumn()
    {
        return true;
    }

    static int hexval( final char c ) throws IOException
    {
        switch ( c )
        {
        case '0':
            return 0;
        case '1':
            return 1;
        case '2':
            return 2;
        case '3':
            return 3;
        case '4':
            return 4;
        case '5':
            return 5;
        case '6':
            return 6;
        case '7':
            return 7;
        case '8':
            return 8;
        case '9':
            return 9;
        case 'a':
        case 'A':
            return 10;
        case 'b':
        case 'B':
            return 11;
        case 'c':
        case 'C':
            return 12;
        case 'd':
        case 'D':
            return 13;
        case 'e':
        case 'E':
            return 14;
        case 'f':
        case 'F':
            return 15;
        default:
            throw new IOException( "Invalid input '" + c + "': expected four hexadecimal digits specifying a unicode character" );
        }
    }
}
