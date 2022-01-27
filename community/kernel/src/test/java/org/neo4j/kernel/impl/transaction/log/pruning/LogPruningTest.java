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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.locks.ReentrantLock;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.checkpoint.CheckpointFile;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogAssertions;
import org.neo4j.time.SystemNanoClock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.checkpoint_logical_log_keep_threshold;
import static org.neo4j.logging.AssertableLogProvider.Level.INFO;

class LogPruningTest
{
    private final Config config = Config.defaults();
    private FileSystemAbstraction fs;
    private LogFiles logFiles;
    private AssertableLogProvider logProvider;
    private SystemNanoClock clock;
    private LogPruneStrategyFactory factory;

    @BeforeEach
    void setUp()
    {
        fs = mock( FileSystemAbstraction.class );
        logFiles = mock( LogFiles.class );
        LogFile logFile = mock( LogFile.class );
        when( logFiles.getLogFile() ).thenReturn( logFile );
        when( logFiles.getCheckpointFile() ).thenReturn( mock( CheckpointFile.class ) );
        doAnswer( inv -> Path.of( String.valueOf( inv.getArguments()[0] ) ) )
                .when( logFile ).getLogFileForVersion( anyLong() );
        logProvider = new AssertableLogProvider();
        clock = mock( SystemNanoClock.class );
        factory = mock( LogPruneStrategyFactory.class );
    }

    @Test
    void mustDeleteLogFilesThatCanBePruned() throws IOException
    {
        when( factory.strategyFromConfigValue( eq( fs ), eq( logFiles ), eq( logProvider ), eq( clock ), anyString() ) )
                .thenReturn( upTo -> LongRange.range( 3, upTo - 1 ) );
        LogPruning pruning = new LogPruningImpl( fs, logFiles, logProvider, factory, clock, config, new ReentrantLock() );
        pruning.pruneLogs( 5 );
        InOrder order = inOrder( fs );
        order.verify( fs ).deleteFile( Path.of( "3" ) );
        order.verify( fs ).deleteFile( Path.of( "4" ) );
        // Log file 5 is not deleted; it's the lowest version expected to remain after pruning.
        verifyNoMoreInteractions( fs );
    }

    @Test
    void mustHaveLogFilesToPruneIfStrategyFindsFiles()
    {
        when( factory.strategyFromConfigValue( eq( fs ), eq( logFiles ), eq( logProvider ), eq( clock ), anyString() ) )
                .thenReturn( upTo -> LongRange.range( 3, upTo ) );
        when( logFiles.getLogFile().getHighestLogVersion() ).thenReturn( 4L );
        LogPruning pruning = new LogPruningImpl( fs, logFiles, logProvider, factory, clock, config, new ReentrantLock() );
        assertTrue( pruning.mightHaveLogsToPrune( logFiles.getLogFile().getHighestLogVersion() ) );
    }

    @Test
    void mustNotHaveLogsFilesToPruneIfStrategyFindsNoFiles()
    {
        when( factory.strategyFromConfigValue( eq( fs ), eq( logFiles ), eq( logProvider ), eq( clock ), anyString() ) )
                .thenReturn( x -> LongRange.EMPTY_RANGE );
        LogPruning pruning = new LogPruningImpl( fs, logFiles, logProvider, factory, clock, config, new ReentrantLock() );
        assertFalse( pruning.mightHaveLogsToPrune( logFiles.getLogFile().getHighestLogVersion() ) );
    }

    @Test
    void mustDescribeCurrentStrategy()
    {
        factory = new LogPruneStrategyFactory();
        config.setDynamic( GraphDatabaseSettings.keep_logical_logs, "keep_all", "" );
        LogPruning pruning = new LogPruningImpl( fs, logFiles, logProvider, factory, clock, config, new ReentrantLock() );
        assertEquals( "keep_all", pruning.describeCurrentStrategy() );
        config.setDynamic( GraphDatabaseSettings.keep_logical_logs, "10 files", "" );
        assertEquals( "10 files", pruning.describeCurrentStrategy() );
    }

    @Test
    void mustLogLatestPreservedCheckpointVersion() throws IOException
    {
        // given
        when( factory.strategyFromConfigValue( eq( fs ), eq( logFiles ), eq( logProvider ), eq( clock ), anyString() ) )
                .thenReturn( x -> LongRange.EMPTY_RANGE );
        int checkpointLogFilesToKeep = config.get( checkpoint_logical_log_keep_threshold );
        CheckpointFile checkpointFile = mock( CheckpointFile.class );
        Path[] checkpointFiles = new Path[checkpointLogFilesToKeep + 2];
        for ( int i = 0; i < checkpointFiles.length; i++ )
        {
            checkpointFiles[i] = Paths.get( String.valueOf( i ) );
        }
        when( checkpointFile.getDetachedCheckpointFiles() ).thenReturn( checkpointFiles );
        when( checkpointFile.getDetachedCheckpointLogFileVersion( any() ) ).thenAnswer( invocationOnMock ->
        {
            Path file = invocationOnMock.getArgument( 0 );
            return Long.parseLong( file.getFileName().toString() );
        } );
        when( checkpointFile.getCurrentDetachedLogVersion() ).thenReturn( (long) checkpointFiles.length - 1 );
        when( logFiles.getCheckpointFile() ).thenReturn( checkpointFile );

        // when
        LogPruning pruning = new LogPruningImpl( fs, logFiles, logProvider, factory, clock, config, new ReentrantLock() );
        pruning.pruneLogs( 1 );

        // then
        verify( fs ).deleteFile( checkpointFiles[0] );
        verify( fs ).deleteFile( checkpointFiles[1] );
        LogAssertions.assertThat( logProvider ).forLevel( INFO ).forClass( LogPruningImpl.class ).containsMessages(
                "Pruned 2 checkpoint log files. Lowest preserved version: 2" );
    }
}
