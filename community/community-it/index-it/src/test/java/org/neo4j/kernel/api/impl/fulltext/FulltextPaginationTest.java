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

public class FulltextPaginationTest
{
    static final String SEARCH_NODES = "CALL db.index.fulltext.searchNodes(\"%s\", \"%s\", %s)";
    static final String SEARCH_RELATIONSHIPS = "CALL db.index.fulltext.searchRelationships(\"%s\", \"%s\", %s)";
    static final String NODE_CREATE_SORT = "CALL db.index.fulltext.createNodeIndex(\"%s\", %s, %s, %s, %s )";
    static final String RELATIONSHIP_CREATE_SORT = "CALL db.index.fulltext.createRelationshipIndex(\"%s\", %s, %s, %s, %s)";

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
    public void pagedSearchNodesIndexReturnsPagedResults()
    {
        final Label PERSON = Label.label( "Person" );

        db = createDatabase();

        // Create Fulltext index w/o sort
        db.execute( format( NODE_CREATE_SORT, "fulltext-index", array( "Person" ), array( "name" ), "{}", "{}" ) ).close();

        // Populate Graph
        int entityCount = 100;
        long bornValue = 1900;
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < entityCount; i++ )
            {
                Node node = db.createNode( PERSON );
                node.setProperty( "name", "Bob" + bornValue );
                bornValue++;
            }
            tx.success();
        }

        Result result;
        try ( Transaction tx = db.beginTx() )
        {
            // Search with Paging
            result = db.execute( format( SEARCH_NODES, "fulltext-index", "*", "{limit:10}" ) );

            // Loop through results
            long numResults = 0;
            while ( result.hasNext() )
            {
                result.next();
                numResults++;
            }
            // Verify results were paged
            assertEquals( 10, numResults );
            result.close();
            tx.success();
        }
    }

    @Test
    public void pagedSearchRelationshipsIndexReturnsPagedResults()
    {
        final Label MOVIE = Label.label( "Movie" );
        final Label PERSON = Label.label( "Person" );
        final RelationshipType REVIEWED = RelationshipType.withName( "REVIEWED" );

        db = createDatabase();

        // Create Fulltext index
        db.execute( format( RELATIONSHIP_CREATE_SORT, "fulltext-index", array( "REVIEWED" ), array( "summary" ), "{}", "{}" ) ).close();

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
                relationshipTo.setProperty( "summary", "I give this movie " + ratingValue + " out of 100." );

                ratingValue++;
            }
            tx.success();
        }

        // Query and Assert
        Result result;
        try ( Transaction tx = db.beginTx() )
        {
            // Search with paging
            result = db.execute( format( SEARCH_RELATIONSHIPS, "fulltext-index", "*", "{limit: 10}" ) );

            // Loop through results
            long numResults = 0;
            while ( result.hasNext() )
            {
                result.next();
                numResults++;
            }
            // Verify results were returned
            assertEquals( 10, numResults );
            result.close();
            tx.success();
        }
    }

    /**
     * Asserts that paging and sorted queries returns sorted and paged results
     */
    @Test
    public void pagedSearchNodesSortIndexReturnsSortedPagedResults()
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
                node.setProperty( "name", "Bob" + bornValue );
                node.setProperty( BORN, bornValue );
                bornValue++;
            }
            tx.success();
        }

        // Query and Assert
        Result result;
        Map<String,Object> row;
        // Try without sorting
        try ( Transaction tx = db.beginTx() )
        {
            // Search with Paging
            result = db.execute( format( SEARCH_NODES, "sort-index", "*", "{limit: 10}" ) );

            // Loop through results
            long numResults = 0;
            while ( result.hasNext() )
            {
                result.next();
                numResults++;
            }
            // Verify results were paged
            assertEquals( 10, numResults );
            result.close();
            tx.success();
        }

        // Try with sort
        try ( Transaction tx = db.beginTx() )
        {
            // Search with sort and paging
            result = db.execute( format( SEARCH_NODES, "sort-index", "*", "{skip: 10, limit: 10, sortBy: [{property: 'born'}]}" ) );

            // Loop through results, verify they are in order.
            long lastBorn = 1910;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastBorn, ((Node) row.get( "node" )).getProperty( "born" ) );
                lastBorn++;
            }
            // Verify results were paged
            assertEquals( 1920, lastBorn );
            result.close();
            tx.success();
        }

        // Try with reversed order
        try ( Transaction tx = db.beginTx() )
        {
            // Query with Sort
            result = db.execute( format( SEARCH_NODES, "sort-index", "*", "{skip: 10, limit: 10, sortBy: [{property: 'born', direction: 'DESC'}]}" ) );

            // Loop through results, verify they are in order.
            long lastBorn = 1989;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastBorn, ((Node) row.get( "node" )).getProperty( "born" ) );
                lastBorn--;
            }
            // Verify results were returned
            assertEquals( 1979, lastBorn );
            result.close();
            tx.success();
        }
        db.shutdown();
    }

    @Test
    public void pagedSearchRelationshipSortIndexReturnsSortedPagedResults()
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
                relationshipTo.setProperty( "summary", "I give this movie " + ratingValue + " out of 100." );
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
            // Search with paging
            result = db.execute( format( SEARCH_RELATIONSHIPS, "sort-index", "*", "{limit: 10}" ) );

            // Loop through results, verify they are in order.
            long numResults = 0;
            while ( result.hasNext() )
            {
                row = result.next();
                numResults++;
            }
            // Verify results were returned
            assertEquals( 10, numResults );
            result.close();
            tx.success();
        }

        try ( Transaction tx = db.beginTx() )
        {
            // Search with sort and paging
            result = db.execute( format( SEARCH_RELATIONSHIPS, "sort-index", "*", "{skip: 10, limit: 10, sortBy: [{property: 'rating'}]}" ) );

            // Loop through results, verify they are in order.
            long lastRating = 10;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastRating, ((Relationship) row.get( "relationship" )).getProperty( "rating" ) );
                lastRating++;
            }
            // Verify results were returned
            assertEquals( lastRating, 20 );
            result.close();
            tx.success();
        }

        // Try with reversed order
        try ( Transaction tx = db.beginTx() )
        {
            // Query with Sort
            result = db.execute(
                    format( SEARCH_RELATIONSHIPS, "sort-index", "*", "{skip: 10, limit:10, sortBy: [{property: 'rating', direction: 'DESC'}]}" ) );

            // Loop through results, verify they are in order.
            long lastRating = 89;
            while ( result.hasNext() )
            {
                row = result.next();
                assertEquals( lastRating, ((Relationship) row.get( "relationship" )).getProperty( "rating" ) );
                lastRating--;
            }
            // Verify results were returned
            assertEquals( 79, lastRating );
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
