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
package org.neo4j.causalclustering.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.causalclustering.helper.SuspendableLifecycleStateTestHelpers.LifeCycleState;
import org.neo4j.causalclustering.helper.SuspendableLifecycleStateTestHelpers.SuspendedState;
import org.neo4j.logging.NullLogProvider;

import static org.junit.Assert.assertEquals;
import static org.neo4j.causalclustering.helper.SuspendableLifecycleStateTestHelpers.setInitialState;

@RunWith( Parameterized.class )
public class SuspendableLifeCycleSuspendedStateChangeTest
{
    @Parameterized.Parameter()
    public LifeCycleState fromState;

    @Parameterized.Parameter( 1 )
    public SuspendedState fromSuspendedState;

    @Parameterized.Parameter( 2 )
    public SuspendedState toSuspendedState;

    @Parameterized.Parameter( 3 )
    public LifeCycleState shouldEndInState;
    private StateAwareSuspendableLifeCycle lifeCycle;

    @Parameterized.Parameters( name = "From {0} and {1} to {2} should end in {3}" )
    public static Iterable<Object[]> data()
    {
        List<Object[]> params = new ArrayList<>();
        for ( LifeCycleState lifeCycleState : LifeCycleState.values() )
        {
            for ( SuspendedState suspendedState : SuspendedState.values() )
            {
                for ( SuspendedState toSuspendedState : toSuspendedState() )
                {
                    params.add( new Object[]{lifeCycleState, suspendedState, toSuspendedState,
                                             expectedResult( lifeCycleState, suspendedState, toSuspendedState )} );
                }
            }
        }
        return params;
    }

    private static SuspendedState[] toSuspendedState()
    {
        return new SuspendedState[]{SuspendedState.Enabled, SuspendedState.Disabled};
    }

    private static LifeCycleState expectedResult( LifeCycleState fromState, SuspendedState fromSuspendedState, SuspendedState toSuspendedState )
    {
        if ( toSuspendedState == SuspendedState.Disabled )
        {
            return LifeCycleState.Stop;
        }
        else if ( toSuspendedState == SuspendedState.Enabled )
        {
            if ( fromSuspendedState == SuspendedState.Disabled )
            {
                if ( fromState == LifeCycleState.Init || fromState == LifeCycleState.Shutdown )
                {
                    return LifeCycleState.Stop;
                }
            }
            return fromState;
        }
        else
        {
            throw new IllegalStateException( "Should not transition to any other state got: " + toSuspendedState );
        }
    }

    @Before
    public void setUpServer() throws Throwable
    {
        lifeCycle = new StateAwareSuspendableLifeCycle( NullLogProvider.getInstance()
                                                                       .getLog( "log" ) );
        setInitialState( lifeCycle, fromState );
        fromSuspendedState.set( lifeCycle );
    }

    @Test
    public void changeSuspendedState() throws Throwable
    {
        toSuspendedState.set( lifeCycle );
        assertEquals( shouldEndInState, lifeCycle.status );
    }
}
