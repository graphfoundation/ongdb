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

package org.neo4j.metrics;

import com.codahale.metrics.MetricRegistry;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.connectors.HttpsConnector;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.internal.LogService;
import org.neo4j.metrics.source.db.BoltMetrics;
import org.neo4j.metrics.source.db.PageCacheMetrics;
import org.neo4j.metrics.source.jvm.FileDescriptorMetrics;
import org.neo4j.metrics.source.jvm.GCMetrics;
import org.neo4j.metrics.source.jvm.HeapMemoryJvmMetrics;
import org.neo4j.metrics.source.jvm.MemoryBuffersMetrics;
import org.neo4j.metrics.source.jvm.MemoryPoolMetrics;
import org.neo4j.metrics.source.jvm.ThreadMetrics;
import org.neo4j.metrics.source.server.ServerMetrics;

public class MetricsExporter
{
    private final MetricRegistry registry;
    private final LifeSupport life;
    private final Config config;
    private final LogService logService;
    private final ExtensionContext context;
    private final MetricsExtensionFactory.Dependencies dependencies;

    MetricsExporter( MetricRegistry registry, Config config, LogService logService, ExtensionContext context,
                     MetricsExtensionFactory.Dependencies dependencies, LifeSupport life )
    {
        this.registry = registry;
        this.config = config;
        this.logService = logService;
        this.context = context;
        this.dependencies = dependencies;
        this.life = life;
    }

    public void export()
    {
        String metricsPrefix = config.get( MetricsSettings.metricsPrefix );
        if ( config.get( MetricsSettings.neoPageCacheEnabled ) )
        {
            life.add( new PageCacheMetrics( metricsPrefix, registry, dependencies.pageCacheCounters() ) );
        }

        if ( config.get( MetricsSettings.jvmGcEnabled ) )
        {
            life.add( new GCMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.jvmHeapEnabled ) )
        {
            life.add( new HeapMemoryJvmMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.jvmThreadsEnabled ) )
        {
            life.add( new ThreadMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.jvmMemoryEnabled ) )
        {
            life.add( new MemoryPoolMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.jvmBuffersEnabled ) )
        {
            life.add( new MemoryBuffersMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.jvmFileDescriptorsEnabled ) )
        {
            life.add( new FileDescriptorMetrics( metricsPrefix, registry ) );
        }

        if ( config.get( MetricsSettings.boltMessagesEnabled ) )
        {
            life.add( new BoltMetrics( metricsPrefix, registry, dependencies.monitors() ) );
        }

        // TODO: Add Count metrics here.

        boolean httpOrHttpsEnabled = config.get( HttpConnector.enabled ) || config.get( HttpsConnector.enabled );
        if ( httpOrHttpsEnabled && config.get( MetricsSettings.neoServerEnabled ) )
        {
            life.add( new ServerMetrics( metricsPrefix, registry, logService, context.dependencySatisfier() ) );
        }
    }
}
