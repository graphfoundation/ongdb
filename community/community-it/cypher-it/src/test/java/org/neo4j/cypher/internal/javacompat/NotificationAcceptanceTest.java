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
package org.neo4j.cypher.internal.javacompat;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.graphdb.InputPosition;
import org.neo4j.graphdb.Notification;
import org.neo4j.graphdb.QueryExecutionException;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.impl.notification.NotificationDetail;
import org.neo4j.internal.helpers.collection.Iterables;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.graphdb.impl.notification.NotificationCode.EAGER_LOAD_CSV;
import static org.neo4j.graphdb.impl.notification.NotificationCode.INDEX_HINT_UNFULFILLABLE;
import static org.neo4j.graphdb.impl.notification.NotificationCode.RUNTIME_UNSUPPORTED;
import static org.neo4j.graphdb.impl.notification.NotificationCode.UNBOUNDED_SHORTEST_PATH;
import static org.neo4j.graphdb.impl.notification.NotificationDetail.Factory.nodeAnyIndex;
import static org.neo4j.graphdb.impl.notification.NotificationDetail.Factory.nodeTextIndex;

class NotificationAcceptanceTest extends NotificationTestSupport
{

    @Test
    void shouldWarnWhenRequestingSlottedRuntimeOnUnsupportedQuery()
    {
        shouldNotifyInStreamWithDetail( "EXPLAIN CYPHER runtime=slotted RETURN 1", InputPosition.empty, RUNTIME_UNSUPPORTED,
                NotificationDetail.Factory.message( "Runtime unsupported", "This version of ONgDB does not " + "support requested runtime: slotted" ) );
    }

    @Test
    void shouldGetErrorWhenUsingCreateUniqueWhenCypherVersionIs3_5()
    {
        // when
        QueryExecutionException exception = assertThrows( QueryExecutionException.class,
                () -> db.executeTransactionally( "CYPHER 3.5 MATCH (b) WITH b LIMIT 1 CREATE UNIQUE (b)-[:REL]->()" ) );
        assertThat( exception.getStatusCode(), containsString( "SyntaxError" ) );
    }

    @Test
    void shouldNotNotifyForCostUnsupportedUpdateQueryIfPlannerNotExplicitlyRequested()
    {
        shouldNotNotifyInStream( "EXPLAIN MATCH (n:Movie) SET n.title = 'The Movie'" );
    }

    @Test
    void shouldNotNotifyForCostSupportedUpdateQuery()
    {
        shouldNotNotifyInStream( "EXPLAIN CYPHER planner=cost MATCH (n:Movie) SET n:Seen" );
        shouldNotNotifyInStream( "EXPLAIN CYPHER planner=idp MATCH (n:Movie) SET n:Seen" );
        shouldNotNotifyInStream( "EXPLAIN CYPHER planner=dp MATCH (n:Movie) SET n:Seen" );
    }

    @Test
    void shouldWarnOnPotentiallyCachedQueries()
    {
        assertNotificationsInSupportedVersions( "explain match (a)-->(b), (c)-->(d) return *", containsItem( cartesianProductWarning ) );

        // no warning without explain
        shouldNotNotifyInStream( "match (a)-->(b), (c)-->(d) return *" );
    }

    @Test
    void shouldWarnOnceWhenSingleIndexHintCannotBeFulfilled()
    {
        shouldNotifyInStreamWithDetail( " EXPLAIN MATCH (n:Person) USING INDEX n:Person(name) WHERE n.name = 'John' RETURN n", InputPosition.empty,
                                        INDEX_HINT_UNFULFILLABLE, nodeAnyIndex( "n", "Person", "name" ) );
    }

    @Test
    void shouldWarnOnEachUnfulfillableIndexHint()
    {
        String query = " EXPLAIN MATCH (n:Person), (m:Party), (k:Animal), (o:Other)"
                       + "USING INDEX n:Person(name) "
                       + "USING INDEX m:Party(city) "
                       + "USING INDEX k:Animal(species) "
                       + "USING TEXT INDEX o:Other(text)"
                       + "WHERE n.name = 'John' AND m.city = 'Reykjavik' AND k.species = 'Sloth' AND o.text STARTS WITH 'a' "
                       + "RETURN n";

        shouldNotifyInStreamWithDetail( query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, nodeAnyIndex( "n", "Person", "name" ) );
        shouldNotifyInStreamWithDetail( query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, nodeAnyIndex( "m", "Party", "city" ) );
        shouldNotifyInStreamWithDetail( query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, nodeAnyIndex( "k", "Animal", "species" ) );
        shouldNotifyInStreamWithDetail( query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, nodeTextIndex( "o", "Other", "text" ) );
    }

