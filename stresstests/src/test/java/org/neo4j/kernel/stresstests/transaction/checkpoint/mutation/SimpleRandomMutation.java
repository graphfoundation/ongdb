/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.kernel.stresstests.transaction.checkpoint.mutation;

import java.util.concurrent.ThreadLocalRandom;

import org.neo4j.graphdb.GraphDatabaseService;

class SimpleRandomMutation implements RandomMutation
{
    private final long nodeCount;
    private final GraphDatabaseService db;
    private final Mutation rareMutation;
    private final Mutation commonMutation;

    SimpleRandomMutation( long nodeCount, GraphDatabaseService db, Mutation rareMutation, Mutation commonMutation )
    {
        this.nodeCount = nodeCount;
        this.db = db;
        this.rareMutation = rareMutation;
        this.commonMutation = commonMutation;
    }

    private static String[] NAMES =
            {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"};

    @Override
    public void perform()
    {
        ThreadLocalRandom rng = ThreadLocalRandom.current();
        long nodeId = rng.nextLong( nodeCount );
        String value = NAMES[rng.nextInt( NAMES.length )];

        if ( rng.nextDouble() < 0.01 )
        {
            rareMutation.perform( nodeId, value );
        }
        else
        {
            commonMutation.perform( nodeId, value );
        }
    }
}
