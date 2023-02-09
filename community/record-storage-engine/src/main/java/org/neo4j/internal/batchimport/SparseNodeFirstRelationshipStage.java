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

import org.neo4j.internal.batchimport.cache.NodeRelationshipCache;
import org.neo4j.internal.batchimport.cache.NodeType;
import org.neo4j.internal.batchimport.staging.ReadRecordsStep;
import org.neo4j.internal.batchimport.staging.Stage;
import org.neo4j.internal.batchimport.staging.Step;
import org.neo4j.internal.batchimport.store.StorePrepareIdSequence;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;

/**
 * Updates sparse {@link NodeRecord node records} with relationship heads after relationship linking. Steps:
 *
 * <ol>
 * <li>{@link ReadNodeIdsByCacheStep} looks at {@link NodeRelationshipCache} for which nodes have had
 * relationships imported and loads those {@link NodeRecord records} from store.</li>
 * <li>{@link RecordProcessorStep} / {@link SparseNodeFirstRelationshipProcessor} uses {@link NodeRelationshipCache}
 * to update each {@link NodeRecord#setNextRel(long)}.
 * <li>{@link UpdateRecordsStep} writes the updated records back into store.</li>
 * </ol>
 */
public class SparseNodeFirstRelationshipStage extends Stage
{
    public static final String NAME = "Node --> Relationship";

    public SparseNodeFirstRelationshipStage( Configuration config, NodeStore nodeStore, NodeRelationshipCache cache, PageCacheTracer pageCacheTracer,
            Function<CursorContext,StoreCursors> storeCursorsCreator )
    {
        super( NAME, null, config, Step.ORDER_SEND_DOWNSTREAM | Step.RECYCLE_BATCHES );
        add( new ReadNodeIdsByCacheStep( control(), config, cache, NodeType.NODE_TYPE_SPARSE ) );
        add( new ReadRecordsStep<>( control(), config, true, nodeStore, pageCacheTracer ) );
        add( new RecordProcessorStep<>( control(), "LINK", config,
                () -> new SparseNodeFirstRelationshipProcessor( cache ), false, 1, pageCacheTracer, storeCursorsCreator ) );
        add( new UpdateRecordsStep<>( control(), config, nodeStore, new StorePrepareIdSequence(), pageCacheTracer, storeCursorsCreator, NODE_CURSOR ) );
    }
}
