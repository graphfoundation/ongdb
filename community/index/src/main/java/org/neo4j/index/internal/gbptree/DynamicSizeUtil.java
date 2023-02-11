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

import org.neo4j.io.pagecache.PageCursor;

import static java.lang.String.format;

/**
 * Gather utility methods for reading and writing individual dynamic sized
 * keys. It thus define the layout for:
 * - Key pointer in offset array (K*), 2B
 * - keyValueSize, 1B-4B
 * - Key tombstone, first bit in keyValueSize
 *
 * Format of key/value size is dynamic in itself, first byte being:
 * <pre>
 * [T,K,V,k,k,k,k,k]
 * </pre>
 * If {@code T} is set key is dead.
 * If {@code K} is set the next byte contains the higher order bits of the key size.
 * If {@code V} is set there is a value size to be read directly after key size.
 * This first byte can fit key size <= 31 (0x1F) and we only need the second byte if key size is larger.
 *
 * The second key byte is:
 * <pre>
 * [O,k,k,k,k,k,k,k]
 * </pre>
 * If {@code O} is set there is either an offload id to be read after after keyValueSize or it is the most significant bit of the key size, depending on
 * context. Together with the second byte we can fit key size <= 4095 (0xFFF) if {@code O} denotes offload or size <= 8191 (0x1FFF) if denotes most
 * significant bit.
 *
 * Byte following key size bytes (second or third byte depending on how many bytes needed for key size):
 * <pre>
 * [V,v,v,v,v,v,v,v]
 * </pre>
 * If {@code V} is set the next byte contains the higher order bits of the value size.
 * This first value size byte can fit value size <= 127 (0x7F) and with the second byte we can fit value size <= 32767 (0x7FFF).
 *
 * So in total key/value size has six different looks (not including tombstone being set or not set):
 * <pre>
 * One byte key, no value
 * [0,0,0,k,k,k,k,k]
 *
 * One byte key, one byte value
 * [0,0,1,k,k,k,k,k][0,v,v,v,v,v,v,v]
 *
 * One byte key, two byte value
 * [0,0,1,k,k,k,k,k][1,v,v,v,v,v,v,v][v,v,v,v,v,v,v,v]
 *
 * Two byte key, no value
 * [0,1,0,k,k,k,k,k][0,k,k,k,k,k,k,k]
 *
 * Two byte key, one byte value
 * [0,1,1,k,k,k,k,k][0,k,k,k,k,k,k,k][0,v,v,v,v,v,v,v]
 *
 * Two byte key, two byte value
 * [0,1,1,k,k,k,k,k][0,k,k,k,k,k,k,k][1,v,v,v,v,v,v,v][v,v,v,v,v,v,v,v]
 *
 * Offload entry
 * [0,1,0,_,_,_,_,_][1,_,_,_,_,_,_,_][offloadId 8B]
 *
 * Two byte key (no offload)
 * [0,1,0,k,k,k,k,k][k,k,k,k,k,k,k,k]
 *
 * </pre>
 * This key/value size format is used, both for leaves and internal nodes even though internal nodes can never have values.
 *
 * The most significant key bit in the second byte (shown as 0) is not needed for the discrete key sizes for our 8k page size
 * and is to be considered reserved for future use.
 *
 * Relative layout of key and key_value
 * KeyOffset points to the exact offset where key entry or key_value entry
 * can be read.
 * key entry - [keyValueSize 1B-2B|actualKey]
 * key_value entry - [keyValueSize 1B-4B|actualKey|actualValue]
 *
 * Tombstone
 * First bit in keyValueSize is used as a tombstone, set to 1 if key is dead.
 */
public class DynamicSizeUtil
{
    static final int MIN_SIZE_KEY_VALUE_SIZE = 1 /*key*/ /*0B value*/;
    static final int MAX_SIZE_KEY_VALUE_SIZE = 2 /*key*/ + 2 /*value*/;
    static final int SIZE_OFFLOAD_ID = Long.BYTES;

