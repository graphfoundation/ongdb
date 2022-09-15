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
package org.neo4j.internal.id.indexed;

import org.eclipse.collections.api.list.primitive.MutableLongList;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.GBPTreeBuilder;
import org.neo4j.internal.id.IdSlotDistribution.Slot;
import org.neo4j.internal.id.indexed.IndexedIdGenerator.InternalMarker;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PinEvent;
import org.neo4j.test.Barrier;
import org.neo4j.test.OtherThreadExecutor;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Answers.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.neo4j.internal.id.IdSlotDistribution.evenSlotDistribution;
import static org.neo4j.internal.id.indexed.IndexedIdGenerator.NO_ID;
import static org.neo4j.internal.id.indexed.IndexedIdGenerator.NO_MONITOR;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.test.OtherThreadExecutor.command;

@PageCacheExtension
class FreeIdScannerTest
{
    private static final int IDS_PER_ENTRY = 256;
    public static final IdCache.IdRangeConsumer EMPTY_ID_RANGE_CONSUMER = ( id, size ) -> {};

    @Inject
    PageCache pageCache;

    @Inject
    TestDirectory directory;

    private IdRangeLayout layout;
    private GBPTree<IdRangeKey, IdRange> tree;

    // instantiated in tests
    private AtomicBoolean atLeastOneFreeId;
    private IdCache cache;
    private RecordingReservedMarkerProvider reuser;
    private RecordingMonitor recordingMonitor;

    @BeforeEach
    void beforeEach()
    {
        this.layout = new IdRangeLayout( IDS_PER_ENTRY );
        this.tree = new GBPTreeBuilder<>( pageCache, directory.file( "file.id" ), layout ).build();
    }

    @AfterEach
    void afterEach() throws Exception
    {
        tree.close();
    }

    @Test
    void shouldNotThinkItsWorthScanningIfNoFreedIdsAndNoOngoingScan()
    {
        // given
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 8, 1, true );

