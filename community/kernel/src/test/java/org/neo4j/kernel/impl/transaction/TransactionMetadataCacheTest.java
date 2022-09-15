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
package org.neo4j.kernel.impl.transaction;

import org.junit.jupiter.api.Test;

import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.TransactionMetadataCache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TransactionMetadataCacheTest
{
    @Test
    void shouldReturnNullWhenMissingATxInTheCache()
    {
        // given
        final TransactionMetadataCache cache = new TransactionMetadataCache();

        // when
        final TransactionMetadataCache.TransactionMetadata metadata = cache.getTransactionMetadata( 42 );

        // then
        assertNull( metadata );
    }

    @Test
    void shouldReturnTheTxValueTIfInTheCached()
    {
        // given
        final TransactionMetadataCache cache = new TransactionMetadataCache();
        final LogPosition position = new LogPosition( 3, 4 );
        final int txId = 42;

        // when
        cache.cacheTransactionMetadata( txId, position );
        final TransactionMetadataCache.TransactionMetadata metadata = cache.getTransactionMetadata( txId );

        // then
        assertEquals( new TransactionMetadataCache.TransactionMetadata( position ), metadata );
    }

    @Test
    void shouldThrowWhenCachingATxWithNegativeOffsetPosition()
    {
        // given
        final TransactionMetadataCache cache = new TransactionMetadataCache();
        final LogPosition position = new LogPosition( 3, -1 );
        final int txId = 42;

        var e = assertThrows( RuntimeException.class, () -> cache.cacheTransactionMetadata( txId, position ) );
        assertEquals( "StartEntry.position is " + position, e.getMessage() );
    }

    @Test
    void shouldClearTheCache()
    {
        // given
        final TransactionMetadataCache cache = new TransactionMetadataCache();
        final LogPosition position = new LogPosition( 3, 4 );
        final int txId = 42;

        // when
        cache.cacheTransactionMetadata( txId, position );
        cache.clear();
        final TransactionMetadataCache.TransactionMetadata metadata = cache.getTransactionMetadata( txId );

        // then
        assertNull( metadata );
    }
}
