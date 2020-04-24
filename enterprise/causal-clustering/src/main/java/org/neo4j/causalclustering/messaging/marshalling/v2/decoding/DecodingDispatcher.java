/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.messaging.marshalling.v2.decoding;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

import org.neo4j.causalclustering.catchup.Protocol;
import org.neo4j.causalclustering.catchup.RequestDecoderDispatcher;
import org.neo4j.causalclustering.messaging.marshalling.v2.ContentType;
import org.neo4j.logging.LogProvider;

public class DecodingDispatcher extends RequestDecoderDispatcher<ContentType>
{
    public DecodingDispatcher( Protocol<ContentType> protocol, LogProvider logProvider )
    {
        super( protocol, logProvider );
        register( ContentType.ContentType, new ByteToMessageDecoder()
        {
            @Override
            protected void decode( ChannelHandlerContext ctx, ByteBuf in, List<Object> out )
            {
                if ( in.readableBytes() > 0 )
                {
                    throw new IllegalStateException( "Not expecting any data here" );
                }
            }
        } );
        register( ContentType.RaftLogEntryTerms, new RaftLogEntryTermsDecoder( protocol ) );
        register( ContentType.ReplicatedContent, new ReplicatedContentChunkDecoder() );
        register( ContentType.Message, new RaftMessageDecoder( protocol ) );
    }
}
