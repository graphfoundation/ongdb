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
package org.neo4j.kernel.impl.index.schema;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.io.memory.ScopedBuffer;
import org.neo4j.io.pagecache.ByteArrayPageCursor;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.io.IOUtils.closeAllUnchecked;
import static org.neo4j.util.concurrent.Runnables.runAll;

/**
 * Not thread safe, except for {@link #count()} which does not support calls concurrent with {@link #add(Object)}.
 *
 * Storage that store {@link ENTRY entries} in a file by simply appending them.
 * Entries can be read back, in the order they where added, through a {@link CURSOR}.
 * This storage is useful when we don't want to hold all entries in memory.
 *
 * Extending classes are responsible for serializing and deserializing entries.
 *
 * On close, file will be deleted but provided {@link ByteBufferFactory} will not be closed.
 *
 * @param <ENTRY> Type of entry we are storing.
 * @param <CURSOR> Cursor type responsible for deserializing what we have stored.
 */
public abstract class SimpleEntryStorage<ENTRY, CURSOR> implements Closeable
{
    static final int TYPE_SIZE = Byte.BYTES;
    static final byte STOP_TYPE = -1;
    private static final byte[] NO_ENTRIES = {STOP_TYPE};
    private final Path file;
    private final FileSystemAbstraction fs;
    private final int blockSize;
    private final MemoryTracker memoryTracker;
    private final ByteBufferFactory.Allocator byteBufferFactory;

    // Resources allocated lazily upon add
    private boolean allocated;
    private ScopedBuffer scopedBuffer;
    private ByteBuffer buffer;
    private ByteArrayPageCursor pageCursor;
    private StoreChannel storeChannel;

    private final AtomicLong count = new AtomicLong();

    SimpleEntryStorage( FileSystemAbstraction fs, Path file, ByteBufferFactory.Allocator byteBufferFactory, int blockSize, MemoryTracker memoryTracker )
    {
        this.fs = fs;
        this.file = file;
        this.byteBufferFactory = byteBufferFactory;
        this.blockSize = blockSize;
        this.memoryTracker = memoryTracker;
    }

    void add( ENTRY entry ) throws IOException
    {
        allocateResources();
        add( entry, pageCursor );
        // a single thread, and the same thread every time, increments this count
        count.incrementAndGet();
    }

    CURSOR reader() throws IOException
    {
        if ( !allocated )
        {
            return reader( ByteArrayPageCursor.wrap( NO_ENTRIES ) );
        }

        // Reuse the existing buffer because we're not writing while reading anyway
        ReadAheadChannel<StoreChannel> channel = new ReadAheadChannel<>( fs.read( file ), byteBufferFactory.allocate( blockSize, memoryTracker ) );
        PageCursor pageCursor = new ReadableChannelPageCursor( channel );
        return reader( pageCursor );
    }

    long count()
    {
        return count.get();
    }

    void doneAdding() throws IOException
    {
        if ( !allocated )
        {
            return;
        }
        if ( buffer.remaining() < TYPE_SIZE )
        {
            flush();
        }
        pageCursor.putByte( STOP_TYPE );
        flush();
    }

    @Override
    public void close() throws IOException
    {
        if ( allocated )
        {
            runAll( "Failed while trying to close " + getClass().getSimpleName(),
                    () -> closeAllUnchecked( pageCursor, storeChannel, scopedBuffer ),
                    () ->
                    {
                        try
                        {
                            fs.deleteFile( file );
                        }
                        catch ( IOException e )
                        {
                            throw new UncheckedIOException( e );
                        }
                    }
            );
        }
        else
        {
            if ( fs.fileExists( file ) )
            {
                fs.deleteFile( file );
            }
        }
    }

    /**
     * DON'T CALL THIS METHOD DIRECTLY. Instead, use {@link #add(Object)}.
     * Write entry to pageCursor. Implementor of this method is responsible for calling {@link #prepareWrite(int)} before actually start writing.
     */
    abstract void add( ENTRY entry, PageCursor pageCursor ) throws IOException;

    /**
     * DON'T CALL THIS METHOD DIRECTLY. Instead use {@link #reader()}.
     * Return {@link CURSOR} responsible for deserializing wrapping provided {@link PageCursor}, pointing to head of file.
     */
    abstract CURSOR reader( PageCursor pageCursor ) throws IOException;

    /**
     * DON'T CALL THIS METHOD DIRECTLY. Only used by subclasses.
     */
    void prepareWrite( int entrySize ) throws IOException
    {
        if ( entrySize > buffer.remaining() )
        {
            flush();
        }
    }

    private void flush() throws IOException
    {
        buffer.flip();
        storeChannel.writeAll( buffer );
        buffer.clear();
    }

    private void allocateResources() throws IOException
    {
        if ( !allocated )
        {
            this.scopedBuffer = byteBufferFactory.allocate( blockSize, memoryTracker );
            this.buffer = scopedBuffer.getBuffer();
            this.pageCursor = new ByteArrayPageCursor( buffer );
            this.storeChannel = fs.write( file );
            this.allocated = true;
        }
    }
}
