/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.metrics.source.causalclustering;

import com.codahale.metrics.Reservoir;
import com.codahale.metrics.Timer;

import java.time.Duration;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

import org.neo4j.causalclustering.core.consensus.RaftMessageProcessingMonitor;
import org.neo4j.causalclustering.core.consensus.RaftMessages;

public class RaftMessageProcessingMetric implements RaftMessageProcessingMonitor
{
    private final AtomicLong delay = new AtomicLong( 0 );
    private final Timer timer;
    private final Map<RaftMessages.Type,Timer> typeTimers = new EnumMap<>( RaftMessages.Type.class );

    private RaftMessageProcessingMetric( Supplier<Timer> timerFactory )
    {
        for ( RaftMessages.Type type : RaftMessages.Type.values() )
        {
            typeTimers.put( type, timerFactory.get() );
        }
        this.timer = timerFactory.get();
    }

    public static RaftMessageProcessingMetric create()
    {
        return new RaftMessageProcessingMetric( Timer::new );
    }

    public static RaftMessageProcessingMetric createUsing( Supplier<Reservoir> reservoir )
    {
        return new RaftMessageProcessingMetric( () -> new Timer( reservoir.get() ) );
    }

    public long delay()
    {
        return delay.get();
    }

    @Override
    public void setDelay( Duration delay )
    {
        this.delay.set( delay.toMillis() );
    }

    public Timer timer()
    {
        return timer;
    }

    public Timer timer( RaftMessages.Type type )
    {
        return typeTimers.get( type );
    }

    @Override
    public void updateTimer( RaftMessages.Type type, Duration duration )
    {
        long nanos = duration.toNanos();
        timer.update( nanos, TimeUnit.NANOSECONDS );
        typeTimers.get( type ).update( nanos, TimeUnit.NANOSECONDS );
    }
}
