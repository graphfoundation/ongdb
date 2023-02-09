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
package org.neo4j.bolt.runtime;

import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.DatabaseShutdownException;
import org.neo4j.kernel.DeadlockDetectedException;
import org.neo4j.kernel.api.exceptions.Status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Neo4jErrorTest
{
    @Test
    void shouldAssignUnknownStatusToUnpredictedException()
    {
        // Given
        Throwable cause = new Throwable( "This is not an error we know how to handle." );
        Neo4jError error = Neo4jError.from( cause );

        // Then
        assertThat( error.status() ).isEqualTo( Status.General.UnknownError );
    }

    @Test
    void shouldConvertDeadlockException()
    {
        // When
        Neo4jError error = Neo4jError.from( new DeadlockDetectedException( null ) );

        // Then
        assertEquals( Status.Transaction.DeadlockDetected, error.status() );
    }

    @Test
    void shouldSetStatusToDatabaseUnavailableOnDatabaseShutdownException()
    {
        // Given
        DatabaseShutdownException ex = new DatabaseShutdownException();

        // When
        Neo4jError error = Neo4jError.from( ex );

        // Then
        assertThat( error.status() ).isEqualTo( Status.Database.DatabaseUnavailable );
        assertThat( error.cause() ).isEqualTo( ex );
    }
}
