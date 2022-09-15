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

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.unix.DomainSocketAddress;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

import org.neo4j.bolt.BoltServer;
import org.neo4j.bolt.transport.configuration.EpollConfigurationProvider;
import org.neo4j.bolt.transport.configuration.NioConfigurationProvider;
import org.neo4j.bolt.transport.configuration.ServerConfigurationProvider;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.connectors.BoltConnectorInternalSettings;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.PortBindException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.neo4j.function.ThrowingAction.executeAll;

/**
 * Simple wrapper around Netty boss and selector threads, which allows multiple ports and protocols to be handled by the same set of common worker threads.
 */
public class NettyServer extends LifecycleAdapter
{
    private final ServerConfigurationProvider configurationProvider;
    private final ProtocolInitializer externalInitializer;
    private final Config config;
    private final ProtocolInitializer internalInitializer;
    private final ThreadFactory tf;
    private final ProtocolInitializer loopbackInitializer;
    private final ConnectorPortRegister portRegister;
    private final Log userLog;
    private final Log internalLog;

    private EventLoopGroup eventLoopGroup;
    private final List<Channel> serverChannels;

    /**
     * Describes how to initialize new channels for a protocol, and which address the protocol should be bolted into.
     */
    public interface ProtocolInitializer
    {
        ChannelInitializer<Channel> channelInitializer();

        java.net.SocketAddress address();
    }

    /**
     * @param tf                  used to create IO threads to listen and handle network events
     * @param externalInitializer function for bolt connector map to bootstrap configured protocol
     * @param connectorRegister   register to keep local address information on all configured connectors
     */
    public NettyServer( ThreadFactory tf, ProtocolInitializer externalInitializer, ProtocolInitializer loopbackInitializer,
                        ConnectorPortRegister connectorRegister, LogService logService, Config config )
    {
        this.externalInitializer = externalInitializer;
        this.config = config;
        this.internalInitializer = null;
        this.loopbackInitializer = loopbackInitializer;
        this.tf = tf;
        this.portRegister = connectorRegister;
        this.userLog = logService.getUserLog( BoltServer.class );
        this.internalLog = logService.getUserLog( getClass() );
        this.configurationProvider = createConfigurationProvider( config );
        this.serverChannels = new ArrayList<>();
    }

    /**
     * @param tf                  used to create IO threads to listen and handle network events
     * @param externalInitializer function for bolt connector map to bootstrap configured protocol
     * @param internalInitializer function for bolt connertion map to bootstrap configured internal protocol connections
     * @param connectorRegister   register to keep local address information on all configured connectors
     */
    public NettyServer( ThreadFactory tf, ProtocolInitializer externalInitializer,
                        ProtocolInitializer internalInitializer, ProtocolInitializer loopbackInitializer,
                        ConnectorPortRegister connectorRegister, LogService logService, Config config )
    {
        this.externalInitializer = externalInitializer;
        this.config = config;
        this.internalInitializer = internalInitializer;
        this.loopbackInitializer = loopbackInitializer;
        this.tf = tf;
        this.portRegister = connectorRegister;
        this.userLog = logService.getUserLog( BoltServer.class );
        this.internalLog = logService.getUserLog( getClass() );
        this.configurationProvider = createConfigurationProvider( config );
        this.serverChannels = new ArrayList<>();
    }

    @Override
    public void init()
    {
        eventLoopGroup = configurationProvider.createEventLoopGroup( tf );
    }

    @Override
    public void start() throws Exception
    {
        if ( externalInitializer != null )
        {
            var externalLocalAddress = (InetSocketAddress) configureInitializer( externalInitializer );
            portRegister.register( BoltConnector.NAME, externalLocalAddress );

            var host = externalLocalAddress.getHostName();
            var port = externalLocalAddress.getPort();

            userLog.info( "Bolt enabled on %s.", SocketAddress.format( host, port ) );
        }

        if ( internalInitializer != null )
        {
            var internalLocalAddress = (InetSocketAddress) configureInitializer( internalInitializer );
            portRegister.register( BoltConnector.INTERNAL_NAME, internalLocalAddress );

            var host = internalLocalAddress.getHostName();
            var port = internalLocalAddress.getPort();

            userLog.info( "Bolt (Routing) enabled on %s.", SocketAddress.format( host, port ) );
        }

        if ( loopbackInitializer != null )
        {
            var loopbackLocalAddress = configureInitializer( loopbackInitializer );

            userLog.info( "Bolt (loopback) enabled on file %s", loopbackLocalAddress );
        }
    }

