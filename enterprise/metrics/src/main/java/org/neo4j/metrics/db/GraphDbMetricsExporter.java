/*
 *   Copyright (c) 2002-2018 "Neo4j"
 *   Neo4j Sweden AB [http://neo4j.com]
 *
 *   Copyright (c) 2018-2020 "Graph Foundation"
 *   Graph Foundation, Inc. [https://graphfoundation.org]
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

package org.neo4j.metrics.db;

import com.codahale.metrics.MetricRegistry;

import org.neo4j.common.Edition;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.kernel.impl.factory.OperationalMode;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.metrics.output.EventReporter;
import org.neo4j.metrics.source.causalclustering.CatchUpMetrics;
import org.neo4j.metrics.source.causalclustering.CoreMetrics;
import org.neo4j.metrics.source.causalclustering.ReadReplicaMetrics;
import org.neo4j.metrics.source.db.CheckPointingMetrics;
import org.neo4j.metrics.source.db.CypherMetrics;
import org.neo4j.metrics.source.db.EntityCountMetrics;
import org.neo4j.metrics.source.db.GraphDbmsCountMetrics;
import org.neo4j.metrics.source.db.GraphStoreSizeMetrics;
import org.neo4j.metrics.source.db.GraphTXLogMetrics;
import org.neo4j.metrics.source.db.TransactionMetrics;

public class GraphDbMetricsExporter
{
    private final MetricRegistry registry;
    private final LifeSupport life;
    private final EventReporter reporter;
    private final Config config;
    private final ExtensionContext context;
    private final GraphDbMetricsExtensionFactory.Dependencies dependencies;

    GraphDbMetricsExporter( MetricRegistry registry, EventReporter reporter, Config config, ExtensionContext context,
                            GraphDbMetricsExtensionFactory.Dependencies dependencies, LifeSupport life )
    {
        this.registry = registry;
        this.reporter = reporter;
        this.config = config;
        this.context = context;
        this.dependencies = dependencies;
        this.life = life;
    }

    /**
     *
     */
    public void export()
    {
        String metricsPrefix = getPrefix();
        if ( config.get( MetricsSettings.neoTxEnabled ) )
        {
            life.add( new TransactionMetrics( metricsPrefix, registry, dependencies.transactionIdStoreSupplier(),
                                              dependencies.transactionCounters() ) );
        }

        if ( config.get( MetricsSettings.neoCheckPointingEnabled ) )
        {
            life.add( new CheckPointingMetrics( metricsPrefix, registry, dependencies.checkpointCounters() ) );
        }

        if ( config.get( MetricsSettings.neoTransactionLogsEnabled ) )
        {
            life.add( new GraphTXLogMetrics( metricsPrefix, registry, dependencies.transactionLogCounters() ) );
        }

        if ( config.get( MetricsSettings.neoCountsEnabled ) && context.databaseInfo().edition != Edition.COMMUNITY &&
             context.databaseInfo().edition != Edition.UNKNOWN )
        {
            life.add( new EntityCountMetrics( metricsPrefix, registry, dependencies.storeEntityCounters() ) );
        }

        if ( config.get( MetricsSettings.databaseCountsEnabled ) && context.databaseInfo().edition != Edition.COMMUNITY &&
             context.databaseInfo().edition != Edition.UNKNOWN )
        {
            life.add( new GraphDbmsCountMetrics( metricsPrefix, registry, dependencies.storeEntityCounters() ) );
        }

        if ( config.get( MetricsSettings.neoStoreSizeEnabled ) )
        {
            life.add( new GraphStoreSizeMetrics( metricsPrefix, registry, dependencies.scheduler(), dependencies.fileSystem(),
                                                 dependencies.database().getDatabaseLayout() ) );
        }

        if ( config.get( MetricsSettings.cypherPlanningEnabled ) )
        {
            life.add( new CypherMetrics( metricsPrefix, registry, dependencies.monitors() ) );
        }

        if ( config.get( MetricsSettings.causalClusteringEnabled ) )
        {
            OperationalMode mode = context.databaseInfo().operationalMode;
            if ( mode == OperationalMode.CORE )
            {

                life.add( new CoreMetrics( metricsPrefix, dependencies.clusterMonitors(), registry, dependencies.coreMetadataSupplier() ) );
                life.add( new CatchUpMetrics( metricsPrefix, dependencies.monitors(), registry ) );
            }
            else if ( mode == OperationalMode.READ_REPLICA )
            {
                life.add( new ReadReplicaMetrics( metricsPrefix, dependencies.clusterMonitors(), registry ) );
                life.add( new CatchUpMetrics( metricsPrefix, dependencies.monitors(), registry ) );
            }
        }
    }

    /**
     * @return
     */
    private String getPrefix()
    {
        return config.get( MetricsSettings.metricsPrefix ) + "." + dependencies.database().getNamedDatabaseId().name();
    }
}
