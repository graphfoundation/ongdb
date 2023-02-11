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
package org.neo4j.internal.batchimport;

import org.neo4j.storageengine.api.TransactionIdStore;

import static org.neo4j.storageengine.api.LogVersionRepository.BASE_TX_LOG_BYTE_OFFSET;
import static org.neo4j.storageengine.api.LogVersionRepository.BASE_TX_LOG_VERSION;
import static org.neo4j.storageengine.api.LogVersionRepository.INITIAL_LOG_VERSION;

/**
 * Migrating a store uses the {@link ParallelBatchImporter} to do so, where node/relationship stores
 * are created with data read from legacy node/relationship stores. The batch import also populates
 * a counts store, which revolves around tokens and their ids. Knowing those high token ids before hand greatly helps
 * the batch importer code do things efficiently, instead of figuring that out as it goes. When doing
 * the migration there are no token stores, although nodes and relationships gets importer with existing
 * token ids in them, so this is a way for the StoreMigrator to communicate those ids to the
 * {@link ParallelBatchImporter}.
 *
 * When actually writing out the counts store on disk the last committed transaction id at that point is also
 * stored, and that's why the StoreMigrator needs to communicate that using
 * {@link #lastCommittedTransactionId()} as well.
 */
public interface AdditionalInitialIds
{
    long lastCommittedTransactionId();

    int lastCommittedTransactionChecksum();

    long lastCommittedTransactionLogVersion();

    long lastCommittedTransactionLogByteOffset();

    long checkpointLogVersion();

    /**
     * High ids of zero, useful when creating a completely new store with {@link ParallelBatchImporter}.
     */
    AdditionalInitialIds EMPTY = new AdditionalInitialIds()
    {
        @Override
        public long lastCommittedTransactionId()
        {
            return TransactionIdStore.BASE_TX_ID;
        }

        @Override
        public int lastCommittedTransactionChecksum()
        {
            return TransactionIdStore.BASE_TX_CHECKSUM;
        }

        @Override
        public long lastCommittedTransactionLogVersion()
        {
            return BASE_TX_LOG_VERSION;
        }

        @Override
        public long lastCommittedTransactionLogByteOffset()
        {
            return BASE_TX_LOG_BYTE_OFFSET;
        }

        @Override
        public long checkpointLogVersion()
        {
            return INITIAL_LOG_VERSION;
        }
    };
}
