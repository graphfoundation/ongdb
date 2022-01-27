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
package org.neo4j.kernel.impl.transaction.log.reverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.WritableChecksumChannel;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.database.LogEntryWriterFactory;
import org.neo4j.kernel.impl.api.TestCommand;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.SimpleLogVersionRepository;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.FlushablePositionAwareChecksumChannel;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.ReadAheadLogChannel;
import org.neo4j.kernel.impl.transaction.log.TransactionLogWriter;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryWriter;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.LifeExtension;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.neo4j.internal.kernel.api.security.AuthSubject.ANONYMOUS;
import static org.neo4j.kernel.impl.transaction.log.GivenTransactionCursor.exhaust;
import static org.neo4j.kernel.impl.transaction.log.TestLogEntryReader.logEntryReader;
import static org.neo4j.kernel.impl.transaction.log.entry.LogEntryTypeCodes.TX_START;
import static org.neo4j.storageengine.api.TransactionIdStore.BASE_TX_CHECKSUM;

@Neo4jLayoutExtension
@ExtendWith( {RandomExtension.class, LifeExtension.class} )
class ReversedSingleFileTransactionCursorTest
{
    @Inject
    private FileSystemAbstraction fs;
    @Inject
    private DatabaseLayout databaseLayout;
    @Inject
    private LifeSupport life;
    @Inject
    private RandomSupport random;

    private long txId = TransactionIdStore.BASE_TX_ID;
    private final LogProvider logProvider = new AssertableLogProvider( true );
    private final ReverseTransactionCursorLoggingMonitor monitor = new ReverseTransactionCursorLoggingMonitor(
            logProvider.getLog( ReversedSingleFileTransactionCursor.class ) );
    private LogFile logFile;
    private LogFiles logFiles;

    @BeforeEach
    void setUp() throws IOException
    {
        LogVersionRepository logVersionRepository = new SimpleLogVersionRepository();
        SimpleTransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
        logFiles = LogFilesBuilder.builder( databaseLayout, fs )
                .withRotationThreshold( ByteUnit.mebiBytes( 10 ) )
                .withLogVersionRepository( logVersionRepository )
                .withTransactionIdStore( transactionIdStore )
                .withLogEntryReader( logEntryReader() )
                .withStoreId( StoreId.UNKNOWN )
                .build();
        life.add( logFiles );
        logFile = logFiles.getLogFile();
    }

    @Test
    void shouldHandleVerySmallTransactions() throws Exception
    {
        // given
        writeTransactions( 10, 1, 1 );

        // when
        CommittedTransactionRepresentation[] readTransactions = readAllFromReversedCursor();

        // then
        assertTransactionRange( readTransactions, txId, TransactionIdStore.BASE_TX_ID );
    }

    @Test
    void shouldHandleManyVerySmallTransactions() throws Exception
    {
        // given
        writeTransactions( 20_000, 1, 1 );

        // when
        CommittedTransactionRepresentation[] readTransactions = readAllFromReversedCursor();

        // then
        assertTransactionRange( readTransactions, txId, TransactionIdStore.BASE_TX_ID );
    }

    @Test
    void shouldHandleLargeTransactions() throws Exception
    {
        // given
        writeTransactions( 10, 1000, 1000 );

        // when
        CommittedTransactionRepresentation[] readTransactions = readAllFromReversedCursor();

        // then
        assertTransactionRange( readTransactions, txId, TransactionIdStore.BASE_TX_ID );
    }

    @Test
    void shouldHandleEmptyLog() throws Exception
    {
        // given

        // when
        CommittedTransactionRepresentation[] readTransactions = readAllFromReversedCursor();

        // then
        assertEquals( 0, readTransactions.length );
    }

    @Test
    void shouldDetectAndPreventChannelReadingMultipleLogVersions() throws Exception
    {
        // given
        writeTransactions( 1, 1, 1 );
        logFile.rotate();
        writeTransactions( 1, 1, 1 );

        // when
        try ( ReadAheadLogChannel channel = (ReadAheadLogChannel) logFile.getReader( logFiles.getLogFile().extractHeader( 0 ).getStartPosition() ) )
        {
            new ReversedSingleFileTransactionCursor( channel, logEntryReader(), false, monitor );
            fail( "Should've failed" );
        }
        catch ( IllegalArgumentException e )
        {
            // then good
            assertThat( e.getMessage() ).contains( "multiple log versions" );
        }
    }

    @Test
    void readCorruptedTransactionLog() throws IOException
    {
        int readableTransactions = 10;
        writeTransactions( readableTransactions, 1, 1 );
        appendCorruptedTransaction();
        writeTransactions( readableTransactions, 1, 1 );
        CommittedTransactionRepresentation[] committedTransactionRepresentations = readAllFromReversedCursor();
        assertTransactionRange( committedTransactionRepresentations,
                readableTransactions + TransactionIdStore.BASE_TX_ID, TransactionIdStore.BASE_TX_ID );
    }

