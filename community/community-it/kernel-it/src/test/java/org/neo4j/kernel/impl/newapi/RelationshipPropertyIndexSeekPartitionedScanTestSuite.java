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

import org.junit.jupiter.api.Nested;

import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.kernel.api.RelationshipValueIndexCursor;
import org.neo4j.kernel.impl.newapi.PartitionedScanFactories.RelationshipPropertyIndexSeek;

import static org.assertj.core.api.Assertions.assertThat;

class RelationshipPropertyIndexSeekPartitionedScanTestSuite
        extends PropertyIndexSeekPartitionedScanTestSuite<RelationshipValueIndexCursor>
{
    RelationshipPropertyIndexSeekPartitionedScanTestSuite( IndexType index )
    {
        super( index );
    }

    @Override
    public final RelationshipPropertyIndexSeek getFactory()
    {
        return RelationshipPropertyIndexSeek.FACTORY;
    }

    @Nested
    class WithoutData extends PropertyIndexSeekPartitionedScanTestSuite.WithoutData<RelationshipValueIndexCursor>
    {
        WithoutData()
        {
            super( RelationshipPropertyIndexSeekPartitionedScanTestSuite.this );
        }

        @Override
        Queries<PropertyKeySeekQuery> setupDatabase()
        {
            final var numberOfRelTypes = 1;
            final var numberOfPropKeys = 2;

            final var relTypeId = createTags( numberOfRelTypes, factory.getTokenFactory() ).get( 0 );
            final var propKeyIds = createTags( numberOfPropKeys, factory.getPropKeyFactory() ).stream().mapToInt( i -> i ).toArray();

            createIndexes( createIndexPrototypes( relTypeId, propKeyIds ) );
            return emptyQueries( relTypeId, propKeyIds );
        }
    }

    @Nested
    class WithData extends PropertyIndexSeekPartitionedScanTestSuite.WithData<RelationshipValueIndexCursor>
    {
        WithData()
        {
            super( RelationshipPropertyIndexSeekPartitionedScanTestSuite.this );
        }

        @Override
        Queries<PropertyKeySeekQuery> setupDatabase()
        {
            final var numberOfRelTypes = 1;
            final var numberOfPropKeys = 2;
            final var numberOfProperties = 1 << 12;
            ratioForExactQuery = 0.002;

            final var relTypeId = createTags( numberOfRelTypes, factory.getTokenFactory() ).get( 0 );
            final var propKeyIds = createTags( numberOfPropKeys, factory.getPropKeyFactory() ).stream().mapToInt( i -> i ).toArray();

            createIndexes( createIndexPrototypes( relTypeId, propKeyIds ) );
            return createData( numberOfProperties, relTypeId, propKeyIds );
        }

        @Override
        protected Queries<PropertyKeySeekQuery> createData( int numberOfProperties, int relTypeId, int[] propKeyIds )
        {
            // given  a set of queries
            final var tracking = new TrackEntityIdsMatchingQuery();

            // given  a number of properties to create
            final var propValues = random.ints( numberOfProperties ).iterator();
            var numberOfCreatedProperties = 0;
            try ( var tx = beginTx() )
            {
                final var write = tx.dataWrite();
                while ( propValues.hasNext() )
                {
                    final var assignedProperties = new PropertyRecord[propKeyIds.length];
                    final var relId = write.relationshipCreate( write.nodeCreate(), relTypeId, write.nodeCreate() );
                    for ( int i = 0; i < propKeyIds.length; i++ )
                    {
                        if ( propValues.hasNext() )
                        {
                            // when   properties are created
                            final var prop = createRandomPropertyRecord( random, propKeyIds[i], propValues.next() );
                            write.relationshipSetProperty( relId, prop.id, prop.value );
                            numberOfCreatedProperties++;
                            assignedProperties[i] = prop;
                            // when   and tracked against queries
                            final var index = factory.getIndex( tx, relTypeId, prop.id );
                            tracking.generateAndTrack( relId, shouldIncludeExactQuery(), index, prop );
                        }
                    }
                    final var index = factory.getIndex( tx, relTypeId, propKeyIds );
                    tracking.generateAndTrack( relId, shouldIncludeExactQuery(), index, assignedProperties );
                }

                tx.commit();
            }
            catch ( KernelException e )
            {
                throw new AssertionError( "failed to create database", e );
            }

            final var expected = tracking.get();

            // then   there should be some queries to match against
            assertThat( expected.valid.queries().size() ).as( "valid queries should exist" ).isGreaterThan( 0 );

            // then   and the number created should be equal to what was asked
            assertThat( numberOfCreatedProperties ).as( "node properties created" ).isEqualTo( numberOfProperties );

            return expected;
        }
    }
}
