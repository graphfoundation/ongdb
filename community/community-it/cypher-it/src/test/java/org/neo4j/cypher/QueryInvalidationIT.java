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
package org.neo4j.cypher;

import org.junit.jupiter.api.Test;
import scala.Option;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.QueryCache.CacheKey;
import org.neo4j.cypher.internal.planning.CypherCacheHitMonitor;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.ExtensionCallback;
import org.neo4j.test.extension.ImpermanentDbmsExtension;
import org.neo4j.test.extension.Inject;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.cypher_min_replan_interval;
import static org.neo4j.configuration.GraphDatabaseSettings.query_statistics_divergence_threshold;

@ImpermanentDbmsExtension( configurationCallback = "configure" )
public class QueryInvalidationIT
{
    private static final int USERS = 100;
    private static final int CONNECTIONS = 100;

    @Inject
    private GraphDatabaseAPI db;
    @Inject
    private Monitors monitors;

    @ExtensionCallback
    void configure( TestDatabaseManagementServiceBuilder builder )
    {
        builder.setConfig( query_statistics_divergence_threshold, 0.1 )
               .setConfig( cypher_min_replan_interval, Duration.ofSeconds( 1 ) );
    }

    @Test
    void shouldRePlanAfterDataChangesFromAnEmptyDatabase() throws Exception
    {
        // GIVEN
        TestMonitor monitor = new TestMonitor();
        monitors.addMonitorListener( monitor );
        // - setup schema -
        createIndex();
        // - execute the query without the existence data -
        executeDistantFriendsCountQuery( USERS, "default" );

        long replanTime = System.currentTimeMillis() + 1_800;

        // - create data -
        createData( 0, USERS, CONNECTIONS );

        // - after the query TTL has expired -
        while ( System.currentTimeMillis() < replanTime )
        {
            Thread.sleep( 100 );
        }

        // WHEN
        monitor.reset();
        // - execute the query again -
        executeDistantFriendsCountQuery( USERS, "default" );

        // THEN
        assertEquals( 1, monitor.discards.get(), "Query should have been replanned." );
        assertThat( "Replan should have occurred after TTL", monitor.waitTime.get(), greaterThanOrEqualTo( 1L ) );
    }

    @Test
    void shouldScheduleRePlansWithForceAndSkip() throws Exception
    {
        // GIVEN
        TestMonitor monitor = new TestMonitor();
        monitors.addMonitorListener( monitor );
        // - setup schema -
        createIndex();
        // - execute the query without the existence data -
        executeDistantFriendsCountQuery( USERS, "force" );

        long replanTime = System.currentTimeMillis() + 1_800;

        // - create data -
        createData( 0, USERS, CONNECTIONS );

        // - after the query TTL has expired -
        while ( System.currentTimeMillis() < replanTime )
        {
            Thread.sleep( 100 );
        }

        // WHEN
        monitor.reset();
        // - execute the query again, with replan=skip -
        executeDistantFriendsCountQuery( USERS, "skip" );

        // THEN
        assertEquals( 0, monitor.compilations.get(), "Query should not have been compiled." );
        assertEquals( 0, monitor.discards.get(), "Query should not have been discarded." );

        // AND WHEN
        monitor.reset();
        // - execute the query again, with replan=force -
        executeDistantFriendsCountQuery( USERS, "force" );

        // THEN
        assertEquals( 1, monitor.compilations.get(), "Query should have been replanned." );

        // WHEN
        monitor.reset();
        // - execute the query again, with replan=default -
        executeDistantFriendsCountQuery( USERS, "default" );

        // THEN should use the entry cached with "replan=force" instead of replanning again
        assertEquals( 0, monitor.compilations.get(), "Query should not have been compiled." );
        assertEquals( 0, monitor.discards.get(), "Query should not have been discarded." );
    }

