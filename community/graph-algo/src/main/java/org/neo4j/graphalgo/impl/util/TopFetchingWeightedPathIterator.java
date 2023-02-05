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
package org.neo4j.graphalgo.impl.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.neo4j.graphalgo.CostEvaluator;
import org.neo4j.graphalgo.WeightedPath;
import org.neo4j.graphdb.Path;
import org.neo4j.internal.helpers.MathUtil;
import org.neo4j.internal.helpers.collection.PrefetchingIterator;

public class TopFetchingWeightedPathIterator extends PrefetchingIterator<WeightedPath>
{
    private final Iterator<Path> paths;
    private List<WeightedPath> shortestPaths;
    private Iterator<WeightedPath> shortestIterator;
    private final CostEvaluator<Double> costEvaluator;
    private double foundWeight;
    private final double epsilon;

    public TopFetchingWeightedPathIterator( Iterator<Path> paths, CostEvaluator<Double> costEvaluator, double epsilon )
    {
        this.paths = paths;
        this.costEvaluator = costEvaluator;
        this.epsilon = epsilon;
        this.foundWeight = Double.MAX_VALUE;
    }

    @Override
    protected WeightedPath fetchNextOrNull()
    {
        if ( shortestIterator == null )
        {
            shortestPaths = new ArrayList<>();

            while ( paths.hasNext() )
            {
                WeightedPath path = new WeightedPathImpl( costEvaluator, paths.next() );

                if ( MathUtil.compare( path.weight(), foundWeight, epsilon ) < 0 )
                {
                    foundWeight = path.weight();
                    shortestPaths.clear();
                }
                if ( MathUtil.compare( path.weight(), foundWeight, epsilon ) <= 0 )
                {
                    shortestPaths.add( path );
                }
            }
            shortestIterator = shortestPaths.iterator();
        }

        return shortestIterator.hasNext() ? shortestIterator.next() : null;
    }
}
