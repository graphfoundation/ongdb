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
package org.neo4j.util.concurrent;

import java.util.Arrays;

/**
 * A crude, synchronized implementation of OutOfOrderSequence. Please implement a faster one if need be.
 */
public class ArrayQueueOutOfOrderSequence implements OutOfOrderSequence
{
    // odd means updating, even means no one is updating
    private volatile int version;
    private volatile long highestGapFreeNumber;
    private volatile long[] highestGapFreeMeta;
    private final SequenceArray outOfOrderQueue;
    private long[] metaArray;
    private volatile long highestEverSeen;

    public ArrayQueueOutOfOrderSequence( long startingNumber, int initialArraySize, long[] initialMeta )
    {
        this.highestGapFreeNumber = startingNumber;
        this.highestEverSeen = startingNumber;
        this.highestGapFreeMeta = Arrays.copyOf( initialMeta, initialMeta.length );
        this.metaArray = Arrays.copyOf( initialMeta, initialMeta.length );
        this.outOfOrderQueue = new SequenceArray( initialMeta.length + 1, initialArraySize );
    }

    @Override
    public synchronized boolean offer( long number, long[] meta )
    {
        highestEverSeen = Math.max( highestEverSeen, number );
        if ( highestGapFreeNumber + 1 == number )
        {
            version++;
            highestGapFreeNumber = outOfOrderQueue.pollHighestGapFree( number, metaArray );
            highestGapFreeMeta = highestGapFreeNumber == number ? meta : Arrays.copyOf( metaArray, metaArray.length );
            version++;
            return true;
        }

        if ( number <= highestGapFreeNumber )
        {
            throw new IllegalStateException( "Was offered " + number + ", but highest gap-free is " + highestGapFreeNumber +
                    " and was only expecting values higher than that" );
        }
        outOfOrderQueue.offer( highestGapFreeNumber, number, pack( meta ) );
        return false;
    }

    @Override
    public long highestEverSeen()
    {
        return this.highestEverSeen;
    }

    private long[] pack( long[] meta )
    {
        metaArray = meta;
        return metaArray;
    }

    @Override
    public long[] get()
    {
        long number;
        long[] meta;
        while ( true )
        {
            int versionBefore = version;
            if ( (versionBefore & 1) == 1 )
            {   // Someone else is updating those values as we speak, go another round
                continue;
            }

            number = highestGapFreeNumber;
            meta = highestGapFreeMeta;
            if ( version == versionBefore )
            {   // We read a consistent version of these two values
                break;
            }
        }

        return createResult( number, meta );
    }

    private static long[] createResult( long number, long[] meta )
    {
        long[] result = new long[meta.length + 1];
        result[0] = number;
        System.arraycopy( meta, 0, result, 1, meta.length );
        return result;
    }

    @Override
    public long getHighestGapFreeNumber()
    {
        return highestGapFreeNumber;
    }

    @Override
    public synchronized void set( long number, long[] meta )
    {
        highestEverSeen = number;
        highestGapFreeNumber = number;
        highestGapFreeMeta = meta;
        outOfOrderQueue.clear();
    }

    @Override
    public synchronized Snapshot snapshot()
    {
        long[] highestGapFree = get();
        long[][] idsOutOfOrder = outOfOrderQueue.snapshot();
        return new Snapshot()
        {
            @Override
            public long[] highestGapFree()
            {
                return highestGapFree;
            }

            @Override
            public long[][] idsOutOfOrder()
            {
                return idsOutOfOrder;
            }
        };
    }

    @Override
    public synchronized String toString()
    {
        return String.format( "out-of-order-sequence:%d %d [%s]", highestEverSeen, highestGapFreeNumber, outOfOrderQueue );
    }
}
