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
package org.neo4j.graphalgo.impl.path;

import org.neo4j.graphalgo.EvaluationContext;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.PathExpander;
import org.neo4j.graphdb.traversal.TraversalDescription;
import org.neo4j.graphdb.traversal.Traverser;
import org.neo4j.graphdb.traversal.Uniqueness;

import static org.neo4j.graphdb.traversal.Evaluators.toDepth;

public class AllPaths extends TraversalPathFinder
{
    private final PathExpander expander;
    private final EvaluationContext context;
    private final int maxDepth;

    public AllPaths( EvaluationContext context, int maxDepth, PathExpander expander )
    {
        this.context = context;
        this.maxDepth = maxDepth;
        this.expander = expander;
    }

    protected Uniqueness uniqueness()
    {
        return Uniqueness.RELATIONSHIP_PATH;
    }

    @Override
    protected Traverser instantiateTraverser( Node start, Node end )
    {
        // Bidirectional traversal
        var transaction = context.transaction();
        TraversalDescription base = transaction.traversalDescription().depthFirst().uniqueness( uniqueness() );
        return transaction.bidirectionalTraversalDescription()
                .startSide( base.expand( expander ).evaluator( toDepth( maxDepth / 2 ) ) )
                .endSide( base.expand( expander.reverse() ).evaluator( toDepth( maxDepth - maxDepth / 2 ) ) )
                .traverse( start, end );
    }
}
