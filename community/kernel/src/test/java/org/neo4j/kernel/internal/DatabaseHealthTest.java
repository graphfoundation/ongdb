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
package org.neo4j.kernel.internal;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.kernel.monitoring.DatabasePanicEventGenerator;
import org.neo4j.monitoring.Health;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.logging.AssertableLogProvider.Level.ERROR;
import static org.neo4j.logging.LogAssertions.assertThat;

class DatabaseHealthTest
{
    @Test
    void shouldGenerateDatabasePanicEvents()
    {
        // GIVEN
        DatabasePanicEventGenerator generator = mock( DatabasePanicEventGenerator.class );
        Health databaseHealth = new DatabaseHealth( generator, NullLogProvider.getInstance().getLog( DatabaseHealth.class ) );
        databaseHealth.healed();

        // WHEN
        Exception cause = new Exception( "My own fault" );
        databaseHealth.panic( cause );
        databaseHealth.panic( cause );

        // THEN
        verify( generator ).panic( cause );
    }

    @Test
    void shouldLogDatabasePanicEvent()
    {
        // GIVEN
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Health databaseHealth = new DatabaseHealth( mock( DatabasePanicEventGenerator.class ),
                logProvider.getLog( DatabaseHealth.class ) );
        databaseHealth.healed();

        // WHEN
        String message = "Listen everybody... panic!";
        Exception exception = new Exception( message );
        databaseHealth.panic( exception );

        // THEN
        assertThat( logProvider ).forClass( DatabaseHealth.class ).forLevel( ERROR )
                .containsMessageWithException( "Database panic: The database has encountered a critical error, " +
                                "and needs to be restarted. Please see database logs for more details.", exception );
    }

    @Test
    void healDatabaseWithoutCriticalErrors()
    {
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Health databaseHealth = new DatabaseHealth( mock( DatabasePanicEventGenerator.class ),
                logProvider.getLog( DatabaseHealth.class ) );

        assertTrue( databaseHealth.isHealthy() );

        databaseHealth.panic( new IOException( "Space exception." ) );

        assertFalse( databaseHealth.isHealthy() );
        assertTrue( databaseHealth.healed() );
        assertThat( logProvider ).containsMessages( "Database health set to OK" )
                .doesNotContainMessage( "Database encountered a critical error and can't be healed. Restart required." );
    }

    @Test
    void databaseWithCriticalErrorsCanNotBeHealed()
    {
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Health databaseHealth = new DatabaseHealth( mock( DatabasePanicEventGenerator.class ),
                logProvider.getLog( DatabaseHealth.class ) );

        assertTrue( databaseHealth.isHealthy() );

        IOException criticalException = new IOException( "Space exception.", new OutOfMemoryError( "Out of memory." ) );
        databaseHealth.panic( criticalException );

        assertFalse( databaseHealth.isHealthy() );
        assertFalse( databaseHealth.healed() );
        assertThat( logProvider ).doesNotContainMessage( "Database health set to OK" )
                .containsMessages( "Database encountered a critical error and can't be healed. Restart required." );
    }
}
