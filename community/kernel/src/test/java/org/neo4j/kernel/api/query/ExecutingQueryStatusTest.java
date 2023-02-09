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
package org.neo4j.kernel.api.query;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.neo4j.lock.ResourceType;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.lock.LockType.EXCLUSIVE;

class ExecutingQueryStatusTest
{
    private static final FakeClock clock = Clocks.fakeClock( ZonedDateTime.parse( "2016-12-16T16:14:12+01:00" ) );

    @Test
    void shouldProduceSensibleMapRepresentationInRunningState()
    {
        // when
        String status = SimpleState.running().name();

        // then
        assertEquals( "running", status );
    }

    @Test
    void shouldProduceSensibleMapRepresentationInPlanningState()
    {
        // when
        String status = SimpleState.planning().name();

        // then
        assertEquals( "planning", status );
    }

    @Test
    void shouldProduceSensibleMapRepresentationInPlannedState()
    {
        // when
        String status = SimpleState.planned().name();

        // then
        assertEquals( "planned", status );
    }

    @Test
    void shouldProduceSensibleMapRepresentationInParsingState()
    {
        // when
        String status = SimpleState.parsing().name();

        // then
        assertEquals( "parsing", status );
    }

    @Test
    void shouldProduceSensibleMapRepresentationInWaitingOnLockState()
    {
        // given
        long[] resourceIds = {17};
        long userTransactionId = 7;
        WaitingOnLock status =
                new WaitingOnLock(
                        EXCLUSIVE,
                        resourceType( "NODE" ),
                        userTransactionId,
                        resourceIds,
                        clock.nanos() );
        clock.forward( 17, TimeUnit.MILLISECONDS );

        // when
        Map<String,Object> statusMap = status.toMap( clock.nanos() );

        // then
        assertEquals( "waiting", status.name() );
        Map<String,Object> expected = new HashMap<>();
        expected.put( "waitTimeMillis", 17L );
        expected.put( "lockMode", "EXCLUSIVE" );
        expected.put( "resourceType", "NODE" );
        expected.put( "resourceIds", resourceIds );
        expected.put( "transactionId", userTransactionId );
        assertEquals( expected, statusMap );
    }

    private static ResourceType resourceType( String name )
    {
        return new ResourceType()
        {
            @Override
            public String toString()
            {
                return name();
            }

            @Override
            public int typeId()
            {
                throw new UnsupportedOperationException( "not used" );
            }

            @Override
            public String name()
            {
                return name;
            }
        };
    }
}
