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
package org.neo4j.index.internal.gbptree;

import java.io.IOException;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;

import static org.neo4j.index.internal.gbptree.PageCursorUtil.checkOutOfBounds;
import static org.neo4j.index.internal.gbptree.PageCursorUtil.goTo;

class FreeListIdProvider implements IdProvider
{
    interface Monitor
    {
        /**
         * Called when a page id was acquired for storing released ids into.
         *
         * @param freelistPageId page id of the acquired page.
         */
        default void acquiredFreelistPageId( long freelistPageId )
        {   // Empty by default
        }

        /**
         * Called when a free-list page was released due to all its ids being acquired.
         * A released free-list page ends up in the free-list itself.
         *
         * @param freelistPageId page if of the released page.
         */
        default void releasedFreelistPageId( long freelistPageId )
        {   // Empty by default
        }
    }

    static final Monitor NO_MONITOR = new Monitor()
    {   // Empty
    };

    private final PagedFile pagedFile;

    /**
     * {@link FreelistNode} governs physical layout of a free-list.
     */
    private final FreelistNode freelistNode;

    /**
     * There's one free-list which both stable and unstable state (the state pages A/B) shares.
     * Each free list page links to a potential next free-list page, by using the last entry containing
     * page id to the next.
     * <p>
     * Each entry in the the free list consist of a page id and the generation in which it was freed.
     * <p>
     * Read pointer cannot go beyond entries belonging to stable generation.
     * About the free-list id/offset variables below:
     * <pre>
     * Every cell in picture contains generation, page id is omitted for briefness.
     * StableGeneration   = 1
     * UnstableGeneration = 2
     *
     *        {@link #readPos}                         {@link #writePos}
     *        v                               v
     *  ┌───┬───┬───┬───┬───┬───┐   ┌───┬───┬───┬───┬───┬───┐
     *  │ 1 │ 1 │ 1 │ 2 │ 2 │ 2 │-->│ 2 │ 2 │   │   │   │   │
     *  └───┴───┴───┴───┴───┴───┘   └───┴───┴───┴───┴───┴───┘
     *  ^                           ^
     *  {@link #readPageId}                  {@link #writePageId}
     * </pre>
     */
    private volatile long writePageId;
    private volatile long readPageId;
    private volatile int writePos;
    private volatile int readPos;

    /**
     * Last allocated page id, used for allocating new ids as more data gets inserted into the tree.
     */
    private volatile long lastId;

    /**
     * For monitoring internal free-list activity.
     */
    private final Monitor monitor;

    FreeListIdProvider( PagedFile pagedFile, long lastId )
    {
        this( pagedFile, lastId, NO_MONITOR );
    }

    FreeListIdProvider( PagedFile pagedFile, long lastId, Monitor monitor )
    {
        this.pagedFile = pagedFile;
        this.monitor = monitor;
        this.freelistNode = new FreelistNode( pagedFile.pageSize() );
        this.lastId = lastId;
    }

    void initialize( long lastId, long writePageId, long readPageId, int writePos, int readPos )
    {
        this.lastId = lastId;
        this.writePageId = writePageId;
        this.readPageId = readPageId;
        this.writePos = writePos;
        this.readPos = readPos;
    }

    void initializeAfterCreation( CursorContext cursorContext ) throws IOException
    {
        // Allocate a new free-list page id and set both write/read free-list page id to it.
        writePageId = nextLastId();
        readPageId = writePageId;

        try ( PageCursor cursor = pagedFile.io( writePageId, PagedFile.PF_SHARED_WRITE_LOCK, cursorContext ) )
        {
            goTo( cursor, "free-list", writePageId );
            FreelistNode.initialize( cursor );
            checkOutOfBounds( cursor );
        }
    }

    @Override
    public long acquireNewId( long stableGeneration, long unstableGeneration, CursorContext cursorContext ) throws IOException
    {
        try ( PageCursor cursor = pagedFile.io( 0, PagedFile.PF_SHARED_WRITE_LOCK, cursorContext ) )
        {
            return acquireNewId( cursor, stableGeneration, unstableGeneration, true, cursorContext );
        }
    }

    private long acquireNewId( PageCursor cursor, long stableGeneration, long unstableGeneration, boolean allowTakeLastFromPage, CursorContext cursorContext )
            throws IOException
    {
        // Acquire id from free-list or end of store file
        long acquiredId = acquireNewIdFromFreelistOrEnd( cursor, stableGeneration, unstableGeneration, allowTakeLastFromPage, cursorContext );

        // Zap the page, i.e. set all bytes to zero
        goTo( cursor, "newly allocated free-list page", acquiredId );
        cursor.zapPage();
        // don't initialize node here since this acquisition can be used both for tree nodes
        // as well as free-list nodes.
        return acquiredId;
    }

