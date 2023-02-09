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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.Test;

import org.neo4j.counts.CountsAccessor;
import org.neo4j.counts.CountsStore;
import org.neo4j.internal.counts.RelationshipGroupDegreesStore;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.token.api.TokenConstants.ANY_LABEL;

class CountsStoreTransactionApplierTest
{
    @Test
    void shouldNotifyCacheAccessOnHowManyUpdatesOnCountsWeHadSoFar() throws Exception
    {
        // GIVEN
        final CountsStore counts = mock( CountsStore.class );
        final CountsAccessor.Updater updater = mock( CountsAccessor.Updater.class );
        when( counts.apply( anyLong(), any( CursorContext.class ) ) ).thenReturn( updater );
        final RelationshipGroupDegreesStore groupDegreesStore = mock( RelationshipGroupDegreesStore.class );
        when( groupDegreesStore.apply( anyLong(), any( CursorContext.class ) ) ).thenReturn( mock( RelationshipGroupDegreesStore.Updater.class ) );
        final CountsStoreTransactionApplierFactory applier = new CountsStoreTransactionApplierFactory( counts, groupDegreesStore );

        // WHEN
        try ( TransactionApplier txApplier = applier.startTx( new GroupOfCommands( 2L, StoreCursors.NULL ), mock( BatchContext.class ) ) )
        {
            txApplier.visitNodeCountsCommand( new Command.NodeCountsCommand( ANY_LABEL, 1 ) );
        }

        // THEN
        verify( updater ).incrementNodeCount( ANY_LABEL, 1 );
    }
}
