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
package org.neo4j.kernel.impl.scheduler;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.time.Clocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.scheduler.JobMonitoringParams.NOT_MONITORED;

class ThreadPoolManagerTest
{
    @Test
    void shouldDefaultToGroupParallelism() throws ExecutionException, InterruptedException
    {
        // given
        ThreadPoolManager manager = new ThreadPoolManager( new ThreadGroup( "parent" ), Clocks.nanoClock(), new FailedJobRunsStore( 0 ), () -> 1L );
        AtomicBoolean hasBeenRun = new AtomicBoolean();

        // when
        ThreadPool pool = manager.getThreadPool( Group.PAGE_CACHE_PRE_FETCHER, null );
        JobHandle<?> handle = pool.submit( NOT_MONITORED, () -> hasBeenRun.set( true ) );

        // then
        handle.waitTermination();
        assertThat( hasBeenRun.get() ).isTrue();
    }
}
