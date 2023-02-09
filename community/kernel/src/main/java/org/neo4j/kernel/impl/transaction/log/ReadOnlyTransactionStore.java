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
package org.neo4j.kernel.impl.transaction.log;

import java.io.IOException;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.CommandReaderFactory;

/**
 * Used for reading transactions off of file.
 */
public class ReadOnlyTransactionStore implements Lifecycle, LogicalTransactionStore
{
    private final LifeSupport life = new LifeSupport();
    private final LogicalTransactionStore physicalStore;

    public ReadOnlyTransactionStore( PageCache pageCache, FileSystemAbstraction fs, DatabaseLayout fromDatabaseLayout, Config config,
            Monitors monitors, CommandReaderFactory commandReaderFactory ) throws IOException
    {
        TransactionMetadataCache transactionMetadataCache = new TransactionMetadataCache();
        LogEntryReader logEntryReader = new VersionAwareLogEntryReader( commandReaderFactory );
        LogFiles logFiles = LogFilesBuilder
                .activeFilesBuilder( fromDatabaseLayout, fs, pageCache ).withLogEntryReader( logEntryReader )
                .withConfig( config )
                .build();
        physicalStore = new PhysicalLogicalTransactionStore( logFiles, transactionMetadataCache, logEntryReader,
                                                             monitors, true, config );
    }

    @Override
    public TransactionCursor getTransactions( long transactionIdToStartFrom )
            throws IOException
    {
        return physicalStore.getTransactions( transactionIdToStartFrom );
    }

    @Override
    public TransactionCursor getTransactions( LogPosition position ) throws IOException
    {
        return physicalStore.getTransactions( position );
    }

    @Override
    public TransactionCursor getTransactionsInReverseOrder( LogPosition backToPosition ) throws IOException
    {
        return physicalStore.getTransactionsInReverseOrder( backToPosition );
    }

    @Override
    public void init()
    {
        life.init();
    }

    @Override
    public void start()
    {
        life.start();
    }

    @Override
    public void stop()
    {
        life.stop();
    }

    @Override
    public void shutdown()
    {
        life.shutdown();
    }
}
