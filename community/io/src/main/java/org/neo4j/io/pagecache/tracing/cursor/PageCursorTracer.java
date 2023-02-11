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
package org.neo4j.io.pagecache.tracing.cursor;

import java.io.Closeable;

import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.tracing.PinEvent;

import static org.apache.commons.lang3.StringUtils.EMPTY;

/**
 * Event tracer for page cursors.
 *
 * Performs event tracing related to particular page cursors and expose simple counters around them.
 * Since events of each particular page cursor are part of whole page cache events, each particular page cursor
 * tracer will eventually report them to global page cache counters/tracers.
 *
 * @see PageCursorTracer
 */
public interface PageCursorTracer extends PageCursorCounters, Closeable
{
    PageCursorTracer NULL = new PageCursorTracer()
    {
        @Override
        public long faults()
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
        public long bytesRead()
        {
            return 0;
        }

        @Override
        public long evictions()
        {
            return 0;
        }

        @Override
        public long evictionExceptions()
        {
            return 0;
        }

        @Override
        public long bytesWritten()
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
        public double hitRatio()
        {
            return 0d;
        }

        @Override
        public PinEvent beginPin( boolean writeLock, long filePageId, PageSwapper swapper )
        {
            return PinEvent.NULL;
        }

        @Override
        public void reportEvents()
        {

        }

        @Override
        public String getTag()
        {
            return EMPTY;
        }

        @Override
        public void closeCursor()
        {
        }

        @Override
        public void merge( PageCursorTracer cursorTracer )
        {
        }
    };

    PinEvent beginPin( boolean writeLock, long filePageId, PageSwapper swapper );

    /**
     * Report to global page cache tracer events observed by current page cursor tracer.
     * As soon as any event will be reported, page cursor tracer reset corresponding counters and completely forgets
     * about all of them except for accumulated counterparts.
     */
    void reportEvents();

    /**
     * @return page cursor tracer tag
     */
    String getTag();

    @Override
    default void close()
    {
        reportEvents();
    }

    /**
     * Page cache cursor closed
     */
    void closeCursor();

    /**
     * Merge values collected by another tracer into current.
     * @param cursorTracer tracer with externally collected data
     */
    void merge( PageCursorTracer cursorTracer );
}
