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
package org.neo4j.commandline.admin.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;

import org.neo4j.cli.ExecutionContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.server.security.auth.CommunitySecurityModule;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.string.UTF8;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

@EphemeralTestDirectoryExtension
class SetInitialPasswordCommandTest
{
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private TestDirectory testDir;

    private SetInitialPasswordCommand command;
    private Path authInitFile;

    @BeforeEach
    void setup()
    {
        command = new SetInitialPasswordCommand( new ExecutionContext( testDir.directory( "home" ),
                                                                       testDir.directory( "conf" ), mock( PrintStream.class ), mock( PrintStream.class ),
                                                                       fileSystem ) );

        authInitFile = CommunitySecurityModule.getInitialUserRepositoryFile( command.loadNeo4jConfig() );
        CommunitySecurityModule.getUserRepositoryFile( command.loadNeo4jConfig() );
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
                        "set-initial-password [--expand-commands] [--require-password-change]%n" +
                        "                     [--verbose] <password>%n" +
                        "%n" + "DESCRIPTION%n" + "%n" +
                        "Sets the initial password of the initial admin user ('ongdb'). And removes the%n" +
                        "requirement to change password on first login. IMPORTANT: this change will only%n" +
                        "take effect if performed before the database is started for the first time.%n" +
                        "%n" + "PARAMETERS%n" + "%n" +
                        "      <password>%n" + "%n" + "OPTIONS%n" + "%n" +
                        "      --verbose           Enable verbose output.%n" +
                        "      --expand-commands   Allow command expansion in config value evaluation.%n" +
                        "      --require-password-change%n" +
                        "                          Require the user to change their password on first%n" +
                        "                            login." ) );
    }

    @Test
    void shouldSetInitialPassword() throws Throwable
    {
        // Given
        assertFalse( fileSystem.fileExists( authInitFile ) );

        // When
        CommandLine.populateCommand( command, "123" );
        command.execute();

        // Then
        assertAuthIniFile( "123" );
    }

    @Test
    void shouldOverwriteInitialPasswordFileIfExists() throws Throwable
    {
        // Given
        fileSystem.mkdirs( authInitFile.getParent() );
        fileSystem.write( authInitFile );

        // When
        CommandLine.populateCommand( command, "123" );
        command.execute();

        // Then
        assertAuthIniFile( "123" );
    }

    @Test
    void shouldWorkAlsoWithSamePassword() throws Throwable
    {
        CommandLine.populateCommand( command, "ongdb" );
        command.execute();

        // Then
        assertAuthIniFile( "ongdb" );
    }

    private void assertAuthIniFile( String password ) throws Throwable
    {
        assertTrue( fileSystem.fileExists( authInitFile ) );
        FileUserRepository userRepository = new FileUserRepository( fileSystem, authInitFile,
                NullLogProvider.getInstance() );
        userRepository.start();
        User neo4j = userRepository.getUserByName( AuthManager.INITIAL_USER_NAME );
        assertNotNull( neo4j );
        assertTrue( neo4j.credentials().matchesPassword( UTF8.encode( password ) ) );
        assertFalse( neo4j.hasFlag( User.PASSWORD_CHANGE_REQUIRED ) );
    }
}