    @Test
    void shouldRePlanAfterDataChangesFromAPopulatedDatabase() throws Exception
    {
        // GIVEN
        Config config = db.getDependencyResolver().resolveDependency( Config.class );
        double divergenceThreshold = config.get( query_statistics_divergence_threshold );
        long replanInterval = config.get( cypher_min_replan_interval ).toMillis();

        TestMonitor monitor = new TestMonitor();
        monitors.addMonitorListener( monitor );
        // - setup schema -
        createIndex();
        //create some data
        createData( 0, USERS, CONNECTIONS );
        executeDistantFriendsCountQuery( USERS, "default" );

        long replanTime = System.currentTimeMillis() + replanInterval;

        assertTrue( divergenceThreshold > 0.0 && divergenceThreshold < 1.0,
                "Test does not work with edge setting for query_statistics_divergence_threshold: " + divergenceThreshold );

        int usersToCreate = ((int) (Math.ceil( ((double) USERS) / (1.0 - divergenceThreshold) ))) - USERS + 1;

        //create more data
        createData( USERS, usersToCreate, CONNECTIONS );

        // - after the query TTL has expired -
        while ( System.currentTimeMillis() <= replanTime )
        {
            Thread.sleep( 100 );
        }

        // WHEN
        monitor.reset();
        // - execute the query again -
        executeDistantFriendsCountQuery( USERS, "default" );

        // THEN
        assertEquals( 1, monitor.discards.get(), "Query should have been replanned." );
        assertThat( "Replan should have occurred after TTL", monitor.waitTime.get(), greaterThanOrEqualTo( replanInterval / 1000 ) );
    }

    private void createIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( Label.label( "User" ) ).on( "userId" ).create();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, MINUTES );
            tx.commit();
        }
    }

    private void createData( long startingUserId, int numUsers, int numConnections )
    {
        try ( Transaction transaction = db.beginTx() )
        {
            for ( long userId = startingUserId; userId < numUsers + startingUserId; userId++ )
            {
                transaction.execute( "CREATE (newUser:User {userId: $userId})", Map.of( "userId", userId ) );
            }
            Map<String,Object> params = new HashMap<>();
            for ( int i = 0; i < numConnections; i++ )
            {
                long user1 = startingUserId + randomInt( numUsers );
                long user2;
                do
                {
                    user2 = startingUserId + randomInt( numUsers );
                }
                while ( user1 == user2 );
                params.put( "user1", user1 );
                params.put( "user2", user2 );
                transaction.execute( "MATCH (user1:User { userId: $user1 }), (user2:User { userId: $user2 }) " + "MERGE (user1) -[:FRIEND]- (user2)", params );
            }
            transaction.commit();
        }
    }

    private void executeDistantFriendsCountQuery( int userId, String replanStrategy )
    {
        try ( Transaction transaction = db.beginTx() )
        {
            Map<String,Object> params = Map.of( "userId", (long) randomInt( userId ) );

            try ( Result result = transaction.execute(
                    String.format(
                            "CYPHER replan=%s MATCH (user:User { userId: $userId } ) -[:FRIEND]- () -[:FRIEND]- (distantFriend) " +
                            "RETURN COUNT(distinct distantFriend)",
                            replanStrategy
                    ), params ) )
            {
                while ( result.hasNext() )
                {
                    result.next();
                }
            }
            transaction.commit();
        }
    }

    private static int randomInt( int max )
    {
        return ThreadLocalRandom.current().nextInt( max );
    }

    private static class TestMonitor implements CypherCacheHitMonitor<CacheKey<String>>
    {
        private final AtomicInteger hits = new AtomicInteger();
        private final AtomicInteger misses = new AtomicInteger();
        private final AtomicInteger discards = new AtomicInteger();
        private final AtomicInteger compilations = new AtomicInteger();
        private final AtomicLong waitTime = new AtomicLong();

        @Override
        public void cacheHit( CacheKey<String> key )
        {
            hits.incrementAndGet();
        }

        @Override
        public void cacheMiss( CacheKey<String> key )
        {
            misses.incrementAndGet();
        }

        @Override
        public void cacheDiscard( CacheKey<String> key, String ignored, int secondsSinceReplan,
                                  Option<String> maybeReason )
        {
            discards.incrementAndGet();
            waitTime.addAndGet( secondsSinceReplan );
        }

        @Override
        public void cacheCompile( CacheKey<String> key )
        {
            compilations.incrementAndGet();
        }

        @Override
        public void cacheCompileWithExpressionCodeGen( CacheKey<String> key )
        {
            compilations.incrementAndGet();
        }

        @Override
        public String toString()
        {
            return String.format( "TestMonitor{hits=%s, misses=%s, discards=%s, compilations=%s, waitTime=%s}",
                                  hits, misses, discards, compilations, waitTime );
        }

        public void reset()
        {
            hits.set( 0 );
            misses.set( 0 );
            discards.set( 0 );
            compilations.set( 0 );
            waitTime.set( 0 );
        }
    }
}
