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

package org.neo4j.metrics.db;

import java.util.function.Supplier;

import org.neo4j.causalclustering.core.consensus.CoreMetaData;
import org.neo4j.causalclustering.monitor.CausalClusterMonitors;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;
import org.neo4j.kernel.impl.transaction.stats.CheckpointCounters;
import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.metrics.Metrics;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.TransactionIdStore;

public class GraphDbMetricsExtensionFactory extends ExtensionFactory<GraphDbMetricsExtensionFactory.Dependencies>
{
    public GraphDbMetricsExtensionFactory()
    {
        super( ExtensionType.DATABASE, "databaseMetrics" );
    }

    @Override
    public Lifecycle newInstance( ExtensionContext context, GraphDbMetricsExtensionFactory.Dependencies dependencies )
    {
        return new GraphDbMetricsExtension( context, dependencies );
    }

    /**
     *
     */
    public interface Dependencies
    {
        Monitors monitors();

        CausalClusterMonitors clusterMonitors();

        Config configuration();

        Metrics metricsManager();

        JobScheduler scheduler();

        Database database();

        Supplier<TransactionIdStore> transactionIdStoreSupplier();

        TransactionCounters transactionCounters();

        Supplier<StoreEntityCounters> storeEntityCounters();

        Supplier<CoreMetaData> coreMetadataSupplier();

        TransactionLogCounters transactionLogCounters();

        CheckpointCounters checkpointCounters();

        FileSystemAbstraction fileSystem();
    }
}
