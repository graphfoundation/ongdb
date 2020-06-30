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

import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.api.StoreId;

public class BackupMetadata
{
    final SocketAddress remoteAddress;
    final StoreId remoteStoreId;
    final StoreId localStoreId;
    final NamedDatabaseId namedDatabaseId;

    public BackupMetadata( SocketAddress remoteAddress, StoreId remoteStoreId, StoreId localStoreId, NamedDatabaseId namedDatabaseId )
    {
        this.remoteAddress = remoteAddress;
        this.remoteStoreId = remoteStoreId;
        this.localStoreId = localStoreId;
        this.namedDatabaseId = namedDatabaseId;
    }
}
