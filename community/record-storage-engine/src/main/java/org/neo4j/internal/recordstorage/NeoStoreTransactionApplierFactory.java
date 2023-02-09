/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.internal.recordstorage;

import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.lock.LockService;
import org.neo4j.storageengine.api.CommandVersion;
import org.neo4j.storageengine.api.CommandsToApply;
import org.neo4j.storageengine.api.TransactionApplicationMode;

/**
 * Visits commands targeted towards the {@link NeoStores} and update corresponding stores. What happens in here is what
 * will happen in a "internal" transaction, i.e. a transaction that has been forged in this database, with transaction
 * state, a KernelTransaction and all that and is now committing. <p> For other modes of application, like recovery or
 * external there are other, added functionality, decorated outside this applier.
 */
public class NeoStoreTransactionApplierFactory implements TransactionApplierFactory
{
    private final CommandVersion version;
    private final NeoStores neoStores;
    // Ideally we don't want any cache access in here, but it is how it is. At least we try to minimize use of it
    private final CacheAccessBackDoor cacheAccess;
    private final LockService lockService;

    NeoStoreTransactionApplierFactory( TransactionApplicationMode mode, NeoStores store, CacheAccessBackDoor cacheAccess, LockService lockService )
    {
        this.version = mode.version();
        this.neoStores = store;
        this.cacheAccess = cacheAccess;
        this.lockService = lockService;
    }

    @Override
    public TransactionApplier startTx( CommandsToApply transaction, BatchContext batchContext )
    {
        return new NeoStoreTransactionApplier( version, neoStores, cacheAccess, lockService, transaction.transactionId(), batchContext,
                transaction.cursorContext(), transaction.storeCursors() );
    }

}
