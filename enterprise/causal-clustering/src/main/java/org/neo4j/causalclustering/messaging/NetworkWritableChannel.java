/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.causalclustering.messaging;

import java.io.Flushable;

import io.netty.buffer.ByteBuf;

import org.neo4j.kernel.impl.transaction.log.FlushableChannel;
import org.neo4j.storageengine.api.WritableChannel;

public class NetworkWritableChannel implements WritableChannel, ByteBufBacked
{
    private final ByteBuf delegate;

    public NetworkWritableChannel( ByteBuf byteBuf )
    {
        this.delegate = byteBuf;
    }

    @Override
    public WritableChannel put( byte value )
    {
        delegate.writeByte( value );
        return this;
    }

    @Override
    public WritableChannel putShort( short value )
    {
        delegate.writeShort( value );
        return this;
    }

    @Override
    public WritableChannel putInt( int value )
    {
        delegate.writeInt( value );
        return this;
    }

    @Override
    public WritableChannel putLong( long value )
    {
        delegate.writeLong( value );
        return this;
    }

    @Override
    public WritableChannel putFloat( float value )
    {
        delegate.writeFloat( value );
        return this;
    }

    @Override
    public WritableChannel putDouble( double value )
    {
        delegate.writeDouble( value );
        return this;
    }

    @Override
    public WritableChannel put( byte[] value, int length )
    {
        delegate.writeBytes( value, 0, length );
        return this;
    }

    @Override
    public ByteBuf byteBuf()
    {
        return delegate;
    }
}
