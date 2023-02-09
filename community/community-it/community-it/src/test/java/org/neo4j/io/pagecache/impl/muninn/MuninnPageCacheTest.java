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

import static java.time.Duration.ofMillis;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.pagecache_buffered_flush_enabled;
import static org.neo4j.configuration.GraphDatabaseSettings.pagecache_flush_buffer_size_in_pages;
import static org.neo4j.io.pagecache.PagedFile.PF_NO_FAULT;
import static org.neo4j.io.pagecache.PagedFile.PF_NO_GROW;
import static org.neo4j.io.pagecache.PagedFile.PF_SHARED_READ_LOCK;
import static org.neo4j.io.pagecache.PagedFile.PF_SHARED_WRITE_LOCK;
import static org.neo4j.io.pagecache.PagedFile.PF_TRANSIENT;
import static org.neo4j.io.pagecache.buffer.IOBufferFactory.DISABLED_BUFFER_FACTORY;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.io.pagecache.tracing.recording.RecordingPageCacheTracer.Evict;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.function.IntSupplier;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.factory.primitive.IntSets;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.pagecache.ConfigurableIOBufferFactory;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.DelegatingFileSystemAbstraction;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.memory.ByteBuffers;
import org.neo4j.io.pagecache.DelegatingPageSwapper;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.PageCacheTest;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PageEvictionCallback;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.PageSwapperFactory;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.VersionContext;
import org.neo4j.io.pagecache.impl.SingleFilePageSwapperFactory;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.DelegatingPageCacheTracer;
import org.neo4j.io.pagecache.tracing.EvictionEvent;
import org.neo4j.io.pagecache.tracing.EvictionRunEvent;
import org.neo4j.io.pagecache.tracing.FlushEvent;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageFaultEvent;
import org.neo4j.io.pagecache.tracing.PageReferenceTranslator;
import org.neo4j.io.pagecache.tracing.PinEvent;
import org.neo4j.io.pagecache.tracing.cursor.DefaultPageCursorTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.io.pagecache.tracing.recording.RecordingPageCacheTracer;
import org.neo4j.io.pagecache.tracing.recording.RecordingPageCursorTracer;
import org.neo4j.io.pagecache.tracing.recording.RecordingPageCursorTracer.Fault;
import org.neo4j.memory.ScopedMemoryTracker;
import org.neo4j.test.Race;

public class MuninnPageCacheTest extends PageCacheTest<MuninnPageCache>
{
    private final long x = 0xCAFEBABEDEADBEEFL;
    private final long y = 0xDECAFC0FFEEDECAFL;
    private MuninnPageCacheFixture fixture;

    @Override
    protected Fixture<MuninnPageCache> createFixture()
    {
        ConfigurableIOBufferFactory bufferFactory = new ConfigurableIOBufferFactory(
                Config.defaults( pagecache_buffered_flush_enabled, true ), new ScopedMemoryTracker( INSTANCE ) );
        fixture = new MuninnPageCacheFixture();
        fixture.withBufferFactory( bufferFactory );
        return fixture;
    }

    private PageCacheTracer blockCacheFlush( PageCacheTracer delegate )
    {
        fixture.backgroundFlushLatch = new CountDownLatch( 1 );
        return new DelegatingPageCacheTracer( delegate )
        {
            @Override
            public MajorFlushEvent beginCacheFlush()
            {
                try
                {
                    fixture.backgroundFlushLatch.await();
                }
                catch ( InterruptedException e )
                {
                    Thread.currentThread().interrupt();
                }
                return super.beginCacheFlush();
            }
        };
    }

