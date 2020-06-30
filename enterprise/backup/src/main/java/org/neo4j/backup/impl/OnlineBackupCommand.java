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
package org.neo4j.backup.impl;

import org.apache.commons.lang3.exception.ExceptionUtils;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.backup.exceptions.ConsistencyException;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.Converters.DatabaseNameConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.Util;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.consistency.ConsistencyCheckOptions;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.kernel.impl.enterprise.settings.backup.OnlineBackupSettings;
import org.neo4j.logging.Level;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;

@Command( name = "backup", header = {"Perform an online backup from a running Neo4j enterprise server."}, description = {
        "Perform an online backup from a running Neo4j enterprise server. Neo4j's backup service must have been configured on the server beforehand.%n%nAll consistency checks except 'cc-graph' can be quite expensive so it may be useful to turn them off for very large databases. Increasing the heap size can also be a good idea. See 'neo4j-admin help' for details.%n%nFor more information see: https://neo4j.com/docs/operations-manual/4.0/backup/"} )
public class OnlineBackupCommand extends AbstractCommand
{
    private static final int STATUS_CONSISTENCY_CHECK_ERROR = 2;
    private static final int STATUS_CONSISTENCY_CHECK_INCONSISTENT = 3;
    @Option( names = {"--backup-dir"}, paramLabel = "<path>", required = true, description = {"Directory to place backup in."} )
    private Path backupDir;
    @Option( names = {"--from"}, paramLabel = "<host:port>", defaultValue = "localhost:6362", description = {"Host and port of Neo4j."} )
    private String from;
    @Option( names = {"--db"}, defaultValue = "neo4j", description = {"Name of the remote db to backup."}, converter = {
            DatabaseNameConverter.class} )
    private NormalizedDatabaseName database;
    @Option( names = {"--fallback-to-full"}, paramLabel = "<true/false>", defaultValue = "true", showDefaultValue = Visibility.ALWAYS, description = {
            "If an incremental backup fails backup will move the old backup to <name>.err.<N> and fallback to a full."} )
    private boolean fallbackToFull;
    @Option( names = {"--pagecache"}, paramLabel = "<size>", defaultValue = "8m", description = {"The size of the page cache to use for the backup process."} )
    private String pagecacheMemory;
    @Option( names = {"--check-consistency"}, paramLabel = "<true/false>", defaultValue = "true", showDefaultValue = Visibility.ALWAYS, description = {
            "If a consistency check should be made."} )
    private boolean checkConsistency;
    @Mixin
    private ConsistencyCheckOptions consistencyCheckOptions;
    @Option( names = {"--additional-config"}, paramLabel = "<path>", description = {"Configuration file to supply additional configuration in."} )
    private Path additionalConfig;

    /**
     * The entry point for neo4j admin tool's online backup functionality.
     *
     * @param ctx
     */
    public OnlineBackupCommand( ExecutionContext ctx )
    {
        super( ctx );
    }

    private static Path requireExisting( Path p )
    {
        try
        {
            return p.toRealPath();
        }
        catch ( IOException e )
        {
            throw new CommandFailedException( String.format( "Path '%s' does not exist.", p ), e );
        }
    }

    protected void execute()
    {
        backupDir = requireExisting( backupDir );
        SocketAddress address = SettingValueParsers.SOCKET_ADDRESS.parse( from );
        Path configFile = ctx.confDir().resolve( Config.DEFAULT_CONFIG_FILE_NAME );
        Config config = buildConfig( configFile, additionalConfig, backupDir );
        OnlineBackupContext onlineBackupContext = OnlineBackupContext.builder().withBackupDirectory( requireExisting( backupDir ) ).withReportsDirectory(
                consistencyCheckOptions.getReportDir() ).withAddress( address ).withDatabaseName( database.name() ).withConfig(
                config ).withFallbackToFullBackup( fallbackToFull ).withConsistencyCheck( checkConsistency ).withConsistencyCheckGraph(
                consistencyCheckOptions.isCheckGraph() ).withConsistencyCheckIndexes(
                consistencyCheckOptions.isCheckIndexes() ).withConsistencyCheckIndexStructure(
                consistencyCheckOptions.isCheckIndexStructure() ).withConsistencyCheckPropertyOwners(
                consistencyCheckOptions.isCheckPropertyOwners() ).withConsistencyCheckLabelScanStore(
                consistencyCheckOptions.isCheckLabelScanStore() ).build();
        LogProvider userLogProvider = Util.configuredLogProvider( config, ctx.out() );
        LogProvider internalLogProvider = verbose ? userLogProvider : NullLogProvider.getInstance();
        BackupExecutor backupExecutor =
                BackupExecutor.builder().withFileSystem( ctx.fs() ).withInternalLogProvider( (LogProvider) internalLogProvider ).withUserLogProvider(
                        userLogProvider ).withProgressMonitorFactory( ProgressMonitorFactory.textual( ctx.err() ) ).build();

        try
        {
            backupExecutor.backup( onlineBackupContext );
        }
        catch ( ConsistencyException e )
        {
            int exitCode = e.consistencyCheckFailure() ? 2 : 3;
            throw new CommandFailedException( e.getMessage(), e, exitCode );
        }
        catch ( Exception e )
        {
            throw new CommandFailedException( "Execution of backup failed. " + ExceptionUtils.getRootCause( e ).getMessage(), e );
        }

        ctx.out().println( "BackupExecutor complete." );
    }

    private Config buildConfig( Path configFile, Path additionalConfigFile, Path backupDirectory )
    {
        Config cfg = Config.newBuilder().fromFileNoThrow( configFile.toFile() ).fromFileNoThrow( additionalConfigFile ).set( GraphDatabaseSettings.neo4j_home,
                                                                                                                             backupDirectory )
                           .set( GraphDatabaseSettings.pagecache_memory, pagecacheMemory ).set( GraphDatabaseSettings.pagecache_warmup_enabled,
                                                                                                false )
                           .set( OnlineBackupSettings.online_backup_enabled, false ).build();
        ConfigUtils.disableAllConnectors( cfg );
        if ( verbose )
        {
            cfg.set( GraphDatabaseSettings.store_internal_log_level, Level.DEBUG );
        }

        return cfg;
    }
}
