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
package org.neo4j.kernel.impl.store;

import java.util.function.Function;

import org.neo4j.common.ProgressReporter;
import org.neo4j.counts.CountsAccessor;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.NodeCountsStage;
import org.neo4j.internal.batchimport.RelationshipCountsStage;
import org.neo4j.internal.batchimport.cache.NodeLabelsCache;
import org.neo4j.internal.batchimport.cache.NumberArrayFactories;
import org.neo4j.internal.batchimport.cache.NumberArrayFactory;
import org.neo4j.internal.counts.CountsBuilder;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.logging.Log;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.internal.batchimport.cache.NumberArrayFactories.NO_MONITOR;
import static org.neo4j.internal.batchimport.staging.ExecutionSupervisors.superviseDynamicExecution;

public class CountsComputer implements CountsBuilder
{
    private final NeoStores neoStores;
    private final NodeStore nodes;
    private final RelationshipStore relationships;
    private final int highLabelId;
    private final int highRelationshipTypeId;
    private final long lastCommittedTransactionId;
    private final DatabaseLayout databaseLayout;
    private final ProgressReporter progressMonitor;
    private final NumberArrayFactory numberArrayFactory;
    private final PageCacheTracer pageCacheTracer;
    private final MemoryTracker memoryTracker;

    public CountsComputer( NeoStores stores, PageCache pageCache, PageCacheTracer pageCacheTracer, DatabaseLayout databaseLayout,
            MemoryTracker memoryTracker, Log log )
    {
        this( stores, stores.getMetaDataStore().getLastCommittedTransactionId(), stores.getNodeStore(), stores.getRelationshipStore(),
                (int) stores.getLabelTokenStore().getHighId(), (int) stores.getRelationshipTypeTokenStore().getHighId(),
                NumberArrayFactories.auto( pageCache, pageCacheTracer, databaseLayout.databaseDirectory(), true, NO_MONITOR, log,
                                databaseLayout.getDatabaseName() ), databaseLayout, ProgressReporter.SILENT, pageCacheTracer, memoryTracker );
    }

    public CountsComputer( NeoStores stores, long lastCommittedTransactionId, NodeStore nodes, RelationshipStore relationships, int highLabelId,
            int highRelationshipTypeId, NumberArrayFactory numberArrayFactory, DatabaseLayout databaseLayout, ProgressReporter progressMonitor,
            PageCacheTracer pageCacheTracer, MemoryTracker memoryTracker )
    {
        this.neoStores = stores;
        this.lastCommittedTransactionId = lastCommittedTransactionId;
        this.nodes = nodes;
        this.relationships = relationships;
        this.highLabelId = highLabelId;
        this.highRelationshipTypeId = highRelationshipTypeId;
        this.numberArrayFactory = numberArrayFactory;
        this.databaseLayout = databaseLayout;
        this.progressMonitor = progressMonitor;
        this.pageCacheTracer = pageCacheTracer;
        this.memoryTracker = memoryTracker;
    }

    @Override
    public void initialize( CountsAccessor.Updater countsUpdater, CursorContext cursorContext, MemoryTracker memoryTracker )
    {
        if ( hasNotEmptyNodesOrRelationshipsStores( cursorContext ) )
        {
            progressMonitor.start( nodes.getHighestPossibleIdInUse( cursorContext ) + relationships.getHighestPossibleIdInUse( cursorContext ) );
            populateCountStore( countsUpdater );
        }
        progressMonitor.completed();
    }

    private boolean hasNotEmptyNodesOrRelationshipsStores( CursorContext cursorContext )
    {
        return (nodes.getHighestPossibleIdInUse( cursorContext ) != -1) || (relationships.getHighestPossibleIdInUse( cursorContext ) != -1);
    }

    private void populateCountStore( CountsAccessor.Updater countsUpdater )
    {
        try ( NodeLabelsCache cache = new NodeLabelsCache( numberArrayFactory, nodes.getHighId(), highLabelId, memoryTracker ) )
        {
            Configuration configuration = Configuration.defaultConfiguration( databaseLayout.databaseDirectory() );

            // Count nodes
            Function<CursorContext,StoreCursors> storeCursorsFunction = cursorContext -> new CachedStoreCursors( neoStores, cursorContext );
            superviseDynamicExecution(
                    new NodeCountsStage( configuration, cache, nodes, highLabelId, countsUpdater, progressMonitor, pageCacheTracer,
                            storeCursorsFunction ) );
            // Count relationships
            superviseDynamicExecution(
                    new RelationshipCountsStage( configuration, cache, relationships, highLabelId, highRelationshipTypeId, countsUpdater,
                            numberArrayFactory, progressMonitor, pageCacheTracer, storeCursorsFunction, memoryTracker ) );
        }
    }

    @Override
    public long lastCommittedTxId()
    {
        return lastCommittedTransactionId;
    }
}
