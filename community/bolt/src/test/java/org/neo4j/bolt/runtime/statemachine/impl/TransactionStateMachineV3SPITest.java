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
package org.neo4j.bolt.runtime.statemachine.impl;

import org.junit.jupiter.api.Test;

import java.util.List;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseServiceSPI;
import org.neo4j.bolt.dbapi.BoltQueryExecutor;
import org.neo4j.bolt.dbapi.BoltTransaction;
import org.neo4j.bolt.dbapi.BookmarkMetadata;
import org.neo4j.bolt.runtime.BoltResultHandle;
import org.neo4j.bolt.runtime.Bookmark;
import org.neo4j.bolt.runtime.statemachine.StatementProcessorReleaseManager;
import org.neo4j.bolt.v3.runtime.TransactionStateMachineV3SPI;
import org.neo4j.bolt.v3.runtime.bookmarking.BookmarkWithPrefix;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.values.virtual.MapValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class TransactionStateMachineV3SPITest
{

    @Test
    void shouldNotCheckDatabaseIdInBookmark()
    {
        // Given
        var dbSpi = mock( BoltGraphDatabaseServiceSPI.class );
        var spi = new TestAbstractTransactionStateMachineSPI( dbSpi, mock( BoltChannel.class ), mock( SystemNanoClock.class ),
                                                              mock( StatementProcessorReleaseManager.class ), "123" );

        var bookmarks = List.<Bookmark>of( new BookmarkWithPrefix( 42L ) );

        // When
        spi.beginTransaction( null, null, bookmarks, null, null, null, null);

        // Then
        verify( dbSpi ).beginTransaction( any(), any(),any(), eq(bookmarks), any(), any(), any(), any());
    }

    @Test
    void shouldReturnBookmarkWithPrefix()
    {
        // Given
        var dbSpi = mock( BoltGraphDatabaseServiceSPI.class );
        var tx = mock( BoltTransaction.class );

        when( tx.getBookmarkMetadata() ).thenReturn( new BookmarkMetadata( 42L ) );
        var spi = new TestAbstractTransactionStateMachineSPI( dbSpi, mock( BoltChannel.class ), mock( SystemNanoClock.class ),
                                                              mock( StatementProcessorReleaseManager.class ), "123" );

        // When
        var bookmark = spi.newestBookmark( tx );

        // Then
        verify( tx ).getBookmarkMetadata();
        assertThat( bookmark ).isInstanceOf( BookmarkWithPrefix.class );
        assertEquals( 42L, bookmark.txId() );
    }

    @Test
    void shouldFailWhenGivenMultipleBookmarks()
    {
        var dbSpi = mock( BoltGraphDatabaseServiceSPI.class );
        var spi = new TestAbstractTransactionStateMachineSPI( dbSpi, mock( BoltChannel.class ), mock( SystemNanoClock.class ),
                                                              mock( StatementProcessorReleaseManager.class ), "123" );

        var bookmarks = List.<Bookmark>of( new BookmarkWithPrefix( 42L ), new BookmarkWithPrefix( 4242L ) );

        assertThrows( IllegalArgumentException.class, () ->
                spi.beginTransaction( null, null, bookmarks, null, null, null, null) );
    }

    private static class TestAbstractTransactionStateMachineSPI extends TransactionStateMachineV3SPI
    {
        TestAbstractTransactionStateMachineSPI( BoltGraphDatabaseServiceSPI boltGraphDatabaseServiceSPI, BoltChannel boltChannel, SystemNanoClock clock,
                                                StatementProcessorReleaseManager resourceReleaseManager, String txId )
        {
            super( boltGraphDatabaseServiceSPI, boltChannel, clock, resourceReleaseManager, txId );
        }

        @Override
        protected BoltResultHandle newBoltResultHandle( String statement, MapValue params, BoltQueryExecutor boltQueryExecutor )
        {
            return mock( BoltResultHandle.class );
        }
    }
}
