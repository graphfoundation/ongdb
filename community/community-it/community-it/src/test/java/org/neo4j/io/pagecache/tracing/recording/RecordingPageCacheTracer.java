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
package org.neo4j.io.pagecache.tracing.recording;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.tracing.EvictionEvent;
import org.neo4j.io.pagecache.tracing.EvictionRunEvent;
import org.neo4j.io.pagecache.tracing.FlushEvent;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageFileSwapperTracer;
import org.neo4j.io.pagecache.tracing.PageReferenceTranslator;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;

public class RecordingPageCacheTracer extends RecordingTracer implements PageCacheTracer
{
    private final AtomicLong pins = new AtomicLong();
    private final AtomicLong faults = new AtomicLong();
    private final AtomicLong evictions = new AtomicLong();

    public RecordingPageCacheTracer()
    {
        super( Evict.class );
    }

    @Override
    public PageFileSwapperTracer createFileSwapperTracer()
    {
        return PageFileSwapperTracer.NULL;
    }

    @Override
    public PageCursorTracer createPageCursorTracer( String tag )
    {
        return new RecordingPageCursorTracer( this, tag );
    }

    @Override
    public void mappedFile( int swapperId, PagedFile pagedFile )
    {
        // we currently do not record these
    }

    @Override
    public void unmappedFile( int swapperId, PagedFile pagedFile )
    {
        // we currently do not record these
    }

    @Override
    public EvictionRunEvent beginPageEvictions( int pageCountToEvict )
    {
        return getEvictionRunEvent();
    }

    @Override
    public EvictionRunEvent beginEviction()
    {
        return getEvictionRunEvent();
    }

    private EvictionRunEvent getEvictionRunEvent()
    {
        return new EvictionRunEvent()
        {
            @Override
            public void freeListSize( int size )
            {
                // empty
            }

            @Override
            public EvictionEvent beginEviction( long cachePageId )
            {
                return new RecordingEvictionEvent();
            }

            @Override
            public void close()
            {
            }
        };
    }

    @Override
    public MajorFlushEvent beginFileFlush( PageSwapper swapper )
    {
        return MajorFlushEvent.NULL;
    }

    @Override
    public MajorFlushEvent beginCacheFlush()
    {
        return MajorFlushEvent.NULL;
    }

    @Override
    public long faults()
    {
        return faults.get();
    }

    @Override
    public long pins()
    {
        return pins.get();
    }

    @Override
    public long evictions()
    {
        return 0;
    }

    @Override
    public long cooperativeEvictions()
    {
        return 0;
    }

    @Override
    public long unpins()
    {
        return 0;
    }

    @Override
    public long hits()
    {
        return 0;
    }

    @Override
    public long flushes()
    {
        return 0;
    }

    @Override
    public long merges()
    {
        return 0;
    }

    @Override
    public long bytesRead()
    {
        return 0;
    }

    @Override
    public long bytesWritten()
    {
        return 0;
    }

    @Override
    public long filesMapped()
    {
        return 0;
    }

    @Override
    public long filesUnmapped()
    {
        return 0;
    }

    @Override
    public long evictionExceptions()
    {
        return 0;
    }

    @Override
    public double hitRatio()
    {
        return 0d;
    }

    @Override
    public double usageRatio()
    {
        return 0d;
    }

    @Override
    public long iopqPerformed()
    {
        return 0;
    }

    @Override
    public long ioLimitedTimes()
    {
        return 0;
    }

    @Override
    public long ioLimitedMillis()
    {
        return 0;
    }

    @Override
    public long openedCursors()
    {
        return 0;
    }

    @Override
    public long closedCursors()
    {
        return 0;
    }

    @Override
    public void pins( long pins )
    {
        this.pins.getAndAdd( pins );
    }

    @Override
    public void unpins( long unpins )
    {
    }

    @Override
    public void hits( long hits )
    {
    }

    @Override
    public void faults( long faults )
    {
        this.faults.getAndAdd( faults );
    }

    @Override
    public void bytesRead( long bytesRead )
    {
    }

    @Override
    public void evictions( long evictions )
    {
        this.evictions.getAndAdd( evictions );
    }

    @Override
    public void cooperativeEvictions( long evictions )
    {
    }

    @Override
    public void evictionExceptions( long evictionExceptions )
    {
    }

    @Override
    public void bytesWritten( long bytesWritten )
    {
    }

    @Override
    public void flushes( long flushes )
    {
    }

    @Override
    public void merges( long merges )
    {
    }

    @Override
    public void maxPages( long maxPages, long pageSize )
    {
    }

    @Override
    public void iopq( long iopq )
    {
    }

    @Override
    public void limitIO( long millis )
    {
    }

    @Override
    public void closeCursor()
    {
    }

    @Override
    public void openCursor()
    {
    }

    private void evicted( long filePageId, PageSwapper swapper )
    {
        record( new Evict( swapper, filePageId ) );
    }

    public static class Evict extends Event
    {
        private Evict( PageSwapper io, long pageId )
        {
            super( io, pageId );
        }
    }

    private class RecordingEvictionEvent implements EvictionEvent
    {
        private long filePageId;
        private PageSwapper swapper;

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
        public FlushEvent beginFlush( long pageRef, PageSwapper swapper, PageReferenceTranslator pageTranslator )
        {
            return FlushEvent.NULL;
        }

        @Override
        public void threwException( IOException exception )
        {
        }

        @Override
        public void close()
        {
            evicted( filePageId, swapper );
        }
    }
}
