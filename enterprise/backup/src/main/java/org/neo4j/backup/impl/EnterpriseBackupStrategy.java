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

import java.io.IOException;

import org.neo4j.backup.exceptions.BackupException;
import org.neo4j.backup.exceptions.ClusterDatabaseIdLoadException;
import org.neo4j.backup.exceptions.ClusterStoreCopyException;
import org.neo4j.backup.exceptions.ClusterStoreIdLoadException;
import org.neo4j.causalclustering.catchup.storecopy.StoreFiles;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;

/**
 * Enterprise implementation of a BackupStrategy
 */
class EnterpriseBackupStrategy extends LifecycleAdapter implements BackupStrategy
{
    private final BackupDelegator backupDelegator;
    private final Log log;
    private final StoreFiles storeFiles;

    /**
     * @param backupDelegator
     * @param logProvider
     * @param storeFiles
     */
    EnterpriseBackupStrategy( BackupDelegator backupDelegator, LogProvider logProvider, StoreFiles storeFiles )
    {
        this.backupDelegator = backupDelegator;
        this.log = logProvider.getLog( EnterpriseBackupStrategy.class );
        this.storeFiles = storeFiles;
    }

    /**
     * @param targetDatabaseLayout
     * @param socketAddress
     * @param databaseName
     * @throws BackupException
     */
    @Override
    public void performIncrementalBackup( DatabaseLayout targetDatabaseLayout, SocketAddress socketAddress, String databaseName )
            throws BackupException
    {

    }

    /**
     * @param databaseLayout
     * @return
     */
    private StoreId readStoreFilesStoreId( DatabaseLayout databaseLayout )
    {
        try
        {
            return this.storeFiles.isEmpty( databaseLayout ) ? null : this.storeFiles.readStoreId( databaseLayout );
        }
        catch ( IOException e )
        {
            this.log.warn( "Exception reading localStoreId. databaseLayout: {},  exception: {} ", databaseLayout, e );
            return null;
        }
    }

    /**
     * @param targetDatabaseLayout
     * @param socketAddress
     * @param databaseName
     * @throws BackupException
     */
    @Override
    public void performFullBackup( DatabaseLayout targetDatabaseLayout, SocketAddress socketAddress, String databaseName ) throws BackupException
    {
        BackupMetadata backupMetadata = this.backupPrep( targetDatabaseLayout, socketAddress, databaseName );
        if ( backupMetadata.localStoreId != null )
        {
            throw new BackupException( new ClusterStoreIdLoadException(
                    String.format( "Exception performing full backup.  remoteStore :  %s localStoreId  %s", backupMetadata.remoteStoreId,
                                   backupMetadata.localStoreId ) ) );
        }
        else
        {
            try
            {
                backupDelegator.copy( backupMetadata.remoteAddress, backupMetadata.remoteStoreId, backupMetadata.namedDatabaseId, targetDatabaseLayout );
            }
            catch ( ClusterStoreCopyException e )
            {
                throw new BackupException( e );
            }
        }
    }

    @Override
    public void start()
    {
        this.backupDelegator.start();
    }

    @Override
    public void stop()
    {
        this.backupDelegator.stop();
    }

    private BackupMetadata backupPrep( DatabaseLayout databaseLayout, SocketAddress address, String databaseName )
            throws BackupException
    {
        try
        {
            log.info( "address: {} ", address );
            NamedDatabaseId namedDatabaseId = backupDelegator.fetchDatabaseId( address, databaseName );
            log.info( "namedDatabaseId: {} ", namedDatabaseId );
            StoreId remoteStoreId = backupDelegator.fetchStoreId( address, namedDatabaseId );
            this.log.info( "remoteStoreId: {} ", remoteStoreId );
            StoreId localStoreId = readStoreFilesStoreId( databaseLayout );
            this.log.info( "localStoreId: {} ", remoteStoreId );
            return new BackupMetadata( address, remoteStoreId, localStoreId, namedDatabaseId );
        }
        catch ( ClusterDatabaseIdLoadException | ClusterStoreIdLoadException e )
        {
            throw new BackupException( e );
        }
    }
}