        // then
        assertThat( scanner.tryLoadFreeIdsIntoCache( false, NULL ) ).isFalse();
    }

    @Test
    void shouldThinkItsWorthScanningIfAlreadyHasOngoingScan()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 256, generation, true );

        forEachId( generation, range( 0, 300 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertThat( cache.size() > 0 ).isTrue();
        // take at least one so that scanner wants to load more from the ongoing scan
        assertThat( cache.takeOrDefault( -1 ) ).isZero();

        // then
        assertThat( scanner.tryLoadFreeIdsIntoCache( false, NULL ) ).isTrue();
    }

    @Test
    void shouldFindMarkAndCacheOneIdFromAnEntry()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 8, generation, true );

        forEachId( generation, range( 0, 1 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 1 ) );
    }

    @Test
    void shouldFindMarkAndCacheMultipleIdsFromAnEntry()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 8, generation, true );
        Range[] ranges = {range( 0, 2 ), range( 7, 8 )}; // 0, 1, 2, 7

        forEachId( generation, ranges ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( ranges );
    }

    @Test
    void shouldFindMarkAndCacheMultipleIdsFromMultipleEntries()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 16, generation, true );
        Range[] ranges = {range( 0, 2 ), range( 167, 175 )}; // 0, 1, 2 in one entry and 67,68,69,70,71,72,73,74 in another entry

        forEachId( generation, ranges ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( ranges );
    }

    @Test
    void shouldNotFindUsedIds()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 16, generation, true );

        forEachId( generation, range( 0, 5 ) ).accept( ( marker1, id1 ) ->
        {
            marker1.markDeleted( id1 );
            marker1.markFree( id1 );
        } );
        forEachId( generation, range( 1, 3 ) ).accept( ( marker, id ) ->
        {
            marker.markReserved( id );
            marker.markUsed( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 1 ), range( 3, 5 ) );
    }

    @Test
    void shouldNotFindUnusedButNonReusableIds()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 16, generation, true );

        forEachId( generation, range( 0, 5 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );
        forEachId( generation, range( 1, 3 ) ).accept( IdRangeMarker::markReserved );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 1 ), range( 3, 5 ) );
    }

    @Test
    void shouldContinuePausedScan()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 8, generation, true );

        forEachId( generation, range( 0, 8 ), range( 64, 72 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 8 ) );

        // and further when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 64, 72 ) );
    }

    @Test
    void shouldContinueFromAPausedEntryIfScanWasPausedInTheMiddleOfIt()
    {
        // given
        int generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 8, generation, true );

        forEachId( generation, range( 0, 4 ), range( 64, 72 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 4 ), range( 64, 68 ) );

        // and further when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 68, 72 ) );
    }

    @Test
    void shouldOnlyLetOneThreadAtATimePerformAScanNonStrict() throws Exception
    {
        // given
        int generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        ControlledIdCache cache = new ControlledIdCache( QueueMethodControl.OFFER, barrier, new Slot( 8, 1 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, false );

        forEachId( generation, range( 0, 2 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> scanFuture = executorService.submit( () -> scanner.tryLoadFreeIdsIntoCache( false, NULL ) );
        barrier.await();
        // now it's stuck in trying to offer to the cache

        // then a scan call from another thread should complete but not do anything
        assertThat( recordingMonitor.cached.isEmpty() ).isTrue();
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertThat( recordingMonitor.cached.isEmpty() ).isTrue();

        // clean up
        barrier.release();
        scanFuture.get();
        executorService.shutdown();
    }

    @Test
    void shouldOnlyLetOneThreadAtATimePerformAScanStrict() throws Exception
    {
        // given
        int generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        ControlledIdCache cache = new ControlledIdCache( QueueMethodControl.OFFER, barrier, new Slot( 8, 1 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, false );

        forEachId( generation, range( 0, 2 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> scanFuture = executorService.submit( () -> scanner.tryLoadFreeIdsIntoCache( false, NULL ) );
        barrier.await();
        // now it's stuck in trying to offer to the cache

        // then a scan call from another thread should block too
        try ( OtherThreadExecutor t2 = new OtherThreadExecutor( "T2" ) )
        {
            Future<Void> t2Completion = t2.executeDontWait( () ->
            {
                scanner.tryLoadFreeIdsIntoCache( true, NULL );
                return null;
            } );
            t2.waitUntilWaiting( details -> details.isAt( FreeIdScanner.class, "tryLoadFreeIdsIntoCache" ) );
            barrier.release();
            t2Completion.get();
        }

        // clean up
        scanFuture.get();
        executorService.shutdown();

        // and then
        assertThat( recordingMonitor.hasCached( 0, 1 ) ).isTrue();
        assertThat( recordingMonitor.hasCached( 1, 1 ) ).isTrue();
    }

    @Test
    void shouldLetSecondThreadWaitIfForcedToEvenInNonStrictMode() throws Exception
    {
        // given
        int generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        ControlledIdCache cache = new ControlledIdCache( QueueMethodControl.OFFER, barrier, new Slot( 8, 1 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, false );

        forEachId( generation, range( 0, 2 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> scanFuture = executorService.submit( () -> scanner.tryLoadFreeIdsIntoCache( false, NULL ) );
        barrier.await();
        // now it's stuck in trying to offer to the cache

        // then a scan call from another thread should complete but not do anything
        assertThat( recordingMonitor.cached.isEmpty() ).isTrue();
        try ( OtherThreadExecutor t2 = new OtherThreadExecutor( "T2" ) )
        {
            Future<Void> t2Completion = t2.executeDontWait( () ->
            {
                scanner.tryLoadFreeIdsIntoCache( true, NULL );
                return null;
            } );
            t2.waitUntilWaiting( details -> details.isAt( FreeIdScanner.class, "tryLoadFreeIdsIntoCache" ) );
            assertThat( recordingMonitor.cached.isEmpty() ).isTrue();
            barrier.release();
            t2Completion.get();
        }

        // clean up
        scanFuture.get();
        executorService.shutdown();

        // and then
        assertThat( recordingMonitor.hasCached( 0, 1 ) ).isTrue();
        assertThat( recordingMonitor.hasCached( 1, 1 ) ).isTrue();
    }

    @Test
    void shouldDisregardReusabilityMarksOnEntriesWithOldGeneration()
    {
        // given
        int oldGeneration = 1;
        int currentGeneration = 2;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 32, currentGeneration, true );
        forEachId( oldGeneration, range( 0, 8 ), range( 64, 72 ) ).accept( IdRangeMarker::markDeleted );
        // explicitly set to true because the usage pattern in this test is not quite
        atLeastOneFreeId.set( true );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( 0, 8 ), range( 64, 72 ) );
    }

    @Test
    void shouldMarkFoundIdsAsNonReusable()
    {
        // given
        long generation = 1;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, 32, generation, true );

        forEachId( generation, range( 0, 5 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertThat( reuser.reservedIds.toArray() ).isEqualTo( new long[]{0, 1, 2, 3, 4} );
    }

    @Test
    void shouldClearCache()
    {
        // given
        long generation = 1;
        IdCache cache = new IdCache( new Slot( 32, 1 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, true );
        forEachId( generation, range( 0, 5 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // when
        long cacheSizeBeforeClear = cache.size();
        scanner.clearCache( NULL );

        // then
        assertThat( cacheSizeBeforeClear ).isEqualTo( 5 );
        assertThat( cache.size() ).isZero();
        assertThat( reuser.unreservedIds ).isEqualTo( LongLists.mutable.of( 0, 1, 2, 3, 4 ) );
    }

    @Test
    void shouldNotScanWhenConcurrentClearWhenNonStrict() throws ExecutionException, InterruptedException
    {
        // given
        long generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        FreeIdScanner scanner =
                scanner( IDS_PER_ENTRY, new ControlledIdCache( QueueMethodControl.DRAIN, barrier, new Slot( 32, 1 ) ), generation, false );
        forEachId( generation, range( 0, 5 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        try ( OtherThreadExecutor clearThread = new OtherThreadExecutor( "clear" ) )
        {
            // Wait for the clear call
            Future<Object> clear = clearThread.executeDontWait( command( () -> scanner.clearCache( NULL ) ) );
            barrier.awaitUninterruptibly();

            // Attempt trigger a scan
            scanner.tryLoadFreeIdsIntoCache( false, NULL );

            // Let clear finish
            barrier.release();
            clear.get();
        }

        // then
        assertThat( cache.size() ).isZero();
    }

    @Test
    void shouldLetScanAwaitConcurrentClearWhenStrict() throws Exception
    {
        // given
        long generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, new ControlledIdCache( QueueMethodControl.DRAIN, barrier, new Slot( 8, 1 ) ), generation, true );
        forEachId( generation, range( 0, 5 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        try ( OtherThreadExecutor clearThread = new OtherThreadExecutor( "clear" );
                OtherThreadExecutor scanThread = new OtherThreadExecutor( "scan" ) )
        {
            // Wait for the clear call
            Future<Object> clear = clearThread.executeDontWait( command( () -> scanner.clearCache( NULL ) ) );
            barrier.awaitUninterruptibly();

            // Attempt trigger a scan
            Future<Void> scan = scanThread.executeDontWait( () ->
            {
                scanner.tryLoadFreeIdsIntoCache( false, NULL );
                return null;
            } );
            scanThread.waitUntilWaiting( details -> details.isAt( FreeIdScanner.class, "tryLoadFreeIdsIntoCache" ) );
            assertThat( cache.size() ).isEqualTo( 0 );

            // Let them finish
            barrier.release();
            scan.get();
            clear.get();
        }

        // then
        assertThat( cache.size() ).isEqualTo( 5 );
    }

    @Test
    void shouldLetClearCacheWaitForConcurrentScan() throws ExecutionException, InterruptedException, TimeoutException
    {
        // given
        long generation = 1;
        Barrier.Control barrier = new Barrier.Control();
        FreeIdScanner scanner =
                scanner( IDS_PER_ENTRY, new ControlledIdCache( QueueMethodControl.OFFER, barrier, new Slot( 32, 1 ) ), generation, true );
        forEachId( generation, range( 0, 1 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        try ( OtherThreadExecutor scanThread = new OtherThreadExecutor( "scan" );
              OtherThreadExecutor clearThread = new OtherThreadExecutor( "clear" ) )
        {
            // Wait for the offer call
            Future<Object> scan = scanThread.executeDontWait( command( () -> scanner.tryLoadFreeIdsIntoCache( false, NULL ) ) );
            barrier.awaitUninterruptibly();

            // Make sure clear waits for the scan call
            Future<Object> clear = clearThread.executeDontWait( command( () -> scanner.clearCache( NULL ) ) );
            clearThread.waitUntilWaiting();

            // Let the threads finish
            barrier.release();
            scan.get();
            clear.get();
        }

        // then
        assertThat( cache.size() ).isZero();
    }

    @Test
    void shouldNotSkipRangeThatIsFoundButNoCacheSpaceLeft()
    {
        // given
        long generation = 1;
        int cacheSize = IDS_PER_ENTRY / 2;
        int halfCacheSize = cacheSize / 2;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cacheSize, generation, true );
        forEachId( generation, range( 0, IDS_PER_ENTRY * 2 + 4 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIdsNonExhaustive( range( 0, halfCacheSize ) );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIdsNonExhaustive( range( halfCacheSize, cacheSize ) );

        // when
        scanner.tryLoadFreeIdsIntoCache( false, NULL );

        // then
        assertCacheHasIds( range( cacheSize, IDS_PER_ENTRY ) );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIds( range( IDS_PER_ENTRY, IDS_PER_ENTRY + cacheSize ) );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIds( range( IDS_PER_ENTRY + cacheSize, IDS_PER_ENTRY * 2 ) );
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIds( range( IDS_PER_ENTRY * 2, IDS_PER_ENTRY * 2 + 4 ) );
        assertThat( cache.takeOrDefault( -1 ) ).isEqualTo( -1 );
    }

    @Test
    void shouldEndCurrentScanInClearCache()
    {
        // given
        long generation = 1;
        int cacheSize = IDS_PER_ENTRY / 2;
        int halfCacheSize = cacheSize / 2;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cacheSize, generation, true );
        forEachId( generation, range( 0, IDS_PER_ENTRY * 2 + 4 ) ).accept( ( marker, id ) ->
        {
            marker.markDeleted( id );
            marker.markFree( id );
        } );
        scanner.tryLoadFreeIdsIntoCache( false, NULL ); // loads 0 - cacheSize
        assertCacheHasIdsNonExhaustive( range( 0, halfCacheSize ) ); // takes out 0 - cacheSize/2, which means cacheSize/2 - cacheSize is still in cache
        // simulate marking these ids as used and then delete and free them again so that they can be picked up by the scanner after clearCache
        forEachId( generation, range( 0, halfCacheSize ) ).accept( ( marker, id ) ->
        {
            marker.markUsed( id );
            marker.markDeleted( id );
            marker.markFree( id );
        } );

        // when
        scanner.clearCache( NULL ); // should clear cacheSize/2 - cacheSize
        scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertCacheHasIdsNonExhaustive( range( 0, halfCacheSize ) );
        assertCacheHasIdsNonExhaustive( range( halfCacheSize, cacheSize ) );
    }

    @Test
    void tracerPageCacheAccessOnCacheScan()
    {
        long generation = 1;
        int cacheSize = IDS_PER_ENTRY / 2;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cacheSize, generation, true );
        var pageCacheTracer = new DefaultPageCacheTracer();
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "tracerPageCacheAccessOnCacheScan" ) ) )
        {
            var cursorTracer = cursorContext.getCursorTracer();
            assertThat( cursorTracer.pins() ).isZero();
            assertThat( cursorTracer.unpins() ).isZero();
            assertThat( cursorTracer.hits() ).isZero();

            atLeastOneFreeId.set( true );
            scanner.tryLoadFreeIdsIntoCache( false, cursorContext );

            assertThat( cursorTracer.pins() ).isOne();
            assertThat( cursorTracer.unpins() ).isOne();
            assertThat( cursorTracer.hits() ).isOne();
        }
    }

    @Test
    void tracePageCacheAccessOnCacheClear()
    {
        long generation = 1;
        int cacheSize = IDS_PER_ENTRY / 2;
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cacheSize, generation, true );
        var pageCacheTracer = new DefaultPageCacheTracer();
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "tracePageCacheAccessOnCacheClear" ) ) )
        {
            var cursorTracer = cursorContext.getCursorTracer();
            assertThat( cursorTracer.pins() ).isZero();
            assertThat( cursorTracer.unpins() ).isZero();
            assertThat( cursorTracer.hits() ).isZero();

            scanner.clearCache( cursorContext );

            assertThat( cursorTracer.pins() ).isOne();
            assertThat( cursorTracer.unpins() ).isOne();
        }
    }

    @Test
    void shouldFreeSkippedHighIdsDuringScan() throws IOException
    {
        // given
        int generation = 1;
        int[] slotSizes =  {1, 2, 4};
        IdCache cache = new IdCache( evenSlotDistribution( slotSizes ).slots( 256 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, true );
        long id = 10;
        int size = 4;
        try ( IdRangeMarker marker = marker( generation, true ) )
        {
            // Let the id bridging do its thing and mark the IDs that we're testing as deleted as part of marking a higher one as used.
            marker.markUsed( id + size * 2 );
        }

        // when
        scanner.queueSkippedHighId( id, size );
        boolean idsWereFound = scanner.tryLoadFreeIdsIntoCache( false, true /*force the scan*/, NULL );
        assertThat( idsWereFound ).isTrue();

        // then
        assertThat( cache.takeOrDefault( NO_ID, size, EMPTY_ID_RANGE_CONSUMER ) ).isEqualTo( id );
    }

    @Test
    void shouldFreeSkippedHighIdsDuringScanIfScanComesFirst() throws IOException
    {
        // given
        int generation = 1;
        int[] slotSizes = {1, 2, 4};
        IdCache cache = new IdCache( evenSlotDistribution( slotSizes ).slots( 256 ) );
        FreeIdScanner scanner = scanner( IDS_PER_ENTRY, cache, generation, true );
        long id = 10;
        int size = 4;
        scanner.queueSkippedHighId( id, size );
        // Here the id range will be marked as free, although it's not yet deleted. The bridging will take care of it below when marking a higher one as used
        assertThat( scanner.tryLoadFreeIdsIntoCache( false, NULL ) ).isFalse();

        // when
        try ( IdRangeMarker marker = marker( generation, true ) )
        {
            // Let the id bridging do its thing and mark the IDs that we're testing as deleted as part of marking a higher one as used.
            marker.markUsed( id + size * 2 );
            // The scanner below won't think there are any free ids and therefore won't bother to do a scan even. Therefore delete another ID.
            marker.markDeleted( 0 );
            marker.markFree( 0 );
        }

        boolean idsWereFound = scanner.tryLoadFreeIdsIntoCache( false, NULL );
        assertThat( idsWereFound ).isTrue();

        // then
        assertThat( cache.takeOrDefault( NO_ID, size, EMPTY_ID_RANGE_CONSUMER ) ).isEqualTo( id );
    }

    private FreeIdScanner scanner( int idsPerEntry, int cacheSize, long generation, boolean strict )
    {
        return scanner( idsPerEntry, new IdCache( new Slot( cacheSize, 1 ) ), generation, strict );
    }

    private FreeIdScanner scanner( int idsPerEntry, IdCache cache, long generation, boolean strict )
    {
        this.cache = cache;
        this.reuser = new RecordingReservedMarkerProvider( tree, generation, new AtomicLong() );
        this.atLeastOneFreeId = new AtomicBoolean();
        this.recordingMonitor = new RecordingMonitor();
        return new FreeIdScanner( idsPerEntry, tree, layout, cache, atLeastOneFreeId, reuser, generation, strict, recordingMonitor );
    }

    private void assertCacheHasIdsNonExhaustive( Range... ranges )
    {
        assertCacheHasIds( false, ranges );
    }

    private void assertCacheHasIds( Range... ranges )
    {
        assertCacheHasIds( true, ranges );
    }

    private void assertCacheHasIds( boolean exhaustive, Range... ranges )
    {
        for ( Range range : ranges )
        {
            for ( long id = range.fromId; id < range.toId; id++ )
            {
                assertThat( cache.takeOrDefault( -1 ) ).isEqualTo( id );
            }
        }
        if ( exhaustive )
        {
            assertThat( cache.takeOrDefault( -1 ) ).isEqualTo( -1 );
        }
    }

    private Consumer<BiConsumer<IdRangeMarker, Long>> forEachId( long generation, Range... ranges )
    {
        return handler ->
        {
            try ( IdRangeMarker marker = marker( generation, false ) )
            {
                for ( Range range : ranges )
                {
                    range.forEach( id -> handler.accept( marker, id ) );
                }
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        };
    }

    private IdRangeMarker marker( long generation, boolean bridgeIdGaps ) throws IOException
    {
        return new IdRangeMarker( IDS_PER_ENTRY, layout, tree.writer( NULL ), mock( Lock.class ), IdRangeMerger.DEFAULT, true, atLeastOneFreeId, generation,
                new AtomicLong(), bridgeIdGaps, NO_MONITOR );
    }

    private class RecordingReservedMarkerProvider implements MarkerProvider
    {
        private final MutableLongList reservedIds = LongLists.mutable.empty();
        private final MutableLongList unreservedIds = LongLists.mutable.empty();
        private final GBPTree<IdRangeKey,IdRange> tree;
        private final long generation;
        private final AtomicLong highestWrittenId;

        RecordingReservedMarkerProvider( GBPTree<IdRangeKey,IdRange> tree, long generation, AtomicLong highestWrittenId )
        {
            this.tree = tree;
            this.generation = generation;
            this.highestWrittenId = highestWrittenId;
        }

        @Override
        public InternalMarker getMarker( CursorContext cursorContext )
        {
            InternalMarker actual = instantiateRealMarker();
            PinEvent pinEvent = cursorContext.getCursorTracer().beginPin( false, 1, mock( PageSwapper.class, RETURNS_MOCKS ) );
            pinEvent.hit();
            pinEvent.done();
            return new InternalMarker()
            {
                @Override
                public void markReserved( long id, int numberOfIds )
                {
                    actual.markReserved( id, numberOfIds );
                    for ( int i = 0; i < numberOfIds; i++ )
                    {
                        reservedIds.add( id + i );
                    }
                }

                @Override
                public void markUnreserved( long id, int numberOfIds )
                {
                    actual.markUnreserved( id, numberOfIds );
                    for ( int i = 0; i < numberOfIds; i++ )
                    {
                        unreservedIds.add( id + i );
                    }
                }

                @Override
                public void markUsed( long id, int numberOfIds )
                {
                    actual.markUsed( id, numberOfIds );
                }

                @Override
                public void markDeleted( long id, int numberOfIds )
                {
                    actual.markDeleted( id, numberOfIds );
                }

                @Override
                public void markFree( long id, int numberOfIds )
                {
                    // TODO implement tracking of these too
                    actual.markFree( id, numberOfIds );
                }

                @Override
                public void close()
                {
                    actual.close();
                }
            };
        }

        private InternalMarker instantiateRealMarker()
        {
            try
            {
                Lock lock = new ReentrantLock();
                lock.lock();
                return new IdRangeMarker( IDS_PER_ENTRY, layout, tree.writer( NULL ), lock, new IdRangeMerger( false, NO_MONITOR ), true, atLeastOneFreeId,
                        generation, highestWrittenId, false, NO_MONITOR );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }
    }

    private static Range range( long fromId, long toId )
    {
        return new Range( fromId, toId );
    }

    private static class Range
    {
        private final long fromId;
        private final long toId;

        Range( long fromId, long toId )
        {
            this.fromId = fromId;
            this.toId = toId;
        }

        void forEach( LongConsumer consumer )
        {
            for ( long id = fromId; id < toId; id++ )
            {
                consumer.accept( id );
            }
        }
    }

    private enum QueueMethodControl
    {
        TAKE,
        OFFER,
        DRAIN
    }

    private static class ControlledIdCache extends IdCache
    {
        private final QueueMethodControl method;
        private final Barrier.Control barrier;

        ControlledIdCache( QueueMethodControl method, Barrier.Control barrier, Slot... slots )
        {
            super( slots );
            this.method = method;
            this.barrier = barrier;
        }

        @Override
        void offer( PendingIdQueue pendingItemsToCache, IndexedIdGenerator.Monitor monitor )
        {
            reachBarrier( QueueMethodControl.OFFER );
            super.offer( pendingItemsToCache, monitor );
        }

        @Override
        long takeOrDefault( long defaultValue, int numberOfIds, IdRangeConsumer wastedIdConsumer )
        {
            reachBarrier( QueueMethodControl.TAKE );
            return super.takeOrDefault( defaultValue, numberOfIds, wastedIdConsumer );
        }

        @Override
        void drain( IdRangeConsumer consumer )
        {
            reachBarrier( QueueMethodControl.DRAIN );
            super.drain( consumer );
        }

        private void reachBarrier( QueueMethodControl offer )
        {
            if ( method == offer )
            {
                barrier.reached();
            }
        }
    }

    private static class RecordingMonitor extends IndexedIdGenerator.Monitor.Adapter
    {
        private final ConcurrentHashMap<Integer,MutableLongList> cached = new ConcurrentHashMap<>();

        @Override
        public void cached( long cachedId, int numberOfIds )
        {
            cached.computeIfAbsent( numberOfIds, n -> LongLists.mutable.empty() ).add( cachedId );
        }

        boolean hasCached( long cachedId, int numberOfIds )
        {
            MutableLongList list = cached.get( numberOfIds );
            return list != null && list.contains( cachedId );
        }
    }
}
