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
package org.neo4j.io.pagecache.impl.muninn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.IntFunction;
import java.util.stream.Stream;

import org.neo4j.internal.unsafe.UnsafeUtil;
import org.neo4j.io.mem.MemoryAllocator;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.tracing.DummyPageSwapper;
import org.neo4j.io.pagecache.tracing.EvictionEvent;
import org.neo4j.io.pagecache.tracing.EvictionRunEvent;
import org.neo4j.io.pagecache.tracing.FlushEvent;
import org.neo4j.io.pagecache.tracing.PageFaultEvent;
import org.neo4j.io.pagecache.tracing.PageReferenceTranslator;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.test.scheduler.DaemonThreadFactory;
import org.neo4j.util.concurrent.Futures;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.neo4j.io.ByteUnit.MebiByte;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

public class PageListTest
{
    private static final int ALIGNMENT = 8;
    private static final Duration TIMEOUT = Duration.ofMinutes( 1 );

    private static final int[] pageIds = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final DummyPageSwapper DUMMY_SWAPPER = new DummyPageSwapper( "", UnsafeUtil.pageSize() );

    private static Stream<Arguments> argumentsProvider()
    {
        IntFunction<Arguments> toArguments = Arguments::of;
        return Arrays.stream( pageIds ).mapToObj( toArguments );
    }

    private static ExecutorService executor;
    private static MemoryAllocator mman;

    @BeforeAll
    public static void setUpStatics()
    {
        executor = Executors.newCachedThreadPool( new DaemonThreadFactory() );
        mman = MemoryAllocator.createAllocator( MebiByte.toBytes( 1 ), EmptyMemoryTracker.INSTANCE );
    }

    @AfterAll
    public static void tearDownStatics()
    {
        mman.close();
        mman = null;
        executor.shutdown();
        executor = null;
    }

    private int prevPageId;
    private int nextPageId;
    private long pageRef;
    private long prevPageRef;
    private long nextPageRef;
    private int pageSize;
    private SwapperSet swappers;
    private PageList pageList;

