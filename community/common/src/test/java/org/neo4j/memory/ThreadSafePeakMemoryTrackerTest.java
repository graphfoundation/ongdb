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
package org.neo4j.memory;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadSafePeakMemoryTrackerTest
{
    @Test
    void shouldRegisterConcurrentAllocationsAndDeallocations() throws InterruptedException
    {
        // given
        ThreadSafePeakMemoryTracker tracker = new ThreadSafePeakMemoryTracker();
        ExecutorService executorService = Executors.newFixedThreadPool( 10 );
        for ( int t = 0; t < 10; t++ )
        {
            executorService.submit( () ->
            {
                for ( int i = 1; i < 100; i++ )
                {
                    tracker.allocateNative( i );
                    assertThat( tracker.usedNativeMemory() ).isGreaterThan( 0L );
                }
                for ( int i = 1; i < 100; i++ )
                {
                    assertThat( tracker.usedNativeMemory() ).isGreaterThan( 0L );
                    tracker.releaseNative( i );
                }
            } );
        }

        // when
        executorService.shutdown();
        executorService.awaitTermination( 10, TimeUnit.MINUTES );

        // then
        assertEquals( 0, tracker.usedNativeMemory() );
    }

    @Test
    void shouldRegisterPeakMemoryUsage() throws InterruptedException
    {
        // given
        ThreadSafePeakMemoryTracker tracker = new ThreadSafePeakMemoryTracker();
        int threads = 200;
        long[] allocations = new long[threads];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        long sum = 0;
        for ( int i = 0; i < allocations.length; i++ )
        {
            allocations[i] = random.nextInt( 1, 10_000 );
            sum += allocations[i];
        }

        // when
        ExecutorService executorService = Executors.newFixedThreadPool( threads );
        for ( int i = 0; i < threads; i++ )
        {
            int id = i;
            executorService.submit( () -> tracker.allocateNative( allocations[id] ) );
        }
        executorService.shutdown();
        executorService.awaitTermination( 10, TimeUnit.MINUTES );

        long peakAfterAllocation = tracker.peakMemoryUsage();
        LongStream.of( allocations ).forEach( tracker::releaseNative );
        long peakAfterDeallocation = tracker.peakMemoryUsage();
        LongStream.of( allocations ).forEach( tracker::allocateNative );
        tracker.allocateNative( 10 ); // <-- 10 more than previous peak
        long peakAfterHigherReallocation = tracker.peakMemoryUsage();
        LongStream.of( allocations ).forEach( tracker::releaseNative );
        tracker.releaseNative( 10 );
        long peakAfterFinalDeallocation = tracker.peakMemoryUsage();

        // then
        assertEquals( sum, peakAfterAllocation );
        assertEquals( sum, peakAfterDeallocation );
        assertEquals( sum + 10, peakAfterHigherReallocation );
        assertEquals( sum + 10, peakAfterFinalDeallocation );
    }
}
