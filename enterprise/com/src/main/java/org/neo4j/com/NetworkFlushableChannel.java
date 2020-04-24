/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.com;

import java.io.Flushable;
import java.io.IOException;

import org.jboss.netty.buffer.ChannelBuffer;

import org.neo4j.kernel.impl.transaction.log.FlushableChannel;

public class NetworkFlushableChannel implements Flushable, FlushableChannel
{
    private final ChannelBuffer delegate;

    public NetworkFlushableChannel( ChannelBuffer delegate )
    {
        this.delegate = delegate;
    }

    @Override
    public void flush()
    {
    }

    @Override
    public FlushableChannel put( byte value )
    {
        delegate.writeByte( value );
        return this;
    }

    @Override
    public FlushableChannel putShort( short value )
    {
        delegate.writeShort( value );
        return this;
    }

    @Override
    public FlushableChannel putInt( int value )
    {
        delegate.writeInt( value );
        return this;
    }

    @Override
    public FlushableChannel putLong( long value )
    {
        delegate.writeLong( value );
        return this;
    }

    @Override
    public FlushableChannel putFloat( float value )
    {
        delegate.writeFloat( value );
        return this;
    }

    @Override
    public FlushableChannel putDouble( double value )
    {
        delegate.writeDouble( value );
        return this;
    }

    @Override
    public FlushableChannel put( byte[] value, int length )
    {
        delegate.writeBytes( value, 0, length );
        return this;
    }

    @Override
    public void close()
    {
    }

    @Override
    public Flushable prepareForFlush()
    {
        return this;
    }
}