    @Test
    void shouldNotNotifyOnLiteralMaps()
    {
        shouldNotNotifyInStream( "explain return { id: 42 } " );
    }

    @Test
    void shouldNotNotifyOnNonExistingLabelUsingLoadCSV()
    {
        // create node
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE (n:Category)" );

        // merge node
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row MERGE (n:Category)" );

        // set label to node
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE (n) SET n:Category" );
    }

    @Test
    void shouldNotNotifyOnNonExistingRelTypeUsingLoadCSV()
    {
        // create rel
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE ()-[:T]->()" );

        // merge rel
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row MERGE ()-[:T]->()" );
    }

    @Test
    void shouldNotNotifyOnNonExistingPropKeyIdUsingLoadCSV()
    {
        // create node
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE (n) SET n.p = 'a'" );

        // merge node
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row MERGE (n) ON CREATE SET n.p = 'a'" );
    }

    @Test
    void shouldNotNotifyOnEagerBeforeLoadCSVDelete()
    {
        shouldNotNotifyInStream( "EXPLAIN MATCH (n) DELETE n WITH * LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE () RETURN line" );
    }

    @Test
    void shouldNotNotifyOnEagerBeforeLoadCSVCreate()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (a), (b) CREATE (c) WITH c LOAD CSV FROM 'file:///ignore/ignore.csv' AS line RETURN *",
                containsNoItem( eagerOperatorWarning ) );
    }

    @Test
    void shouldWarnOnEagerAfterLoadCSV()
    {
        shouldNotifyInStream( "EXPLAIN MATCH (n) LOAD CSV FROM 'file:///ignore/ignore.csv' AS line WITH * DELETE n MERGE () RETURN line", InputPosition.empty,
                EAGER_LOAD_CSV );
    }

    @Test
    void shouldNotNotifyOnLoadCSVWithoutEager()
    {
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (:A) CREATE (:B) RETURN line" );
    }

    @Test
    void shouldNotNotifyOnEagerWithoutLoadCSV()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (a), (b) CREATE (c) RETURN *", containsNoItem( eagerOperatorWarning ) );
    }

    @Test
    void shouldWarnOnLargeLabelScansWithLoadCVSMatch()
    {
        for ( int i = 0; i < 11; i++ )
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.createNode().addLabel( label( "A" ) );
                tx.commit();
            }
        }
        assertNotificationsInSupportedVersions( "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (a:A) RETURN *",
                containsNoItem( largeLabelCSVWarning ) );
    }

    @Test
    void shouldWarnOnLargeLabelScansWithLoadCVSMerge()
    {
        for ( int i = 0; i < 11; i++ )
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.createNode().addLabel( label( "A" ) );
                tx.commit();
            }
        }
        assertNotificationsInSupportedVersions( "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE (a:A) RETURN *",
                containsNoItem( largeLabelCSVWarning ) );
    }

    @Test
    void shouldNotWarnOnSmallLabelScansWithLoadCVS()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode().addLabel( label( "A" ) );
            tx.commit();
        }
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (a:A) RETURN *" );
        shouldNotNotifyInStream( "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE (a:A) RETURN *" );
    }

    @Test
    void shouldWarnOnUnboundedShortestPath()
    {
        shouldNotifyInStream( "EXPLAIN MATCH p = shortestPath((n)-[*]->(m)) RETURN m", new InputPosition( 41, 1, 42 ), UNBOUNDED_SHORTEST_PATH );
    }

    @Test
    void shouldNotNotifyOnDynamicPropertyLookupWithNoLabels()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        shouldNotNotifyInStream( "EXPLAIN MATCH (n) WHERE n['key-' + n.name] = 'value' RETURN n" );
    }

    @Test
    void shouldNotNotifyOnDynamicPropertyWhenIndexIsUsedForVariableAnyway()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        shouldNotNotifyInStream( "EXPLAIN MATCH (n:Person) WHERE n.name = 'Tobias' AND n['key-' + n.name] = 'value' RETURN n" );
    }

    @Test
    void shouldNotNotifyOnDynamicPropertyLookupWithLabelHavingNoIndex()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode().addLabel( label( "Foo" ) );
            tx.commit();
        }
        shouldNotNotifyInStream( "EXPLAIN MATCH (n:Foo) WHERE n['key-' + n.name] = 'value' RETURN n" );
    }

    @Test
    void shouldNotifyOnDynamicPropertyLookupWithPredicateHavingNoIndex()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (n:Person) WHERE n.foo = 'Tobias' AND n['key-' + n.name] = 'value' RETURN n",
                containsItem( dynamicPropertyWarning ) );
    }

    @Test
    void shouldWarnOnUnfulfillableIndexSeekUsingDynamicProperty()
    {
        List<String> queries = new ArrayList<>();

        // dynamic property lookup with single label
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] = 'value' RETURN n" );

        // dynamic property lookup with explicit label check
        queries.add( "EXPLAIN MATCH (n) WHERE n['key-' + n.name] = 'value' AND (n:Person) RETURN n" );

        // dynamic property lookup with range seek
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] > 10 RETURN n" );

        // dynamic property lookup with range seek (reverse)
        queries.add( "EXPLAIN MATCH (n:Person) WHERE 10 > n['key-' + n.name] RETURN n" );

        // dynamic property lookup with a single label and property existence check with IS NOT NULL
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['na' + 'me'] IS NOT NULL RETURN n" );

        // dynamic property lookup with a single label and starts with
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] STARTS WITH 'Foo' RETURN n" );

        // dynamic property lookup with a single label and regex
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] =~ 'Foo*' RETURN n" );

        // dynamic property lookup with a single label and IN
        queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] IN ['Foo', 'Bar'] RETURN n" );

        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        for ( String query : queries )
        {
            assertNotificationsInSupportedVersions( query, containsItem( dynamicPropertyWarning ) );
        }
    }

    @Test
    void shouldNotNotifyOnDynamicPropertyLookupWithSingleLabelAndNegativePredicate()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        shouldNotNotifyInStream( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] <> 'value' RETURN n" );
    }

    @Test
    void shouldWarnOnUnfulfillableIndexSeekUsingDynamicPropertyAndMultipleLabels()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (n:Person:Foo) WHERE n['key-' + n.name] = 'value' RETURN n",
                containsItem( dynamicPropertyWarning ) );
    }

    @Test
    void shouldWarnOnUnfulfillableIndexSeekUsingDynamicPropertyAndMultipleIndexedLabels()
    {
        db.executeTransactionally( "CREATE INDEX FOR (n:Person) ON (n.name)" );
        db.executeTransactionally( "CREATE INDEX FOR (n:Jedi) ON (n.weapon)" );
        db.executeTransactionally( "Call db.awaitIndexes()" );
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (n:Person:Jedi) WHERE n['key-' + n.name] = 'value' RETURN n",
                containsItem( dynamicPropertyWarning ) );
    }

    @Test
    void shouldWarnOnCartesianProduct()
    {

        assertNotificationsInSupportedVersions( "explain match (a)-->(b), (c)-->(d) return *", containsItem( cartesianProductWarning ) );

        assertNotificationsInSupportedVersions( "explain cypher runtime=interpreted match (a)-->(b), (c)-->(d) return *",
                containsItem( cartesianProductWarning ) );
    }

    @Test
    void shouldNotNotifyOnCartesianProductWithoutExplain()
    {
        shouldNotNotifyInStream( " match (a)-->(b), (c)-->(d) return *" );
    }

    @Test
    void shouldWarnOnMissingLabel()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (a:NO_SUCH_THING) RETURN a", containsItem( unknownLabelWarning ) );
    }

    @Test
    void shouldWarnOnMisspelledLabel()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode().addLabel( label( "Person" ) );
            tx.commit();
        }

        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (n:Preson) RETURN *", containsItem( unknownLabelWarning ) );
        shouldNotNotifyInStream( "EXPLAIN MATCH (n:Person) RETURN *" );
    }

    @Test
    void shouldWarnOnMissingLabelWithCommentInBeginning()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN//TESTING \nMATCH (n:X) return n Limit 1", containsItem( unknownLabelWarning ) );
    }

    @Test
    void shouldWarnOnMissingLabelWithCommentInBeginningTwoLines()
    {
        assertNotificationsInSupportedVersions( "//TESTING \n //TESTING \n EXPLAIN MATCH (n)\n MATCH (b:X) return n,b Limit 1",
                containsItem( unknownLabelWarning ) );
    }

    @Test
    void shouldWarnOnMissingLabelWithCommentInBeginningOnOneLine()
    {
        assertNotificationsInSupportedVersions( "explain /* Testing */ MATCH (n:X) RETURN n", containsItem( unknownLabelWarning ) );
    }

    @Test
    void shouldWarnOnMissingLabelWithCommentInMiddle()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN\nMATCH (n)\n//TESTING \nMATCH (n:X)\nreturn n Limit 1", containsItem( unknownLabelWarning ) );
    }

    @Test
    void shouldNotNotifyForMissingLabelOnUpdate()
    {
        shouldNotNotifyInStream( "EXPLAIN CREATE (n:Person)" );
    }

    @Test
    void shouldWarnOnMissingRelationshipType()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH ()-[a:NO_SUCH_THING]->() RETURN a", containsItem( unknownRelationshipWarning ) );
    }

    @Test
    void shouldWarnOnMisspelledRelationship()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode().addLabel( label( "Person" ) );
            tx.commit();
        }

        db.executeTransactionally( "CREATE (n)-[r:R]->(m)" );
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH ()-[r:r]->() RETURN *", containsItem( unknownRelationshipWarning ) );
        shouldNotNotifyInStream( "EXPLAIN MATCH ()-[r:R]->() RETURN *" );
    }

    @Test
    void shouldWarnOnMissingRelationshipTypeWithComment()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN /*Comment*/ MATCH ()-[a:NO_SUCH_THING]->() RETURN a", containsItem( unknownRelationshipWarning ) );
    }

    @Test
    void shouldWarnOnMissingProperty()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (a {NO_SUCH_THING: 1337}) RETURN a", containsItem( unknownPropertyKeyWarning ) );
    }

    @Test
    void shouldWarnOnMisspelledProperty()
    {
        db.executeTransactionally( "CREATE (n {prop : 42})" );
        db.executeTransactionally( "CREATE (n)-[r:R]->(m)" );
        assertNotificationsInSupportedVersions( "EXPLAIN MATCH (n) WHERE n.propp = 43 RETURN n", containsItem( unknownPropertyKeyWarning ) );
        shouldNotNotifyInStream( "EXPLAIN MATCH (n) WHERE n.prop = 43 RETURN n" );
    }

    @Test
    void shouldWarnOnMissingPropertyWithComment()
    {
        assertNotificationsInSupportedVersions( "EXPLAIN /*Comment*/ MATCH (a {NO_SUCH_THING: 1337}) RETURN a", containsItem( unknownPropertyKeyWarning ) );
    }

    @Test
    void shouldNotNotifyForMissingPropertiesOnUpdate()
    {
        shouldNotNotifyInStream( "EXPLAIN CREATE (n {prop: 42})" );
    }

    @Test
    void shouldGiveCorrectPositionWhetherFromCacheOrNot()
    {
        // Given
        String cachedQuery = "MATCH (a:L1) RETURN a";
        String nonCachedQuery = "MATCH (a:L2) RETURN a";
        //make sure we cache the query
        int limit = db.getDependencyResolver().resolveDependency( Config.class )
                .get( GraphDatabaseInternalSettings.cypher_expression_recompilation_limit );
        try ( Transaction transaction = db.beginTx() )
        {
            for ( int i = 0; i < limit + 1; i++ )
            {
                transaction.execute( cachedQuery ).resultAsString();
            }
            transaction.commit();
        }

        // When
        try ( Transaction transaction = db.beginTx() )
        {
            Notification cachedNotification = Iterables.asList( transaction.execute( "EXPLAIN " + cachedQuery ).getNotifications() ).get( 0 );
            Notification nonCachedNotication = Iterables.asList( transaction.execute( "EXPLAIN " + nonCachedQuery ).getNotifications() ).get( 0 );

            // Then
            assertThat( cachedNotification.getPosition(), equalTo( new InputPosition( 17, 1, 18 ) ) );
            assertThat( nonCachedNotication.getPosition(), equalTo( new InputPosition( 17, 1, 18 ) ) );
        }
    }
}
