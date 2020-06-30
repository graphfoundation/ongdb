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

@Documented( ".Read Replica Metrics" )
public class ReadReplicaMetrics extends LifecycleAdapter
{
    private static final String CAUSAL_CLUSTERING_PREFIX = "causal_clustering.read_replica";
    @Documented( "The total number of pull requests made by this instance." )
    private static final String PULL_UPDATES_TEMPLATE = MetricRegistry.name( "causal_clustering.read_replica", "pull_updates" );
    @Documented( "The highest transaction id requested in a pull update by this instance." )
    private static final String PULL_UPDATE_HIGHEST_TX_ID_REQUESTED_TEMPLATE =
            MetricRegistry.name( "causal_clustering.read_replica", "pull_update_highest_tx_id_requested" );
    @Documented( "The highest transaction id that has been pulled in the last pull updates by this instance." )
    private static final String PULL_UPDATE_HIGHEST_TX_ID_RECEIVED_TEMPLATE =
            MetricRegistry.name( "causal_clustering.read_replica", "pull_update_highest_tx_id_received" );
    private final String pullUpdates;
    private final String pullUpdateHighestTxIdRequested;
    private final String pullUpdateHighestTxIdReceived;
    private final Monitors monitors;
    private final MetricRegistry registry;
    private final PullRequestMetric pullRequestMetric = new PullRequestMetric();

    public ReadReplicaMetrics( String metricsPrefix, Monitors monitors, MetricRegistry registry )
    {
        this.pullUpdates = MetricRegistry.name( metricsPrefix, PULL_UPDATES_TEMPLATE );
        this.pullUpdateHighestTxIdRequested = MetricRegistry.name( metricsPrefix, PULL_UPDATE_HIGHEST_TX_ID_REQUESTED_TEMPLATE );
        this.pullUpdateHighestTxIdReceived = MetricRegistry.name( metricsPrefix, PULL_UPDATE_HIGHEST_TX_ID_RECEIVED_TEMPLATE );
        this.monitors = monitors;
        this.registry = registry;
    }

    @Override
    public void start()
    {
        monitors.addMonitorListener( pullRequestMetric );

        registry.register( pullUpdates, new MeterCounter( pullRequestMetric::numberOfRequests ) );
        registry.register( pullUpdateHighestTxIdRequested, new MeterCounter( pullRequestMetric::lastRequestedTxId ) );
        registry.register( pullUpdateHighestTxIdReceived, new MeterCounter( pullRequestMetric::lastReceivedTxId ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.pullUpdates );
        this.registry.remove( this.pullUpdateHighestTxIdRequested );
        this.registry.remove( this.pullUpdateHighestTxIdReceived );
        this.monitors.removeMonitorListener( this.pullRequestMetric );
    }
}
