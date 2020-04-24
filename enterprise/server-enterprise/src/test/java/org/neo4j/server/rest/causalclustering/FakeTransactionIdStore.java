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
package org.neo4j.server.rest.causalclustering;

import java.util.concurrent.TimeoutException;

import org.neo4j.kernel.impl.store.TransactionId;
import org.neo4j.kernel.impl.transaction.log.TransactionIdStore;

class FakeTransactionIdStore implements TransactionIdStore
{

    private long transactionId;
    private long checksum;
    private long commitTimestamp;

    FakeTransactionIdStore()
    {
    }

    @Override
    public long nextCommittingTransactionId()
    {
        return transactionId;
    }

    @Override
    public long committingTransactionId()
    {
        return transactionId;
    }

    @Override
    public void transactionCommitted( long transactionId, long checksum, long commitTimestamp )
    {
        this.transactionId = transactionId;
        this.checksum = checksum;
        this.commitTimestamp = commitTimestamp;
    }

    @Override
    public long getLastCommittedTransactionId()
    {
        return transactionId;
    }

    @Override
    public TransactionId getLastCommittedTransaction()
    {
        return new TransactionId( transactionId, checksum, commitTimestamp );
    }

    @Override
    public TransactionId getUpgradeTransaction()
    {
        return new TransactionId( transactionId, checksum, commitTimestamp );
    }

    @Override
    public long getLastClosedTransactionId()
    {
        return transactionId;
    }

    @Override
    public void awaitClosedTransactionId( long txId, long timeoutMillis ) throws InterruptedException, TimeoutException
    {
    }

    @Override
    public long[] getLastClosedTransaction()
    {
        throw new RuntimeException( "Unimplemented" );
    }

    @Override
    public void setLastCommittedAndClosedTransactionId( long transactionId, long checksum, long commitTimestamp, long byteOffset, long logVersion )
    {
        this.transactionId = transactionId;
        this.checksum = checksum;
        this.commitTimestamp = commitTimestamp;
    }

    @Override
    public void transactionClosed( long transactionId, long logVersion, long byteOffset )
    {
        throw new RuntimeException( "Unimplemented" );
    }

    @Override
    public void flush()
    {
    }
}
