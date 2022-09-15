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
package org.neo4j.kernel.impl.newapi;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.kernel.impl.newapi.PartitionedScanTestSuite.Query;
import org.neo4j.kernel.impl.newapi.PropertyIndexScanPartitionedScanTestSuite.PropertyKeyScanQuery;

abstract class PropertyIndexScanPartitionedScanTestSuite<CURSOR extends Cursor>
        extends PropertyIndexPartitionedScanTestSuite<PropertyKeyScanQuery,CURSOR>
{
    PropertyIndexScanPartitionedScanTestSuite( IndexType index )
    {
        super( index );
    }

    abstract static class WithoutData<CURSOR extends Cursor>
            extends PropertyIndexPartitionedScanTestSuite.WithoutData<PropertyKeyScanQuery,CURSOR>
    {
        WithoutData( PropertyIndexScanPartitionedScanTestSuite<CURSOR> testSuite )
        {
            super( testSuite );
        }

        protected Queries<PropertyKeyScanQuery> emptyQueries( int tokenId, int[] propKeyIds )
        {
            final var empty = Stream.concat( Arrays.stream( propKeyIds ).mapToObj( propKeyId -> factory.getIndexName( tokenId, propKeyId ) ),
                                             Stream.of( factory.getIndexName( tokenId, propKeyIds ) ) )
                                    .map( PropertyKeyScanQuery::new )
                                    .collect( EntityIdsMatchingQuery.collector() );

            return new Queries<>( empty );
        }
    }

    abstract static class WithData<CURSOR extends Cursor>
            extends PropertyIndexPartitionedScanTestSuite.WithData<PropertyKeyScanQuery,CURSOR>
    {
        WithData( PropertyIndexScanPartitionedScanTestSuite<CURSOR> testSuite )
        {
            super( testSuite );
        }
    }

    protected static final class PropertyKeyScanQuery implements Query<Void>
    {
        private final String indexName;

        PropertyKeyScanQuery( String indexName )
        {
            this.indexName = indexName;
        }

        @Override
        public String indexName()
        {
            return indexName;
        }

        @Override
        public Void get()
        {
            return null;
        }

        @Override
        public boolean equals( Object obj )
        {
            if ( this == obj )
            {
                return true;
            }
            if ( obj == null || getClass() != obj.getClass() )
            {
                return false;
            }
            final var that = (PropertyKeyScanQuery) obj;
            return Objects.equals( indexName, that.indexName );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( indexName );
        }

        @Override
        public String toString()
        {
            return String.format( "%s[index='%s']", getClass().getSimpleName(), indexName );
        }
    }
}
