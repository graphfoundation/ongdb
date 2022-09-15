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
package org.neo4j.bolt.runtime.statemachine.impl;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import org.neo4j.bolt.runtime.Neo4jError;
import org.neo4j.exceptions.SecurityAdministrationException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogProvider;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.logging.LogAssertions.assertThat;

class ErrorReporterTest
{
    @Test
    void onlyDatabaseErrorsAreLogged()
    {
        AssertableLogProvider userLog = new AssertableLogProvider();
        AssertableLogProvider internalLog = new AssertableLogProvider();
        ErrorReporter reporter = newErrorReporter( userLog, internalLog );

        for ( Status.Classification classification : Status.Classification.values() )
        {
            if ( classification != Status.Classification.DatabaseError )
            {
                Status.Code code = newStatusCode( classification );
                Neo4jError error = Neo4jError.from( () -> code, "Database error" );
                reporter.report( error );

                assertThat( userLog ).doesNotHaveAnyLogs();
                assertThat( internalLog ).doesNotHaveAnyLogs();
            }
        }
    }

    @Test
    void databaseErrorShouldLogFullMessageInDebugLogAndHelpfulPointerInUserLog()
    {
        // given
        AssertableLogProvider userLog = new AssertableLogProvider();
        AssertableLogProvider internalLog = new AssertableLogProvider();
        ErrorReporter reporter = newErrorReporter( userLog, internalLog );

        Neo4jError error = Neo4jError.fatalFrom( new TestDatabaseError() );
        UUID reference = error.reference();

        // when
        reporter.report( error );

        // then
        assertThat( userLog ).containsMessages( "Client triggered an unexpected error",
                                                reference.toString(),
                                                "Database error" );

        assertThat( internalLog ).containsMessages( reference.toString(), "Database error" );
    }

    @Test
    void clientErrorShouldNotLog()
    {
        // given
        AssertableLogProvider userLog = new AssertableLogProvider();
        AssertableLogProvider internalLog = new AssertableLogProvider();
        ErrorReporter reporter = newErrorReporter( userLog, internalLog );

        Neo4jError error = Neo4jError.from( new SecurityAdministrationException( "Unsupported administration command: CREATE DATABASE foo" ) );

        // when
        reporter.report( error );

        // then
        assertThat( userLog ).doesNotHaveAnyLogs();
        assertThat( internalLog ).doesNotHaveAnyLogs();
    }

    private static ErrorReporter newErrorReporter( LogProvider userLog, LogProvider internalLog )
    {
        return new ErrorReporter( userLog.getLog( "userLog" ), internalLog.getLog( "internalLog" ) );
    }

    private static Status.Code newStatusCode( Status.Classification classification )
    {
        Status.Code code = mock( Status.Code.class );
        when( code.classification() ).thenReturn( classification );
        return code;
    }

    private static class TestDatabaseError extends RuntimeException implements Status.HasStatus
    {
        TestDatabaseError()
        {
            super( "Database error" );
        }

        @Override
        public Status status()
        {
            return () -> newStatusCode( Status.Classification.DatabaseError );
        }
    }
}
