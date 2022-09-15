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
package org.neo4j.bolt.packstream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.DateTimeValue;
import org.neo4j.values.storable.DateValue;
import org.neo4j.values.storable.DurationValue;
import org.neo4j.values.storable.LocalDateTimeValue;
import org.neo4j.values.storable.LocalTimeValue;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.TimeValue;
import org.neo4j.values.storable.TimeZones;
import org.neo4j.values.virtual.ListValue;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.ZoneOffset.UTC;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.bolt.packstream.PackStream.INT_16;
import static org.neo4j.bolt.packstream.PackStream.INT_32;
import static org.neo4j.values.storable.CoordinateReferenceSystem.Cartesian;
import static org.neo4j.values.storable.CoordinateReferenceSystem.Cartesian_3D;
import static org.neo4j.values.storable.CoordinateReferenceSystem.WGS84;
import static org.neo4j.values.storable.CoordinateReferenceSystem.WGS84_3D;
import static org.neo4j.values.storable.DateTimeValue.datetime;
import static org.neo4j.values.storable.Values.doubleValue;
import static org.neo4j.values.storable.Values.intValue;
import static org.neo4j.values.storable.Values.unsafePointValue;
import static org.neo4j.values.virtual.VirtualValues.list;

@ExtendWith( RandomExtension.class )
public class Neo4jPackV2Test
{
    private static final String[] TIME_ZONE_NAMES =
            TimeZones.supportedTimeZones().stream()
                    .filter( s -> ZoneId.getAvailableZoneIds().contains( s ) )
                    .toArray( String[]::new );

    private static final int RANDOM_VALUES_TO_TEST = 1_000;
    private static final int RANDOM_LISTS_TO_TEST = 1_000;
    private static final int RANDOM_LIST_MAX_SIZE = 500;

    @Inject
    public RandomSupport random;

    @Test
    void shouldFailToPackPointWithIllegalDimensions()
    {
        testPackingPointsWithWrongDimensions( 0 );
        testPackingPointsWithWrongDimensions( 1 );
        testPackingPointsWithWrongDimensions( 4 );
        testPackingPointsWithWrongDimensions( 100 );
    }

    @Test
    void shouldFailToUnpack2DPointWithIncorrectCoordinate() throws IOException
    {
        Neo4jPackV2 neo4jPack = new Neo4jPackV2();
        PackedOutputArray output = new PackedOutputArray();
        Neo4jPack.Packer packer = neo4jPack.newPacker( output );

        packer.packStructHeader( 3, Neo4jPackV2.POINT_2D );
        packer.pack( intValue( WGS84.getCode() ) );
        packer.pack( doubleValue( 42.42 ) );

        assertThrows(UncheckedIOException.class, () -> unpack( output ) );
    }

    @Test
    void shouldFailToUnpack3DPointWithIncorrectCoordinate() throws IOException
    {
        Neo4jPackV2 neo4jPack = new Neo4jPackV2();
        PackedOutputArray output = new PackedOutputArray();
        Neo4jPack.Packer packer = neo4jPack.newPacker( output );

        packer.packStructHeader( 4, Neo4jPackV2.POINT_3D );
        packer.pack( intValue( Cartesian.getCode() ) );
        packer.pack( doubleValue( 1.0 ) );
        packer.pack( doubleValue( 100.1 ) );

        assertThrows( UncheckedIOException.class, () -> unpack( output ) );
    }

    @Test
    void shouldPackAndUnpack2DPoints()
    {
        testPackingAndUnpacking( this::randomPoint2D );
    }

    @Test
    void shouldPackAndUnpack3DPoints()
    {
        testPackingAndUnpacking( this::randomPoint3D );
    }

    @Test
    void shouldPackAndUnpackListsOf2DPoints()
    {
        testPackingAndUnpacking( () -> randomList( this::randomPoint2D ) );
    }

    @Test
    void shouldPackAndUnpackListsOf3DPoints()
    {
        testPackingAndUnpacking( () -> randomList( this::randomPoint3D ) );
    }

    @Test
    void shouldPackAndUnpackDuration()
    {
        testPackingAndUnpacking( this::randomDuration );
    }

    @Test
    void shouldPackAndUnpackPeriod()
    {
        testPackingAndUnpacking( this::randomPeriod );
    }

    @Test
    void shouldPackAndUnpackListsOfDuration()
    {
        testPackingAndUnpacking( () -> randomList( this::randomDuration ) );
    }

