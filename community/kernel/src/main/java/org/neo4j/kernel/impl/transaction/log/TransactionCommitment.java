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
package org.neo4j.kernel.impl.transaction.log;

import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.storageengine.api.TransactionIdStore;

class TransactionCommitment implements Commitment
{
    private final long transactionId;
    private final int transactionChecksum;
    private final long transactionCommitTimestamp;
    private final LogPosition logPosition;
    private final TransactionIdStore transactionIdStore;
    private boolean markedAsCommitted;

    TransactionCommitment( long transactionId, int transactionChecksum, long transactionCommitTimestamp, LogPosition logPosition,
            TransactionIdStore transactionIdStore )
    {
        this.transactionId = transactionId;
        this.transactionChecksum = transactionChecksum;
        this.transactionCommitTimestamp = transactionCommitTimestamp;
        this.logPosition = logPosition;
        this.transactionIdStore = transactionIdStore;
    }

    public LogPosition logPosition()
    {
        return logPosition;
    }

    @Override
    public void publishAsCommitted( CursorContext cursorContext )
    {
        markedAsCommitted = true;
        transactionIdStore.transactionCommitted( transactionId, transactionChecksum, transactionCommitTimestamp, cursorContext );
    }

    @Override
    public void publishAsClosed( CursorContext cursorContext )
    {
        transactionIdStore.transactionClosed( transactionId, logPosition.getLogVersion(), logPosition.getByteOffset(), cursorContext );
    }

    @Override
    public boolean markedAsCommitted()
    {
        return markedAsCommitted;
    }

    public int getTransactionChecksum()
    {
        return transactionChecksum;
    }
}
