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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

import org.neo4j.function.ThrowingAction;
import org.neo4j.graphdb.Resource;
import org.neo4j.test.Barrier;
import org.neo4j.test.Race;
import org.neo4j.test.extension.OtherThread;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.function.ThrowingAction.noop;
import static org.neo4j.test.Race.throwing;

class StoreCopyCheckPointMutexTest
{
    private static final ThrowingAction<IOException> ASSERT_NOT_CALLED = () -> fail( "Should not be called" );

    private final OtherThread t2 = new OtherThread();
    private final OtherThread t3 = new OtherThread();

    private final StoreCopyCheckPointMutex mutex = new StoreCopyCheckPointMutex();

    @BeforeEach
    void setUp()
    {
        t2.init( "T2" );
        t3.init( "T3" );
    }

    @AfterEach
    void tearDown()
    {
        t2.close();
        t3.close();
    }

    @Test
    void checkPointShouldBlockStoreCopy() throws Exception
    {
        // GIVEN
        try ( Resource lock = mutex.checkPoint() )
        {
            // WHEN
            t2.execute( () -> mutex.storeCopy( noop() ) );

            // THEN
            t2.get().waitUntilWaiting( details -> details.isAt( StoreCopyCheckPointMutex.class, "storeCopy" ) );
        }
    }

    @Test
    void checkPointShouldBlockAnotherCheckPoint() throws Exception
    {
        // GIVEN
        try ( Resource lock = mutex.checkPoint() )
        {
            // WHEN
            t2.execute( mutex::checkPoint );

            // THEN
            t2.get().waitUntilWaiting( details -> details.isAt( StoreCopyCheckPointMutex.class, "checkPoint" ) );
        }
    }

    @Test
    void storeCopyShouldBlockCheckPoint() throws Exception
    {
        // GIVEN
        try ( Resource lock = mutex.storeCopy( noop() ) )
        {
            // WHEN
            t2.execute( mutex::checkPoint );

            // THEN
            t2.get().waitUntilWaiting( details -> details.isAt( StoreCopyCheckPointMutex.class, "checkPoint" ) );
        }
    }

    @Test
    void storeCopyShouldHaveTryCheckPointBackOff() throws Exception
    {
        // GIVEN
        try ( Resource lock = mutex.storeCopy( noop() ) )
        {
            // WHEN
            assertNull( mutex.tryCheckPoint() );
        }
    }

    @Test
    void storeCopyShouldAllowAnotherStoreCopy() throws Exception
    {
        // GIVEN
        try ( Resource lock = mutex.storeCopy( noop() ) )
        {
            // WHEN
            try ( Resource otherLock = mutex.storeCopy( noop() ) )
            {
                // THEN good
            }
        }
    }

    @Test
    void storeCopyShouldAllowAnotherStoreCopyButOnlyFirstShouldPerformBeforeAction() throws Exception
    {
        // GIVEN
        @SuppressWarnings( "unchecked" )
        ThrowingAction<IOException> action = mock( ThrowingAction.class );
        try ( Resource lock = mutex.storeCopy( action ) )
        {
            verify( action ).apply();

            // WHEN
            try ( Resource otherLock = mutex.storeCopy( action ) )
            {
                // THEN good
                verify( action ).apply();
            }
        }
    }

    @Test
    void shouldHandleMultipleConcurrentStoreCopyWhenBeforeActionPerformsCheckPoint() throws Throwable
    {
        // GIVEN a check-point action which asserts calls to it along the way
        CheckPointingAction checkPointingAction = new CheckPointingAction( mutex );
        for ( int i = 0; i < 2; i++ )
        {
            // Start first store-copy and assert that the check-point action is triggered
            Resource firstLock = mutex.storeCopy( checkPointingAction );
            assertNotNull( checkPointingAction.lock );

            // A second store-copy starts while the first is still going
            Resource secondLock = mutex.storeCopy( checkPointingAction );

            // The first store-copy completes
            firstLock.close();

            // A third store-copy starts and completes
            Resource thirdLock = mutex.storeCopy( checkPointingAction );
            thirdLock.close();

            // Second store-copy completes
            secondLock.close();
            checkPointingAction.unlock();

            // Go another round, now that the check-point action has been reset.
            // Next round will assert that the mutex got the counting of store-copy jobs right
        }
    }

