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
package org.neo4j.bolt.runtime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.runtime.statemachine.BoltStateMachine;
import org.neo4j.bolt.testing.BoltResponseRecorder;
import org.neo4j.bolt.testing.BoltTestUtil;
import org.neo4j.bolt.v4.BoltProtocolV4;
import org.neo4j.bolt.v4.BoltStateMachineV4;
import org.neo4j.bolt.v4.messaging.BoltV4Messages;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.internal.Version;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.memory.MemoryTracker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.bolt.testing.BoltConditions.failedWithStatus;
import static org.neo4j.bolt.testing.BoltConditions.succeededWithMetadata;
import static org.neo4j.bolt.testing.BoltConditions.verifyKillsConnection;
import static org.neo4j.kernel.api.security.AuthToken.newBasicAuthToken;
import static org.neo4j.values.storable.Values.TRUE;
import static org.neo4j.values.storable.Values.stringValue;

class BoltConnectionAuthIT
{
    private static final BoltChannel BOLT_CHANNEL = BoltTestUtil.newTestBoltChannel( "conn-v4-test-boltchannel-id" );
    private static final MemoryTracker MEMORY_TRACKER = EmptyMemoryTracker.INSTANCE;

    @RegisterExtension
    static final SessionExtension env = new SessionExtension().withAuthEnabled( true );

    protected BoltStateMachineV4 newStateMachine()
    {
        return (BoltStateMachineV4) env.newMachine( BoltProtocolV4.VERSION, BOLT_CHANNEL, MEMORY_TRACKER );
    }

    @Test
    void shouldGiveCredentialsExpiredStatusOnExpiredCredentials() throws Throwable
    {
        // Given it is important for client applications to programmatically
        // identify expired credentials as the cause of not being authenticated
        BoltStateMachine machine = newStateMachine();
        BoltResponseRecorder recorder = new BoltResponseRecorder();

        // When
        var hello = BoltV4Messages.hello( newBasicAuthToken( "neo4j", "neo4j" ) );

        machine.process( hello, recorder );
        machine.process( BoltV4Messages.run( "CREATE ()" ), recorder );

        // Then
        assertThat( recorder.nextResponse() ).satisfies( succeededWithMetadata( "credentials_expired", TRUE ) );
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Security.CredentialsExpired ) );
    }

    @Test
    void shouldGiveKernelVersionOnInit() throws Throwable
    {
        // Given it is important for client applications to programmatically
        // identify expired credentials as the cause of not being authenticated
        BoltStateMachine machine = newStateMachine();
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        String version = "Neo4j/" + Version.getNeo4jVersion();

        // When
        var hello = BoltV4Messages.hello( newBasicAuthToken( "neo4j", "neo4j" ) );

        machine.process( hello, recorder );
        machine.process( BoltV4Messages.run( "CREATE ()" ), recorder );

        // Then
        assertThat( recorder.nextResponse() ).satisfies( succeededWithMetadata( "server", stringValue( version ) ) );
    }

    @Test
    void shouldCloseConnectionAfterAuthenticationFailure() throws Throwable
    {
        // Given
        BoltStateMachine machine = newStateMachine();
        BoltResponseRecorder recorder = new BoltResponseRecorder();

        // When... then
        var hello = BoltV4Messages.hello( newBasicAuthToken( "neo4j", "j4oen" ) );
        verifyKillsConnection( () -> machine.process( hello, recorder ) );

        // ...and
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Security.Unauthorized ) );
    }
}
