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
package org.neo4j.kernel.ha;

import org.junit.Before;
import org.junit.Test;

import org.neo4j.logging.NullLogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.OnDemandJobScheduler;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class UpdatePullerSchedulerTest
{
    private UpdatePuller updatePuller;

    @Before
    public void setUp()
    {
        updatePuller = mock( UpdatePuller.class );
    }

    @Test
    public void skipUpdatePullingSchedulingWithZeroInterval()
    {
        JobScheduler jobScheduler = mock( JobScheduler.class );
        UpdatePullerScheduler pullerScheduler =
                new UpdatePullerScheduler( jobScheduler, NullLogProvider.getInstance(), updatePuller, 0 );

        // when start puller scheduler - nothing should be scheduled
        pullerScheduler.init();

        verifyZeroInteractions( jobScheduler, updatePuller );

        // should be able shutdown scheduler
        pullerScheduler.shutdown();
    }

    @Test
    public void scheduleUpdatePulling() throws Throwable
    {
        OnDemandJobScheduler jobScheduler = new OnDemandJobScheduler( false );
        UpdatePullerScheduler pullerScheduler =
                new UpdatePullerScheduler( jobScheduler, NullLogProvider.getInstance(), updatePuller, 10 );

        // schedule update pulling and run it
        pullerScheduler.init();
        jobScheduler.runJob();

        verify( updatePuller ).pullUpdates();
        assertNotNull( "Job should be scheduled", jobScheduler.getJob() );

        // stop scheduler - job should be canceled
        pullerScheduler.shutdown();

        assertNull( "Job should be canceled", jobScheduler.getJob() );
    }

}
