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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.lang.StackWalker.StackFrame;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;

import org.neo4j.adversaries.Adversary;
import org.neo4j.adversaries.ClassGuardedAdversary;
import org.neo4j.adversaries.CountingAdversary;
import org.neo4j.adversaries.fs.AdversarialFileSystemAbstraction;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileSystemLifecycleAdapter;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.api.TestCommand;
import org.neo4j.kernel.impl.api.TestCommandReaderFactory;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.SimpleLogVersionRepository;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntry;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFile;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFiles;
import org.neo4j.kernel.impl.transaction.log.rotation.LogRotation;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.impl.transaction.tracing.LogForceWaitEvent;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.monitoring.DatabasePanicEventGenerator;
import org.neo4j.logging.NullLog;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.Race;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.LifeExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.dedicated_transaction_appender;
import static org.neo4j.internal.kernel.api.security.AuthSubject.ANONYMOUS;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.test.DoubleLatch.awaitLatch;

@EphemeralNeo4jLayoutExtension
@ExtendWith( LifeExtension.class )
public class TransactionAppenderConcurrencyTest
{
    private static ExecutorService executor;
    private static ThreadPoolJobScheduler jobScheduler;

    @Inject
    private LifeSupport life;
    @Inject
    private DatabaseLayout databaseLayout;

    private final LogFiles logFiles = mock( TransactionLogFiles.class );
    private final LogFile logFile = mock( LogFile.class );
    private final LogRotation logRotation = LogRotation.NO_ROTATION;
    private final TransactionMetadataCache transactionMetadataCache = new TransactionMetadataCache();
    private final TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
    private final SimpleLogVersionRepository logVersionRepository = new SimpleLogVersionRepository();

    @BeforeAll
    static void setUpExecutor()
    {
        jobScheduler = new ThreadPoolJobScheduler();
        executor = Executors.newCachedThreadPool();
    }

    @AfterAll
    static void tearDownExecutor()
    {
        executor.shutdown();
        executor = null;
    }

    @BeforeEach
    void setUp()
    {
        when( logFiles.getLogFile() ).thenReturn( logFile );
        jobScheduler = new ThreadPoolJobScheduler();
    }

    @AfterEach
    void tearDown()
    {
        life.shutdown();
        jobScheduler.close();
    }

    /*
     * There was an issue where if multiple concurrent appending threads did append and they moved on
     * to await a force, where the force would fail and the one doing the force would raise a panic...
     * the other threads may not notice the panic and move on to mark those transactions as committed
     * and notice the panic later (which would be too late).
     */
    @Test
    void shouldHaveAllConcurrentAppendersSeePanic() throws Throwable
    {
        // GIVEN
        Adversary adversary = new ClassGuardedAdversary( new CountingAdversary( 1, true ),
                failMethod( TransactionLogFile.class, "force" ) );
        EphemeralFileSystemAbstraction efs = new EphemeralFileSystemAbstraction();
        FileSystemAbstraction fs = new AdversarialFileSystemAbstraction( adversary, efs );
        life.add( new FileSystemLifecycleAdapter( fs ) );
        DatabaseHealth databaseHealth = new DatabaseHealth( mock( DatabasePanicEventGenerator.class ), NullLog.getInstance() );
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fs )
                .withLogVersionRepository( logVersionRepository )
                .withTransactionIdStore( transactionIdStore )
                .withDatabaseHealth( databaseHealth )
                .withLogEntryReader( new VersionAwareLogEntryReader( new TestCommandReaderFactory() ) )
                .withStoreId( StoreId.UNKNOWN )
                .build();
        life.add( logFiles );
        var appender = life.add( createTransactionAppender( databaseHealth, logFiles, jobScheduler ) );
        life.start();

        // WHEN
        int numberOfAppenders = 10;
        final CountDownLatch trap = new CountDownLatch( numberOfAppenders );
        final LogAppendEvent beforeForceTrappingEvent = new LogAppendEvent.Empty()
        {
            @Override
            public LogForceWaitEvent beginLogForceWait()
            {
                trap.countDown();
                awaitLatch( trap );
                return super.beginLogForceWait();
            }
        };
        Race race = new Race();
        for ( int i = 0; i < numberOfAppenders; i++ )
        {
            race.addContestant( () ->
            {
                // Good, we know that this test uses an adversarial file system which will throw
                // an exception in LogFile#force, and since all these transactions
                // will append and be forced in the same batch, where the force will fail then
                // all these transactions should fail. If there's any transaction not failing then
                // it just didn't notice the panic, which would be potentially hazardous.
                assertThrows( IOException.class, () ->
                    // Append to the log, the LogAppenderEvent will have all of the appending threads
                    // do wait for all of the other threads to start the force thing
                    appender.append( tx(), beforeForceTrappingEvent )
                );
            } );
        }

