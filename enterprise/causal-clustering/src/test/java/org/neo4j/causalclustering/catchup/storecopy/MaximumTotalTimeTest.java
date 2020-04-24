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
package org.neo4j.causalclustering.catchup.storecopy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.concurrent.TimeUnit;

import org.neo4j.time.FakeClock;

public class MaximumTotalTimeTest
{
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldFailWhenAllowedTimeHasPassed() throws StoreCopyFailedException
    {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        FakeClock fakeClock = new FakeClock( 0, timeUnit );

        MaximumTotalTime maximumTotalTime = new MaximumTotalTime( 5, timeUnit, fakeClock );

        maximumTotalTime.assertContinue();
        fakeClock.forward( 5, timeUnit );
        maximumTotalTime.assertContinue();
        expectedException.expect( StoreCopyFailedException.class );
        fakeClock.forward( 1, timeUnit );
        maximumTotalTime.assertContinue();
    }
}
