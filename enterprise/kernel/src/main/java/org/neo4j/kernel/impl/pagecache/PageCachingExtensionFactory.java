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

package org.neo4j.kernel.impl.pagecache;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.pagecache.monitor.PageCacheWarmerLoggingMonitor;
import org.neo4j.kernel.impl.pagecache.monitor.PageCacheWarmerMonitor;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;

public class PageCachingExtensionFactory extends
                                         ExtensionFactory<PageCachingExtensionFactory.Dependencies>
{

    public PageCachingExtensionFactory()
    {
        super( ExtensionType.DATABASE, "pagecachewarmer" );
    }

    public Lifecycle newInstance( ExtensionContext context,
                                  PageCachingExtensionFactory.Dependencies deps )
    {
        JobScheduler scheduler = deps.jobScheduler();
        DatabaseAvailabilityGuard databaseAvailabilityGuard = deps.availabilityGuard();
        PageCache pageCache = deps.pageCache();
        FileSystemAbstraction fs = deps.fileSystemAbstraction();
        LogService logService = deps.logService();
        Database database = deps.getDatabase();
        Log log = logService.getInternalLog( PageCacheWarmer.class );
        Monitors monitors = deps.monitors();
        PageCacheWarmerMonitor monitor = (PageCacheWarmerMonitor) monitors
                .newMonitor( PageCacheWarmerMonitor.class, new String[0] );
        monitors.addMonitorListener( new PageCacheWarmerLoggingMonitor( log ), new String[0] );
        Config config = deps.config();
        return new PageCachingExtension( scheduler, databaseAvailabilityGuard, pageCache, fs, database,
                                         log, monitor, config );
    }

    public interface Dependencies
    {

        JobScheduler jobScheduler();

        DatabaseAvailabilityGuard availabilityGuard();

        PageCache pageCache();

        FileSystemAbstraction fileSystemAbstraction();

        Database getDatabase();

        LogService logService();

        Monitors monitors();

        Config config();
    }
}
