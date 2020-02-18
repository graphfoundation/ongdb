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
import java.util.List;
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

public class FulltextSortTest
{
    private static final String DB_INDEXES = "CALL db.indexes";
    static final String QUERY_NODES_SORT = "CALL db.index.fulltext.queryNodes(\"%s\", \"%s\", \"%s\", \"%s\")";
    static final String QUERY_RELS_SORT = "CALL db.index.fulltext.queryRelationships(\"%s\", \"%s\", \"%s\")";
    static final String NODE_CREATE_SORT = "CALL db.index.fulltext.createNodeIndex(\"%s\", %s, %s, %s, %s )";
    static final String RELATIONSHIP_CREATE_SORT = "CALL db.index.fulltext.createRelationshipIndex(\"%s\", %s, %s, %s, %s)";

    static final String NAME = "name";
    static final String BORN = "born";
    static final String COLOR = "color";
    static final String HEIGHT = "height";
    static final String UID = "uid";

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
    public void createNodeFulltextSortIndex()
    {
        db = createDatabase();

        String sortMap = "{sortProp: \"LONG\"}";
        db.execute( format( NODE_CREATE_SORT, "sort-index", array( "Label1" ), array( "prop1" ), "{}", sortMap ) ).close();
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( "INDEX ON NODE:Label1(prop1)", row.get( "description" ) );
            assertEquals( asList( "Label1" ), row.get( "tokenNames" ) );
            assertEquals( asList( "prop1" ), row.get( "properties" ) );
            assertEquals( asList( "sortProp" ), row.get( "sortProperties" ) );
            assertEquals( "sort-index", row.get( "indexName" ) );
            assertEquals( "node_fulltext", row.get( "type" ) );
            assertFalse( result.hasNext() );
            result.close();
            awaitIndexesOnline();
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            assertEquals( "ONLINE", result.next().get( "state" ) );
            assertFalse( result.hasNext() );
            result.close();
            assertNotNull( db.schema().getIndexByName( "sort-index" ) );
            tx.success();
        }
        db.shutdown();

