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
package org.neo4j.causalclustering.core.state;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.causalclustering.core.replication.DistributedOperation;
import org.neo4j.function.ThrowingBiConsumer;

class CommandBatcher
{
    private List<DistributedOperation> batch;
    private int maxBatchSize;
    private final ThrowingBiConsumer<Long,List<DistributedOperation>,Exception> applier;
    private long lastIndex;

    CommandBatcher( int maxBatchSize, ThrowingBiConsumer<Long,List<DistributedOperation>,Exception> applier )
    {
        this.batch = new ArrayList<>( maxBatchSize );
        this.maxBatchSize = maxBatchSize;
        this.applier = applier;
    }

    void add( long index, DistributedOperation operation ) throws Exception
    {
        assert batch.size() <= 0 || index == (lastIndex + 1);

        batch.add( operation );
        lastIndex = index;

        if ( batch.size() == maxBatchSize )
        {
            flush();
        }
    }

    void flush() throws Exception
    {
        applier.accept( lastIndex, batch );
        batch.clear();
    }
}
