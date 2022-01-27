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
package org.neo4j.memory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GlobalMemoryGroupTrackerTest
{
    private final GlobalMemoryGroupTracker globalPool = new MemoryPools().pool( MemoryGroup.TRANSACTION, 100, null );

    @Test
    void trackedHeapFromTrackerAndPoolMatch()
    {
        var memoryTracker = globalPool.getPoolMemoryTracker();

        memoryTracker.allocateHeap( 12 );

        assertEquals( 12, globalPool.usedHeap() );
        assertEquals( 12, memoryTracker.estimatedHeapMemory() );
    }

    @Test
    void trackedNativeFromTrackerAndPoolMatch()
    {
        var memoryTracker = globalPool.getPoolMemoryTracker();

        memoryTracker.allocateNative( 13 );

        assertEquals( 13, globalPool.usedNative() );
        assertEquals( 13, memoryTracker.usedNativeMemory() );
    }

    @Test
    void trackedHeapFromPoolAndTrackerMatch()
    {
        var memoryTracker = globalPool.getPoolMemoryTracker();

        globalPool.reserveHeap( 12 );

        assertEquals( 12, globalPool.usedHeap() );
        assertEquals( 12, memoryTracker.estimatedHeapMemory() );
    }

    @Test
    void trackedNativeFromPoolAndTrackerMatch()
    {
        var memoryTracker = globalPool.getPoolMemoryTracker();

        globalPool.reserveNative( 13 );

        assertEquals( 13, globalPool.usedNative() );
        assertEquals( 13, memoryTracker.usedNativeMemory() );
    }
}
