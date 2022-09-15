/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.event;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListener;
import org.neo4j.internal.helpers.collection.Iterables;

public class VerifyingTransactionEventListener implements TransactionEventListener<Object>
{
    private final ExpectedTransactionData expectedData;
    private boolean hasBeenCalled;
    private Throwable failure;

    public VerifyingTransactionEventListener( ExpectedTransactionData expectedData )
    {
        this.expectedData = expectedData;
    }

    @Override
    public void afterCommit( TransactionData data, Object state, GraphDatabaseService databaseService )
    {
        verify( data );
    }

    @Override
    public void afterRollback( TransactionData data, Object state, GraphDatabaseService databaseService )
    {
    }

    @Override
    public Object beforeCommit( TransactionData data, Transaction transaction, GraphDatabaseService databaseService )
    {
        return verify( data );
    }

    private Object verify( TransactionData data )
    {
        // TODO Hmm, makes me think... should we really call transaction event handlers
        // for these relationship type / property index transactions?
        if ( Iterables.count( data.createdNodes() ) == 0 )
        {
            return null;
        }

        try
        {
            this.expectedData.compareTo( data );
            this.hasBeenCalled = true;
            return null;
        }
        catch ( Exception e )
        {
            failure = e;
            throw e;
        }
    }

    boolean hasBeenCalled()
    {
        return this.hasBeenCalled;
    }

    Throwable failure()
    {
        return this.failure;
    }
}
