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

import java.io.IOException;
import java.io.UncheckedIOException;

import org.neo4j.graphdb.Resource;
import org.neo4j.index.internal.gbptree.Seeker;
import org.neo4j.internal.schema.IndexOrder;
import org.neo4j.kernel.api.index.EntityRange;
import org.neo4j.kernel.api.index.IndexProgressor;

/**
 * {@link IndexProgressor} which steps over multiple {@link TokenScanValue} and for each
 * iterate over each set bit, returning actual entity ids, i.e. {@code entityIdRange+bitOffset}.
 *
 */
public class TokenScanValueIndexProgressor extends TokenScanValueIndexAccessor implements IndexProgressor, Resource
{
    private final EntityTokenClient client;
    private final IndexOrder indexOrder;
    private final EntityRange range;

    TokenScanValueIndexProgressor( Seeker<TokenScanKey,TokenScanValue> cursor, EntityTokenClient client, IndexOrder indexOrder, EntityRange range )
    {
        super( cursor );
        this.client = client;
        this.indexOrder = indexOrder;
        this.range = range;
    }

    /**
     *  Progress through the index until the next accepted entry.
     *
     *  Progress the cursor to the current {@link TokenScanValue}, if this is not accepted by the client or if current
     *  value has been exhausted it continues to the next {@link TokenScanValue} by progressing the {@link Seeker}.
     * @return <code>true</code> if it found an accepted entry, <code>false</code> otherwise
     */
    @Override
    public boolean next()
    {
        for ( ; ; )
        {
            while ( bits != 0 )
            {
                long idForClient;
                if ( indexOrder != IndexOrder.DESCENDING )
                {
                    // The next idForClient can be found at the next 1-bit from the right.
                    int delta = Long.numberOfTrailingZeros( bits );

                    // We switch that bit to zero, so that we don't find it again the next time.
                    // First, create a mask where that bit is zero (easiest by subtracting 1) and then &
                    // it with bits.
                    bits &= bits - 1;
                    idForClient = baseEntityId + delta;
                }
                else
                {
                    // The next idForClient can be found at the next 1-bit from the left.
                    int delta = Long.numberOfLeadingZeros( bits );

                    // We switch that bit to zero, so that we don't find it again the next time.
                    // First, create a mask where only set bit is set (easiest by bitshifting the number one),
                    // and then invert the mask and then & it with bits.
                    long bitToZeroe = 1L << (Long.SIZE - delta - 1);
                    bits &= ~bitToZeroe;
                    idForClient = (baseEntityId + Long.SIZE) - 1 - delta;
                }

                if ( isInRange( idForClient ) && client.acceptEntity( idForClient, null ) )
                {
                    return true;
                }
            }
            try
            {
                if ( !cursor.next() )
                {
                    close();
                    return false;
                }
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }

            TokenScanKey key = cursor.key();
            baseEntityId = key.idRange * TokenScanValue.RANGE_SIZE;
            bits = cursor.value().bits;

            //noinspection AssertWithSideEffects
            assert keysInOrder( key, indexOrder );
        }
    }

    /**
     * The entity information in token indexes is stored in a collection of 64 bit bitmaps,
     * The index seek with specified range has a bitmap granularity.
     * In other words, the range of entity IDs coming from the index seeker corresponds to the search range with
     * start of the range rounded down to the nearest multiple of 64 and the end of the range rounded up to the nearest multiple of 64.
     * The purpose of this method is to filter out the extra entity IDs that are present in the seek result because of the rounding.
     */
    private boolean isInRange( long entityId )
    {
        return entityId >= range.fromInclusive && entityId < range.toExclusive;
    }
}
