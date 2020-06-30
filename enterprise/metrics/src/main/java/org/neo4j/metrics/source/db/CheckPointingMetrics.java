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
package org.neo4j.metrics.source.db;

import com.codahale.metrics.MetricRegistry;

import java.util.Objects;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.CheckpointCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".Database checkpointing metrics" )
public class CheckPointingMetrics extends LifecycleAdapter
{
    private static final String CHECK_POINT_PREFIX = "check_point";
    @Documented( "The total number of check point events executed so far." )
    private static final String CHECK_POINT_EVENTS_TEMPLATE = MetricRegistry.name( "check_point", "events" );
    @Documented( "The total time spent in check pointing so far." )
    private static final String CHECK_POINT_TOTAL_TIME_TEMPLATE = MetricRegistry.name( "check_point", "total_time" );
    @Documented( "The duration of the last check point event." )
    private static final String CHECK_POINT_DURATION_TEMPLATE = MetricRegistry.name( "check_point", "duration" );
    private final String checkPointEvents;
    private final String checkPointTotalTime;
    private final String checkPointDuration;
    private final MetricRegistry registry;
    private final CheckpointCounters checkpointCounters;

    public CheckPointingMetrics( String metricsPrefix, MetricRegistry registry, CheckpointCounters checkpointCounters )
    {
        this.checkPointEvents = MetricRegistry.name( metricsPrefix, CHECK_POINT_EVENTS_TEMPLATE );
        this.checkPointTotalTime = MetricRegistry.name( metricsPrefix, CHECK_POINT_TOTAL_TIME_TEMPLATE );
        this.checkPointDuration = MetricRegistry.name( metricsPrefix, CHECK_POINT_DURATION_TEMPLATE );
        this.registry = registry;
        this.checkpointCounters = checkpointCounters;
    }

    @Override
    public void start()
    {

        MetricRegistry registry = this.registry;

        Objects.requireNonNull( checkpointCounters );
        registry.register( checkPointEvents, new MeterCounter( checkpointCounters::numberOfCheckPoints ) );

        registry.register( checkPointTotalTime, new MeterCounter( checkpointCounters::checkPointAccumulatedTotalTimeMillis ) );

        registry.register( checkPointDuration, new MeterCounter( checkpointCounters::lastCheckpointTimeMillis ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.checkPointEvents );
        this.registry.remove( this.checkPointTotalTime );
        this.registry.remove( this.checkPointDuration );
    }
}
