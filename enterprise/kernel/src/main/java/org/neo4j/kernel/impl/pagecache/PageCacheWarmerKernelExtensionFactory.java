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
package org.neo4j.kernel.impl.pagecache;

import org.neo4j.helpers.Service;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.NeoStoreDataSource;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.KernelExtensionFactory;
import org.neo4j.kernel.impl.pagecache.monitor.PageCacheWarmerLoggingMonitor;
import org.neo4j.kernel.impl.pagecache.monitor.PageCacheWarmerMonitor;
import org.neo4j.kernel.impl.spi.KernelContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.scheduler.JobScheduler;

@Service.Implementation( KernelExtensionFactory.class )
public class PageCacheWarmerKernelExtensionFactory
        extends KernelExtensionFactory<PageCacheWarmerKernelExtensionFactory.Dependencies>
{
    public interface Dependencies
    {
        JobScheduler jobScheduler();

        DatabaseAvailabilityGuard availabilityGuard();

        PageCache pageCache();

        FileSystemAbstraction fileSystemAbstraction();

        NeoStoreDataSource getDataSource();

        LogService logService();

        Monitors monitors();

        Config config();
    }

    public PageCacheWarmerKernelExtensionFactory()
    {
        super( ExtensionType.DATABASE, "pagecachewarmer" );
    }

    @Override
    public Lifecycle newInstance( KernelContext context, Dependencies deps )
    {
        JobScheduler scheduler = deps.jobScheduler();
        DatabaseAvailabilityGuard databaseAvailabilityGuard = deps.availabilityGuard();
        PageCache pageCache = deps.pageCache();
        FileSystemAbstraction fs = deps.fileSystemAbstraction();
        LogService logService = deps.logService();
        NeoStoreDataSource dataSourceManager = deps.getDataSource();
        Log log = logService.getInternalLog( PageCacheWarmer.class );
        Monitors monitors = deps.monitors();
        PageCacheWarmerMonitor monitor = monitors.newMonitor( PageCacheWarmerMonitor.class );
        monitors.addMonitorListener( new PageCacheWarmerLoggingMonitor( log ) );
        Config config = deps.config();
        return new PageCacheWarmerKernelExtension(
                scheduler, databaseAvailabilityGuard, pageCache, fs, dataSourceManager, log, monitor, config );
    }
}
