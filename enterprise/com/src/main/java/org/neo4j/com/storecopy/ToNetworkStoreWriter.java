/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.com.storecopy;

import org.jboss.netty.buffer.ChannelBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

import org.neo4j.com.BlockLogBuffer;
import org.neo4j.com.Protocol;
import org.neo4j.kernel.monitoring.ByteCounterMonitor;
import org.neo4j.kernel.monitoring.Monitors;

public class ToNetworkStoreWriter implements StoreWriter
{
    public static final String STORE_COPIER_MONITOR_TAG = "storeCopier";

    private final ChannelBuffer targetBuffer;
    private final ByteCounterMonitor bufferMonitor;

    public ToNetworkStoreWriter( ChannelBuffer targetBuffer, Monitors monitors )
    {
        this.targetBuffer = targetBuffer;
        bufferMonitor = monitors.newMonitor( ByteCounterMonitor.class, getClass(), STORE_COPIER_MONITOR_TAG );
    }

    @Override
    public long write( String path, ReadableByteChannel data, ByteBuffer temporaryBuffer,
            boolean hasData, int requiredElementAlignment ) throws IOException
    {
        char[] chars = path.toCharArray();
        targetBuffer.writeShort( chars.length );
        Protocol.writeChars( targetBuffer, chars );
        targetBuffer.writeByte( hasData ? 1 : 0 );
        // TODO Make use of temporaryBuffer?
        BlockLogBuffer buffer = new BlockLogBuffer( targetBuffer, bufferMonitor );
        long totalWritten = Short.BYTES + chars.length * Character.BYTES + Byte.BYTES;
        if ( hasData )
        {
            targetBuffer.writeInt( requiredElementAlignment );
            totalWritten += Integer.BYTES;
            totalWritten += buffer.write( data );
            buffer.close();
        }
        return totalWritten;
    }

    @Override
    public void close()
    {
        targetBuffer.writeShort( 0 );
    }
}
