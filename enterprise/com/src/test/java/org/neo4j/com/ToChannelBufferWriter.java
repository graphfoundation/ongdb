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

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

import org.jboss.netty.buffer.ChannelBuffer;

import org.neo4j.kernel.monitoring.ByteCounterMonitor;
import org.neo4j.kernel.monitoring.Monitors;

public class ToChannelBufferWriter implements MadeUpWriter
{
    private final ChannelBuffer target;

    public ToChannelBufferWriter( ChannelBuffer target )
    {
        this.target = target;
    }

    @Override
    public void write( ReadableByteChannel data )
    {
        try ( BlockLogBuffer blockBuffer = new BlockLogBuffer( target, new Monitors().newMonitor( ByteCounterMonitor.class ) ) )
        {
            blockBuffer.write( data );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }
}
