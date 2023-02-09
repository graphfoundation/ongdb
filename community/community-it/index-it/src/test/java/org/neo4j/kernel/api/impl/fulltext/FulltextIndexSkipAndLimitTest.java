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
package org.neo4j.kernel.api.impl.fulltext;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import org.neo4j.graphdb.Entity;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FulltextIndexSkipAndLimitTest extends FulltextProceduresTestSupport
{
    private long topEntity;
    private long middleEntity;
    private long bottomEntity;

    private void setUp( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );

        try ( Transaction tx = db.beginTx() )
        {
            topEntity = entityUtil.createEntityWithProperty( tx, "zebra zebra zebra zebra donkey" );
            middleEntity = entityUtil.createEntityWithProperty( tx, "zebra zebra zebra donkey" );
            bottomEntity = entityUtil.createEntityWithProperty( tx, "zebra donkey" );

            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryEntitiesMustApplySkip( EntityUtil entityUtil )
    {
        setUp( entityUtil );

        try ( Transaction tx = db.beginTx();
                ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{skip:1}" ) )
        {
            assertThat( iterator.next().getId() ).isEqualTo( middleEntity );
            assertThat( iterator.next().getId() ).isEqualTo( bottomEntity );
            assertFalse( iterator.hasNext() );
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryEntitiesMustApplyLimit( EntityUtil entityUtil )
    {
        setUp( entityUtil );

        try ( Transaction tx = db.beginTx();
                ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{limit:1}" ) )
        {
            assertThat( iterator.next().getId() ).isEqualTo( topEntity );
            assertFalse( iterator.hasNext() );
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryEntitiesMustApplySkipAndLimit( EntityUtil entityUtil )
    {
        setUp( entityUtil );

        try ( Transaction tx = db.beginTx();
                ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{skip:1, limit:1}" ) )
        {
            assertThat( iterator.next().getId() ).isEqualTo( middleEntity );
            assertFalse( iterator.hasNext() );
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryEntitiesWithSkipAndLimitMustIgnoreEntitiesDeletedInTransaction( EntityUtil entityUtil )
    {
        setUp( entityUtil );

        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.deleteEntity( tx, topEntity );
            try ( ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{skip:1}" ) )
            {
                assertThat( iterator.next().getId() ).isEqualTo( bottomEntity ); // Without topEntity, middleEntity is now the one we skip.
                assertFalse( iterator.hasNext() );
            }
            try ( ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{limit:1}" ) )
            {
                assertThat( iterator.next().getId() ).isEqualTo( middleEntity ); // Without topEntity, middleEntity is now the best match.
                assertFalse( iterator.hasNext() );
            }
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryEntitiesWithSkipAndLimitMustIncludeEntitiesAddedInTransaction( EntityUtil entityUtil )
    {
        setUp( entityUtil );

        try ( Transaction tx = db.beginTx() )
        {
            long entityId = entityUtil.createEntityWithProperty( tx, "zebra zebra donkey" );
            try ( ResourceIterator<Entity> iterator = entityUtil.queryIndexWithOptions( tx, "zebra", "{skip:1, limit:2}" ) )
            {
                assertThat( iterator.next().getId() ).isEqualTo( middleEntity );
                assertThat( iterator.next().getId() ).isEqualTo( entityId );
                assertFalse( iterator.hasNext() );
            }
            tx.commit();
        }
    }
}
