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
package org.neo4j.causalclustering.core.consensus.log.inmemory;

import java.io.File;

import org.neo4j.causalclustering.core.consensus.log.ConcurrentStressIT;
import org.neo4j.causalclustering.core.consensus.log.InMemoryRaftLog;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.lifecycle.Lifecycle;

public class InMemoryConcurrentStressIT extends ConcurrentStressIT<InMemoryConcurrentStressIT.LifecycledInMemoryRaftLog>
{
    @Override
    public LifecycledInMemoryRaftLog createRaftLog( FileSystemAbstraction fsa, File dir )
    {
        return new LifecycledInMemoryRaftLog();
    }

    public static class LifecycledInMemoryRaftLog extends InMemoryRaftLog implements Lifecycle
    {

        @Override
        public void init()
        {

        }

        @Override
        public void start()
        {

        }

        @Override
        public void stop()
        {

        }

        @Override
        public void shutdown()
        {

        }
    }
}
