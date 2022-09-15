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

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.index.IndexStoreView;
import org.neo4j.kernel.impl.api.index.PropertyScanConsumer;
import org.neo4j.kernel.impl.api.index.StoreScan;
import org.neo4j.kernel.impl.api.index.TokenScanConsumer;
import org.neo4j.lock.LockService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.cursor.StoreCursors;

/**
 * Node store view that will always visit all nodes during store scan.
 */
public class FullScanStoreView implements IndexStoreView
{
    protected final LockService locks;
    protected final Supplier<StorageReader> storageEngine;
    private final Function<CursorContext,StoreCursors> storeCursorsFactory;
    protected final Config config;
    protected final JobScheduler scheduler;

    public FullScanStoreView( LockService locks, Supplier<StorageReader> storageEngine, Function<CursorContext,StoreCursors> storeCursorsFactory,
            Config config, JobScheduler scheduler )
    {
        this.locks = locks;
        this.storageEngine = storageEngine;
        this.storeCursorsFactory = storeCursorsFactory;
        this.config = config;
        this.scheduler = scheduler;
    }

    @Override
    public StoreScan visitNodes( int[] labelIds, IntPredicate propertyKeyIdFilter,
            PropertyScanConsumer propertyScanConsumer, TokenScanConsumer labelScanConsumer,
            boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer, MemoryTracker memoryTracker )
    {
        return new NodeStoreScan( config, storageEngine.get(), storeCursorsFactory, locks, labelScanConsumer,
                propertyScanConsumer, labelIds, propertyKeyIdFilter, parallelWrite, scheduler, cacheTracer, memoryTracker );
    }

    @Override
    public StoreScan visitRelationships( int[] relationshipTypeIds, IntPredicate propertyKeyIdFilter,
            PropertyScanConsumer propertyScanConsumer, TokenScanConsumer relationshipTypeScanConsumer,
            boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer, MemoryTracker memoryTracker )
    {
        return new RelationshipStoreScan( config, storageEngine.get(), storeCursorsFactory, locks, relationshipTypeScanConsumer, propertyScanConsumer,
                relationshipTypeIds, propertyKeyIdFilter, parallelWrite, scheduler, cacheTracer, memoryTracker );
    }

    @Override
    public NodePropertyAccessor newPropertyAccessor( CursorContext cursorContext, MemoryTracker memoryTracker )
    {
        return new DefaultNodePropertyAccessor( storageEngine.get(), cursorContext, storeCursorsFactory.apply( cursorContext ), memoryTracker );
    }

    @Override
    public boolean isEmpty()
    {
        try ( StorageReader reader = storageEngine.get() )
        {
            return reader.nodesGetCount( CursorContext.NULL ) == 0 && reader.relationshipsGetCount( CursorContext.NULL ) == 0;
        }
    }
}
