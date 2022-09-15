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
package org.neo4j.kernel.impl.api.index.sampling;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.logging.LogProvider;

public class OnlineIndexSamplingJobFactory implements IndexSamplingJobFactory
{
    private final IndexStatisticsStore indexStatisticsStore;
    private final LogProvider logProvider;
    private final TokenNameLookup nameLookup;
    private final PageCacheTracer pageCacheTracer;

    public OnlineIndexSamplingJobFactory( IndexStatisticsStore indexStatisticsStore, TokenNameLookup nameLookup, LogProvider logProvider,
            PageCacheTracer pageCacheTracer )
    {
        this.indexStatisticsStore = indexStatisticsStore;
        this.logProvider = logProvider;
        this.nameLookup = nameLookup;
        this.pageCacheTracer = pageCacheTracer;
    }

    @Override
    public IndexSamplingJob create( long indexId, IndexProxy indexProxy )
    {
        final String indexUserDescription = indexProxy.getDescriptor().userDescription( nameLookup );
        String indexName = indexProxy.getDescriptor().getName();
        return new OnlineIndexSamplingJob( indexId, indexProxy, indexStatisticsStore, indexUserDescription, indexName, logProvider, pageCacheTracer );
    }
}
