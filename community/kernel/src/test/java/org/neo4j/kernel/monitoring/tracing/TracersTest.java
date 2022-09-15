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
package org.neo4j.kernel.monitoring.tracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.tracer.DefaultTracer;
import org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;

import static org.mockito.Mockito.mock;
import static org.neo4j.logging.AssertableLogProvider.Level.WARN;
import static org.neo4j.logging.LogAssertions.assertThat;

class TracersTest
{
    private final AssertableLogProvider logProvider = new AssertableLogProvider();
    private final JobScheduler jobScheduler = mock( JobScheduler.class );
    private final SystemNanoClock clock = Clocks.nanoClock();
    private final Monitors monitors = new Monitors();

    private Log log;

    @BeforeEach
    void setUp()
    {
        log = logProvider.getLog( getClass() );
    }

    @Test
    void mustProduceNullImplementationsWhenRequested()
    {
        Tracers tracers = createTracers( "null" );
        assertThat( tracers.getPageCacheTracer() ).isEqualTo( PageCacheTracer.NULL );
        assertThat( tracers.getDatabaseTracer() ).isEqualTo( DatabaseTracer.NULL.NULL );
        assertNoWarning();
    }

    @Test
    void mustProduceDefaultImplementationForNullConfiguration()
    {
        Tracers tracers = createTracers( null );
        assertDefaultImplementation( tracers );
        assertNoWarning();
    }

    @Test
    void mustProduceDefaultImplementationWhenRequested()
    {
        Tracers tracers = createTracers( "default" );
        assertDefaultImplementation( tracers );
        assertNoWarning();
    }

    @Test
    void mustProduceDefaultImplementationWhenRequestingUnknownImplementation()
    {
        Tracers tracers = createTracers( "there's nothing like this" );
        assertDefaultImplementation( tracers );
        assertWarning( "there's nothing like this" );
    }

    private Tracers createTracers( String s )
    {
        return new Tracers( s, log, monitors, jobScheduler, clock, Config.defaults() );
    }

    private static void assertDefaultImplementation( Tracers tracers )
    {
        assertThat( tracers.getPageCacheTracer() ).isInstanceOf( DefaultPageCacheTracer.class );
        assertThat( tracers.getDatabaseTracer() ).isInstanceOf( DefaultTracer.class );
    }

    private void assertNoWarning()
    {
        assertThat( logProvider ).doesNotHaveAnyLogs();
    }

    private void assertWarning( String tracerName )
    {
        assertThat( logProvider ).forClass( getClass() ).forLevel( WARN )
                .containsMessageWithArguments( "Using default tracer implementations instead of '%s'", tracerName );
    }
}
