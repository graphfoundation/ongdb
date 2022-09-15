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
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.neo4j.configuration.Config;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.api.TestCommand;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.SimpleLogVersionRepository;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntry;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommand;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryStart;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.log.rotation.monitor.LogRotationMonitorAdapter;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.monitoring.DatabasePanicEventGenerator;
import org.neo4j.logging.NullLog;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.Race;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.LifeExtension;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

import static java.lang.System.currentTimeMillis;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.locks.LockSupport.parkNanos;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.neo4j.internal.kernel.api.security.AuthSubject.ANONYMOUS;
import static org.neo4j.kernel.impl.transaction.log.TestLogEntryReader.logEntryReader;
import static org.neo4j.kernel.impl.transaction.log.TransactionAppenderFactory.createTransactionAppender;
import static org.neo4j.kernel.impl.transaction.log.entry.LogVersions.CURRENT_FORMAT_LOG_HEADER_SIZE;

@Neo4jLayoutExtension
@ExtendWith( LifeExtension.class )
class TransactionLogAppendAndRotateIT
{
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private LifeSupport life;
    @Inject
    private DatabaseLayout databaseLayout;
    private ThreadPoolJobScheduler jobScheduler;

    @BeforeEach
    void setUp()
    {
        jobScheduler = new ThreadPoolJobScheduler();
    }

    @AfterEach
    void tearDown()
    {
        life.shutdown();
        jobScheduler.close();
    }

    @Test
    void shouldKeepTransactionsIntactWhenConcurrentlyRotationAndAppending() throws Throwable
    {
        // GIVEN
        LogVersionRepository logVersionRepository = new SimpleLogVersionRepository();
        Monitors monitors = new Monitors();
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withLogVersionRepository( logVersionRepository )
                .withRotationThreshold( ByteUnit.mebiBytes( 1 ) )
                .withMonitors( monitors )
                .withTransactionIdStore( new SimpleTransactionIdStore() )
                .withLogEntryReader( logEntryReader() )
                .withStoreId( StoreId.UNKNOWN )
                .build();
        life.add( logFiles );
        final AtomicBoolean end = new AtomicBoolean();
        TestLogFileMonitor monitoring = new TestLogFileMonitor( end, 100, logFiles.getLogFile() );
        monitors.addMonitorListener( monitoring );

        TransactionIdStore txIdStore = new SimpleTransactionIdStore();
        TransactionMetadataCache metadataCache = new TransactionMetadataCache();
        Health health = new DatabaseHealth( mock( DatabasePanicEventGenerator.class ), NullLog.getInstance() );
        final TransactionAppender appender =
                life.add( createBatchAppender( logFiles, txIdStore, metadataCache, health, jobScheduler, Config.defaults() ) );

        // WHEN
        Race race = new Race();
        for ( int i = 0; i < 4; i++ )
        {
            race.addContestant( () ->
            {
                while ( !end.get() )
                {
                    try
                    {
                        appender.append( new TransactionToApply( sillyTransaction( 1_000 ), CursorContext.NULL, StoreCursors.NULL ), LogAppendEvent.NULL );
                    }
                    catch ( Exception e )
                    {
                        end.set( true );
                        fail( e.getMessage(), e );
                    }
                }
            } );
        }
        race.addContestant( endAfterMax( 250, MILLISECONDS, end, monitoring ) );
        race.go();

        // THEN
        assertTrue( monitoring.numberOfRotations() > 0 );
    }

    private TransactionAppender createBatchAppender( LogFiles logFiles, TransactionIdStore txIdStore, TransactionMetadataCache metadataCache,
            Health health, JobScheduler jobScheduler, Config config )
    {
        return createTransactionAppender( logFiles, txIdStore, metadataCache, config, health, jobScheduler, NullLogProvider.getInstance() );
    }

    private static Runnable endAfterMax( final int time, final TimeUnit unit, final AtomicBoolean end, TestLogFileMonitor monitoring )
    {
        return () ->
        {
            while ( monitoring.numberOfRotations() < 2 && !end.get() )
            {
                parkNanos( MILLISECONDS.toNanos( 50 ) );
            }
            long endTime = currentTimeMillis() + unit.toMillis( time );
            while ( currentTimeMillis() < endTime && !end.get() )
            {
                parkNanos( MILLISECONDS.toNanos( 50 ) );
            }
            end.set( true );
        };
    }

    private static void assertWholeTransactionsIn( LogFile logFile, long logVersion ) throws IOException
    {
        try ( ReadableLogChannel reader = logFile.getReader( new LogPosition( logVersion, CURRENT_FORMAT_LOG_HEADER_SIZE ) ) )
        {
            LogEntryReader entryReader = logEntryReader();
            LogEntry entry;
            boolean inTx = false;
            int transactions = 0;
            while ( (entry = entryReader.readLogEntry( reader )) != null )
            {
                if ( !inTx ) // Expects start entry
                {
                    assertTrue( entry instanceof LogEntryStart );
                    inTx = true;
                }
                else // Expects command/commit entry
                {
                    assertTrue( entry instanceof LogEntryCommand || entry instanceof LogEntryCommit );
                    if ( entry instanceof LogEntryCommit )
                    {
                        inTx = false;
                        transactions++;
                    }
                }
            }
            assertFalse( inTx );
            assertTrue( transactions > 0 );
        }
    }

    private static TransactionRepresentation sillyTransaction( int size )
    {
        List<StorageCommand> commands = new ArrayList<>( size );
        for ( int i = 0; i < size; i++ )
        {
            // The actual data isn't super important
            commands.add( new TestCommand( 30 ) );
            commands.add( new TestCommand( 60 ) );
        }
        PhysicalTransactionRepresentation tx = new PhysicalTransactionRepresentation( commands );
        tx.setHeader( new byte[0], 0, 0, 0, 0, ANONYMOUS );
        return tx;
    }

    private static class TestLogFileMonitor extends LogRotationMonitorAdapter
    {
        private final AtomicBoolean end;
        private final int maxNumberOfRotations;
        private final LogFile logFile;
        private final AtomicInteger rotations = new AtomicInteger();

        TestLogFileMonitor( AtomicBoolean end, int maxNumberOfRotations, LogFile logFile )
        {
            this.end = end;
            this.maxNumberOfRotations = maxNumberOfRotations;
            this.logFile = logFile;
        }

        @Override
        public void finishLogRotation( Path logFile, long logVersion, long lastTransactionId, long rotationMillis, long millisSinceLastRotation )
        {
            try
            {
                assertWholeTransactionsIn( this.logFile, logVersion );
            }
            catch ( IOException e )
            {
                throw new RuntimeException( e );
            }
            finally
            {
                if ( rotations.getAndIncrement() > maxNumberOfRotations )
                {
                    end.set( true );
                }
            }
        }

        int numberOfRotations()
        {
            return rotations.get();
        }
    }
}
