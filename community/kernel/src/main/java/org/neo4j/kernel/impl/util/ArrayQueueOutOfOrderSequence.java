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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.kernel.impl.util;

import java.util.concurrent.TimeoutException;

import static java.lang.String.format;

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
        this.highestGapFreeMeta = initialMeta.clone();
        this.metaArray = initialMeta.clone();
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
            highestGapFreeMeta = highestGapFreeNumber == number ? meta : metaArray.clone();
            version++;
            notifyAll();
            return true;
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

    @Override
    public synchronized void await( long awaitedNumber, long timeoutMillis ) throws TimeoutException, InterruptedException
    {
        long endTime = System.currentTimeMillis() + timeoutMillis;
        while ( awaitedNumber > highestGapFreeNumber )
        {
            long timeLeft = endTime - System.currentTimeMillis();
            if ( timeLeft > 0 )
            {
                wait( timeLeft );
            }
            else
            {
                throw new TimeoutException( "Awaited number was not reached" );
            }
        }
    }

    private long[] createResult( long number, long[] meta )
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
    public synchronized String toString()
    {
        return format( "out-of-order-sequence:%d %d [%s]", highestEverSeen, highestGapFreeNumber, outOfOrderQueue );
    }
}
