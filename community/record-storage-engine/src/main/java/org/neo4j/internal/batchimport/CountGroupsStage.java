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

import org.neo4j.internal.batchimport.staging.BatchFeedStep;
import org.neo4j.internal.batchimport.staging.ReadRecordsStep;
import org.neo4j.internal.batchimport.staging.Stage;
import org.neo4j.internal.batchimport.staging.Step;
import org.neo4j.internal.batchimport.stats.StatsProvider;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.RecordStore;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;

import static org.neo4j.internal.batchimport.RecordIdIterators.allIn;

/**
 * Stage for counting groups per node, populates {@link RelationshipGroupCache}. Steps:
 *
 * <ol>
 * <li>{@link ReadRecordsStep} reads {@link RelationshipGroupRecord relationship group records} for later counting.</li>
 * <li>{@link CountGroupsStep} populates {@link RelationshipGroupCache} with how many relationship groups each
 * node has. This is useful for calculating how to divide the work of defragmenting the relationship groups
 * in a {@link ScanAndCacheGroupsStage later stage}.</li>
 * </ol>
 */
public class CountGroupsStage extends Stage
{
    public static final String NAME = "Count groups";

    public CountGroupsStage( Configuration config, RecordStore<RelationshipGroupRecord> store,
            RelationshipGroupCache groupCache, PageCacheTracer pageCacheTracer, StatsProvider... additionalStatsProviders )
    {
        super( NAME, null, config, Step.RECYCLE_BATCHES );
        add( new BatchFeedStep( control(), config, allIn( store, config ), store.getRecordSize() ) );
        add( new ReadRecordsStep<>( control(), config, false, store, pageCacheTracer ) );
        add( new CountGroupsStep( control(), config, groupCache, pageCacheTracer, additionalStatsProviders ) );
    }
}
