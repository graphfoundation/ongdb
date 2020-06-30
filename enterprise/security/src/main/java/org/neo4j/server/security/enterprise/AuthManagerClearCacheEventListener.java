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
package org.neo4j.server.security.enterprise;

import org.neo4j.causalclustering.ReplicationEventNotificationService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListenerAdapter;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager;

/**
 * Clear AuthManager caches.
 */
class AuthManagerClearCacheEventListener extends TransactionEventListenerAdapter
        implements ReplicationEventNotificationService.ReplicationDatabaseEventListener
{
    private final EnterpriseAuthManager authManager;

    AuthManagerClearCacheEventListener( EnterpriseAuthManager authManager )
    {
        this.authManager = authManager;
    }

    @Override
    public void transactionCommitted( long txId )
    {
        this.authManager.clearAuthCache();
    }

    @Override
    public void storeReplaced( long txId )
    {
        this.authManager.clearAuthCache();
    }

    @Override
    public void afterCommit( TransactionData data, Object state, GraphDatabaseService databaseService )
    {
        this.authManager.clearAuthCache();
    }
}
