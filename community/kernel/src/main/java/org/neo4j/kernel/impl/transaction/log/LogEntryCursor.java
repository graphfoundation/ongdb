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

import java.io.IOException;

import org.neo4j.cursor.IOCursor;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntry;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;

/**
 * {@link IOCursor} abstraction on top of a {@link LogEntryReader}
 */
public class LogEntryCursor implements IOCursor<LogEntry>
{
    private final LogEntryReader logEntryReader;
    private final ReadableClosablePositionAwareChecksumChannel channel;
    private final LogPositionMarker position = new LogPositionMarker();
    private LogEntry entry;

    public LogEntryCursor( LogEntryReader logEntryReader, ReadableClosablePositionAwareChecksumChannel channel )
    {
        this.logEntryReader = logEntryReader;
        this.channel = channel;
    }

    @Override
    public LogEntry get()
    {
        return entry;
    }

    @Override
    public boolean next() throws IOException
    {
        entry = logEntryReader.readLogEntry( channel );

        return entry != null;
    }

    @Override
    public void close() throws IOException
    {
        channel.close();
    }

    /**
     * Reading {@link LogEntry log entries} may have the source move over physically multiple log files.
     * This accessor returns the log version of the most recent call to {@link #next()}.
     *
     * @return the log version of the most recent {@link LogEntry} returned from {@link #next().
     */
    public long getCurrentLogVersion() throws IOException
    {
        channel.getCurrentPosition( position );
        return position.getLogVersion();
    }
}
