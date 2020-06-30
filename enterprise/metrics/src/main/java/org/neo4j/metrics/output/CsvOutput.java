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
package org.neo4j.metrics.output;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;
import org.neo4j.logging.RotatingFileOutputStreamSupplier;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;

import static org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings.csvEnabled;
import static org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings.csvInterval;
import static org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings.csvPath;

public class CsvOutput implements Lifecycle, EventReporter
{
    private final Config config;
    private final MetricRegistry registry;
    private final Log logger;
    private final ExtensionContext extensionContext;
    private final FileSystemAbstraction fileSystem;
    private final JobScheduler scheduler;
    private RotatableCsvReporter csvReporter;
    private File outputPath;

    CsvOutput( Config config, MetricRegistry registry, Log logger, ExtensionContext extensionContext, FileSystemAbstraction fileSystem, JobScheduler scheduler )
    {
        this.config = config;
        this.registry = registry;
        this.logger = logger;
        this.extensionContext = extensionContext;
        this.fileSystem = fileSystem;
        this.scheduler = scheduler;
    }

    /**
     * Looks at configured file {@code absoluteOrRelativeFile} and just returns it if absolute, otherwise returns a {@link File} with {@code
     * baseDirectoryIfRelative} as parent.
     *
     * @param baseDirectoryIfRelative base directory to use as parent if {@code absoluteOrRelativeFile} is relative, otherwise unused.
     * @param absoluteOrRelativeFile  file to return as absolute or relative to {@code baseDirectoryIfRelative}.
     */
    private static File absoluteFileOrRelativeTo( File baseDirectoryIfRelative, File absoluteOrRelativeFile )
    {
        return absoluteOrRelativeFile.isAbsolute()
               ? absoluteOrRelativeFile
               : new File( baseDirectoryIfRelative, absoluteOrRelativeFile.getPath() );
    }

    @Override
    public void init() throws IOException
    {
        // Setup CSV reporting
        File configuredPath = this.config.get( MetricsSettings.csvPath ).toFile();
        if ( configuredPath == null )
        {
            throw new IllegalArgumentException( csvPath.name() + " configuration is required since " +
                                                csvEnabled.name() + " is enabled" );
        }
        Long rotationThreshold = config.get( MetricsSettings.csvRotationThreshold );
        Integer maxArchives = config.get( MetricsSettings.csvMaxArchives );
        this.outputPath = absoluteFileOrRelativeTo( this.extensionContext.directory(), configuredPath );

        csvReporter =
                RotatableCsvReporter.forRegistry( this.registry ).convertRatesTo( TimeUnit.SECONDS ).convertDurationsTo( TimeUnit.MILLISECONDS ).formatFor(
                        Locale.US ).outputStreamSupplierFactory( this.getFileRotatingFileOutputStreamSupplier( rotationThreshold, maxArchives ) ).build(
                        this.ensureDirectoryExists( this.outputPath ) );
    }

    @Override
    public void start()
    {
        csvReporter.start( config.get( csvInterval ).toMillis(), TimeUnit.MILLISECONDS );
        logger.info( "Sending metrics to CSV file at " + outputPath );
    }

    @Override
    public void stop()
    {
        csvReporter.stop();
    }

    @Override
    public void shutdown()
    {
        csvReporter = null;
    }

    @Override
    public void report( SortedMap<String,Gauge> gauges, SortedMap<String,Counter> counters,
                        SortedMap<String,Histogram> histograms, SortedMap<String,Meter> meters, SortedMap<String,Timer> timers )
    {
        csvReporter.report( gauges, counters, histograms, meters, timers );
    }

    private BiFunction<File,RotatingFileOutputStreamSupplier.RotationListener,RotatingFileOutputStreamSupplier> getFileRotatingFileOutputStreamSupplier(
            Long rotationThreshold, Integer maxArchives )
    {
        return ( file, listener ) ->
        {
            try
            {
                return new RotatingFileOutputStreamSupplier( fileSystem, file, rotationThreshold, 0, maxArchives,
                                                             scheduler.executor( Group.LOG_ROTATION ), listener );
            }
            catch ( IOException e )
            {
                throw new RuntimeException( e );
            }
        };
    }

    /**
     * @param dir
     * @return
     * @throws IOException
     */
    private File ensureDirectoryExists( File dir ) throws IOException
    {
        if ( !fileSystem.fileExists( dir ) )
        {
            fileSystem.mkdirs( dir );
        }
        if ( !fileSystem.isDirectory( dir ) )
        {
            throw new IllegalStateException(
                    "The given path for CSV files points to a file, but a directory is required: " +
                    dir.getAbsolutePath() );
        }
        return dir;
    }
}
