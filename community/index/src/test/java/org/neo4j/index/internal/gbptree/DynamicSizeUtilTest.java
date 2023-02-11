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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.io.pagecache.ByteArrayPageCursor;
import org.neo4j.io.pagecache.PageCursor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.MASK_ONE_BYTE_KEY_SIZE;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.MASK_ONE_BYTE_VALUE_SIZE;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.MAX_TWO_BYTE_KEY_SIZE;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.MAX_TWO_BYTE_KEY_SIZE_NO_OFFLOAD;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.MAX_TWO_BYTE_VALUE_SIZE;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.extractKeySize;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.extractValueSize;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.putKeyValueSize;
import static org.neo4j.index.internal.gbptree.DynamicSizeUtil.readKeyValueSize;

class DynamicSizeUtilTest
{
    private static final int KEY_ONE_BYTE_MAX = MASK_ONE_BYTE_KEY_SIZE;
    private static final int KEY_TWO_BYTE_MIN = KEY_ONE_BYTE_MAX + 1;
    private static final int KEY_TWO_BYTE_MAX = MAX_TWO_BYTE_KEY_SIZE;
    private static final int KEY_TWO_BYTE_NO_OFFLOAD_MAX = MAX_TWO_BYTE_KEY_SIZE_NO_OFFLOAD;
    private static final int VAL_ONE_BYTE_MIN = 1;
    private static final int VAL_ONE_BYTE_MAX = MASK_ONE_BYTE_VALUE_SIZE;
    private static final int VAL_TWO_BYTE_MIN = VAL_ONE_BYTE_MAX + 1;
    private static final int VAL_TWO_BYTE_MAX = MAX_TWO_BYTE_VALUE_SIZE;

    private PageCursor cursor;

    @BeforeEach
    void setUp()
    {
        cursor = ByteArrayPageCursor.wrap( 8192 );
    }

