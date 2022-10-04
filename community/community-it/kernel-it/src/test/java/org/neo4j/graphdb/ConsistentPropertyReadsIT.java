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
package org.neo4j.graphdb;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.internal.helpers.ArrayUtil;
import org.neo4j.test.Race;
import org.neo4j.test.extension.ImpermanentDbmsExtension;
import org.neo4j.test.extension.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for how properties are read and that they should be read consistently, i.e. adhere to ongdb's
 * interpretation of the ACID guarantees.
 */
@ImpermanentDbmsExtension
class ConsistentPropertyReadsIT
{
    @Inject
    private GraphDatabaseService db;

    @Test
    void shouldReadConsistentPropertyValues() throws Throwable
    {
        // GIVEN
        final Node[] nodes = new Node[10];
        final String[] keys = new String[] {"1", "2", "3"};
        final String[] values = new String[] {
                longString( 'a' ),
                longString( 'b' ),
                longString( 'c' ),
        };
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < nodes.length; i++ )
            {
                nodes[i] = tx.createNode();
                for ( String key : keys )
                {
                    nodes[i].setProperty( key, values[0] );
                }
            }
            tx.commit();
        }

        int updaters = 10;
        final AtomicLong updatersDone = new AtomicLong( updaters );
        Race race = new Race();
        for ( int i = 0; i < updaters; i++ )
        {
            // Changers
            race.addContestant( () ->
            {
                try
                {
                    ThreadLocalRandom random = ThreadLocalRandom.current();
                    for ( int j = 0; j < 100; j++ )
                    {
                        Node node = nodes[random.nextInt( nodes.length )];
                        String key = keys[random.nextInt( keys.length )];
                        try ( Transaction tx = db.beginTx() )
                        {
                            tx.getNodeById( node.getId() ).removeProperty( key );
                            tx.commit();
                        }
                        try ( Transaction tx = db.beginTx() )
                        {
                            tx.getNodeById( node.getId() ).setProperty( key, values[random.nextInt( values.length )] );
                            tx.commit();
                        }
                    }
                }
                finally
                {
                    updatersDone.decrementAndGet();
                }
            } );
        }
        for ( int i = 0; i < 100; i++ )
        {
            // Readers
            race.addContestant( () ->
            {
                ThreadLocalRandom random = ThreadLocalRandom.current();
                while ( updatersDone.get() > 0 )
                {
                    try ( Transaction tx = db.beginTx() )
                    {
                        String value = (String) tx.getNodeById( nodes[random.nextInt( nodes.length )].getId() )
                                .getProperty( keys[random.nextInt( keys.length )], null );
                        assertTrue( value == null || ArrayUtil.contains( values, value ), value );
                        tx.commit();
                    }
                }
            } );
        }

        // WHEN
        race.go();
    }

    private static String longString( char c )
    {
        char[] chars = new char[ThreadLocalRandom.current().nextInt( 800, 1000 )];
        Arrays.fill( chars, c );
        return new String( chars );
    }
}
