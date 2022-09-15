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
package org.neo4j.commandline.admin.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.server.security.auth.CommunitySecurityModule;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.server.security.auth.LegacyCredential;
import org.neo4j.server.security.auth.UserRepository;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

@EphemeralTestDirectoryExtension
class SetDefaultAdminCommandTest
{
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private TestDirectory testDir;

    private SetDefaultAdminCommand command;
    private Path adminIniFile;

    @BeforeEach
    void setup() throws IOException, InvalidArgumentsException
    {
        command = new SetDefaultAdminCommand( new ExecutionContext( testDir.directory( "home" ),
                                                                    testDir.directory( "conf" ), mock( PrintStream.class ), mock( PrintStream.class ),
                                                                    fileSystem ) );
        final Config config = command.loadNeo4jConfig();
        UserRepository users = CommunitySecurityModule.getUserRepository( config, NullLogProvider.getInstance(),
            fileSystem );
        users.create(
            new User.Builder( "jake", LegacyCredential.forPassword( "123" ) )
                .withRequiredPasswordChange( false )
                .build()
        );
        adminIniFile = CommunitySecurityModule.getUserRepositoryFile( config ).resolveSibling( "admin.ini" );
    }

    @Test
    void printUsageHelp()
    {
        final var baos = new ByteArrayOutputStream();
        try ( var out = new PrintStream( baos ) )
        {
            CommandLine.usage( command, new PrintStream( out ), CommandLine.Help.Ansi.OFF );
        }
        assertThat( baos.toString().trim() ).isEqualTo( String.format(
                "USAGE%n" + "%n" +
                        "set-default-admin [--expand-commands] [--verbose] <username>%n" +
                        "%n" + "DESCRIPTION%n" + "%n" +
                        "Sets the default admin user.%n" +
                        "This user will be granted the admin role on startup if the system has no roles.%n" +
                        "%n" +
                        "PARAMETERS%n" + "%n" +
                        "      <username>%n" + "%n" + "OPTIONS%n" + "%n" +
                        "      --verbose           Enable verbose output.%n" +
                        "      --expand-commands   Allow command expansion in config value evaluation.") );
    }

    @Test
    void shouldSetDefaultAdmin() throws Throwable
    {
        // Given
        assertFalse( fileSystem.fileExists( adminIniFile ) );

        // When
        CommandLine.populateCommand( command, "jake" );

        command.execute();

        // Then
        assertAdminIniFile( "jake" );
    }

    @SuppressWarnings( "SameParameterValue" )
    private void assertAdminIniFile( String username ) throws Throwable
    {
        assertTrue( fileSystem.fileExists( adminIniFile ) );
        FileUserRepository userRepository = new FileUserRepository( fileSystem, adminIniFile,
            NullLogProvider.getInstance() );
        userRepository.start();
        assertThat( userRepository.getAllUsernames() ).contains( username );
    }
}
