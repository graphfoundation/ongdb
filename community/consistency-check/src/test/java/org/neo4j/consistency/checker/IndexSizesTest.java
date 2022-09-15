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
package org.neo4j.consistency.checker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.consistency.checking.index.IndexAccessors;
import org.neo4j.internal.schema.IndexCapability;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexValueCapability;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.index.IndexAccessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.common.EntityType.NODE;
import static org.neo4j.consistency.checker.IndexChecker.NUM_INDEXES_IN_CACHE;
import static org.neo4j.consistency.checker.ParallelExecution.DEFAULT_IDS_PER_CHUNK;
import static org.neo4j.consistency.checker.ParallelExecution.NOOP_EXCEPTION_HANDLER;

class IndexSizesTest
{
    private IndexSizes sizes;
    private final int highNodeId = 10000;
    private List<IndexDescriptor> indexes;

    @BeforeEach
    void setUp()
    {
        ParallelExecution execution = new ParallelExecution( 2, NOOP_EXCEPTION_HANDLER, DEFAULT_IDS_PER_CHUNK );

        indexes = new ArrayList<>();
        var indexAccessors = mock( IndexAccessors.class );
        when( indexAccessors.onlineRules( any() ) ).thenReturn( indexes );
        when( indexAccessors.accessorFor( any() ) ).then( invocation ->
        {
            IndexAccessor mock = mock( IndexAccessor.class );
            when( mock.estimateNumberOfEntries( any( CursorContext.class ) ) ).thenReturn( invocation.getArgument( 0, IndexDescriptor.class ).getId() );
            return mock;
        } );

        sizes = new IndexSizes( execution, indexAccessors, highNodeId, PageCacheTracer.NULL );
    }

    @Test
    void shouldSplitEvenly()
    {
        //given
        createIndexes( 3, 3 );
        //then
        assertEquals( NUM_INDEXES_IN_CACHE, sizes.largeIndexes( NODE ).size() );
        assertEquals( 6 - NUM_INDEXES_IN_CACHE, sizes.smallIndexes( NODE ).size() );
    }

    @Test
    void shouldSplitEvenlyLarge()
    {
        //given
        createIndexes( 151, 149 );
        //then
        assertEquals( 150, sizes.largeIndexes( NODE ).size() );
        assertEquals( 150, sizes.smallIndexes( NODE ).size() );
    }

    @Test
    void shouldHandleAllSmall()
    {
        //given
        createIndexes( 3, 0 );
        //then
        assertEquals( 3, sizes.smallIndexes( NODE ).size() );
        assertEquals( 0, sizes.largeIndexes( NODE ).size() );
    }

    @Test
    void shouldHandleAllLarge()
    {
        //given
        createIndexes( 0, 3 );
        //then
        assertEquals( 0, sizes.smallIndexes( NODE ).size() );
        assertEquals( 3, sizes.largeIndexes( NODE ).size() );
    }

    @Test
    void shouldHandleEmpty()
    {
        //then
        createIndexes( 0, 0 );
        assertEquals( 0, sizes.largeIndexes( NODE ).size() );
        assertEquals( 0, sizes.smallIndexes( NODE ).size() );
    }

    @Test
    void shouldNotConsiderIndexWithoutValueCapabilityAsLarge() throws Exception
    {
        // given
        indexes.add( prototype().materialise( 0 ) /*w/o value capability*/ );
        sizes.initialize();

        // when/then
        assertTrue( sizes.largeIndexes( NODE ).isEmpty() );
        assertEquals( indexes, sizes.smallIndexes( NODE ) );
    }

    private void createIndexes( int numSmall, int numLarge )
    {
        IndexCapability capabilityWithValue = mock( IndexCapability.class );
        when( capabilityWithValue.valueCapability( any() ) ).thenReturn( IndexValueCapability.YES );
        IndexPrototype prototype = prototype();

        for ( int i = 0; i < numLarge; i++ )
        {
            indexes.add( prototype.materialise( highNodeId / 2 + i ).withIndexCapability( capabilityWithValue ) ); //using id as "size"
        }
        for ( int i = 0; i < numSmall; i++ )
        {
            indexes.add( prototype.materialise( i ).withIndexCapability( capabilityWithValue ) ); //using id as "size"
        }

        try
        {
            sizes.initialize();
        }
        catch ( Exception e )
        {
            throw new RuntimeException( e );
        }
    }

    private static IndexPrototype prototype()
    {
        return IndexPrototype.forSchema( SchemaDescriptors.forLabel( 1, 1, 2 ) ).withName( "foo" );
    }
}
