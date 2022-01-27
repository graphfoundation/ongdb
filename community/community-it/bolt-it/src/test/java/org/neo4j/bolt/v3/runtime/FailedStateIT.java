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

import org.neo4j.bolt.messaging.RequestMessage;
import org.neo4j.bolt.runtime.BoltConnectionFatality;
import org.neo4j.bolt.testing.BoltResponseRecorder;
import org.neo4j.bolt.v3.BoltStateMachineV3;
import org.neo4j.bolt.v3.messaging.request.BeginMessage;
import org.neo4j.bolt.v3.messaging.request.DiscardAllMessage;
import org.neo4j.bolt.v3.messaging.request.InterruptSignal;
import org.neo4j.bolt.v3.messaging.request.PullAllMessage;
import org.neo4j.bolt.v3.messaging.request.RunMessage;
import org.neo4j.kernel.api.exceptions.Status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.bolt.testing.BoltConditions.failedWithStatus;
import static org.neo4j.bolt.testing.BoltConditions.succeeded;
import static org.neo4j.bolt.testing.BoltConditions.verifyKillsConnection;
import static org.neo4j.bolt.testing.BoltConditions.wasIgnored;
import static org.neo4j.bolt.testing.NullResponseHandler.nullResponseHandler;
import static org.neo4j.bolt.v3.messaging.request.CommitMessage.COMMIT_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.GoodbyeMessage.GOODBYE_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.RollbackMessage.ROLLBACK_MESSAGE;

class FailedStateIT extends BoltStateMachineV3StateTestBase
{
    @ParameterizedTest
    @MethodSource( "ignoredMessages" )
    void shouldIgnoreMessages( RequestMessage message ) throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInFailedState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( message, recorder );

        // Then
        assertThat( recorder.nextResponse() ).satisfies( wasIgnored() );
        assertThat( machine.state() ).isInstanceOf( FailedState.class );
    }

    @Test
    void shouldMoveToInterruptedOnInterruptSignal() throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInFailedState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( InterruptSignal.INSTANCE, recorder );

        // Then
        assertThat( recorder.nextResponse() ).satisfies( succeeded() );
        assertThat( machine.state() ).isInstanceOf( InterruptedState.class );
    }

    @ParameterizedTest
    @MethodSource( "illegalV3Messages" )
    void shouldCloseConnectionOnIllegalV3Messages( RequestMessage message ) throws Throwable
    {
        shouldCloseConnectionOnIllegalMessages( message );
    }

    private void shouldCloseConnectionOnIllegalMessages( RequestMessage message ) throws InterruptedException, BoltConnectionFatality
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInFailedState();

        // when
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        verifyKillsConnection( () -> machine.process( message, recorder ) );

        // then
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Request.Invalid ) );
        assertNull( machine.state() );
    }

    private BoltStateMachineV3 getBoltStateMachineInFailedState() throws BoltConnectionFatality, InterruptedException
    {
        BoltStateMachineV3 machine = newStateMachine();
        machine.process( newHelloMessage(), nullResponseHandler() );

        RunMessage runMessage = mock( RunMessage.class );
        when( runMessage.statement() ).thenThrow( new RuntimeException( "error here" ) );
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( runMessage, recorder );

        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.General.UnknownError ) );
        assertThat( machine.state() ).isInstanceOf( FailedState.class );
        return machine;
    }

    private static Stream<RequestMessage> ignoredMessages()
    {
        return Stream.of( DiscardAllMessage.INSTANCE, PullAllMessage.INSTANCE, new RunMessage( "A cypher query" ), COMMIT_MESSAGE, ROLLBACK_MESSAGE );
    }

    private static Stream<RequestMessage> illegalV3Messages()
    {
        return Stream.of( newHelloMessage(), new BeginMessage(), GOODBYE_MESSAGE );
    }
}
