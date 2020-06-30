/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.metrics.source.db;

import com.codahale.metrics.MetricRegistry;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;

import static com.codahale.metrics.MetricRegistry.name;

@Documented( ".Database transaction log metrics" )
public class GraphTXLogMetrics extends LifecycleAdapter
{
    private static final String TX_LOG_PREFIX = "log";

    @Documented( "The total number of transaction log rotations executed so far." )
    private static final String LOG_ROTATION_EVENTS = name( TX_LOG_PREFIX, "rotation_events" );

    @Documented( "The total time spent in rotating transaction logs so far." )
    private static final String LOG_ROTATION_TOTAL_TIME = name( TX_LOG_PREFIX, "rotation_total_time" );

    @Documented( "The duration of the last log rotation event." )
    private static final String LOG_ROTATION_DURATION = name( TX_LOG_PREFIX, "rotation_duration" );

    @Documented( "The total number of bytes appended to transaction log." )
    private static final String LOG_APPENDED = name( TX_LOG_PREFIX, "appended_bytes" );
    // TODO: Do we really need to take in the metricsPrefix?
    private final String metricsPrefix;
    private final MetricRegistry registry;
    private final TransactionLogCounters logCounters;

    public GraphTXLogMetrics( String metricsPrefix, MetricRegistry registry, TransactionLogCounters logCounters )
    {
        this.metricsPrefix = metricsPrefix;
        this.registry = registry;
        this.logCounters = logCounters;
    }

    public void start()
    {

        registry.register( metricsName( LOG_ROTATION_EVENTS ), new MeterCounter( logCounters::numberOfLogRotations ) );
        registry.register( metricsName( LOG_ROTATION_TOTAL_TIME ), new MeterCounter( logCounters::logRotationAccumulatedTotalTimeMillis ) );
        registry.register( metricsName( LOG_ROTATION_DURATION ), new MeterCounter( logCounters::lastLogRotationTimeMillis ) );
        registry.register( metricsName( LOG_APPENDED ), new MeterCounter( logCounters::appendedBytes ) );
    }

    public void stop()
    {
        this.registry.remove( metricsName( LOG_ROTATION_EVENTS ) );
        this.registry.remove( metricsName( LOG_ROTATION_TOTAL_TIME ) );
        this.registry.remove( metricsName( LOG_ROTATION_DURATION ) );
        this.registry.remove( metricsName( LOG_APPENDED ) );
    }

    private String metricsName( String metricsName )
    {
        return name( metricsPrefix, metricsName );
    }
}
