/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.locking;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Future;

import org.neo4j.lock.LockTracer;
import org.neo4j.lock.LockType;
import org.neo4j.lock.ResourceType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.lock.ResourceTypes.NODE;

abstract class LockReentrancyCompatibility extends LockCompatibilityTestSupport
{
    LockReentrancyCompatibility( LockingCompatibilityTestSuite suite )
    {
        super( suite );
    }

    @Test
    void shouldAcquireExclusiveIfClientIsOnlyOneHoldingShared()
    {
        // When
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );

        // Then shared locks should wait
        Future<Void> clientBLock = acquireExclusive( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseExclusive( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseShared( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void shouldRetainExclusiveLockAfterReleasingSharedLock()
    {
        // When
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );

        // Then shared locks should wait
        Future<Void> clientBLock = acquireShared( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseShared( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseExclusive( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void shouldRetainSharedLockWhenAcquiredAfterExclusiveLock()
    {
        // When
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );

        // Then this should wait
        Future<Void> clientBLock = acquireExclusive( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseExclusive( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseShared( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void sharedLocksShouldStack()
    {
        // When
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );

        // Then exclusive locks should wait
        Future<Void> clientBLock = acquireExclusive( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseShared( NODE, 1L );
        clientA.releaseShared( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseShared( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void exclusiveLocksShouldBeReentrantAndBlockOtherExclusiveLocks()
    {
        // When
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );

        // Then exclusive locks should wait
        Future<Void> clientBLock = acquireExclusive( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseExclusive( NODE, 1L );
        clientA.releaseExclusive( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseExclusive( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void exclusiveLocksShouldBeReentrantAndBlockOtherSharedLocks()
    {
        // When
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientA.tryExclusiveLock( NODE, 1L );

        // Then exclusive locks should wait
        Future<Void> clientBLock = acquireShared( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseExclusive( NODE, 1L );
        clientA.releaseShared( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseExclusive( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void sharedLocksShouldNotReplaceExclusiveLocks()
    {
        // When
        clientA.acquireExclusive( LockTracer.NONE, NODE, 1L );
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );

        // Then shared locks should wait
        Future<Void> clientBLock = acquireShared( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // And when
        clientA.releaseShared( NODE, 1L );

        // Then other thread should still wait
        assertWaiting( clientB, clientBLock );

        // But when
        clientA.releaseExclusive( NODE, 1L );

        // Then
        assertNotWaiting( clientBLock );
    }

    @Test
    void shouldUpgradeAndDowngradeSameSharedLock()
    {
        // when
        clientA.acquireShared( LockTracer.NONE, NODE, 1L );
        clientB.acquireShared( LockTracer.NONE, NODE, 1L );

        LockIdentityExplorer sharedLockExplorer = new LockIdentityExplorer( NODE, 1L );
        locks.accept( sharedLockExplorer );

        // then xclusive should wait for shared from other client to be released
        Future<Void> exclusiveLockFuture = acquireExclusive( clientB, LockTracer.NONE, NODE, 1L ).callAndAssertWaiting();

        // and when
        clientA.releaseShared( NODE, 1L );

        // exclusive lock should be received
        assertNotWaiting( exclusiveLockFuture );

        // and when releasing exclusive
        clientB.releaseExclusive( NODE, 1L );

        // we still should have same read lock
        LockIdentityExplorer releasedLockExplorer = new LockIdentityExplorer( NODE, 1L );
        locks.accept( releasedLockExplorer );

        // we still hold same lock as before
        assertEquals( sharedLockExplorer.getLockIdentityHashCode(),
                releasedLockExplorer.getLockIdentityHashCode() );
    }

    private static class LockIdentityExplorer implements Locks.Visitor
    {
        private final ResourceType resourceType;
        private final long resourceId;
        private long lockIdentityHashCode;

        LockIdentityExplorer( ResourceType resourceType, long resourceId )
        {
            this.resourceType = resourceType;
            this.resourceId = resourceId;
        }

        @Override
        public void visit( LockType lockType, ResourceType resourceType, long transactionId, long resourceId, String description, long estimatedWaitTime,
                long lockIdentityHashCode )
        {
            if ( this.resourceType.equals( resourceType ) && this.resourceId == resourceId )
            {
                this.lockIdentityHashCode = lockIdentityHashCode;
            }
        }

        public long getLockIdentityHashCode()
        {
            return lockIdentityHashCode;
        }
    }
}
