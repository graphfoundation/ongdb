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
package org.neo4j.bolt.v3.runtime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import org.neo4j.bolt.messaging.BoltIOException;
import org.neo4j.bolt.messaging.RequestMessage;
import org.neo4j.bolt.testing.BoltResponseRecorder;
import org.neo4j.bolt.testing.RecordedBoltResponse;
import org.neo4j.bolt.v3.BoltStateMachineV3;
import org.neo4j.bolt.v3.messaging.BoltV3Messages;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.internal.Version;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.neo4j.bolt.runtime.statemachine.impl.BoltStateMachineSPIImpl.BOLT_SERVER_VERSION_PREFIX;
import static org.neo4j.bolt.testing.BoltConditions.failedWithStatus;
import static org.neo4j.bolt.testing.BoltConditions.succeededWithMetadata;
import static org.neo4j.bolt.testing.BoltConditions.verifyKillsConnection;

class ConnectedStateIT extends BoltStateMachineV3StateTestBase
{
    @Test
    void shouldHandleHelloMessage() throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = newStateMachine();
        BoltResponseRecorder recorder = new BoltResponseRecorder();

        // When
        machine.process( newHelloMessage(), recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response ).satisfies( succeededWithMetadata( "server", BOLT_SERVER_VERSION_PREFIX + Version.getONgDBVersion() ) );
        assertThat( response ).satisfies( succeededWithMetadata( "connection_id", "conn-v3-test-boltchannel-id" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @ParameterizedTest
    @MethodSource( "illegalV3Messages" )
    void shouldCloseConnectionOnIllegalV3Messages( RequestMessage message ) throws Throwable
    {
        shouldCloseConnectionOnIllegalMessages( message );
    }

    @ParameterizedTest
    @MethodSource( "illegalV4Messages" )
    void shouldCloseConnectionOnIllegalV2Messages( RequestMessage message ) throws Throwable
    {
        shouldCloseConnectionOnIllegalMessages( message );
    }

    private void shouldCloseConnectionOnIllegalMessages( RequestMessage message ) throws InterruptedException
    {
        // Given
        BoltStateMachineV3 machine = newStateMachine();

        // when
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        verifyKillsConnection( () -> machine.process( message, recorder ) );

        // then
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Request.Invalid ) );
        assertNull( machine.state() );
    }

    private static Stream<RequestMessage> illegalV3Messages()
    {
        return BoltV3Messages.supported().filter( e -> !e.equals( BoltV3Messages.hello() ) );
    }

    private static Stream<RequestMessage> illegalV4Messages() throws BoltIOException
    {
        return BoltV3Messages.unsupported();
    }
}
