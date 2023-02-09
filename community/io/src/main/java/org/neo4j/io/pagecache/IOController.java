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
package org.neo4j.io.pagecache;

import java.io.Flushable;
import java.io.IOException;

import org.neo4j.io.pagecache.tracing.MajorFlushEvent;

/**
 * IOController instances used by page file to control speed of data flushing when {@link PageCache#flushAndForce()} invoked.
 * As part of flush controller's {@link #maybeLimitIO(int, Flushable, MajorFlushEvent)} method is invoked on regular intervals.
 * <p/>
 * This allows the controller to measure the rate of IO (including io performed by other system parts), and inject sleeps, pauses or flushes into the process.
 * The flushes are in this case referring to the underlying hardware.
 * <p/>
 * Normally, flushing a channel will just copy the dirty buffers into the OS page cache, but flushing is in this case
 * implying that the OS pages are cleared as well. In other words, the IOController can make sure that the operating
 * system does not pile up too much IO work in its page cache, by flushing those caches as well on regular intervals.
 */
public interface IOController
{

    /**
     * An IOController implementation that does not do anything. Use this implementation if you want the
     * flush to go as fast as possible.
     */
    IOController DISABLED = new EmptyIOController();

    /**
     * Invoked at regular intervals during flushing of the {@link PageCache} or {@link PagedFile}s.
     * <p/>
     * The implementation is allowed to force changes to the storage device using the given {@link Flushable}, or
     * to perform {@link Thread#sleep(long) sleeps}, as it desires. It is not allowed to throw
     * {@link InterruptedException}, however. Those should be dealt with by catching them and re-interrupting the
     * current thread, or by wrapping them in {@link IOException}s.
     *
     * @param recentlyCompletedIOs The number of IOs completed by caller since the last call to this method.
     * @param flushable A {@link Flushable} instance that can flush any relevant dirty system buffers, to help smooth
     * out the IO load on the storage device.
     * @param flushEvent A {@link MajorFlushEvent} event that describes ongoing io represented by flushable instance.
     */
    void maybeLimitIO( int recentlyCompletedIOs, Flushable flushable, MajorFlushEvent flushEvent );

    /**
     * Temporarily disable the IOController, to allow IO to proceed at full speed.
     * This call <strong>MUST</strong> be paired with a subsequent {@link #enable()} call.
     * This method is thread-safe and reentrant. Multiple concurrent calls will "stack", and IO limitations will be
     * enabled again once the last overlapping limit-disabling period ends with the "last" call to
     * {@link #enable()}. This is conceptually similar to how a reentrant read-lock works.
     *
     * Thus, the typical usage pattern is with a {@code try-finally} clause, like this:
     *
     * <pre><code>
     *     controller.disable();
     *     try
     *     {
     *         // ... do work that needs maximum IO performance ...
     *     }
     *     finally
     *     {
     *         controller.enable();
     *     }
     * </code></pre>
     */
    default void disable()
    {
        // By default this method does nothing, assuming the implementation always has no or fixed limits.
    }

    /**
     * Report any external IO that could be taken into account during evaluation of limits, to inject pauses or sleeps.
     *
     * @param completedIOs - number of completed external IOs.
     */
    void reportIO( int completedIOs );

    /**
     * Re-enable the IOController, after having disabled it with {@link #disable()}.
     *
     * @see #disable() for how to use this method.
     */
    default void enable()
    {
        // Same as for disable().
    }

    /**
     * @return {@code true} if controller is currently enabled
     */
    default boolean isEnabled()
    {
        return false;
    }
}
