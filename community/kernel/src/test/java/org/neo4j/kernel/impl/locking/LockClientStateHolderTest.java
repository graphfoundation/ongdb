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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LockClientStateHolderTest
{

    @Test
    void shouldAllowIncrementDecrementClientsWhileNotClosed()
    {
        // given
        LockClientStateHolder lockClientStateHolder = new LockClientStateHolder();

        // expect
        assertFalse( lockClientStateHolder.hasActiveClients() );
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        assertTrue( lockClientStateHolder.hasActiveClients() );
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        lockClientStateHolder.decrementActiveClients();
        lockClientStateHolder.decrementActiveClients();
        lockClientStateHolder.decrementActiveClients();
        assertFalse( lockClientStateHolder.hasActiveClients() );
    }

    @Test
    void shouldNotAllowNewClientsWhenClosed()
    {
        // given
        LockClientStateHolder lockClientStateHolder = new LockClientStateHolder();

        // when
        lockClientStateHolder.stopClient();

        // then
        assertFalse( lockClientStateHolder.hasActiveClients() );
        assertThrows( LockClientStoppedException.class, () -> lockClientStateHolder.incrementActiveClients( new NoOpClient() ) );
    }

    @Test
    void shouldBeAbleToDecrementActiveItemAndDetectWhenFree()
    {
        // given
        LockClientStateHolder lockClientStateHolder = new LockClientStateHolder();

        // when
        lockClientStateHolder.incrementActiveClients(new NoOpClient());
        lockClientStateHolder.incrementActiveClients(new NoOpClient());
        lockClientStateHolder.decrementActiveClients();
        lockClientStateHolder.incrementActiveClients(new NoOpClient());

        // expect
        assertTrue( lockClientStateHolder.hasActiveClients() );

        // and when
        lockClientStateHolder.stopClient();

        // expect
        assertTrue( lockClientStateHolder.hasActiveClients() );
        lockClientStateHolder.decrementActiveClients();
        assertTrue( lockClientStateHolder.hasActiveClients() );
        lockClientStateHolder.decrementActiveClients();
        assertFalse( lockClientStateHolder.hasActiveClients() );
    }

    @Test
    void shouldBeAbleToResetAndReuseClientState()
    {
        // given
        LockClientStateHolder lockClientStateHolder = new LockClientStateHolder();

        // when
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        lockClientStateHolder.decrementActiveClients();

        // expect
        assertTrue(lockClientStateHolder.hasActiveClients());

        // and when
        lockClientStateHolder.stopClient();

        // expect
        assertTrue( lockClientStateHolder.hasActiveClients() );
        assertTrue( lockClientStateHolder.isStopped() );

        // and when
        lockClientStateHolder.reset();

        // expect
        assertFalse( lockClientStateHolder.hasActiveClients() );
        assertFalse( lockClientStateHolder.isStopped() );

        // when
        lockClientStateHolder.incrementActiveClients( new NoOpClient() );
        assertTrue( lockClientStateHolder.hasActiveClients() );
        assertFalse( lockClientStateHolder.isStopped() );
    }
}
