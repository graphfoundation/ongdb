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

import java.io.IOException;
import java.nio.file.Path;
import java.time.Clock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.neo4j.kernel.impl.transaction.log.LogFileInformation;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;

public final class EntryTimespanThreshold implements Threshold
{
    private final long timeToKeepInMillis;
    private final Clock clock;
    private final TimeUnit timeUnit;
    private final Log log;
    private long lowerLimit;

    EntryTimespanThreshold( LogProvider logProvider, Clock clock, TimeUnit timeUnit, long timeToKeep )
    {
        this.log = logProvider.getLog( getClass() );
        this.clock = clock;
        this.timeUnit = timeUnit;
        this.timeToKeepInMillis = timeUnit.toMillis( timeToKeep );
    }

    @Override
    public void init()
    {
        lowerLimit = clock.millis() - timeToKeepInMillis;
    }

    @Override
    public boolean reached( Path file, long version, LogFileInformation source )
    {
        try
        {
            long firstStartRecordTimestamp = source.getFirstStartRecordTimestamp( version );
            return firstStartRecordTimestamp >= 0 && firstStartRecordTimestamp < lowerLimit;
        }
        catch ( IOException e )
        {
            log.warn( "Fail to get timestamp info from transaction log file " + version, e );
            return false;
        }
    }

    @Override
    public String toString()
    {
        return timeUnit.convert( timeToKeepInMillis, TimeUnit.MILLISECONDS ) + " " + timeUnit.name().toLowerCase( Locale.ROOT );
    }
}
