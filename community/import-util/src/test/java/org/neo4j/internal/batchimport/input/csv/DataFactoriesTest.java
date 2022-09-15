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
package org.neo4j.internal.batchimport.input.csv;

import org.junit.jupiter.api.Test;

import org.neo4j.csv.reader.CharReadable;
import org.neo4j.csv.reader.CharSeeker;
import org.neo4j.csv.reader.CharSeekers;
import org.neo4j.csv.reader.Configuration;
import org.neo4j.csv.reader.Extractor;
import org.neo4j.csv.reader.Extractors;
import org.neo4j.csv.reader.MultiReadable;
import org.neo4j.csv.reader.Readables;
import org.neo4j.function.IOFunctions;
import org.neo4j.internal.batchimport.input.DuplicateHeaderException;
import org.neo4j.internal.batchimport.input.Groups;
import org.neo4j.internal.batchimport.input.IdType;
import org.neo4j.internal.batchimport.input.InputException;
import org.neo4j.values.storable.CSVHeaderInformation;
import org.neo4j.values.storable.DateTimeValue;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.TimeValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.csv.reader.Readables.wrap;
import static org.neo4j.internal.batchimport.input.csv.DataFactories.defaultFormatNodeFileHeader;
import static org.neo4j.internal.batchimport.input.csv.DataFactories.defaultFormatRelationshipFileHeader;
import static org.neo4j.internal.helpers.ArrayUtil.array;

public class DataFactoriesTest
{
    private static final int BUFFER_SIZE = 10_000;
    private static final Configuration COMMAS = Configuration.COMMAS.toBuilder().withBufferSize( BUFFER_SIZE ).build();
    private static final Configuration TABS = Configuration.TABS.toBuilder().withBufferSize( BUFFER_SIZE ).build();

    private final Groups groups = new Groups();

