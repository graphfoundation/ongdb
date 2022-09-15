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

import org.apache.commons.lang3.mutable.MutableLong;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StopwatchTest
{
    private MutableLong time = new MutableLong();
    private Stopwatch stopwatch = new Stopwatch( time::longValue );

    @Test
    void tick()
    {
        assertEquals( 0, stopwatch.elapsed( TimeUnit.NANOSECONDS ) );
        time.add( 3 );
        assertEquals( 3, stopwatch.elapsed( TimeUnit.NANOSECONDS ) );
    }

    @Test
    void testTimeout()
    {
        Duration timeout = Duration.ofNanos( 10 );
        assertFalse( stopwatch.hasTimedOut( timeout ) );
        time.add( 5 );
        assertFalse( stopwatch.hasTimedOut( timeout ) );
        time.add( 5 );
        assertTrue( stopwatch.hasTimedOut( timeout ) );
    }
}
