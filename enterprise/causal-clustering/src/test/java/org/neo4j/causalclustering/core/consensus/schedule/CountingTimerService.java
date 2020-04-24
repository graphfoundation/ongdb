/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.causalclustering.core.consensus.schedule;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;

public class CountingTimerService extends TimerService
{
    private final Map<String,Long> counts = new HashMap<>();

    public CountingTimerService( JobScheduler scheduler, LogProvider logProvider )
    {
        super( scheduler, logProvider );
    }

    @Override
    public Timer create( TimerName name, Group group, TimeoutHandler handler )
    {
        TimeoutHandler countingHandler = timer -> {
            long count = counts.getOrDefault( name.name(), 0L );
            counts.put( name.name(), count + 1 );
            handler.onTimeout( timer );
        };
        return super.create( name, group, countingHandler );
    }

    public long invocationCount( TimerName name )
    {
        return counts.getOrDefault( name.name(), 0L );
    }
}
