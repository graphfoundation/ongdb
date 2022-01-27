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
package org.neo4j.kernel.impl.transaction.state.storeview;

import java.util.function.Function;
import java.util.function.IntPredicate;

import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.index.PropertyScanConsumer;
import org.neo4j.kernel.impl.api.index.TokenScanConsumer;
import org.neo4j.lock.LockService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.EntityUpdates;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.StorageRelationshipScanCursor;
import org.neo4j.storageengine.api.TokenIndexEntryUpdate;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.lock.LockType.SHARED;

/**
 * Scan the relationship store and produce {@link EntityUpdates updates for indexes} and/or {@link TokenIndexEntryUpdate updates for relationship type index}
 * depending on which scan consumer ({@link TokenScanConsumer}, {@link PropertyScanConsumer} or both) is used.
 * <p>
 * {@code relationshipTypeIds} and {@code propertyKeyIdFilter} are relevant only for {@link PropertyScanConsumer} and don't influence
 * {@link TokenScanConsumer}.
 */
public class RelationshipStoreScan extends PropertyAwareEntityStoreScan<StorageRelationshipScanCursor>
{
    private static final String TRACER_TAG = "RelationshipStoreScan_getRelationshipCount";

    public RelationshipStoreScan( Config config, StorageReader storageReader, Function<CursorContext,StoreCursors> storeCursorsFactory, LockService locks,
            TokenScanConsumer relationshipTypeScanConsumer,
            PropertyScanConsumer propertyScanConsumer,
            int[] relationshipTypeIds, IntPredicate propertyKeyIdFilter, boolean parallelWrite,
            JobScheduler scheduler, PageCacheTracer cacheTracer, MemoryTracker memoryTracker )
    {
        super( config, storageReader, storeCursorsFactory, getRelationshipCount( storageReader, cacheTracer ), relationshipTypeIds, propertyKeyIdFilter,
                propertyScanConsumer, relationshipTypeScanConsumer, id -> locks.acquireRelationshipLock( id, SHARED ),
                new RelationshipCursorBehaviour( storageReader ), parallelWrite, scheduler, cacheTracer, memoryTracker );
    }

    private static long getRelationshipCount( StorageReader storageReader, PageCacheTracer cacheTracer )
    {
        try ( var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( TRACER_TAG ) ) )
        {
            return storageReader.relationshipsGetCount( cursorContext );
        }
    }
}
