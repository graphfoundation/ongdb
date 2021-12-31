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
package org.neo4j.causalclustering.catchup;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ServerMessageTypeHandler extends ChannelInboundHandlerAdapter
{
    private final Log log;
    private final CatchupServerProtocol protocol;

    public ServerMessageTypeHandler( CatchupServerProtocol protocol, LogProvider logProvider )
    {
        this.protocol = protocol;
        this.log = logProvider.getLog( getClass() );
    }

    @Override
    public void channelRead( ChannelHandlerContext ctx, Object msg )
    {
        if ( protocol.isExpecting( CatchupServerProtocol.State.MESSAGE_TYPE ) )
        {
            RequestMessageType requestMessageType = RequestMessageType.from( ((ByteBuf) msg).readByte() );

            if ( requestMessageType.equals( RequestMessageType.TX_PULL_REQUEST ) )
            {
                protocol.expect( CatchupServerProtocol.State.TX_PULL );
            }
            else if ( requestMessageType.equals( RequestMessageType.STORE_ID ) )
            {
                protocol.expect( CatchupServerProtocol.State.GET_STORE_ID );
            }
            else if ( requestMessageType.equals( RequestMessageType.CORE_SNAPSHOT ) )
            {
                protocol.expect( CatchupServerProtocol.State.GET_CORE_SNAPSHOT );
            }
            else if ( requestMessageType.equals( RequestMessageType.PREPARE_STORE_COPY ) )
            {
                protocol.expect( CatchupServerProtocol.State.PREPARE_STORE_COPY );
            }
            else if ( requestMessageType.equals( RequestMessageType.STORE_FILE ) )
            {
                protocol.expect( CatchupServerProtocol.State.GET_STORE_FILE );
            }
            else if ( requestMessageType.equals( RequestMessageType.INDEX_SNAPSHOT ) )
            {
                protocol.expect( CatchupServerProtocol.State.GET_INDEX_SNAPSHOT );
            }
            else
            {
                log.warn( "No handler found for message type %s", requestMessageType );
            }

            ReferenceCountUtil.release( msg );
        }
        else
        {
            ctx.fireChannelRead( msg );
        }
    }
}
