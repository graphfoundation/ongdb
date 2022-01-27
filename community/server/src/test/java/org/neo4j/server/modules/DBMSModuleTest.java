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
package org.neo4j.server.modules;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import java.net.URI;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.server.CommunityNeoWebServer;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.rest.discovery.DiscoverableURIs;
import org.neo4j.server.rest.repr.CommunityAuthConfigProvider;
import org.neo4j.server.web.WebServer;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.SuppressOutput;
import org.neo4j.test.extension.SuppressOutputExtension;

import static java.util.Collections.emptyList;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith( SuppressOutputExtension.class )
@ResourceLock( Resources.SYSTEM_OUT )
public class DBMSModuleTest
{
    @Inject
    private SuppressOutput suppressOutput;

    @Test
    public void shouldRegisterAtRootByDefault() throws Exception
    {
        WebServer webServer = mock( WebServer.class );
        Config config = mock( Config.class );

        CommunityNeoWebServer neoServer = mock( CommunityNeoWebServer.class );
        when( neoServer.getBaseUri() ).thenReturn( new URI( "http://localhost:7575" ) );
        when( neoServer.getWebServer() ).thenReturn( webServer );
        when( config.get( GraphDatabaseSettings.auth_enabled ) ).thenReturn( true );
        when( config.get( ServerSettings.http_paths_blacklist ) ).thenReturn( emptyList() );

        var module = new DBMSModule( webServer, config, () -> new DiscoverableURIs.Builder( null ).build(),
                NullLogProvider.getInstance(), new CommunityAuthConfigProvider() );

        module.start();

        verify( webServer ).addJAXRSClasses( anyList(), anyString(), isNull() );
    }
}
