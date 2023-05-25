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
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.connectors.HttpsConnector;
import org.neo4j.logging.Log;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.SuppressOutput;
import org.neo4j.test.extension.SuppressOutputExtension;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.store_user_log_max_archives;
import static org.neo4j.configuration.GraphDatabaseSettings.store_user_log_rotation_threshold;
import static org.neo4j.configuration.GraphDatabaseSettings.store_user_log_to_stdout;
import static org.neo4j.configuration.SettingValueParsers.FALSE;
import static org.neo4j.internal.helpers.collection.MapUtil.stringMap;
import static org.neo4j.server.NeoBootstrapper.OK;

@TestDirectoryExtension
@ExtendWith( SuppressOutputExtension.class )
@ResourceLock( Resources.SYSTEM_OUT )
class ServerUserLogTest
{
    @Inject
    private SuppressOutput suppress;
    @Inject
    private TestDirectory homeDir;

    @Test
    void shouldLogToStdOutByDefault()
    {
        // given
        NeoBootstrapper neoBootstrapper = getServerBootstrapper();
        Path dir = homeDir.homePath();
        Log logBeforeStart = neoBootstrapper.getLog();

        // when
        try
        {
            int returnCode = neoBootstrapper.start( dir, connectorsConfig() );

            // then no exceptions are thrown and
            assertThat( getStdOut() ).isNotEmpty();
            assertFalse( Files.exists( getUserLogFileLocation( dir ) ) );

            // then no exceptions are thrown and
            assertEquals( OK, returnCode );
            assertTrue( neoBootstrapper.isRunning() );
            assertThat( neoBootstrapper.getLog() ).isNotSameAs( logBeforeStart );

            assertThat( getStdOut() ).isNotEmpty();
            assertThat( getStdOut() ).anyMatch( s -> s.contains( "Started." ) );
        }
        finally
        {
            // stop the server so that resources are released and test teardown isn't flaky
            neoBootstrapper.stop();
        }
        assertFalse( Files.exists( getUserLogFileLocation( dir ) ) );
    }

    @Test
    void shouldLogToFileWhenConfigured() throws Exception
    {
        // given
        NeoBootstrapper neoBootstrapper = getServerBootstrapper();
        Path dir = homeDir.homePath();
        Log logBeforeStart = neoBootstrapper.getLog();

        // when
        try
        {
            Map<String,String> configOverrides = stringMap( store_user_log_to_stdout.name(), FALSE );
            configOverrides.putAll( connectorsConfig() );
            int returnCode = neoBootstrapper.start( dir, configOverrides );
            // then no exceptions are thrown and
            assertEquals( OK, returnCode );
            assertTrue( neoBootstrapper.isRunning() );
            assertThat( neoBootstrapper.getLog() ).isNotSameAs( logBeforeStart );

        }
        finally
        {
            // stop the server so that resources are released and test teardown isn't flaky
            neoBootstrapper.stop();
        }
        assertThat( getStdOut() ).isEmpty();
        assertTrue( Files.exists( getUserLogFileLocation( dir ) ) );
        assertThat( readUserLogFile( dir ) ).isNotEmpty();
        assertThat( readUserLogFile( dir ) ).anyMatch( s -> s.contains( "Started." ) );
    }

    @Test
    void logShouldRotateWhenConfigured() throws Exception
    {
        // given
        NeoBootstrapper neoBootstrapper = getServerBootstrapper();
        Path dir = homeDir.homePath();
        Log logBeforeStart = neoBootstrapper.getLog();
        int maxArchives = 4;

        // when
        try
        {
            Map<String,String> configOverrides = stringMap( store_user_log_to_stdout.name(), FALSE,
                            store_user_log_rotation_threshold.name(), "16",
                            store_user_log_max_archives.name(), Integer.toString( maxArchives ) );
            configOverrides.putAll( connectorsConfig() );
            int returnCode = neoBootstrapper.start( dir, configOverrides );

            // then
            assertEquals( OK, returnCode );
            assertThat( neoBootstrapper.getLog() ).isNotSameAs( logBeforeStart );
            assertTrue( neoBootstrapper.isRunning() );

            // when we forcibly log some more stuff
            do
            {
                neoBootstrapper.getLog().info( "testing 123. This string should contain more than 16 bytes\n" );
                Thread.sleep( 2000 );
            }
            while ( allUserLogFiles( dir ).size() <= 4 );
        }
        finally
        {
            // stop the server so that resources are released and test teardown isn't flaky
            neoBootstrapper.stop();
        }

        // then no exceptions are thrown and
        assertThat( getStdOut() ).isEmpty();
        assertTrue( Files.exists( getUserLogFileLocation( dir ) ) );
        assertThat( readUserLogFile( dir ) ).isNotEmpty();
        List<String> userLogFiles = allUserLogFiles( dir );
        assertThat( userLogFiles ).contains( "ongdb.log", "ongdb.log.1", "ongdb.log.2", "ongdb.log.3", "ongdb.log.4" );
        assertEquals( maxArchives + 1, userLogFiles.size() );
    }

    private static Map<String,String> connectorsConfig()
    {
        return Map.of( HttpConnector.listen_address.name(), "localhost:0" ,
                BoltConnector.listen_address.name(), "localhost:0",
                HttpsConnector.listen_address.name(), "localhost:0",
                GraphDatabaseSettings.preallocate_logical_logs.name(), FALSE
                );
    }

    private List<String> getStdOut()
    {
        List<String> lines = suppress.getOutputVoice().lines();
        // Remove empty lines
        return lines.stream().filter( line -> !line.equals( "" ) ).collect( Collectors.toList() );
    }

    private static NeoBootstrapper getServerBootstrapper()
    {
        return new CommunityBootstrapper();
    }

    private static List<String> readUserLogFile( Path homeDir ) throws IOException
    {
        return Files.readAllLines( getUserLogFileLocation( homeDir ) ).stream().filter( line -> !line.equals( "" ) ).collect( Collectors.toList() );
    }

    private static Path getUserLogFileLocation( Path homeDir )
    {
        return homeDir.resolve( "logs" ).resolve( "ongdb.log" );
    }

    private static List<String> allUserLogFiles( Path homeDir ) throws IOException
    {
        try ( Stream<Path> stream = Files.list( homeDir.resolve( "logs" ) ) )
        {
            return stream
                    .map( x -> x.getFileName().toString() )
                    .filter( x -> x.contains( "ongdb.log" ) )
                    .collect( Collectors.toList() );
        }
    }
}
