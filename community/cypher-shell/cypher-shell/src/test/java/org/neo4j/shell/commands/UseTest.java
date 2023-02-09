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
package org.neo4j.shell.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.shell.DatabaseManager;
import org.neo4j.shell.exception.CommandException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class UseTest
{
    private final DatabaseManager mockShell = mock( DatabaseManager.class );
    private final Command cmd = new Use( mockShell );

    @Test
    void setAbsentDatabaseOnNoArgument() throws CommandException
    {
        cmd.execute( "" );

        verify( mockShell ).setActiveDatabase( DatabaseManager.ABSENT_DB_NAME );
    }

    @Test
    void shouldFailIfMoreThanOneArg()
    {
        var expection = assertThrows( CommandException.class, () -> cmd.execute( "db1 db2" ) );
        assertThat( expection.getMessage(), containsString( "Incorrect number of arguments" ) );
    }

    @Test
    void setActiveDatabase() throws CommandException
    {
        cmd.execute( "db1" );

        verify( mockShell ).setActiveDatabase( "db1" );
    }

    @Test
    void printUsage()
    {
        String usage = cmd.getUsage();
        assertEquals( usage, "database" );
    }

    @Test
    void setActiveDatabaseWithBackticks() throws CommandException
    {
        cmd.execute( "`hello-world`" );
        verify( mockShell ).setActiveDatabase( "hello-world" );
    }

    @Test
    void setActiveDatabaseWithoutBackticks() throws CommandException
    {
        cmd.execute( "hello-world" );
        verify( mockShell ).setActiveDatabase( "hello-world" );
    }
}
