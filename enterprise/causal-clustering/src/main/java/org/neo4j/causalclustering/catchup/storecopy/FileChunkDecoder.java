/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * Neo4j object code can be licensed independently from the source
 * under separate terms from the AGPL. Inquiries can be directed to:
 * licensing@neo4j.com
 *
 * More information is also available at:
 * https://neo4j.com/licensing/
 */
package org.neo4j.causalclustering.catchup.storecopy;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

import org.neo4j.causalclustering.messaging.NetworkReadableClosableChannelNetty4;

/**
 * This class does not consume bytes during the decode method. Instead, it puts a {@link FileChunk} object with
 * a reference to the buffer, to be consumed later. This is the reason it does not extend
 * {@link io.netty.handler.codec.ByteToMessageDecoder}, since that class fails if an object is added in the out
 * list but no bytes have been consumed.
 */
public class FileChunkDecoder extends MessageToMessageDecoder<ByteBuf>
{
    @Override
    protected void decode( ChannelHandlerContext ctx, ByteBuf msg, List<Object> out ) throws Exception
    {
        out.add( FileChunk.marshal().unmarshal( new NetworkReadableClosableChannelNetty4( msg ) ) );
    }
}
