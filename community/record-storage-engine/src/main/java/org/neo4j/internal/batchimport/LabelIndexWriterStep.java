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
package org.neo4j.internal.batchimport;

import java.util.function.Function;

import org.neo4j.internal.batchimport.staging.BatchSender;
import org.neo4j.internal.batchimport.staging.StageControl;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.common.EntityType.NODE;
import static org.neo4j.io.IOUtils.closeAll;
import static org.neo4j.kernel.impl.store.NodeLabelsField.get;

public class LabelIndexWriterStep extends IndexWriterStep<NodeRecord[]>
{
    private static final String LABEL_INDEX_WRITE_STEP_TAG = "labelIndexWriteStep";
    private final CursorContext cursorContext;
    private final IndexImporter importer;
    private final NodeStore nodeStore;
    private final StoreCursors cachedStoreCursors;

    public LabelIndexWriterStep( StageControl control, Configuration config, BatchingNeoStores neoStores, IndexImporterFactory indexImporterFactory,
            MemoryTracker memoryTracker, PageCacheTracer pageCacheTracer, Function<CursorContext,StoreCursors> storeCursorsCreator )
    {
        super( control, "LABEL INDEX", config, 1, pageCacheTracer );
        this.cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( LABEL_INDEX_WRITE_STEP_TAG ) );
        this.importer = indexImporter( config.indexConfig(), indexImporterFactory, neoStores, NODE, memoryTracker, cursorContext, storeCursorsCreator );
        this.cachedStoreCursors = storeCursorsCreator.apply( cursorContext );
        this.nodeStore = neoStores.getNodeStore();
    }

    @Override
    protected void process( NodeRecord[] batch, BatchSender sender, CursorContext cursorContext ) throws Throwable
    {
        cachedStoreCursors.reset( cursorContext );
        for ( NodeRecord node : batch )
        {
            if ( node.inUse() )
            {
                importer.add( node.getId(), get( node, nodeStore, cachedStoreCursors ) );
            }
        }
        sender.send( batch );
    }

    @Override
    public void close() throws Exception
    {
        super.close();
        closeAll( importer, cursorContext, cachedStoreCursors );
    }
}
