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
package org.neo4j.kernel.api.impl.schema.reader;

import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.MultiTermQuery;
import org.apache.lucene.search.TermRangeQuery;
import org.apache.lucene.search.TotalHitCountCollector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.configuration.Config;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotApplicableKernelException;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.impl.index.collector.DocValuesCollector;
import org.neo4j.kernel.api.impl.index.partition.Neo4jIndexSearcher;
import org.neo4j.kernel.api.impl.index.partition.PartitionSearcher;
import org.neo4j.kernel.api.impl.schema.TaskCoordinator;
import org.neo4j.kernel.api.impl.schema.sampler.NonUniqueLuceneIndexSampler;
import org.neo4j.kernel.api.impl.schema.sampler.UniqueLuceneIndexSampler;
import org.neo4j.kernel.api.index.IndexReader;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.api.index.IndexSamplingConfig;
import org.neo4j.kernel.impl.index.schema.NodeValueIterator;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.internal.kernel.api.PropertyIndexQuery.range;
import static org.neo4j.internal.kernel.api.QueryContext.NULL_CONTEXT;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.values.storable.Values.stringValue;

class SimpleValueIndexReaderTest
{
    private static final SchemaDescriptor SCHEMA = SchemaDescriptors.forLabel( 0, 0 );
    private final PartitionSearcher partitionSearcher = mock( PartitionSearcher.class );
    private final Neo4jIndexSearcher indexSearcher = mock( Neo4jIndexSearcher.class );
    private final IndexSamplingConfig samplingConfig = new IndexSamplingConfig( Config.defaults() );
    private final TaskCoordinator taskCoordinator = new TaskCoordinator();

    @BeforeEach
    void setUp()
    {
        when( partitionSearcher.getIndexSearcher() ).thenReturn( indexSearcher );
    }

    @Test
    void releaseSearcherOnClose() throws IOException
    {
        IndexReader simpleIndexReader = getUniqueSimpleReader();

        simpleIndexReader.close();

        verify( partitionSearcher ).close();
    }

    @Test
    void seekQueryReachSearcher() throws Exception
    {
        var simpleIndexReader = getUniqueSimpleReader();

        doQuery( simpleIndexReader, PropertyIndexQuery.exact( 1, "test" ) );

        verify( indexSearcher ).search( any( BooleanQuery.class ), any( DocValuesCollector.class ) );
    }

    @Test
    void scanQueryReachSearcher() throws Exception
    {
        var simpleIndexReader = getUniqueSimpleReader();

        doQuery( simpleIndexReader, PropertyIndexQuery.exists( 1 ) );

        verify( indexSearcher ).search( any( MatchAllDocsQuery.class ), any( DocValuesCollector.class ) );
    }

    @Test
    void stringRangeSeekQueryReachSearcher() throws Exception
    {
        var simpleIndexReader = getUniqueSimpleReader();

        doQuery( simpleIndexReader, range( 1, "a", false, "b", true ) );

        verify( indexSearcher ).search( any( TermRangeQuery.class ), any( DocValuesCollector.class ) );
    }

    @Test
    void prefixRangeSeekQueryReachSearcher() throws Exception
    {
        var simpleIndexReader = getUniqueSimpleReader();

        doQuery( simpleIndexReader, PropertyIndexQuery.stringPrefix( 1, stringValue( "bb" ) ));

        verify( indexSearcher ).search( any( MultiTermQuery.class ), any( DocValuesCollector.class ) );
    }

    @Test
    void numberRangeSeekQueryReachSearcher()
    {
        var simpleIndexReader = getUniqueSimpleReader();
        var query = range( 1, 7, true, 8, true );

        assertThatThrownBy( () -> doQuery( simpleIndexReader, query ) )
                .isInstanceOf( IllegalArgumentException.class )
                .hasMessageContainingAll( "Index query not supported for", "Query:", query.toString() );
    }

    @Test
    void countIndexedNodesReachSearcher() throws IOException
    {
        var simpleIndexReader = getUniqueSimpleReader();

        simpleIndexReader.countIndexedEntities( 2, NULL, new int[] {3}, Values.of( "testValue" ) );

        verify( indexSearcher ).search( any( BooleanQuery.class ), any( TotalHitCountCollector.class ) );
    }

    @Test
    void uniqueIndexSamplerForUniqueIndex()
    {
        SimpleValueIndexReader uniqueSimpleReader = getUniqueSimpleReader();
        assertThat( uniqueSimpleReader.createSampler() ).isInstanceOf( UniqueLuceneIndexSampler.class );
    }

    @Test
    void nonUniqueIndexSamplerForNonUniqueIndex()
    {
        SimpleValueIndexReader uniqueSimpleReader = getNonUniqueSimpleReader();
        assertThat( uniqueSimpleReader.createSampler() ).isInstanceOf( NonUniqueLuceneIndexSampler.class );
    }

    private static void doQuery( ValueIndexReader reader, PropertyIndexQuery query ) throws IndexNotApplicableKernelException
    {
        reader.query( new NodeValueIterator(), NULL_CONTEXT, AccessMode.Static.READ, unconstrained(), query );
    }

    private SimpleValueIndexReader getNonUniqueSimpleReader()
    {
        IndexDescriptor index = IndexPrototype.forSchema( SCHEMA ).withName( "a" ).materialise( 0 );
        return new SimpleValueIndexReader( partitionSearcher, index, samplingConfig, taskCoordinator );
    }

    private SimpleValueIndexReader getUniqueSimpleReader()
    {
        IndexDescriptor index = IndexPrototype.uniqueForSchema( SCHEMA ).withName( "b" ).materialise( 1 );
        return new SimpleValueIndexReader( partitionSearcher, index, samplingConfig, taskCoordinator );
    }
}
