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
package org.neo4j.com;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import java.nio.ByteBuffer;

import static java.util.Objects.requireNonNull;

public class ChannelContext
{
    private final Channel channel;
    private final ChannelBuffer output;
    private final ByteBuffer input;

    public ChannelContext( Channel channel, ChannelBuffer output, ByteBuffer input )
    {
        this.channel = requireNonNull( channel );
        this.output = requireNonNull( output );
        this.input = requireNonNull( input );
    }

    public Channel channel()
    {
        return channel;
    }

    public ChannelBuffer output()
    {
        return output;
    }

    public ByteBuffer input()
    {
        return input;
    }

    @Override
    public String toString()
    {
        return "ChannelContext{channel=" + channel + ", output=" + output + ", input=" + input + "}";
    }
}
