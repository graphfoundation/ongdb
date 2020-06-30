/*
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

import java.nio.file.Path;

import org.neo4j.backup.exceptions.BackupException;
import org.neo4j.backup.exceptions.ConsistencyException;
import org.neo4j.causalclustering.catchup.storecopy.StoreFiles;
import org.neo4j.causalclustering.monitor.StoreMonitor;
import org.neo4j.com.storecopy.FileMoveProvider;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StorageEngineFactory;

/**
 * Executer Pattern for executing backup.
 */
public class BackupExecutor
{
    private final FileSystemAbstraction fs;
    private final LogProvider userLogProvider;
    private final LogProvider internalLogProvider;
    private final ProgressMonitorFactory progressMonitorFactory;
    private final Monitors monitors;
    private final BackupSupportingClassesFactory backupSupportingClassesFactory;
    private final ConsistencyCheckService consistencyCheckService = new ConsistencyCheckService();

    private BackupExecutor( BackupBuilder backupBuilder )
    {
        this.fs = backupBuilder.fs;
        this.userLogProvider = backupBuilder.userLogProvider;
        this.internalLogProvider = backupBuilder.internalLogProvider;
        this.progressMonitorFactory = backupBuilder.progressMonitorFactory;
        this.monitors = backupBuilder.monitors;
        this.backupSupportingClassesFactory = backupBuilder.supportingClassesFactory;
    }

    public static BackupExecutor build()
    {
        return builder().build();
    }

    public static BackupBuilder builder()
    {
        return new BackupBuilder();
    }

    public void backup( OnlineBackupContext context ) throws BackupException, ConsistencyException
    {
        this.verify( context );
        BackupSupportingClasses supportingClasses = this.backupSupportingClassesFactory.createSupportingClasses( context );

        try
        {
            StoreMonitor backupStoreCopyMonitor = new BackupOutputMonitor( this.userLogProvider );
            this.monitors.addMonitorListener( backupStoreCopyMonitor, new String[0] );
            PageCache pageCache = supportingClasses.getPageCache();
            StoreFiles storeFiles = new StoreFiles( this.fs, pageCache );
            BackupCopyService copyService = new BackupCopyService( this.fs, new FileMoveProvider( this.fs ), storeFiles, this.internalLogProvider );
            BackupStrategy strategy = new EnterpriseBackupStrategy( supportingClasses.getBackupDelegator(), this.internalLogProvider, storeFiles );
            BackupStrategyWrapper wrapper =
                    new BackupStrategyWrapper( strategy, copyService, this.fs, pageCache, this.userLogProvider, this.internalLogProvider );
            BackupStrategyCoordinator coordinator =
                    new BackupStrategyCoordinator( this.fs, this.consistencyCheckService, this.internalLogProvider, this.progressMonitorFactory, wrapper );
            coordinator.performBackup( context );
        }
        catch ( Throwable e )
        {
            if ( supportingClasses != null )
            {
                try
                {
                    supportingClasses.close();
                }
                catch ( Throwable e2 )
                {
                    e.addSuppressed( e2 );
                }
            }

            throw e;
        }

        if ( supportingClasses != null )
        {
            supportingClasses.close();
        }
    }

    /**
     * Verify the parent and report directories both exist.
     *
     * @param context
     * @throws BackupException
     */
    private void verify( OnlineBackupContext context ) throws BackupException
    {
        this.verifyDirectoryExists( context.getDatabaseBackupDir().getParent() );
        this.verifyDirectoryExists( context.getReportDir() );
    }

    /**
     * Verify the directory exists.
     *
     * @param path
     * @throws BackupException
     */
    private void verifyDirectoryExists( Path path ) throws BackupException
    {
        if ( !this.fs.isDirectory( path.toFile() ) )
        {
            throw new BackupException( String.format( "Directory '%s' does not exist.", path ) );
        }
    }

    /**
     * Builder pattern.  Using standard withXXX methods similar to the community ImportCommand
     */
    public static final class BackupBuilder
    {
        private FileSystemAbstraction fs = new DefaultFileSystemAbstraction();
        private LogProvider userLogProvider = NullLogProvider.getInstance();
        private LogProvider internalLogProvider = NullLogProvider.getInstance();
        private ProgressMonitorFactory progressMonitorFactory;
        private Monitors monitors;
        private BackupSupportingClassesFactory supportingClassesFactory;
        private StorageEngineFactory storageEngineFactory;

        /**
         *
         */
        private BackupBuilder()
        {
            this.progressMonitorFactory = ProgressMonitorFactory.NONE;
            this.monitors = new Monitors();
            this.storageEngineFactory = StorageEngineFactory.selectStorageEngine();
        }

        /**
         * @param fs
         * @return
         */
        public BackupBuilder withFileSystem( FileSystemAbstraction fs )
        {
            this.fs = fs;
            return this;
        }

        /**
         * @param userLogProvider
         * @return
         */
        public BackupBuilder withUserLogProvider( LogProvider userLogProvider )
        {
            this.userLogProvider = userLogProvider;
            return this;
        }

        /**
         * @param internalLogProvider
         * @return
         */
        public BackupBuilder withInternalLogProvider( LogProvider internalLogProvider )
        {
            this.internalLogProvider = internalLogProvider;
            return this;
        }

        /**
         * @param progressMonitorFactory
         * @return
         */
        public BackupBuilder withProgressMonitorFactory( ProgressMonitorFactory progressMonitorFactory )
        {
            this.progressMonitorFactory = progressMonitorFactory;
            return this;
        }

        /**
         * @param monitors
         * @return
         */
        public BackupBuilder withMonitors( Monitors monitors )
        {
            this.monitors = monitors;
            return this;
        }

        /**
         * @param supportingClassesFactory
         * @return
         */
        public BackupBuilder withSupportingClassesFactory( BackupSupportingClassesFactory supportingClassesFactory )
        {
            this.supportingClassesFactory = supportingClassesFactory;
            return this;
        }

        /**
         * @param storageEngineFactory
         * @return
         */
        public BackupBuilder withStorageEngineFactory( StorageEngineFactory storageEngineFactory )
        {
            this.storageEngineFactory = storageEngineFactory;
            return this;
        }

        /**
         * @return
         */
        public BackupExecutor build()
        {
            if ( this.supportingClassesFactory == null )
            {
                this.supportingClassesFactory =
                        new BackupSupportingClassesFactory( storageEngineFactory, fs, internalLogProvider, monitors );
            }

            return new BackupExecutor( this );
        }
    }
}
