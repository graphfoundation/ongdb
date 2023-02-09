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
package org.neo4j.io.pagecache.impl.muninn;

import org.neo4j.internal.unsafe.UnsafeUtil;
import org.neo4j.memory.MemoryTracker;

final class VictimPageReference
{
    private static int victimPageSize = -1;
    private static long victimPagePointer;

    private VictimPageReference()
    {
        // All state is static
    }

    static synchronized long getVictimPage( int pageSize, MemoryTracker memoryTracker )
    {
        if ( victimPageSize < pageSize )
        {
            // Note that we NEVER free any old victim pages. This is important because we cannot tell
            // when we are done using them. Therefor, victim pages are allocated and stay allocated
            // until our process terminates.
            victimPagePointer = UnsafeUtil.allocateMemory( pageSize, memoryTracker );
            victimPageSize = pageSize;
        }
        return victimPagePointer;
    }
}
