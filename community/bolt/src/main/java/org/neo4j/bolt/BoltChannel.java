/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.bolt;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;

import java.net.SocketAddress;
import java.util.Set;

import io.netty.util.AttributeKey;
import org.neo4j.bolt.transport.BoltPatchListener;
import org.neo4j.bolt.transport.pipeline.ChannelProtector;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.kernel.api.net.TrackedNetworkConnection;
import org.neo4j.kernel.impl.query.clientconnection.BoltConnectionInfo;
import org.neo4j.memory.HeapEstimator;

import static io.netty.util.AttributeKey.newInstance;

/**
 * A channel through which Bolt messaging can occur.
 */
public class BoltChannel implements TrackedNetworkConnection
{
    public static final long SHALLOW_SIZE = HeapEstimator.shallowSizeOfInstance( BoltChannel.class );

    public static final AttributeKey<Set<BoltPatchListener>> BOLT_PATCH_LISTENERS =
            AttributeKey.valueOf(BoltChannel.class, "boltPatchesListeners" );

    private final String id;
    private final long connectTime;
    private final String connector;
    private final Channel rawChannel;
    private final ChannelProtector protector;

    private volatile String username;
    private volatile String userAgent;
    private volatile ClientConnectionInfo info;
    private volatile String defaultDatabase;

    public BoltChannel( String id, String connector, Channel rawChannel, ChannelProtector protector )
    {
        this.id = id;
        this.connectTime = System.currentTimeMillis();
        this.connector = connector;
        this.rawChannel = rawChannel;
        this.info = createConnectionInfo();
        this.protector = protector;
        this.protector.afterChannelCreated();
    }

    public Channel rawChannel()
    {
        return rawChannel;
    }

    public void installBoltProtocol( ChannelHandler... handlers )
    {
        protector.beforeBoltProtocolInstalled();
        rawChannel.pipeline().addLast( handlers );
    }

    public ClientConnectionInfo info()
    {
        return info;
    }

    @Override
    public String id()
    {
        return id;
    }

    @Override
    public long connectTime()
    {
        return connectTime;
    }

    @Override
    public String connector()
    {
        return connector;
    }

    @Override
    public SocketAddress serverAddress()
    {
        return rawChannel.localAddress();
    }

    @Override
    public SocketAddress clientAddress()
    {
        return rawChannel.remoteAddress();
    }

    @Override
    public String username()
    {
        return username;
    }

    @Override
    public String userAgent()
    {
        return userAgent;
    }

    @Override
    public void updateUser( String username, String userAgent )
    {
        this.username = username;
        this.userAgent = userAgent;
        this.info = createConnectionInfo();
        this.protector.disable();
    }

    public void updateDefaultDatabase( String defaultDatabase )
    {
        this.defaultDatabase = defaultDatabase;
    }

    public String defaultDatabase()
    {
        return defaultDatabase;
    }

    @Override
    public void close()
    {
        Channel channel = rawChannel();
        if ( channel.isOpen() )
        {
            channel.close().syncUninterruptibly();
        }
    }

    @Override
    public String toString()
    {
        return "BoltChannel{" +
               "id='" + id + '\'' +
               ", connectTime=" + connectTime +
               ", connector='" + connector + '\'' +
               ", rawChannel=" + rawChannel +
               ", username='" + username + '\'' +
               ", userAgent='" + userAgent + '\'' +
               '}';
    }

    private ClientConnectionInfo createConnectionInfo()
    {
        return new BoltConnectionInfo( id, userAgent, clientAddress(), serverAddress() );
    }
}
