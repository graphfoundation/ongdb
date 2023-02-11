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
package org.neo4j.collection.trackable;

import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;

import org.neo4j.memory.MemoryTracker;

public final class HeapTrackingCollections
{
    private HeapTrackingCollections()
    {
    }

    public static <V> MutableIntObjectMap<V> newIntObjectHashMap( MemoryTracker memoryTracker )
    {
        return HeapTrackingIntObjectHashMap.createIntObjectHashMap( memoryTracker );
    }

    public static HeapTrackingLongHashSet newLongSet( MemoryTracker memoryTracker )
    {
        return HeapTrackingLongHashSet.createLongHashSet( memoryTracker );
    }

    public static HeapTrackingLongHashSet newLongSet( MemoryTracker memoryTracker, int initialCapacity )
    {
        return HeapTrackingLongHashSet.createLongHashSet( memoryTracker, initialCapacity );
    }

    public static <V> HeapTrackingLongObjectHashMap<V> newLongObjectMap( MemoryTracker memoryTracker )
    {
        return HeapTrackingLongObjectHashMap.createLongObjectHashMap( memoryTracker );
    }

    public static HeapTrackingLongIntHashMap newLongIntMap( MemoryTracker memoryTracker )
    {
        return HeapTrackingLongIntHashMap.createLongIntHashMap( memoryTracker );
    }

    public static <K,V> HeapTrackingUnifiedMap<K,V> newMap( MemoryTracker memoryTracker )
    {
        return HeapTrackingUnifiedMap.createUnifiedMap( memoryTracker );
    }

    public static <T> HeapTrackingUnifiedSet<T> newSet( MemoryTracker memoryTracker )
    {
        return HeapTrackingUnifiedSet.createUnifiedSet( memoryTracker );
    }

    public static <T> HeapTrackingArrayList<T> newArrayList( int initialSize, MemoryTracker memoryTracker )
    {
        return HeapTrackingArrayList.newArrayList( initialSize, memoryTracker );
    }

    public static <T> HeapTrackingArrayList<T> newArrayList( MemoryTracker memoryTracker )
    {
        return HeapTrackingArrayList.newArrayList( memoryTracker );
    }

    public static HeapTrackingLongStack newLongStack( MemoryTracker memoryTracker )
    {
        return new HeapTrackingLongStack( HeapTrackingLongArrayList.newLongArrayList( memoryTracker ) );
    }

    public static <T> HeapTrackingStack<T> newStack( MemoryTracker memoryTracker )
    {
        return new HeapTrackingStack<>( HeapTrackingArrayList.newArrayList( memoryTracker ) );
    }
}