    @Test
    void shouldHandleMultipleConcurrentStoreCopyRequests() throws Throwable
    {
        // GIVEN
        Race race = new Race();
        CountingAction action = new CountingAction();
        int threads = Runtime.getRuntime().availableProcessors() * 10;
        race.addContestants( threads, throwing( () ->
        {
            parkARandomWhile();
            try ( Resource lock = mutex.storeCopy( action ) )
            {
                parkARandomWhile();
            }
        } ) );
        race.go();

        // THEN
        // It's hard to make predictions about what should have been seen. Most importantly is that
        // The lock doesn't hang any requests and that number of calls to the action less than number of threads
        assertThat( action.count() ).isLessThan( threads );
    }

    @Test
    void shouldPropagateStoreCopyActionFailureToOtherStoreCopyRequests() throws Exception
    {
        // GIVEN
        Barrier.Control barrier = new Barrier.Control();
        IOException controlledFailure = new IOException( "My own fault" );
        AtomicReference<Future<Object>> secondRequest = new AtomicReference<>();
        ThrowingAction<IOException> controllableAndFailingAction = () ->
        {
            // Now that we know we're first, start the second request...
            secondRequest.set( t3.execute( () -> mutex.storeCopy( ASSERT_NOT_CALLED ) ) );
            // ...and wait for it to reach its destination
            barrier.awaitUninterruptibly();
            try
            {
                // OK, second request has made progress into the request, so we can now produce our failure
                throw controlledFailure;
            }
            finally
            {
                barrier.release();
            }
        };

        Future<Object> firstRequest = t2.execute( () -> mutex.storeCopy( controllableAndFailingAction ) );
        while ( secondRequest.get() == null )
        {
            parkARandomWhile();
        }
        t3.get().waitUntilWaiting( details -> details.isAt( StoreCopyCheckPointMutex.class,
                "waitForFirstStoreCopyActionToComplete" ) );

        // WHEN
        barrier.reached();

        // THEN
        try
        {
            firstRequest.get();
        }
        catch ( ExecutionException e )
        {
            assertSame( controlledFailure, e.getCause() );
        }
        try
        {
            secondRequest.get().get();
        }
        catch ( ExecutionException e )
        {
            Throwable cooperativeActionFailure = e.getCause();
            assertThat( cooperativeActionFailure.getMessage() ).contains( "Co-operative" );
            assertSame( controlledFailure, cooperativeActionFailure.getCause() );
        }

        // WHEN afterwards trying another store-copy
        CountingAction action = new CountingAction();
        try ( Resource lock = mutex.storeCopy( action ) )
        {
            // THEN
            assertEquals( 1, action.count() );
        }
    }

    private static void parkARandomWhile()
    {
        LockSupport.parkNanos( MILLISECONDS.toNanos( ThreadLocalRandom.current().nextInt( 10 ) ) );
    }

    private static class CheckPointingAction implements ThrowingAction<IOException>
    {
        private final StoreCopyCheckPointMutex mutex;
        private Resource lock;

        CheckPointingAction( StoreCopyCheckPointMutex mutex )
        {
            this.mutex = mutex;
        }

        @Override
        public void apply()
        {
            assertNull( lock );
            lock = mutex.checkPoint();
        }

        void unlock()
        {
            assertNotNull( lock );
            lock.close();
            lock = null;
        }
    }

    private static class CountingAction implements ThrowingAction<IOException>
    {
        private final AtomicInteger count = new AtomicInteger();

        @Override
        public void apply()
        {
            parkARandomWhile();
            count.incrementAndGet();
        }

        int count()
        {
            return count.get();
        }
    }
}
