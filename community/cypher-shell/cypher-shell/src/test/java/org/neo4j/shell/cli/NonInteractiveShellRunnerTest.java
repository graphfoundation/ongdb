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
package org.neo4j.shell.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import org.neo4j.driver.exceptions.ClientException;
import org.neo4j.shell.Historian;
import org.neo4j.shell.StatementExecuter;
import org.neo4j.shell.exception.CommandException;
import org.neo4j.shell.exception.ExitException;
import org.neo4j.shell.log.Logger;
import org.neo4j.shell.parser.ShellStatementParser;
import org.neo4j.shell.parser.StatementParser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.contains;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class NonInteractiveShellRunnerTest
{
    private final Logger logger = mock( Logger.class );
    private final StatementExecuter cmdExecuter = mock( StatementExecuter.class );
    private StatementParser statementParser;
    private ClientException badLineError;

    @BeforeEach
    void setup() throws CommandException
    {
        statementParser = new ShellStatementParser();
        badLineError = new ClientException( "Found a bad line" );
        doThrow( badLineError ).when( cmdExecuter ).execute( contains( "bad" ) );
        doReturn( System.out ).when( logger ).getOutputStream();
    }

    @Test
    void testSimple()
    {
        String input = "good1;\n" +
                       "good2;\n";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_FAST,
                cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );
        int code = runner.runUntilEnd();

        assertEquals( 0, code, "Exit code incorrect" );
        verify( logger, times( 0 ) ).printError( anyString() );
    }

    @Test
    void testFailFast()
    {
        String input =
                "good1;\n" +
                "bad;\n" +
                "good2;\n" +
                "bad;\n";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_FAST, cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );

        int code = runner.runUntilEnd();

        assertEquals( 1, code, "Exit code incorrect" );
        verify( logger ).printError( badLineError );
    }

    @Test
    void testFailAtEnd()
    {
        String input =
                "good1;\n" +
                "bad;\n" +
                "good2;\n" +
                "bad;\n";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_AT_END, cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );

        int code = runner.runUntilEnd();

        assertEquals( 1, code, "Exit code incorrect" );
        verify( logger, times( 2 ) ).printError( badLineError );
    }

    @Test
    void runUntilEndExitsImmediatelyOnParseError()
    {
        // given
        StatementParser statementParser = mock( StatementParser.class );
        RuntimeException boom = new RuntimeException( "BOOM" );
        doThrow( boom ).when( statementParser ).parseMoreText( anyString() );

        String input =
                "good1;\n" +
                "bad;\n" +
                "good2;\n" +
                "bad;\n";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_AT_END, cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );

        // when
        int code = runner.runUntilEnd();

        // then
        assertEquals( 1, code );
        verify( logger ).printError( boom );
    }

    @Test
    void runUntilEndExitsImmediatelyOnExitCommand() throws Exception
    {
        // given
        String input =
                "good1;\n" +
                "bad;\n" +
                "good2;\n" +
                "bad;\n";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_AT_END, cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );

        // when
        doThrow( new ExitException( 99 ) ).when( cmdExecuter ).execute( anyString() );

        int code = runner.runUntilEnd();

        // then
        assertEquals( 99, code );
        verify( cmdExecuter ).execute( "good1;" );
        verifyNoMoreInteractions( cmdExecuter );
    }

    @Test
    void nonInteractiveHasNoHistory()
    {
        // given
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_AT_END, cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( "".getBytes() ) );

        // when then
        assertEquals( Historian.empty, runner.getHistorian() );
    }

    @Test
    void shouldTryToExecuteIncompleteStatements() throws CommandException
    {
        String input = "good1;\nno semicolon here\n// A comment at end";
        NonInteractiveShellRunner runner = new NonInteractiveShellRunner(
                FailBehavior.FAIL_FAST,
                cmdExecuter,
                logger, statementParser,
                new ByteArrayInputStream( input.getBytes() ) );
        int code = runner.runUntilEnd();

        assertEquals( 0, code, "Exit code incorrect" );
        verify( logger, times( 0 ) ).printError( anyString() );
        verify( cmdExecuter ).execute( "good1;" );
        verify( cmdExecuter ).execute( "no semicolon here" );
        verifyNoMoreInteractions( cmdExecuter );
    }
}
