/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.impl.api.LeaseService.NoLeaseClient;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceTypes;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

import static org.apache.commons.lang3.exception.ExceptionUtils.getRootCause;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

abstract class AcquisitionTimeoutCompatibility extends LockCompatibilityTestSupport
{
    private FakeClock clock;
    private Locks lockManager;
    private Locks.Client client;
    private Locks.Client client2;

    AcquisitionTimeoutCompatibility( LockingCompatibilityTestSuite suite )
    {
        super( suite );
    }

    @BeforeEach
    void setUp()
    {
        Config customConfig = Config.defaults( GraphDatabaseSettings.lock_acquisition_timeout, Duration.ofMillis( 100 ) );
        clock = Clocks.fakeClock(100000, TimeUnit.MINUTES);
        lockManager = suite.createLockManager( customConfig, clock );
        client = lockManager.newClient();
        client2 = lockManager.newClient();
        client.initialize( NoLeaseClient.INSTANCE, 1, EmptyMemoryTracker.INSTANCE, customConfig );
        client2.initialize( NoLeaseClient.INSTANCE, 2, EmptyMemoryTracker.INSTANCE, customConfig );
    }

    @AfterEach
    void tearDown()
    {
        client2.close();
        client.close();
        lockManager.close();
    }

    @Test
    void terminateSharedLockAcquisition() throws InterruptedException
    {
        client.acquireExclusive( LockTracer.NONE, ResourceTypes.NODE, 1 );
        Future<Boolean> sharedLockAcquisition = threadB.submit( () ->
        {
            client2.acquireShared( LockTracer.NONE, ResourceTypes.NODE, 1 );
            return true;
        } );

        threadB.untilWaiting();

        clock.forward( 101, TimeUnit.MILLISECONDS );

        verifyAcquisitionFailure( sharedLockAcquisition );
    }

    @Test
    void terminateExclusiveLockAcquisitionForExclusivelyLockedResource() throws InterruptedException
    {
        client.acquireExclusive( LockTracer.NONE, ResourceTypes.NODE, 1 );
        Future<Boolean> exclusiveLockAcquisition = threadB.submit( () ->
        {
            client2.acquireExclusive( LockTracer.NONE, ResourceTypes.NODE, 1 );
            return true;
        } );

        threadB.untilWaiting();

        clock.forward( 101, TimeUnit.MILLISECONDS );

        verifyAcquisitionFailure( exclusiveLockAcquisition );
    }

    @Test
    void terminateExclusiveLockAcquisitionForSharedLockedResource() throws InterruptedException
    {
        client.acquireShared( LockTracer.NONE, ResourceTypes.NODE, 1 );
        Future<Boolean> exclusiveLockAcquisition = threadB.submit( () ->
        {
            client2.acquireExclusive( LockTracer.NONE, ResourceTypes.NODE, 1 );
            return true;
        } );

        threadB.untilWaiting();

        clock.forward( 101, TimeUnit.MILLISECONDS );

        verifyAcquisitionFailure( exclusiveLockAcquisition );
    }

    @Test
    void terminateExclusiveLockAcquisitionForSharedLockedResourceWithSharedLockHeld() throws InterruptedException
    {
        client.acquireShared( LockTracer.NONE, ResourceTypes.NODE, 1 );
        client2.acquireShared( LockTracer.NONE, ResourceTypes.NODE, 1 );
        Future<Boolean> exclusiveLockAcquisition = threadB.submit( () ->
        {
            client2.acquireExclusive( LockTracer.NONE, ResourceTypes.NODE, 1 );
            return true;
        } );

        threadB.untilWaiting();

        clock.forward( 101, TimeUnit.MILLISECONDS );

        verifyAcquisitionFailure( exclusiveLockAcquisition );
    }

    private static void verifyAcquisitionFailure( Future<Boolean> lockAcquisition )
    {
        ExecutionException exception = assertThrows( ExecutionException.class, lockAcquisition::get );
        assertThat( getRootCause( exception ) ).isInstanceOf( LockAcquisitionTimeoutException.class );
    }
}
