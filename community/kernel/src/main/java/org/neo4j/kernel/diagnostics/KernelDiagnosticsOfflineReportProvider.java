/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.diagnostics;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.diagnostics.providers.StoreFilesDiagnostics;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.internal.Version;
import org.neo4j.storageengine.api.StorageEngineFactory;

@ServiceProvider
public class KernelDiagnosticsOfflineReportProvider extends DiagnosticsOfflineReportProvider
{
    private FileSystemAbstraction fs;
    private Config config;
    private DatabaseLayout databaseLayout;

    public KernelDiagnosticsOfflineReportProvider()
    {
        super( "logs", "plugins", "tree", "tx", "version" );
    }

    @Override
    public void init( FileSystemAbstraction fs, String defaultDatabaseName, Config config, Path storeDirectory )
    {
        this.fs = fs;
        this.config = config;
        this.databaseLayout = DatabaseLayout.ofFlat( storeDirectory.resolve( defaultDatabaseName ) );
    }

    @Override
    protected List<DiagnosticsReportSource> provideSources( Set<String> classifiers )
    {
        List<DiagnosticsReportSource> sources = new ArrayList<>();
        if ( classifiers.contains( "logs" ) )
        {
            getLogFiles( sources );
        }
        if ( classifiers.contains( "plugins" ) )
        {
            listPlugins( sources );
        }
        if ( classifiers.contains( "tree" ) )
        {
            listDataDirectory( sources );
        }
        if ( classifiers.contains( "tx" ) )
        {
            getTransactionLogFiles( sources );
        }
        if ( classifiers.contains( "version" ) )
        {
            getVersion( sources );
        }

        return sources;
    }

    private static void getVersion( List<DiagnosticsReportSource> sources )
    {
        Supplier<String> ongdbVersion = () -> "ongdb " + Version.getONgDBVersion() + System.lineSeparator();
        sources.add( DiagnosticsReportSources.newDiagnosticsString( "version.txt", ongdbVersion ) );
    }

    /**
     * Collect a list of all the files in the plugins directory.
     *
     * @param sources destination of the sources.
     */
    private void listPlugins( List<DiagnosticsReportSource> sources )
    {
        Path pluginDirectory = config.get( GraphDatabaseSettings.plugin_dir );
        if ( fs.fileExists( pluginDirectory ) )
        {
            StringBuilder sb = new StringBuilder();
            sb.append( "List of plugin directory:" ).append( System.lineSeparator() );
            try
            {
                listContentOfDirectory( pluginDirectory, "  ", sb );
            }
            catch ( IOException e )
            {
                sb.append( e.getMessage() ).append( System.lineSeparator() );
            }

            sources.add( DiagnosticsReportSources.newDiagnosticsString( "plugins.txt", sb::toString ) );
        }
    }

    private void listContentOfDirectory( Path directory, String prefix, StringBuilder sb ) throws IOException
    {
        if ( !fs.isDirectory( directory ) )
        {
            return;
        }

        Path[] files = fs.listFiles( directory );
        for ( Path file : files )
        {
            if ( fs.isDirectory( file ) )
            {
                listContentOfDirectory( file, prefix + file.getFileSystem().getSeparator() + file.getFileName(), sb );
            }
            else
            {
                sb.append( prefix ).append( file.getFileName() ).append( System.lineSeparator() );
            }
        }
    }

    /**
     * Print a tree view of all the files in the database directory with files sizes.
     *
     * @param sources destination of the sources.
     */
    private void listDataDirectory( List<DiagnosticsReportSource> sources )
    {
        StorageEngineFactory storageEngineFactory = StorageEngineFactory.defaultStorageEngine();
        StoreFilesDiagnostics storeFiles = new StoreFilesDiagnostics( storageEngineFactory, fs, databaseLayout );

        List<String> files = new ArrayList<>();
        storeFiles.dump( files::add );

        sources.add( DiagnosticsReportSources.newDiagnosticsString( "tree.txt", () -> String.join( System.lineSeparator(), files ) ) );
    }

    /**
     * Add {@code debug.log}, {@code ongdb.log} and {@code gc.log}. All with all available rotated files.
     *
     * @param sources destination of the sources.
     */
    private void getLogFiles( List<DiagnosticsReportSource> sources )
    {
        // debug.log
        Path debugLogFile = config.get( GraphDatabaseSettings.store_internal_log_path );
        if ( fs.fileExists( debugLogFile ) )
        {
            sources.addAll( DiagnosticsReportSources.newDiagnosticsRotatingFile( "logs/", fs, debugLogFile ) );
        }

        // ongdb.log
        Path ongdbLog = config.get( GraphDatabaseSettings.store_user_log_path );
        if ( fs.fileExists( ongdbLog ) )
        {
            sources.addAll( DiagnosticsReportSources.newDiagnosticsRotatingFile( "logs/", fs, ongdbLog ) );
        }

        // gc.log
        Path logDirectory = config.get( GraphDatabaseSettings.logs_directory );
        Path gcLog = logDirectory.resolve( "gc.log" );
        if ( fs.fileExists( gcLog ) )
        {
            sources.addAll( DiagnosticsReportSources.newDiagnosticsRotatingFile( "logs/", fs, gcLog ) );
        }
        // there are other rotation schemas but nothing we can predict...
    }

    /**
     * Add all available log files as sources.
     *
     * @param sources destination of the sources.
     */
    private void getTransactionLogFiles( List<DiagnosticsReportSource> sources )
    {
        try
        {
            LogFiles logFiles = LogFilesBuilder.logFilesBasedOnlyBuilder( databaseLayout.databaseDirectory(), fs ).build();
            for ( Path file : logFiles.logFiles() )
            {
                sources.add( DiagnosticsReportSources.newDiagnosticsFile( "tx/" + file.getFileName(), fs, file ) );
            }
        }
        catch ( IOException e )
        {
            sources.add( DiagnosticsReportSources
                    .newDiagnosticsString( "tx.txt", () -> "Error getting tx logs: " + e.getMessage() ) );
        }
    }
}
