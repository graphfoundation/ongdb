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
package org.neo4j.kernel.impl.transaction.log.pruning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.UncloseableDelegatingFileSystemAbstraction;
import org.neo4j.kernel.impl.transaction.log.LogVersionBridge;
import org.neo4j.kernel.impl.transaction.log.LogVersionedStoreChannel;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionCursor;
import org.neo4j.kernel.impl.transaction.log.ReadAheadLogChannel;
import org.neo4j.kernel.impl.transaction.log.ReadableLogChannel;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.kernel.impl.transaction.log.checkpoint.TriggerInfo;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.keep_logical_logs;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

class TestLogPruning
{
    private DatabaseManagementService managementService;
    private GraphDatabaseAPI db;
    private FileSystemAbstraction fs;
    private LogFiles logFiles;
    private int rotateEveryNTransactions;
    private int performedTransactions;

    @AfterEach
    void after() throws Exception
    {
        if ( db != null )
        {
            managementService.shutdown();
        }
        fs.close();
    }

    @Test
    void noPruning() throws Exception
    {
        newDb( "true", 2 );

        for ( int i = 0; i < 100; i++ )
        {
            doTransaction();
        }

        LogFile logFile = logFiles.getLogFile();
        long currentVersion = logFile.getHighestLogVersion();
        for ( long version = 0; version < currentVersion; version++ )
        {
            assertTrue( fs.fileExists( logFile.getLogFileForVersion( version ) ), "Version " + version + " has been unexpectedly pruned" );
        }
    }

    @Test
    void pruneByFileSize() throws Exception
    {
        // Given
        int transactionByteSize = figureOutSampleTransactionSizeBytes();
        int transactionsPerFile = 3;
        int logThreshold = transactionByteSize * transactionsPerFile;
        newDb( logThreshold + " size", 1 );

        // When
        for ( int i = 0; i < 100; i++ )
        {
            doTransaction();
        }

        int totalLogFileSize = logFileSize();
        double totalTransactions = (double) totalLogFileSize / transactionByteSize;
        assertTrue( totalTransactions >= 3 && totalTransactions < 4 );
    }

    @Test
    void pruneByFileCount() throws Exception
    {
        int logsToKeep = 5;
        newDb( logsToKeep + " files", 3 );

        for ( int i = 0; i < 100; i++ )
        {
            doTransaction();
        }

        assertEquals( logsToKeep, logCount() );
    }

    @Test
    void pruneByTransactionCount() throws Exception
    {
        int transactionsToKeep = 100;
        int transactionsPerLog = 3;
        newDb( transactionsToKeep + " txs", 3 );

        for ( int i = 0; i < 100; i++ )
        {
            doTransaction();
        }

        int transactionCount = transactionCount();
        assertTrue( transactionCount >= transactionsToKeep &&
                             transactionCount <= (transactionsToKeep + transactionsPerLog),
                "Transaction count expected to be within " + transactionsToKeep + " <= txs <= " + (transactionsToKeep + transactionsPerLog) +
                        ", but was " + transactionCount );
    }

    @Test
    void shouldKeepAtLeastOneTransactionAfterRotate() throws Exception
    {
        // Given
        // a database configured to keep 1 byte worth of logs, which means prune everything on rotate
        newDb( 1 + " size", 1 );

        // When
        // some transactions go through, rotating and pruning everything after them
        for ( int i = 0; i < 2; i++ )
        {
            doTransaction();
        }
        // and the log gets rotated, which means we have a new one with no txs in it
        rotate();
        /*
         * if we hadn't rotated after the txs went through, we would need to change the assertion to be at least 1 tx
         * instead of exactly one.
         */

        // Then
        // the database must have kept at least one tx (in our case exactly one, because we rotated the log)
        assertThat( transactionCount() ).isGreaterThanOrEqualTo( 1 );
    }

    private GraphDatabaseAPI newDb( String logPruning, int rotateEveryNTransactions )
    {
        this.rotateEveryNTransactions = rotateEveryNTransactions;
        fs = new EphemeralFileSystemAbstraction();
        managementService = new TestDatabaseManagementServiceBuilder()
                                .setFileSystem( new UncloseableDelegatingFileSystemAbstraction( fs ) ).impermanent()
                                .setConfig( keep_logical_logs, logPruning ).build();
        this.db = (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
        logFiles = db.getDependencyResolver().resolveDependency( LogFiles.class );
        return db;
    }

    private void doTransaction() throws IOException
    {
        if ( ++performedTransactions >= rotateEveryNTransactions )
        {
            rotate();
            performedTransactions = 0;
        }

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            node.setProperty( "name", "a somewhat lengthy string of some sort, right?" );
            tx.commit();
        }
        checkPoint();
    }

    private void rotate() throws IOException
    {
        logFiles.getLogFile().getLogRotation().rotateLogFile( LogAppendEvent.NULL );
    }

    private void checkPoint() throws IOException
    {
        TriggerInfo triggerInfo = new SimpleTriggerInfo( "test" );
        db.getDependencyResolver().resolveDependency( CheckPointer.class ).forceCheckPoint( triggerInfo );
    }

    private int figureOutSampleTransactionSizeBytes() throws IOException
    {
        db = newDb( "true", 5 );
        doTransaction();
        managementService.shutdown();
        return (int) fs.getFileSize( logFiles.getLogFile().getLogFileForVersion( 0 ) );
    }

    private int aggregateLogData( Extractor extractor ) throws IOException
    {
        int total = 0;
        LogFile logFile = logFiles.getLogFile();
        for ( long i = logFile.getHighestLogVersion(); i >= 0; i-- )
        {
            if ( logFile.versionExists( i ) )
            {
                total += extractor.extract( i );
            }
            else
            {
                break;
            }
        }
        return total;
    }

    private int logCount() throws IOException
    {
        return aggregateLogData( from -> 1 );
    }

    private int logFileSize() throws IOException
    {
        return aggregateLogData( from -> (int) fs.getFileSize( logFiles.getLogFile().getLogFileForVersion( from ) ) );
    }

    private int transactionCount() throws IOException
    {
        return aggregateLogData( version ->
        {
            int counter = 0;
            LogVersionBridge bridge = LogVersionBridge.NO_MORE_CHANNELS;
            LogVersionedStoreChannel versionedStoreChannel = logFiles.getLogFile().openForVersion( version );
            StorageEngineFactory storageEngineFactory = db.getDependencyResolver().resolveDependency( StorageEngineFactory.class );
            try ( ReadableLogChannel channel = new ReadAheadLogChannel( versionedStoreChannel, bridge, INSTANCE ) )
            {
                try ( PhysicalTransactionCursor physicalTransactionCursor =
                        new PhysicalTransactionCursor( channel, new VersionAwareLogEntryReader( storageEngineFactory.commandReaderFactory() ) ) )
                {
                    while ( physicalTransactionCursor.next() )
                    {
                        counter++;
                    }
                }
            }
            return counter;
        } );
    }

    @FunctionalInterface
    private interface Extractor
    {
        int extract( long fromVersion ) throws IOException;
    }
}
