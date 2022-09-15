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

import java.util.List;
import java.util.Objects;

import org.neo4j.common.EntityType;
import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.internal.kernel.api.TokenPredicate;
import org.neo4j.internal.kernel.api.TokenReadSession;
import org.neo4j.kernel.impl.newapi.PartitionedScanTestSuite.Query;
import org.neo4j.kernel.impl.newapi.TokenIndexScanPartitionedScanTestSuite.TokenScanQuery;

public abstract class TokenIndexScanPartitionedScanTestSuite<CURSER extends Cursor>
        implements PartitionedScanTestSuite.TestSuite<TokenScanQuery,TokenReadSession,CURSER>
{
    abstract static class WithoutData<CURSER extends Cursor>
            extends PartitionedScanTestSuite.WithoutData<TokenScanQuery,TokenReadSession,CURSER>
    {
        WithoutData( TokenIndexScanPartitionedScanTestSuite<CURSER> testSuite )
        {
            super( testSuite );
        }

        Queries<TokenScanQuery> emptyQueries( EntityType entityType, List<Integer> tokenIds )
        {
            final var tokenIndexName = getTokenIndexName( entityType );
            final var empty = tokenIds.stream()
                                      .map( TokenPredicate::new )
                                      .map( pred -> new TokenScanQuery( tokenIndexName, pred ) )
                                      .collect( EntityIdsMatchingQuery.collector() );
            return new Queries<>( empty );
        }
    }

    abstract static class WithData<CURSER extends Cursor>
            extends PartitionedScanTestSuite.WithData<TokenScanQuery,TokenReadSession,CURSER>
    {
        WithData( TokenIndexScanPartitionedScanTestSuite<CURSER> testSuite )
        {
            super( testSuite );
        }

        abstract Queries<TokenScanQuery> createData( int numberOfEntities, List<Integer> tokenIds );
    }

    protected static final class TokenScanQuery implements Query<TokenPredicate>
    {
        private final String name;
        private final TokenPredicate predicate;

        public TokenScanQuery( String name, TokenPredicate predicate )
        {
            this.name = name;
            this.predicate = predicate;
        }

        @Override
        public String indexName()
        {
            return name;
        }

        @Override
        public TokenPredicate get()
        {
            return predicate;
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
            final var that = (TokenScanQuery) obj;
            return Objects.equals( name, that.name ) && Objects.equals( predicate.tokenId(), that.predicate.tokenId() );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( name, predicate.tokenId() );
        }

        @Override
        public String toString()
        {
            return String.format( "%s[index='%s', pred='%s']", getClass().getSimpleName(), name, predicate.tokenId() );
        }
    }
}
