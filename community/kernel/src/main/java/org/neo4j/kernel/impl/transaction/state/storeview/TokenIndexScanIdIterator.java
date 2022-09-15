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
package org.neo4j.kernel.impl.transaction.state.storeview;

import org.eclipse.collections.api.iterator.LongIterator;
import org.eclipse.collections.api.set.primitive.LongSet;

import java.util.NoSuchElementException;

import org.neo4j.collection.PrimitiveLongResourceIterator;
import org.neo4j.internal.kernel.api.TokenPredicate;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexOrder;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.index.EntityRange;
import org.neo4j.kernel.api.index.IndexProgressor;
import org.neo4j.kernel.api.index.TokenIndexReader;
import org.neo4j.kernel.impl.index.schema.CompositeTokenScanValueIterator;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;

public class TokenIndexScanIdIterator implements EntityIdIterator
{
    private final TokenIndexReader tokenIndexReader;
    private final CursorContext cursorContext;
    private PrimitiveLongResourceIterator idIterator;
    private long lastReturnedId = -1;
    private final int[] tokenIds;

    TokenIndexScanIdIterator( TokenIndexReader tokenIndexReader, int[] tokenIds, CursorContext cursorContext )
    {
        this.tokenIndexReader = tokenIndexReader;
        this.cursorContext = cursorContext;
        this.tokenIds = tokenIds;
        this.idIterator = createIdIterator( EntityRange.FULL, tokenIds );
    }

    @Override
    public long next()
    {
        long next = idIterator.next();
        lastReturnedId = next;
        return next;
    }

    @Override
    public boolean hasNext()
    {
        return idIterator.hasNext();
    }

    @Override
    public void close()
    {
        idIterator.close();
    }

    @Override
    public void invalidateCache()
    {
        this.idIterator.close();
        this.idIterator = createIdIterator( EntityRange.from( lastReturnedId + 1 ), tokenIds );
    }

    private CompositeTokenScanValueIterator createIdIterator( EntityRange range, int[] tokenIds )
    {
        return new CompositeTokenScanValueIterator(
                stream( tokenIds ).mapToObj( token -> new QueryResultIterator( range, token ) ).collect( toList() ), false );
    }

    private class QueryResultIterator implements PrimitiveLongResourceIterator
    {
        private final SimpleProgressorClient client;

        QueryResultIterator( EntityRange entityRange, int tokenId )
        {
            this.client = new SimpleProgressorClient();
            tokenIndexReader.query( client, unconstrained(), new TokenPredicate( tokenId ), entityRange, cursorContext );
        }

        @Override
        public long next()
        {
            return client.next();
        }

        @Override
        public boolean hasNext()
        {
            return client.hasNext();
        }

        @Override
        public void close()
        {
            client.close();
        }
    }

    private static class SimpleProgressorClient implements IndexProgressor.EntityTokenClient, AutoCloseable
    {
        private long entityId;
        private IndexProgressor progressor;
        private boolean hasNextDecided;
        private boolean hasNext;

        @Override
        public void initialize( IndexProgressor progressor, int token, IndexOrder order )
        {
            // seek
            this.progressor = progressor;
        }

        @Override
        public void initialize( IndexProgressor progressor, int token, LongIterator added, LongSet removed, AccessMode accessMode )
        {
            // used for scan
            throw new UnsupportedOperationException();
        }

        public long next()
        {
            if ( !hasNextDecided && !hasNext() )
            {
                throw new NoSuchElementException( "No more elements in " + this );
            }
            hasNextDecided = false;

            return entityId;
        }

        public boolean hasNext()
        {
            if ( hasNextDecided )
            {
                return hasNext;
            }

            hasNext = progressor.next();
            hasNextDecided = true;
            return hasNext;
        }

        @Override
        public boolean acceptEntity( long reference, TokenSet tokens )
        {
            this.entityId = reference;
            return true;
        }

        @Override
        public void close()
        {
            progressor.close();
        }
    }
}
