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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.common.ProgressReporter;
import org.neo4j.configuration.Config;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.TestCommand;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.recovery.CorruptedLogsTruncator;
import org.neo4j.kernel.recovery.RecoveryApplier;
import org.neo4j.kernel.recovery.RecoveryMonitor;
import org.neo4j.kernel.recovery.RecoveryPredicate;
import org.neo4j.kernel.recovery.RecoveryService;
import org.neo4j.kernel.recovery.RecoveryStartInformation;
import org.neo4j.kernel.recovery.TransactionLogsRecovery;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionApplicationMode;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.internal.kernel.api.security.AuthSubject.ANONYMOUS;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.transaction.log.TestLogEntryReader.logEntryReader;
import static org.neo4j.kernel.impl.transaction.log.entry.LogVersions.CURRENT_FORMAT_LOG_HEADER_SIZE;
import static org.neo4j.kernel.recovery.RecoveryStartupChecker.EMPTY_CHECKER;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
class PhysicalLogicalTransactionStoreTest
{
    private static final Health DATABASE_HEALTH = mock( DatabaseHealth.class );

    @Inject
    private DefaultFileSystemAbstraction fileSystem;
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private DatabaseLayout databaseLayout;
    private Path databaseDirectory;
    private final Monitors monitors = new Monitors();
    private ThreadPoolJobScheduler jobScheduler;

    @BeforeEach
    void setup()
    {
        jobScheduler = new ThreadPoolJobScheduler();
        databaseDirectory = testDirectory.homePath();
    }

    @AfterEach
    void tearDown()
    {
        jobScheduler.close();
    }

    @Test
    void extractTransactionFromLogFilesSkippingLastLogFileWithoutHeader() throws Exception
    {
        TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
        TransactionMetadataCache positionCache = new TransactionMetadataCache();
        Config config = Config.defaults();
        final byte[] additionalHeader = new byte[]{1, 2, 5};
        final long timeStarted = 12345;
        long latestCommittedTxWhenStarted = 4545;
        long timeCommitted = timeStarted + 10;
        LifeSupport life = new LifeSupport();
        final LogFiles logFiles = buildLogFiles( transactionIdStore );
        life.add( logFiles );
        life.start();
        try
        {
            addATransactionAndRewind( life, logFiles, positionCache, transactionIdStore, additionalHeader, timeStarted, latestCommittedTxWhenStarted,
                    timeCommitted, jobScheduler );
        }
        finally
        {
            life.shutdown();
        }

        // create empty transaction log file and clear transaction cache to force re-read
        LogFile logFile = logFiles.getLogFile();
        fileSystem.write( logFile.getLogFileForVersion( logFile.getHighestLogVersion() + 1 ) ).close();
        positionCache.clear();

        final LogicalTransactionStore store = new PhysicalLogicalTransactionStore( logFiles, positionCache, logEntryReader(), monitors, true, config );
        verifyTransaction( positionCache, additionalHeader, timeStarted, latestCommittedTxWhenStarted, timeCommitted, store );
    }

    @Test
    void shouldOpenCleanStore() throws Exception
    {
        // GIVEN
        TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
        TransactionMetadataCache positionCache = new TransactionMetadataCache();

        LifeSupport life = new LifeSupport();
        final LogFiles logFiles = buildLogFiles( transactionIdStore );
        life.add( logFiles );

        life.add( createTransactionAppender( transactionIdStore, positionCache, logFiles, Config.defaults(), jobScheduler ) );

        try
        {
            // WHEN
            life.start();
        }
        finally
        {
            life.shutdown();
        }
    }

    @Test
    void shouldOpenAndRecoverExistingData() throws Exception
    {
        // GIVEN
        TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
        TransactionMetadataCache positionCache = new TransactionMetadataCache();
        Config config = Config.defaults();
        final byte[] additionalHeader = new byte[]{1, 2, 5};
        final long timeStarted = 12345;
        long latestCommittedTxWhenStarted = 4545;
        long timeCommitted = timeStarted + 10;
        LifeSupport life = new LifeSupport();
        final LogFiles logFiles = buildLogFiles( transactionIdStore );

        life.start();
        life.add( logFiles );
        try
        {
            addATransactionAndRewind( life, logFiles, positionCache, transactionIdStore, additionalHeader, timeStarted, latestCommittedTxWhenStarted,
                    timeCommitted, jobScheduler );
        }
        finally
        {
            life.shutdown();
        }

        life = new LifeSupport();
        life.add( logFiles );
        final AtomicBoolean recoveryPerformed = new AtomicBoolean();
        FakeRecoveryVisitor visitor = new FakeRecoveryVisitor( additionalHeader, timeStarted, timeCommitted, latestCommittedTxWhenStarted );

        LogicalTransactionStore txStore = new PhysicalLogicalTransactionStore( logFiles, positionCache,
                                                                               logEntryReader(), monitors, true, config );

        life.add( createTransactionAppender( transactionIdStore, positionCache, logFiles, Config.defaults(), jobScheduler ) );
        CorruptedLogsTruncator logPruner = new CorruptedLogsTruncator( databaseDirectory, logFiles, fileSystem, INSTANCE );
        life.add( new TransactionLogsRecovery( new TestRecoveryService( visitor, logFiles, txStore, recoveryPerformed ),
                logPruner, new LifecycleAdapter(), mock( RecoveryMonitor.class ), ProgressReporter.SILENT, false, EMPTY_CHECKER,
                RecoveryPredicate.ALL, PageCacheTracer.NULL ) );

        // WHEN
        try
        {
            life.start();
        }
        finally
        {
            life.shutdown();
        }

        // THEN
        assertEquals( 1, visitor.getVisitedTransactions() );
        assertTrue( recoveryPerformed.get() );
    }

