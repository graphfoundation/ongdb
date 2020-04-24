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

import org.neo4j.function.ThrowingConsumer;
import org.neo4j.kernel.lifecycle.Lifecycle;

class SuspendableLifecycleStateTestHelpers
{
    static void setInitialState( StateAwareSuspendableLifeCycle lifeCycle, LifeCycleState state ) throws Throwable
    {
        for ( LifeCycleState lifeCycleState : LifeCycleState.values() )
        {
            if ( lifeCycleState.compareTo( state ) <= 0 )
            {
                lifeCycleState.set( lifeCycle );
            }
        }
    }

    enum LifeCycleState
    {
        Init( Lifecycle::init ),
        Start( Lifecycle::start ),
        Stop( Lifecycle::stop ),
        Shutdown( Lifecycle::shutdown );

        private final ThrowingConsumer<Lifecycle,Throwable> operation;

        LifeCycleState( ThrowingConsumer<Lifecycle,Throwable> operation )
        {
            this.operation = operation;
        }

        void set( Lifecycle lifecycle ) throws Throwable
        {
            operation.accept( lifecycle );
        }
    }

    enum SuspendedState
    {
        Untouched( suspendable -> {} ),
        Enabled( Suspendable::enable ),
        Disabled( Suspendable::disable );

        private final ThrowingConsumer<Suspendable,Throwable> consumer;

        SuspendedState( ThrowingConsumer<Suspendable,Throwable> consumer )
        {
            this.consumer = consumer;
        }

        void set( Suspendable suspendable ) throws Throwable
        {
            consumer.accept( suspendable );
        }
    }
}
