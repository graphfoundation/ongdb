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
package org.neo4j.kernel.impl.index.schema;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.BitSet;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.GBPTreeBuilder;
import org.neo4j.internal.kernel.api.TokenPredicate;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.EntityRange;
import org.neo4j.storageengine.api.TokenIndexEntryUpdate;
import org.neo4j.storageengine.api.schema.SimpleEntityTokenClient;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.utils.TestDirectory;

import static java.lang.Math.toIntExact;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.collection.PrimitiveLongCollections.EMPTY_LONG_ARRAY;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

@ExtendWith( RandomExtension.class )
@PageCacheExtension
class TokenIndexReaderTest
{
    @Inject
    private RandomSupport random;
    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory directory;

    private GBPTree<TokenScanKey,TokenScanValue> tree;

    @BeforeEach
    void openTree()
    {
        tree = new GBPTreeBuilder<>( pageCache, directory.file( "file" ), new TokenScanLayout() ).build();
    }

    @AfterEach
    void closeTree() throws IOException
    {
        tree.close();
    }

    @Test
    void shouldTracePageCacheAccess() throws Exception
    {
        // GIVEN an index with entries
        int expectedNodes = 5;
        int labelId = 1;
        try ( TokenIndexUpdater writer = new TokenIndexUpdater( expectedNodes, TokenIndex.EMPTY ) )
        {
            writer.initialize( tree.writer( NULL ) );
            for ( int i = 0; i < expectedNodes; i++ )
            {
                writer.process( TokenIndexEntryUpdate.change( i, null, EMPTY_LONG_ARRAY, new long[]{labelId} ) );
            }
        }

        // WHEN the index is queried
        var cacheTracer = new DefaultPageCacheTracer();
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "tracePageCache" ) );
        var reader = new DefaultTokenIndexReader( tree );
        var tokenClient = new SimpleEntityTokenClient();
        reader.query( tokenClient, unconstrained(), new TokenPredicate( labelId ), cursorContext );
        int actualNodes = 0;
        while ( tokenClient.next() )
        {
            actualNodes++;
        }

        // THEN the page cache access is traced
        assertThat( actualNodes ).isEqualTo( expectedNodes );
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isEqualTo( 1 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 1 );
        assertThat( cursorTracer.hits() ).isEqualTo( 1 );
        assertThat( cursorTracer.faults() ).isEqualTo( 0 );
    }

    @Test
    void shouldStartFromGivenIdDense() throws IOException, IndexEntryConflictException
    {
        shouldStartFromGivenId( 10 );
    }

    @Test
    void shouldStartFromGivenIdSparse() throws IOException, IndexEntryConflictException
    {
        shouldStartFromGivenId( 100 );
    }

    @Test
    void shouldStartFromGivenIdSuperSparse() throws IOException, IndexEntryConflictException
    {
        shouldStartFromGivenId( 1000 );
    }

    private void shouldStartFromGivenId( int sparsity ) throws IOException, IndexEntryConflictException
    {
        // given
        int labelId = 1;
        int highNodeId = 100_000;
        BitSet expected = new BitSet( highNodeId );
        try ( TokenIndexUpdater writer = new TokenIndexUpdater( highNodeId, TokenIndex.EMPTY ) )
        {
            writer.initialize( tree.writer( NULL ) );
            int updates = highNodeId / sparsity;
            for ( int i = 0; i < updates; i++ )
            {
                int nodeId = random.nextInt( highNodeId );
                writer.process( TokenIndexEntryUpdate.change( nodeId, null, EMPTY_LONG_ARRAY, new long[]{labelId} ) );
                expected.set( nodeId );
            }
        }

        // when
        long fromId = random.nextInt( highNodeId );
        int nextExpectedId = expected.nextSetBit( toIntExact( fromId ) );

        var reader = new DefaultTokenIndexReader( tree );
        var tokenClient = new SimpleEntityTokenClient();
        reader.query( tokenClient, unconstrained(), new TokenPredicate( labelId ), EntityRange.from( fromId ), NULL );
        while ( nextExpectedId != -1 )
        {
            assertTrue( tokenClient.next() );
            assertThat( toIntExact( tokenClient.reference ) ).isEqualTo( nextExpectedId );
            nextExpectedId = expected.nextSetBit( nextExpectedId + 1 );
        }
        assertFalse( tokenClient.next() );
    }
}
