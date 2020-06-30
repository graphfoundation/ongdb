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
package org.neo4j.kernel.impl.query;

import org.neo4j.annotations.service.Service;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;

@Service
public class QueryLoggerGlobalExtension extends ExtensionFactory<QueryLoggerGlobalExtension.Dependencies>
{
    public QueryLoggerGlobalExtension()
    {
        super( ExtensionType.GLOBAL, "query-logging" );
    }

    public Lifecycle newInstance( ExtensionContext context, QueryLoggerGlobalExtension.Dependencies dependencies )
    {
        final FileSystemAbstraction fileSystem = dependencies.fileSystem();
        final Config config = dependencies.config();
        final Monitors monitoring = dependencies.monitoring();
        final LogService logService = dependencies.logger();
        final JobScheduler jobScheduler = dependencies.jobScheduler();
        return new LifecycleAdapter()
        {
            DynamicLoggingQueryExecutionMonitor logger;

            @Override
            public void init()
            {
                Log debugLog = logService.getInternalLog( DynamicLoggingQueryExecutionMonitor.class );
                this.logger = new DynamicLoggingQueryExecutionMonitor( config, fileSystem, jobScheduler, debugLog );
                this.logger.init();
                monitoring.addMonitorListener( logger );
            }

            @Override
            public void shutdown()
            {
                logger.shutdown();
            }
        };
    }

    public interface Dependencies
    {
        FileSystemAbstraction fileSystem();

        Config config();

        Monitors monitoring();

        LogService logger();

        JobScheduler jobScheduler();
    }
}