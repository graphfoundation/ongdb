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
package org.neo4j.kernel.impl.api.index.sampling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexSampler;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.neo4j.internal.kernel.api.InternalIndexState.FAILED;
import static org.neo4j.internal.kernel.api.InternalIndexState.ONLINE;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;

class OnlineIndexSamplingJobTest
{
    private final LogProvider logProvider = NullLogProvider.getInstance();
    private final long indexId = 1;
    private final IndexProxy indexProxy = mock( IndexProxy.class );
    private final IndexStatisticsStore indexStatisticsStore = mock( IndexStatisticsStore.class );
    private final IndexDescriptor indexDescriptor = forSchema( forLabel( 1, 2 ), IndexProviderDescriptor.UNDECIDED ).withName( "index" ).materialise( indexId );
    private final ValueIndexReader indexReader = mock( ValueIndexReader.class );
    private final IndexSampler indexSampler = mock( IndexSampler.class );

    private final long indexUniqueValues = 21L;
    private final long indexSize = 23L;
    private final IndexSample sample = new IndexSample( indexSize, indexUniqueValues, indexSize );

    @BeforeEach
    void setup() throws IndexNotFoundKernelException
    {
        when( indexProxy.getDescriptor() ).thenReturn( indexDescriptor );
        when( indexProxy.newValueReader() ).thenReturn( indexReader );
        when( indexReader.createSampler() ).thenReturn( indexSampler );
        when( indexSampler.sampleIndex( any() ) ).thenReturn( sample );
    }

    @Test
    void shouldSampleTheIndexAndStoreTheValueWhenTheIndexIsOnline()
    {
        // given
        OnlineIndexSamplingJob job = new OnlineIndexSamplingJob( indexId, indexProxy, indexStatisticsStore, "Foo", "Foo", logProvider, NULL );
        when( indexProxy.getState() ).thenReturn( ONLINE );

        // when
        job.run();

        // then
        verify( indexStatisticsStore ).replaceStats( indexId, sample );
        verifyNoMoreInteractions( indexStatisticsStore );
    }

    @Test
    void shouldSampleTheIndexButDoNotStoreTheValuesIfTheIndexIsNotOnline()
    {
        // given
        OnlineIndexSamplingJob job = new OnlineIndexSamplingJob( indexId, indexProxy, indexStatisticsStore, "Foo", "Foo", logProvider, NULL );
        when( indexProxy.getState() ).thenReturn( FAILED );

        // when
        job.run();

        // then
        verifyNoMoreInteractions( indexStatisticsStore );
    }

    @Test
    void usePageCursorToTraceIndexSampling() throws IndexNotFoundKernelException
    {
        var pageCacheTracer = mock( PageCacheTracer.class );
        var pageCursorTracer = mock( PageCursorTracer.class );
        when( pageCacheTracer.createPageCursorTracer( any() ) ).thenReturn( pageCursorTracer );

        OnlineIndexSamplingJob job = new OnlineIndexSamplingJob( indexId, indexProxy, indexStatisticsStore, "Foo", "Foo", logProvider, pageCacheTracer );
        when( indexProxy.getState() ).thenReturn( ONLINE );

        // when
        job.run();

        verify( indexSampler ).sampleIndex( argThat( context -> context.getCursorTracer().equals( pageCursorTracer ) ) );
    }
}
