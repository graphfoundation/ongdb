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

import com.codahale.metrics.MetricRegistry;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;
import org.neo4j.monitoring.Monitors;

import static com.codahale.metrics.MetricRegistry.name;

@Documented( ".CatchUp Metrics" )
public class CatchUpMetrics extends LifecycleAdapter
{
    private static final String CAUSAL_CLUSTERING_PREFIX = "neo4j.causal_clustering.catchup";

    @Documented( "TX pull requests received from read replicas" )
    public static final String TX_PULL_REQUESTS_RECEIVED = name( CAUSAL_CLUSTERING_PREFIX, "tx_pull_requests_received" );

    @Documented( "TX pull requests received from read replicas." )
    private static final String TX_PULL_REQUESTS_RECEIVED_TEMPLATE =
            MetricRegistry.name( "causal_clustering.catchup.tx_pull_requests_received" );
    private final String txPullRequestsReceived;
    private final Monitors monitors;
    private final MetricRegistry registry;
    private final TxPullRequestsMetric txPullRequestsMetric = new TxPullRequestsMetric();

    public CatchUpMetrics( String metricsPrefix, Monitors monitors, MetricRegistry registry )
    {
        this.txPullRequestsReceived = MetricRegistry.name( metricsPrefix, TX_PULL_REQUESTS_RECEIVED_TEMPLATE );
        this.monitors = monitors;
        this.registry = registry;
    }

    @Override
    public void start()
    {
        monitors.addMonitorListener( txPullRequestsMetric );
        registry.register( TX_PULL_REQUESTS_RECEIVED, new MeterCounter( txPullRequestsMetric::txPullRequestsReceived ) );
    }

    @Override
    public void stop()
    {
        registry.remove( TX_PULL_REQUESTS_RECEIVED );
        monitors.removeMonitorListener( txPullRequestsMetric );
    }
}
