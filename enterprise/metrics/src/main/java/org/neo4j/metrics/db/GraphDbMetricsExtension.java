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

import com.codahale.metrics.MetricRegistry;

import java.util.Optional;

import org.neo4j.exceptions.UnsatisfiedDependencyException;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.metrics.Metrics;
import org.neo4j.metrics.output.EventReporter;

public class GraphDbMetricsExtension implements Lifecycle
{
    private final LifeSupport life = new LifeSupport();
    private final ExtensionContext context;
    private final GraphDbMetricsExtensionFactory.Dependencies dependencies;

    /**
     * @param context
     * @param dependencies
     */
    public GraphDbMetricsExtension( ExtensionContext context, GraphDbMetricsExtensionFactory.Dependencies dependencies )
    {
        this.context = context;
        this.dependencies = dependencies;
    }

    /**
     *
     */
    @Override
    public void init()
    {
        Optional<Metrics> optionalManager = this.getMetricsManager();
        optionalManager.ifPresent( ( metrics ) ->
                                   {
                                       if ( metrics.isConfigured() )
                                       {
                                           MetricRegistry metricRegistry = metrics.getRegistry();
                                           EventReporter eventReporter = metrics.getReporter();
                                           (new GraphDbMetricsExporter( metricRegistry, eventReporter, this.dependencies.configuration(), this.context,
                                                                        this.dependencies,
                                                                        this.life )).export();
                                       }
                                   } );
        this.life.init();
    }

    @Override
    public void start()
    {
        this.life.start();
    }

    @Override
    public void stop()
    {
        this.life.stop();
    }

    @Override
    public void shutdown()
    {
        this.life.shutdown();
    }

    /**
     * @return
     */
    protected Optional<Metrics> getMetricsManager()
    {
        try
        {
            return Optional.of( dependencies.metricsManager() );
        }
        catch ( UnsatisfiedDependencyException e )
        {
            return Optional.empty();
        }
    }
}
