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
package org.neo4j.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class SystemNanoClock extends Clock
{
    static final SystemNanoClock INSTANCE = new SystemNanoClock();

    protected SystemNanoClock()
    {
        // please use shared instance
    }

    @Override
    public ZoneId getZone()
    {
        return ZoneOffset.UTC;
    }

    @Override
    public Clock withZone( ZoneId zone )
    {
        return Clock.system( zone ); // the users of this method do not need a NanoClock
    }

    @Override
    public Instant instant()
    {
        return Instant.ofEpochMilli( millis() );
    }

    @Override
    public long millis()
    {
        return System.currentTimeMillis();
    }

    /**
     * It is <em>only</em> useful for comparing values returned from the same clock, as the wall clock time of this method is arbitrary.
     *
     * @return current nano time of the system.
     */
    public long nanos()
    {
        return System.nanoTime();
    }

    public Stopwatch startStopWatch()
    {
        return new Stopwatch( System::nanoTime );
    }
}
