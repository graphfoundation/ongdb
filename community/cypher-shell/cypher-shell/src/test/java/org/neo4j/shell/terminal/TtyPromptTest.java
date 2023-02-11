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
package org.neo4j.shell.terminal;

import org.jline.terminal.Attributes;
import org.jline.terminal.impl.ExecPty;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class TtyPromptTest
{

    @Test
    void readLineUtf8() throws IOException
    {
        readLineTest( UTF_8 );
    }

    @Test
    void readLineIso8859_1() throws IOException
    {
        readLineTest( ISO_8859_1 );
    }

    @Test
    void readLineUsAscii() throws IOException
    {
        readLineTest( StandardCharsets.US_ASCII );
    }

    private void readLineTest( Charset charset ) throws IOException
    {
        assertRead( "one line\n", "one line", charset );
        assertRead( "one line\r", "one line", charset );
        assertRead( "one line\r\n", "one line", charset );
        assertRead( "one line\nand more", "one line", charset );
        assertRead( "one line with tab \t\n", "one line with tab \t", charset );
        assertRead( "\n", "", charset );
        assertRead( "incomplete line", null, charset );
        assertRead( "", null, charset );
    }

    @Test
    void readPasswordUtf8() throws IOException
    {
        readPasswordTest( UTF_8 );
    }

    @Test
    void readPasswordIso8859() throws IOException
    {
        readPasswordTest( ISO_8859_1 );
    }

    @Test
    void readPasswordUsAscii() throws IOException
    {
        readPasswordTest( StandardCharsets.US_ASCII );
    }

    private void readPasswordTest( Charset charset ) throws IOException
    {
        assertReadPassword( "one line\n", "one line", charset );
        assertReadPassword( "one line\r", "one line", charset );
        assertReadPassword( "one line\r\n", "one line", charset );
        assertReadPassword( "one line\nand more", "one line", charset );
        assertReadPassword( "one line with tab \t\n", "one line with tab \t", charset );
        assertReadPassword( "\n", "", charset );
        assertReadPassword( "incomplete line", null, charset );
        assertReadPassword( "", null, charset );
    }

    @Test
    void readSpecialCharacters() throws IOException
    {
        assertRead( "åäö😅\n", "åäö😅", UTF_8 );
        assertRead( "åäö\n", "åäö", ISO_8859_1 );
        assertReadPassword( "åäö🐞\n", "åäö🐞", UTF_8 );
        assertReadPassword( "åäö\n", "åäö", ISO_8859_1 );
    }

    @Test
    void readLineShouldNotSetAttributes() throws Exception
    {
        final var out = new ByteArrayOutputStream();
        final var mockPty = mock( ExecPty.class );
        final var attributes = new Attributes();
        attributes.setLocalFlag( Attributes.LocalFlag.ECHONL, true );
        when(mockPty.getAttr()).thenReturn( attributes );
        final var prompt = new TtyPrompt( mockPty, new ByteArrayInputStream( "\n".getBytes( UTF_8) ), out, Charset.defaultCharset() );
        prompt.readLine( ">" );

        verify(mockPty, times( 0 ) ).setAttr( any() );
    }

    @Test
    void readPasswordShouldRestoreAttributes() throws Exception
    {
        final var out = new ByteArrayOutputStream();
        final var mockPty = mock( ExecPty.class );
        final var attributes = new Attributes();
        attributes.setLocalFlag( Attributes.LocalFlag.ECHONL, true );
        when(mockPty.getAttr()).thenReturn( attributes );
        final var prompt = new TtyPrompt( mockPty, new ByteArrayInputStream( "\n".getBytes( UTF_8 ) ), out, Charset.defaultCharset() );
        prompt.readPassword( ">" );

        ArgumentCaptor<Attributes> attrCaptor = ArgumentCaptor.forClass( Attributes.class );
        verify( mockPty, times( 2 ) ).setAttr( attrCaptor.capture() );
        final var attrs = attrCaptor.getAllValues();

        final var attrsWithEchoOff = new Attributes( attributes );
        attrsWithEchoOff.setLocalFlag( Attributes.LocalFlag.ECHO, false );
        assertEqualAttributes( attrs.get(0), attrsWithEchoOff );

        assertEqualAttributes( attrs.get(1), attributes );
    }

    @Test
    void respectsSetFlagIUTF8() throws IOException
    {
        final var input = "åäö\n";
        final var output = new ByteArrayOutputStream();

        final var mockPty = mock( ExecPty.class );
        final var attributes = new Attributes();
        attributes.setInputFlag( Attributes.InputFlag.IUTF8, true );
        when(mockPty.getAttr()).thenReturn( attributes );
        final var prompt = new TtyPrompt( mockPty, new ByteArrayInputStream( input.getBytes( UTF_8 ) ), output, ISO_8859_1 );

        assertThat( prompt.readLine( "> " ), is( "åäö" ) );
    }

    @Test
    void respectsUnsetFlagIUTF8() throws IOException
    {
        final var input = "åäö\n";
        final var output = new ByteArrayOutputStream();

        final var mockPty = mock( ExecPty.class );
        final var attributes = new Attributes();
        attributes.setInputFlag( Attributes.InputFlag.IUTF8, false );
        when( mockPty.getAttr() ).thenReturn( attributes );
        final var prompt = new TtyPrompt( mockPty, new ByteArrayInputStream( input.getBytes( ISO_8859_1 ) ), output, ISO_8859_1 );

        assertThat( prompt.readLine( "> " ), is( "åäö" ) );
    }

    private void assertRead( String input, String expected, Charset defaultCharset ) throws IOException
    {
        final var out = new ByteArrayOutputStream();
        assertThat( newTtyPrompt( input, out, defaultCharset ).readLine( "Read me: " ), is( expected ) );
        assertThat( out.toString( defaultCharset ), is( "Read me: " ) );
    }

    private void assertReadPassword( String input, String expected, Charset defaultCharset ) throws IOException
    {
        final var out = new ByteArrayOutputStream();
        assertThat( newTtyPrompt( input, out, defaultCharset ).readPassword( "Read me: " ), is( expected ) );

        if ( input.contains( "\n" ) || input.contains( "\r" ) )
        {
            assertThat( out.toString(), is( "Read me: " + System.lineSeparator() ) );
        }
        else
        {
            assertThat( out.toString(), is( "Read me: " ) );
        }
    }

    private TtyPrompt newTtyPrompt( String input, OutputStream out, Charset charset ) throws IOException
    {
        final var mockPty = mock( ExecPty.class );
        final var attributes = new Attributes();
        when( mockPty.getAttr() ).thenReturn( attributes );
        return new TtyPrompt( mockPty, new ByteArrayInputStream( input.getBytes(charset) ), out, charset );
    }

    private void assertEqualAttributes( Attributes attributes, Attributes expected )
    {
        assertThat( attributes.getControlChars(), is( expected.getControlChars() ) );
        assertThat( attributes.getControlFlags(), is( expected.getControlFlags() ) );
        assertThat( attributes.getInputFlags(), is( expected.getInputFlags() ) );
        assertThat( attributes.getLocalFlags(), is( expected.getLocalFlags() ) );
        assertThat( attributes.getOutputFlags(), is( expected.getOutputFlags() ) );
    }
}
