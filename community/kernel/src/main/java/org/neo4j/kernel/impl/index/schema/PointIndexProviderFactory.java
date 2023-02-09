/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.index.schema;

import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.index.IndexDirectoryStructure;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.token.TokenHolders;
import org.neo4j.util.VisibleForTesting;

import static org.neo4j.kernel.api.index.IndexDirectoryStructure.directoriesByProvider;

public class PointIndexProviderFactory extends AbstractIndexProviderFactory<PointIndexProvider>
{
    @Override
    protected Class<?> loggingClass()
    {
        return PointIndexProvider.class;
    }

    @Override
    public IndexProviderDescriptor descriptor()
    {
        return PointIndexProvider.DESCRIPTOR;
    }

    @Override
    protected PointIndexProvider internalCreate( PageCache pageCache, FileSystemAbstraction fs, Monitors monitors, String monitorTag, Config config,
            DatabaseReadOnlyChecker readOnlyChecker, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, DatabaseLayout databaseLayout,
            PageCacheTracer pageCacheTracer, Log log, TokenHolders tokenHolders, JobScheduler scheduler )
    {
        return create( pageCache, databaseLayout.databaseDirectory(), fs, monitors, monitorTag, config, readOnlyChecker, recoveryCleanupWorkCollector,
                pageCacheTracer, databaseLayout.getDatabaseName() );
    }

    @VisibleForTesting
    public static PointIndexProvider create( PageCache pageCache, Path storeDir, FileSystemAbstraction fs, Monitors monitors,
            String monitorTag, Config config, DatabaseReadOnlyChecker readOnlyChecker,
            RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, PageCacheTracer pageCacheTracer,
            String databaseName )
    {
        IndexDirectoryStructure.Factory directoryStructure = directoriesByProvider( storeDir );
        DatabaseIndexContext databaseIndexContext = DatabaseIndexContext.builder( pageCache, fs, databaseName ).withMonitors( monitors ).withTag( monitorTag )
                .withReadOnlyChecker( readOnlyChecker ).withPageCacheTracer( pageCacheTracer )
                .build();
        return new PointIndexProvider( databaseIndexContext, directoryStructure, recoveryCleanupWorkCollector, config );
    }
}
