/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.core.consensus.log;

import java.io.IOException;

import org.neo4j.causalclustering.core.consensus.log.monitoring.RaftLogAppendIndexMonitor;
import org.neo4j.kernel.monitoring.Monitors;

public class MonitoredRaftLog extends DelegatingRaftLog
{
    private final RaftLogAppendIndexMonitor appendIndexMonitor;

    public MonitoredRaftLog( RaftLog delegate, Monitors monitors )
    {
        super( delegate );
        this.appendIndexMonitor = monitors.newMonitor( RaftLogAppendIndexMonitor.class, getClass().getName() );
    }

    @Override
    public long append( RaftLogEntry... entries ) throws IOException
    {
        long appendIndex = super.append( entries );
        appendIndexMonitor.appendIndex( appendIndex );
        return appendIndex;
    }

    @Override
    public void truncate( long fromIndex ) throws IOException
    {
        super.truncate( fromIndex );
        appendIndexMonitor.appendIndex( super.appendIndex() );
    }
}
