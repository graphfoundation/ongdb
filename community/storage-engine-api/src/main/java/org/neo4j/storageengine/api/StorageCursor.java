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
package org.neo4j.storageengine.api;

/**
 * Base interface for a cursor accessing and reading data as part of {@link StorageReader}.
 */
public interface StorageCursor extends AutoCloseable
{
    /**
     * Positions this cursor and reads the next item that it has been designated to read.
     * @return {@code true} if the item was read and in use, otherwise {@code false}.
     */
    boolean next();

    /**
     * Resets state in this cursor so that calls to {@link #next()} will not return {@code true} anymore.
     * After this point this cursor can still be used, after initializing it with any of the cursor-specific
     * initialization method.
     */
    void reset();

    default void setTracer( ReadTracer tracer )
    {
    }

    default void removeTracer()
    {
    }

    /**
     * Force loading of the data and ignore errors, even when the datums are unavailable (like not-in-use records) or cannot be properly loaded or decoded.
     * This must ONLY be used by the consistency checker.
     * This method must be called <em>after</em> any cursor initializing call, such as {@code scan}, {@code single}, or {@code init},
     * and <em>before</em> any call to {@link #next()}. A call to {@link #reset()} will undo this call.
     */
    void setForceLoad();

    /**
     * Closes and releases resources allocated by this cursor so that it cannot be initialized or used again after this call.
     */
    @Override
    void close();
}
