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
package org.neo4j.bolt.transport;

import io.netty.buffer.PooledByteBufAllocator;
import org.junit.jupiter.api.Test;

import org.neo4j.io.ByteUnit;
import org.neo4j.memory.MemoryPools;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoltMemoryPoolIT
{
    private final int requestedSize = (int) ByteUnit.kibiBytes( 10 );

    @Test
    void reportConsumedHeapMemory()
    {
        var bufAllocator = createTestAllocator( false );
        var allocatorMetric = bufAllocator.metric();
        assertEquals(0, allocatorMetric.usedDirectMemory() );
        assertEquals(0, allocatorMetric.usedDirectMemory() );

        var memoryTracker = new BoltMemoryPool( new MemoryPools(), allocatorMetric );
        var buffer = bufAllocator.buffer( requestedSize );
        try
        {
            assertEquals( requestedSize, buffer.capacity() );
            assertEquals( requestedSize, memoryTracker.usedHeap() );
            assertEquals( requestedSize, memoryTracker.totalUsed() );
        }
        finally
        {
            buffer.release();
        }

        assertEquals( 0, memoryTracker.usedHeap() );
        assertEquals( 0, memoryTracker.totalUsed() );
    }

    @Test
    void reportConsumedDirectMemory()
    {
        var bufAllocator = createTestAllocator( true );
        var allocatorMetric = bufAllocator.metric();
        assertEquals(0, allocatorMetric.usedDirectMemory() );
        assertEquals(0, allocatorMetric.usedDirectMemory() );

        var memoryTracker = new BoltMemoryPool( new MemoryPools(), allocatorMetric );
        var buffer = bufAllocator.buffer( requestedSize );
        try
        {
            assertEquals( requestedSize, buffer.capacity() );
            assertEquals( requestedSize, memoryTracker.usedNative() );
            assertEquals( requestedSize, memoryTracker.totalUsed() );
        }
        finally
        {
            buffer.release();
        }

        assertEquals( 0, memoryTracker.usedNative() );
        assertEquals( 0, memoryTracker.totalUsed() );
    }

    private static PooledByteBufAllocator createTestAllocator( boolean preferDirect )
    {
        return new PooledByteBufAllocator( preferDirect, 1, 1, (int) ByteUnit.kibiBytes( 4 ), 1, 0, 0, 0, true );
    }
}
