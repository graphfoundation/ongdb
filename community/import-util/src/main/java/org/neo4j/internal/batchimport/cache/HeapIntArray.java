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
package org.neo4j.internal.batchimport.cache;

import java.util.Arrays;

import org.neo4j.memory.HeapEstimator;
import org.neo4j.memory.MemoryTracker;

/**
 * A {@code long[]} on heap, abstracted into a {@link IntArray}.
 */
public class HeapIntArray extends HeapNumberArray<IntArray> implements IntArray
{
    private final int[] array;
    private final int defaultValue;

    public HeapIntArray( int length, int defaultValue, long base, MemoryTracker memoryTracker )
    {
        super( Integer.BYTES, base );
        this.defaultValue = defaultValue;
        this.array = new int[length];
        memoryTracker.allocateHeap( HeapEstimator.sizeOf( array ) );
        clear();
    }

    @Override
    public long length()
    {
        return array.length;
    }

    @Override
    public int get( long index )
    {
        return array[index( index )];
    }

    @Override
    public void set( long index, int value )
    {
        array[index( index )] = value;
    }

    @Override
    public void clear()
    {
        Arrays.fill( array, defaultValue );
    }
}
