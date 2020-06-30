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

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;

public class MetricsExtensionFactory extends ExtensionFactory<MetricsExtensionFactory.Dependencies>
{
    public MetricsExtensionFactory()
    {
        super( "metrics" );
    }

    @Override
    public Lifecycle newInstance( ExtensionContext context, MetricsExtensionFactory.Dependencies dependencies )
    {
        return new MetricsExtension( context, dependencies );
    }

    public interface Dependencies
    {
        Monitors monitors();

        PageCacheCounters pageCacheCounters();

        Config configuration();

        LogService logService();

        FileSystemAbstraction fileSystemAbstraction();

        JobScheduler scheduler();

        ConnectorPortRegister portRegister();
    }
}
