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
package org.neo4j.csv.reader;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.util.Arrays.copyOfRange;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestDirectoryExtension
class ReadablesTest
{
    @Inject
    private TestDirectory directory;

    interface ReadMethod
    {
        char[] read( CharReadable readable, int length ) throws IOException;
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldReadTextCompressedInZipArchiveWithSingleFileIn( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijlkmnopqrstuvxyz";

        // WHEN
        Path compressed = compressWithZip( text );

        // THEN
        assertReadText( compressed, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldReadTextCompressedInGZipFile( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijlkmnopqrstuvxyz";

        // WHEN
        Path compressed = compressWithGZip( text );

        // THEN
        assertReadText( compressed, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldReadPlainTextFile( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijlkmnopqrstuvxyz";

        // WHEN
        Path plainText = write( text );

        // THEN
        assertReadText( plainText, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldReadTheOnlyRealFileInThere( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijlkmnopqrstuvxyz";

        // WHEN
        Path compressed = compressWithZip( text, ".nothing", ".DS_Store", "__MACOSX/", "__MACOSX/file" );

        // THEN
        assertReadText( compressed, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldFailWhenThereAreMoreThanOneSuitableFileInThere( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijlkmnopqrstuvxyz";
        Path compressed = compressWithZip( text, ".nothing", ".DS_Store", "somewhere/something" );

        // WHEN
        IOException exception = assertThrows( IOException.class, () -> Readables.files( Charset.defaultCharset(), compressed ) );
        assertThat( exception.getMessage() ).contains( "Multiple" );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldTrackPosition( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String data = "1234567890";
        //                 ^   ^
        CharReadable reader = Readables.wrap( data );
        SectionedCharBuffer buffer = new SectionedCharBuffer( 4 );

        // WHEN
        int expected = 0;
        do
        {
            buffer = reader.read( buffer, buffer.front() );
            expected += buffer.available();

            // THEN
            assertEquals( expected, reader.position() );
        }
        while ( buffer.hasAvailable() );

        // and THEN
        assertEquals( data.toCharArray().length, expected );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldComplyWithUtf8CharsetForExample( ReadMethod readMethod ) throws Exception
    {
        shouldComplyWithSpecifiedCharset( StandardCharsets.UTF_8 );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldComplyWithIso88591CharsetForExample( ReadMethod readMethod ) throws Exception
    {
        shouldComplyWithSpecifiedCharset( StandardCharsets.ISO_8859_1 );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldSkipBOM( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijklmnop";

        // WHEN/THEN
        shouldReadTextFromFileWithBom( Magic.BOM_UTF_32_BE, text, readMethod );
        shouldReadTextFromFileWithBom( Magic.BOM_UTF_32_LE, text, readMethod );
        shouldReadTextFromFileWithBom( Magic.BOM_UTF_16_BE, text, readMethod );
        shouldReadTextFromFileWithBom( Magic.BOM_UTF_16_LE, text, readMethod );
        shouldReadTextFromFileWithBom( Magic.BOM_UTF_8, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldReadTextFromWrappedInputStream( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijklmnop";

        // WHEN
        Path file = writeToFile( text, Charset.defaultCharset() );

        // THEN
        assertReadTextAsInputStream( file, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldSkipBomWhenWrappingInputStream( ReadMethod readMethod ) throws Exception
    {
        // GIVEN
        String text = "abcdefghijklmnop";

        // WHEN/THEN
        shouldReadTextFromInputStreamWithBom( Magic.BOM_UTF_32_BE, text, readMethod );
        shouldReadTextFromInputStreamWithBom( Magic.BOM_UTF_32_LE, text, readMethod );
        shouldReadTextFromInputStreamWithBom( Magic.BOM_UTF_16_BE, text, readMethod );
        shouldReadTextFromInputStreamWithBom( Magic.BOM_UTF_16_LE, text, readMethod );
        shouldReadTextFromInputStreamWithBom( Magic.BOM_UTF_8, text, readMethod );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldExtractFirstLine( ReadMethod readMethod ) throws Exception
    {
        // given
        String firstLine = "characters of first line";
        String secondLine = "here on the second line";
        CharReadable reader = Readables.wrap( firstLine + "\n" + secondLine );

        // when
        char[] firstLineCharacters = Readables.extractFirstLineFrom( reader );
        char[] secondLineCharacters = new char[secondLine.length()];
        reader.read( secondLineCharacters, 0, secondLineCharacters.length );

        // then
        assertArrayEquals( firstLine.toCharArray(), firstLineCharacters );
        assertArrayEquals( secondLine.toCharArray(), secondLineCharacters );
    }

    @ParameterizedTest( name = "read method {index}" )
    @MethodSource( "parameters" )
    void shouldExtractOnlyLine( ReadMethod readMethod ) throws Exception
    {
        // given
        String firstLine = "characters of only line";
        CharReadable reader = Readables.wrap( firstLine );

        // when
        char[] firstLineCharacters = Readables.extractFirstLineFrom( reader );
        int readAfterwards = reader.read( new char[1], 0, 1 );

        // then
        assertArrayEquals( firstLine.toCharArray(), firstLineCharacters );
        assertEquals( -1, readAfterwards );
    }

    private void shouldReadTextFromFileWithBom( Magic bom, String text, ReadMethod readMethod ) throws IOException
    {
        assertReadText( writeToFile( bom.bytes(), text, bom.encoding() ), text, readMethod );
    }

    private void shouldReadTextFromInputStreamWithBom( Magic bom, String text, ReadMethod readMethod ) throws IOException
    {
        assertReadTextAsInputStream( writeToFile( bom.bytes(), text, bom.encoding() ), text, readMethod );
    }

    private void shouldComplyWithSpecifiedCharset( Charset charset ) throws Exception
    {
        // GIVEN
        String data = "abcåäö[]{}";
        Path file = writeToFile( data, charset );

        // WHEN
        CharReadable reader = Readables.files( charset, file );
        SectionedCharBuffer buffer = new SectionedCharBuffer( 100 );
        buffer = reader.read( buffer, buffer.front() );

        // THEN
        char[] expected = data.toCharArray();
        char[] array = buffer.array();
        assertEquals( expected.length, buffer.available() );
        for ( int i = 0; i < expected.length; i++ )
        {
            assertEquals( expected[i], array[buffer.pivot() + i] );
        }
    }

    private Path writeToFile( String data, Charset charset ) throws IOException
    {
        Path file = directory.homePath().resolve( "text-" + charset.name() );
        try ( Writer writer = new OutputStreamWriter( Files.newOutputStream( file ), charset ) )
        {
            writer.append( data );
        }
        return file;
    }

    private Path writeToFile( byte[] header, String data, Charset charset ) throws IOException
    {
        Path file = directory.homePath().resolve( "text-" + charset.name() );
        try ( OutputStream out = Files.newOutputStream( file );
            Writer writer = new OutputStreamWriter( out, charset ) )
        {
            out.write( header );
            writer.append( data );
        }
        return file;
    }

    private Path write( String text ) throws IOException
    {
        Path file = directory.file( "plain-text" );
        try ( OutputStream out = Files.newOutputStream( file ) )
        {
            out.write( text.getBytes() );
        }
        return file;
    }

    private Path compressWithZip( String text, String... otherEntries ) throws IOException
    {
        Path file = directory.file( "compressed" );
        try ( ZipOutputStream out = new ZipOutputStream( Files.newOutputStream( file ) ) )
        {
            for ( String otherEntry : otherEntries )
            {
                out.putNextEntry( new ZipEntry( otherEntry ) );
            }

            out.putNextEntry( new ZipEntry( "file" ) );
            out.write( text.getBytes() );
        }
        return file;
    }

    private Path compressWithGZip( String text ) throws IOException
    {
        Path file = directory.file( "compressed" );
        try ( GZIPOutputStream out = new GZIPOutputStream( Files.newOutputStream( file ) ) )
        {
            out.write( text.getBytes() );
        }
        return file;
    }

    private static void assertReadText( Path file, String text, ReadMethod readMethod ) throws IOException
    {
        assertReadText( Readables.files( Charset.defaultCharset(), file ), text, readMethod );
    }

    private static void assertReadTextAsInputStream( Path file, String text, ReadMethod readMethod ) throws IOException
    {
        try ( InputStream stream = Files.newInputStream( file ) )
        {
            assertReadText( Readables.wrap( stream, file.toString(), Charset.defaultCharset(), Files.size( file ) ), text, readMethod );
        }
    }

    private static void assertReadText( CharReadable readable, String text, ReadMethod readMethod ) throws IOException
    {
        char[] readText = readMethod.read( readable, text.toCharArray().length );
        assertArrayEquals( readText, text.toCharArray() );
    }

    private static Stream<Arguments> parameters()
    {
        return Stream.of(
                of( (ReadMethod) ( readable, length ) ->
                {
                    SectionedCharBuffer readText = new SectionedCharBuffer( length );
                    readable.read( readText, readText.front() );
                    return copyOfRange( readText.array(), readText.pivot(), readText.front() );
                } ),
                of( (ReadMethod) ( readable, length ) ->
                {
                    char[] result = new char[length];
                    readable.read( result, 0, length );
                    return result;
                } ) );
    }
}