    @Test
    void shouldPackAndUnpackDate()
    {
        testPackingAndUnpacking( this::randomDate );
    }

    @Test
    void shouldPackAndUnpackListsOfDate()
    {
        testPackingAndUnpacking( () -> randomList( this::randomDate ) );
    }

    @Test
    void shouldPackAndUnpackLocalTime()
    {
        testPackingAndUnpacking( this::randomLocalTime );
    }

    @Test
    void shouldPackAndUnpackListsOfLocalTime()
    {
        testPackingAndUnpacking( () -> randomList( this::randomLocalTime ) );
    }

    @Test
    void shouldPackAndUnpackTime()
    {
        testPackingAndUnpacking( this::randomTime );
    }

    @Test
    void shouldPackAndUnpackListsOfTime()
    {
        testPackingAndUnpacking( () -> randomList( this::randomTime ) );
    }

    @Test
    void shouldPackAndUnpackLocalDateTime()
    {
        testPackingAndUnpacking( this::randomLocalDateTime );
    }

    @Test
    void shouldPackAndUnpackListsOfLocalDateTime()
    {
        testPackingAndUnpacking( () -> randomList( this::randomLocalDateTime ) );
    }

    @Test
    void shouldPackAndUnpackDateTimeWithTimeZoneName()
    {
        testPackingAndUnpacking( this::randomDateTimeWithTimeZoneName );
    }

    @Test
    void shouldPackAndUnpackListsOfDateTimeWithTimeZoneName()
    {
        testPackingAndUnpacking( () -> randomList( this::randomDateTimeWithTimeZoneName ) );
    }

    @Test
    void shouldPackAndUnpackDateTimeWithTimeZoneOffset()
    {
        testPackingAndUnpacking( this::randomDateTimeWithTimeZoneOffset );
    }

    @Test
    void shouldPackAndUnpackListsOfDateTimeWithTimeZoneOffset()
    {
        testPackingAndUnpacking( () -> randomList( this::randomDateTimeWithTimeZoneOffset ) );
    }

    @Test
    void shouldPackLocalDateTimeWithTimeZoneOffset()
    {
        LocalDateTime localDateTime = LocalDateTime.of( 2015, 3, 23, 19, 15, 59, 10 );
        ZoneOffset offset = ZoneOffset.ofHoursMinutes( -5, -15 );
        ZonedDateTime zonedDateTime = ZonedDateTime.of( localDateTime, offset );

        PackedOutputArray packedOutput = pack( datetime( zonedDateTime ) );
        ByteBuffer buffer = ByteBuffer.wrap( packedOutput.bytes() );

        buffer.getShort(); // skip struct header
        assertEquals( INT_32, buffer.get() );
        assertEquals( localDateTime.toEpochSecond( UTC ), buffer.getInt() );
        assertEquals( localDateTime.getNano(), buffer.get() );
        assertEquals( INT_16, buffer.get() );
        assertEquals( offset.getTotalSeconds(), buffer.getShort() );
    }

    @Test
    void shouldPackLocalDateTimeWithTimeZoneId()
    {
        LocalDateTime localDateTime = LocalDateTime.of( 1999, 12, 30, 9, 49, 20, 999999999 );
        ZoneId zoneId = ZoneId.of( "Europe/Stockholm" );
        ZonedDateTime zonedDateTime = ZonedDateTime.of( localDateTime, zoneId );

        PackedOutputArray packedOutput = pack( datetime( zonedDateTime ) );
        ByteBuffer buffer = ByteBuffer.wrap( packedOutput.bytes() );

        buffer.getShort(); // skip struct header
        assertEquals( INT_32, buffer.get() );
        assertEquals( localDateTime.toEpochSecond( UTC ), buffer.getInt() );
        assertEquals( INT_32, buffer.get() );
        assertEquals( localDateTime.getNano(), buffer.getInt() );
        buffer.getShort(); // skip zoneId string header
        byte[] zoneIdBytes = new byte[zoneId.getId().getBytes( UTF_8 ).length];
        buffer.get( zoneIdBytes );
        assertEquals( zoneId.getId(), new String( zoneIdBytes, UTF_8 ) );
    }

    private static <T extends AnyValue> void testPackingAndUnpacking( Supplier<T> randomValueGenerator )
    {
        testPackingAndUnpacking( index -> randomValueGenerator.get() );
    }