    private long acquireNewIdFromFreelistOrEnd( PageCursor cursor, long stableGeneration, long unstableGeneration, boolean allowTakeLastFromPage,
            CursorContext cursorContext ) throws IOException
    {
        if ( (readPageId != writePageId || readPos < writePos) &&
                (allowTakeLastFromPage || readPos < freelistNode.maxEntries() - 1) )
        {
            // It looks like reader isn't even caught up to the writer page-wise,
            // or the read pos is < write pos so check if we can grab the next id (generation could still mismatch).
            goTo( cursor, "Free-list read page ", readPageId );

            long resultPageId = freelistNode.read( cursor, stableGeneration, readPos );

            if ( resultPageId != FreelistNode.NO_PAGE_ID )
            {
                // FreelistNode compares generation and so this means that we have an available
                // id in the free list which we can acquire from a stable generation. Increment readPos
                readPos++;
                if ( readPos >= freelistNode.maxEntries() )
                {
                    // The current reader page is exhausted, go to the next free-list page.
                    readPos = 0;
                    readPageId = FreelistNode.next( cursor );

                    // Put the exhausted free-list page id itself on the free-list
                    long exhaustedFreelistPageId = cursor.getCurrentPageId();
                    releaseId( stableGeneration, unstableGeneration, exhaustedFreelistPageId, cursorContext );
                    monitor.releasedFreelistPageId( exhaustedFreelistPageId );
                }
                return resultPageId;
            }
        }

        // Fall-back to acquiring at the end of the file
        return nextLastId();
    }

    private long nextLastId()
    {
        return ++lastId;
    }

    @Override
    public void releaseId( long stableGeneration, long unstableGeneration, long id, CursorContext cursorContext ) throws IOException
    {
        try ( PageCursor cursor = pagedFile.io( writePageId, PagedFile.PF_SHARED_WRITE_LOCK, cursorContext ) )
        {
            PageCursorUtil.goTo( cursor, "free-list write page", writePageId );
            freelistNode.write( cursor, unstableGeneration, id, writePos );
            writePos++;

            if ( writePos >= freelistNode.maxEntries() )
            {
                // Current free-list write page is full, allocate a new one.
                long nextFreelistPage = acquireNewId( cursor, stableGeneration, unstableGeneration, false, cursorContext );
                PageCursorUtil.goTo( cursor, "free-list write page", writePageId );
                FreelistNode.initialize( cursor );
                // Link previous --> new writer page
                FreelistNode.setNext( cursor, nextFreelistPage );
                writePageId = nextFreelistPage;
                writePos = 0;
                monitor.acquiredFreelistPageId( nextFreelistPage );
            }
        }
    }

    @Override
    public void visitFreelist( IdProviderVisitor visitor, CursorContext cursorContext ) throws IOException
    {
        if ( readPageId == FreelistNode.NO_PAGE_ID )
        {
            return;
        }

        try ( PageCursor cursor = pagedFile.io( 0, PagedFile.PF_SHARED_READ_LOCK, cursorContext ) )
        {
            GenerationKeeper generation = new GenerationKeeper();
            long prevPage;
            long pageId = readPageId;
            int pos = readPos;
            do
            {
                PageCursorUtil.goTo( cursor, "free-list", pageId );
                visitor.beginFreelistPage( pageId );
                int targetPos = pageId == writePageId ? writePos : freelistNode.maxEntries();
                while ( pos < targetPos )
                {
                    // Read next un-acquired id
                    long unacquiredId;
                    do
                    {
                        unacquiredId = freelistNode.read( cursor, Long.MAX_VALUE, pos, generation );
                    }
                    while ( cursor.shouldRetry() );
                    visitor.freelistEntry( unacquiredId, generation.generation, pos );
                    pos++;
                }
                visitor.endFreelistPage( pageId );

                prevPage = pageId;
                pos = 0;
                do
                {
                    pageId = FreelistNode.next( cursor );
                }
                while ( cursor.shouldRetry() );
            }
            while ( prevPage != writePageId );
        }
    }

    @Override
    public long lastId()
    {
        return lastId;
    }

    long writePageId()
    {
        return writePageId;
    }

    long readPageId()
    {
        return readPageId;
    }

    int writePos()
    {
        return writePos;
    }

    int readPos()
    {
        return readPos;
    }

    // test-access method
    int entriesPerPage()
    {
        return freelistNode.maxEntries();
    }
}
