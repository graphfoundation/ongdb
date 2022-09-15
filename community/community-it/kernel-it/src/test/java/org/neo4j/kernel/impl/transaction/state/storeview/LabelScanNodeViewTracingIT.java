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

import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.api.index.StoreScan;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.coreapi.schema.IndexDefinitionImpl;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.lock.LockService;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;

import static java.util.stream.StreamSupport.stream;
import static org.apache.commons.lang3.RandomStringUtils.randomAscii;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@DbmsExtension
class LabelScanNodeViewTracingIT
{
    @Inject
    private GraphDatabaseAPI database;
    @Inject
    private StorageEngine storageEngine;
    @Inject
    private LockService lockService;
    @Inject
    private JobScheduler jobScheduler;
    @Inject
    private IndexingService indexingService;

    @Test
    void tracePageCacheAccess() throws Exception
    {
        int nodeCount = 1000;
        var label = Label.label( "marker" );
        try ( var tx = database.beginTx() )
        {
            for ( int i = 0; i < nodeCount; i++ )
            {
                var node = tx.createNode( label );
                node.setProperty( "a", randomAscii( 10 ) );
            }
            tx.commit();
        }

        var labelId = getLabelId( label );

        var cacheTracer = new DefaultPageCacheTracer();
        IndexProxy indexProxy = indexingService.getIndexProxy( findTokenIndex() );

        var scan = new LabelIndexedNodeStoreScan( Config.defaults(), storageEngine.newReader(), storageEngine::createStorageCursors, lockService,
                indexProxy.newTokenReader(), new TestTokenScanConsumer(), null, new int[]{labelId}, any -> false, false, jobScheduler, cacheTracer,
                INSTANCE );
        scan.run( StoreScan.NO_EXTERNAL_UPDATES );

        assertThat( cacheTracer.pins() ).isEqualTo( 102 );
        assertThat( cacheTracer.unpins() ).isEqualTo( 102 );
        assertThat( cacheTracer.hits() ).isEqualTo( 102 );
    }

    private int getLabelId( Label label )
    {
        try ( var tx = database.beginTx() )
        {
            return ((InternalTransaction)tx).kernelTransaction().tokenRead().nodeLabel( label.name() );
        }
    }

    private IndexDescriptor findTokenIndex()
    {
        try ( Transaction tx = database.beginTx() )
        {
            var nodeIndex = stream( tx.schema().getIndexes().spliterator(), false )
                    .map( indexDef -> ((IndexDefinitionImpl) indexDef).getIndexReference() )
                    .filter( index -> index.isTokenIndex() && index.schema().entityType() == EntityType.NODE ).findFirst();
            assertTrue( nodeIndex.isPresent() );
            return nodeIndex.get();
        }
    }
}
