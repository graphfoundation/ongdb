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

import org.neo4j.io.pagecache.monitoring.PageFileCounters;

/**
 * Tracer that receives a steady stream of events and data about what
 * mapped page file is doing.
 */
public interface PageFileSwapperTracer extends PageFileCounters
{
    PageFileSwapperTracer NULL = new NullPageFileSwapperTracer();

    /**
     * Report number of observed pins
     * @param pins number of pins
     */
    void pins( long pins );

    /**
     * Report number of observed unpins
     * @param unpins number of unpins
     */
    void unpins( long unpins );

    /**
     * Report number of observer hits
     * @param hits number of hits
     */
    void hits( long hits );

    /**
     * Report number of observed faults
     * @param faults number of faults
     */
    void faults( long faults );

    /**
     * Report number of bytes read
     * @param bytesRead number of read bytes
     */
    void bytesRead( long bytesRead );

    /**
     * Report number of observed evictions
     * @param evictions number of evictions
     */
    void evictions( long evictions );

    /**
     * Report number of eviction exceptions
     * @param evictionExceptions number of eviction exceptions
     */
    void evictionExceptions( long evictionExceptions );

    /**
     * Report number of bytes written
     * @param bytesWritten number of written bytes
     */
    void bytesWritten( long bytesWritten );

    /**
     * Report number of flushes
     * @param flushes number of flushes
     */
    void flushes( long flushes );

    /**
     * Report number of merges
     * @param merges number of merges
     */
    void merges( long merges );

    class NullPageFileSwapperTracer implements PageFileSwapperTracer
    {
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
        public long evictionExceptions()
        {
            return 0;
        }
    }
}
