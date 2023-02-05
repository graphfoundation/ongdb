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
package org.neo4j.bolt.runtime.scheduling;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import org.neo4j.bolt.runtime.BoltConnection;
import org.neo4j.bolt.runtime.Job;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoltConnectionQueueMonitorAggregateTest
{
    private final BoltConnection connection = mock( BoltConnection.class );

    @Test
    void shouldCallEnqueuedOnSingleMonitor()
    {
        Job job = mock( Job.class );
        BoltConnectionQueueMonitor monitor = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitorAggregate monitorAggregate = new BoltConnectionQueueMonitorAggregate( monitor );

        monitorAggregate.enqueued( connection, job );

        verify( monitor ).enqueued( connection, job );
    }

    @Test
    void shouldCallDrainedOnSingleMonitor()
    {
        Collection<Job> batch = new ArrayList<>();
        BoltConnectionQueueMonitor monitor = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitorAggregate monitorAggregate = new BoltConnectionQueueMonitorAggregate( monitor );

        monitorAggregate.drained( connection, batch );

        verify( monitor ).drained( connection, batch );
    }

    @Test
    void shouldCallEnqueuedOnEachMonitor()
    {
        Job job = mock( Job.class );
        BoltConnectionQueueMonitor monitor1 = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitor monitor2 = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitorAggregate monitorAggregate = new BoltConnectionQueueMonitorAggregate( monitor1, monitor2 );

        monitorAggregate.enqueued( connection, job );

        verify( monitor1 ).enqueued( connection, job );
        verify( monitor2 ).enqueued( connection, job );
    }

    @Test
    void shouldCallDrainedOnEachMonitor()
    {
        Collection<Job> batch = new ArrayList<>();
        BoltConnectionQueueMonitor monitor1 = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitor monitor2 = mock( BoltConnectionQueueMonitor.class );
        BoltConnectionQueueMonitorAggregate monitorAggregate = new BoltConnectionQueueMonitorAggregate( monitor1, monitor2 );

        monitorAggregate.drained( connection, batch );

        verify( monitor1 ).drained( connection, batch );
        verify( monitor2 ).drained( connection, batch );
    }
}
