/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;

class EnterpriseSystemGraphGraphDbOperator extends GraphDbOperator
{
    private final EnterpriseSystemGraphDbmsModel dbmsModel;
    private final ReconciledTransactionTracker reconciledTxTracker;
    private final Log log;

    EnterpriseSystemGraphGraphDbOperator( EnterpriseSystemGraphDbmsModel dbmsModel, ReconciledTransactionTracker reconciledTxTracker, LogProvider logProvider )
    {
        this.dbmsModel = dbmsModel;
        this.reconciledTxTracker = reconciledTxTracker;
        this.desiredStateMap.put( DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.name(),
                                  new EnterpriseGraphDbState( DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID, EnterpriseOperatorState.STARTED ) );
        this.log = logProvider.getLog( this.getClass() );
    }

    void transactionCommitted( long txId, TransactionData transactionData )
    {
        this.reconcile( txId, transactionData, false );
    }

    void storeReplaced( long txId )
    {
        this.reconcile( txId, (TransactionData) null, true );
    }

    private void reconcile( long txId, TransactionData transactionData, boolean asPartOfStoreCopy )
    {
        Collection<NamedDatabaseId> databasesToAwait = this.extractUpdatedDatabases( transactionData );
        this.updateDesiredStates();
        if ( asPartOfStoreCopy )
        {
            this.reconciledTxTracker.disable();
        }

        GraphDbReconcilerResult graphDbReconcilerResult = this.trigger( GraphDbReconcilerRequest.simple() );
        graphDbReconcilerResult.whenComplete( () ->
                                              {
                                                  this.offerReconciledTransactionId( txId, asPartOfStoreCopy );
                                              } );
        graphDbReconcilerResult.await( databasesToAwait );
    }

    synchronized void updateDesiredStates()
    {
        Map<String,EnterpriseGraphDbState> systemStates = this.dbmsModel.getDatabaseStates();
        Objects.requireNonNull( desiredStateMap );
        systemStates.forEach( desiredStateMap::put );
    }

    private Collection<NamedDatabaseId> extractUpdatedDatabases( TransactionData transactionData )
    {
        return (transactionData == null ? Collections.emptySet() : this.dbmsModel.updatedDatabases( transactionData ));
    }

    private void offerReconciledTransactionId( long txId, boolean asPartOfStoreCopy )
    {
        try
        {
            if ( asPartOfStoreCopy )
            {
                this.reconciledTxTracker.enable( txId );
            }
            else
            {
                this.reconciledTxTracker.offerReconciledTransactionId( txId );
            }
        }
        catch ( Throwable e )
        {
            this.log.error( "Failed to update the last reconciled transaction ID", e );
        }
    }
}
