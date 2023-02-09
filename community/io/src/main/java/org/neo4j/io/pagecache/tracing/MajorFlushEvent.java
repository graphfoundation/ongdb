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
package org.neo4j.io.pagecache.tracing;

import org.neo4j.io.pagecache.PageSwapper;

/**
 * Begin a mass-flushing of pages.
 */
public interface MajorFlushEvent extends AutoCloseablePageCacheTracerEvent
{
    /**
     * A MajorFlushEvent that only returns the FlushEventOpportunity.NULL.
     */
    MajorFlushEvent NULL = new MajorFlushEvent()
    {

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
            return ChunkEvent.NULL;
        }

        @Override
        public void throttle( long millis )
        {

        }

        @Override
        public void reportIO( int completedIOs )
        {

        }

        @Override
        public void close()
        {
        }
    };

    /**
     * Begin flushing the given pages.
     */
    FlushEvent beginFlush( long[] pageRefs, PageSwapper swapper, PageReferenceTranslator pageReferenceTranslator, int pagesToFlush, int mergedPages );

    /**
     * Begin flushing the given single page.
     */
    FlushEvent beginFlush( long pageRef, PageSwapper swapper, PageReferenceTranslator pageReferenceTranslator );

    /**
     * Start flushing of given translation table
     * @param translationTable table we flush
     */
    void startFlush( int[][] translationTable );

    /**
     * Start flushing of given chunk
     * @param chunk chunk we start flushing
     */
    ChunkEvent startChunk( int[] chunk );

    /**
     * Throttle this flush event
     * @param millis millis to throttle this flush event
     */
    void throttle( long millis );

    /**
     * Report number of completed io operations by this flush event
     * @param completedIOs number of completed io operations
     */
    void reportIO( int completedIOs );

    /**
     * Event generated during translation table chunk flushing from memory to backing file
     */
    class ChunkEvent
    {
        public static final ChunkEvent NULL = new ChunkEvent();

        protected ChunkEvent()
        {
        }

        public void chunkFlushed( long notModifiedPages, long flushPerChunk, long buffersPerChunk, long mergesPerChunk )
        {
        }
    }
}
