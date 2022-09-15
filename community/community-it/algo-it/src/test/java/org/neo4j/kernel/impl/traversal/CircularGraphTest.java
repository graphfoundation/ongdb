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
package org.neo4j.kernel.impl.traversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.traversal.Evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CircularGraphTest extends TraversalTestBase
{
    @BeforeEach
    void createTheGraph()
    {
        createGraph( "1 TO 2", "2 TO 3", "3 TO 1" );
    }

    @Test
    void testCircularBug()
    {
        final long timestamp = 3;
        try ( Transaction tx = beginTx() )
        {
            getNodeWithName( tx, "2" ).setProperty( "timestamp", 1L );
            getNodeWithName( tx, "3" ).setProperty( "timestamp", 2L );
            tx.commit();
        }

        try ( Transaction tx2 = beginTx() )
        {
            final RelationshipType type = RelationshipType.withName( "TO" );
            Iterator<Node> nodes = tx2.traversalDescription()
                    .depthFirst()
                    .relationships( type, Direction.OUTGOING )
                    .evaluator( path ->
                    {
                        Relationship rel = path.lastRelationship();
                        boolean relIsOfType = rel != null && rel.isType( type );
                        boolean prune =
                                relIsOfType && (Long) path.endNode().getProperty( "timestamp" ) >= timestamp;
                        return Evaluation.of( relIsOfType, !prune );
                    } )
                    .traverse( tx2.getNodeById( node( "1" ).getId() ) )
                    .nodes().iterator();

            assertEquals( "2", nodes.next().getProperty( "name" ) );
            assertEquals( "3", nodes.next().getProperty( "name" ) );
            assertFalse( nodes.hasNext() );
        }
    }
}
