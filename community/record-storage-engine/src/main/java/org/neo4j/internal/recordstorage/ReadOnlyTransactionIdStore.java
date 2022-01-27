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

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.storageengine.api.ClosedTransactionMetadata;
import org.neo4j.storageengine.api.TransactionId;
import org.neo4j.storageengine.api.TransactionIdStore;

import static org.neo4j.kernel.impl.store.MetaDataStore.Position.LAST_CLOSED_TRANSACTION_LOG_BYTE_OFFSET;
import static org.neo4j.kernel.impl.store.MetaDataStore.Position.LAST_CLOSED_TRANSACTION_LOG_VERSION;
import static org.neo4j.kernel.impl.store.MetaDataStore.Position.LAST_TRANSACTION_CHECKSUM;
import static org.neo4j.kernel.impl.store.MetaDataStore.Position.LAST_TRANSACTION_ID;
import static org.neo4j.kernel.impl.store.MetaDataStore.getRecord;

public class ReadOnlyTransactionIdStore implements TransactionIdStore
{
    private final long transactionId;
    private final int transactionChecksum;
    private final LogPosition logPosition;

    public ReadOnlyTransactionIdStore( FileSystemAbstraction fs, PageCache pageCache, DatabaseLayout databaseLayout, CursorContext cursorContext )
            throws IOException
    {
        long id = 0;
        int checksum = 0;
        long logVersion = 0;
        long byteOffset = 0;
        if ( NeoStores.isStorePresent( fs, RecordDatabaseLayout.convert( databaseLayout ) ) )
        {
            Path neoStore = databaseLayout.metadataStore();
            String databaseName = databaseLayout.getDatabaseName();
            id = getRecord( pageCache, neoStore, LAST_TRANSACTION_ID, databaseName, cursorContext );
            checksum = (int) getRecord( pageCache, neoStore, LAST_TRANSACTION_CHECKSUM, databaseName, cursorContext );
            logVersion = getRecord( pageCache, neoStore, LAST_CLOSED_TRANSACTION_LOG_VERSION, databaseName, cursorContext );
            byteOffset = getRecord( pageCache, neoStore, LAST_CLOSED_TRANSACTION_LOG_BYTE_OFFSET, databaseName, cursorContext );
        }

        this.transactionId = id;
        this.transactionChecksum = checksum;
        this.logPosition = new LogPosition( logVersion, byteOffset );
    }

    @Override
    public long nextCommittingTransactionId()
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public long committingTransactionId()
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public void transactionCommitted( long transactionId, int checksum, long commitTimestamp, CursorContext cursorContext )
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public long getLastCommittedTransactionId()
    {
        return transactionId;
    }

    @Override
    public TransactionId getLastCommittedTransaction()
    {
        return new TransactionId( transactionId, transactionChecksum, BASE_TX_COMMIT_TIMESTAMP );
    }

    @Override
    public TransactionId getUpgradeTransaction()
    {
        return getLastCommittedTransaction();
    }

    @Override
    public long getLastClosedTransactionId()
    {
        return transactionId;
    }

    @Override
    public ClosedTransactionMetadata getLastClosedTransaction()
    {
        return new ClosedTransactionMetadata( transactionId, logPosition );
    }

    @Override
    public void setLastCommittedAndClosedTransactionId( long transactionId, int checksum, long commitTimestamp, long logByteOffset, long logVersion,
            CursorContext cursorContext )
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public void transactionClosed( long transactionId, long logVersion, long logByteOffset, CursorContext cursorContext )
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public void resetLastClosedTransaction( long transactionId, long logVersion, long byteOffset, boolean missingLogs, CursorContext cursorContext )
    {
        throw new UnsupportedOperationException( "Read-only transaction ID store" );
    }

    @Override
    public void flush( CursorContext cursorContext )
    {   // Nothing to flush
    }
}
