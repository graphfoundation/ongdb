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
package org.neo4j.logging.internal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.UUID;

import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Level;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class DatabaseLogServiceTest
{
    private LogProvider logProvider;
    private DatabaseLogService logService;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final NamedDatabaseId namedDatabaseId = DatabaseIdFactory.from( "foo", UUID.randomUUID() );

    @BeforeEach
    void setUp()
    {
        logProvider = new Log4jLogProvider( outContent, Level.DEBUG );
        logService = new DatabaseLogService( namedDatabaseId, new SimpleLogService( logProvider ) );
    }

    @Test
    void shouldReturnUserLogProvider()
    {
        var logProvider = logService.getUserLogProvider();
        var log = logProvider.getLog( "log_name" );
        log.info( "message" );

        assertLogged( "[log_name] " + "[" + namedDatabaseId.logPrefix() + "] message" );
    }

    @Test
    void shouldReturnInternalLogProvider()
    {
        var logProvider = logService.getInternalLogProvider();
        var log = logProvider.getLog( Object.class );
        log.info( "message" );

        assertLogged( "[j.l.Object] " + "[" + namedDatabaseId.logPrefix() + "] message" );
    }

    @Test
    void shouldReturnDifferentUserAndInternalLogProviders()
    {
        var userLogProvider = logService.getUserLogProvider();
        var internalLogProvider = logService.getInternalLogProvider();

        assertNotEquals( userLogProvider, internalLogProvider );
    }

    @Test
    void shouldAlwaysReturnSameUserLogProvider()
    {
        var logProvider1 = logService.getUserLogProvider();
        var logProvider2 = logService.getUserLogProvider();

        assertSame( logProvider1, logProvider2 );
    }

    @Test
    void shouldAlwaysReturnSameInternalLogProvider()
    {
        var logProvider1 = logService.getInternalLogProvider();
        var logProvider2 = logService.getInternalLogProvider();

        assertSame( logProvider1, logProvider2 );
    }

    private void assertLogged( String message )
    {
        assertThat( outContent.toString() ).contains( message );
    }
}
