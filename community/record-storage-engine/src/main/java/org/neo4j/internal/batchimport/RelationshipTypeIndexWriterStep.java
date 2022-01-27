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
package org.neo4j.internal.batchimport;

import java.util.function.Function;

import org.neo4j.internal.batchimport.staging.BatchSender;
import org.neo4j.internal.batchimport.staging.StageControl;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.common.EntityType.RELATIONSHIP;
import static org.neo4j.io.IOUtils.closeAll;

public class RelationshipTypeIndexWriterStep extends IndexWriterStep<RelationshipRecord[]>
{

    private static final String RELATIONSHIP_INDEX_WRITE_STEP_TAG = "relationshipIndexWriteStep";
    private final CursorContext cursorContext;
    private final IndexImporter importer;

    public RelationshipTypeIndexWriterStep( StageControl control, Configuration config, BatchingNeoStores neoStores, IndexImporterFactory indexImporterFactory,
            MemoryTracker memoryTracker, PageCacheTracer pageCacheTracer, Function<CursorContext,StoreCursors> storeCursorsCreator )
    {
        super( control, "RELATIONSHIP TYPE INDEX", config, 1, pageCacheTracer );
        this.cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( RELATIONSHIP_INDEX_WRITE_STEP_TAG ) );
        this.importer = indexImporter( config.indexConfig(), indexImporterFactory, neoStores, RELATIONSHIP, memoryTracker, cursorContext, storeCursorsCreator );
    }

    @Override
    protected void process( RelationshipRecord[] batch, BatchSender sender, CursorContext cursorTracer ) throws Throwable
    {
        for ( RelationshipRecord relationship : batch )
        {
            if ( relationship.inUse() )
            {
                importer.add( relationship.getId(), new long[]{relationship.getType()} );
            }
        }
        sender.send( batch );
    }

    @Override
    public void close() throws Exception
    {
        super.close();
        closeAll( importer, cursorContext );
    }
}