    private static <T extends AnyValue> void testPackingAndUnpacking( Function<Integer,T> randomValueGenerator )
    {
        IntStream.range( 0, RANDOM_VALUES_TO_TEST )
                .mapToObj( randomValueGenerator::apply )
                .forEach( originalValue ->
                {
                    T unpackedValue = packAndUnpack( originalValue );
                    assertEquals( originalValue, unpackedValue );
                } );
    }

    private void testPackingPointsWithWrongDimensions( int dimensions )
    {
        PointValue point = randomPoint( 0, dimensions );
        assertThrows(IllegalArgumentException.class, () -> pack( point ) );
    }

    private static <T extends AnyValue> T packAndUnpack( T value )
    {
        return unpack( pack( value ) );
    }

    private static PackedOutputArray pack( AnyValue value )
    {
        try
        {
            Neo4jPackV2 neo4jPack = new Neo4jPackV2();
            PackedOutputArray output = new PackedOutputArray();
            Neo4jPack.Packer packer = neo4jPack.newPacker( output );
            packer.pack( value );
            return output;
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @SuppressWarnings( "unchecked" )
    private static <T extends AnyValue> T unpack( PackedOutputArray output )
    {
        try
        {
            Neo4jPackV2 neo4jPack = new Neo4jPackV2();
            PackedInputArray input = new PackedInputArray( output.bytes() );
            Neo4jPack.Unpacker unpacker = neo4jPack.newUnpacker( input );
            AnyValue unpack = unpacker.unpack();
            return (T) unpack;
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private <T extends AnyValue> ListValue randomList( Supplier<T> randomValueGenerator )
    {
        return randomList( index -> randomValueGenerator.get() );
    }

    private <T extends AnyValue> ListValue randomList( Function<Integer,T> randomValueGenerator )
    {
        AnyValue[] values = random.ints( RANDOM_LISTS_TO_TEST, 1, RANDOM_LIST_MAX_SIZE )
                .mapToObj( randomValueGenerator::apply )
                .toArray( AnyValue[]::new );

        return list( values );
    }

    private PointValue randomPoint2D( int index )
    {
        return randomPoint( index, 2 );
    }

    private PointValue randomPoint3D( int index )
    {
        return randomPoint( index, 3 );
    }

    private PointValue randomPoint( int index, int dimension )
    {
        CoordinateReferenceSystem crs;
        if ( index % 2 == 0 )
        {
            double[] coordinates;
            double x = random.doubles( 1, -180, 180 ).sum();
            double y = random.doubles( 1, -90, 90 ).sum();
            crs = WGS84_3D;
            if ( dimension == 2 )
            {
                crs = WGS84;
                coordinates = new double[]{x, y};
                return unsafePointValue( crs, coordinates );
            }
            if ( dimension == 3 )
            {
                double z = random.doubles( 1, Double.MIN_VALUE, Double.MAX_VALUE ).sum();
                coordinates = new double[]{x, y, z};
                return unsafePointValue( crs, coordinates );
            }
        }
        else
        {
            crs = dimension == 2 ? Cartesian : Cartesian_3D;
        }

        return unsafePointValue( crs, random.doubles( dimension, Double.MIN_VALUE, Double.MAX_VALUE ).toArray() );
    }

    private DurationValue randomDuration()
    {
        return random.randomValues().nextDuration();
    }

    private DurationValue randomPeriod()
    {
        return random.randomValues().nextPeriod();
    }

    private DateValue randomDate()
    {
        return random.randomValues().nextDateValue();
    }

    private LocalTimeValue randomLocalTime()
    {
        return random.randomValues().nextLocalTimeValue();
    }

    private TimeValue randomTime()
    {
        return random.randomValues().nextTimeValue();
    }

    private LocalDateTimeValue randomLocalDateTime()
    {
        return random.randomValues().nextLocalDateTimeValue();
    }

    private DateTimeValue randomDateTimeWithTimeZoneName()
    {
        return random.randomValues().nextDateTimeValue( randomZoneIdWithName() );
    }

    private DateTimeValue randomDateTimeWithTimeZoneOffset()
    {
        return random.randomValues().nextDateTimeValue( randomZoneOffset() );
    }

    private ZoneOffset randomZoneOffset()
    {
        return ZoneOffset.ofTotalSeconds( random.nextInt( ZoneOffset.MIN.getTotalSeconds(), ZoneOffset.MAX.getTotalSeconds() ) );
    }

    private ZoneId randomZoneIdWithName()
    {
        String timeZoneName = TIME_ZONE_NAMES[random.nextInt( TIME_ZONE_NAMES.length )];
        return ZoneId.of( timeZoneName );
    }
}
