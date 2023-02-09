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
package org.neo4j.util;

import java.util.Arrays;

import static org.neo4j.internal.helpers.Numbers.isPowerOfTwo;

/**
 * Got bits to store, shift and retrieve and they are more than what fits in a long?
 * Use {@link Bits} then.
 */
public final class Bits
{
    // 3: ...
    // 2:   [   23    ][   22    ][   21    ][   20    ][   19    ][   18    ][   17    ][   16    ] <--\
    //                                                                                                   |
    //    /---------------------------------------------------------------------------------------------/
    //   |
    // 1: \-[   15    ][   14    ][   13    ][   12    ][   11    ][   10    ][    9    ][    8    ] <--\
    //                                                                                                   |
    //    /---------------------------------------------------------------------------------------------/
    //   |
    // 0: \-[    7    ][    6    ][    5    ][    4    ][    3    ][    2    ][    1    ][    0    ] <---- START
    private final long[] longs;
    private final int numberOfBytes;
    private int writePosition;
    private int readPosition;

    /*
     * Calculate all the right overflow masks
     */
    private static final long[] RIGHT_OVERFLOW_MASKS;

    static
    {
        RIGHT_OVERFLOW_MASKS = new long[Long.SIZE];
        long mask = 1L;
        for ( int i = 0; i < RIGHT_OVERFLOW_MASKS.length; i++ )
        {
            RIGHT_OVERFLOW_MASKS[i] = mask;
            mask <<= 1;
            mask |= 0x1L;
        }
    }

    public static Bits bits( int numberOfBytes )
    {
        int requiredLongs = requiredLongs( numberOfBytes );
        return new Bits( new long[requiredLongs], numberOfBytes );
    }

    public static int requiredLongs( int numberOfBytes )
    {
        return ((numberOfBytes - 1) >> 3) + 1; // /8
    }

    public static Bits bitsFromLongs( long[] longs )
    {
        return new Bits( longs, longs.length << 3 ); // *8
    }

    public static Bits bitsFromBytes( byte[] bytes )
    {
        return bitsFromBytes( bytes, 0 );
    }

    public static Bits bitsFromBytes( byte[] bytes, int startIndex )
    {
        final int count = bytes.length;
        Bits bits = bits( count - startIndex );
        for ( int i = startIndex; i < count; i++ )
        {
            bits.put( bytes[i] );
        }
        return bits;
    }

    public static Bits bitsFromBytes( byte[] bytes, int offset, int length )
    {
        Bits bits = bits( length - offset );
        for ( int i = offset; i < (offset + length); i++ )
        {
            bits.put( bytes[i] );
        }
        return bits;
    }