    private static final int FLAG_FIRST_BYTE_TOMBSTONE = 0x80;
    private static final int FLAG_SECOND_BYTE_OFFLOAD = 0x80;
    private static final long FLAG_READ_TOMBSTONE = 0x80000000_00000000L;
    private static final long FLAG_READ_OFFLOAD = 0x40000000_00000000L;
    // mask for one-byte key size to map to the k's in [_,_,_,k,k,k,k,k]
    static final int MASK_ONE_BYTE_KEY_SIZE = 0x1F;
    // max two-byte key size to map to the k's in [_,_,_,k,k,k,k,k][_,k,k,k,k,k,k,k]
    static final int MAX_TWO_BYTE_KEY_SIZE = 0xFFF;
    // max two-byte key size to map to the k's in [_,_,_,k,k,k,k,k][k,k,k,k,k,k,k,k]
    static final int MAX_TWO_BYTE_KEY_SIZE_NO_OFFLOAD = 0x1FFF;
    // mask for one-byte value size to map to the v's in [_,v,v,v,v,v,v,v]
    static final int MASK_ONE_BYTE_VALUE_SIZE = 0x7F;
    // max two-byte value size to map to the v's in [_,v,v,v,v,v,v,v][v,v,v,v,v,v,v,v]
    static final int MAX_TWO_BYTE_VALUE_SIZE = 0x7FFF;
    private static final int FLAG_HAS_VALUE_SIZE = 0x20;
    private static final int FLAG_ADDITIONAL_KEY_SIZE = 0x40;
    private static final int FLAG_ADDITIONAL_VALUE_SIZE = 0x80;
    private static final int SHIFT_LSB_KEY_SIZE = 5;
    private static final int SHIFT_LSB_VALUE_SIZE = 7;

    static boolean putKeySize( PageCursor cursor, int keySize, boolean offload )
    {
        return putKeyValueSize( cursor, keySize, 0, offload );
    }

    public static boolean putKeyValueSize( PageCursor cursor, int keySize, int valueSize, boolean offload )
    {
        if ( offload )
        {
            byte firstByte = FLAG_ADDITIONAL_KEY_SIZE;
            byte secondByte = (byte) FLAG_SECOND_BYTE_OFFLOAD;
            cursor.putByte( firstByte );
            cursor.putByte( secondByte );
            return false;
        }

        boolean hasAdditionalKeySize = keySize > MASK_ONE_BYTE_KEY_SIZE;
        boolean hasValueSize = valueSize > 0;

        // Key size
        {
            byte firstByte = (byte) (keySize & MASK_ONE_BYTE_KEY_SIZE); // Least significant 5 bits
            if ( hasAdditionalKeySize )
            {
                firstByte |= FLAG_ADDITIONAL_KEY_SIZE;
                if ( keySize > MAX_TWO_BYTE_KEY_SIZE_NO_OFFLOAD )
                {
                    throw new IllegalArgumentException(
                            format( "Max supported key size is %d, but tried to store key of size %d. Please see index documentation for limitations.",
                                    MAX_TWO_BYTE_KEY_SIZE_NO_OFFLOAD, keySize ) );
                }
            }
            if ( hasValueSize )
            {
                firstByte |= FLAG_HAS_VALUE_SIZE;
            }
            cursor.putByte( firstByte );

            if ( hasAdditionalKeySize )
            {
                // Assuming no key size larger than maxKeySize limit
                cursor.putByte( (byte) (keySize >> SHIFT_LSB_KEY_SIZE) );
            }
        }

        // Value size
        {
            if ( hasValueSize )
            {
                boolean needsAdditionalValueSize = valueSize > MASK_ONE_BYTE_VALUE_SIZE;
                byte firstByte = (byte) (valueSize & MASK_ONE_BYTE_VALUE_SIZE); // Least significant 7 bits
                if ( needsAdditionalValueSize )
                {
                    if ( valueSize > MAX_TWO_BYTE_VALUE_SIZE )
                    {
                        throw new IllegalArgumentException(
                                format( "Max supported value size is %d, but tried to store value of size %d. Please see index documentation for limitations.",
                                        MAX_TWO_BYTE_VALUE_SIZE, valueSize ) );
                    }
                    firstByte |= FLAG_ADDITIONAL_VALUE_SIZE;
                }
                cursor.putByte( firstByte );

                if ( needsAdditionalValueSize )
                {
                    // Assuming no value size larger than 16k
                    cursor.putByte( (byte) (valueSize >> SHIFT_LSB_VALUE_SIZE) );
                }
            }
        }
        return true;
    }