    private java.net.SocketAddress configureInitializer( ProtocolInitializer protocolInitializer ) throws Exception
    {
        try
        {
            var externalChannel = bind( configurationProvider, protocolInitializer );
            serverChannels.add( externalChannel );

            return externalChannel.localAddress();
        }
        catch ( Throwable e )
        {
            // We catch throwable here because netty uses clever tricks to have method signatures that look like they do not
            // throw checked exceptions, but they actually do. The compiler won't let us catch them explicitly because in theory
            // they shouldn't be possible, so we have to catch Throwable and do our own checks to grab them
            throw new PortBindException( protocolInitializer.address(), e );
        }
    }

    @Override
    public void stop() throws Exception
    {
        executeAll(
                this::unregisterListenAddresses,
                this::closeChannels );
    }

    @Override
    public void shutdown()
    {
        shutdownEventLoopGroup();
        if ( loopbackInitializer != null )
        {
            try
            {
                Files.deleteIfExists( Path.of( ( (DomainSocketAddress) loopbackInitializer.address()).path() ) );
            }
            catch ( IOException e )
            {
                internalLog.warn( "Failed to delete loopback domain socket file", e );
            }
        }
    }

    private Channel bind( ServerConfigurationProvider configurationProvider, ProtocolInitializer protocolInitializer ) throws InterruptedException
    {
        var serverBootstrap = createServerBootstrap( configurationProvider, protocolInitializer );
        var address = protocolInitializer.address();
        return serverBootstrap.bind( address ).sync().channel();
    }

    private ServerBootstrap createServerBootstrap( ServerConfigurationProvider configurationProvider, ProtocolInitializer protocolInitializer )
    {
        var serverBootstrap = new ServerBootstrap();
        serverBootstrap.group( eventLoopGroup )
                .channel( configurationProvider.getChannelClass( protocolInitializer.address() ) )
                .option( ChannelOption.SO_REUSEADDR, TRUE )
                .childHandler( protocolInitializer.channelInitializer() );
        if ( !(protocolInitializer.address() instanceof DomainSocketAddress) )
        {
            serverBootstrap.childOption( ChannelOption.SO_KEEPALIVE, config.get( BoltConnectorInternalSettings.tcp_keep_alive ) ? TRUE : FALSE );
        }
        return serverBootstrap;
    }

    private static ServerConfigurationProvider createConfigurationProvider( Config config )
    {
        var useEpoll = config.get( GraphDatabaseInternalSettings.netty_server_use_epoll ) && Epoll.isAvailable();
        return useEpoll ? EpollConfigurationProvider.INSTANCE : NioConfigurationProvider.INSTANCE;
    }

    private void unregisterListenAddresses()
    {
        portRegister.deregister( BoltConnector.NAME );
        portRegister.deregister( BoltConnector.INTERNAL_NAME );
    }

    private void closeChannels()
    {
        internalLog.debug( "Closing server channels" );
        for ( var channel : serverChannels )
        {
            try
            {
                channel.close().syncUninterruptibly();
            }
            catch ( Throwable t )
            {
                internalLog.warn( "Failed to close channel " + channel, t );
            }
        }
        internalLog.debug( "Server channels closed" );

        serverChannels.clear();
    }

    private void shutdownEventLoopGroup()
    {
        if ( eventLoopGroup != null )
        {
            try
            {
                internalLog.debug( "Shutting down event loop group" );
                eventLoopGroup.shutdownGracefully( config.get( GraphDatabaseInternalSettings.netty_server_shutdown_quiet_period ),
                        config.get( GraphDatabaseInternalSettings.netty_server_shutdown_timeout ).toSeconds(), SECONDS ).syncUninterruptibly();
                internalLog.debug( "Event loop group shut down" );
            }
            catch ( Throwable t )
            {
                internalLog.warn( "Failed to shutdown event loop group", t );
            }
            eventLoopGroup = null;
        }
    }
}
