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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.time.Instant;

import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.transaction.SimpleLogVersionRepository;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogChannelAllocator;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesContext;
import org.neo4j.kernel.impl.transaction.log.files.checkpoint.CheckpointFile;
import org.neo4j.kernel.impl.transaction.tracing.LogCheckPointEvent;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.NullLog;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.PanicEventGenerator;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.LifeExtension;
import org.neo4j.test.extension.Neo4jLayoutExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.neo4j.kernel.impl.transaction.log.LogPosition.UNSPECIFIED;
import static org.neo4j.kernel.impl.transaction.log.TestLogEntryReader.logEntryReader;
import static org.neo4j.kernel.impl.transaction.log.rotation.LogRotation.NO_ROTATION;
import static org.neo4j.storageengine.api.TransactionIdStore.BASE_TX_COMMIT_TIMESTAMP;

@Neo4jLayoutExtension
@ExtendWith( LifeExtension.class )
class DetachedCheckpointAppenderTest
{
    @Inject
    private DatabaseLayout databaseLayout;
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private LifeSupport life;

    private final long rotationThreshold = ByteUnit.mebiBytes( 1 );
    private final DatabaseHealth databaseHealth = new DatabaseHealth( PanicEventGenerator.NO_OP, NullLog.getInstance() );
    private final LogVersionRepository logVersionRepository = new SimpleLogVersionRepository( 1L );
    private final TransactionIdStore transactionIdStore = new SimpleTransactionIdStore( 2L, 0, BASE_TX_COMMIT_TIMESTAMP, 0, 0 );
    private CheckpointAppender checkpointAppender;
    private LogFiles logFiles;

    @BeforeEach
    void setUp() throws IOException
    {
        logFiles = buildLogFiles();
        life.add( logFiles );
        life.start();

        checkpointAppender = logFiles.getCheckpointFile().getCheckpointAppender();
    }

    @Test
    void detachedCheckpointAppenderUsedForSeparateCheckpointFiles()
    {
        assertThat( checkpointAppender ).isInstanceOf( DetachedCheckpointAppender.class );
    }

    @Test
    void failToWriteCheckpointOnUnhealthyDatabase()
    {
        databaseHealth.panic( new RuntimeException( "Panic" ) );

        LogPosition logPosition = new LogPosition( 0, 10 );
        assertThrows( IOException.class, () -> checkpointAppender.checkPoint( LogCheckPointEvent.NULL, logPosition, Instant.now(), "test" ) );
    }

    @Test
    void skipCheckpointOnAttemptToAppendCheckpointWhenNotStarted()
    {
        DetachedCheckpointAppender appender =
                new DetachedCheckpointAppender( mock( TransactionLogChannelAllocator.class ), mock( TransactionLogFilesContext.class, RETURNS_MOCKS ),
                        logFiles.getCheckpointFile(), NO_ROTATION );
        assertDoesNotThrow( () -> appender.checkPoint( LogCheckPointEvent.NULL, UNSPECIFIED, Instant.now(), "test" ) );
    }

    @Test
    void appendedCheckpointsCanBeLookedUpFromCheckpointFile() throws IOException
    {
        CheckpointFile checkpointFile = logFiles.getCheckpointFile();

        var logPosition1 = new LogPosition( 0, 10 );
        var logPosition2 = new LogPosition( 0, 20 );
        var logPosition3 = new LogPosition( 0, 30 );
        assertThat( checkpointFile.reachableCheckpoints() ).hasSize( 0 );
        checkpointAppender.checkPoint( LogCheckPointEvent.NULL, logPosition1, Instant.now(), "first" );
        checkpointAppender.checkPoint( LogCheckPointEvent.NULL, logPosition2, Instant.now(), "second" );
        checkpointAppender.checkPoint( LogCheckPointEvent.NULL, logPosition3, Instant.now(), "third" );

        var checkpoints = checkpointFile.reachableCheckpoints();
        assertThat( checkpoints ).hasSize( 3 );
        assertThat( checkpoints.get( 0 ) ).hasFieldOrPropertyWithValue( "transactionLogPosition", logPosition1 );
        assertThat( checkpoints.get( 1 ) ).hasFieldOrPropertyWithValue( "transactionLogPosition", logPosition2 );
        assertThat( checkpoints.get( 2 ) ).hasFieldOrPropertyWithValue( "transactionLogPosition", logPosition3 );
    }

    private LogFiles buildLogFiles() throws IOException
    {
        return LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withRotationThreshold( rotationThreshold )
                .withTransactionIdStore( transactionIdStore )
                .withDatabaseHealth( databaseHealth )
                .withLogVersionRepository( logVersionRepository )
                .withLogEntryReader( logEntryReader() )
                .withStoreId( StoreId.UNKNOWN )
                .build();
    }
}
