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
package org.neo4j.causalclustering.core.replication.session;

import org.junit.Test;

import java.util.UUID;

import org.neo4j.causalclustering.identity.MemberId;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LocalSessionPoolTest
{
    private MemberId memberId = new MemberId( UUID.randomUUID() );
    private GlobalSession globalSession = new GlobalSession( UUID.randomUUID(), memberId );

    @Test
    public void poolGivesBackSameSessionAfterRelease()
    {
        LocalSessionPool sessionPool = new LocalSessionPool( globalSession );

        OperationContext contextA = sessionPool.acquireSession();
        sessionPool.releaseSession( contextA );

        OperationContext contextB = sessionPool.acquireSession();
        sessionPool.releaseSession( contextB );

        assertEquals( contextA.localSession(), contextB.localSession() );
    }

    @Test
    public void sessionAcquirementIncreasesOperationId()
    {
        LocalSessionPool sessionPool = new LocalSessionPool( globalSession );
        OperationContext context;

        context = sessionPool.acquireSession();
        LocalOperationId operationA = context.localOperationId();
        sessionPool.releaseSession( context );

        context = sessionPool.acquireSession();
        LocalOperationId operationB = context.localOperationId();
        sessionPool.releaseSession( context );

        assertEquals( operationB.sequenceNumber(), operationA.sequenceNumber() + 1 );
    }

    @Test
    public void poolHasIndependentSessions()
    {
        LocalSessionPool sessionPool = new LocalSessionPool( globalSession );

        OperationContext contextA = sessionPool.acquireSession();
        OperationContext contextB = sessionPool.acquireSession();

        assertNotEquals( contextA.localSession(), contextB.localSession() );
    }
}
