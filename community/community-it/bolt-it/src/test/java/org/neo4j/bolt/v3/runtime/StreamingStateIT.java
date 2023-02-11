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
import org.neo4j.bolt.runtime.BoltResponseHandler;
import org.neo4j.bolt.testing.BoltResponseRecorder;
import org.neo4j.bolt.testing.RecordedBoltResponse;
import org.neo4j.bolt.v3.BoltStateMachineV3;
import org.neo4j.bolt.v3.messaging.request.BeginMessage;
import org.neo4j.bolt.v3.messaging.request.DiscardAllMessage;
import org.neo4j.bolt.v3.messaging.request.InterruptSignal;
import org.neo4j.bolt.v3.messaging.request.PullAllMessage;
import org.neo4j.bolt.v3.messaging.request.ResetMessage;
import org.neo4j.bolt.v3.messaging.request.RunMessage;
import org.neo4j.kernel.api.exceptions.Status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.neo4j.bolt.testing.BoltConditions.failedWithStatus;
import static org.neo4j.bolt.testing.BoltConditions.succeeded;
import static org.neo4j.bolt.testing.BoltConditions.verifyKillsConnection;
import static org.neo4j.bolt.testing.NullResponseHandler.nullResponseHandler;
import static org.neo4j.bolt.v3.messaging.request.CommitMessage.COMMIT_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.GoodbyeMessage.GOODBYE_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.RollbackMessage.ROLLBACK_MESSAGE;

class StreamingStateIT extends BoltStateMachineV3StateTestBase
{
    @Test
    void shouldMoveFromStreamingToReadyOnPullAll_succ() throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInStreamingState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( PullAllMessage.INSTANCE, recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response ).satisfies( succeeded() );
        assertTrue( response.hasMetadata( "type" ) );
        assertTrue( response.hasMetadata( "t_last" ) );
        assertTrue( response.hasMetadata( "bookmark" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @Test
    void shouldMoveFromStreamingToReadyOnDiscardAll_succ() throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInStreamingState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( DiscardAllMessage.INSTANCE, recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response ).satisfies( succeeded() );
        assertTrue( response.hasMetadata( "bookmark" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @Test
    void shouldMoveFromStreamingToInterruptedOnInterrupt() throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInStreamingState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( InterruptSignal.INSTANCE, recorder );

        // Then
        assertThat( machine.state() ).isInstanceOf( InterruptedState.class );
    }

    @ParameterizedTest
    @MethodSource( "pullAllDiscardAllMessages" )
    void shouldMoveFromStreamingStateToFailedStateOnPullAllOrDiscardAll_fail( RequestMessage message ) throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = getBoltStateMachineInStreamingState();

        // When
        BoltResponseHandler handler = mock( BoltResponseHandler.class );
        doThrow( new RuntimeException( "Fail" ) ).when( handler ).onPullRecords( any(), anyLong() );
        doThrow( new RuntimeException( "Fail" ) ).when( handler ).onDiscardRecords( any(), anyLong() );
        machine.process( message, handler );

        // Then
        assertThat( machine.state() ).isInstanceOf( FailedState.class );
    }

    @ParameterizedTest
    @MethodSource( "illegalV3Messages" )
    void shouldCloseConnectionOnIllegalV3MessagesInStreamingState( RequestMessage message ) throws Throwable
    {
        shouldThrowExceptionOnIllegalMessagesInStreamingState( message );
    }

    private void shouldThrowExceptionOnIllegalMessagesInStreamingState( RequestMessage message ) throws Throwable
    {
        // Given
        BoltStateMachineV3 machine = newStateMachine();
        machine.process( newHelloMessage(), nullResponseHandler() );

        machine.process( new RunMessage( "CREATE (n {k:'k'}) RETURN n.k", EMPTY_PARAMS ), nullResponseHandler() );
        assertThat( machine.state() ).isInstanceOf( StreamingState.class );

        // when
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        verifyKillsConnection( () -> machine.process( message, recorder ) );

        // then
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Request.Invalid ) );
        assertNull( machine.state() );
    }

    private static Stream<RequestMessage> illegalV3Messages()
    {
        return Stream.of( newHelloMessage(), new RunMessage( "any string" ), new BeginMessage(), ROLLBACK_MESSAGE, COMMIT_MESSAGE, ResetMessage.INSTANCE,
                GOODBYE_MESSAGE );
    }

    private static Stream<RequestMessage> pullAllDiscardAllMessages()
    {
        return Stream.of( PullAllMessage.INSTANCE, DiscardAllMessage.INSTANCE );
    }

    private BoltStateMachineV3 getBoltStateMachineInStreamingState() throws BoltConnectionFatality
    {
        BoltStateMachineV3 machine = newStateMachine();
        machine.process( newHelloMessage(), nullResponseHandler() );

        machine.process( new RunMessage( "CREATE (n {k:'k'}) RETURN n.k", EMPTY_PARAMS ), nullResponseHandler() );
        assertThat( machine.state() ).isInstanceOf( StreamingState.class );
        return machine;
    }
}
