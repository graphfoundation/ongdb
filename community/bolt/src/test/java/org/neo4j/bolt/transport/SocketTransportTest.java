/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.bolt.transport;

import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.net.InetSocketAddress;
import java.time.Duration;

import org.neo4j.bolt.transport.pipeline.AuthenticationTimeoutHandler;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.net.TrackedNetworkConnection;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.MemoryPool;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.server.config.AuthConfigProvider;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.neo4j.bolt.transport.TransportThrottleGroup.NO_THROTTLE;

class SocketTransportTest
{
    @Test
    void shouldManageChannelsInChannelInitializer()
    {
        NetworkConnectionTracker connectionTracker = mock( NetworkConnectionTracker.class );
        SocketTransport socketTransport = newSocketTransport( connectionTracker, NO_THROTTLE );

        EmbeddedChannel channel = new EmbeddedChannel( socketTransport.channelInitializer() );

        ArgumentCaptor<TrackedNetworkConnection> captor = ArgumentCaptor.forClass( TrackedNetworkConnection.class );
        verify( connectionTracker ).add( captor.capture() );
        verify( connectionTracker, never() ).remove( any() );

        channel.close();

        verify( connectionTracker ).remove( captor.getValue() );
    }

    @Test
    void shouldManageThrottlersInChannelInitializer()
    {
        TransportThrottleGroup throttleGroup = mock( TransportThrottleGroup.class );
        SocketTransport socketTransport = newSocketTransport( NetworkConnectionTracker.NO_OP, throttleGroup );

        EmbeddedChannel channel = new EmbeddedChannel( socketTransport.channelInitializer() );

        verify( throttleGroup ).install( eq(channel), any(MemoryTracker.class) );
        verify( throttleGroup, never() ).uninstall( channel );

        channel.close();

        verify( throttleGroup ).uninstall( channel );
    }

    @Test
    void shouldInstallAuthTimeoutHandler()
    {
        SocketTransport socketTransport = newSocketTransport( NetworkConnectionTracker.NO_OP, NO_THROTTLE );

        EmbeddedChannel channel = new EmbeddedChannel( socketTransport.channelInitializer() );

        assertNotNull( channel.pipeline().get( AuthenticationTimeoutHandler.class ) );
    }

    @Test
    void shouldInstallTransportSelectionHandler()
    {
        SocketTransport socketTransport = newSocketTransport( NetworkConnectionTracker.NO_OP, NO_THROTTLE );

        EmbeddedChannel channel = new EmbeddedChannel( socketTransport.channelInitializer() );

        TransportSelectionHandler handler = channel.pipeline().get( TransportSelectionHandler.class );
        assertNotNull( handler );
    }

    private static SocketTransport newSocketTransport( NetworkConnectionTracker connectionTracker, TransportThrottleGroup throttleGroup )
    {
        return new SocketTransport( "bolt", new InetSocketAddress( "localhost", 7687 ), null, false,
                                    NullLogProvider.getInstance(), throttleGroup,
                                    mock( BoltProtocolFactory.class ), connectionTracker, Duration.ZERO,
                                    -1, PooledByteBufAllocator.DEFAULT, mock( MemoryPool.class ), mock( AuthConfigProvider.class ),
                                    mock( Config.class ) );
    }
}