    @Test
    public void shouldParseDefaultNodeFileHeaderCorrectly() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "ID:ID,label-one:label,also-labels:LABEL,name,age:long,location:Point{crs:WGS-84}" );
        IdType idType = IdType.STRING;
        Extractors extractors = new Extractors( ',' );

        // WHEN
        Header header = defaultFormatNodeFileHeader().create( seeker, COMMAS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( "ID", Type.ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( "label-one", Type.LABEL, extractors.stringArray() ),
                entry( "also-labels", Type.LABEL, extractors.stringArray() ),
                entry( "name", Type.PROPERTY, extractors.string() ),
                entry( "age", Type.PROPERTY, extractors.long_() ),
                entry( "location", Type.PROPERTY, extractors.point(), PointValue.parseHeaderInformation( "{crs:WGS-84}" ) )
        ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldParseNodeArrayTypesHeaderCorrectly() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "ID:ID,longArray:long[],pointArray:Point[]{crs:WGS-84},timeArray:time[]{timezone:+02:00}," +
                                    "dateTimeArray:datetime[]{timezone:+02:00}" );
        IdType idType = IdType.STRING;
        Extractors extractors = new Extractors( ',' );

        // WHEN
        Header header = defaultFormatNodeFileHeader().create( seeker, COMMAS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( "ID", Type.ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( "longArray", Type.PROPERTY, extractors.longArray() ),
                entry( "pointArray", Type.PROPERTY, extractors.pointArray(), PointValue.parseHeaderInformation( "{crs:WGS-84}" ) ),
                entry( "timeArray", Type.PROPERTY, extractors.timeArray(), TimeValue.parseHeaderInformation( "{timezone:+02:00}" ) ),
                entry( "dateTimeArray", Type.PROPERTY, extractors.dateTimeArray(), DateTimeValue.parseHeaderInformation( "{timezone:+02:00}" ) )
                           ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldParseDefaultRelationshipFileHeaderCorrectly() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( ":START_ID\t:END_ID\ttype:TYPE\tdate:long\tmore:long[]" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );

        // WHEN
        Header header = defaultFormatRelationshipFileHeader().create( seeker, TABS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( null, Type.START_ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( null, Type.END_ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( "type", Type.TYPE, extractors.string() ),
                entry( "date", Type.PROPERTY, extractors.long_() ),
                entry( "more", Type.PROPERTY, extractors.longArray() ) ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldParsetRelationshipArrayTypesFileHeaderCorrectly() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( ":START_ID\t:END_ID\ttype:TYPE\tlongArray:long[]\tpointArray:Point[]{crs:WGS-84}" +
                                    "\ttimeArray:time[]{timezone:+02:00}\tdateTimeArray:datetime[]{timezone:+02:00}" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );

        // WHEN
        Header header = defaultFormatRelationshipFileHeader().create( seeker, TABS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( null, Type.START_ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( null, Type.END_ID, CsvInput.idExtractor( idType, extractors ) ),
                entry( "type", Type.TYPE, extractors.string() ),
                entry( "longArray", Type.PROPERTY, extractors.longArray() ),
                entry( "pointArray", Type.PROPERTY, extractors.pointArray(), PointValue.parseHeaderInformation( "{crs:WGS-84}" ) ),
                entry( "timeArray", Type.PROPERTY, extractors.timeArray(), TimeValue.parseHeaderInformation( "{timezone:+02:00}" ) ),
                entry( "dateTimeArray", Type.PROPERTY, extractors.dateTimeArray(), DateTimeValue.parseHeaderInformation( "{timezone:+02:00}" ) )
        ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldHaveEmptyHeadersBeInterpretedAsIgnored() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "one:id\ttwo\t\tdate:long" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );

        // WHEN
        Header header = defaultFormatNodeFileHeader().create( seeker, TABS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( "one", Type.ID, extractors.long_() ),
                entry( "two", Type.PROPERTY, extractors.string() ),
                entry( null, Type.IGNORE, null ),
                entry( "date", Type.PROPERTY, extractors.long_() ) ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldFailForDuplicatePropertyHeaderEntries() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "one:id\tname\tname:long" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );

        var e = assertThrows( DuplicateHeaderException.class, () -> defaultFormatNodeFileHeader().create( seeker, TABS, idType, groups ) );
        assertEquals( entry( "name", Type.PROPERTY, extractors.string() ), e.getFirst() );
        assertEquals( entry( "name", Type.PROPERTY, extractors.long_() ), e.getOther() );
        seeker.close();
    }

    @Test
    public void shouldFailForDuplicateIdHeaderEntries() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "one:id\ttwo:id" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );

        var e = assertThrows( DuplicateHeaderException.class, () -> defaultFormatNodeFileHeader().create( seeker, TABS, idType, groups ) );
        assertEquals( entry( "one", Type.ID, extractors.long_() ), e.getFirst() );
        assertEquals( entry( "two", Type.ID, extractors.long_() ), e.getOther() );
    }

    @Test
    public void shouldAllowMissingIdHeaderEntry() throws Exception
    {
        // GIVEN
        CharSeeker seeker = seeker( "one\ttwo" );
        Extractors extractors = new Extractors( ';' );

        // WHEN
        Header header = defaultFormatNodeFileHeader().create( seeker, TABS, IdType.ACTUAL, groups );

        // THEN
        assertArrayEquals( array(
                entry( "one", Type.PROPERTY, extractors.string() ),
                entry( "two", Type.PROPERTY, extractors.string() ) ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldParseHeaderFromFirstLineOfFirstInputFile() throws Exception
    {
        // GIVEN
        final CharReadable firstSource = wrap( "id:ID\tname:String\tbirth_date:long" );
        final CharReadable secondSource = wrap( "0\tThe node\t123456789" );
        DataFactory dataFactory = DataFactories.data( value -> value,
                () -> new MultiReadable( Readables.iterator( IOFunctions.identity(), firstSource, secondSource ) ) );
        Header.Factory headerFactory = defaultFormatNodeFileHeader();
        Extractors extractors = new Extractors( ';' );

        // WHEN
        CharSeeker seeker = CharSeekers.charSeeker( new MultiReadable( dataFactory.create( TABS ).stream() ), TABS, false );
        Header header = headerFactory.create( seeker, TABS, IdType.ACTUAL, groups );

        // THEN
        assertArrayEquals( array(
                entry( "id", Type.ID, extractors.long_() ),
                entry( "name", Type.PROPERTY, extractors.string() ),
                entry( "birth_date", Type.PROPERTY, extractors.long_() ) ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldParseGroupName() throws Exception
    {
        // GIVEN
        String groupOneName = "GroupOne";
        String groupTwoName = "GroupTwo";
        CharSeeker seeker = seeker( ":START_ID(" + groupOneName + ")\t:END_ID(" + groupTwoName + ")\ttype:TYPE\tdate:long\tmore:long[]" );
        IdType idType = IdType.ACTUAL;
        Extractors extractors = new Extractors( '\t' );
        groups.getOrCreate( groupOneName );
        groups.getOrCreate( groupTwoName );

        // WHEN
        Header header = defaultFormatRelationshipFileHeader().create( seeker, TABS, idType, groups );

        // THEN
        assertArrayEquals( array(
                entry( null, Type.START_ID, "GroupOne", CsvInput.idExtractor( idType, extractors ) ),
                entry( null, Type.END_ID, "GroupTwo", CsvInput.idExtractor( idType, extractors ) ),
                entry( "type", Type.TYPE, extractors.string() ),
                entry( "date", Type.PROPERTY, extractors.long_() ),
                entry( "more", Type.PROPERTY, extractors.longArray() ) ), header.entries() );
        seeker.close();
    }

    @Test
    public void shouldFailOnUnexpectedNodeHeaderType()
    {
        // GIVEN
        CharSeeker seeker = seeker( ":ID,:START_ID" );
        IdType idType = IdType.ACTUAL;

        // WHEN
        var e = assertThrows( InputException.class, () -> defaultFormatNodeFileHeader().create( seeker, COMMAS, idType, groups ) );
        assertThat( e.getMessage() ).contains( "START_ID" );
    }

    @Test
    public void shouldFailOnUnexpectedRelationshipHeaderType()
    {
        // GIVEN
        CharSeeker seeker = seeker( ":LABEL,:START_ID,:END_ID,:TYPE" );
        IdType idType = IdType.ACTUAL;

        // WHEN
        var e = assertThrows( InputException.class, () -> defaultFormatRelationshipFileHeader().create( seeker, COMMAS, idType, groups ) );
        assertThat( e.getMessage() ).contains( "LABEL" );
    }

    private static final Configuration SEEKER_CONFIG = Configuration.TABS.toBuilder().withBufferSize( 1000 ).build();

    private static CharSeeker seeker( String data )
    {
        return CharSeekers.charSeeker( wrap( data ), SEEKER_CONFIG, false );
    }

    private Header.Entry entry( String name, Type type, Extractor<?> extractor )
    {
        return entry( name, type, null, extractor );
    }
    private Header.Entry entry( String name, Type type, Extractor<?> extractor, CSVHeaderInformation optionalParameter )
    {
        return new Header.Entry( name, type, groups.getOrCreate( null ), extractor, optionalParameter );
    }

    private Header.Entry entry( String name, Type type, String groupName, Extractor<?> extractor )
    {
        return new Header.Entry( name, type, groups.getOrCreate( groupName ), extractor );
    }
}
