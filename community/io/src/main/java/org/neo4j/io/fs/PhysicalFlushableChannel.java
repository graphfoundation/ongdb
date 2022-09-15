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
package org.neo4j.io.fs;

import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;

import org.neo4j.io.ByteUnit;
import org.neo4j.io.memory.HeapScopedBuffer;
import org.neo4j.io.memory.ScopedBuffer;
import org.neo4j.memory.MemoryTracker;

import static java.lang.Math.min;
import static java.lang.Math.toIntExact;
import static org.neo4j.io.memory.HeapScopedBuffer.EMPTY_BUFFER;

/**
 * The main implementation of {@link FlushableChannel}. This class provides buffering over a simple {@link StoreChannel}
 * and, as a side effect, allows control of the flushing of that buffer to disk.
 */
public class PhysicalFlushableChannel implements FlushableChannel
{
    public static final int DEFAULT_BUFFER_SIZE = toIntExact( ByteUnit.kibiBytes( 4 ) );

    private volatile boolean closed;

    protected ScopedBuffer scopedBuffer;
    protected StoreChannel channel;
    protected ByteBuffer buffer;

    public PhysicalFlushableChannel( StoreChannel channel, MemoryTracker memoryTracker )
    {
        this( channel, new HeapScopedBuffer( DEFAULT_BUFFER_SIZE, memoryTracker ) );
    }

    public PhysicalFlushableChannel( StoreChannel channel, ScopedBuffer scopedBuffer )
    {
        this.channel = channel;
        this.scopedBuffer = scopedBuffer;
        this.buffer = scopedBuffer.getBuffer();
    }

    /**
     * External synchronization between this method and close is required so that they aren't called concurrently.
     * Currently that's done by acquiring the PhysicalLogFile monitor.
     */
    @Override
    public Flushable prepareForFlush() throws IOException
    {
        buffer.flip();
        StoreChannel channel = this.channel;
        try
        {
            channel.writeAll( buffer );
        }
        catch ( ClosedChannelException e )
        {
            handleClosedChannelException( e );
        }
        buffer.clear();
        return channel;
    }

    @Override
    public FlushableChannel put( byte value ) throws IOException
    {
        bufferWithGuaranteedSpace( 1 ).put( value );
        return this;
    }

    @Override
    public FlushableChannel putShort( short value ) throws IOException
    {
        bufferWithGuaranteedSpace( Short.BYTES ).putShort( value );
        return this;
    }

    @Override
    public FlushableChannel putInt( int value ) throws IOException
    {
        bufferWithGuaranteedSpace( Integer.BYTES ).putInt( value );
        return this;
    }

    @Override
    public FlushableChannel putLong( long value ) throws IOException
    {
        bufferWithGuaranteedSpace( Long.BYTES ).putLong( value );
        return this;
    }

    @Override
    public FlushableChannel putFloat( float value ) throws IOException
    {
        bufferWithGuaranteedSpace( Float.BYTES ).putFloat( value );
        return this;
    }

    @Override
    public FlushableChannel putDouble( double value ) throws IOException
    {
        bufferWithGuaranteedSpace( Double.BYTES ).putDouble( value );
        return this;
    }

    @Override
    public FlushableChannel put( byte[] value, int offset, int length ) throws IOException
    {
        int localOffset = 0;
        int capacity = buffer.capacity();
        while ( localOffset < length )
        {
            int remaining = buffer.remaining();
            int bufferCapacity = remaining > 0 ? remaining : capacity;
            int chunkSize = min( length - localOffset, bufferCapacity );
            bufferWithGuaranteedSpace( chunkSize ).put( value, offset + localOffset, chunkSize );
            localOffset += chunkSize;
        }
        return this;
    }

    /**
     * External synchronization between this method and emptyBufferIntoChannelAndClearIt is required so that they
     * aren't called concurrently. Currently that's done by acquiring the PhysicalLogFile monitor.
     */
    @Override
    public void close() throws IOException
    {
        prepareForFlush().flush();
        this.closed = true;
        this.channel.close();
        this.scopedBuffer.close();
        this.scopedBuffer = EMPTY_BUFFER;
    }

    /**
     * @return the position of the channel, also taking into account buffer position.
     * @throws IOException if underlying channel throws {@link IOException}.
     */
    public long position() throws IOException
    {
        return channel.position() + buffer.position();
    }

    /**
     * Sets position of this channel to the new {@code position}. This works only if the underlying channel
     * supports positioning.
     *
     * @param position new position (byte offset) to set as new current position.
     * @throws IOException if underlying channel throws {@link IOException}.
     */
    public void position( long position ) throws IOException
    {
        // Currently we take the pessimistic approach of flushing (doesn't imply forcing) buffer to
        // channel before moving to a new position. This works in all cases, but there could be
        // made an optimization where we could see that we're moving within the current buffer range
        // and if so skip flushing and simply move the cursor in the buffer.
        prepareForFlush().flush();
        channel.position( position );
    }

    ByteBuffer bufferWithGuaranteedSpace( int spaceInBytes ) throws IOException
    {
        assert spaceInBytes <= buffer.capacity();
        if ( buffer.remaining() < spaceInBytes )
        {
            prepareForFlush();
        }
        return buffer;
    }

    private void handleClosedChannelException( ClosedChannelException e ) throws ClosedChannelException
    {
        // We don't want to check the closed flag every time we empty, instead we can avoid unnecessary the
        // volatile read and catch ClosedChannelException where we see if the channel being closed was
        // deliberate or not. If it was deliberately closed then throw IllegalStateException instead so
        // that callers won't treat this as a kernel panic.
        if ( closed )
        {
            throw new IllegalStateException( "This log channel has been closed", e );
        }

        // OK, this channel was closed without us really knowing about it, throw exception as is.
        throw e;
    }
}