        // THEN perform the race. The relevant assertions are made inside the contestants.
        race.go();
    }

    @Test
    void databasePanicShouldHandleOutOfMemoryErrors() throws IOException, InterruptedException, ExecutionException
    {
        final CountDownLatch panicLatch = new CountDownLatch( 1 );
        final CountDownLatch adversaryLatch = new CountDownLatch( 1 );
        OutOfMemoryAwareFileSystem fs = new OutOfMemoryAwareFileSystem();

        life.add( new FileSystemLifecycleAdapter( fs ) );
        DatabaseHealth slowPanicDatabaseHealth = new SlowPanickingDatabaseHealth( panicLatch, adversaryLatch );
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fs )
                .withLogVersionRepository( logVersionRepository )
                .withTransactionIdStore( transactionIdStore )
                .withDatabaseHealth( slowPanicDatabaseHealth )
                .withLogEntryReader( new VersionAwareLogEntryReader( new TestCommandReaderFactory() ) )
                .withStoreId( StoreId.UNKNOWN )
                .build();
        life.add( logFiles );
        var appender = life.add( createTransactionAppender( slowPanicDatabaseHealth, logFiles, jobScheduler ) );
        life.start();

        // Commit initial transaction
        appender.append( tx(), LogAppendEvent.NULL );

        // Try to commit one transaction, will fail during flush with OOM, but not actually panic
        fs.shouldOOM = true;
        Future<Long> failingTransaction = executor.submit( () -> appender.append( tx(), LogAppendEvent.NULL ) );
        panicLatch.await();

        // Try to commit one additional transaction, should fail since database has already panicked
        fs.shouldOOM = false;
        var e = assertThrows( IOException.class, () -> appender.append( tx(), new LogAppendEvent.Empty()
            {
                @Override
                public LogForceWaitEvent beginLogForceWait()
                {
                    adversaryLatch.countDown();
                    return super.beginLogForceWait();
                }
            } ) );

        assertThat( e ).hasMessageContaining( "The database has encountered a critical error" );

        // Check that we actually got an OutOfMemoryError
        var executionException = assertThrows( ExecutionException.class, failingTransaction::get );
        assertThat( executionException ).hasCauseInstanceOf( OutOfMemoryError.class );

        // Check number of transactions, should only have one
        LogEntryReader logEntryReader = new VersionAwareLogEntryReader( new TestCommandReaderFactory() );

        LogFile logFile = logFiles.getLogFile();
        assertThat( logFile.getLowestLogVersion() ).isEqualTo( logFile.getHighestLogVersion() );
        long version = logFile.getHighestLogVersion();

        try ( LogVersionedStoreChannel channel = logFile.openForVersion( version );
                ReadAheadLogChannel readAheadLogChannel = new ReadAheadLogChannel( channel, INSTANCE );
                LogEntryCursor cursor = new LogEntryCursor( logEntryReader, readAheadLogChannel ) )
        {
            LogEntry entry;
            long numberOfTransactions = 0;
            while ( cursor.next() )
            {
                entry = cursor.get();
                if ( entry instanceof LogEntryCommit )
                {
                    numberOfTransactions++;
                }
            }
            assertThat( numberOfTransactions ).isEqualTo( 1L );
        }
    }

    private TransactionAppender createTransactionAppender( DatabaseHealth databaseHealth, LogFiles logFiles, JobScheduler scheduler )
    {
        return TransactionAppenderFactory.createTransactionAppender( logFiles, transactionIdStore, transactionMetadataCache,
                Config.defaults( dedicated_transaction_appender, false ),
                databaseHealth, scheduler, NullLogProvider.getInstance() );
    }

    private static class OutOfMemoryAwareFileSystem extends EphemeralFileSystemAbstraction
    {
        private volatile boolean shouldOOM;

        @Override
        public synchronized StoreChannel write( Path fileName ) throws IOException
        {
            return new DelegatingStoreChannel<>( super.write( fileName ) )
            {
                @Override
                public void writeAll( ByteBuffer src ) throws IOException
                {
                    if ( shouldOOM )
                    {
                        // Allocation of a temporary buffer happens the first time a thread tries to write
                        // so this is a perfectly plausible scenario.
                        throw new OutOfMemoryError( "Temporary buffer allocation failed" );
                    }
                    super.writeAll( src );
                }
            };
        }
    }

    private static class SlowPanickingDatabaseHealth extends DatabaseHealth
    {
        private final CountDownLatch panicLatch;
        private final CountDownLatch adversaryLatch;

        SlowPanickingDatabaseHealth( CountDownLatch panicLatch, CountDownLatch adversaryLatch )
        {
            super( mock( DatabasePanicEventGenerator.class ), NullLog.getInstance() );
            this.panicLatch = panicLatch;
            this.adversaryLatch = adversaryLatch;
        }

        @Override
        public void panic( Throwable cause )
        {
            panicLatch.countDown();
            try
            {
                adversaryLatch.await();
            }
            catch ( InterruptedException e )
            {
                throw new RuntimeException( e );
            }
            super.panic( cause );
        }
    }

    protected static TransactionToApply tx()
    {
        PhysicalTransactionRepresentation tx = new PhysicalTransactionRepresentation( singletonList( new TestCommand() ) );
        tx.setHeader( new byte[0], 0, 0, 0, 0, ANONYMOUS );
        return new TransactionToApply( tx, NULL, StoreCursors.NULL );
    }

    private static Predicate<StackFrame> failMethod( final Class<?> klass, final String methodName )
    {
        return frame -> frame.getClassName().equals( klass.getName() ) && frame.getMethodName().equals( methodName );
    }
}
