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

import java.util.function.Function;

import org.neo4j.backup.exceptions.ClusterDatabaseIdLoadException;
import org.neo4j.backup.exceptions.ClusterStoreCopyException;
import org.neo4j.backup.exceptions.ClusterStoreIdLoadException;
import org.neo4j.causalclustering.catchup.storecopy.RemoteStore;
import org.neo4j.causalclustering.catchup.storecopy.StoreCopyClient;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;

/**
 * Simplifies the process of performing a backup over the transaction protocol by wrapping all the necessary classes and delegating methods to the correct
 * instances.
 */
class BackupDelegator extends LifecycleAdapter
{

    BackupDelegator( Function<NamedDatabaseId,RemoteStore> remoteStore, Function<NamedDatabaseId,StoreCopyClient> storeCopyClient, LogProvider logProvider )
    {

    }

    @Override
    public void start()
    {

    }

    @Override
    public void stop()
    {

    }

    /**
     * // TODO: Implement
     *
     * @param fromAddress
     * @param expectedStoreId
     * @param namedDatabaseId
     * @param databaseLayout
     * @throws ClusterStoreCopyException
     */
    public void copy( SocketAddress fromAddress, StoreId expectedStoreId, NamedDatabaseId namedDatabaseId, DatabaseLayout databaseLayout )
            throws ClusterStoreCopyException
    {
        // Old approach below.
        // remoteStore.copy( new CatchupAddressProvider.SingleAddressProvider( fromAddress ), expectedStoreId, databaseLayout, true );
    }

    /**
     * TODO: Implement
     *
     * @param fromAddress
     * @param expectedStoreId
     * @param namedDatabaseId
     * @param databaseLayout
     * @throws ClusterStoreCopyException
     */
    public void tryCatchingUp( SocketAddress fromAddress, StoreId expectedStoreId, NamedDatabaseId namedDatabaseId, DatabaseLayout databaseLayout )
            throws ClusterStoreCopyException
    {

    }

    /**
     * TODO: Implement
     *
     * @param fromAddress
     * @param namedDatabaseId
     * @return
     * @throws ClusterStoreIdLoadException
     */
    public StoreId fetchStoreId( SocketAddress fromAddress, NamedDatabaseId namedDatabaseId ) throws ClusterStoreIdLoadException
    {
        return null;
    }

    /**
     * TODO: Implement Used the same naming convention as the fetchStoreId method above.
     *
     * @param fromAddress
     * @param databaseName
     * @return
     * @throws ClusterDatabaseIdLoadException
     */
    public NamedDatabaseId fetchDatabaseId( SocketAddress fromAddress, final String databaseName ) throws ClusterDatabaseIdLoadException
    {
        return null;
    }
}
