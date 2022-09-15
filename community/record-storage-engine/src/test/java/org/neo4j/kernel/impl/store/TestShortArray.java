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
package org.neo4j.kernel.impl.store;

import org.junit.jupiter.api.Test;

import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.values.storable.Values;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestShortArray
{
    private static final int DEFAULT_PAYLOAD_SIZE = PropertyType.getPayloadSize();

    @Test
    void canEncodeSomeSampleArraysWithDefaultPayloadSize()
    {
        assertCanEncodeAndDecodeToSameValue( new boolean[]{true, false, true,
                true, true, true, true, true, true, true, false, true} );
        assertCanEncodeAndDecodeToSameValue( new byte[]{-1, -10, 43, 127, 0, 4, 2, 3, 56, 47, 67, 43} );
        assertCanEncodeAndDecodeToSameValue( new short[]{1, 2, 3, 45, 5, 6, 7} );
        assertCanEncodeAndDecodeToSameValue( new int[]{1, 2, 3, 4, 5, 6, 7} );
        assertCanEncodeAndDecodeToSameValue( new long[]{1, 2, 3, 4, 5, 6, 7} );
        assertCanEncodeAndDecodeToSameValue( new float[]{0.34f, 0.21f} );
        assertCanEncodeAndDecodeToSameValue( new long[]{1L << 63, 1L << 63} );
        assertCanEncodeAndDecodeToSameValue( new long[]{1L << 63, 1L << 63, 1L << 63} );
        assertCanEncodeAndDecodeToSameValue( new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} );
        assertCanEncodeAndDecodeToSameValue( new long[]{0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0} );
    }

    @Test
    void testCannotEncodeMarginal()
    {
        assertCanNotEncode( new long[]{1L << 15, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1} );
    }

    @Test
    void canEncodeBiggerArraysWithBiggerPayloadSize()
    {
        int[] intArray = intArray( 10, 2600 );
        assertCanEncodeAndDecodeToSameValue( intArray, 32 );
    }

    private static void assertCanNotEncode( Object intArray )
    {
        assertCanNotEncode( intArray, DEFAULT_PAYLOAD_SIZE );
    }

    private static void assertCanNotEncode( Object intArray, int payloadSize )
    {
        assertFalse( ShortArray.encode( 0, intArray, new PropertyBlock(),
                payloadSize ) );
    }

    private static int[] intArray( int count, int stride )
    {
        int[] result = new int[count];
        for ( int i = 0; i < count; i++ )
        {
            result[i] = i * stride;
        }
        return result;
    }

    private static void assertCanEncodeAndDecodeToSameValue( Object value )
    {
        assertCanEncodeAndDecodeToSameValue( value, PropertyType.getPayloadSize() );
    }

    private static void assertCanEncodeAndDecodeToSameValue( Object value, int payloadSize )
    {
        PropertyBlock target = new PropertyBlock();
        boolean encoded = ShortArray.encode( 0, value, target, payloadSize );
        assertTrue( encoded );
        assertEquals( Values.of( value ), ShortArray.decode( target ) );
    }
}
