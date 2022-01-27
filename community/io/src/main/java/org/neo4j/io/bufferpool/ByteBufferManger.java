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
package org.neo4j.io.bufferpool;

import java.nio.ByteBuffer;

import org.neo4j.memory.MemoryTracker;

/**
 * A native (direct) {@link ByteBuffer} pool.
 * <p>
 * It can be extended to support heap {@link ByteBuffer}s if the need arises.
 * <p>
 * Buffers acquired {@link #acquire(int)} must be {@link #release(ByteBuffer) released},
 * because the secondary function of the pool is keeping of statistics about used memory.
 */
public interface ByteBufferManger
{
    int NO_CAPACITY_PREFERENCE = -1;

    /**
     * Requests a {@link ByteBuffer} of the given size.
     * <p>
     * The returned buffer may have a larger capacity than the size being
     * requested but it will have the limit set to the given size.
     *
     * @param size the size of the buffer
     * @return the requested buffer
     * @see #release(ByteBuffer)
     */
    ByteBuffer acquire( int size );

    /**
     * <p>Returns a {@link ByteBuffer}, obtained with {@link #acquire(int)}
     * making it available for recycling and reuse.<p>
     *
     * @param buffer the buffer to return
     * @see #acquire(int)
     */
    void release( ByteBuffer buffer );

    /**
     * Recommends a size of a buffer given the capacity constraints.
     * <p>
     * The recommended size should be used as a parameter {@link #acquire(int)}
     * to request buffer sizes friendly to the underlying implementation.
     * If {@link #NO_CAPACITY_PREFERENCE} is returned, it means that the implementation does not care
     * about buffer size in the requested range (most likely because buffers in this range are not pooled).
     * <p>
     * If this method does not seem exactly logical, it is because its existence is dictated by Netty's APIs.
     */
    int recommendNewCapacity( int minNewCapacity, int maxCapacity );

    /**
     * This buffer manager works only with direct buffers, but it allows also monitoring memory used by heap buffers.
     * This feature is useful if the user wants to create heap buffers with memory consumption monitored
     * by the same memory pool as direct buffers created by this buffer manager.
     * <p>
     * Because of the special use case for this memory tracker, the only operations
     * guaranteed to be supported by the returned  memory tracker implementation are
     * {@link MemoryTracker#allocateHeap(long)} and {@link MemoryTracker#releaseHeap(long)}.
     */
    MemoryTracker getHeapBufferMemoryTracker();
}
