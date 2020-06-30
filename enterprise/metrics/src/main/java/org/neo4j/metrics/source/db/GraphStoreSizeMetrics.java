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

package org.neo4j.metrics.source.db;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;

import static com.codahale.metrics.MetricRegistry.name;

@Documented( ".Store size metrics" )
public class GraphStoreSizeMetrics extends LifecycleAdapter
{
    public static final Duration UPDATE_INTERVAL = Duration.ofMinutes( 10L );
    private static final String PREFIX = "store.size";
    @Documented( "The total size of the db store" )
    private static final String TOTAL_STORE_SIZE = name( PREFIX, "total" );
    private final MetricRegistry registry;

    private final String metricsPrefix;
    private final JobScheduler scheduler;
    private final FileSystemAbstraction fileSystem;
    private final DatabaseLayout databaseLayout;
    private volatile JobHandle updateValuesHandle;
    private volatile long cachedStoreTotalSize = -1L;

    public GraphStoreSizeMetrics( String metricsPrefix, MetricRegistry registry, JobScheduler scheduler, FileSystemAbstraction fileSystemAbstraction,
                                  DatabaseLayout databaseLayout )
    {
        this.metricsPrefix = metricsPrefix;
        this.registry = registry;
        this.scheduler = scheduler;
        this.fileSystem = fileSystemAbstraction;
        this.databaseLayout = databaseLayout;
    }

    public void start()
    {
        if ( this.updateValuesHandle == null )
        {
            this.updateValuesHandle =
                    this.scheduler.scheduleRecurring( Group.FILE_IO_HELPER, this::updateCachedValues, UPDATE_INTERVAL.toMillis(), TimeUnit.MILLISECONDS );
        }

        this.registry.register( metricsName( TOTAL_STORE_SIZE ), (Gauge<Long>) () ->
        {
            return this.cachedStoreTotalSize;
        } );
    }

    public void stop()
    {
        this.registry.remove( metricsName( TOTAL_STORE_SIZE ) );
        if ( this.updateValuesHandle != null )
        {
            this.updateValuesHandle.cancel();
            this.updateValuesHandle = null;
        }
    }

    private void updateCachedValues()
    {
        this.cachedStoreTotalSize = this.getSize( this.databaseLayout.databaseDirectory(), this.databaseLayout.getTransactionLogsDirectory() );
    }

    private long getSize( File... files )
    {
        Set<File> visitedFiles = new HashSet<>();
        return Arrays.stream( files ).mapToLong( ( file ) ->
                                                 {
                                                     return this.getSizeInternal( file, visitedFiles );
                                                 } ).sum();
    }

    private long getSizeInternal( File file, Set<File> visitedFiles )
    {
        if ( !visitedFiles.add( file ) )
        {
            return 0L;
        }
        else if ( file.isDirectory() )
        {
            File[] filesInDir = this.fileSystem.listFiles( file );
            return filesInDir != null && filesInDir.length != 0 ? Arrays.stream( filesInDir ).mapToLong( ( fileInDir ) ->
                                                                                                         {
                                                                                                             return this.getSizeInternal( fileInDir,
                                                                                                                                          visitedFiles );
                                                                                                         } ).sum() : 0L;
        }
        else
        {
            return this.fileSystem.getFileSize( file );
        }
    }

    private String metricsName( String metricsName )
    {
        return name( metricsPrefix, metricsName );
    }
}
