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
package org.neo4j.kernel.impl.transaction.log.entry;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.api.TestCommand;
import org.neo4j.kernel.impl.api.TestCommandReaderFactory;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.storageengine.api.CommandReaderFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.kernel.KernelVersion.LATEST;
import static org.neo4j.kernel.impl.transaction.log.entry.LogEntryParserSets.parserSet;
import static org.neo4j.kernel.impl.transaction.log.entry.LogEntryTypeCodes.LEGACY_CHECK_POINT;

class LogEntryParserDispatcherV6Test
{
    private final KernelVersion version = LATEST;
    private final CommandReaderFactory commandReader = new TestCommandReaderFactory();
    private final LogPositionMarker marker = new LogPositionMarker();
    private final LogPosition position = new LogPosition( 0, 25 );

    @Test
    void shouldParserStartEntry() throws IOException
    {
        // given
        final LogEntryStart start = new LogEntryStart( version, 1, 2, 3, new byte[]{4}, position );
        final InMemoryClosableChannel channel = new InMemoryClosableChannel();

        channel.putLong( start.getTimeWritten() );
        channel.putLong( start.getLastCommittedTxWhenTransactionStarted() );
        channel.putInt( start.getPreviousChecksum() );
        channel.putInt( start.getAdditionalHeader().length );
        channel.put( start.getAdditionalHeader(), start.getAdditionalHeader().length );

        channel.getCurrentPosition( marker );

        // when
        final LogEntryParser parser = parserSet( LATEST ).select( LogEntryTypeCodes.TX_START );
        final LogEntry logEntry = parser.parse( version, channel, marker, commandReader );

        // then
        assertEquals( start, logEntry );
    }

    @Test
    void shouldParserOnePhaseCommitEntry() throws IOException
    {
        // given
        final LogEntryCommit commit = new LogEntryCommit( version, 42, 21, -668317999 );
        final InMemoryClosableChannel channel = new InMemoryClosableChannel();

        channel.putLong( commit.getTxId() );
        channel.putLong( commit.getTimeWritten() );
        channel.putChecksum();

        channel.getCurrentPosition( marker );

        // when
        final LogEntryParser parser = parserSet( LATEST ).select( LogEntryTypeCodes.TX_COMMIT );
        final LogEntry logEntry = parser.parse( version, channel, marker, commandReader );

        // then
        assertEquals( commit, logEntry );
    }

    @Test
    void shouldParserCommandsUsingAGivenFactory() throws IOException
    {
        // given
        // The record, it will be used as before and after
        TestCommand testCommand = new TestCommand( new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9} );
        final LogEntryCommand command = new LogEntryCommand( version, testCommand );
        final InMemoryClosableChannel channel = new InMemoryClosableChannel();
        testCommand.serialize( channel );
        channel.getCurrentPosition( marker );

        // when
        final LogEntryParser parser = parserSet( LATEST ).select( LogEntryTypeCodes.COMMAND );
        final LogEntry logEntry = parser.parse( version, channel, marker, commandReader );

        // then
        assertEquals( command, logEntry );
    }

    @Test
    void parseLegacyCheckPointEntry() throws IOException
    {
        // given
        final LogEntryInlinedCheckPoint checkPoint = new LogEntryInlinedCheckPoint( KernelVersion.V4_0, new LogPosition( 43, 44 ) );
        final InMemoryClosableChannel channel = new InMemoryClosableChannel();

        channel.putLong( checkPoint.getLogPosition().getLogVersion() );
        channel.putLong( checkPoint.getLogPosition().getByteOffset() );
        channel.putChecksum();

        channel.getCurrentPosition( marker );

        // when
        final LogEntryParser parser = new LogEntryParserSetV4_0().select( LEGACY_CHECK_POINT );
        final LogEntry logEntry = parser.parse( KernelVersion.V4_0, channel, marker, commandReader );

        // then
        assertEquals( checkPoint, logEntry );
    }

    @Test
    void failToParseCheckpointWithLatestFormat()
    {
        var checkPoint = new LogEntryInlinedCheckPoint( version, new LogPosition( 43, 44 ) );
        var channel = new InMemoryClosableChannel();

        channel.putLong( checkPoint.getLogPosition().getLogVersion() );
        channel.putLong( checkPoint.getLogPosition().getByteOffset() );
        channel.putChecksum();

        channel.getCurrentPosition( marker );
        assertThrows( Exception.class, () -> parserSet( LATEST ).select( LEGACY_CHECK_POINT ) );
    }

    @Test
    void shouldThrowWhenParsingUnknownEntry()
    {
        assertThrows( IllegalArgumentException.class, () -> parserSet( LATEST ).select( (byte) 42 ) ); // unused, at lest for now
    }
}
