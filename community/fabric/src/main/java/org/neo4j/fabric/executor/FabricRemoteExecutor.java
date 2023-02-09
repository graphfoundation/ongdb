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
package org.neo4j.fabric.executor;

import reactor.core.publisher.Mono;

import org.neo4j.fabric.bookmark.TransactionBookmarkManager;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.fabric.transaction.CompositeTransaction;
import org.neo4j.fabric.transaction.FabricTransactionInfo;
import org.neo4j.fabric.transaction.TransactionMode;
import org.neo4j.values.virtual.MapValue;

public interface FabricRemoteExecutor
{
    RemoteTransactionContext startTransactionContext( CompositeTransaction compositeTransaction,
            FabricTransactionInfo transactionInfo,
            TransactionBookmarkManager bookmarkManager );

    interface RemoteTransactionContext extends AutoCloseable
    {
        Mono<StatementResult> run( Location.Remote location, ExecutionOptions options, String query, TransactionMode transactionMode, MapValue params );

        boolean isEmptyContext();

        void close();
    }
}
