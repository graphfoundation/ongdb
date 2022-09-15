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

import org.junit.jupiter.api.Test;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.api.index.IndexingService.IndexProxyProvider;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.lock.LockService;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class IndexStoreViewFactoryTest
{
    FullScanStoreView fullScanStoreView = mock( FullScanStoreView.class );
    LockService lockService = mock( LockService.class );
    LogProvider logProvider = mock( LogProvider.class );
    IndexProxyProvider indexProxies = mock( IndexProxyProvider.class );
    Locks locks = mock( Locks.class);

    @Test
    void shouldCreateIndexStoreView()
    {
        //Given
        var factory = new IndexStoreViewFactory( Config.defaults(), any -> StoreCursors.NULL, () -> null, locks, fullScanStoreView, lockService, logProvider );

        //When
        var indexStoreView = factory.createTokenIndexStoreView( indexProxies );

        //Then
        assertThat( indexStoreView.getClass() ).isEqualTo( DynamicIndexStoreView.class );
    }
}
