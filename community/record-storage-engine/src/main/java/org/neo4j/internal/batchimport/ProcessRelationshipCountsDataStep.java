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

import org.neo4j.common.ProgressReporter;
import org.neo4j.counts.CountsAccessor;
import org.neo4j.internal.batchimport.cache.GatheringMemoryStatsVisitor;
import org.neo4j.internal.batchimport.cache.NodeLabelsCache;
import org.neo4j.internal.batchimport.cache.NumberArrayFactory;
import org.neo4j.internal.batchimport.staging.StageControl;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static java.lang.Math.max;
import static java.lang.Math.toIntExact;

/**
 * Processes relationship records, feeding them to {@link RelationshipCountsProcessor} which keeps
 * the accumulated counts per thread. Aggregated in {@link #done()}.
 */
public class ProcessRelationshipCountsDataStep extends RecordProcessorStep<RelationshipRecord>
{
    public ProcessRelationshipCountsDataStep( StageControl control, NodeLabelsCache cache, Configuration config, int
            highLabelId, int highRelationshipTypeId,
            CountsAccessor.Updater countsUpdater, NumberArrayFactory cacheFactory, ProgressReporter progressReporter, PageCacheTracer pageCacheTracer,
            Function<CursorContext,StoreCursors> storeCursorsCreator, MemoryTracker memoryTracker )
    {
        super( control, "COUNT", config,
                () -> new RelationshipCountsProcessor( cache, highLabelId, highRelationshipTypeId, countsUpdater, cacheFactory, memoryTracker ), true,
                numberOfProcessors( config, cache, highLabelId, highRelationshipTypeId ), pageCacheTracer, storeCursorsCreator );
    }

    /**
     * Keeping all counts for all combinations of label/reltype can require a lot of memory if there are lots of those tokens.
     * Each processor will allocate such a data structure and so in extreme cases the number of processors will have to
     * be limited to not surpass the available memory limits.
     *
     * @param config {@link Configuration} holding things like max number of processors and max memory.
     * @param cache {@link NodeLabelsCache} which is the only other data structure occupying memory at this point.
     * @param highLabelId high label id for this store.
     * @param highRelationshipTypeId high relationship type id for this store.
     * @return number of processors suitable for this step. In most cases this will be 0, which is the typical value used
     * when just allowing the importer to grab up to {@link Configuration#maxNumberOfProcessors()}. The returned value
     * will at least be 1.
     */
    private static int numberOfProcessors( Configuration config, NodeLabelsCache cache, int highLabelId, int highRelationshipTypeId )
    {
        GatheringMemoryStatsVisitor memVisitor = new GatheringMemoryStatsVisitor();
        cache.acceptMemoryStatsVisitor( memVisitor );

        long availableMem = config.maxMemoryUsage() - memVisitor.getTotalUsage();
        long threadMem = RelationshipCountsProcessor.calculateMemoryUsage( highLabelId, highRelationshipTypeId );
        long possibleThreads = availableMem / threadMem;
        return possibleThreads >= config.maxNumberOfProcessors() ? 0 : toIntExact( max( 1, possibleThreads ) );
    }
}
