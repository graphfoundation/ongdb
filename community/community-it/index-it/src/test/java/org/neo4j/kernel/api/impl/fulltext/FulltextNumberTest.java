/*
 * Copyright (c) 2002-2020 Graph Foundation, Inc.[https://graphfoundation.org]
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
import org.junit.Assert;
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
import org.neo4j.graphdb.QueryExecutionException;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseBuilder;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.impl.core.NodeProxy;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.rule.CleanupRule;
import org.neo4j.test.rule.TestDirectory;
import org.neo4j.test.rule.VerboseTimeout;
import org.neo4j.test.rule.fs.DefaultFileSystemRule;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FulltextNumberTest
{
    private static final String DB_INDEXES = "CALL db.indexes";
    static final String QUERY_NODES = "CALL db.index.fulltext.queryNodes(\"%s\", \"%s\")";
    static final String QUERY_RELS = "CALL db.index.fulltext.queryRelationships(\"%s\", \"%s\")";
    static final String NODE_CREATE = "CALL db.index.fulltext.createNodeIndex(\"%s\", %s, %s, %s )";
    static final String RELATIONSHIP_CREATE = "CALL db.index.fulltext.createRelationshipIndex(\"%s\", %s, %s, %s)";

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
    public void queryNodesIndexForNumeric()
    {
        final Label PERSON = Label.label( "Person" );
        final String BORN = "born";

        db = createDatabase();

        // Create Fulltext index with a numeric property for searching
        db.execute( format( NODE_CREATE, "number-index", array( "Person" ), array( "name", "born" ), "{}" ) ).close();

        // Populate Graph
        int entityCount = 100;
        long bornValue = 1900;
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < entityCount; i++ )
            {
                Node node = db.createNode( PERSON );
                node.setProperty( BORN, bornValue );
                bornValue++;
            }
            tx.success();
        }

        // Query and Assert
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            // Query for numeric
            result = db.execute( format( QUERY_NODES, "number-index", "195*" ) );

            // Loop through results
            long numRecords = 0;
            while ( result.hasNext() )
            {
                row = result.next();
                Long born = (Long) ((Node) row.get( "node" )).getProperty( "born" );
                assertTrue( born >= 1950 && born < 1960 );
                numRecords++;
            }
            assertEquals( 10, numRecords );
            result.close();
            tx.success();
        }

        db.shutdown();
    }

    @Test
    public void queryRelsIndexForNumeric()
    {
        final Label MOVIE = Label.label( "Movie" );
        final Label PERSON = Label.label( "Person" );
        final RelationshipType REVIEWED = RelationshipType.withName( "REVIEWED" );
        final String RATING = "rating";

        db = createDatabase();

        // Create Fulltext index
        db.execute( format( RELATIONSHIP_CREATE, "number-index", array( "REVIEWED" ), array( "summary", "rating" ), "{}" ) ).close();

        // Populate Graph
        int entityCount = 100;
        long ratingValue = 0;
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < entityCount; i++ )
            {
                Node person = db.createNode( PERSON );
                Node movie = db.createNode( MOVIE );

                Relationship relationshipTo = person.createRelationshipTo( movie, REVIEWED );
                relationshipTo.setProperty( RATING, ratingValue );

                ratingValue++;
            }
            tx.success();
        }

        // Query and Assert
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            // Query
            result = db.execute( format( QUERY_RELS, "number-index", "5*" ) );

            // Loop through results, verify they are in order.
            long numRecords = 0;
            while ( result.hasNext() )
            {
                row = result.next();
                Long rating = (Long) ((Relationship) row.get( "relationship" )).getProperty( "rating" );
                assertTrue( (rating >= 50 && rating < 60) || rating == 5);
                numRecords++;
            }
            assertEquals( 11, numRecords );

            result.close();
            tx.success();
        }

        db.shutdown();
    }


    @Test
    public void stopAnalyzerNumericQuery()
    {
        final Label PERSON = Label.label( "Person" );
        final String BORN = "born";

        db = createDatabase();

        // Create Fulltext index with a numeric property for searching
        db.execute( format( NODE_CREATE, "number-index", array( "Person" ), array( "name", "born" ), "{analyzer: \"stop\"}" ) ).close();

        // Populate Graph
        int entityCount = 100;
        long bornValue = 1900;
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < entityCount; i++ )
            {
                Node node = db.createNode( PERSON );
                node.setProperty( BORN, bornValue );
                bornValue++;
            }
            tx.success();
        }

        // Query and Assert
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            // Query for numeric
            result = db.execute( format( QUERY_NODES, "number-index", "195*" ) );
            assertEquals( 0, result.stream().count() );
            result.close();
            tx.success();
        }

        db.shutdown();
    }

    private GraphDatabaseAPI createDatabase()
    {
        return (GraphDatabaseAPI) cleanup.add( builder.newGraphDatabase() );
    }

    static String array( String... args )
    {
        return Arrays.stream( args ).map( s -> "\"" + s + "\"" ).collect( Collectors.joining( ", ", "[", "]" ) );
    }
}
