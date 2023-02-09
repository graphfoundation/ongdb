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
package org.neo4j.graphdb.schema;

import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.graphdb.IndexingTestUtil.assertOnlyDefaultTokenIndexesExists;
import static org.neo4j.graphdb.IndexingTestUtil.dropAllIndexes;
import static org.neo4j.graphdb.schema.AnyTokens.ANY_LABELS;
import static org.neo4j.graphdb.schema.AnyTokens.ANY_RELATIONSHIP_TYPES;

@TestDirectoryExtension
@DbmsExtension
class PropertyIndexPopulationIT
{
    private static final Label PERSON = Label.label( "person" );
    private static final RelationshipType FRIEND = RelationshipType.withName( "friend" );

    @Inject
    private TestDirectory testDir;

    @Inject
    private GraphDatabaseService db;

    @Test
    void shouldCreatePropertyIndexUsingTokenIndexes()
    {
        //Given
        assertOnlyDefaultTokenIndexesExists( db );
        populateData();

        //When
        var propertyIndex = createLabelPropertyIndex();
        var relPropertyIndex = createRelationshipTypePropertyIndex();

        //Then
        try ( var tx = db.beginTx() )
        {
            tx.schema().awaitIndexOnline( propertyIndex.getName(), 5, MINUTES );
            tx.schema().awaitIndexOnline( relPropertyIndex.getName(), 5, MINUTES );
            verifyData( tx );
        }
    }

    @Test
    void shouldCreatePropertyIndexWithoutAnyTokenIndexes()
    {
        //Given
        dropAllIndexes( db );
        populateData();

        //When
        var relationPropertyIndex = createRelationshipTypePropertyIndex();
        var labelPropertyIndex = createLabelPropertyIndex();

        //Then
        try ( var tx = db.beginTx() )
        {
            tx.schema().awaitIndexOnline( relationPropertyIndex.getName(), 5, MINUTES );
            tx.schema().awaitIndexOnline( labelPropertyIndex.getName(), 5, MINUTES );
            verifyData( tx );
        }
    }

    @Test
    void shouldCreateTokenAndPropertyIndexesInTheSameTransaction()
    {
        //Given
        dropAllIndexes( db );
        populateData();

        IndexDefinition relationPropertyIndex;
        IndexDefinition labelPropertyIndex;
        IndexDefinition labelIndex;
        IndexDefinition relTypeIndex;

        //When
        try ( var tx = db.beginTx() )
        {
            labelIndex = tx.schema().indexFor( ANY_LABELS ).create();
            relTypeIndex = tx.schema().indexFor( ANY_RELATIONSHIP_TYPES ).create();
            labelPropertyIndex = tx.schema().indexFor( PERSON ).on( "name" ).create();
            relationPropertyIndex = tx.schema().indexFor( FRIEND ).on( "tag" ).create();
            tx.commit();
        }

        //Then
        try ( var tx = db.beginTx() )
        {
            tx.schema().awaitIndexOnline( relTypeIndex.getName(), 5, MINUTES );
            tx.schema().awaitIndexOnline( labelIndex.getName(), 5, MINUTES );
            tx.schema().awaitIndexOnline( labelPropertyIndex.getName(), 5, MINUTES );
            tx.schema().awaitIndexOnline( relationPropertyIndex.getName(), 5, MINUTES );
            verifyData( tx );
        }
    }

    private static void verifyData( Transaction tx )
    {
        assertThat( tx.findNodes( PERSON ).stream().count() ).isEqualTo( 1 );
        assertThat( tx.findRelationships( FRIEND ).stream().count() ).isEqualTo( 1 );
        assertThat( tx.findNodes( PERSON, "name", "some name" ).stream().count() ).isEqualTo( 1 );
        assertThat( tx.findRelationships( FRIEND, "tag", "some value" ).stream().count() ).isEqualTo( 1 );
    }

    private void populateData()
    {
        try ( var tx = db.beginTx() )
        {
            Node node = tx.createNode( PERSON );
            node.setProperty( "name", "some name" );
            Relationship relationship = node.createRelationshipTo( tx.createNode(), FRIEND );
            relationship.setProperty( "tag", "some value" );
            tx.commit();
        }
    }

    private IndexDefinition createLabelPropertyIndex()
    {
        try ( var tx = db.beginTx() )
        {
            IndexDefinition indexDefinition = tx.schema().indexFor( PERSON ).on( "name" ).create();
            tx.commit();
            return indexDefinition;
        }
    }

    private IndexDefinition createRelationshipTypePropertyIndex()
    {
        try ( var tx = db.beginTx() )
        {
            IndexDefinition indexDefinition = tx.schema().indexFor( FRIEND ).on( "tag" ).create();
            tx.commit();
            return indexDefinition;
        }
    }
}
