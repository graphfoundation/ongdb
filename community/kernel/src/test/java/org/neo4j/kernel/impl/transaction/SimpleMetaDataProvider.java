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
package org.neo4j.kernel.impl.transaction;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.storageengine.api.ClosedTransactionMetadata;
import org.neo4j.storageengine.api.ExternalStoreId;
import org.neo4j.storageengine.api.MetadataProvider;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionId;

public class SimpleMetaDataProvider implements MetadataProvider
{
    private final SimpleTransactionIdStore transactionIdStore;
    private final SimpleLogVersionRepository logVersionRepository;
    private final ExternalStoreId externalStoreId = new ExternalStoreId( UUID.randomUUID() );

    public SimpleMetaDataProvider()
    {
        transactionIdStore = new SimpleTransactionIdStore();
        logVersionRepository = new SimpleLogVersionRepository();
    }

    @Override
    public void close() throws IOException
    {
    }

    @Override
    public long getCurrentLogVersion()
    {
        return logVersionRepository.getCurrentLogVersion();
    }

    @Override
    public void setCurrentLogVersion( long version, CursorContext cursorContext )
    {
        logVersionRepository.setCurrentLogVersion( version, cursorContext );
    }

    @Override
    public long incrementAndGetVersion( CursorContext cursorContext )
    {
        return logVersionRepository.incrementAndGetVersion( cursorContext );
    }

    @Override
    public long getCheckpointLogVersion()
    {
        return logVersionRepository.getCheckpointLogVersion();
    }

    @Override
    public void setCheckpointLogVersion( long version, CursorContext cursorContext )
    {
        logVersionRepository.setCheckpointLogVersion( version, cursorContext );
    }

    @Override
    public long incrementAndGetCheckpointLogVersion( CursorContext cursorContext )
    {
        return logVersionRepository.incrementAndGetCheckpointLogVersion( cursorContext );
    }

    @Override
    public StoreId getStoreId()
    {
        return StoreId.UNKNOWN;
    }

    @Override
    public Optional<ExternalStoreId> getExternalStoreId()
    {
        return Optional.of( externalStoreId );
    }

    @Override
    public long nextCommittingTransactionId()
    {
        return transactionIdStore.nextCommittingTransactionId();
    }

    @Override
    public long committingTransactionId()
    {
        return transactionIdStore.committingTransactionId();
    }

    @Override
    public void transactionCommitted( long transactionId, int checksum, long commitTimestamp, CursorContext cursorContext )
    {
        transactionIdStore.transactionCommitted( transactionId, checksum, commitTimestamp, cursorContext );
    }

    @Override
    public long getLastCommittedTransactionId()
    {
        return transactionIdStore.getLastCommittedTransactionId();
    }

    @Override
    public TransactionId getLastCommittedTransaction()
    {
        return transactionIdStore.getLastCommittedTransaction();
    }

    @Override
    public TransactionId getUpgradeTransaction()
    {
        return transactionIdStore.getUpgradeTransaction();
    }

    @Override
    public long getLastClosedTransactionId()
    {
        return transactionIdStore.getLastClosedTransactionId();
    }

    @Override
    public ClosedTransactionMetadata getLastClosedTransaction()
    {
        return transactionIdStore.getLastClosedTransaction();
    }

    @Override
    public void setLastCommittedAndClosedTransactionId( long transactionId, int checksum, long commitTimestamp, long byteOffset, long logVersion,
            CursorContext cursorContext )
    {
        transactionIdStore.setLastCommittedAndClosedTransactionId( transactionId, checksum, commitTimestamp, byteOffset, logVersion, cursorContext );
    }

    @Override
    public void transactionClosed( long transactionId, long logVersion, long byteOffset, CursorContext cursorContext )
    {
        transactionIdStore.transactionClosed( transactionId, logVersion, byteOffset, cursorContext );
    }

    @Override
    public void resetLastClosedTransaction( long transactionId, long logVersion, long byteOffset, boolean missingLogs, CursorContext cursorContext )
    {
        transactionIdStore.resetLastClosedTransaction( transactionId, logVersion, byteOffset, missingLogs, cursorContext );
    }

    @Override
    public void flush( CursorContext cursorContext )
    {
        transactionIdStore.flush( cursorContext );
    }

    @Override
    public KernelVersion kernelVersion()
    {
        return KernelVersion.LATEST;
    }

    @Override
    public Optional<UUID> getDatabaseIdUuid( CursorContext cursorContext )
    {
        throw new IllegalStateException( "Not supported" );
    }

    @Override
    public void setDatabaseIdUuid( UUID uuid, CursorContext cursorContext )
    {
        throw new IllegalStateException( "Not supported" );
    }
}
