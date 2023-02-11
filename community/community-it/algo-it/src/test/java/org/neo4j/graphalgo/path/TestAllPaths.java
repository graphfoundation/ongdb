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
package org.neo4j.graphalgo.path;

import org.junit.jupiter.api.Test;

import org.neo4j.graphalgo.BasicEvaluationContext;
import org.neo4j.graphalgo.EvaluationContext;
import org.neo4j.graphalgo.Neo4jAlgoTestCase;
import org.neo4j.graphalgo.PathFinder;
import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.PathExpanders;
import org.neo4j.graphdb.Transaction;

import static org.neo4j.graphalgo.GraphAlgoFactory.allPaths;

class TestAllPaths extends Neo4jAlgoTestCase
{
    @Test
    void testCircularGraph()
    {
        /* Layout
         *
         * (a)---(b)===(c)---(e)
         *         \   /
         *          (d)
         */
        try ( Transaction transaction = graphDb.beginTx() )
        {
            graph.makeEdge( transaction, "a", "b" );
            graph.makeEdge( transaction, "b", "c" );
            graph.makeEdge( transaction, "b", "c" );
            graph.makeEdge( transaction, "b", "d" );
            graph.makeEdge( transaction, "c", "d" );
            graph.makeEdge( transaction, "c", "e" );
            var context = new BasicEvaluationContext( transaction, graphDb );

            PathFinder<Path> finder = instantiatePathFinder( context, 10 );
            Iterable<Path> paths = finder.findAllPaths( graph.getNode( transaction, "a" ), graph.getNode( transaction, "e" ) );
            assertPaths( paths, "a,b,c,e", "a,b,c,e", "a,b,d,c,e", "a,b,c,d,b,c,e", "a,b,c,d,b,c,e", "a,b,c,b,d,c,e", "a,b,c,b,d,c,e", "a,b,d,c,b,c,e",
                    "a,b,d,c,b,c,e" );
            transaction.commit();
        }
    }

    @Test
    void testTripleRelationshipGraph()
    {
        /* Layout
         *          ___
         * (a)---(b)===(c)---(d)
         */
        try ( Transaction transaction = graphDb.beginTx() )
        {
            graph.makeEdge( transaction, "a", "b" );
            graph.makeEdge( transaction, "b", "c" );
            graph.makeEdge( transaction, "b", "c" );
            graph.makeEdge( transaction, "b", "c" );
            graph.makeEdge( transaction, "c", "d" );
            var context = new BasicEvaluationContext( transaction, graphDb );

            PathFinder<Path> finder = instantiatePathFinder( context, 10 );
            Iterable<Path> paths = finder.findAllPaths( graph.getNode( transaction, "a" ), graph.getNode( transaction, "d" ) );
            assertPaths( paths, "a,b,c,d", "a,b,c,d", "a,b,c,d", "a,b,c,b,c,d", "a,b,c,b,c,d", "a,b,c,b,c,d", "a,b,c,b,c,d", "a,b,c,b,c,d", "a,b,c,b,c,d" );
            transaction.commit();
        }
    }

    private static PathFinder<Path> instantiatePathFinder( EvaluationContext context, int maxDepth )
    {
        return allPaths( context, PathExpanders.allTypesAndDirections(), maxDepth );
    }
}
