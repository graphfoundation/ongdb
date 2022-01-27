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
package org.neo4j.kernel.impl.index.schema;

import org.eclipse.collections.api.iterator.LongIterator;

import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

import org.neo4j.collection.PrimitiveLongCollections.AbstractPrimitiveLongBaseIterator;
import org.neo4j.collection.PrimitiveLongResourceIterator;
import org.neo4j.graphdb.ResourceUtils;

/**
 * A {@link LongIterator} that acts as a composition of multiple {@link LongIterator iterators},
 * merge their results lazily as iteration progresses. Has support for both {@code AND} and {@code OR} merging.
 * <p>
 * Source iterators must be sorted in ascending order.
 */
public class CompositeTokenScanValueIterator extends AbstractPrimitiveLongBaseIterator implements PrimitiveLongResourceIterator
{
    private final PriorityQueue<IdAndSource> sortedIterators = new PriorityQueue<>();
    private final int atLeastNumberOfTokens;
    private final List<PrimitiveLongResourceIterator> toClose;
    private long last = -1;

    /**
     * Constructs a {@link CompositeTokenScanValueIterator}.
     *
     * @param iterators {@link LongIterator iterators} to merge.
     * @param trueForAll if {@code true} using {@code AND} merging, otherwise {@code OR} merging.
     */
    public CompositeTokenScanValueIterator( List<PrimitiveLongResourceIterator> iterators, boolean trueForAll )
    {
        this.toClose = iterators;
        this.atLeastNumberOfTokens = trueForAll ? iterators.size() : 1;
        for ( LongIterator iterator : iterators )
        {
            if ( iterator.hasNext() )
            {
                sortedIterators.add( new IdAndSource( iterator.next(), iterator ) );
            }
        }
    }

    @Override
    protected boolean fetchNext()
    {
        int numberOfTokens = 0;
        long next = last;
        while ( next == last || numberOfTokens < atLeastNumberOfTokens )
        {
            IdAndSource idAndSource = sortedIterators.poll();
            if ( idAndSource == null )
            {
                return false;
            }

            if ( idAndSource.latestReturned == next )
            {
                numberOfTokens++;
            }
            else
            {
                next = idAndSource.latestReturned;
                numberOfTokens = 1;
            }

            if ( idAndSource.source.hasNext() )
            {
                idAndSource.latestReturned = idAndSource.source.next();
                sortedIterators.offer( idAndSource );
            }
        }
        last = next;
        next( last );
        return true;
    }

    @Override
    public void close()
    {
        ResourceUtils.closeAll( toClose );
        sortedIterators.clear();
        toClose.clear();
    }

    private static final class IdAndSource implements Comparable<IdAndSource>
    {
        private long latestReturned;
        private final LongIterator source;

        private IdAndSource( long latestReturned, LongIterator source )
        {
            this.latestReturned = latestReturned;
            this.source = source;
        }

        @Override
        public int compareTo( IdAndSource o )
        {
            int keyComparison = Long.compare( latestReturned, o.latestReturned );
            if ( keyComparison == 0 )
            {
                return Integer.compare( source.hashCode(), o.source.hashCode() );
            }
            return keyComparison;
        }

        @Override
        public boolean equals( Object o )
        {
            if ( this == o )
            {
                return true;
            }
            if ( o == null || getClass() != o.getClass() )
            {
                return false;
            }
            IdAndSource that = (IdAndSource) o;
            return compareTo( that ) == 0;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( latestReturned, source );
        }
    }
}
