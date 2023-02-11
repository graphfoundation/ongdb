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
package org.neo4j.graphdb.event;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;

/**
 * Adapter for a {@link TransactionEventListener}
 *
 * @param <T> the type of object communicated from a successful
 * {@link TransactionEventListener#beforeCommit(TransactionData, Transaction, GraphDatabaseService)} to
 * {@link TransactionEventListener#afterCommit(TransactionData, Object, GraphDatabaseService)}.
 */
public class TransactionEventListenerAdapter<T> implements TransactionEventListener<T>
{
    @Override
    public T beforeCommit( TransactionData data, Transaction transaction, GraphDatabaseService databaseService ) throws Exception
    {
        return null;
    }

    @Override
    public void afterCommit( TransactionData data, T state, GraphDatabaseService databaseService )
    {
    }

    @Override
    public void afterRollback( TransactionData data, T state, GraphDatabaseService databaseService )
    {
    }
}
