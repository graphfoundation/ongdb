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
package org.neo4j.commandline.dbms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.Path;

import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

@Neo4jLayoutExtension
class UnbindCommandTest
{
    @Inject
    private TestDirectory testDirectory;

    private Neo4jLayout neo4jLayout;
    private Path homeDir;
    private Path configDir;
    private Path serverId;

    @BeforeEach
    void setUp() throws IOException
    {
        homeDir = testDirectory.directory( "home-dir" );
        var config = Config.newBuilder()
                .set( GraphDatabaseSettings.neo4j_home, homeDir.toAbsolutePath() )
                .build();
        neo4jLayout = Neo4jLayout.of( config );
        configDir = testDirectory.directory( "config-dir" );
        serverId = neo4jLayout.serverIdFile();
        testDirectory.getFileSystem().mkdirs( serverId.getParent() );
        Files.createDirectories( neo4jLayout.databasesDirectory() );
    }

    @Test
    void printUsageHelp()
    {
        var baos = new ByteArrayOutputStream();
        var command = new UnbindCommand( new ExecutionContext( Path.of( "." ), Path.of( "." ) ) );
        try ( var out = new PrintStream( baos ) )
        {
            CommandLine.usage( command, new PrintStream( out ), CommandLine.Help.Ansi.OFF );
        }
        assertThat( baos.toString().trim() ).isEqualTo( String.format(
                "Removes server identifier.%n" +
                "%n" +
                "USAGE%n" +
                "%n" +
                "unbind [--expand-commands] [--verbose]%n" +
                "%nDESCRIPTION%n" +
                "%n" +
                "Removes server identifier. Next start instance will create a new identity for%n" +
                "itself.%n" +
                "%n" +
                "OPTIONS%n" +
                "%n" +
                "      --verbose           Enable verbose output.%n" +
                "      --expand-commands   Allow command expansion in config value evaluation."
        ) );
    }

    @Test
    void shouldIgnoreNoServerIdFound() throws CommandFailedException
    {
        // when
        execute();
        // then
        assertFalse( testDirectory.getFileSystem().fileExists( serverId ) );
    }

    @Test
    void shouldRemoveServerId() throws CommandFailedException, IOException
    {
        // given
        Files.write( serverId, new byte[17] );
        assertTrue( testDirectory.getFileSystem().fileExists( serverId ) );

        // when
        execute();
        // then
        assertFalse( testDirectory.getFileSystem().fileExists( serverId ) );
    }

    @Test
    void shouldFailToUnbindLiveDatabase() throws Exception
    {
        // given
        try ( var ignored = createLockedFakeDbDir() )
        {
            // when/then
            assertThat( assertThrows( CommandFailedException.class, this::execute ) )
                    .hasMessageContaining( "Database is currently locked. Please shutdown database." );
        }
    }

    private FileLock createLockedFakeDbDir() throws IOException
    {
        var channel = testDirectory.getFileSystem().write( neo4jLayout.storeLockFile() );
        var fileLock = channel.tryLock();
        assertNotNull( fileLock, "Unable to acquire a store lock" );
        return fileLock;
    }

    private void execute()
    {
        var command = buildCommand();
        CommandLine.populateCommand( command );
        command.execute();
    }

    private UnbindCommand buildCommand()
    {
        var out = mock( PrintStream.class );
        var err = mock( PrintStream.class );
        var fileSystem = testDirectory.getFileSystem();
        return new UnbindCommand( new ExecutionContext( homeDir, configDir, out, err, fileSystem ) );
    }
}
