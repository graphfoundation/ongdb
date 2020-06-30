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

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.time.ZoneId;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.LogQueryLevel;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileSystemUtils;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.FormattedLog;
import org.neo4j.logging.FormattedLog.Builder;
import org.neo4j.logging.Log;
import org.neo4j.logging.RotatingFileOutputStreamSupplier;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;

class DynamicLoggingQueryExecutionMonitor extends LifecycleAdapter implements QueryExecutionMonitor
{
    private final Config config;
    private final FileSystemAbstraction fileSystem;
    private final JobScheduler scheduler;
    private final Log debugLog;
    private volatile QueryLogger currentLog;
    private Builder logBuilder;
    private File currentQueryLogFile;
    private long currentRotationThreshold;
    private int currentMaxArchives;
    private Log log;
    private Closeable closable;

    DynamicLoggingQueryExecutionMonitor( Config config, FileSystemAbstraction fileSystem, JobScheduler scheduler, Log debugLog )
    {
        this.currentLog = QueryLogger.NO_LOG;
        this.config = config;
        this.fileSystem = fileSystem;
        this.scheduler = scheduler;
        this.debugLog = debugLog;
    }

    public synchronized void init()
    {
        ZoneId currentLogTimeZone = (this.config.get( GraphDatabaseSettings.db_timezone )).getZoneId();
        this.logBuilder = FormattedLog.withZoneId( currentLogTimeZone );
        this.currentQueryLogFile = (this.config.get( GraphDatabaseSettings.log_queries_filename )).toFile();
        this.updateSettings();
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_threshold );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_rotation_threshold );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_max_archives );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_runtime_logging_enabled );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_parameter_logging_enabled );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_page_detail_logging_enabled );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_allocation_logging_enabled );
        this.registerDynamicSettingUpdater( GraphDatabaseSettings.log_queries_detailed_time_logging_enabled );
    }

    private <T> void registerDynamicSettingUpdater( Setting<T> setting )
    {
        this.config.addListener( setting, ( a, b ) ->
        {
            this.updateSettings();
        } );
    }

    private synchronized void updateSettings()
    {
        this.updateLogSettings();
        this.updateQueryLoggerSettings();
    }

    private void updateQueryLoggerSettings()
    {
        if ( this.config.get( GraphDatabaseSettings.log_queries ) != LogQueryLevel.OFF )
        {
            this.currentLog = new ConfiguredQueryLogger( this.log, this.config );
        }
        else
        {
            this.currentLog = QueryLogger.NO_LOG;
        }
    }

    private void updateLogSettings()
    {
        if ( this.config.get( GraphDatabaseSettings.log_queries ) != LogQueryLevel.OFF )
        {
            long rotationThreshold = this.config.get( GraphDatabaseSettings.log_queries_rotation_threshold );
            int maxArchives = this.config.get( GraphDatabaseSettings.log_queries_max_archives );

            try
            {
                if ( this.logRotationIsEnabled( rotationThreshold ) )
                {
                    boolean needsRebuild = this.closable == null;
                    needsRebuild |= this.currentRotationThreshold != rotationThreshold;
                    needsRebuild |= this.currentMaxArchives != maxArchives;
                    if ( needsRebuild )
                    {
                        this.closeCurrentLogIfAny();
                        this.buildRotatingLog( rotationThreshold, maxArchives );
                    }
                }
                else if ( this.currentRotationThreshold != rotationThreshold || this.closable == null )
                {
                    this.closeCurrentLogIfAny();
                    this.buildNonRotatingLog();
                }

                this.currentRotationThreshold = rotationThreshold;
                this.currentMaxArchives = maxArchives;
            }
            catch ( IOException e )
            {
                this.debugLog.warn( "Failed to build query log", e );
            }
        }
        else
        {
            this.closeCurrentLogIfAny();
        }
    }

    private boolean logRotationIsEnabled( long threshold )
    {
        return threshold > 0L;
    }

    private void closeCurrentLogIfAny()
    {
        if ( this.closable != null )
        {
            try
            {
                this.closable.close();
            }
            catch ( IOException e )
            {
                this.debugLog.warn( "Failed to close current log: " + this.closable, e );
            }

            this.closable = null;
        }
    }

    private void buildRotatingLog( long rotationThreshold, int maxArchives ) throws IOException
    {
        RotatingFileOutputStreamSupplier rotatingSupplier =
                new RotatingFileOutputStreamSupplier( this.fileSystem, this.currentQueryLogFile, rotationThreshold, 0L, maxArchives,
                                                      this.scheduler.executor( Group.LOG_ROTATION ) );
        this.log = this.logBuilder.toOutputStream( rotatingSupplier );
        this.closable = rotatingSupplier;
    }

    private void buildNonRotatingLog() throws IOException
    {
        OutputStream logOutputStream = FileSystemUtils.createOrOpenAsOutputStream( this.fileSystem, this.currentQueryLogFile, true );
        this.log = this.logBuilder.toOutputStream( logOutputStream );
        this.closable = logOutputStream;
    }

    public synchronized void shutdown()
    {
        this.closeCurrentLogIfAny();
    }

    public void start( ExecutingQuery query )
    {
        this.currentLog.start( query );
    }

    public void endFailure( ExecutingQuery query, Throwable failure )
    {
        this.currentLog.failure( query, failure );
    }

    public void endFailure( ExecutingQuery query, String reason )
    {
        this.currentLog.failure( query, reason );
    }

    public void endSuccess( ExecutingQuery query )
    {
        this.currentLog.success( query );
    }
}
