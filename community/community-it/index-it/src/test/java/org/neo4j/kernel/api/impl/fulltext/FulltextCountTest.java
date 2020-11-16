/*
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.kernel.api.impl.fulltext;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.RuleChain;
import org.junit.rules.Timeout;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseBuilder;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.rule.CleanupRule;
import org.neo4j.test.rule.TestDirectory;
import org.neo4j.test.rule.VerboseTimeout;
import org.neo4j.test.rule.fs.DefaultFileSystemRule;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

public class FulltextCountTest
{
    static final String COUNT_NODES = "CALL db.index.fulltext.countNodes(\"%s\", \"%s\") YIELD count RETURN count";
    static final String COUNT_RELS = "CALL db.index.fulltext.countRelationships(\"%s\", \"%s\") YIELD count RETURN count";

    static final String NODE_CREATE = "CALL db.index.fulltext.createNodeIndex(\"%s\", %s, %s )";
    static final String RELATIONSHIP_CREATE = "CALL db.index.fulltext.createRelationshipIndex(\"%s\", %s, %s )";

    static final String PERSON = "Person";
    static final String NAME = "name";
    static final String UID = "uid";

    static final String RELATED_TO = "RELATED_TO";
    static final String RELATION = "relation";

    static final String TX_CHANGE_COUNT_NODES = "MATCH (n:" + PERSON + ")" +
                                                " WHERE n." + UID + " = 1" +
                                                " SET n." + NAME + " = 'Jane Doe'" +
                                                " WITH n" +
                                                " CALL db.index.fulltext.countNodes(\"%s\", \"%s\") YIELD count" +
                                                " RETURN count";

    static final String TX_CHANGE_COUNT_RELS = "MATCH (:" + PERSON + ")-[r:" + RELATED_TO + "]->(:" + PERSON + ")" +
                                               " WHERE r." + RELATION + " = 'brother'" +
                                               " SET r." + RELATION + " = 'sister'" +
                                               " WITH r" +
                                               " CALL db.index.fulltext.countRelationships(\"%s\", \"%s\") YIELD count" +
                                               " RETURN count";

    private final Timeout timeout = VerboseTimeout.builder().withTimeout( 1, TimeUnit.HOURS ).build();
    private final DefaultFileSystemRule fs = new DefaultFileSystemRule();
    private final TestDirectory testDirectory = TestDirectory.testDirectory();
    private final ExpectedException expectedException = ExpectedException.none();
    private final CleanupRule cleanup = new CleanupRule();

    @Rule
    public final RuleChain rules = RuleChain.outerRule( timeout ).around( fs ).around( testDirectory ).around( expectedException ).around( cleanup );

    private GraphDatabaseAPI db;
    private GraphDatabaseBuilder builder;

    @Before
    public void before()
    {
        GraphDatabaseFactory factory = new GraphDatabaseFactory();
        builder = factory.newEmbeddedDatabaseBuilder( testDirectory.databaseDir() );
        builder.setConfig( GraphDatabaseSettings.store_internal_log_level, "DEBUG" );
    }

    @After
    public void tearDown()
    {
        if ( db != null )
        {
            db.shutdown();
        }
    }

    @Test
    public void countNodesTest()
    {
        db = createDatabase();

        // Create the Fulltext indexes and entities
        populateGraphWithEntities( db );

        // Assertions to ensure counting is working as expected
        Result result;

        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( COUNT_NODES, "node-count-index", "*" ) );
            countAssertionHelper( result, 4 );
            result.close();
            tx.success();
        }

        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( COUNT_NODES, "node-count-index", "john" ) );
            countAssertionHelper( result, 3 );
            result.close();
            tx.success();
        }

        // Ensure counting works even if changes occur in transaction
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( TX_CHANGE_COUNT_NODES, "node-count-index", "john" ) );
            countAssertionHelper( result, 2 );
            result.close();
            tx.success();
        }
    }

    @Test
    public void countRelationshipTest()
    {
        db = createDatabase();

        // Create the Fulltext indexes and entities
        populateGraphWithEntities( db );

        // Assertions to ensure counting is working as expected
        Result result;

        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( COUNT_RELS, "relationship-count-index", "*" ) );
            countAssertionHelper( result, 4 );
            result.close();
            tx.success();
        }

        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( COUNT_RELS, "relationship-count-index", "brother" ) );
            countAssertionHelper( result, 3 );
            result.close();
            tx.success();
        }

        // Ensure counting works even if changes occur in transaction
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( format( TX_CHANGE_COUNT_RELS, "relationship-count-index", "brother" ) );
            countAssertionHelper( result, 2 );
            result.close();
            tx.success();
        }
    }

    private static void countAssertionHelper( Result result, long expectedCount )
    {
        Map<String,Object> row;
        while ( result.hasNext() )
        {
            row = result.next();
            assertEquals( expectedCount, (long) row.get( "count" ) );
        }
        result.close();
    }

    private static void populateGraphWithEntities( GraphDatabaseAPI db )
    {
        final Label PERSON_LABEL = Label.label( PERSON );
        final RelationshipType RELATED_TO_TYPE = RelationshipType.withName( RELATED_TO );

        db.execute( format( NODE_CREATE, "node-count-index", array( PERSON ), array( NAME ) ) ).close();

        db.execute( format( RELATIONSHIP_CREATE, "relationship-count-index", array( RELATED_TO ), array( RELATION ) ) ).close();

        try ( Transaction tx = db.beginTx() )
        {

            Node p1 = db.createNode( PERSON_LABEL );
            p1.setProperty( NAME, "John Doe" );
            p1.setProperty( UID, 1 );

            Node p2 = db.createNode( PERSON_LABEL );
            p2.setProperty( NAME, "John Smith" );
            p2.setProperty( UID, 2 );

            Node p3 = db.createNode( PERSON_LABEL );
            p3.setProperty( NAME, "John Wright" );
            p3.setProperty( UID, 3 );

            Node p4 = db.createNode( PERSON_LABEL );
            p4.setProperty( NAME, "Dave Smith" );
            p4.setProperty( UID, 4 );

            Relationship p2p4 = p2.createRelationshipTo( p4, RELATED_TO_TYPE );
            p2p4.setProperty( RELATION, "brother" );

            Relationship p2p1 = p2.createRelationshipTo( p1, RELATED_TO_TYPE );
            p2p1.setProperty( RELATION, "brother in-law" );

            Relationship p4p1 = p4.createRelationshipTo( p1, RELATED_TO_TYPE );
            p4p1.setProperty( RELATION, "brother in-law" );

            Relationship p1p3 = p1.createRelationshipTo( p3, RELATED_TO_TYPE );
            p1p3.setProperty( RELATION, "father" );

            tx.success();
        }
    }

    private GraphDatabaseAPI createDatabase()
    {
        return (GraphDatabaseAPI) cleanup.add( builder.newGraphDatabase() );
    }

    private void awaitIndexesOnline()
    {
        try ( Transaction tx = db.beginTx() )
        {
            db.schema().awaitIndexesOnline( 1, TimeUnit.MINUTES );
            tx.success();
        }
    }

    static String array( String... args )
    {
        return Arrays.stream( args ).map( s -> "\"" + s + "\"" ).collect( Collectors.joining( ", ", "[", "]" ) );
    }
}
