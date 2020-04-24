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
package org.neo4j.causalclustering.core.consensus.log.cache;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.causalclustering.core.consensus.log.RaftLogEntry;

/**
 * This cache is not meant for production use, but it can be useful
 * in various investigative circumstances.
 */
public class UnboundedInFlightCache implements InFlightCache
{
    private Map<Long,RaftLogEntry> map = new HashMap<>();
    private boolean enabled;

    @Override
    public synchronized void enable()
    {
        enabled = true;
    }

    @Override
    public synchronized void put( long logIndex, RaftLogEntry entry )
    {
        if ( !enabled )
        {
            return;
        }

        map.put( logIndex, entry );
    }

    @Override
    public synchronized RaftLogEntry get( long logIndex )
    {
        if ( !enabled )
        {
            return null;
        }

        return map.get( logIndex );
    }

    @Override
    public synchronized void truncate( long fromIndex )
    {
        if ( !enabled )
        {
            return;
        }

        map.keySet().removeIf( idx -> idx >= fromIndex );
    }

    @Override
    public synchronized void prune( long upToIndex )
    {
        if ( !enabled )
        {
            return;
        }

        map.keySet().removeIf( idx -> idx <= upToIndex );
    }

    @Override
    public synchronized long totalBytes()
    {
        // not updated correctly
        return 0;
    }

    @Override
    public synchronized int elementCount()
    {
        // not updated correctly
        return 0;
    }
}