    @Test
    void shouldPutAndGetKeyValueSize()
    {
        //                           KEY SIZE             | VALUE SIZE      | EXPECTED BYTES
        shouldPutAndGetKeyValueSize( 0,                     0,                1 );
        shouldPutAndGetKeyValueSize( 0,                     VAL_ONE_BYTE_MIN, 2 );
        shouldPutAndGetKeyValueSize( 0,                     VAL_ONE_BYTE_MAX, 2 );
        shouldPutAndGetKeyValueSize( 0,                     VAL_TWO_BYTE_MIN, 3 );
        shouldPutAndGetKeyValueSize( 0,                     VAL_TWO_BYTE_MAX, 3 );
        shouldPutAndGetKeyValueSize( KEY_ONE_BYTE_MAX, 0,                1 );
        shouldPutAndGetKeyValueSize( KEY_ONE_BYTE_MAX, VAL_ONE_BYTE_MIN, 2 );
        shouldPutAndGetKeyValueSize( KEY_ONE_BYTE_MAX, VAL_ONE_BYTE_MAX, 2 );
        shouldPutAndGetKeyValueSize( KEY_ONE_BYTE_MAX, VAL_TWO_BYTE_MIN, 3 );
        shouldPutAndGetKeyValueSize( KEY_ONE_BYTE_MAX, VAL_TWO_BYTE_MAX, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MIN, 0,                2 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MIN, VAL_ONE_BYTE_MIN, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MIN, VAL_ONE_BYTE_MAX, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MIN, VAL_TWO_BYTE_MIN, 4 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MIN, VAL_TWO_BYTE_MAX, 4 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MAX, 0,                2 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MAX, VAL_ONE_BYTE_MIN, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MAX, VAL_ONE_BYTE_MAX, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MAX, VAL_TWO_BYTE_MIN, 4 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_MAX, VAL_TWO_BYTE_MAX, 4 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, 0,                2 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, VAL_ONE_BYTE_MIN, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, VAL_ONE_BYTE_MAX, 3 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, VAL_TWO_BYTE_MIN, 4 );
        shouldPutAndGetKeyValueSize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, VAL_TWO_BYTE_MAX, 4 );
    }

    @Test
    void shouldPutAndGetKeySize()
    {
        //                      KEY SIZE        | EXPECTED BYTES
        shouldPutAndGetKeySize( 0,                1 );
        shouldPutAndGetKeySize( KEY_ONE_BYTE_MAX, 1 );
        shouldPutAndGetKeySize( KEY_TWO_BYTE_MIN, 2 );
        shouldPutAndGetKeySize( KEY_TWO_BYTE_MAX, 2 );
        shouldPutAndGetKeySize( KEY_TWO_BYTE_NO_OFFLOAD_MAX, 2 );
    }

    @Test
    void shouldPreventWritingKeyLargerThanMaxPossible()
    {
        // given
        int keySize = KEY_TWO_BYTE_NO_OFFLOAD_MAX;

        // when
        assertThrows( IllegalArgumentException.class, () -> putKeyValueSize( cursor, keySize + 1, 0, false ) );

        // whereas when size is one less than that
        shouldPutAndGetKeyValueSize( keySize, 0, 2 );
    }

    @Test
    void shouldPreventWritingValueLargerThanMaxPossible()
    {
        // given
        int valueSize = 0x7FFF;

        // when
        assertThrows( IllegalArgumentException.class, () -> putKeyValueSize( cursor, 1, valueSize + 1, false ) );

        // whereas when size is one less than that
        shouldPutAndGetKeyValueSize( 1, valueSize, 3 );
    }

    @Test
    void shouldPutAndGetKeySizeOffload()
    {
        int offsetBefore = cursor.getOffset();
        DynamicSizeUtil.putKeySize( cursor, 0, true );
        int offsetAfter = cursor.getOffset();
        cursor.setOffset( offsetBefore );
        long readKeySize = readKeyValueSize( cursor, true );
        assertTrue( DynamicSizeUtil.extractOffload( readKeySize ) );
        assertEquals( 2, offsetAfter - offsetBefore );
    }

    @Test
    void shouldPutAndGetKeyValueSizeOffload()
    {
        int offsetBefore = cursor.getOffset();
        DynamicSizeUtil.putKeyValueSize( cursor, 0, 0, true );
        int offsetAfter = cursor.getOffset();
        cursor.setOffset( offsetBefore );
        long readKeySize = readKeyValueSize( cursor, true );
        assertTrue( DynamicSizeUtil.extractOffload( readKeySize ) );
        assertEquals( 2, offsetAfter - offsetBefore );
    }

    private void shouldPutAndGetKeySize( int keySize, int expectedBytes )
    {
        int size = putAndGetKey( keySize );
        assertEquals( expectedBytes, size );
    }

    private int putAndGetKey( int keySize )
    {
        int offsetBefore = cursor.getOffset();
        DynamicSizeUtil.putKeySize( cursor, keySize, false );
        int offsetAfter = cursor.getOffset();
        cursor.setOffset( offsetBefore );
        long readKeySize = readKeyValueSize( cursor, false );
        assertEquals( keySize, extractKeySize( readKeySize ) );
        return offsetAfter - offsetBefore;
    }

    private void shouldPutAndGetKeyValueSize( int keySize, int valueSize, int expectedBytes )
    {
        int size = putAndGetKeyValue( keySize, valueSize );
        assertEquals( expectedBytes, size );
    }

    private int putAndGetKeyValue( int keySize, int valueSize )
    {
        int offsetBefore = cursor.getOffset();
        putKeyValueSize( cursor, keySize, valueSize, false );
        int offsetAfter = cursor.getOffset();
        cursor.setOffset( offsetBefore );
        long readKeyValueSize = readKeyValueSize( cursor, false );
        int readKeySize = extractKeySize( readKeyValueSize );
        int readValueSize = extractValueSize( readKeyValueSize );
        assertEquals( keySize, readKeySize );
        assertEquals( valueSize, readValueSize );
        return offsetAfter - offsetBefore;
    }
}
