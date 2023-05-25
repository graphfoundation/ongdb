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
package org.neo4j.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.server.helpers.TestWebContainer;
import org.neo4j.test.server.ExclusiveWebContainerTestBase;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.fail;
import static org.neo4j.logging.AssertableLogProvider.Level.ERROR;
import static org.neo4j.logging.LogAssertions.assertThat;
import static org.neo4j.server.helpers.CommunityWebContainerBuilder.builder;

class NeoWebServerPortConflictIT extends ExclusiveWebContainerTestBase
{

    @Test
    void shouldComplainIfServerPortIsAlreadyTaken() throws IOException
    {
        try ( ServerSocket socket = new ServerSocket( 0, 0, InetAddress.getLocalHost() ) )
        {
            SocketAddress contestedAddress = new SocketAddress( socket.getInetAddress().getHostName(), socket.getLocalPort() );
            AssertableLogProvider logProvider = new AssertableLogProvider();
            TestWebContainer testWebContainer = null;
            try
            {
                testWebContainer = builder( logProvider )
                        .onAddress( contestedAddress )
                        .usingDataDir( testDirectory.directory( methodName ).toAbsolutePath().toString() )
                        .build();
                fail( "Should have reported failure to start" );
            }
            catch ( Exception e )
            {
                assertThat( e.getMessage() ).contains( "Error starting ONgDB database server" );
            }
            finally
            {
                if ( testWebContainer != null )
                {
                    testWebContainer.shutdown();
                }
            }

            assertThat( logProvider ).forClass( CommunityNeoWebServer.class ).forLevel( ERROR )
                    .containsMessageWithArguments( "Failed to start ONgDB on %s: %s",
                            contestedAddress, format( "Address %s is already in use, cannot bind to it.", contestedAddress ) );
        }
    }

    @Test
    void shouldComplainIfServerHTTPSPortIsAlreadyTaken() throws IOException
    {
        try ( ServerSocket httpsSocket = new ServerSocket( 0, 0, InetAddress.getLocalHost() ) )
        {
            SocketAddress unContestedAddress = new SocketAddress( httpsSocket.getInetAddress().getHostName(), 0 );
            SocketAddress httpsAddress = new SocketAddress( httpsSocket.getInetAddress().getHostName(), httpsSocket.getLocalPort() );
            AssertableLogProvider logProvider = new AssertableLogProvider();
            TestWebContainer testWebContainer = null;
            try
            {
                testWebContainer = builder( logProvider )
                    .onAddress( unContestedAddress )
                    .onHttpsAddress( httpsAddress )
                    .withHttpsEnabled()
                    .usingDataDir( testDirectory.directory( methodName ).toAbsolutePath().toString() )
                    .build();
                fail( "Should have reported failure to start" );
            }
            catch ( Exception e )
            {
                assertThat( e.getMessage() ).contains( "Error starting ONgDB database server" );
            }
            finally
            {
                if ( testWebContainer != null )
                {
                    testWebContainer.shutdown();
                }
            }

            assertThat( logProvider ).forClass( CommunityNeoWebServer.class ).forLevel( ERROR )
                    .containsMessageWithArguments( "Failed to start ONgDB on %s: %s",
                            unContestedAddress,
                            format( "At least one of the addresses %s or %s is already in use, cannot bind to it.", unContestedAddress, httpsAddress ) );
        }
    }
}
