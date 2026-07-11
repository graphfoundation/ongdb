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
package org.neo4j.causalclustering.messaging.marshalling.v2.decoding;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import org.neo4j.causalclustering.catchup.Protocol;
import org.neo4j.causalclustering.messaging.marshalling.v2.ContentType;

public class ContentTypeDispatcher extends ChannelInboundHandlerAdapter
{
    private final Protocol<ContentType> contentTypeProtocol;

    public ContentTypeDispatcher( Protocol<ContentType> contentTypeProtocol )
    {
        this.contentTypeProtocol = contentTypeProtocol;
    }

    @Override
    public void channelRead( ChannelHandlerContext ctx, Object msg )
    {
        if ( msg instanceof ByteBuf )
        {
            ByteBuf buffer = (ByteBuf) msg;
            if ( contentTypeProtocol.isExpecting( ContentType.ContentType ) )
            {
                byte messageCode = buffer.readByte();
                ContentType contentType = getContentType( messageCode );
                contentTypeProtocol.expect( contentType );
                if ( !buffer.isReadable() )
                {
                    ReferenceCountUtil.release( msg );
                    return;
                }
            }
        }
        ctx.fireChannelRead( msg );
    }

    private ContentType getContentType( byte messageCode )
    {
        for ( ContentType contentType : ContentType.values() )
        {
            if ( contentType.get() == messageCode )
            {
                return contentType;
            }
        }
        throw new IllegalArgumentException( "Illegal inbound. Could not find a ContentType with value " + messageCode );
    }
}