    @Test
    void shouldExtractMetadataFromExistingTransaction() throws Exception
    {
        // GIVEN
        TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
        TransactionMetadataCache positionCache = new TransactionMetadataCache();
        Config config = Config.defaults();
        final byte[] additionalHeader = new byte[]{1, 2, 5};
        final long timeStarted = 12345;
        long latestCommittedTxWhenStarted = 4545;
        long timeCommitted = timeStarted + 10;
        LifeSupport life = new LifeSupport();
        final LogFiles logFiles = buildLogFiles( transactionIdStore );
        life.start();
        life.add( logFiles );
        try
        {
            addATransactionAndRewind( life, logFiles, positionCache, transactionIdStore, additionalHeader, timeStarted, latestCommittedTxWhenStarted,
                    timeCommitted, jobScheduler );
        }
        finally
        {
            life.shutdown();
        }

        life = new LifeSupport();
        life.add( logFiles );
        final LogicalTransactionStore store = new PhysicalLogicalTransactionStore( logFiles, positionCache, logEntryReader(), monitors, true, config );

        // WHEN
        life.start();
        try
        {
            verifyTransaction( positionCache, additionalHeader, timeStarted, latestCommittedTxWhenStarted, timeCommitted, store );
        }
        finally
        {
            life.shutdown();
        }
    }

    @Test
    void shouldThrowNoSuchTransactionExceptionIfLogFileIsMissing() throws Exception
    {
        // GIVEN
        Config config = Config.defaults();
        LogFile logFile = mock( LogFile.class );
        LogFiles logFiles = mock( LogFiles.class );
        // a missing file
        when( logFiles.getLogFile() ).thenReturn( logFile );
        when( logFile.getReader( any( LogPosition.class) ) ).thenThrow( new NoSuchFileException( "mock" ) );
        // Which is nevertheless in the metadata cache
        TransactionMetadataCache cache = new TransactionMetadataCache();
        cache.cacheTransactionMetadata( 10, new LogPosition( 2, 130 ) );

        LifeSupport life = new LifeSupport();

        final LogicalTransactionStore txStore = new PhysicalLogicalTransactionStore( logFiles, cache, logEntryReader(), monitors, true, config );

        try
        {
            life.start();

            // WHEN
            // we ask for that transaction and forward
            assertThrows( NoSuchTransactionException.class, () -> txStore.getTransactions( 10 ) );
        }
        finally
        {
            life.shutdown();
        }
    }

    private LogFiles buildLogFiles( TransactionIdStore transactionIdStore ) throws IOException
    {
        return LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withRotationThreshold( ByteUnit.mebiBytes( 1 ) )
                .withTransactionIdStore( transactionIdStore )
                .withLogVersionRepository( mock( LogVersionRepository.class ) )
                .withLogEntryReader( logEntryReader() )
                .withStoreId( StoreId.UNKNOWN )
                .build();
    }

    private static void addATransactionAndRewind( LifeSupport life, LogFiles logFiles,
            TransactionMetadataCache positionCache,
            TransactionIdStore transactionIdStore,
            byte[] additionalHeader, long timeStarted,
            long latestCommittedTxWhenStarted, long timeCommitted, JobScheduler jobScheduler ) throws Exception
    {
        TransactionAppender appender = life.add( createTransactionAppender( transactionIdStore, positionCache, logFiles, Config.defaults(), jobScheduler ) );
        PhysicalTransactionRepresentation transaction =
                new PhysicalTransactionRepresentation( singleTestCommand() );
        transaction.setHeader( additionalHeader, timeStarted, latestCommittedTxWhenStarted, timeCommitted, -1, ANONYMOUS );
        appender.append( new TransactionToApply( transaction, NULL, StoreCursors.NULL ), LogAppendEvent.NULL );
    }