    @Test
    void failToReadCorruptedTransactionLogWhenConfigured() throws IOException
    {
        int readableTransactions = 10;
        writeTransactions( readableTransactions, 1, 1 );
        appendCorruptedTransaction();
        writeTransactions( readableTransactions, 1, 1 );

        assertThrows( IOException.class, this::readAllFromReversedCursorFailOnCorrupted );
    }

    private CommittedTransactionRepresentation[] readAllFromReversedCursor() throws IOException
    {
        try ( ReversedSingleFileTransactionCursor cursor = txCursor( false ) )
        {
            return exhaust( cursor );
        }
    }

    private CommittedTransactionRepresentation[] readAllFromReversedCursorFailOnCorrupted() throws IOException
    {
        try ( ReversedSingleFileTransactionCursor cursor = txCursor( true ) )
        {
            return exhaust( cursor );
        }
    }

    private static void assertTransactionRange( CommittedTransactionRepresentation[] readTransactions, long highTxId, long lowTxId )
    {
        long expectedTxId = highTxId;
        for ( CommittedTransactionRepresentation tx : readTransactions )
        {
            assertEquals( expectedTxId, tx.getCommitEntry().getTxId() );
            expectedTxId--;
        }
        assertEquals( expectedTxId, lowTxId );
    }

    private ReversedSingleFileTransactionCursor txCursor( boolean failOnCorruptedLogFiles ) throws IOException
    {
        ReadAheadLogChannel fileReader = (ReadAheadLogChannel) logFile.getReader( logFiles.getLogFile().extractHeader( 0 ).getStartPosition() );
        try
        {
            return new ReversedSingleFileTransactionCursor( fileReader, logEntryReader(), failOnCorruptedLogFiles, monitor );
        }
        catch ( Exception e )
        {
            fileReader.close();
            throw e;
        }
    }

    private void writeTransactions( int transactionCount, int minTransactionSize, int maxTransactionSize ) throws IOException
    {
        FlushablePositionAwareChecksumChannel channel = logFile.getTransactionLogWriter().getChannel();
        TransactionLogWriter writer = logFile.getTransactionLogWriter();
        int previousChecksum = BASE_TX_CHECKSUM;
        for ( int i = 0; i < transactionCount; i++ )
        {
            previousChecksum = writer.append( tx( random.intBetween( minTransactionSize, maxTransactionSize ) ), ++txId, previousChecksum );
        }
        channel.prepareForFlush().flush();
        // Don't close the channel, LogFile owns it
    }

    private void appendCorruptedTransaction() throws IOException
    {
        var channel = logFile.getTransactionLogWriter().getChannel();
        TransactionLogWriter writer = new TransactionLogWriter( channel, new CorruptedLogEntryWriterFactory() );
        writer.append( tx( random.intBetween( 100, 1000 ) ), ++txId, BASE_TX_CHECKSUM );
    }

    private static TransactionRepresentation tx( int size )
    {
        List<StorageCommand> commands = new ArrayList<>();
        for ( int i = 0; i < size; i++ )
        {
            // The type of command doesn't matter here
            commands.add( new TestCommand() );
        }
        PhysicalTransactionRepresentation tx = new PhysicalTransactionRepresentation( commands );
        tx.setHeader( new byte[0], 0, 0, 0, 0, ANONYMOUS );
        return tx;
    }

    private static class CorruptedLogEntryWriterFactory implements LogEntryWriterFactory
    {
        @Override
        public <T extends WritableChecksumChannel> LogEntryWriter<T> createEntryWriter( T channel )
        {
            return new CorruptedLogEntryWriter<>( channel, KernelVersion.LATEST );
        }

        @Override
        public <T extends WritableChecksumChannel> LogEntryWriter<T> createEntryWriter( T channel, KernelVersion version )
        {
            return new CorruptedLogEntryWriter<>( channel, version );
        }
    }

    private static class CorruptedLogEntryWriter<T extends WritableChecksumChannel> extends LogEntryWriter<T>
    {
        CorruptedLogEntryWriter( T channel, KernelVersion version )
        {
            super( channel, version );
        }

        @Override
        public void writeStartEntry( long timeWritten, long latestCommittedTxWhenStarted, int previousChecksum, byte[] additionalHeaderData ) throws IOException
        {
            writeLogEntryHeader( TX_START, channel );
            for ( int i = 0; i < 100; i++ )
            {
                channel.put( (byte) -1 );
            }
        }
    }
}
