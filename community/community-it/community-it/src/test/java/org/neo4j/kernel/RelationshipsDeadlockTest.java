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
package org.neo4j.kernel;

import org.eclipse.collections.api.tuple.primitive.IntIntPair;
import org.eclipse.collections.impl.factory.Maps;
import org.eclipse.collections.impl.tuple.primitive.PrimitiveTuples;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.util.concurrent.Futures;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

@Disabled( "This test demonstrates a deadlock during concurrent relationship creation." )
@EphemeralTestDirectoryExtension
class RelationshipsDeadlockTest
{
    private static final String STMT_BA = " WITH $personA as personA, $personB as personB  " +
            "    MATCH (target:Person { `name` : personB })   " +
            "    MATCH (source:Person { `name` : personA })  " +
            "    SET target._lock=true" +
            "    SET source._lock=true" +
            " WITH source, target " +
            "    CREATE (source)-[rel:KNOWS]->(target)";
    private static final String STMT_AB = " WITH $personA as personA, $personB as personB  " +
            "    MATCH (source:Person { `name` : personA })  " +
            "    MATCH (target:Person { `name` : personB })   " +
            "    SET source._lock=true" +
            "    SET target._lock=true" +
            " WITH source, target " +
            "    CREATE (source)-[rel:KNOWS]->(target)";

    private static final int NODES = 5;
    private static final int THREADS = 8;

    @Inject
    private TestDirectory testDirectory;
    private GraphDatabaseService db;
    private DatabaseManagementService managementService;

    @BeforeEach
    void setUp()
    {
        managementService = new TestDatabaseManagementServiceBuilder( testDirectory.homePath() ).setFileSystem( testDirectory.getFileSystem() ).build();
        db = managementService.database( DEFAULT_DATABASE_NAME );
    }

    @AfterEach
    void tearDown()
    {
        managementService.shutdown();
    }

    @Test
    void createRelationshipsConcurrently() throws InterruptedException
    {

        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < NODES; i++ )
            {
                tx.execute( "MERGE (p:Person {name: " + i + "})" );
            }
            tx.commit();
        }

        final ExecutorService executorService = Executors.newFixedThreadPool( THREADS );
        var futures = new ArrayList<Future<?>>();
        final AtomicReference<Exception> error = new AtomicReference<>();
        try
        {
            final List<Map<String,Object>> rels = generateRelationshipData();
            final AtomicBoolean stop = new AtomicBoolean();
            final Runnable workload = () ->
            {
                for ( final Map<String,Object> rel : rels )
                {
                    if ( stop.get() )
                    {
                        break;
                    }
                    try ( Transaction tx = db.beginTx() )
                    {
                        final int a = (Integer) rel.get( "personA" );
                        final int b = (Integer) rel.get( "personB" );
                        tx.execute( a > b ? STMT_AB : STMT_BA, rel );
                        tx.commit();
                    }
                    catch ( Exception e )
                    {
                        if ( stop.compareAndSet( false, true ) )
                        {
                            error.set( e );
                        }
                        stop.set( true );
                        throw new RuntimeException( e );
                    }
                }
            };

            for ( int i = 0; i < THREADS; i++ )
            {
                futures.add( executorService.submit( workload ) );
            }
        }
        finally
        {
            executorService.shutdown();
        }

        assertTrue( executorService.awaitTermination( 10, TimeUnit.MINUTES ) );
        assertDoesNotThrow( () -> Futures.getAll( futures ) );
        if ( error.get() != null )
        {
            fail( error.get() );
        }
    }

    private static List<Map<String, Object>> generateRelationshipData()
    {
        final Random rnd = new Random();
        final List<Map<String, Object>> rels = new ArrayList<>();
        for ( int i = 0; i < 10_000; i++ )
        {
            IntIntPair pair;
            do
            {
                pair = PrimitiveTuples.pair( rnd.nextInt( NODES ), rnd.nextInt( NODES ) );
            }
            while ( pair.getOne() == pair.getTwo() );
            rels.add( Maps.fixedSize.of( "personA", pair.getOne(), "personB", pair.getTwo() ) );
        }
        return rels;
    }
}
