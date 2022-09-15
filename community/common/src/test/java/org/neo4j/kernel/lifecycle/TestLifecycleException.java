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
package org.neo4j.kernel.lifecycle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.kernel.lifecycle.LifecycleStatus.NONE;
import static org.neo4j.kernel.lifecycle.LifecycleStatus.SHUTDOWN;
import static org.neo4j.kernel.lifecycle.LifecycleStatus.STARTED;
import static org.neo4j.kernel.lifecycle.LifecycleStatus.STOPPED;

class TestLifecycleException
{

    @Test
    void shouldMakeNoneToStoppedIntoHumanReadableInitMessage()
    {
        assertThat( exceptionFor( NONE, STOPPED ).getMessage() ).isEqualTo( "Component 'SomeComponent' failed to initialize." );
    }

    @Test
    void shouldMakeStoppedToStartedIntoHumanReadableStartingMessage()
    {
        assertThat( exceptionFor( STOPPED, STARTED ).getMessage() ).isEqualTo( "Component 'SomeComponent' was successfully initialized, but failed to start." );
    }

    @Test
    void shouldMakeStartedToStoppedIntoHumanReadableStoppingMessage()
    {
        assertThat( exceptionFor( STARTED, STOPPED ).getMessage() ).isEqualTo( "Component 'SomeComponent' failed to stop." );
    }

    @Test
    void shouldMakeShutdownIntoHumanReadableShutdownMessage()
    {
        assertThat( exceptionFor( STOPPED, SHUTDOWN ).getMessage() ).isEqualTo( "Component 'SomeComponent' failed to shut down." );
    }

    @Test
    void shouldIncludeRootCauseMessageInExceptionMessage()
    {
        Exception root = new Exception( "big bad root cause" );
        Exception intermediate = new Exception( "intermediate exception", root );
        assertThat( exceptionFor( STARTED, STOPPED, intermediate ) ).hasMessageContaining( root.getMessage() );
    }

    private static LifecycleException exceptionFor( LifecycleStatus from, LifecycleStatus to )
    {
        return exceptionFor( from, to, null );
    }

    private static LifecycleException exceptionFor( LifecycleStatus from, LifecycleStatus to, Throwable cause )
    {
        return new LifecycleException( new Object()
        {
            @Override
            public String toString()
            {
                return "SomeComponent";
            }
        }, from, to, cause );
    }
}
