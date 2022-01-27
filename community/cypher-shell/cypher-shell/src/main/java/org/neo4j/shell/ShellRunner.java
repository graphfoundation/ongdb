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
package org.neo4j.shell;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.neo4j.shell.cli.CliArgs;
import org.neo4j.shell.cli.InteractiveShellRunner;
import org.neo4j.shell.cli.NonInteractiveShellRunner;
import org.neo4j.shell.log.Logger;
import org.neo4j.shell.parser.ShellStatementParser;
import org.neo4j.shell.terminal.CypherShellTerminal;

import static org.fusesource.jansi.internal.CLibrary.isatty;
import static org.neo4j.shell.system.Utils.isWindows;

public interface ShellRunner
{
    int STDIN_FILENO = 0;
    int STDOUT_FILENO = 1;

    /**
     * @param cliArgs
     * @return true if an interactive shellrunner should be used, false otherwise
     */
    static boolean shouldBeInteractive( CliArgs cliArgs, boolean isInputInteractive )
    {
        return !cliArgs.getNonInteractive() && cliArgs.getInputFilename() == null && isInputInteractive;
    }

    /**
     * Checks if STDIN is a TTY. In case TTY checking is not possible (lack of libc), then the check falls back to the built in Java {@link System#console()}
     * which checks if EITHER STDIN or STDOUT has been redirected.
     *
     * @return true if the shell is reading from an interactive terminal, false otherwise (e.g., we are reading from a file).
     */
    static boolean isInputInteractive()
    {
        if ( isWindows() )
        {
            // Input will never be a TTY on windows and it isatty seems to be able to block forever on Windows so avoid
            // calling it.
            return System.console() != null;
        }
        try
        {
            return 1 == isatty( STDIN_FILENO );
        }
        catch ( Throwable ignored )
        {
            // system is not using libc (like Alpine Linux)
            // Fallback to checking stdin OR stdout
            return System.console() != null;
        }
    }

    /**
     * Checks if STDOUT is a TTY. In case TTY checking is not possible (lack of libc), then the check falls back to the built in Java {@link System#console()}
     * which checks if EITHER STDIN or STDOUT has been redirected.
     *
     * @return true if the shell is outputting to an interactive terminal, false otherwise (e.g., we are outputting to a file)
     */
    static boolean isOutputInteractive()
    {
        if ( isWindows() )
        {
            // Input will never be a TTY on windows and it isatty seems to be able to block forever on Windows so avoid
            // calling it.
            return System.console() != null;
        }
        try
        {
            return 1 == isatty( STDOUT_FILENO );
        }
        catch ( Throwable ignored )
        {
            // system is not using libc (like Alpine Linux)
            // Fallback to checking stdin OR stdout
            return System.console() != null;
        }
    }

    /**
     * If an input file has been defined use that, otherwise use STDIN
     *
     * @throws FileNotFoundException if the provided input file doesn't exist
     */
    static InputStream getInputStream( CliArgs cliArgs ) throws FileNotFoundException
    {
        if ( cliArgs.getInputFilename() == null )
        {
            return System.in;
        }
        else
        {
            return new BufferedInputStream( new FileInputStream( new File( cliArgs.getInputFilename() ) ) );
        }
    }

    /**
     * Run and handle user input until end of file
     *
     * @return error code to exit with
     */
    int runUntilEnd();

    /**
     * @return an object which can provide the history of commands executed
     */
    Historian getHistorian();

    class Factory
    {
        public ShellRunner create( CliArgs cliArgs, CypherShell shell, Logger logger, ConnectionConfig connectionConfig,
                                   CypherShellTerminal terminal ) throws IOException
        {
            if ( shouldBeInteractive( cliArgs, terminal.isInteractive() ) )
            {
                var userMessagesHandler = new UserMessagesHandler( connectionConfig, shell.getProtocolVersion() );
                return new InteractiveShellRunner( shell, shell, shell, shell, logger, terminal, userMessagesHandler, connectionConfig,
                                                   cliArgs.getHistoryFile() );
            }
            else
            {
                return new NonInteractiveShellRunner( cliArgs.getFailBehavior(), shell, logger, new ShellStatementParser(), getInputStream( cliArgs ) );
            }
        }
    }
}