    @Test
    void countPagesToEvictOnEmptyPageCache()
    {
        try ( var pageCache = createPageCache( fs, 1024, new DefaultPageCacheTracer() ) )
        {
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 10 ) );
        }
    }

    @Test
    void countPagesToEvictOnAllPagesLocked() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            for ( int i = 0; i < maxPages; i++ )
            {
                pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
            }
            assertEquals( 12, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
        }
    }

    @Test
    void countPagesToEvictWhenLiveLocked()
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            assertThrows( CacheLiveLockException.class, () ->
            {
                for ( int i = 0; i < maxPages + 1; i++ )
                {
                    pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
                }
            } );
            assertEquals( 12, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
            assertEquals( 1024, pageCache.tryGetNumberOfPagesToEvict( 1024 ) );
        }
    }

    @Test
    void countPagesToEvictWithReleasedPages() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            long pageRef = pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
            pageCache.addFreePageToFreelist( pageRef, EvictionRunEvent.NULL );
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
        }
    }

    @Test
    void countPagesToEvictWithAllPagesAcquiredAndReleased() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            for ( int i = 0; i < maxPages; i++ )
            {
                long pageRef = pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
                pageCache.addFreePageToFreelist( pageRef, EvictionRunEvent.NULL );
            }
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
        }
    }

    @Test
    void countPagesToEvictWithPagesAcquiredSomeReleased() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            for ( int i = 0; i < maxPages - 20; i++ )
            {
                pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
            }
            for ( int i = maxPages - 20; i < maxPages; i++ )
            {
                var page = pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
                pageCache.addFreePageToFreelist( page, EvictionRunEvent.NULL );
            }

            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 20 ) );
            assertEquals( 1, pageCache.tryGetNumberOfPagesToEvict( 21 ) );
        }
    }

    @Test
    void countPagesToEvictWithPagesAcquiredOneReleasedInLoop() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            for ( int i = 0; i < maxPages - 5; i++ )
            {
                pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
            }
            for ( int i = maxPages - 5; i < maxPages; i++ )
            {
                var page = pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL );
                pageCache.addFreePageToFreelist( page, EvictionRunEvent.NULL );
            }

            assertEquals( 7, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
            assertEquals( maxPages - 5, pageCache.tryGetNumberOfPagesToEvict( maxPages ) );
        }
    }

    @Test
    void countPagesToEvictWithAllPagesAcquiredAndReleasedLater() throws IOException
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            var pages = LongLists.mutable.withInitialCapacity( maxPages );
            for ( int i = 0; i < maxPages; i++ )
            {
                pages.add( pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL ) );
            }
            pages.forEach( page -> pageCache.addFreePageToFreelist( page, EvictionRunEvent.NULL ) );

            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( maxPages ) );
            assertEquals( 1, pageCache.tryGetNumberOfPagesToEvict( maxPages + 1 ) );
        }
    }

    @Test
    void countPagesToEvictWithAllWithExceptionPagesAcquiredAndReleased()
    {
        int maxPages = 1024;
        try ( var pageCache = createPageCache( fs, maxPages, new DefaultPageCacheTracer() ) )
        {
            var pages = LongLists.mutable.withInitialCapacity( maxPages );
            assertThrows( CacheLiveLockException.class, () ->
            {
                for ( int i = 0; i <= maxPages; i++ )
                {
                    pages.add( pageCache.grabFreeAndExclusivelyLockedPage( PageFaultEvent.NULL ) );
                }
            } );
            pages.forEach( page -> pageCache.addFreePageToFreelist( page, EvictionRunEvent.NULL ) );

            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( 12 ) );
            assertEquals( -1, pageCache.tryGetNumberOfPagesToEvict( maxPages ) );
            assertEquals( 1, pageCache.tryGetNumberOfPagesToEvict( maxPages + 1 ) );
        }
    }

    @Test
    void reuseSwapperIdOnFileClose() throws IOException
    {
        try ( MuninnPageCache pageCache = createPageCache( fs, 50, new DefaultPageCacheTracer() ) )
        {
            int swapperId = pagedFileSwapperId( pageCache );
            for ( int i = 0; i < 10; i++ )
            {
                assertEquals( swapperId, pagedFileSwapperId( pageCache ) );
            }
        }
    }

    @Test
    void doNotReuseSwapperIdWhenThereAreOpenCursors() throws IOException
    {
        try ( MuninnPageCache pageCache = createPageCache( fs, 50, new DefaultPageCacheTracer() ) )
        {
            MutableIntSet swapperIds = IntSets.mutable.empty();
            ArrayList<CursorSwapperId> cursorWithIds = new ArrayList<>();
            SwapperSet swapperSet = extractSwapperSet( pageCache );

            while ( !swapperSet.skipSweep() )
            {
                CursorSwapperId cursorSwapperId = pagedFileCursorSwapperId( pageCache );
                assertTrue( swapperIds.add( cursorSwapperId.cursorId ), "swapper id with open cursors should not be reused" );

                cursorWithIds.add( cursorSwapperId );
            }

            for ( CursorSwapperId cursorWithId : cursorWithIds )
            {
                cursorWithId.pageCursor.close();
            }

            var sweeppedIds = IntSets.mutable.empty();
            swapperSet.sweep( sweeppedIds::addAll );
            for ( CursorSwapperId cursorWithId : cursorWithIds )
            {
                assertTrue( swapperIds.contains( cursorWithId.cursorId ) );
            }
        }
    }

    @Test
    void evaluateNumberOfPagesToKeepFree()
    {
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, new DefaultPageCacheTracer() ) )
        {
            assertEquals( 1, pageCache.getKeepFree() );
        }

        try ( MuninnPageCache pageCache = createPageCache( fs, 30, new DefaultPageCacheTracer() ) )
        {
            assertEquals( 15, pageCache.getKeepFree() );
        }

        try ( MuninnPageCache pageCache = createPageCache( fs, 50, new DefaultPageCacheTracer() ) )
        {
            assertEquals( 25, pageCache.getKeepFree() );
        }

        try ( MuninnPageCache pageCache = createPageCache( fs, 100, new DefaultPageCacheTracer() ) )
        {
            assertEquals( 30, pageCache.getKeepFree() );
        }

        try ( MuninnPageCache pageCache = createPageCache( fs, 10_000, new DefaultPageCacheTracer() ) )
        {
            assertEquals( 500, pageCache.getKeepFree() );
        }
    }

    @Test
    void countOpenedAndClosedCursors() throws IOException
    {
        DefaultPageCacheTracer defaultPageCacheTracer = new DefaultPageCacheTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 42, defaultPageCacheTracer ) )
        {
            int iterations = 14;
            for ( int i = 0; i < iterations; i++ )
            {
                writeInitialDataTo( file( "a" + i ) );
                try ( var cursorContext = new CursorContext( defaultPageCacheTracer.createPageCursorTracer( "countOpenedAndClosedCursors" ) );
                        PagedFile pagedFile = map( pageCache, file( "a" + i ), 8 ) )
                {
                    try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
                    {
                        assertEquals( i * 3 + 1, defaultPageCacheTracer.openedCursors() );
                        assertEquals( i * 3, defaultPageCacheTracer.closedCursors() );

                        assertTrue( cursor.next() );
                        cursor.putLong( 0L );
                    }
                    try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
                    {
                        assertEquals( i * 3 + 2, defaultPageCacheTracer.openedCursors() );
                        assertEquals( i * 3 + 1, defaultPageCacheTracer.closedCursors() );
                    }
                    try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
                    {
                        assertTrue( cursor.next() );
                        assertEquals( i * 3 + 3, defaultPageCacheTracer.openedCursors() );
                        assertEquals( i * 3 + 2, defaultPageCacheTracer.closedCursors() );
                    }
                    pagedFile.setDeleteOnClose( true );
                }
            }

            assertEquals( iterations * 3, defaultPageCacheTracer.openedCursors() );
            assertEquals( iterations * 3, defaultPageCacheTracer.closedCursors() );
        }
    }

    @Test
    void shouldBeAbleToSetDeleteOnCloseFileAfterItWasMapped() throws IOException
    {
        DefaultPageCacheTracer defaultPageCacheTracer = new DefaultPageCacheTracer();
        Path fileForDeletion = file( "fileForDeletion" );
        writeInitialDataTo( fileForDeletion );
        long initialFlushes = defaultPageCacheTracer.flushes();
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, defaultPageCacheTracer ) )
        {
            try ( var cursorContext = new CursorContext(
                    defaultPageCacheTracer.createPageCursorTracer( "shouldBeAbleToSetDeleteOnCloseFileAfterItWasMapped" ) );
                    PagedFile pagedFile = map( pageCache, fileForDeletion, 8 ) )
            {
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 0L );
                }
                pagedFile.setDeleteOnClose( true );
            }
            assertFalse( fs.fileExists( fileForDeletion ) );
            assertEquals( 0, defaultPageCacheTracer.flushes() - initialFlushes );
        }
    }

    @Test
    void ableToEvictAllPageInAPageCache() throws IOException
    {
        writeInitialDataTo( file( "a" ) );
        RecordingPageCacheTracer tracer = new RecordingPageCacheTracer();
        RecordingPageCursorTracer cursorContext = new RecordingPageCursorTracer( tracer, "ableToEvictAllPageInAPageCache" );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, blockCacheFlush( tracer ) );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext context = new CursorContext( cursorContext ) )
        {
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, context ) )
            {
                assertTrue( cursor.next() );
            }
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_READ_LOCK, context ) )
            {
                assertTrue( cursor.next() );
            }
            evictAllPages( pageCache );
        }
    }

    @Test
    void mustEvictCleanPageWithoutFlushing() throws Exception
    {
        writeInitialDataTo( file( "a" ) );
        RecordingPageCacheTracer tracer = new RecordingPageCacheTracer();
        RecordingPageCursorTracer cursorContext = new RecordingPageCursorTracer( tracer, "mustEvictCleanPageWithoutFlushing" );

        try ( MuninnPageCache pageCache = createPageCache( fs, 10, blockCacheFlush( tracer ) );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, new CursorContext( cursorContext ) ) )
            {
                assertTrue( cursor.next() );
            }
            cursorContext.reportEvents();
            assertNotNull( cursorContext.observe( Fault.class ) );
            assertEquals( 1, cursorContext.faults() );
            assertEquals( 1, tracer.faults() );

            long clockArm = pageCache.evictPages( 1, 1, tracer.beginPageEvictions( 1 ) );
            assertThat( clockArm ).isEqualTo( 1L );
            assertNotNull( tracer.observe( Evict.class ) );
        }
    }

    @Test
    void mustFlushDirtyPagesOnEvictingFirstPage() throws Exception
    {
        writeInitialDataTo( file( "a" ) );
        RecordingPageCacheTracer tracer = new RecordingPageCacheTracer();
        RecordingPageCursorTracer cursorContext = new RecordingPageCursorTracer( tracer, "mustFlushDirtyPagesOnEvictingFirstPage" );

        try ( MuninnPageCache pageCache = createPageCache( fs, 10, blockCacheFlush( tracer ) );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {

            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, new CursorContext( cursorContext ) ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 0L );
            }
            cursorContext.reportEvents();
            assertNotNull( cursorContext.observe( Fault.class ) );
            assertEquals( 1, cursorContext.faults() );
            assertEquals( 1, tracer.faults() );

            long clockArm = pageCache.evictPages( 1, 0, tracer.beginPageEvictions( 1 ) );
            assertThat( clockArm ).isEqualTo( 1L );
            assertNotNull( tracer.observe( Evict.class ) );

            ByteBuffer buf = readIntoBuffer( "a" );
            assertThat( buf.getLong() ).isEqualTo( 0L );
            assertThat( buf.getLong() ).isEqualTo( y );
        }
    }

    @Test
    void mustFlushDirtyPagesOnEvictingLastPage() throws Exception
    {
        writeInitialDataTo( file( "a" ) );
        RecordingPageCacheTracer tracer = new RecordingPageCacheTracer();
        RecordingPageCursorTracer cursorContext = new RecordingPageCursorTracer( tracer, "mustFlushDirtyPagesOnEvictingLastPage" );

        try ( MuninnPageCache pageCache = createPageCache( fs, 10, blockCacheFlush( tracer ) );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, new CursorContext( cursorContext ) ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 0L );
            }
            cursorContext.reportEvents();
            assertNotNull( cursorContext.observe( Fault.class ) );
            assertEquals( 1, cursorContext.faults() );
            assertEquals( 1, tracer.faults() );

            long clockArm = pageCache.evictPages( 1, 0, tracer.beginPageEvictions( 1 ) );
            assertThat( clockArm ).isEqualTo( 1L );
            assertNotNull( tracer.observe( Evict.class ) );

            ByteBuffer buf = readIntoBuffer( "a" );
            assertThat( buf.getLong() ).isEqualTo( x );
            assertThat( buf.getLong() ).isEqualTo( 0L );
        }
    }

    @Test
    void finishPinEventWhenOpenedWithNoFaultOption() throws IOException
    {
        writeInitialDataTo( file( "a" ) );
        DefaultPageCacheTracer cacheTracer = new DefaultPageCacheTracer( true );
        PageCursorTracer pageCursorTracer = cacheTracer.createPageCursorTracer( "finishPinEventWhenOpenedWithNoFaultOption" );
        try ( MuninnPageCache pageCache = createPageCache( fs, 4, cacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            CursorContext cursorContext = new CursorContext( pageCursorTracer );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK | PF_NO_FAULT, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertTrue( cursor.next() );
                assertFalse( cursor.next() );
            }
            assertEquals( 2, cursorContext.getCursorTracer().pins() );
            assertEquals( 2, cursorContext.getCursorTracer().unpins() );
            assertEquals( 2, pagedFile.pageFileCounters().pins() );
            assertEquals( 2, pagedFile.pageFileCounters().unpins() );
        }
    }

    @Test
    void finishPinEventReportedPerFile() throws IOException
    {
        writeInitialDataTo( file( "a" ) );
        writeInitialDataTo( file( "b" ) );
        DefaultPageCacheTracer cacheTracer = new DefaultPageCacheTracer( true );
        PageCursorTracer pageCursorTracer = cacheTracer.createPageCursorTracer( "finishPinEventReportedPerFile" );
        try ( MuninnPageCache pageCache = createPageCache( fs, 4, cacheTracer );
                PagedFile pagedFileA = map( pageCache, file( "a" ), 8 );
                PagedFile pagedFileB = map( pageCache, file( "b" ), 8 );)
        {
            CursorContext cursorContext = new CursorContext( pageCursorTracer );
            try ( PageCursor cursor = pagedFileA.io( 0, PF_SHARED_READ_LOCK | PF_NO_FAULT, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertTrue( cursor.next() );
                assertFalse( cursor.next() );
            }
            try ( PageCursor cursor = pagedFileB.io( 0, PF_SHARED_READ_LOCK | PF_NO_FAULT, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertTrue( cursor.next() );
                assertFalse( cursor.next() );
            }
            assertEquals( 4, cursorContext.getCursorTracer().pins() );
            assertEquals( 4, cursorContext.getCursorTracer().unpins() );

            assertEquals( 2, pagedFileA.pageFileCounters().pins() );
            assertEquals( 2, pagedFileA.pageFileCounters().unpins() );
            assertEquals( 2, pagedFileB.pageFileCounters().pins() );
            assertEquals( 2, pagedFileB.pageFileCounters().unpins() );
        }
    }

    @Test
    void mustFlushDirtyPagesOnEvictingAllPages() throws Exception
    {
        writeInitialDataTo( file( "a" ) );
        RecordingPageCacheTracer tracer = new RecordingPageCacheTracer();
        RecordingPageCursorTracer cursorContext = new RecordingPageCursorTracer( tracer, "mustFlushDirtyPagesOnEvictingAllPages", Fault.class );

        try ( MuninnPageCache pageCache = createPageCache( fs, 10, blockCacheFlush( tracer ) );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK | PF_NO_GROW, new CursorContext( cursorContext ) ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 0L );
                assertTrue( cursor.next() );
                cursor.putLong( 0L );
                assertFalse( cursor.next() );
            }
            cursorContext.reportEvents();
            assertNotNull( cursorContext.observe( Fault.class ) );
            assertNotNull( cursorContext.observe( Fault.class ) );
            assertEquals( 2, cursorContext.faults() );
            assertEquals( 2, tracer.faults() );

            long clockArm = pageCache.evictPages( 2, 0, tracer.beginPageEvictions( 2 ) );
            assertThat( clockArm ).isEqualTo( 2L );
            assertNotNull( tracer.observe( Evict.class ) );
            assertNotNull( tracer.observe( Evict.class ) );

            ByteBuffer buf = readIntoBuffer( "a" );
            assertThat( buf.getLong() ).isEqualTo( 0L );
            assertThat( buf.getLong() ).isEqualTo( 0L );
        }
    }

    @Test
    void trackPageModificationTransactionId() throws Exception
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 0 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 7 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }

            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                MuninnPageCursor pageCursor = (MuninnPageCursor) cursor;
                assertEquals( 7, PageList.getLastModifiedTxId( pageCursor.pinnedPageRef ) );
                assertEquals( 1, cursor.getLong() );
            }
        }
    }

    @Test
    void reportFreeListSizeToTracers() throws IOException
    {
        var pageCacheTracer = new InfoTracer();
        int maxPages = 40;
        try ( MuninnPageCache pageCache = createPageCache( fs, maxPages, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 5; pageId++ )
            {
                CursorContext cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "test" ) );
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, cursorContext ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
                assertEquals( maxPages - (pageId + 1), pageCacheTracer.getFreeListSize() );
            }
            pagedFile.flushAndForce();
        }
    }

    @Test
    void countNotModifiedPagesPerChunkWithNoBuffers() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getNotModifiedPages() ).isEqualTo( 0 );
            observedChunks.clear();

            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getNotModifiedPages() ).isEqualTo( 2 );
        }
    }

    @Test
    void flushFileWithSeveralChunks() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        int maxPages = 4096 /* chunk size */ + 250;
        int dirtyPages = 4096 + 10;
        PageSwapperFactory swapperFactory = new MultiChunkSwapperFilePageSwapperFactory( pageCacheTracer );
        try ( MuninnPageCache pageCache = createPageCache( swapperFactory, maxPages, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < dirtyPages; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 2 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getFlushPerChunk() ).isGreaterThanOrEqualTo( dirtyPages / pagecache_flush_buffer_size_in_pages.defaultValue() );
            var chunkInfo2 = observedChunks.get( 1 );
            assertThat( chunkInfo2.getFlushPerChunk() ).isGreaterThanOrEqualTo( 1 );
            observedChunks.clear();
        }
    }

    @Test
    void countNotModifiedPagesPerChunkWithBuffers() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getNotModifiedPages() ).isEqualTo( 0 );
            observedChunks.clear();

            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            // all the rest went to buffer as dirty so we do not count those as nnon modified
            assertThat( partialChunkInfo.getNotModifiedPages() ).isEqualTo( 1 );
        }
    }

    @Test
    void countFlushesPerChunkWithNoBuffers() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getFlushPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getFlushPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getFlushPerChunk() ).isEqualTo( 2 );
        }
    }

    @Test
    void countFlushesPerChunkWithBuffers() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getFlushPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getFlushPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getFlushPerChunk() ).isEqualTo( 1 );
        }
    }

    @Test
    void countMergesPerChunkWithNoBuffers() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getMergesPerChunk() ).isEqualTo( 3 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getMergesPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getMergesPerChunk() ).isEqualTo( 0 );
        }
    }

    @Test
    void countMergesPerChunkWithBuffers() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getMergesPerChunk() ).isEqualTo( 0 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getMergesPerChunk() ).isEqualTo( 0 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getMergesPerChunk() ).isEqualTo( 0 );
        }
    }

    @Test
    void countUsedBuffersPerChunkWithNoBuffers() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getBuffersPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getBuffersPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getBuffersPerChunk() ).isEqualTo( 2 );
        }
    }

    @Test
    void usedBuffersPerChunkIsAlwaysOneWithBuffers() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new InfoTracer();
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            for ( int pageId = 0; pageId < 4; pageId++ )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
            }
            pagedFile.flushAndForce();

            // we flushed one big region
            var observedChunks = pageCacheTracer.getObservedChunks();
            assertThat( observedChunks ).hasSize( 1 );
            var chunkInfo = observedChunks.get( 0 );
            assertThat( chunkInfo.getBuffersPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush one smaller region in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            var secondFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( secondFlushChunks ).hasSize( 1 );
            var partialChunkInfo = secondFlushChunks.get( 0 );
            assertThat( partialChunkInfo.getBuffersPerChunk() ).isEqualTo( 1 );
            observedChunks.clear();

            // we flush 2 regions in the middle
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();
            var thirdFlushChunks = pageCacheTracer.getObservedChunks();
            assertThat( thirdFlushChunks ).hasSize( 1 );
            var thirdChunkInfo = thirdFlushChunks.get( 0 );
            assertThat( thirdChunkInfo.getBuffersPerChunk() ).isEqualTo( 1 );
        }
    }

    @Test
    void flushSequentialPagesOnPageFileFlushWithNoBuffers() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new DefaultPageCacheTracer( true );
        try ( MuninnPageCache pageCache = createPageCache( fs, 4, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            assertEquals( 2, pageCacheTracer.flushes() );
            assertEquals( 1, pageCacheTracer.merges() );
            assertEquals( 2, pagedFile.pageFileCounters().flushes() );
            assertEquals( 1, pagedFile.pageFileCounters().merges() );
        }
    }

    @Test
    void flushSequentialPagesOnPageFileFlushWithNoBuffersWithMultipleFiles() throws IOException
    {
        assumeTrue( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        writeInitialDataTo( file( "a" ) );
        writeInitialDataTo( file( "b" ) );
        var pageCacheTracer = new DefaultPageCacheTracer( true );
        try ( MuninnPageCache pageCache = createPageCache( fs, 4, pageCacheTracer );
                PagedFile pagedFileA = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) );
                PagedFile pagedFileB = map( pageCache, file( "b" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            try ( PageCursor cursor = pagedFileA.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFileA.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFileA.flushAndForce();

            try ( PageCursor cursor = pagedFileB.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFileB.flushAndForce();

            assertEquals( 3, pageCacheTracer.flushes() );
            assertEquals( 1, pageCacheTracer.merges() );
            assertEquals( 2, pagedFileA.pageFileCounters().flushes() );
            assertEquals( 1, pagedFileA.pageFileCounters().merges() );
            assertEquals( 1, pagedFileB.pageFileCounters().flushes() );
            assertEquals( 0, pagedFileB.pageFileCounters().merges() );
        }
    }

    @Test
    void flushSequentialPagesOnPageFileFlushWithBuffers() throws IOException
    {
        assumeFalse( DISABLED_BUFFER_FACTORY.equals( fixture.getBufferFactory() ) );
        var pageCacheTracer = new DefaultPageCacheTracer( true );
        try ( MuninnPageCache pageCache = createPageCache( fs, 4, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 2, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            assertEquals( 2, pageCacheTracer.flushes() );
            assertEquals( 0, pageCacheTracer.merges() );
            assertEquals( 2, pagedFile.pageFileCounters().flushes() );
            assertEquals( 0, pagedFile.pageFileCounters().merges() );
        }
    }

    @Test
    void doNotMergeNonSequentialPageBuffersOnPageFileFlush() throws IOException
    {
        var pageCacheTracer = new DefaultPageCacheTracer( true );
        try ( MuninnPageCache pageCache = createPageCache( fs, 6, pageCacheTracer );
                PagedFile pagedFile = map( pageCache, file( "a" ), (int) ByteUnit.kibiBytes( 8 ) ) )
        {
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 3, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            pagedFile.flushAndForce();

            assertEquals( 2, pageCacheTracer.flushes() );
            assertEquals( 0, pageCacheTracer.merges() );
            assertEquals( 2, pagedFile.pageFileCounters().flushes() );
            assertEquals( 0, pagedFile.pageFileCounters().merges() );
        }
    }

    @Test
    void pageModificationTrackingNoticeWriteFromAnotherThread() throws Exception
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 0 );
        CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            versionContext.initWrite( 7 );

            Future<?> future = executor.submit( () ->
            {
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 1 );
                }
                catch ( IOException e )
                {
                    throw new RuntimeException( e );
                }
            } );
            future.get();

            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                MuninnPageCursor pageCursor = (MuninnPageCursor) cursor;
                assertEquals( 7, PageList.getLastModifiedTxId( pageCursor.pinnedPageRef ) );
                assertEquals( 1, cursor.getLong() );
            }
        }
    }

    @Test
    void pageModificationTracksHighestModifierTransactionId() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 0 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 1 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 1 );
            }
            versionContext.initWrite( 12 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 2 );
            }
            versionContext.initWrite( 7 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 3 );
            }

            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                MuninnPageCursor pageCursor = (MuninnPageCursor) cursor;
                assertEquals( 12, PageList.getLastModifiedTxId( pageCursor.pinnedPageRef ) );
                assertEquals( 3, cursor.getLong() );
            }
        }
    }

    @Test
    void markCursorContextDirtyWhenRepositionCursorOnItsCurrentPage() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 3 );
        CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            versionContext.initRead();
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next( 0 ) );
                assertFalse( versionContext.isDirty() );

                MuninnPageCursor pageCursor = (MuninnPageCursor) cursor;
                PageList.setLastModifiedTxId( ((MuninnPageCursor) cursor).pinnedPageRef, 17 );

                assertTrue( cursor.next( 0 ) );
                assertTrue( versionContext.isDirty() );
            }
        }
    }

    @Test
    void markCursorContextAsDirtyWhenReadingDataFromMoreRecentTransactions() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 3 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 7 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 3 );
            }

            versionContext.initRead();
            assertFalse( versionContext.isDirty() );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertEquals( 3, cursor.getLong() );
                assertTrue( versionContext.isDirty() );
            }
        }
    }

    @Test
    void doNotMarkCursorContextAsDirtyWhenReadingDataFromOlderTransactions() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 23 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 17 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 3 );
            }

            versionContext.initRead();
            assertFalse( versionContext.isDirty() );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertEquals( 3, cursor.getLong() );
                assertFalse( versionContext.isDirty() );
            }
        }
    }

    @Test
    void markContextAsDirtyWhenAnyEvictedPageHaveModificationTransactionHigherThenReader() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 5 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 3 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 3 );
            }

            versionContext.initWrite( 13 );
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 4 );
            }

            evictAllPages( pageCache );

            versionContext.initRead();
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertEquals( 3, cursor.getLong() );
                assertTrue( versionContext.isDirty() );
            }
        }
    }

    @Test
    void doNotMarkContextAsDirtyWhenAnyEvictedPageHaveModificationTransactionLowerThenReader() throws IOException
    {
        TestVersionContext versionContext = new TestVersionContext( () -> 15 );
        try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 );
                CursorContext cursorContext = new CursorContext( PageCursorTracer.NULL, versionContext ) )
        {
            versionContext.initWrite( 3 );
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 3 );
            }

            versionContext.initWrite( 13 );
            try ( PageCursor cursor = pagedFile.io( 1, PF_SHARED_WRITE_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                cursor.putLong( 4 );
            }

            evictAllPages( pageCache );

            versionContext.initRead();
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, cursorContext ) )
            {
                assertTrue( cursor.next() );
                assertEquals( 3, cursor.getLong() );
                assertFalse( versionContext.isDirty() );
            }
        }
    }

    @Test
    void closingTheCursorMustUnlockModifiedPage() throws Exception
    {
        writeInitialDataTo( file( "a" ) );

        try ( MuninnPageCache pageCache = createPageCache( fs, 10, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            Future<?> task = executor.submit( () ->
            {
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putLong( 41 );
                }
                catch ( IOException e )
                {
                    throw new RuntimeException( e );
                }
            } );
            task.get();

            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                long value = cursor.getLong();
                cursor.setOffset( 0 );
                cursor.putLong( value + 1 );
            }

            long clockArm = pageCache.evictPages( 1, 0, EvictionRunEvent.NULL );
            assertThat( clockArm ).isEqualTo( 1L );

            ByteBuffer buf = readIntoBuffer( "a" );
            assertThat( buf.getLong() ).isEqualTo( 42L );
            assertThat( buf.getLong() ).isEqualTo( y );
        }
    }

    @Test
    void mustUnblockPageFaultersWhenEvictionGetsException()
    {
        assertTimeoutPreemptively( ofMillis( SEMI_LONG_TIMEOUT_MILLIS ), () ->
        {
            writeInitialDataTo( file( "a" ) );

            MutableBoolean throwException = new MutableBoolean( true );
            FileSystemAbstraction fs = new DelegatingFileSystemAbstraction( this.fs )
            {
                @Override
                public StoreChannel open( Path fileName, Set<OpenOption> options ) throws IOException
                {
                    return new DelegatingStoreChannel( super.open( fileName, options ) )
                    {
                        @Override
                        public void writeAll( ByteBuffer src, long position ) throws IOException
                        {
                            if ( throwException.booleanValue() )
                            {
                                throw new IOException( "uh-oh..." );
                            }
                            else
                            {
                                super.writeAll( src, position );
                            }
                        }
                    };
                }
            };

            try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL );
                    PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
            {
                // The basic idea is that this loop, which will encounter a lot of page faults, must not block forever even
                // though the eviction thread is unable to flush any dirty pages because the file system throws
                // exceptions on all writes.
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    for ( int i = 0; i < 1000; i++ )
                    {
                        assertTrue( cursor.next() );
                    }
                    fail( "Expected an exception at this point" );
                }
                catch ( IOException ignore )
                {
                    // Good.
                }

                throwException.setFalse();
            }
        } );
    }

    @RepeatedTest( 50 )
    void racePageFileCloseAndEviction()
    {
        assertTimeoutPreemptively( ofMillis( SEMI_LONG_TIMEOUT_MILLIS ), () ->
        {
            assumeTrue(
                    fs.getClass() == EphemeralFileSystemAbstraction.class,
                    "This test is very slow on real file system" );

            var pages = 10;
            try ( MuninnPageCache pageCache = createPageCache( fs, 2, PageCacheTracer.NULL ) )
            {
                var race = new Race();
                race.addContestant( Race.throwing( () ->
                                                   {
                                                       try
                                                       {
                                                           for ( int i = 0; i < 1000; i++ )
                                                           {
                                                               try ( PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
                                                               {
                                                                   try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                                                                   {
                                                                       for ( int k = 0; k < pages; k++ )
                                                                       {
                                                                           cursor.next();
                                                                           cursor.putLong( 101010101 );
                                                                       }
                                                                   }
                                                               }
                                                           }
                                                       }
                                                       catch ( CacheLiveLockException ignore )
                                                       {
                                                       }
                                                       finally
                                                       {
                                                           // to stop the other contestant
                                                           pageCache.close();
                                                       }
                                                   } ) );
                race.addContestant( Race.throwing( () ->
                                                   {
                                                       try ( var evictionRunEvent = PageCacheTracer.NULL.beginPageEvictions( 1000 ) )
                                                       {
                                                           pageCache.evictPages( 1000, 0, evictionRunEvent );
                                                       }
                                                   } ) );
                race.go();
            }
        } );
    }

    @Test
    void pageCacheFlushAndForceMustClearBackgroundEvictionException()
    {
        assertTimeoutPreemptively( ofMillis( SEMI_LONG_TIMEOUT_MILLIS ), () ->
        {
            MutableBoolean throwException = new MutableBoolean( true );
            FileSystemAbstraction fs = new DelegatingFileSystemAbstraction( this.fs )
            {
                @Override
                public StoreChannel open( Path fileName, Set<OpenOption> options ) throws IOException
                {
                    return new DelegatingStoreChannel( super.open( fileName, options ) )
                    {
                        @Override
                        public void writeAll( ByteBuffer src, long position ) throws IOException
                        {
                            if ( throwException.booleanValue() )
                            {
                                throw new IOException( "uh-oh..." );
                            }
                            else
                            {
                                super.writeAll( src, position );
                            }
                        }
                    };
                }
            };

            try ( MuninnPageCache pageCache = createPageCache( fs, 10, PageCacheTracer.NULL );
                    PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
            {
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() ); // Page 0 is now dirty, but flushing it will throw an exception.
                }

                // This will run into that exception, in background eviction:
                pageCache.evictPages( 1, 0, EvictionRunEvent.NULL );

                // We now have a background eviction exception. A successful flushAndForce should clear it, though.
                throwException.setFalse();
                pageCache.flushAndForce();

                // And with a cleared exception, we should be able to work with the page cache without worry.
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    for ( int i = 0; i < maxPages * 20; i++ )
                    {
                        assertTrue( cursor.next() );
                    }
                }
            }
        } );
    }

    @Test
    void mustThrowIfMappingFileWouldOverflowReferenceCount()
    {
        assertTimeoutPreemptively( ofMillis( SEMI_LONG_TIMEOUT_MILLIS ), () ->
        {
            Path file = file( "a" );
            writeInitialDataTo( file );
            try ( MuninnPageCache pageCache = createPageCache( fs, 30, PageCacheTracer.NULL ) )
            {
                PagedFile pf = null;
                int i = 0;

                try
                {
                    for ( ; i < Integer.MAX_VALUE; i++ )
                    {
                        pf = map( pageCache, file, filePageSize );
                    }
                    fail("Failure was expected");
                }
                catch ( IllegalStateException ile )
                {
                    // expected
                }
                finally
                {
                    for ( int j = 0; j < i; j++ )
                    {
                        try
                        {
                            pf.close();
                        }
                        catch ( Exception e )
                        {
                            //noinspection ThrowFromFinallyBlock
                            throw new AssertionError( "Did not expect pf.close() to throw", e );
                        }
                    }
                }
            }
        } );
    }

    @Test
    void unlimitedShouldFlushInParallel()
    {
        assertTimeoutPreemptively( ofMillis( SEMI_LONG_TIMEOUT_MILLIS ), () ->
        {
            List<Path> mappedFiles = new ArrayList<>();
            mappedFiles.add( existingFile( "a" ) );
            mappedFiles.add( existingFile( "b" ) );
            getPageCache( fs, maxPages, new FlushRendezvousTracer( mappedFiles.size() ) );

            List<PagedFile> mappedPagedFiles = new ArrayList<>();
            for ( Path mappedFile : mappedFiles )
            {
                PagedFile pagedFile = map( pageCache, mappedFile, filePageSize );
                mappedPagedFiles.add( pagedFile );
                try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                {
                    assertTrue( cursor.next() );
                    cursor.putInt( 1 );
                }
            }

            pageCache.flushAndForce();

            IOUtils.closeAll( mappedPagedFiles );
        } );
    }

    @Test
    void transientCursorShouldNotUpdateUsageCounter() throws IOException
    {
        try ( MuninnPageCache pageCache = createPageCache( fs, 40, PageCacheTracer.NULL );
                PagedFile pagedFile = map( pageCache, file( "a" ), 8 ) )
        {
            PageList pages = pageCache.pages;
            long zeroPageRef = pages.deref( 0 );

            // Pretend to read some data
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                assertThat( PageList.getUsage( zeroPageRef ) ).isEqualTo( 1 );
            }
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, NULL ) )
            {
                assertTrue( cursor.next() );
                assertThat( PageList.getUsage( zeroPageRef ) ).isEqualTo( 2 );
            }

            // Using transient cursors should not update usage
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK | PF_TRANSIENT, NULL ) )
            {
                assertTrue( cursor.next() );
                assertThat( PageList.getUsage( zeroPageRef ) ).isEqualTo( 2 );
            }
            try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK | PF_TRANSIENT, NULL ) )
            {
                assertTrue( cursor.next() );
                assertThat( PageList.getUsage( zeroPageRef ) ).isEqualTo( 2 );
            }
        }
    }

    @Test
    void shouldDealWithOutOfBoundsWithRetries() throws IOException
    {
        try ( var pageCache = createPageCache( fs, 1024, new DefaultPageCacheTracer() ) )
        {
            Path file = existingFile( "a" );
            writeInitialDataTo( file );
            try ( PagedFile pagedFile = map( pageCache, file, 8 ) )
            {
                try ( PageCursor readCursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, NULL ) )
                {
                    //Given
                    assertThat( readCursor.next( 0 ) ).isTrue();
                    readCursor.setOffset( -256 ); //Note negative page offset
                    //When (common pattern for reading)
                    boolean first = true;
                    readCursor.mark();
                    do
                    {
                        readCursor.setOffsetToMark();
                        readCursor.getLong();
                        if ( first )
                        {
                            //Pretend some concurrent write, will trigger a retry for the read cursor
                            try ( PageCursor writeCursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL ) )
                            {
                                writeCursor.next( 0 );
                                writeCursor.putLong( 1 );
                            }
                            first = false;
                        }
                    }
                    while ( readCursor.shouldRetry() );

                    //Then
                    assertThat( readCursor.checkAndClearBoundsFlag() ).isTrue();
                }
            }
        }
    }

    private static class FlushRendezvousTracer extends DefaultPageCacheTracer
    {
        private final CountDownLatch latch;

        FlushRendezvousTracer( int fileCountToWaitFor )
        {
            latch = new CountDownLatch( fileCountToWaitFor );
        }

        @Override
        public MajorFlushEvent beginFileFlush( PageSwapper swapper )
        {
            latch.countDown();
            try
            {
                latch.await();
            }
            catch ( InterruptedException e )
            {
                e.printStackTrace();
            }
            return MajorFlushEvent.NULL;
        }
    }

    private static void evictAllPages( MuninnPageCache pageCache ) throws IOException
    {
        PageList pages = pageCache.pages;
        for ( int pageId = 0; pageId < pages.getPageCount(); pageId++ )
        {
            long pageReference = pages.deref( pageId );
            while ( PageList.isLoaded( pageReference ) )
            {
                pages.tryEvict( pageReference, EvictionRunEvent.NULL );
            }
        }
        for ( int pageId = 0; pageId < pages.getPageCount(); pageId++ )
        {
            long pageReference = pages.deref( pageId );
            pageCache.addFreePageToFreelist( pageReference, EvictionRunEvent.NULL );
        }
    }

    private void writeInitialDataTo( Path path ) throws IOException
    {
        try ( StoreChannel channel = fs.write( path ) )
        {
            ByteBuffer buf = ByteBuffers.allocate( 16, INSTANCE );
            buf.putLong( x );
            buf.putLong( y );
            buf.flip();
            channel.writeAll( buf );
        }
    }

    private int pagedFileSwapperId( MuninnPageCache pageCache ) throws IOException
    {
        try ( MuninnPagedFile pagedFile = (MuninnPagedFile) map( pageCache, file( "a" ), 8 ) )
        {
            return pagedFile.swapperId;
        }
    }

    private CursorSwapperId pagedFileCursorSwapperId( MuninnPageCache pageCache ) throws IOException
    {
        try ( MuninnPagedFile pagedFile = (MuninnPagedFile) map( pageCache, file( "a" ), 8 ) )
        {
            PageCursor pageCursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, NULL );
            pageCursor.next();
            return new CursorSwapperId( pageCursor, pagedFile.swapperId );
        }
    }

    private ByteBuffer readIntoBuffer( String fileName ) throws IOException
    {
        ByteBuffer buffer = ByteBuffers.allocate( 16, INSTANCE );
        try ( StoreChannel channel = fs.read( file( fileName ) ) )
        {
            channel.readAll( buffer );
        }
        buffer.flip();
        return buffer;
    }

    private SwapperSet extractSwapperSet( MuninnPageCache pageCache ) throws IOException
    {
        try ( var pagedFile = (MuninnPagedFile) map( pageCache, file( "a" ), 8 ) )
        {
            return pagedFile.getSwappers();
        }
    }

    private static class CursorSwapperId implements AutoCloseable
    {
        private final PageCursor pageCursor;
        private final int cursorId;

        CursorSwapperId( PageCursor pageCursor, int cursorId )
        {
            this.pageCursor = pageCursor;
            this.cursorId = cursorId;
        }

        public int getCursorId()
        {
            return cursorId;
        }

        @Override
        public void close() throws Exception
        {
            pageCursor.close();
        }
    }

    private static class TestVersionContext implements VersionContext
    {

        private final IntSupplier closedTxIdSupplier;
        private long committingTxId;
        private long lastClosedTxId;
        private boolean dirty;

        TestVersionContext( IntSupplier closedTxIdSupplier )
        {
            this.closedTxIdSupplier = closedTxIdSupplier;
        }

        @Override
        public void initRead()
        {
            this.lastClosedTxId = closedTxIdSupplier.getAsInt();
        }

        @Override
        public void initWrite( long committingTxId )
        {
            this.committingTxId = committingTxId;
        }

        @Override
        public long committingTransactionId()
        {
            return committingTxId;
        }

        @Override
        public long lastClosedTransactionId()
        {
            return lastClosedTxId;
        }

        @Override
        public void markAsDirty()
        {
            dirty = true;
        }

        @Override
        public boolean isDirty()
        {
            return dirty;
        }
    }

    private static class InfoTracer extends DefaultPageCacheTracer
    {
        private final CopyOnWriteArrayList<ChunkInfo> observedChunks = new CopyOnWriteArrayList<>();
        private volatile int freeListSize;

        public CopyOnWriteArrayList<ChunkInfo> getObservedChunks()
        {
            return observedChunks;
        }

        public int getFreeListSize()
        {
            return freeListSize;
        }

        @Override
        public PageCursorTracer createPageCursorTracer( String tag )
        {
            return new InfoPageCursorTracer( this, tag );
        }

        @Override
        public MajorFlushEvent beginFileFlush( PageSwapper swapper )
        {
            return new FlushInfoMajorFlushEvent();
        }

        private class InfoPageCursorTracer extends DefaultPageCursorTracer
        {
            InfoPageCursorTracer( PageCacheTracer pageCacheTracer, String tag )
            {
                super( pageCacheTracer, tag );
            }

            @Override
            public PinEvent beginPin( boolean writeLock, long filePageId, PageSwapper swapper )
            {
                return new PinEvent()
                {
                    @Override
                    public void setCachePageId( long cachePageId )
                    {

                    }

                    @Override
                    public PageFaultEvent beginPageFault( long filePageId, PageSwapper swapper )
                    {
                        return new PageFaultEvent()
                        {
                            @Override
                            public void addBytesRead( long bytes )
                            {

                            }

                            @Override
                            public void setCachePageId( long cachePageId )
                            {

                            }

                            @Override
                            public void done()
                            {

                            }

                            @Override
                            public void fail( Throwable throwable )
                            {

                            }

                            @Override
                            public void freeListSize( int listSize )
                            {
                                freeListSize = listSize;
                            }

                            @Override
                            public EvictionEvent beginEviction( long cachePageId )
                            {
                                return null;
                            }
                        };
                    }

                    @Override
                    public void hit()
                    {

                    }

                    @Override
                    public void done()
                    {

                    }
                };
            }
        }

        private class FlushInfoMajorFlushEvent implements MajorFlushEvent
        {

            @Override
            public void close()
            {
                // nothing
            }

            @Override
            public FlushEvent beginFlush( long[] pageRefs, PageSwapper swapper, PageReferenceTranslator pageReferenceTranslator, int pagesToFlush,
                    int mergedPages )
            {
                return FlushEvent.NULL;
            }

            @Override
            public FlushEvent beginFlush( long pageRef, PageSwapper swapper, PageReferenceTranslator pageReferenceTranslator )
            {
                return FlushEvent.NULL;
            }

            @Override
            public void startFlush( int[][] translationTable )
            {
            }

            @Override
            public ChunkEvent startChunk( int[] chunk )
            {
                return new FlushInfoChunk();
            }

            @Override
            public void throttle( long millis )
            {
            }

            @Override
            public void reportIO( int completedIOs )
            {
            }
        }

        private class FlushInfoChunk extends MajorFlushEvent.ChunkEvent
        {
            @Override
            public void chunkFlushed( long notModifiedPages, long flushPerChunk, long buffersPerChunk, long mergesPerChunk )
            {
                var chunkInfo = new ChunkInfo( notModifiedPages, flushPerChunk, buffersPerChunk, mergesPerChunk );
                observedChunks.add( chunkInfo );
            }
        }

        private static class ChunkInfo
        {
            private final long notModifiedPages;
            private final long flushPerChunk;
            private final long buffersPerChunk;
            private final long mergesPerChunk;

            public long getNotModifiedPages()
            {
                return notModifiedPages;
            }

            public long getFlushPerChunk()
            {
                return flushPerChunk;
            }

            public long getBuffersPerChunk()
            {
                return buffersPerChunk;
            }

            public long getMergesPerChunk()
            {
                return mergesPerChunk;
            }

            ChunkInfo( long notModifiedPages, long flushPerChunk, long buffersPerChunk, long mergesPerChunk )
            {
                this.notModifiedPages = notModifiedPages;
                this.flushPerChunk = flushPerChunk;
                this.buffersPerChunk = buffersPerChunk;
                this.mergesPerChunk = mergesPerChunk;
            }
        }
    }

    private class MultiChunkSwapperFilePageSwapperFactory extends SingleFilePageSwapperFactory
    {
        MultiChunkSwapperFilePageSwapperFactory( PageCacheTracer pageCacheTracer )
        {
            super( MuninnPageCacheTest.this.fs, pageCacheTracer );
        }

        @Override
        public PageSwapper createPageSwapper( Path file, int filePageSize, PageEvictionCallback onEviction, boolean createIfNotExist, boolean useDirectIO,
                boolean preallocateStoreFiles, IOController ioController, SwapperSet swappers ) throws IOException
        {
            return new DelegatingPageSwapper(
                    super.createPageSwapper( file, filePageSize, onEviction, createIfNotExist, useDirectIO, preallocateStoreFiles, ioController, swappers ) )
            {
                @Override
                public long write( long startFilePageId, long[] bufferAddresses, int[] bufferLengths, int length, int totalAffectedPages ) throws IOException
                {
                    int flushedDataSize = 0;
                    for ( int i = 0; i < length; i++ )
                    {
                        flushedDataSize += bufferLengths[i];
                    }
                    assertThat( totalAffectedPages * filePageSize )
                            .describedAs( "Number of affected pages multiplied by page size should be equal to size of buffers we want to flush" )
                            .isEqualTo( flushedDataSize );
                    return super.write( startFilePageId, bufferAddresses, bufferLengths, length, totalAffectedPages );
                }
            };
        }
    }
}
