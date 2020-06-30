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

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.backup.exceptions.BackupException;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.Lifespan;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.util.VisibleForTesting;

/**
 * Individual backup strategies can perform incremental backups and full backups. The logic of how and when to perform full/incremental is identical. This class
 * describes the behaviour of a single strategy and is used to wrap an interface providing incremental/full backup functionality
 */
class BackupStrategyWrapper
{
    private final BackupStrategy backupStrategy;
    private final BackupCopyService backupCopyService;
    private final Log userLog;
    private final Log debugLog;
    private final FileSystemAbstraction fs;
    private final PageCache pageCache;

    /**
     * @param backupStrategy
     * @param backupCopyService
     * @param fs
     * @param pageCache
     * @param userLogProvider
     * @param logProvider
     */
    BackupStrategyWrapper( BackupStrategy backupStrategy, BackupCopyService backupCopyService, FileSystemAbstraction fs, PageCache pageCache,
                           LogProvider userLogProvider, LogProvider logProvider )
    {
        this.backupStrategy = backupStrategy;
        this.backupCopyService = backupCopyService;
        this.fs = fs;
        this.pageCache = pageCache;
        this.userLog = userLogProvider.getLog( this.getClass() );
        this.debugLog = logProvider.getLog( this.getClass() );
    }

    /**
     * Try to do a backup using the given strategy (ex. BackupProtocol). This covers all stages (starting with incremental and falling back to a a full backup).
     * The end result of this method will either be a successful backup or any other return type with the reason why the backup wasn't successful
     *
     * @param onlineBackupContext
     * @throws BackupException
     */
    void doBackup( OnlineBackupContext onlineBackupContext ) throws BackupException
    {
        Lifespan ignore = new Lifespan( new Lifecycle[]{this.backupStrategy} );

        try
        {
            this.performBackupWithoutLifecycle( onlineBackupContext );
        }
        catch ( Throwable e )
        {
            try
            {
                ignore.close();
            }
            catch ( Throwable e2 )
            {
                e.addSuppressed( e2 );
            }

            throw e;
        }

        ignore.close();
    }

    private void performBackupWithoutLifecycle( OnlineBackupContext onlineBackupContext ) throws BackupException
    {
        Path backupLocation = onlineBackupContext.getDatabaseBackupDir();
        SocketAddress address = onlineBackupContext.getAddress();
        Config config = onlineBackupContext.getConfig();
        DatabaseLayout backupLayout = DatabaseLayout.ofFlat( backupLocation.toFile() );
        boolean previousBackupExists = this.backupCopyService.doesBackupExist( backupLayout );
        boolean fallbackToFull = onlineBackupContext.getFallbackToFullBackup();
        if ( previousBackupExists )
        {
            this.debugLog.info( "Previous backup found, trying incremental backup." );
            if ( this.attemptToPerformIncrementalBackup( backupLayout, config, address, fallbackToFull, onlineBackupContext.getDatabaseName() ) )
            {
                return;
            }
        }

        if ( previousBackupExists && fallbackToFull )
        {
            this.debugLog.info( "Incremental backup failed, a new full backup will be performed." );
            this.fullBackupWithTemporaryFolderResolutions( onlineBackupContext, onlineBackupContext.getDatabaseName() );
        }
        else
        {
            if ( previousBackupExists )
            {
                throw new BackupException( "Incremental backup failed but fallback to full backup is disallowed by configuration" );
            }

            this.debugLog.info( "Previous backup not found, a new full backup will be performed." );
            this.fullBackupWithTemporaryFolderResolutions( onlineBackupContext, onlineBackupContext.getDatabaseName() );
        }
    }

    private boolean attemptToPerformIncrementalBackup( DatabaseLayout backupLayout, Config config, SocketAddress address, boolean fallbackToFullAllowed,
                                                       String databaseName ) throws BackupException
    {
        try
        {
            this.backupStrategy.performIncrementalBackup( backupLayout, address, databaseName );
            this.performRecovery( config, backupLayout );
            return true;
        }
        catch ( Exception e )
        {
            if ( fallbackToFullAllowed )
            {
                this.debugLog.warn( "Incremental backup attempt failed. Error: {}", e );
                return false;
            }
            else
            {
                throw e;
            }
        }
    }

    /**
     * This will perform a full backup with some directory renaming if necessary.
     * <p>
     * If there is no existing backup, then no renaming will occur. Otherwise the full backup will be done into a temporary directory and renaming will occur if
     * everything was successful.
     * </p>
     *
     * @param onlineBackupContext
     * @param databaseName
     * @throws BackupException
     */
    private void fullBackupWithTemporaryFolderResolutions( OnlineBackupContext onlineBackupContext, String databaseName ) throws BackupException
    {
        Path userSpecifiedBackupLocation = onlineBackupContext.getDatabaseBackupDir();
        Path temporaryFullBackupLocation = this.backupCopyService.findAnAvailableLocationForNewFullBackup( userSpecifiedBackupLocation );
        boolean backupToATemporaryLocation = !userSpecifiedBackupLocation.equals( temporaryFullBackupLocation );
        if ( backupToATemporaryLocation )
        {
            this.userLog.info(
                    "Full backup will be first performed to a temporary directory '%s' because the specified directory '%s' already exists and is not empty",
                    new Object[]{temporaryFullBackupLocation, userSpecifiedBackupLocation} );
        }

        SocketAddress address = onlineBackupContext.getAddress();
        DatabaseLayout backupLayout = DatabaseLayout.ofFlat( temporaryFullBackupLocation.toFile() );
        this.backupStrategy.performFullBackup( backupLayout, address, databaseName );
        this.performRecovery( onlineBackupContext.getConfig(), backupLayout );
        if ( backupToATemporaryLocation )
        {
            this.renameTemporaryBackupToExpected( temporaryFullBackupLocation, userSpecifiedBackupLocation );
        }
    }

    @VisibleForTesting
    void performRecovery( Config config, DatabaseLayout backupLayout ) throws BackupException
    {
        try
        {
            Recovery.performRecovery( this.fs, this.pageCache, config, backupLayout );
        }
        catch ( IOException e )
        {
            throw new BackupException( e );
        }
    }

    private void renameTemporaryBackupToExpected( Path temporaryFullBackupLocation, Path userSpecifiedBackupLocation ) throws BackupException
    {
        try
        {
            Path newBackupLocationForPreExistingBackup = this.backupCopyService.findNewBackupLocationForBrokenExisting( userSpecifiedBackupLocation );
            this.userLog.info( "Moving pre-existing directory '%s' that does not contain a valid backup to '%s'",
                               new Object[]{userSpecifiedBackupLocation, newBackupLocationForPreExistingBackup} );
            this.backupCopyService.changeBackupLocation( userSpecifiedBackupLocation, newBackupLocationForPreExistingBackup );
            this.userLog.info( "Moving temporary backup directory '%s' to the specified directory '%s'",
                               new Object[]{temporaryFullBackupLocation, userSpecifiedBackupLocation} );
            this.backupCopyService.changeBackupLocation( temporaryFullBackupLocation, userSpecifiedBackupLocation );
            this.backupCopyService.cleanupPreExistingBrokenBackupPath( newBackupLocationForPreExistingBackup, userSpecifiedBackupLocation );
        }
        catch ( IOException e )
        {
            throw new BackupException( e );
        }
    }
}
