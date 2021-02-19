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
package org.neo4j.causalclustering.handlers;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;

import java.util.Collections;
import java.util.List;

import org.neo4j.ssl.SslPolicy;

public class SecureServerPipelineWrapper implements PipelineWrapper
{
    private final SslPolicy sslPolicy;

    SecureServerPipelineWrapper( SslPolicy sslPolicy )
    {
        this.sslPolicy = sslPolicy;
    }

    public List<ChannelHandler> handlersFor( Channel channel ) throws Exception
    {
        return this.sslPolicy != null ? Collections.singletonList( this.sslPolicy.nettyServerHandler( channel ) ) : Collections.emptyList();
    }

    public String name()
    {
        return "tls_server";
    }
}
