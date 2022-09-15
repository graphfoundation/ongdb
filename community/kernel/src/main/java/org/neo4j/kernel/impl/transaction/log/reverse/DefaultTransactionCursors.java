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
package org.neo4j.kernel.impl.transaction.log.reverse;

import java.io.IOException;
import java.util.Optional;

import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionCursor;
import org.neo4j.kernel.impl.transaction.log.ReadAheadLogChannel;
import org.neo4j.kernel.impl.transaction.log.ReadableLogChannel;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;

import static org.neo4j.kernel.impl.transaction.log.LogVersionBridge.NO_MORE_CHANNELS;
import static org.neo4j.kernel.impl.transaction.log.reverse.EagerlyReversedTransactionCursor.eagerlyReverse;

public class DefaultTransactionCursors implements TransactionCursors
{

    private final LogFile logFile;
    private final LogPosition beginning;
    private final LogEntryReader reader;
    private final boolean failOnCorruptedLogFiles;
    private final ReversedTransactionCursorMonitor monitor;
    private long currentVersion;

    public DefaultTransactionCursors(
            LogFile logFile, LogPosition beginning, LogEntryReader reader, boolean failOnCorruptedLogFiles, ReversedTransactionCursorMonitor monitor )
    {
        this.logFile = logFile;
        this.beginning = beginning;
        this.reader = reader;
        this.failOnCorruptedLogFiles = failOnCorruptedLogFiles;
        this.monitor = monitor;
        this.currentVersion = logFile.getHighestLogVersion();
    }

    @Override
    public Optional<TransactionCursor> next()
    {
        if ( currentVersion < beginning.getLogVersion() )
        {
            return Optional.empty();
        }

        try
        {
            LogPosition position = currentVersion > beginning.getLogVersion() ? logFile.extractHeader( currentVersion ).getStartPosition() : beginning;
            TransactionCursor cursor = createCursor( logFile.getReader( position, NO_MORE_CHANNELS ) );
            currentVersion--;
            return Optional.of( cursor );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    private TransactionCursor createCursor( ReadableLogChannel channel ) throws IOException
    {
        if ( channel instanceof ReadAheadLogChannel )
        {
            return new ReversedSingleFileTransactionCursor( (ReadAheadLogChannel) channel, reader, failOnCorruptedLogFiles, monitor );
        }
        return eagerlyReverse( new PhysicalTransactionCursor( channel, reader ) );
    }

    @Override
    public void close() throws IOException
    {
        //Nothing to close
    }
}
