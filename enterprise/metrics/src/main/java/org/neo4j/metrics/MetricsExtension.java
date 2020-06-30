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
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.metrics.output.CompositeEventReporter;
import org.neo4j.metrics.output.EventReporter;
import org.neo4j.metrics.output.EventReporterBuilder;

public class MetricsExtension implements Lifecycle, Metrics
{
    private final LifeSupport life = new LifeSupport();
    private final Log logger;
    private final CompositeEventReporter reporter;
    private final MetricRegistry registry;
    private final ExtensionContext context;
    private final MetricsExtensionFactory.Dependencies dependencies;
    private boolean configured;

    public MetricsExtension( ExtensionContext context, MetricsExtensionFactory.Dependencies dependencies )
    {
        LogService logService = dependencies.logService();
        this.context = context;
        this.dependencies = dependencies;
        this.logger = logService.getUserLog( getClass() );
        this.registry = new MetricRegistry();
        this.reporter =
                (new EventReporterBuilder( dependencies.configuration(), registry, logger, context, life, dependencies.fileSystemAbstraction(),
                                           dependencies.scheduler(), dependencies.portRegister() )).build();
    }

    @Override
    public void init()
    {
        configured = !reporter.isEmpty();
        LogService logService = dependencies.logService();
        Config config = dependencies.configuration();
        if ( config.get( MetricsSettings.metricsEnabled ) )
        {
            if ( !configured )
            {
                logger.warn(
                        "Metrics extension reporting is not configured. Please configure one of the available exporting options to be able to use metrics. Metrics extension is disabled." );
            }
            else
            {
                (new MetricsExporter( registry, config, logService, context, dependencies, life )).export();
                life.init();
            }
        }
    }

    @Override
    public void start()
    {
        life.start();
    }

    @Override
    public void stop()
    {
        life.stop();
    }

    @Override
    public void shutdown()
    {
        life.shutdown();
    }

    @Override
    public EventReporter getReporter()
    {
        return reporter;
    }

    @Override
    public MetricRegistry getRegistry()
    {
        return registry;
    }

    @Override
    public boolean isConfigured()
    {
        return configured;
    }
}
