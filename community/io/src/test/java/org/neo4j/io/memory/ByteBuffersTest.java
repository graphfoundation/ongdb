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
package org.neo4j.io.memory;

import org.junit.jupiter.api.Test;

import org.neo4j.memory.LocalMemoryTracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.io.memory.ByteBuffers.allocate;
import static org.neo4j.io.memory.ByteBuffers.allocateDirect;
import static org.neo4j.io.memory.ByteBuffers.releaseBuffer;
import static org.neo4j.memory.MemoryPools.NO_TRACKING;

class ByteBuffersTest
{
    @Test
    void trackMemoryAllocationsForNativeByteBuffers()
    {
        var memoryTracker = new LocalMemoryTracker( NO_TRACKING, 100, 0, null );
        var byteBuffer = allocateDirect( 30, memoryTracker );
        try
        {
            assertEquals( 0, memoryTracker.estimatedHeapMemory() );
            assertEquals( 30, memoryTracker.usedNativeMemory() );
        }
        finally
        {
            releaseBuffer( byteBuffer, memoryTracker );
        }

        assertEquals( 0, memoryTracker.estimatedHeapMemory() );
        assertEquals( 0, memoryTracker.usedNativeMemory() );
    }

    @Test
    void trackMemoryAllocationsForHeapByteBuffers()
    {
        var memoryTracker = new LocalMemoryTracker( NO_TRACKING, 100, 0, null );
        var byteBuffer = allocate( 30, memoryTracker );
        try
        {
            assertEquals( 30, memoryTracker.estimatedHeapMemory() );
            assertEquals( 0, memoryTracker.usedNativeMemory() );
        }
        finally
        {
            releaseBuffer( byteBuffer, memoryTracker );
        }

        assertEquals( 0, memoryTracker.estimatedHeapMemory() );
        assertEquals( 0, memoryTracker.usedNativeMemory() );
    }
}
