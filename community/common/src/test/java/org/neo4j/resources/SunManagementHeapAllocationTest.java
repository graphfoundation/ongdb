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
package org.neo4j.resources;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.neo4j.resources.HeapAllocation.HEAP_ALLOCATION;
import static org.neo4j.resources.HeapAllocation.NOT_AVAILABLE;

class SunManagementHeapAllocationTest
{
    @Test
    void shouldLoadHeapAllocation()
    {
        assertNotSame( NOT_AVAILABLE, HEAP_ALLOCATION );
        assertThat( HEAP_ALLOCATION ).isInstanceOf( SunManagementHeapAllocation.class );
    }

    @Test
    void shouldMeasureAllocation()
    {
        // given
        long allocatedBytes = HEAP_ALLOCATION.allocatedBytes( currentThread() );

        // when
        List<Object> objects = new ArrayList<>();
        for ( int i = 0; i < 17; i++ )
        {
            objects.add( new Object() );
        }

        // then
        assertThat( allocatedBytes ).isLessThan( HEAP_ALLOCATION.allocatedBytes( currentThread() ) );
        assertEquals( 17, objects.size() );
    }
}
