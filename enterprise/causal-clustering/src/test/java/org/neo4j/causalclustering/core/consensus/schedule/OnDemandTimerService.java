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

import java.util.Collection;

import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.OnDemandJobScheduler;
import org.neo4j.time.FakeClock;

public class OnDemandTimerService extends TimerService
{
    private final FakeClock clock;
    private OnDemandJobScheduler onDemandJobScheduler;

    public OnDemandTimerService( FakeClock clock )
    {
        super( new OnDemandJobScheduler(), NullLogProvider.getInstance() );
        this.clock = clock;
        onDemandJobScheduler = (OnDemandJobScheduler) scheduler;
    }

    @Override
    public void invoke( TimerName name )
    {
        Collection<Timer> timers = getTimers( name );

        for ( Timer timer : timers )
        {
            Delay delay = timer.delay();
            clock.forward( delay.amount(), delay.unit() );
        }

        for ( Timer timer : timers )
        {
            timer.invoke();
        }

        onDemandJobScheduler.runJob();
    }
}