    private Bits( long[] longs, int numberOfBytes )
    {
        this.longs = longs;
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * A mask which has the {@code steps} least significant bits set to 1, all others 0.
     * It's used to carry bits over between carriers (longs) when shifting right.
     *
     * @param steps the number of least significant bits to have set to 1 in the mask.
     * @return the created mask.
     */
    public static long rightOverflowMask( int steps )
    {
        return RIGHT_OVERFLOW_MASKS[steps - 1];
    }

    /**
     * Returns the underlying long values that has got all the bits applied.
     * The first item in the array has got the most significant bits.
     *
     * @return the underlying long values that has got all the bits applied.
     */
    @SuppressWarnings( "EI_EXPOSE_REP" )
    public long[] getLongs()
    {
        return longs;
    }

    public byte[] asBytes()
    {
        return asBytes(0);
    }

    public byte[] asBytes( int offsetBytes )
    {
        int readPositionBefore = readPosition;
        readPosition = 0;
        try
        {
            byte[] result = new byte[numberOfBytes + offsetBytes];
            for ( int i = 0; i < numberOfBytes; i++ )
            {
                result[i + offsetBytes] = getByte();
            }
            return result;
        }
        finally
        {
            readPosition = readPositionBefore;
        }
    }

    /**
     * A very nice toString, showing each bit, divided into groups of bytes and
     * lines of 8 bytes.
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for ( int longIndex = longs.length - 1; longIndex >= 0; longIndex-- )
        {
            long value = longs[longIndex];
            if ( builder.length() > 0 )
            {
                builder.append( '\n' );
            }
            builder.append( longIndex );
            builder.append( ':' );
            numberToString( builder, value, 8 );
            if ( longIndex == 0 )
            {
                builder.append( " <-- START" );
            }
        }
        return builder.toString();
    }

    public static void numberToString( StringBuilder builder, long value, int numberOfBytes )
    {
        builder.append( '[' );
        for ( int i = 8 * numberOfBytes - 1; i >= 0; i-- )
        {
            boolean isSet = (value & (1L << i)) != 0;
            builder.append( isSet ? "1" : "0" );
            if ( i > 0 && i % 8 == 0 )
            {
                builder.append( ',' );
            }
        }
        builder.append( ']' );
    }

    public static String numbersToBitString( long[] values )
    {
        StringBuilder builder = new StringBuilder();
        for ( long value : values )
        {
            numberToString( builder, value, 8 );
        }
        return builder.toString();
    }

    public Bits put( byte value )
    {
        return put( value, Byte.SIZE );
    }

    public Bits put( byte value, int steps )
    {
        return put( (long) value, steps );
    }

    public Bits put( short value )
    {
        return put( value, Short.SIZE );
    }

    public Bits put( short value, int steps )
    {
        return put( (long) value, steps );
    }

    public Bits put( int value )
    {
        return put( value, Integer.SIZE );
    }

    public Bits put( int value, int steps )
    {
        return put( (long) value, steps );
    }

    public Bits put( long value )
    {
        return put( value, Long.SIZE );
    }

    public Bits put( long value, int steps )
    {
        int lowLongIndex = writePosition >> 6; // /64
        int lowBitInLong = writePosition % 64;
        int lowBitsAvailable = 64 - lowBitInLong;
        long lowValueMask = rightOverflowMask( Math.min( lowBitsAvailable, steps ) );
        longs[lowLongIndex] |= (value & lowValueMask) << lowBitInLong;
        if ( steps > lowBitsAvailable )
        {   // High bits
            long highValueMask = rightOverflowMask( steps - lowBitsAvailable );
            longs[lowLongIndex + 1] |= (value >>> lowBitsAvailable) & highValueMask;
        }
        writePosition += steps;
        return this;
    }

    public Bits put( byte[] bytes, int offset, int length )
    {
        for ( int i = offset; i < offset + length; i++ )
        {
            put( bytes[i], Byte.SIZE );
        }
        return this;
    }

    public boolean available()
    {
        return readPosition < writePosition;
    }

    public byte getByte()
    {
        return getByte( Byte.SIZE );
    }

    public byte getByte( int steps )
    {
        return (byte) getLong( steps );
    }

    public short getShort()
    {
        return getShort( Short.SIZE );
    }

    public short getShort( int steps )
    {
        return (short) getLong( steps );
    }

    public int getInt()
    {
        return getInt( Integer.SIZE );
    }

    public int getInt( int steps )
    {
        return (int) getLong( steps );
    }

    public long getUnsignedInt()
    {
        return getInt( Integer.SIZE ) & 0xFFFFFFFFL;
    }

    public long getLong()
    {
        return getLong( Long.SIZE );
    }

    public long getLong( int steps )
    {
        int lowLongIndex = readPosition >> 6; // 64
        int lowBitInLong = readPosition % 64;
        int lowBitsAvailable = 64 - lowBitInLong;
        long lowLongMask = rightOverflowMask( Math.min( lowBitsAvailable, steps ) ) << lowBitInLong;
        long lowValue = longs[lowLongIndex] & lowLongMask;
        long result = lowValue >>> lowBitInLong;
        if ( steps > lowBitsAvailable )
        {   // High bits
            long highLongMask = rightOverflowMask( steps - lowBitsAvailable );
            result |= (longs[lowLongIndex + 1] & highLongMask) << lowBitsAvailable;
        }
        readPosition += steps;
        return result;
    }

    public static boolean bitFlag( byte flags, byte flag )
    {
        assert isPowerOfTwo( flag ) : "flag should be a power of 2, not: 0x" + Integer.toHexString( flag );
        return (flags & flag) == flag;
    }

    public static boolean bitFlag( int flags, int flag )
    {
        assert isPowerOfTwo( flag ) : "flag should be a power of 2, not: 0x" + Integer.toHexString( flag );
        return (flags & flag) == flag;
    }

    public static int bitFlag( boolean value, int flag )
    {
        assert isPowerOfTwo( flag ) : "flag should be a power of 2, not: 0x" + Integer.toHexString( flag );
        return value ? flag : 0;
    }

    public static byte bitFlag( boolean value, byte flag )
    {
        assert isPowerOfTwo( flag ) : "flag should be a power of 2, not: 0x" + Integer.toHexString( flag );
        return value ? flag : 0;
    }

    public static byte bitFlags( int flag1, int flag2, int flag3, int flag4, int flag5, int flag6, int flag7 )
    {
        int result = flag1 | flag2 | flag3 | flag4 | flag5 | flag6 | flag7;
        assert (result & ~0xFF) == 0;
        return (byte) result;
    }

    public static byte bitFlags( int flag1, int flag2, int flag3, int flag4, int flag5 )
    {
        int result = flag1 | flag2 | flag3 | flag4 | flag5;
        assert (result & ~0xFF) == 0;
        return (byte) result;
    }

    public static byte bitFlags( int flag1, int flag2, int flag3, int flag4 )
    {
        int result = flag1 | flag2 | flag3 | flag4;
        assert (result & ~0xFF) == 0;
        return (byte) result;
    }

    /**
     * Clear the position and data.
     */
    public void clear( boolean zeroBits )
    {
        if ( zeroBits )
        {
            // TODO optimize so that only the touched longs gets cleared
            Arrays.fill( longs, 0L );
        }
        readPosition = writePosition = 0;
    }

    /**
     * Given the write position, how many longs are in use.
     */
    public int longsInUse()
    {
        return ((writePosition - 1) / Long.SIZE) + 1;
    }
}
