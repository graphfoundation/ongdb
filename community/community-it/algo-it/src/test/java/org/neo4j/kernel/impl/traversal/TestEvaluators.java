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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.traversal.Evaluators;

import static org.neo4j.graphdb.traversal.Evaluation.EXCLUDE_AND_CONTINUE;
import static org.neo4j.graphdb.traversal.Evaluation.INCLUDE_AND_CONTINUE;
import static org.neo4j.graphdb.traversal.Evaluation.INCLUDE_AND_PRUNE;
import static org.neo4j.graphdb.traversal.Evaluators.includeWhereEndNodeIs;
import static org.neo4j.graphdb.traversal.Evaluators.lastRelationshipTypeIs;

class TestEvaluators extends TraversalTestBase
{
    private enum Types implements RelationshipType
    {
        A,B,C
    }

    private Transaction tx;

    @BeforeEach
    void createGraph()
    {
        /*
         * (a)--[A]->(b)--[B]-->(c)--[B]-->(d)--[C]-->(e)--[A]-->(j)
         *   \        |
         *   [B]     [C]-->(h)--[B]-->(i)--[C]-->(k)
         *     \
         *      v
         *      (f)--[C]-->(g)
         */

        createGraph( "a A b", "b B c", "c B d", "d C e", "e A j", "b C h", "h B i", "i C k",
                "a B f", "f C g" );

        tx = beginTx();
    }

    @AfterEach
    void tearDown()
    {
        tx.close();
    }

    @Test
    void lastRelationshipTypeEvaluator()
    {
        Node a = getNodeWithName( tx, "a" );
        expectPaths( tx.traversalDescription().evaluator( lastRelationshipTypeIs(
                INCLUDE_AND_PRUNE, EXCLUDE_AND_CONTINUE, Types.C ) ).traverse( a ),
                "a,b,c,d,e", "a,f,g", "a,b,h" );

        expectPaths( tx.traversalDescription().evaluator( lastRelationshipTypeIs(
                INCLUDE_AND_CONTINUE, EXCLUDE_AND_CONTINUE, Types.C ) ).traverse( a ),
                "a,b,c,d,e", "a,f,g", "a,b,h", "a,b,h,i,k" );
    }

    @Test
    void endNodeIs()
    {
        Node a = getNodeWithName( tx, "a" );
        Node c = getNodeWithName( tx, "c" );
        Node h = getNodeWithName( tx, "h" );
        Node g = getNodeWithName( tx, "g" );

        expectPaths( tx.traversalDescription().evaluator( includeWhereEndNodeIs( c, h, g ) ).traverse( a ),
                "a,b,c", "a,b,h", "a,f,g" );
        expectPaths( tx.traversalDescription().evaluator( includeWhereEndNodeIs( g ) ).traverse( a ), "a,f,g" );
    }

    @Test
    void depths()
    {
        Node a = getNodeWithName( tx, "a" );
        expectPaths( tx.traversalDescription().evaluator( Evaluators.atDepth( 1 ) ).traverse( a ), "a,b", "a,f" );
        expectPaths( tx.traversalDescription().evaluator( Evaluators.fromDepth( 2 ) ).traverse( a ), "a,f,g",
                "a,b,h", "a,b,h,i", "a,b,h,i,k", "a,b,c", "a,b,c,d", "a,b,c,d,e", "a,b,c,d,e,j" );
        expectPaths( tx.traversalDescription().evaluator( Evaluators.toDepth( 2 ) ).traverse( a ), "a", "a,b", "a,b,c",
                "a,b,h", "a,f", "a,f,g" );
    }
}