    private static List<StorageCommand> singleTestCommand()
    {
        return Collections.singletonList( new TestCommand() );
    }

    private static void verifyTransaction( TransactionMetadataCache positionCache, byte[] additionalHeader, long timeStarted,
            long latestCommittedTxWhenStarted, long timeCommitted, LogicalTransactionStore store ) throws IOException
    {
        try ( TransactionCursor cursor = store.getTransactions( TransactionIdStore.BASE_TX_ID + 1 ) )
        {
            boolean hasNext = cursor.next();
            assertTrue( hasNext );
            CommittedTransactionRepresentation tx = cursor.get();
            TransactionRepresentation transaction = tx.getTransactionRepresentation();
            assertArrayEquals( additionalHeader, transaction.additionalHeader() );
            assertEquals( timeStarted, transaction.getTimeStarted() );
            assertEquals( timeCommitted, transaction.getTimeCommitted() );
            assertEquals( latestCommittedTxWhenStarted, transaction.getLatestCommittedTxWhenStarted() );
        }

        positionCache.clear();
    }

    private static TransactionAppender createTransactionAppender( TransactionIdStore transactionIdStore, TransactionMetadataCache positionCache,
            LogFiles logFiles, Config config, JobScheduler jobScheduler )
    {
        return TransactionAppenderFactory.createTransactionAppender( logFiles, transactionIdStore, positionCache, config, DATABASE_HEALTH,
                jobScheduler, NullLogProvider.getInstance() );
    }

    private static class FakeRecoveryVisitor implements RecoveryApplier
    {
        private final byte[] additionalHeader;
        private final long timeStarted;
        private final long timeCommitted;
        private final long latestCommittedTxWhenStarted;
        private int visitedTransactions;

        FakeRecoveryVisitor( byte[] additionalHeader, long timeStarted, long timeCommitted, long latestCommittedTxWhenStarted )
        {
            this.additionalHeader = additionalHeader;
            this.timeStarted = timeStarted;
            this.timeCommitted = timeCommitted;
            this.latestCommittedTxWhenStarted = latestCommittedTxWhenStarted;
        }

        @Override
        public boolean visit( CommittedTransactionRepresentation tx )
        {
            TransactionRepresentation transaction = tx.getTransactionRepresentation();
            assertArrayEquals( additionalHeader, transaction.additionalHeader() );
            assertEquals( timeStarted, transaction.getTimeStarted() );
            assertEquals( timeCommitted, transaction.getTimeCommitted() );
            assertEquals( latestCommittedTxWhenStarted, transaction.getLatestCommittedTxWhenStarted() );
            visitedTransactions++;
            return false;
        }

        int getVisitedTransactions()
        {
            return visitedTransactions;
        }

        @Override
        public void close()
        {
        }
    }

    private static class TestRecoveryService implements RecoveryService
    {
        private final FakeRecoveryVisitor visitor;
        private final LogFiles logFiles;
        private final LogicalTransactionStore txStore;
        private final AtomicBoolean recoveryPerformed;

        TestRecoveryService( FakeRecoveryVisitor visitor, LogFiles logFiles, LogicalTransactionStore txStore, AtomicBoolean recoveryPerformed )
        {
            this.visitor = visitor;
            this.logFiles = logFiles;
            this.txStore = txStore;
            this.recoveryPerformed = recoveryPerformed;
        }

        @Override
        public RecoveryApplier getRecoveryApplier( TransactionApplicationMode mode, PageCacheTracer cacheTracer, String tracerTag )
        {
            return mode == TransactionApplicationMode.REVERSE_RECOVERY ? mock( RecoveryApplier.class ) : visitor;
        }

        @Override
        public RecoveryStartInformation getRecoveryStartInformation() throws IOException
        {
            return new RecoveryStartInformation( logFiles.getLogFile().extractHeader( 0 ).getStartPosition(),
                    new LogPosition( 0, CURRENT_FORMAT_LOG_HEADER_SIZE ), 1 );
        }

        @Override
        public TransactionCursor getTransactions( long transactionId ) throws IOException
        {
            return txStore.getTransactions( transactionId );
        }

        @Override
        public TransactionCursor getTransactions( LogPosition position ) throws IOException
        {
            return txStore.getTransactions( position );
        }

        @Override
        public TransactionCursor getTransactionsInReverseOrder( LogPosition position ) throws IOException
        {
            return txStore.getTransactionsInReverseOrder( position );
        }

        @Override
        public void transactionsRecovered( CommittedTransactionRepresentation lastRecoveredTransaction, LogPosition lastTransactionPosition,
                LogPosition positionAfterLastRecoveredTransaction, LogPosition checkpointPosition, boolean missingLogs, CursorContext cursorContext )
        {
            recoveryPerformed.set( true );
        }
    }
}
