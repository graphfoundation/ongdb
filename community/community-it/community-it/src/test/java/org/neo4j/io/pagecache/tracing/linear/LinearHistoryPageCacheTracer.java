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
package org.neo4j.io.pagecache.tracing.linear;

import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.tracing.EvictionRunEvent;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageFileSwapperTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;

import static org.neo4j.io.pagecache.tracing.linear.HEvents.EvictionRunHEvent;
import static org.neo4j.io.pagecache.tracing.linear.HEvents.MajorFlushHEvent;
import static org.neo4j.io.pagecache.tracing.linear.HEvents.MappedFileHEvent;
import static org.neo4j.io.pagecache.tracing.linear.HEvents.UnmappedFileHEvent;

/**
 * Tracer for global page cache events that add all of them to event history tracer that can build proper linear
 * history across all tracers.
 * Only use this for debugging internal data race bugs and the like, in the page cache.
 * @see HEvents
 * @see LinearHistoryPageCursorTracer
 */
public final class LinearHistoryPageCacheTracer implements PageCacheTracer
{

    private final LinearHistoryTracer tracer;

    LinearHistoryPageCacheTracer( LinearHistoryTracer tracer )
    {
        this.tracer = tracer;
    }

    @Override
    public PageFileSwapperTracer createFileSwapperTracer()
    {
        return PageFileSwapperTracer.NULL;
    }

    @Override
    public PageCursorTracer createPageCursorTracer( String tag )
    {
        return new LinearHistoryPageCursorTracer( tracer, tag );
    }

    @Override
    public void mappedFile( int swapperId, PagedFile pagedFile )
    {
        tracer.add( new MappedFileHEvent( pagedFile.path() ) );
    }

    @Override
    public void unmappedFile( int swapperId, PagedFile pagedFile )
    {
        tracer.add( new UnmappedFileHEvent( pagedFile.path() ) );
    }

    @Override
    public EvictionRunEvent beginPageEvictions( int pageCountToEvict )
    {
        return tracer.add( new EvictionRunHEvent( tracer, pageCountToEvict ) );
    }

    @Override
    public EvictionRunEvent beginEviction()
    {
        return tracer.add( new EvictionRunHEvent( tracer, 0 ) );
    }

    @Override
    public MajorFlushEvent beginFileFlush( PageSwapper swapper )
    {
        return tracer.add( new MajorFlushHEvent( tracer, swapper.path() ) );
    }

    @Override
    public MajorFlushEvent beginCacheFlush()
    {
        return tracer.add( new MajorFlushHEvent( tracer, null ) );
    }

    @Override
    public long faults()
    {
        return 0;
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
    public long pins()
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
    }

    @Override
    public void bytesRead( long bytesRead )
    {
    }

    @Override
    public void evictions( long evictions )
    {
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
}