    private void init( int pageId )
    {
        prevPageId = pageId == 0 ? pageIds.length - 1 : (pageId - 1) % pageIds.length;
        nextPageId = (pageId + 1) % pageIds.length;
        pageSize = UnsafeUtil.pageSize();

        swappers = new SwapperSet();
        long victimPage = VictimPageReference.getVictimPage( pageSize, INSTANCE );
        pageList = new PageList( pageIds.length, pageSize, mman, swappers, victimPage, ALIGNMENT );
        pageRef = pageList.deref( pageId );
        prevPageRef = pageList.deref( prevPageId );
        nextPageRef = pageList.deref( nextPageId );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void mustExposePageCount( int pageId )
    {
        init( pageId );

        int pageCount;
        long victimPage = VictimPageReference.getVictimPage( pageSize, INSTANCE );

        pageCount = 3;
        assertThat( new PageList( pageCount, pageSize, mman, swappers, victimPage, ALIGNMENT ).getPageCount() ).isEqualTo( pageCount );

        pageCount = 42;
        assertThat( new PageList( pageCount, pageSize, mman, swappers, victimPage, ALIGNMENT ).getPageCount() ).isEqualTo( pageCount );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void mustBeAbleToReversePageRedToPageId( int pageId )
    {
        init( pageId );

        assertThat( pageList.toId( pageRef ) ).isEqualTo( pageId );
    }

    // xxx ---[ Sequence lock tests ]---

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pagesAreInitiallyExclusivelyLocked( int pageId )
    {
        init( pageId );

        assertTrue( PageList.isExclusivelyLocked( pageRef ) );
        PageList.unlockExclusive( pageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedOptimisticLockMustValidate( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long stamp = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, stamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void mustNotValidateRandomStamp( int pageId )
    {
        init( pageId );

        assertFalse( PageList.validateReadLock( pageRef, 4242 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockMustInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.unlockWrite( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void takingWriteLockMustInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.tryWriteLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustNotValidateUnderWriteLock( int pageId )
    {
        init( pageId );

        PageList.tryWriteLock( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockReleaseMustInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.unlockWrite( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedWriteLockMustBeAvailable( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedOptimisticReadLockMustValidateAfterWriteLockRelease( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.unlockWrite( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLocksMustNotBlockOtherWriteLocks( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            PageList.unlockExclusive( pageRef );
            assertTrue( PageList.tryWriteLock( pageRef ) );
            assertTrue( PageList.tryWriteLock( pageRef ) );
        });
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLocksMustNotBlockOtherWriteLocksInOtherThreads( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            PageList.unlockExclusive( pageRef );
            int threads = 10;
            CountDownLatch end = new CountDownLatch( threads );
            Runnable runnable = () ->
            {
                assertTrue( PageList.tryWriteLock( pageRef ) );
                end.countDown();
            };
            List<Future<?>> futures = new ArrayList<>();
            for ( int i = 0; i < threads; i++ )
            {
                futures.add( executor.submit( runnable ) );
            }
            end.await();
            Futures.getAll( futures );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unmatchedUnlockWriteLockMustThrow( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
                PageList.unlockWrite( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockCountOverflowMustThrow( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
            assertTimeoutPreemptively( TIMEOUT, () ->
            {
                PageList.unlockExclusive( pageRef );
                //noinspection InfiniteLoopStatement
                for ( ; ; )
                {
                    assertTrue( PageList.tryWriteLock( pageRef ) );
                }
            } ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustInvalidateOptimisticLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.tryExclusiveLock( pageRef );
        PageList.unlockExclusive( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void takingExclusiveLockMustInvalidateOptimisticLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.tryExclusiveLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustNotValidateUnderExclusiveLock( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockReleaseMustInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.unlockExclusive( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedOptimisticReadLockMustValidateAfterExclusiveLockRelease( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryExclusiveLock( pageRef );
        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void canTakeUncontendedExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLocksMustFailExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void concurrentWriteLocksMustFailExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.unlockWrite( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustBeAvailableAfterWriteLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void cannotTakeExclusiveLockIfAlreadyTaken( int pageId )
    {
        init( pageId );

        // existing exclusive lock implied by constructor
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustBeAvailableAfterExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustFailWriteLocks( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            // exclusive lock implied by constructor
            assertFalse( PageList.tryWriteLock( pageRef ) );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unmatchedUnlockExclusiveLockMustThrow( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.unlockExclusive( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unmatchedUnlockWriteAfterTakingExclusiveLockMustThrow( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.tryExclusiveLock( pageRef );
            PageList.unlockWrite( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockMustBeAvailableAfterExclusiveLock( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.tryExclusiveLock( pageRef );
            PageList.unlockExclusive( pageRef );
            assertTrue( PageList.tryWriteLock( pageRef ) );
            PageList.unlockWrite( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveMustReturnStampForOptimisticReadLock( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        long r = PageList.unlockExclusive( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveAndTakeWriteLockMustInvalidateOptimisticReadLocks( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveAndTakeWriteLockMustPreventExclusiveLocks( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveAndTakeWriteLockMustAllowConcurrentWriteLocks( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            // exclusive lock implied by constructor
            PageList.unlockExclusiveAndTakeWriteLock( pageRef );
            assertTrue( PageList.tryWriteLock( pageRef ) );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveAndTakeWriteLockMustBeAtomic( int pageId )
    {
        init( pageId );

        assertTimeoutPreemptively( TIMEOUT, () ->
        {
            // exclusive lock implied by constructor
            int threads = Runtime.getRuntime().availableProcessors() - 1;
            CountDownLatch start = new CountDownLatch( threads );
            AtomicBoolean stop = new AtomicBoolean();
            PageList.tryExclusiveLock( pageRef );
            Runnable runnable = () ->
            {
                while ( !stop.get() )
                {
                    if ( PageList.tryExclusiveLock( pageRef ) )
                    {
                        PageList.unlockExclusive( pageRef );
                        throw new RuntimeException( "I should not have gotten that lock" );
                    }
                    start.countDown();
                }
            };

            List<Future<?>> futures = new ArrayList<>();
            for ( int i = 0; i < threads; i++ )
            {
                futures.add( executor.submit( runnable ) );
            }

            start.await();
            PageList.unlockExclusiveAndTakeWriteLock( pageRef );
            stop.set( true );
            Futures.getAll( futures );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void stampFromUnlockExclusiveMustNotBeValidIfThereAreWriteLocks( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        long r = PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        assertFalse( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedFlushLockMustBeAvailable( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockMustNotInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockMustNotFailWriteLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryFlushLock( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockMustFailExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryFlushLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void cannotTakeFlushLockIfAlreadyTaken( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
        assertFalse( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockMustNotFailFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustFailFlushLock( int pageId )
    {
        init( pageId );

        // exclusively locked from constructor
        assertFalse( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockExclusiveAndTakeWriteLockMustNotFailFlushLock( int pageId )
    {
        init( pageId );

        // exclusively locked from constructor
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushUnlockMustNotInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustValidateUnderFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryFlushLock( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockReleaseMustNotInvalidateOptimisticReadLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        long r = PageList.tryOptimisticReadLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unmatchedUnlockFlushMustThrow( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
            PageList.unlockFlush( pageRef, PageList.tryOptimisticReadLock( pageRef ), true ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedOptimisticReadLockMustBeAvailableAfterFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedWriteLockMustBeAvailableAfterFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.tryWriteLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedExclusiveLockMustBeAvailableAfterFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedFlushLockMustBeAvailableAfterWriteLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryWriteLock( pageRef );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedFlushLockMustBeAvailableAfterExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.tryExclusiveLock( pageRef );
        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void uncontendedFlushLockMustBeAvailableAfterFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.tryFlushLock( pageRef ) != 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void stampFromUnlockExclusiveMustBeValidUnderFlushLock( int pageId )
    {
        init( pageId );

        // exclusively locked from constructor
        long r = PageList.unlockExclusive( pageRef );
        PageList.tryFlushLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustNotGetInterferenceFromAdjacentWriteLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryWriteLock( prevPageRef ) );
        assertTrue( PageList.tryWriteLock( nextPageRef ) );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( nextPageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustNotGetInterferenceFromAdjacentExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void optimisticReadLockMustNotGetInterferenceFromAdjacentExclusiveAndWriteLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        long r = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
        PageList.unlockExclusiveAndTakeWriteLock( prevPageRef );
        PageList.unlockExclusiveAndTakeWriteLock( nextPageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( nextPageRef );
        assertTrue( PageList.validateReadLock( pageRef, r ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockMustNotGetInterferenceFromAdjacentExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockMustNotGetInterferenceFromAdjacentExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        long s;
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        assertTrue( (s = PageList.tryFlushLock( pageRef )) != 0 );
        PageList.unlockFlush( pageRef, s, true );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void flushLockMustNotGetInterferenceFromAdjacentFlushLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        long ps;
        long ns;
        long s;
        assertTrue( (ps = PageList.tryFlushLock( prevPageRef )) != 0 );
        assertTrue( (ns = PageList.tryFlushLock( nextPageRef )) != 0 );
        assertTrue( (s = PageList.tryFlushLock( pageRef )) != 0 );
        PageList.unlockFlush( pageRef, s, true );
        PageList.unlockFlush( prevPageRef, ps, true );
        PageList.unlockFlush( nextPageRef, ns, true );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustNotGetInterferenceFromAdjacentExclusiveLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustNotGetInterferenceFromAdjacentWriteLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryWriteLock( prevPageRef ) );
        assertTrue( PageList.tryWriteLock( nextPageRef ) );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( nextPageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustNotGetInterferenceFromAdjacentExclusiveAndWriteLocks( int pageId )
    {
        init( pageId );

        // exclusive locks on prevPageRef, nextPageRef and pageRef are implied from constructor
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusiveAndTakeWriteLock( prevPageRef );
        PageList.unlockExclusiveAndTakeWriteLock( nextPageRef );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( nextPageRef );

        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        assertTrue( PageList.tryExclusiveLock( prevPageRef ) );
        assertTrue( PageList.tryExclusiveLock( nextPageRef ) );
        PageList.unlockExclusiveAndTakeWriteLock( prevPageRef );
        PageList.unlockExclusiveAndTakeWriteLock( nextPageRef );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( nextPageRef );
        PageList.unlockExclusive( pageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustNotGetInterferenceFromAdjacentFlushLocks( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        long ps;
        long ns;
        assertTrue( (ps = PageList.tryFlushLock( prevPageRef )) != 0 );
        assertTrue( (ns = PageList.tryFlushLock( nextPageRef )) != 0);
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockExclusive( pageRef );
        PageList.unlockFlush( prevPageRef, ps, true );
        PageList.unlockFlush( nextPageRef, ns, true );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void takingWriteLockMustRaiseModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertFalse( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockWrite( pageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void turningExclusiveLockIntoWriteLockMustRaiseModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertFalse( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        assertFalse( PageList.isModified( pageRef ) );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockWrite( pageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustLowerModifiedFlagIfSuccessful( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertFalse( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void loweredModifiedFlagMustRemainLoweredAfterReleasingFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertFalse( PageList.isModified( pageRef ) );

        s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertFalse( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotLowerModifiedFlagIfUnsuccessful( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, false );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotLowerModifiedFlagIfWriteLockWasWithinFlushFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotLowerModifiedFlagIfWriteLockOverlappedTakingFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockWrite( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotLowerModifiedFlagIfWriteLockOverlappedReleasingFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long s = PageList.tryFlushLock( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotLowerModifiedFlagIfWriteLockOverlappedFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void releasingFlushLockMustNotInterfereWithAdjacentModifiedFlags( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryWriteLock( prevPageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        assertTrue( PageList.tryWriteLock( nextPageRef ) );
        PageList.unlockWrite( prevPageRef );
        PageList.unlockWrite( pageRef );
        PageList.unlockWrite( nextPageRef );
        assertTrue( PageList.isModified( prevPageRef ) );
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( PageList.isModified( nextPageRef ) );
        long s = PageList.tryFlushLock( pageRef );
        PageList.unlockFlush( pageRef, s, true );
        assertTrue( PageList.isModified( prevPageRef ) );
        assertFalse( PageList.isModified( pageRef ) );
        assertTrue( PageList.isModified( nextPageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void writeLockMustNotInterfereWithAdjacentModifiedFlags( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertFalse( PageList.isModified( prevPageRef ) );
        assertTrue( PageList.isModified( pageRef ) );
        assertFalse( PageList.isModified( nextPageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void disallowUnlockedPageToExplicitlyLowerModifiedFlag( int pageId )
    {
        init( pageId );

        assertThrows( IllegalStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.explicitlyMarkPageUnmodifiedUnderExclusiveLock( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void disallowReadLockedPageToExplicitlyLowerModifiedFlag( int pageId )
    {
        init( pageId );

        assertThrows( IllegalStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.tryOptimisticReadLock( pageRef );
            PageList.explicitlyMarkPageUnmodifiedUnderExclusiveLock( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void disallowFlushLockedPageToExplicitlyLowerModifiedFlag( int pageId )
    {
        init( pageId );

        assertThrows( IllegalStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            assertThat( PageList.tryFlushLock( pageRef ) ).isNotEqualTo( 0L );
            PageList.explicitlyMarkPageUnmodifiedUnderExclusiveLock( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void disallowWriteLockedPageToExplicitlyLowerModifiedFlag( int pageId )
    {
        init( pageId );

        assertThrows( IllegalStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            assertTrue( PageList.tryWriteLock( pageRef ) );
            PageList.explicitlyMarkPageUnmodifiedUnderExclusiveLock( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void allowExclusiveLockedPageToExplicitlyLowerModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertFalse( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        PageList.unlockWrite( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.explicitlyMarkPageUnmodifiedUnderExclusiveLock( pageRef );
        assertFalse( PageList.isModified( pageRef ) );
        PageList.unlockExclusive( pageRef );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustTakeFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) );
        long flushStamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertThat( flushStamp ).isNotEqualTo( 0L );
        assertThat( PageList.tryFlushLock( pageRef ) ).isEqualTo( 0L );
        PageList.unlockFlush( pageRef, flushStamp, true );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustThrowIfNotWriteLocked( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        } );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustThrowIfNotWriteLockedButExclusiveLocked( int pageId )
    {
        init( pageId );

        assertThrows( IllegalMonitorStateException.class, () ->
            // exclusive lock implied by constructor
            PageList.unlockWriteAndTryTakeFlushLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustFailIfFlushLockIsAlreadyTaken( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.tryFlushLock( pageRef );
        assertThat( stamp ).isNotEqualTo( 0L );
        long secondStamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertThat( secondStamp ).isEqualTo( 0L );
        PageList.unlockFlush( pageRef, stamp, true );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustReleaseWriteLockEvenIfFlushLockFails( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long flushStamp = PageList.tryFlushLock( pageRef );
        assertThat( flushStamp ).isNotEqualTo( 0L );
        assertThat( PageList.unlockWriteAndTryTakeFlushLock( pageRef ) ).isEqualTo( 0L );
        long readStamp = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, readStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustReleaseWriteLockWhenFlushLockSucceeds( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertThat( PageList.unlockWriteAndTryTakeFlushLock( pageRef ) ).isNotEqualTo( 0L );
        long readStamp = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, readStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTrueTakeFlushLockMustRaiseModifiedFlag( int pageId )
    {
        init( pageId );

        assertFalse( PageList.isModified( pageRef ) );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        assertThat( PageList.unlockWriteAndTryTakeFlushLock( pageRef ) ).isNotEqualTo( 0L );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockAndThenUnlockFlushMustLowerModifiedFlagIfSuccessful( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockFlush( pageRef, stamp, true );
        assertFalse( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockAndThenUnlockFlushMustNotLowerModifiedFlagIfFailed( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockFlush( pageRef, stamp, false );
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockWithOverlappingWriterAndThenUnlockFlushMustNotLowerModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertTrue( PageList.tryWriteLock( pageRef ) ); // two write locks, now
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef ); // one flush, one write lock
        assertThat( stamp ).isNotEqualTo( 0L );
        PageList.unlockWrite( pageRef ); // one flush, zero write locks
        assertTrue( PageList.isModified( pageRef ) );
        PageList.unlockFlush( pageRef, stamp, true ); // flush is successful, but had one overlapping writer
        assertTrue( PageList.isModified( pageRef ) ); // so it's still modified
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockAndThenUnlockFlushWithOverlappingWriterMustNotLowerModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef ); // one flush lock
        assertThat( stamp ).isNotEqualTo( 0L );
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) ); // one flush and one write lock
        PageList.unlockFlush( pageRef, stamp, true ); // flush is successful, but have one overlapping writer
        PageList.unlockWrite( pageRef ); // no more locks, but a writer started within flush section ...
        assertTrue( PageList.isModified( pageRef ) ); // ... and overlapped unlockFlush, so it's still modified
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockAndThenUnlockFlushWithContainedWriterMustNotLowerModifiedFlag( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef ); // one flush lock
        assertThat( stamp ).isNotEqualTo( 0L );
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( PageList.tryWriteLock( pageRef ) ); // one flush and one write lock
        PageList.unlockWrite( pageRef ); // back to one flush lock
        PageList.unlockFlush( pageRef, stamp, true ); // flush is successful, but had one overlapping writer
        assertTrue( PageList.isModified( pageRef ) ); // so it's still modified
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockThatSucceedsMustPreventOverlappingExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockFlush( pageRef, stamp, true );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockThatFailsMustPreventOverlappingExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertFalse( PageList.tryExclusiveLock( pageRef ) );
        PageList.unlockFlush( pageRef, stamp, false );
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockThatSucceedsMustPreventOverlappingFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertThat( PageList.tryFlushLock( pageRef ) ).isEqualTo( 0L );
        PageList.unlockFlush( pageRef, stamp, true );
        assertThat( PageList.tryFlushLock( pageRef ) ).isNotEqualTo( 0L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockThatFailsMustPreventOverlappingFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long stamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertThat( PageList.tryFlushLock( pageRef ) ).isEqualTo( 0L );
        PageList.unlockFlush( pageRef, stamp, false );
        assertThat( PageList.tryFlushLock( pageRef ) ).isNotEqualTo( 0L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustNotInvalidateReadersOverlappingWithFlushLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long flushStamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        long readStamp = PageList.tryOptimisticReadLock( pageRef );
        assertTrue( PageList.validateReadLock( pageRef, readStamp ) );
        PageList.unlockFlush( pageRef, flushStamp, true );
        assertTrue( PageList.validateReadLock( pageRef, readStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unlockWriteAndTryTakeFlushLockMustInvalidateReadersOverlappingWithWriteLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        long readStamp = PageList.tryOptimisticReadLock( pageRef );
        long flushStamp = PageList.unlockWriteAndTryTakeFlushLock( pageRef );
        assertFalse( PageList.validateReadLock( pageRef, readStamp ) );
        PageList.unlockFlush( pageRef, flushStamp, true );
        assertFalse( PageList.validateReadLock( pageRef, readStamp ) );
    }

    // xxx ---[ Page state tests ]---

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void mustExposeCachePageSize( int pageId )
    {
        init( pageId );

        PageList list = new PageList( 0, 42, mman, swappers,
                VictimPageReference.getVictimPage( 42, INSTANCE ), ALIGNMENT );
        assertThat( list.getCachePageSize() ).isEqualTo( 42 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void addressesMustBeZeroBeforeInitialisation( int pageId )
    {
        init( pageId );

        assertThat( PageList.getAddress( pageRef ) ).isEqualTo( 0L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void initialisingBufferMustConsumeMemoryFromMemoryManager( int pageId )
    {
        init( pageId );

        long initialUsedMemory = mman.usedMemory();
        pageList.initBuffer( pageRef );
        long resultingUsedMemory = mman.usedMemory();
        int allocatedMemory = (int) (resultingUsedMemory - initialUsedMemory);
        assertThat( allocatedMemory ).isGreaterThanOrEqualTo( pageSize );
        assertThat( allocatedMemory ).isLessThanOrEqualTo( pageSize + ALIGNMENT );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void addressMustNotBeZeroAfterInitialisation( int pageId )
    {
        init( pageId );

        pageList.initBuffer( pageRef );
        assertThat( PageList.getAddress( pageRef ) ).isNotEqualTo( 0L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageListMustBeCopyableViaConstructor( int pageId )
    {
        init( pageId );

        assertThat( PageList.getAddress( pageRef ) ).isEqualTo( 0L );

        pageList.initBuffer( pageRef );
        assertThat( PageList.getAddress( pageRef ) ).isNotEqualTo( 0L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void usageCounterMustBeZeroByDefault( int pageId )
    {
        init( pageId );

        assertTrue( PageList.decrementUsage( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void usageCounterMustGoUpToFour( int pageId )
    {
        init( pageId );

        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertTrue( PageList.decrementUsage( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void usageCounterMustTruncateAtFour( int pageId )
    {
        init( pageId );

        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertFalse( PageList.decrementUsage( pageRef ) );
        assertTrue( PageList.decrementUsage( pageRef ) );
        assertTrue( PageList.decrementUsage( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void incrementingUsageCounterMustNotInterfereWithAdjacentUsageCounters( int pageId )
    {
        init( pageId );

        PageList.incrementUsage( pageRef );
        PageList.incrementUsage( pageRef );
        assertTrue( PageList.decrementUsage( prevPageRef ) );
        assertTrue( PageList.decrementUsage( nextPageRef ) );
        assertFalse( PageList.decrementUsage( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void decrementingUsageCounterMustNotInterfereWithAdjacentUsageCounters( int pageId )
    {
        init( pageId );

        for ( int id : pageIds )
        {
            long ref = pageList.deref( id );
            PageList.incrementUsage( ref );
            PageList.incrementUsage( ref );
        }

        assertFalse( PageList.decrementUsage( pageRef ) );
        assertTrue( PageList.decrementUsage( pageRef ) );
        assertFalse( PageList.decrementUsage( prevPageRef ) );
        assertFalse( PageList.decrementUsage( nextPageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void filePageIdIsUnboundByDefault( int pageId )
    {
        init( pageId );

        assertThat( PageList.getFilePageId( pageRef ) ).isEqualTo( PageCursor.UNBOUND_PAGE_ID );
    }

    // xxx ---[ Page fault tests ]---

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustThrowWithoutExclusiveLock( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        pageList.initBuffer( pageRef );
        assertThrows( IllegalStateException.class, () ->
            PageList.fault( pageRef, DUMMY_SWAPPER, (short) 0, 0, PageFaultEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustThrowIfSwapperIsNull( int pageId )
    {
        init( pageId );

        // exclusive lock implied by the constructor
        pageList.initBuffer( pageRef );
        assertThrows( IllegalArgumentException.class, () ->
            PageList.fault( pageRef, null, (short) 0, 0, PageFaultEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustThrowIfFilePageIdIsUnbound( int pageId )
    {
        init( pageId );

        // exclusively locked from constructor
        pageList.initBuffer( pageRef );
        assertThrows( IllegalStateException.class, () ->
            PageList.fault( pageRef, DUMMY_SWAPPER, (short) 0, PageCursor.UNBOUND_PAGE_ID, PageFaultEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustReadIntoPage( int pageId ) throws Exception
    {
        init( pageId );

        byte pageByteContents = (byte) 0xF7;
        short swapperId = 1;
        long filePageId = 2;
        PageSwapper swapper = new DummyPageSwapper( "some file", pageSize )
        {
            @Override
            public long read( long fpId, long bufferAddress ) throws IOException
            {
                if ( fpId == filePageId )
                {
                    UnsafeUtil.setMemory( bufferAddress, filePageSize, pageByteContents );
                    return filePageSize;
                }
                throw new IOException( "Did not expect this file page id = " + fpId );
            }
        };
        pageList.initBuffer( pageRef );
        PageList.fault( pageRef, swapper, swapperId, filePageId, PageFaultEvent.NULL );

        long address = PageList.getAddress( pageRef );
        assertThat( address ).isNotEqualTo( 0L );
        for ( int i = 0; i < pageSize; i++ )
        {
            byte actualByteContents = UnsafeUtil.getByte( address + i );
            if ( actualByteContents != pageByteContents )
            {
                fail( String.format(
                        "Page contents where different at address %x + %s, expected %x but was %x",
                        address, i, pageByteContents, actualByteContents ) );
            }
        }
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageMustBeLoadedAndBoundAfterFault( int pageId ) throws Exception
    {
        init( pageId );

        // exclusive lock implied by constructor
        int swapperId = 1;
        long filePageId = 42;
        pageList.initBuffer( pageRef );
        PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL );
        assertThat( PageList.getFilePageId( pageRef ) ).isEqualTo( filePageId );
        assertThat( PageList.getSwapperId( pageRef ) ).isEqualTo( swapperId );
        assertTrue( PageList.isLoaded( pageRef ) );
        assertTrue( PageList.isBoundTo( pageRef, swapperId, filePageId ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageWith5BytesFilePageIdMustBeLoadedAndBoundAfterFault( int pageId ) throws Exception
    {
        init( pageId );

        // exclusive lock implied by constructor
        int swapperId = 12;
        long filePageId = Integer.MAX_VALUE + 1L;
        pageList.initBuffer( pageRef );
        PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL );
        assertThat( PageList.getFilePageId( pageRef ) ).isEqualTo( filePageId );
        assertThat( PageList.getSwapperId( pageRef ) ).isEqualTo( swapperId );
        assertTrue( PageList.isLoaded( pageRef ) );
        assertTrue( PageList.isBoundTo( pageRef, swapperId, filePageId ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageMustBeLoadedAndNotBoundIfFaultThrows( int pageId )
    {
        init( pageId );

        // exclusive lock implied by constructor
        PageSwapper swapper = new DummyPageSwapper( "file", pageSize )
        {
            @Override
            public long read( long filePageId, long bufferAddress ) throws IOException
            {
                throw new IOException( "boo" );
            }
        };
        int swapperId = 1;
        long filePageId = 42;
        pageList.initBuffer( pageRef );
        try
        {
            PageList.fault( pageRef, swapper, swapperId, filePageId, PageFaultEvent.NULL );
            fail();
        }
        catch ( IOException e )
        {
            assertThat( e.getMessage() ).isEqualTo( "boo" );
        }
        assertThat( PageList.getFilePageId( pageRef ) ).isEqualTo( filePageId );
        assertThat( PageList.getSwapperId( pageRef ) ).isEqualTo( 0 ); // 0 means not bound
        assertTrue( PageList.isLoaded( pageRef ) );
        assertFalse( PageList.isBoundTo( pageRef, swapperId, filePageId ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustThrowIfPageIsAlreadyBound( int pageId ) throws Exception
    {
        init( pageId );

        // exclusive lock implied by constructor
        short swapperId = 1;
        long filePageId = 42;
        pageList.initBuffer( pageRef );
        PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL );

        assertThrows( IllegalStateException.class, () ->
            PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustThrowIfPageIsLoadedButNotBound( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        short swapperId = 1;
        long filePageId = 42;
        doFailedFault( swapperId, filePageId );

        // After the failed page fault, the page is loaded but not bound.
        // We still can't fault into a loaded page, though.
        assertThrows( IllegalStateException.class, () ->
            PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL ) );
    }

    private void doFailedFault( short swapperId, long filePageId )
    {
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        pageList.initBuffer( pageRef );
        DummyPageSwapper swapper = new DummyPageSwapper( "", pageSize )
        {
            @Override
            public long read( long filePageId, long bufferAddress ) throws IOException
            {
                throw new IOException( "boom" );
            }
        };
        try
        {
            PageList.fault( pageRef, swapper, swapperId, filePageId, PageFaultEvent.NULL );
            fail( "fault should have thrown" );
        }
        catch ( IOException e )
        {
            assertThat( e.getMessage() ).isEqualTo( "boom" );
        }
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustPopulatePageFaultEvent( int pageId ) throws Exception
    {
        init( pageId );

        // exclusive lock implied by constructor
        short swapperId = 1;
        long filePageId = 42;
        pageList.initBuffer( pageRef );
        DummyPageSwapper swapper = new DummyPageSwapper( "", pageSize )
        {
            @Override
            public long read( long filePageId, long bufferAddress )
            {
                return 333;
            }
        };
        StubPageFaultEvent event = new StubPageFaultEvent();
        PageList.fault( pageRef, swapper, swapperId, filePageId, event );
        assertThat( event.bytesRead ).isEqualTo( 333L );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unboundPageMustNotBeLoaded( int pageId )
    {
        init( pageId );

        assertFalse( PageList.isLoaded( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void unboundPageMustNotBeBoundToAnything( int pageId )
    {
        init( pageId );

        assertFalse( PageList.isBoundTo( pageRef, (short) 0, 0 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void boundPagesAreNotBoundToOtherPagesWithSameSwapper( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        long filePageId = 42;
        short swapperId = 2;
        doFault( swapperId, filePageId );

        assertTrue( PageList.isBoundTo( pageRef, swapperId, filePageId ) );
        assertFalse( PageList.isBoundTo( pageRef, swapperId, filePageId + 1 ) );
        assertFalse( PageList.isBoundTo( pageRef, swapperId, filePageId - 1 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void boundPagesAreNotBoundToOtherPagesWithSameFilePageId( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        short swapperId = 2;
        doFault( swapperId, 42 );

        assertTrue( PageList.isBoundTo( pageRef, swapperId, 42 ) );
        assertFalse( PageList.isBoundTo( pageRef, (short) (swapperId + 1), 42 ) );
        assertFalse( PageList.isBoundTo( pageRef, (short) (swapperId - 1), 42 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void faultMustNotInterfereWithAdjacentPages( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        doFault( (short) 1, 42 );

        assertFalse( PageList.isLoaded( prevPageRef ) );
        assertFalse( PageList.isLoaded( nextPageRef ) );
        assertFalse( PageList.isBoundTo( prevPageRef, (short) 1, 42 ) );
        assertFalse( PageList.isBoundTo( prevPageRef, (short) 0, 0 ) );
        assertFalse( PageList.isBoundTo( nextPageRef, (short) 1, 42 ) );
        assertFalse( PageList.isBoundTo( nextPageRef, (short) 0, 0 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void failedFaultMustNotInterfereWithAdjacentPages( int pageId )
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        doFailedFault( (short) 1, 42 );

        assertFalse( PageList.isLoaded( prevPageRef ) );
        assertFalse( PageList.isLoaded( nextPageRef ) );
        assertFalse( PageList.isBoundTo( prevPageRef, (short) 1, 42 ) );
        assertFalse( PageList.isBoundTo( prevPageRef, (short) 0, 0 ) );
        assertFalse( PageList.isBoundTo( nextPageRef, (short) 1, 42 ) );
        assertFalse( PageList.isBoundTo( nextPageRef, (short) 0, 0 ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void exclusiveLockMustStillBeHeldAfterFault( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        doFault( (short) 1, 42 );
        PageList.unlockExclusive( pageRef ); // will throw if lock is not held
    }

    // xxx ---[ Page eviction tests ]---

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustFailIfPageIsAlreadyExclusivelyLocked( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 ); // page is now loaded
        // pages are delivered from the fault routine with the exclusive lock already held!
        assertFalse( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatFailsOnExclusiveLockMustNotUndoSaidLock( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 ); // page is now loaded
        // pages are delivered from the fault routine with the exclusive lock already held!
        pageList.tryEvict( pageRef, EvictionRunEvent.NULL ); // This attempt will fail
        assertTrue( PageList.isExclusivelyLocked( pageRef ) ); // page should still have its lock
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustFailIfPageIsNotLoaded( int pageId ) throws Exception
    {
        init( pageId );

        assertFalse( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustWhenPageIsNotLoadedMustNotLeavePageLocked( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        pageList.tryEvict( pageRef, EvictionRunEvent.NULL ); // This attempt fails
        assertFalse( PageList.isExclusivelyLocked( pageRef ) ); // Page should not be left in locked state
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustLeavePageExclusivelyLockedOnSuccess( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 ); // page now bound & exclusively locked
        PageList.unlockExclusive( pageRef ); // no longer exclusively locked; can now be evicted
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        PageList.unlockExclusive( pageRef ); // will throw if lock is not held
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageMustNotBeLoadedAfterSuccessfulEviction( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 ); // page now bound & exclusively locked
        PageList.unlockExclusive( pageRef ); // no longer exclusively locked; can now be evicted
        assertTrue( PageList.isLoaded( pageRef ) );
        pageList.tryEvict( pageRef, EvictionRunEvent.NULL );
        assertFalse( PageList.isLoaded( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageMustNotBeBoundAfterSuccessfulEviction( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 ); // page now bound & exclusively locked
        PageList.unlockExclusive( pageRef ); // no longer exclusively locked; can now be evicted
        assertTrue( PageList.isBoundTo( pageRef, (short) 1, 42 ) );
        assertTrue( PageList.isLoaded( pageRef ) );
        assertThat( PageList.getSwapperId( pageRef ) ).isEqualTo( 1 );
        pageList.tryEvict( pageRef, EvictionRunEvent.NULL );
        assertFalse( PageList.isBoundTo( pageRef, (short) 1, 42 ) );
        assertFalse( PageList.isLoaded( pageRef ) );
        assertThat( PageList.getSwapperId( pageRef ) ).isEqualTo( 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void pageMustNotBeModifiedAfterSuccessfulEviction( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int swapperId = swappers.allocate( DUMMY_SWAPPER );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertFalse( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustFlushPageIfModified( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        AtomicLong writtenFilePageId = new AtomicLong( -1 );
        AtomicLong writtenBufferAddress = new AtomicLong( -1 );
        PageSwapper swapper = new DummyPageSwapper( "file", pageSize )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                assertTrue( writtenFilePageId.compareAndSet( -1, filePageId ) );
                assertTrue( writtenBufferAddress.compareAndSet( -1, bufferAddress ) );
                return super.write( filePageId, bufferAddress );
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertThat( writtenFilePageId.get() ).isEqualTo( 42L );
        assertThat( writtenBufferAddress.get() ).isEqualTo( PageList.getAddress( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustNotFlushPageIfNotModified( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        AtomicInteger writes = new AtomicInteger();
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                writes.getAndIncrement();
                return super.write( filePageId, bufferAddress );
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusive( pageRef ); // we take no write lock, so page is not modified
        assertFalse( PageList.isModified( pageRef ) );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertThat( writes.get() ).isEqualTo( 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustNotifySwapperOnSuccess( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        AtomicBoolean evictionNotified = new AtomicBoolean();
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public void evicted( long filePageId )
            {
                evictionNotified.set( true );
                assertThat( filePageId ).isEqualTo( 42L );
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusive( pageRef );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertTrue( evictionNotified.get() );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustNotifySwapperOnSuccessEvenWhenFlushing( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        AtomicBoolean evictionNotified = new AtomicBoolean();
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public void evicted( long filePageId )
            {
                evictionNotified.set( true );
                assertThat( filePageId ).isEqualTo( 42L );
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertTrue( evictionNotified.get() );
        assertFalse( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustLeavePageUnlockedAndLoadedAndBoundAndModifiedIfFlushThrows( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                throw new IOException();
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        try
        {
            pageList.tryEvict( pageRef, EvictionRunEvent.NULL );
            fail( "tryEvict should have thrown" );
        }
        catch ( IOException e )
        {
            // good
        }
        // there should be no lock preventing us from taking an exclusive lock
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        // page should still be loaded...
        assertTrue( PageList.isLoaded( pageRef ) );
        // ... and bound
        assertTrue( PageList.isBoundTo( pageRef, swapperId, 42 ) );
        // ... and modified
        assertTrue( PageList.isModified( pageRef ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustNotNotifySwapperOfEvictionIfFlushThrows( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        AtomicBoolean evictionNotified = new AtomicBoolean();
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                throw new IOException();
            }

            @Override
            public void evicted( long filePageId )
            {
                evictionNotified.set( true );
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        try
        {
            pageList.tryEvict( pageRef, EvictionRunEvent.NULL );
            fail( "tryEvict should have thrown" );
        }
        catch ( IOException e )
        {
            // good
        }
        // we should not have gotten any notification about eviction
        assertFalse( evictionNotified.get() );
    }

    private static class EvictionAndFlushRecorderEvent implements EvictionEvent, FlushEvent
    {
        private long filePageId;
        private PageSwapper swapper;
        private IOException evictionException;
        private long cachePageId;
        private boolean evictionClosed;
        private long bytesWritten;
        private boolean flushDone;
        private IOException flushException;
        private int pagesFlushed;
        private int pagesMerged;

        EvictionAndFlushRecorderEvent( long cachePageId )
        {
            this.cachePageId = cachePageId;
        }

        // --- EvictionEvent:

        @Override
        public void close()
        {
            this.evictionClosed = true;
        }

        @Override
        public void setFilePageId( long filePageId )
        {
            this.filePageId = filePageId;
        }

        @Override
        public void setSwapper( PageSwapper swapper )
        {
            this.swapper = swapper;
        }

        @Override
        public void threwException( IOException exception )
        {
            this.evictionException = exception;
        }

        @Override
        public FlushEvent beginFlush( long pageRef, PageSwapper swapper, PageReferenceTranslator pageTranslator )
        {
            return this;
        }

        // --- FlushEvent:

        @Override
        public void addBytesWritten( long bytes )
        {
            this.bytesWritten += bytes;
        }

        @Override
        public void done()
        {
            this.flushDone = true;
        }

        @Override
        public void done( IOException exception )
        {
            this.flushDone = true;
            this.flushException = exception;
        }

        @Override
        public void addPagesFlushed( int pageCount )
        {
            this.pagesFlushed += pageCount;
        }

        @Override
        public void addPagesMerged( int pagesMerged )
        {
            this.pagesMerged += pagesMerged;
        }
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictMustReportToEvictionEvent( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        PageSwapper swapper = new DummyPageSwapper( "a", 313 );
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusive( pageRef );
        EvictionAndFlushRecorderEvent recorder = new EvictionAndFlushRecorderEvent( pageRef );
        assertTrue( pageList.tryEvict( pageRef, any -> recorder ) );
        assertThat( recorder.evictionClosed ).isEqualTo( true );
        assertThat( recorder.filePageId ).isEqualTo( 42L );
        assertThat( recorder.swapper ).isSameAs( swapper );
        assertThat( recorder.evictionException ).isNull();
        assertThat( recorder.cachePageId ).isEqualTo( pageRef );
        assertThat( recorder.bytesWritten ).isEqualTo( 0L );
        assertThat( recorder.flushDone ).isEqualTo( false );
        assertThat( recorder.flushException ).isNull();
        assertThat( recorder.pagesFlushed ).isEqualTo( 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatFlushesMustReportToEvictionAndFlushEvents( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        int filePageSize = 313;
        PageSwapper swapper = new DummyPageSwapper( "a", filePageSize );
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        EvictionAndFlushRecorderEvent recorder = new EvictionAndFlushRecorderEvent( pageRef );
        assertTrue( pageList.tryEvict( pageRef, any -> recorder ) );
        assertThat( recorder.evictionClosed ).isEqualTo( true );
        assertThat( recorder.filePageId ).isEqualTo( 42L );
        assertThat( recorder.swapper ).isSameAs( swapper );
        assertThat( recorder.evictionException ).isNull();
        assertThat( recorder.cachePageId ).isEqualTo( pageRef );
        assertThat( recorder.bytesWritten ).isEqualTo( filePageSize );
        assertThat( recorder.flushDone ).isEqualTo( true );
        assertThat( recorder.flushException ).isNull();
        assertThat( recorder.pagesFlushed ).isEqualTo( 1 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatFailsMustReportExceptionsToEvictionAndFlushEvents( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( pageRef );
        IOException ioException = new IOException();
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                throw ioException;
            }
        };
        int swapperId = swappers.allocate( swapper );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        EvictionAndFlushRecorderEvent recorder = new EvictionAndFlushRecorderEvent( pageRef );
        assertThrows( IOException.class, () -> pageList.tryEvict( pageRef, any -> recorder ) );

        assertThat( recorder.evictionClosed ).isEqualTo( true );
        assertThat( recorder.filePageId ).isEqualTo( 42L );
        assertThat( recorder.swapper ).isSameAs( swapper );
        assertThat( recorder.evictionException ).isSameAs( ioException );
        assertThat( recorder.cachePageId ).isEqualTo( pageRef );
        assertThat( recorder.bytesWritten ).isEqualTo( 0L );
        assertThat( recorder.flushDone ).isEqualTo( true );
        assertThat( recorder.flushException ).isSameAs( ioException );
        assertThat( recorder.pagesFlushed ).isEqualTo( 0 );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatSucceedsMustNotInterfereWithAdjacentPages( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        PageSwapper swapper = new DummyPageSwapper( "a", 313 );
        int swapperId = swappers.allocate( swapper );
        long prevStamp = PageList.tryOptimisticReadLock( prevPageRef );
        long nextStamp = PageList.tryOptimisticReadLock( nextPageRef );
        doFault( swapperId, 42 );
        PageList.unlockExclusive( pageRef );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertTrue( PageList.validateReadLock( prevPageRef, prevStamp ) );
        assertTrue( PageList.validateReadLock( nextPageRef, nextStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatFlushesAndSucceedsMustNotInterfereWithAdjacentPages( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        PageSwapper swapper = new DummyPageSwapper( "a", 313 );
        int swapperId = swappers.allocate( swapper );
        long prevStamp = PageList.tryOptimisticReadLock( prevPageRef );
        long nextStamp = PageList.tryOptimisticReadLock( nextPageRef );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        assertTrue( pageList.tryEvict( pageRef, EvictionRunEvent.NULL ) );
        assertTrue( PageList.validateReadLock( prevPageRef, prevStamp ) );
        assertTrue( PageList.validateReadLock( nextPageRef, nextStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void tryEvictThatFailsMustNotInterfereWithAdjacentPages( int pageId ) throws Exception
    {
        init( pageId );

        PageList.unlockExclusive( prevPageRef );
        PageList.unlockExclusive( pageRef );
        PageList.unlockExclusive( nextPageRef );
        PageSwapper swapper = new DummyPageSwapper( "a", 313 )
        {
            @Override
            public long write( long filePageId, long bufferAddress ) throws IOException
            {
                throw new IOException();
            }
        };
        int swapperId = swappers.allocate( swapper );
        long prevStamp = PageList.tryOptimisticReadLock( prevPageRef );
        long nextStamp = PageList.tryOptimisticReadLock( nextPageRef );
        doFault( swapperId, 42 );
        PageList.unlockExclusiveAndTakeWriteLock( pageRef );
        PageList.unlockWrite( pageRef ); // page is now modified
        assertTrue( PageList.isModified( pageRef ) );
        try
        {
            pageList.tryEvict( pageRef, EvictionRunEvent.NULL );
            fail( "tryEvict should have thrown" );
        }
        catch ( IOException e )
        {
            // ok
        }
        assertTrue( PageList.validateReadLock( prevPageRef, prevStamp ) );
        assertTrue( PageList.validateReadLock( nextPageRef, nextStamp ) );
    }

    @ParameterizedTest( name = "pageRef = {0}" )
    @MethodSource( "argumentsProvider" )
    public void failToSetHigherThenSupportedFilePageIdOnFault( int pageId )
    {
        init( pageId );

        assertThrows( IllegalArgumentException.class, () ->
        {
            PageList.unlockExclusive( pageRef );
            short swapperId = 2;
            doFault( swapperId, Long.MAX_VALUE );
        } );
    }

    private void doFault( int swapperId, long filePageId ) throws IOException
    {
        assertTrue( PageList.tryExclusiveLock( pageRef ) );
        pageList.initBuffer( pageRef );
        PageList.fault( pageRef, DUMMY_SWAPPER, swapperId, filePageId, PageFaultEvent.NULL );
    }

    // todo freelist? (entries chained via file page ids in a linked list? should work as free pages are always
    // todo exclusively locked, and thus don't really need an isLoaded check)
}
