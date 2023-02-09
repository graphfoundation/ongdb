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
package org.neo4j.io.pagecache.tracing.recording;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Predicate;

public class RecordingTracer
{
    private final Set<Class<? extends Event>> eventTypesToTrace = new HashSet<>();
    private final BlockingQueue<Event> record = new LinkedBlockingQueue<>();
    private CountDownLatch trapLatch;
    private Predicate<Event> trap;

    @SafeVarargs
    public RecordingTracer( Class<? extends Event>... eventTypesToTrace )
    {
        Collections.addAll( this.eventTypesToTrace, eventTypesToTrace );
    }

    public <T extends Event> T observe( Class<T> type ) throws InterruptedException
    {
        return type.cast( record.take() );
    }

    protected void record( Event event )
    {
        if ( eventTypesToTrace.contains( event.getClass() ) )
        {
            record.add( event );
            trip( event );
        }
    }

    /**
     * Set a trap for the eviction thread, and return a CountDownLatch with a counter set to 1.
     * When the eviction thread performs the given trap-event, it will block on the latch after
     * making the event observable.
     */
    public synchronized CountDownLatch trap( Predicate<Event> trap )
    {
        assert trap != null;
        trapLatch = new CountDownLatch( 1 );
        this.trap = trap;
        return trapLatch;
    }

    private void trip( Event event )
    {
        Predicate<Event> theTrap;
        CountDownLatch theTrapLatch;

        // The synchronized block is in here, so we don't risk calling await on
        // the trapLatch while holding the monitor lock.
        synchronized ( this )
        {
            theTrap = trap;
            theTrapLatch = trapLatch;
        }

        if ( theTrap != null && theTrap.test( event ) )
        {
            try
            {
                theTrapLatch.await();
            }
            catch ( InterruptedException e )
            {
                Thread.currentThread().interrupt();
                throw new RuntimeException( "Unexpected interrupt in RecordingMonitor", e );
            }
        }
    }

}
