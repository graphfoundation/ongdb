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
package org.neo4j.kernel.impl.index.schema.fusion;

import org.assertj.core.api.Condition;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.Callable;

import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.DateValue;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.neo4j.kernel.impl.index.schema.fusion.IndexSlot.GENERIC;
import static org.neo4j.kernel.impl.index.schema.fusion.IndexSlot.LUCENE;

final class FusionIndexTestHelp
{
    private static final LabelSchemaDescriptor INDEX_KEY = SchemaDescriptors.forLabel( 0, 0 );
    private static final LabelSchemaDescriptor COMPOSITE_INDEX_KEY = SchemaDescriptors.forLabel( 0, 0, 1 );

    private static final Value[] stringValues = new Value[]
            {
                    Values.stringValue( "abc" ),
                    Values.stringValue( "abcdefghijklmnopqrstuvwxyzåäö" ),
                    Values.charValue( 'S' ),
            };
    private static final Value[] otherValues = new Value[]
            {
                    Values.byteValue( (byte) 1 ),
                    Values.shortValue( (short) 2 ),
                    Values.intValue( 3 ),
                    Values.longValue( 4 ),
                    Values.floatValue( 5.6f ),
                    Values.doubleValue( 7.8 ),
                    Values.pointValue( CoordinateReferenceSystem.Cartesian, 123.0, 456.0 ),
                    Values.pointValue( CoordinateReferenceSystem.Cartesian_3D, 123.0, 456.0, 789.0 ),
                    Values.pointValue( CoordinateReferenceSystem.WGS84, 13.2, 56.8 ),
                    DateValue.epochDate( 1 ),
                    DateValue.epochDate( 10000 ),
                    Values.booleanValue( true ),
                    Values.booleanArray( new boolean[2] ),
                    Values.byteArray( new byte[]{1, 2} ),
                    Values.shortArray( new short[]{3, 4} ),
                    Values.intArray( new int[]{5, 6} ),
                    Values.longArray( new long[]{7, 8} ),
                    Values.floatArray( new float[]{9.10f, 11.12f} ),
                    Values.doubleArray( new double[]{13.14, 15.16} ),
                    Values.charArray( new char[2] ),
                    Values.stringArray( "a", "b" ),
                    Values.pointArray( new Value[]{
                            Values.pointValue( CoordinateReferenceSystem.Cartesian, 123.0, 456.0 ),
                            Values.pointValue( CoordinateReferenceSystem.Cartesian_3D, 123.0, 456.0, 789.0 ),
                            Values.pointValue( CoordinateReferenceSystem.WGS84, 13.2, 56.8 )
                    } ),
                    Values.NO_VALUE
            };

    private FusionIndexTestHelp()
    {
    }

    static Value[] valuesSupportedByLucene()
    {
        return stringValues;
    }

    static Value[] valuesNotSupportedBySpecificIndex()
    {
        return otherValues;
    }

    static Value[] allValues()
    {
        List<Value> values = new ArrayList<>();
        for ( Value[] group : valuesByGroup().values() )
        {
            values.addAll( Arrays.asList( group ) );
        }
        return values.toArray( new Value[0] );
    }

    static EnumMap<IndexSlot,Value[]> valuesByGroup()
    {
        EnumMap<IndexSlot,Value[]> values = new EnumMap<>( IndexSlot.class );
        values.put( GENERIC, FusionIndexTestHelp.valuesNotSupportedBySpecificIndex() );
        values.put( LUCENE, FusionIndexTestHelp.valuesSupportedByLucene() );
        return values;
    }

    static void verifyCallFail( Exception expectedFailure, Callable failingCall )
    {
        try
        {
            failingCall.call();
            fail( "Should have failed" );
        }
        catch ( Exception e )
        {
            assertSame( expectedFailure, e );
        }
    }

    static ValueIndexEntryUpdate<SchemaDescriptorSupplier> add( Value... value )
    {
        switch ( value.length )
        {
        case 1:
            return IndexEntryUpdate.add( 0, () -> INDEX_KEY, value );
        case 2:
            return IndexEntryUpdate.add( 0, () -> COMPOSITE_INDEX_KEY, value );
        default:
            return null;
        }
    }

    static ValueIndexEntryUpdate<SchemaDescriptorSupplier> remove( Value... value )
    {
        switch ( value.length )
        {
        case 1:
            return IndexEntryUpdate.remove( 0, () -> INDEX_KEY, value );
        case 2:
            return IndexEntryUpdate.remove( 0, () -> COMPOSITE_INDEX_KEY, value );
        default:
            return null;
        }
    }

    static ValueIndexEntryUpdate<SchemaDescriptorSupplier> change( Value[] before, Value[] after )
    {
        return IndexEntryUpdate.change( 0, () -> COMPOSITE_INDEX_KEY, before, after );
    }

    static ValueIndexEntryUpdate<SchemaDescriptorSupplier> change( Value before, Value after )
    {
        return IndexEntryUpdate.change( 0, () -> INDEX_KEY, before, after );
    }

    static void verifyOtherIsClosedOnSingleThrow( AutoCloseable failingCloseable, AutoCloseable fusionCloseable, AutoCloseable... successfulCloseables )
            throws Exception
    {
        UncheckedIOException failure = new UncheckedIOException( new IOException( "fail" ) );
        doThrow( failure ).when( failingCloseable ).close();

        // when
        try
        {
            fusionCloseable.close();
            fail( "Should have failed" );
        }
        catch ( UncheckedIOException ignore )
        {
        }

        // then
        for ( AutoCloseable successfulCloseable : successfulCloseables )
        {
            verify( successfulCloseable ).close();
        }
    }

    static void verifyFusionCloseThrowOnSingleCloseThrow( AutoCloseable failingCloseable, AutoCloseable fusionCloseable )
            throws Exception
    {
        UncheckedIOException expectedFailure = new UncheckedIOException( new IOException( "fail" ) );
        doThrow( expectedFailure ).when( failingCloseable ).close();
        try
        {
            fusionCloseable.close();
            fail( "Should have failed" );
        }
        catch ( UncheckedIOException e )
        {
            assertSame( expectedFailure, e );
        }
    }

    static void verifyFusionCloseThrowIfAllThrow( AutoCloseable fusionCloseable, AutoCloseable... autoCloseables ) throws Exception
    {
        // given
        UncheckedIOException[] failures = new UncheckedIOException[autoCloseables.length];
        for ( int i = 0; i < autoCloseables.length; i++ )
        {
            failures[i] = new UncheckedIOException( new IOException( "unknown" ) );
            doThrow( failures[i] ).when( autoCloseables[i] ).close();
        }

        try
        {
            // when
            fusionCloseable.close();
            fail( "Should have failed" );
        }
        catch ( UncheckedIOException e )
        {
            // then
            List<Condition<Throwable>> conditions = new ArrayList<>();
            for ( UncheckedIOException failure : failures )
            {
                conditions.add( new Condition<>( e1 -> e1 == failure, "Same exception" ));
            }
            assertThat( e ).is( anyOf( conditions ) );
        }
    }

    static <T> void fill( EnumMap<IndexSlot,T> map, T instance )
    {
        for ( IndexSlot slot : IndexSlot.values() )
        {
            map.put( slot, instance );
        }
    }
}
