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
package org.neo4j.server.web.logging;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.Callable;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.helpers.FunctionalTestHelper;
import org.neo4j.server.helpers.TestWebContainer;
import org.neo4j.test.server.ExclusiveWebContainerTestBase;

import static java.net.http.HttpClient.Redirect.NORMAL;
import static java.net.http.HttpResponse.BodyHandlers.discarding;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.jetty.http.HttpStatus.NOT_FOUND_404;
import static org.eclipse.jetty.http.HttpStatus.OK_200;
import static org.neo4j.configuration.SettingValueParsers.FALSE;
import static org.neo4j.configuration.SettingValueParsers.TRUE;
import static org.neo4j.server.helpers.CommunityWebContainerBuilder.serverOnRandomPorts;
import static org.neo4j.test.assertion.Assert.assertEventually;

class HTTPLoggingIT extends ExclusiveWebContainerTestBase
{
    @Test
    void givenExplicitlyDisabledServerLoggingConfigurationShouldNotLogAccesses() throws Exception
    {
        // given
        var query = "?implicitlyDisabled" + randomString();
        var server = createWebContainer( FALSE );

        try
        {
            var functionalTestHelper = new FunctionalTestHelper( server );

            // when
            var response = queryBaseUri( query, functionalTestHelper );
            assertThat( response.statusCode() ).isEqualTo( OK_200 );

            // then
            assertThat( Files.exists( httpLogFile( server ) ) ).isEqualTo( false );
        }
        finally
        {
            server.shutdown();
        }
    }

    @Test
    void givenExplicitlyEnabledServerLoggingConfigurationShouldLogAccess() throws Exception
    {
        // given
        var query = "?explicitlyEnabled=" + randomString();
        var server = createWebContainer( TRUE );

        try
        {
            var functionalTestHelper = new FunctionalTestHelper( server );

            // when
            var response = queryBaseUri( query, functionalTestHelper );
            assertThat( response.statusCode() ).isEqualTo( OK_200 );

            // then
            assertEventually( "request appears in log", httpLogContent( server ), value -> value.contains( query ), 5, SECONDS );
        }
        finally
        {
            server.shutdown();
        }
    }

    @Test
    void givenExplicitlyEnabledServerLoggingConfigurationShouldLogWithoutQueryString() throws Exception
    {
        // given
        var path = "/foo/bar/baz";
        var server = createWebContainer( TRUE );

        try
        {
            var functionalTestHelper = new FunctionalTestHelper( server );

            // when
            var response = queryUri( functionalTestHelper.baseUri().resolve( path ) );
            assertThat( response.statusCode() ).isEqualTo( NOT_FOUND_404 );

            // then
            assertEventually( "request appears in log", httpLogContent( server ),
                    new Condition<>( value -> value.contains( path ) && !value.contains( "?" ), "Contains path without query string." ), 5, SECONDS );
        }
        finally
        {
            server.shutdown();
        }
    }

    private TestWebContainer createWebContainer( String httpLoggingEnabledValue ) throws IOException
    {
        var directoryPrefix = methodName;
        var logDirectory = testDirectory.directory( directoryPrefix + "-logdir" );

        return serverOnRandomPorts().withDefaultDatabaseTuning().persistent()
                .withProperty( ServerSettings.http_logging_enabled.name(), httpLoggingEnabledValue )
                .withProperty( GraphDatabaseSettings.logs_directory.name(), logDirectory.toAbsolutePath().toString() )
                .withProperty( BoltConnector.listen_address.name(), ":0" )
                .usingDataDir( testDirectory.directory( directoryPrefix + "-dbdir" ).toAbsolutePath().toString() )
                .build();
    }

    private static Callable<String> httpLogContent( TestWebContainer testWebContainer )
    {
        var httpLogFile = httpLogFile( testWebContainer );
        return () -> Files.readString( httpLogFile );
    }

    private static Path httpLogFile( TestWebContainer testWebContainer )
    {
        var logDirectory = testWebContainer.getConfig().get( GraphDatabaseSettings.logs_directory );
        return logDirectory.resolve( "http.log" );
    }

    private static String randomString()
    {
        return UUID.randomUUID().toString();
    }

    private static HttpResponse<Void> queryBaseUri( String query, FunctionalTestHelper functionalTestHelper ) throws IOException, InterruptedException
    {
        return queryUri( URI.create( functionalTestHelper.baseUri() + query ) );
    }

    private static HttpResponse<Void> queryUri( URI uri ) throws IOException, InterruptedException
    {
        var httpRequest = HttpRequest.newBuilder( uri ).GET().build();
        var httpClient = HttpClient.newBuilder().followRedirects( NORMAL ).build();
        return httpClient.send( httpRequest, discarding() );
    }
}