        // Ensure it persists over restarts
        db = createDatabase();
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( "INDEX ON NODE:Label1(prop1)", row.get( "description" ) );
            assertEquals( "ONLINE", row.get( "state" ) );
            assertEquals( asList( "prop1" ), row.get( "properties" ) );
            assertEquals( asList( "sortProp" ), row.get( "sortProperties" ) );
            assertFalse( result.hasNext() );
            //noinspection ConstantConditions
            assertFalse( result.hasNext() );
            assertNotNull( db.schema().getIndexByName( "sort-index" ) );
            tx.success();
        }
    }

    @Test
    public void createRelationshipFulltextSortIndex()
    {
        db = createDatabase();
        String sortMap = "{sortProp: \"LONG\", prop1: \"STRING\"}";
        db.execute( format( RELATIONSHIP_CREATE_SORT, "sort-index", array( "Reltype1" ), array( "prop1" ), "{}", sortMap ) ).close();
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( "INDEX ON RELATIONSHIP:Reltype1(prop1)", row.get( "description" ) );
            assertEquals( asList( "Reltype1" ), row.get( "tokenNames" ) );
            assertEquals( asList( "prop1" ), row.get( "properties" ) );
            assertEquals( asList( "prop1", "sortProp" ), row.get( "sortProperties" ) );
            assertEquals( "sort-index", row.get( "indexName" ) );
            assertEquals( "relationship_fulltext", row.get( "type" ) );
            assertFalse( result.hasNext() );
            result.close();
            awaitIndexesOnline();
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            assertEquals( "ONLINE", result.next().get( "state" ) );
            assertFalse( result.hasNext() );
            result.close();
            assertNotNull( db.schema().getIndexByName( "sort-index" ) );
            tx.success();
        }
        db.shutdown();
        db = createDatabase();
        try ( Transaction tx = db.beginTx() )
        {
            result = db.execute( DB_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( "INDEX ON RELATIONSHIP:Reltype1(prop1)", row.get( "description" ) );
            assertEquals( "ONLINE", row.get( "state" ) );
            assertEquals( asList( "prop1" ), row.get( "properties" ) );
            assertEquals( asList( "prop1", "sortProp" ), row.get( "sortProperties" ) );
            assertFalse( result.hasNext() );
            //noinspection ConstantConditions
            assertFalse( result.hasNext() );
            assertNotNull( db.schema().getIndexByName( "sort-index" ) );
            tx.success();
        }
    }

    @Test
    public void queryNodesSortIndexReturnsSortedResults()
    {
        final Label PERSON = Label.label( "Person" );
        final String BORN = "born";

        db = createDatabase();

        // Create Fulltext Sort index
        String sortMap = "{born: \"LONG\"}";
        db.execute( format( NODE_CREATE_SORT, "sort-index", array( "Person" ), array( "name" ), "{}", sortMap ) ).close();

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
            // Query with Sort
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", "born", "ASC" ) );

            // Loop through results, verify they are in order.
            long lastBorn = 1900;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastBorn, row.get( "born" ) );
                lastBorn++;
            }
            result.close();
            tx.success();
        }

        // Try with reversed order
        try ( Transaction tx = db.beginTx() )
        {
            // Query with Sort
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", "born", "DESC" ) );

            // Loop through results, verify they are in order.
            long lastBorn = 2000;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastBorn, row.get( "born" ) );
                lastBorn--;
            }
            result.close();
            tx.success();
        }
        db.shutdown();
    }

    @Test
    public void queryRelationshipSortIndexReturnsSortedResults()
    {
        final Label MOVIE = Label.label( "Movie" );
        final Label PERSON = Label.label( "Person" );
        final RelationshipType REVIEWED = RelationshipType.withName( "REVIEWED" );
        final String RATING = "rating";

        db = createDatabase();

        // Create Fulltext Sort index
        String sortMap = "{rating: \"LONG\"}";
        db.execute( format( RELATIONSHIP_CREATE_SORT, "sort-index", array( "REVIEWED" ), array( "summary" ), "{}", sortMap ) ).close();

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
            // Query with Sort
            result = db.execute( format( QUERY_RELS_SORT, "sort-index", "*", "rating", "ASC" ) );

            // Loop through results, verify they are in order.
            long lastRating = 0;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastRating, row.get( "rating" ) );
                lastRating++;
            }
            result.close();
            tx.success();
        }

        // Try with reversed order
        try ( Transaction tx = db.beginTx() )
        {
            // Query with Sort
            result = db.execute( format( QUERY_RELS_SORT, "sort-index", "*", "rating", "DESC" ) );

            // Loop through results, verify they are in order.
            long lastRating = 100;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastRating, row.get( "rating" ) );
                lastRating--;
            }
            result.close();
            tx.success();
        }
        db.shutdown();
    }

    @Test
    public void badSortTypeResultsInError()
    {
        db = createDatabase();

        boolean errorOccurred = false;

        // Create Fulltext Sort index
        String badSortMap = "{born: \"BAD_TYPE\"}";
        try
        {
            db.execute( format( NODE_CREATE_SORT, "sort-index", array( "Person" ), array( "name" ), "{}", badSortMap ) ).close();
        }
        catch ( QueryExecutionException e )
        {
            assertEquals( "Neo.ClientError.Procedure.ProcedureCallFailed", e.getStatusCode() );
            errorOccurred = true;
        }

        if ( !errorOccurred )
        {
            Assert.fail( "Test 'badSortTypeResultsInError' failed. No error was thrown when creating an index with a bad type in the sortMap." );
        }

        db.shutdown();
    }

    @Test
    public void testAllSortTypes()
    {
        db = createDatabase();

        // Create the Fulltext index and sortable nodes
        populateGraphWithSortableEntities( db );

        Result result;
        // Assertions to ensure sorting is working as expected
        try ( Transaction tx = db.beginTx() )
        {
            Integer[] expectedOrder = new Integer[]{1,2,3,4};
            // Query with Sort : STRING -- NAME
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", NAME, "ASC" ) );
            sortOrderAssertionHelper( result, expectedOrder );


            // Query with Sort : LONG -- BORN
            expectedOrder = new Integer[]{1,3,2,4};
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", BORN, "ASC" ) );
            sortOrderAssertionHelper( result, expectedOrder );

            // Query with Sort : DOUBLE -- HEIGHT
            expectedOrder = new Integer[]{3,1,2,4};
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", HEIGHT, "ASC" ) );
            sortOrderAssertionHelper( result, expectedOrder );


            // Query with Sort : STRING -- COLOR
            expectedOrder = new Integer[]{3,2,1,4};
            result = db.execute( format( QUERY_NODES_SORT, "sort-index", "*", COLOR, "ASC" ) );
            sortOrderAssertionHelper( result, expectedOrder );

            result.close();
            tx.success();
        }

    }

    private static void sortOrderAssertionHelper( Result result, Integer[] expectedOrder )
    {
        int i = 0;
        Map<String,Object> row;
        while ( result.hasNext() )
        {
            row = result.next();
            assertEquals( expectedOrder[i], ((NodeProxy) row.get( "node" )).getProperty( UID ) );
            i++;
        }
        result.close();
    }

    private static void populateGraphWithSortableEntities( GraphDatabaseAPI db )
    {
        final Label PERSON = Label.label( "Person" );

        String sortMap = "{" + BORN + ": \"LONG\", " + COLOR + ": \"STRING\", " + HEIGHT + ": \"DOUBLE\", " + NAME + ": \"STRING\"}";
        db.execute( format( NODE_CREATE_SORT, "sort-index", array( "Person" ), array( NAME ), "{}", sortMap ) ).close();

        try ( Transaction tx = db.beginTx() )
        {

            Node p1 = db.createNode( PERSON );
            p1.setProperty( NAME, "Alex" );
            p1.setProperty( BORN, 1990L );
            p1.setProperty( COLOR, "yellow" );
            p1.setProperty( HEIGHT, 176.3D );
            p1.setProperty( UID, 1 );

            Node p2 = db.createNode( PERSON );
            p2.setProperty( NAME, "Bob" );
            p2.setProperty( BORN, 1993L );
            p2.setProperty( COLOR, "red" );
            p2.setProperty( HEIGHT, 181.9D );
            p2.setProperty( UID, 2 );

            Node p3 = db.createNode( PERSON );
            p3.setProperty( NAME, "Chris" );
            p3.setProperty( BORN, 1992L );
            p3.setProperty( COLOR, "blue" );
            p3.setProperty( HEIGHT, 171.7D );
            p3.setProperty( UID, 3 );

            Node p4 = db.createNode( PERSON );
            p4.setProperty( NAME, "Dave" );
            p4.setProperty( UID, 4 );
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
