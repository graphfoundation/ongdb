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
package org.neo4j.io.bufferpool.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.neo4j.io.ByteUnit;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.util.VisibleForTesting;

class BucketBootstrapper
{
    // Note that this is a database not something like HA Proxy,
    // so threads should spend most of the time executing queries
    // and not allocating and freeing networking buffers in a tight loop.
    // So the number of slices for each bucket equal to
    // <CPU count>/8 should be more than enough in order not to experience
    // contention for frequently used buffers (read bellow why small = frequently used).
    // Also note that JVM will see hyper threads as cores.
    private static final double SMALL_BUFFER_SLICE_COEFFICIENT = 0.125;
    // Large buffers are expensive to allocate, so there is value in pooling them
    // if there are used repeatedly withing a short time interval,
    // but contention is not expected when working with large buffers.
    // For instance large buffers are expected to be used by store copy and back up in cluster,
    // or when processing a very large transaction, which are operations
    // not generally performed by a large number of threads at the same time.
    private static final int LARGE_BUFFER_SLICE_COUNT = 1;

    private static final int SMALLEST_POOLED_BUFFER = 256;
    // 1MB is the largest configurable value for a chunk size for a store copy.
    // Technically, larger buffers could be used, but that should be very rare
    // and we have to put the ceiling for pooled buffer size somewhere.
    // Having to occasionally allocate a large buffer is not a performance tragedy.
    private static final int LARGEST_POOLED_BUFFER = (int) ByteUnit.mebiBytes( 1 ); // 1MB

    // As mentioned above, larger buffers are expected to be used less frequently than smaller ones.
    // So 'large' does not signify just the size, but means less frequently used in this context.
    // In context of Netty, 64K is a significant breaking point,
    // because it is the default value of high write watermark (See WriteBufferWaterMark).
    // In other words, if the amount of data buffered on lower levels of a networking stack exceeds 64K
    // Netty will tell the application layer to stop producing more.
    // Of course, the application layer can choose to ignore this or the application layer
    // can submit large buffers (Obviously, when the application layer sends a buffer larger
    // that 64K, the high watermark is the size of the buffer and not 64K),
    // but experiments show that 64K is a significant point in buffer use frequency.
    private static final int LARGE_BUFFER_THRESHOLD = (int) ByteUnit.kibiBytes( 64 );

    private final List<Bucket> buckets;
    private final int maxPooledBufferCapacity;

    BucketBootstrapper( MemoryTracker memoryTracker )
    {
        buckets = new ArrayList<>();

        for ( int bufferSize = SMALLEST_POOLED_BUFFER; bufferSize <= LARGEST_POOLED_BUFFER; bufferSize <<= 1 )
        {
            int bufferCapacity = bufferSize;
            if ( bufferCapacity == ByteUnit.kibiBytes( 16 ) )
            {
                // Let's replace the 16K bucket with a similar one
                // more aligned for max SSL packet size.
                // In networking, max SSL record is an important buffer size
                // as an SSL record cannot be processed in a streaming
                // way as it needs to be decrypted and validated in its
                // entirety before being sent up the stack.
                // The max SSL record is 16K of data + the following extras:
                // Max record header = 5
                // Max IV = 16
                // Max padding = 256
                // MAX Mac = 48
                // So let's go for 16K plus some nicely rounded extra for headroom:
                bufferCapacity = (int) ByteUnit.kibiBytes( 16 ) + 512;
            }

            buckets.add( createBucket( bufferCapacity, memoryTracker ) );
        }

        maxPooledBufferCapacity = buckets.get( buckets.size() - 1 ).getBufferCapacity();
    }

    private Bucket createBucket( int bufferCapacity,  MemoryTracker memoryTracker )
    {
        int sliceCount = LARGE_BUFFER_SLICE_COUNT;
        if ( bufferCapacity <= LARGE_BUFFER_THRESHOLD )
        {
            sliceCount = calculateSmallBufferSliceCount();
        }

        return new Bucket( bufferCapacity, sliceCount, memoryTracker );
    }

    private int calculateSmallBufferSliceCount()
    {
        return (int) Math.ceil( getAvailableCpuCount() * SMALL_BUFFER_SLICE_COEFFICIENT );
    }

    List<Bucket> getBuckets()
    {
        return buckets;
    }

    int getMaxPooledBufferCapacity()
    {
        return maxPooledBufferCapacity;
    }

    @VisibleForTesting
    protected int getAvailableCpuCount()
    {
        return Runtime.getRuntime().availableProcessors();
    }
}
