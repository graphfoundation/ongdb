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
import org.neo4j.cypher.PlanCacheMetricsMonitor;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;
import org.neo4j.monitoring.Monitors;

@Documented( ".Cypher metrics" )
public class CypherMetrics extends LifecycleAdapter
{
    private static final String CYPHER_PREFIX = "cypher";
    @Documented( "The total number of times Cypher has decided to re-plan a query." )
    private static final String REPLAN_EVENTS_TEMPLATE = MetricRegistry.name( CYPHER_PREFIX, "replan_events" );
    @Documented( "The total number of seconds waited between query replans." )
    private static final String REPLAN_WAIT_TIME_TEMPLATE = MetricRegistry.name( CYPHER_PREFIX, "replan_wait_time" );
    private final String replanEvents;
    private final String replanWaitTime;
    private final MetricRegistry registry;
    private final Monitors monitors;
    private final PlanCacheMetricsMonitor cacheMonitor = new PlanCacheMetricsMonitor();

    public CypherMetrics( String metricsPrefix, MetricRegistry registry, Monitors monitors )
    {
        this.replanEvents = MetricRegistry.name( metricsPrefix, REPLAN_EVENTS_TEMPLATE );
        this.replanWaitTime = MetricRegistry.name( metricsPrefix, REPLAN_WAIT_TIME_TEMPLATE );
        this.registry = registry;
        this.monitors = monitors;
    }

    @Override
    public void start()
    {
        //monitors.addMonitorListener( cacheMonitor );
        //registry.register( REPLAN_EVENTS, (Gauge<Long>) cacheMonitor::numberOfReplans );
        //registry.register( REPLAN_WAIT_TIME, (Gauge<Long>) cacheMonitor::replanWaitTime );

        monitors.addMonitorListener( this.cacheMonitor );
        Objects.requireNonNull( cacheMonitor );
        registry.register( replanEvents, new MeterCounter( cacheMonitor::numberOfReplans ) );
        registry.register( replanWaitTime, new MeterCounter( cacheMonitor::replanWaitTime ) );
    }

    @Override
    public void stop()
    {
        registry.remove( replanEvents );
        registry.remove( replanWaitTime );
        monitors.removeMonitorListener( cacheMonitor );
    }
}

