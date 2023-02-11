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
package org.neo4j.kernel.impl.scheduler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.time.Clocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadPoolTest
{
    private ThreadPool threadPool;

    @BeforeEach
    void setup()
    {
        threadPool = new ThreadPool( Group.TESTING, new ThreadGroup( "TestPool" ), new ThreadPool.ThreadPoolParameters(), Clocks.nanoClock(),
                new FailedJobRunsStore( 10 ), () -> 9999 );
    }

    @AfterEach
    public void teardown()
    {
        if ( threadPool != null )
        {
            threadPool.shutDown();
        }
    }

    @Test
    void poolDoesNotLeakFastJobs() throws ExecutionException, InterruptedException
    {
        // When
        var fastJob = threadPool.submit( new JobMonitoringParams( null, null, null ), () -> { /* do nothing */ } );
        fastJob.waitTermination();

        // Then
        assertEquals( 0, threadPool.activeJobCount(), "Active job count should be 0 when job is terminated" );
    }
}
