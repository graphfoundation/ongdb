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
package org.neo4j.kernel.impl.enterprise.lock.forseti;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class SharedLockTest
{

    @Test
    public void shouldUpgradeToUpdateLock()
    {
        // Given
        ForsetiClient clientA = mock( ForsetiClient.class );
        ForsetiClient clientB = mock( ForsetiClient.class );

        SharedLock lock = new SharedLock( clientA );
        lock.acquire( clientB );

        // When
        assertTrue( lock.tryAcquireUpdateLock( clientA ) );

        // Then
        assertThat( lock.numberOfHolders(), equalTo( 2 ) );
        assertThat( lock.isUpdateLock(), equalTo( true ) );
    }

    @Test
    public void shouldReleaseSharedLock()
    {
        // Given
        ForsetiClient clientA = mock( ForsetiClient.class );
        SharedLock lock = new SharedLock( clientA );

        // When
        assertTrue( lock.release( clientA ) );

        // Then
        assertThat( lock.numberOfHolders(), equalTo( 0 ) );
        assertThat( lock.isUpdateLock(), equalTo( false ) );
    }
}
