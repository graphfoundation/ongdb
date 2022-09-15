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
package org.neo4j.internal.batchimport;

import java.util.concurrent.TimeUnit;

import org.neo4j.internal.batchimport.stats.DetailLevel;
import org.neo4j.internal.batchimport.stats.Stat;

import static java.lang.System.nanoTime;
import static org.neo4j.io.ByteUnit.bytesToString;

/**
 * {@link Stat} that provides a simple Mb/s stat, mostly used for getting an insight into I/O throughput.
 */
public class IoThroughputStat implements Stat
{
    private final long startTime;
    private final long endTime;
    private final long position;

    public IoThroughputStat( long startTime, long endTime, long position )
    {
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
    }

    @Override
    public DetailLevel detailLevel()
    {
        return DetailLevel.IMPORTANT;
    }

    @Override
    public long asLong()
    {
        long endTime = this.endTime != 0 ? this.endTime : nanoTime();
        long totalTime = endTime - startTime;
        int seconds = (int) TimeUnit.NANOSECONDS.toSeconds( totalTime );
        return seconds > 0 ? position / seconds : -1;
    }

    @Override
    public String toString()
    {
        long stat = asLong();
        return stat == -1 ? "??" : bytesToString( stat ) + "/s";
    }
}
