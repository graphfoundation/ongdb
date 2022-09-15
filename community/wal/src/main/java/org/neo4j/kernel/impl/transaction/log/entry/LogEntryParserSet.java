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

import org.eclipse.collections.impl.map.mutable.primitive.ByteObjectHashMap;

import org.neo4j.kernel.KernelVersion;
import org.neo4j.storageengine.api.CommandReader;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.util.Preconditions;

/**
 * Set of log entry parsers for a specific version/layout of these entries. Typically such a set contains parsers for log entries such as:
 * START, COMMAND, COMMIT and CHECKPOINT (see {@link LogEntryTypeCodes}, where each such type maps to a specific parser.
 * Versioning of commands (see {@link CommandReaderFactory} should be detached from versions of this set.
 *
 * Sitting at the top of the log entry chain it's about time to explain the general architecture around log entry reading and justify its complications.
 * Guided by how the format itself looks in the log, we use this as the basis for the reasoning:
 * <pre>
 *     ONE LOG ENTRY: [VERSION][TYPE][DATA]
 *     VERSION: 1B version of the log entry, the {@link KernelVersion}
 *     TYPE: 1B log entry type, specifying one of START, COMMAND, COMMIT, CHECKPOINT a.s.o.
 *     DATA: For everything except COMMAND this contains data relevant to the log entry, e.g. COMMIT contains timestamp and transaction id etc.
 * </pre>
 * If TYPE==COMMAND then DATA is storage-specific command data, resulting in one {@link StorageCommand} upon loading it.
 * Historically the version of the log entry has been used to describe even this command version, and so the log entry version had to be bumped
 * for every new version of the, at the time, single storage engine command set. This coupling made it hard to introduce other command sets,
 * i.e. for other storage engines.
 *
 * The change to support this, without breaking backwards compatibility is to fixate the current log entry VERSION as _just_ the log entry version,
 * not the command version. Also since the single storage engine didn't have versioning for its commands that particular implementation needs to
 * accommodate detecting if the first byte read as part of the command, which is the type of command, holds additional version information
 * (either version marker so that the next byte would hold more information) or the version itself somehow. And later versions would have to write
 * this information as part of the type byte for every command. New storage engines can simply start by writing both version and type information
 * first in each command, which ever way they like. New structure for COMMAND:
 * <pre>
 *     ONE COMMAND LOG ENTRY: [VERSION][TYPE][COMMAND_VERSION][COMMAND_TYPE][COMMAND_DATA]
 *                               ▲       ▲     ◄──────────┬────────────────────────────►
 *                               │       │                │
 *                               │       │                │
 *                               │       │                └──── {@link CommandReaderFactory}/{@link CommandReader}
 *                               │       └───────────────────── {@link LogEntryParserSet}
 *                               └───────────────────────────── {@link KernelVersion}
 * </pre>
 */
public abstract class LogEntryParserSet
{
    private final KernelVersion introductionVersion;
    private final ByteObjectHashMap<LogEntryParser> parsers = new ByteObjectHashMap<>();

    LogEntryParserSet( KernelVersion version )
    {
        this.introductionVersion = version;
    }

    /**
     * Selects the correct log entry parser for the specific type, for type codes see {@link LogEntryTypeCodes}.
     * @param type type code for the log entry to parse.
     * @return parser able to read and parse log entry of this type.
     */
    public LogEntryParser select( byte type )
    {
        LogEntryParser parser = parsers.get( type );
        if ( parser == null )
        {
            throw new IllegalArgumentException( "Unknown entry type " + type + " for version " + introductionVersion );
        }
        return parser;
    }

    protected void register( LogEntryParser parser )
    {
        byte type = parser.type();
        Preconditions.checkState( !parsers.containsKey( type ), "Already registered parser for type " + type );
        parsers.put( type, parser );
    }

    public KernelVersion getIntroductionVersion()
    {
        return introductionVersion;
    }
}
