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

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.pagecache.tracing.PageFileSwapperTracer;

/**
 * <strong>Implementation note:</strong> These methods must NEVER swallow a thread-interrupt.
 * If the thread is interrupted when these methods are called, or gets interrupted while they are
 * executing, then they must either throw an InterruptedException, or leave the interrupted-status
 * flag alone.
 */
public interface PageSwapper extends Closeable
{
    /**
     * Read the page with the given filePageId, from the concrete file on the
     * file system, into the page given by the bufferAddress and default bufferSize.
     * <p>
     * Returns the number of bytes read in from the file. May be zero if the
     * requested page was beyond the end of the file. If less than the file
     * page size, then the rest of the page will contain zeros.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then the implementation must reopen the
     * channel and the operation must be retried.
     */
    long read( long filePageId, long bufferAddress ) throws IOException;

    /**
     * Read the page with the given filePageId, from the concrete file on the
     * file system, into the page given by the bufferAddress and the bufferSize.
     * <p>
     * Returns the number of bytes read in from the file. May be zero if the
     * requested page was beyond the end of the file. If less than the file
     * page size, then the rest of the page will contain zeros.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then the implementation must reopen the
     * channel and the operation must be retried.
     */
    long read( long filePageId, long bufferAddress, int bufferLength ) throws IOException;

    /**
     * Read pages from the file into the pages given by the bufferAddresses, starting from the given startFilePageId.
     * <p>
     * Returns the number of bytes read in from the file. May be zero if the
     * requested startFilePageId was beyond the end of the file. If the file does not have enough data
     * to fill up all the buffer space represented by the pages, then the remaining buffer space will be
     * filled with zero bytes.
     * <p>
     * The contents of the pages should be considered to be garbage if the operation throws an exception,
     * since the constituent reads can be reordered, and no zeroing will take place.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then the implementation must reopen the
     * channel and the operation must be retried.
     */
    long read( long startFilePageId, long[] bufferAddresses, int[] bufferLengths, int length ) throws IOException;

    /**
     * Write the contents of the page given by the bufferAddress and default length of page buffer,
     * to the concrete file on the file system, at the located indicated by the given
     * filePageId.
     * <p>
     * Returns the number of bytes written to the file.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then implementation must reopen the
     * channel and the operation must be retried.
     */
    long write( long filePageId, long bufferAddress ) throws IOException;

    /**
     * Write the contents of the page given by the bufferAddress and the bufferLength,
     * to the concrete file on the file system, at the located indicated by the given
     * filePageId.
     * <p>
     * Returns the number of bytes written to the file.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then implementation must reopen the
     * channel and the operation must be retried.
     */
    long write( long filePageId, long bufferAddress, int bufferLength ) throws IOException;

    /**
     * Write the contents of the given pages, to the concrete file on the file system,
     * starting at the location of the given startFilePageId.
     * <p>
     * If an exception is thrown, then some of the data may have been written, and some might not.
     * The writes may reorder and tear, so no guarantee can be made about what has been written and what has not, if
     * an exception is thrown. Therefor, the entire write operation should be retried, in the case of failure, or the
     * data should be rewritten through other means.
     * <p>
     * Returns the number of bytes written to the file.
     * <p>
     * Note: It is possible for the channel to be asynchronously closed while
     * this operation is taking place. For instance, if the current thread is
     * interrupted. If this happens, then implementation must reopen the
     * channel and the operation must be retried.
     */
    long write( long startFilePageId, long[] bufferAddresses, int[] bufferLengths, int length, int totalAffectedPages ) throws IOException;

    /**
     * Notification that a page has been evicted, used to clean up state in structures
     * outside the page table.
     */
    void evicted( long pageId );

    /**
     * Get the file that this PageSwapper represents.
     */
    Path path();

    /**
     * Close and release all resources associated with the file underlying this PageSwapper, and then delete that file.
     * @throws IOException If an {@link IOException} occurs during either the closing or the deleting of the file. This
     * may leave the file on the file system.
     */
    void closeAndDelete() throws IOException;

    /**
     * Forces all writes done by this PageSwapper to the underlying storage device, such that the writes are durable
     * when this call returns.
     */
    void force() throws IOException;

    /**
     * Get the filePageId of the last page in the concrete file.
     */
    long getLastPageId() throws IOException;

    /**
     * Truncate the file represented by this PageSwapper, so the size of the file is zero and
     * {@link #getLastPageId()} returns -1.
     * <p>
     * Truncation may occur concurrently with writes, in which case both operations will appear to be atomic, such that
     * either the write happens before the truncation and is lost, or the file is truncated and the write then extends
     * the file with any zero padding and the written data.
     */
    void truncate() throws IOException;

    /**
     * @return {@code true} if the given page swapper implementation supports pre-allocating files.
     */
    boolean canAllocate();

    /**
     * Send a hint to the file system that it may reserve the given number of bytes of capacity for this file.
     * The hope is that this might speed up future operations and reduce fragmentation.
     * @param newFileSize The new size of the file; following this call, the file system may anticipate to receive IOs in this range.
     */
    void allocate( long newFileSize ) throws IOException;

    /**
     * Each page swapper have a id that is unique for the lifetime of a swapper. Ids can be reused later on if particular swapper is closed.
     * @return underlying page swapper id
     */
    int swapperId();

    /**
     * Tracer of this page swapper. Each page swapper has an ability to get newly allocated tracer on creation to be able to tracer individual page cache events
     */
    PageFileSwapperTracer fileSwapperTracer();
}