    public static long readKeyValueSize( PageCursor cursor, boolean msbIsOffload )
    {
        byte firstByte = cursor.getByte();
        boolean hasTombstone = hasTombstone( firstByte );
        boolean hasAdditionalKeySize = (firstByte & FLAG_ADDITIONAL_KEY_SIZE) != 0;
        boolean hasValueSize = (firstByte & FLAG_HAS_VALUE_SIZE) != 0;
        int keySizeLsb = firstByte & MASK_ONE_BYTE_KEY_SIZE;
        long keySize;
        if ( hasAdditionalKeySize )
        {
            byte secondByte = cursor.getByte();
            if ( msbIsOffload && hasOffload( secondByte ) )
            {
                return (hasTombstone ? FLAG_READ_TOMBSTONE : 0) | FLAG_READ_OFFLOAD;
            }
            int keySizeMsb = secondByte & 0xFF;
            keySize = (keySizeMsb << SHIFT_LSB_KEY_SIZE) | keySizeLsb;
        }
        else
        {
            keySize = keySizeLsb;
        }

        long valueSize;
        if ( hasValueSize )
        {
            byte firstValueByte = cursor.getByte();
            int valueSizeLsb = firstValueByte & MASK_ONE_BYTE_VALUE_SIZE;
            boolean hasAdditionalValueSize = (firstValueByte & FLAG_ADDITIONAL_VALUE_SIZE) != 0;
            if ( hasAdditionalValueSize )
            {
                int valueSizeMsb = cursor.getByte() & 0xFF;
                valueSize = (valueSizeMsb << SHIFT_LSB_VALUE_SIZE) | valueSizeLsb;
            }
            else
            {
                valueSize = valueSizeLsb;
            }
        }
        else
        {
            valueSize = 0;
        }

        return (hasTombstone ? FLAG_READ_TOMBSTONE : 0) | (keySize << Integer.SIZE) | valueSize;
    }

    public static int extractValueSize( long keyValueSize )
    {
        return (int) keyValueSize;
    }

    public static int extractKeySize( long keyValueSize )
    {
        return (int) ((keyValueSize & ~(FLAG_READ_TOMBSTONE | FLAG_READ_OFFLOAD)) >>> Integer.SIZE);
    }

    public static int getOverhead( int keySize, int valueSize, boolean offload )
    {
        if ( offload )
        {
            return 2 + SIZE_OFFLOAD_ID;
        }
        return 1 + (keySize > MASK_ONE_BYTE_KEY_SIZE ? 1 : 0) + (valueSize > 0 ? 1 : 0) + (valueSize > MASK_ONE_BYTE_VALUE_SIZE ? 1 : 0);
    }

    static boolean extractTombstone( long keyValueSize )
    {
        return (keyValueSize & FLAG_READ_TOMBSTONE) != 0;
    }

    static boolean extractOffload( long keyValueSize )
    {
        return (keyValueSize & FLAG_READ_OFFLOAD) != 0;
    }

    /**
     * Put a tombstone into key size.
     * @param cursor on offset to key size where tombstone should be put.
     */
    static void putTombstone( PageCursor cursor )
    {
        int offset = cursor.getOffset();
        byte firstByte = cursor.getByte();
        firstByte = withTombstoneFlag( firstByte );
        cursor.setOffset( offset );
        cursor.putByte( firstByte );
    }

    /**
     * Check read key size for tombstone.
     * @return True if read key size has tombstone.
     */
    private static boolean hasTombstone( byte firstKeySizeByte )
    {
        return (firstKeySizeByte & FLAG_FIRST_BYTE_TOMBSTONE) != 0;
    }

    private static byte withTombstoneFlag( byte firstByte )
    {
        assert (firstByte & FLAG_FIRST_BYTE_TOMBSTONE) == 0 : "First key size byte " + firstByte + " is too large to fit tombstone.";
        return (byte) (firstByte | FLAG_FIRST_BYTE_TOMBSTONE);
    }

    private static boolean hasOffload( long secondByte )
    {
        return (secondByte & FLAG_SECOND_BYTE_OFFLOAD) != 0;
    }

    static long readOffloadId( PageCursor cursor )
    {
        return cursor.getLong();
    }

    static void putOffloadId( PageCursor cursor, long offloadId )
    {
        cursor.putLong( offloadId );
    }
}
