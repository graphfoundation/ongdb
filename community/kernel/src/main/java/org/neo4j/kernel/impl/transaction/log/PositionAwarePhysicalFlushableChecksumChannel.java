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
package org.neo4j.kernel.impl.transaction.log;

import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.neo4j.io.fs.FlushableChecksumChannel;
import org.neo4j.io.fs.PhysicalFlushableChecksumChannel;
import org.neo4j.io.memory.ScopedBuffer;

import static org.neo4j.io.memory.HeapScopedBuffer.EMPTY_BUFFER;

/**
 * Decorator around a {@link LogVersionedStoreChannel} making it expose {@link FlushablePositionAwareChecksumChannel}. This
 * implementation uses a {@link PhysicalFlushableChecksumChannel}, which provides buffering for write operations over the
 * decorated channel.
 */
public class PositionAwarePhysicalFlushableChecksumChannel implements FlushablePositionAwareChecksumChannel
{
    private LogVersionedStoreChannel logVersionedStoreChannel;
    private final PhysicalFlushableLogChannel channel;

    public PositionAwarePhysicalFlushableChecksumChannel( LogVersionedStoreChannel logVersionedStoreChannel, ScopedBuffer buffer )
    {
        this.logVersionedStoreChannel = logVersionedStoreChannel;
        this.channel = new PhysicalFlushableLogChannel( logVersionedStoreChannel, buffer );
    }

    @Override
    public LogPositionMarker getCurrentPosition( LogPositionMarker positionMarker ) throws IOException
    {
        positionMarker.mark( logVersionedStoreChannel.getVersion(), channel.position() );
        return positionMarker;
    }

    @Override
    public LogPosition getCurrentPosition() throws IOException
    {
        return new LogPosition( logVersionedStoreChannel.getVersion(), channel.position() );
    }

    @Override
    public Flushable prepareForFlush() throws IOException
    {
        return channel.prepareForFlush();
    }

    @Override
    public int putChecksum() throws IOException
    {
        return channel.putChecksum();
    }

    @Override
    public void beginChecksum()
    {
        channel.beginChecksum();
    }

    @Override
    public FlushableChecksumChannel put( byte value ) throws IOException
    {
        return channel.put( value );
    }

    @Override
    public FlushableChecksumChannel putShort( short value ) throws IOException
    {
        return channel.putShort( value );
    }

    @Override
    public FlushableChecksumChannel putInt( int value ) throws IOException
    {
        return channel.putInt( value );
    }

    @Override
    public FlushableChecksumChannel putLong( long value ) throws IOException
    {
        return channel.putLong( value );
    }

    @Override
    public FlushableChecksumChannel putFloat( float value ) throws IOException
    {
        return channel.putFloat( value );
    }

    @Override
    public FlushableChecksumChannel putDouble( double value ) throws IOException
    {
        return channel.putDouble( value );
    }

    @Override
    public FlushableChecksumChannel put( byte[] value, int offset, int length ) throws IOException
    {
        return channel.put( value, offset, length );
    }

    @Override
    public void close() throws IOException
    {
        channel.close();
        channel.setScopedBuffer( EMPTY_BUFFER );
    }

    @Override
    public void write( ByteBuffer buffer ) throws IOException
    {
        logVersionedStoreChannel.writeAll( buffer );
    }

    public void setChannel( LogVersionedStoreChannel channel )
    {
        this.logVersionedStoreChannel = channel;
        this.channel.setChannel( channel );
    }
}
