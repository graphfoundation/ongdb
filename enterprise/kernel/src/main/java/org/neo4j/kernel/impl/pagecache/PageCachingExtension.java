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
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.pagecache.monitor.PageCacheWarmerMonitor;
import org.neo4j.kernel.impl.transaction.state.DatabaseFileListing;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.JobScheduler;

class PageCachingExtension extends LifecycleAdapter
{

    private final DatabaseAvailabilityGuard databaseAvailabilityGuard;
    private final Database database;
    private final Config config;
    private final PageCacheWarmer pageCacheWarmer;
    private final WarmupAvailabilityListener availabilityListener;
    private volatile boolean started;

    PageCachingExtension( JobScheduler scheduler, DatabaseAvailabilityGuard databaseAvailabilityGuard,
                          PageCache pageCache, FileSystemAbstraction fs,
                          Database database, Log log, PageCacheWarmerMonitor monitor, Config config )
    {
        this.databaseAvailabilityGuard = databaseAvailabilityGuard;
        this.database = database;
        this.config = config;
        this.pageCacheWarmer = new PageCacheWarmer( fs, pageCache, scheduler,
                                                    database.getDatabaseLayout().databaseDirectory(), config, log );
        this.availabilityListener = new WarmupAvailabilityListener( scheduler, this.pageCacheWarmer,
                                                                    config, log, monitor, database.getNamedDatabaseId() );
    }

    public void start()
    {
        if ( (Boolean) this.config.get( GraphDatabaseSettings.pagecache_warmup_enabled ) )
        {
            this.pageCacheWarmer.start();
            this.databaseAvailabilityGuard.addListener( this.availabilityListener );
            this.getNeoStoreFileListing().registerStoreFileProvider( this.pageCacheWarmer );
            this.started = true;
        }
    }

    public void stop() throws Exception
    {
        if ( this.started )
        {
            this.databaseAvailabilityGuard.removeListener( this.availabilityListener );
            this.availabilityListener.unavailable();
            this.pageCacheWarmer.stop();
            this.started = false;
        }
    }

    private DatabaseFileListing getNeoStoreFileListing()
    {
        return (DatabaseFileListing) this.database.getDependencyResolver()
                                                  .resolveDependency( DatabaseFileListing.class );
    }
}
