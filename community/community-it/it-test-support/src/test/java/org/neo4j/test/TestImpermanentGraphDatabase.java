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
package org.neo4j.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.collection.Iterables;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

class TestImpermanentGraphDatabase
{
    private GraphDatabaseService db;
    private DatabaseManagementService managementService;

    @BeforeEach
    void createDb()
    {
        managementService = new TestDatabaseManagementServiceBuilder().impermanent().build();
        db = managementService.database( DEFAULT_DATABASE_NAME );
    }

    @AfterEach
    void tearDown()
    {
        managementService.shutdown();
    }

    @Test
    void shouldKeepDataBetweenStartAndShutdown()
    {
        createNode();

        assertEquals( 1, nodeCount(), "Expected one new node" );
    }

    @Test
    void dataShouldNotSurviveShutdown()
    {
        createNode();
        managementService.shutdown();

        createDb();

        assertEquals( 0, nodeCount(), "Should not see anything." );
    }

    @Test
    void shouldRemoveAllData()
    {
        try ( Transaction tx = db.beginTx() )
        {
            RelationshipType relationshipType = RelationshipType.withName( "R" );

            Node n1 = tx.createNode();
            Node n2 = tx.createNode();
            Node n3 = tx.createNode();

            n1.createRelationshipTo(n2, relationshipType);
            n2.createRelationshipTo(n1, relationshipType);
            n3.createRelationshipTo(n1, relationshipType);

            tx.commit();
        }

        cleanDatabaseContent( db );

        assertThat( nodeCount() ).isZero();
    }

    private static void cleanDatabaseContent( GraphDatabaseService db )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.getAllRelationships().forEach( Relationship::delete );
            tx.getAllNodes().forEach( Node::delete );
            tx.commit();
        }
    }

    private long nodeCount()
    {
        try ( Transaction transaction = db.beginTx() )
        {
            return Iterables.count( transaction.getAllNodes() );
        }
    }

    private void createNode()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode();
            tx.commit();
        }
    }
}
