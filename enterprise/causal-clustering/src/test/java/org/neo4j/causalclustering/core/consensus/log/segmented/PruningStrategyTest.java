/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.causalclustering.core.consensus.log.segmented;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.neo4j.helpers.collection.Visitor;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

abstract class PruningStrategyTest
{
    Segments segments = mock( Segments.class );
    List<SegmentFile> files;

    ArrayList<SegmentFile> createSegmentFiles( int size )
    {
        ArrayList<SegmentFile> list = new ArrayList<>( size );
        for ( int i = 0; i < size; i++ )
        {
            SegmentFile file = mock( SegmentFile.class );
            when( file.header() ).thenReturn( testSegmentHeader( i ) );
            when( file.size() ).thenReturn( 1L );
            list.add( file );
        }
        return list;
    }

    @Before
    public void mockSegmentVisitor()
    {
        doAnswer( invocation ->
        {
            Visitor<SegmentFile,RuntimeException> visitor = invocation.getArgument( 0 );
            ListIterator<SegmentFile> itr = files.listIterator( files.size() );
            boolean terminate = false;
            while ( itr.hasPrevious() && !terminate )
            {
                terminate = visitor.visit( itr.previous() );
            }
            return null;
        } ).when( segments ).visitBackwards( any() );
    }

    private SegmentHeader testSegmentHeader( long value )
    {
        return new SegmentHeader( -1, -1, value - 1, -1 );
    }
}
