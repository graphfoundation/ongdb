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
package org.neo4j.bolt.v4.runtime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import org.neo4j.bolt.messaging.RequestMessage;
import org.neo4j.bolt.runtime.BoltConnectionFatality;
import org.neo4j.bolt.testing.BoltResponseRecorder;
import org.neo4j.bolt.testing.RecordedBoltResponse;
import org.neo4j.bolt.v3.messaging.request.DiscardAllMessage;
import org.neo4j.bolt.v3.messaging.request.InterruptSignal;
import org.neo4j.bolt.v3.messaging.request.PullAllMessage;
import org.neo4j.bolt.v3.messaging.request.ResetMessage;
import org.neo4j.bolt.v3.runtime.InterruptedState;
import org.neo4j.bolt.v3.runtime.ReadyState;
import org.neo4j.bolt.v4.BoltStateMachineV4;
import org.neo4j.bolt.v4.messaging.BeginMessage;
import org.neo4j.bolt.v4.messaging.RunMessage;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.values.storable.BooleanValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.bolt.testing.BoltConditions.containsRecord;
import static org.neo4j.bolt.testing.BoltConditions.failedWithStatus;
import static org.neo4j.bolt.testing.BoltConditions.succeeded;
import static org.neo4j.bolt.testing.BoltConditions.succeededWithMetadata;
import static org.neo4j.bolt.testing.BoltConditions.verifyKillsConnection;
import static org.neo4j.bolt.testing.NullResponseHandler.nullResponseHandler;
import static org.neo4j.bolt.v3.messaging.request.CommitMessage.COMMIT_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.GoodbyeMessage.GOODBYE_MESSAGE;
import static org.neo4j.bolt.v3.messaging.request.RollbackMessage.ROLLBACK_MESSAGE;

class AutoCommitStateIT extends BoltStateMachineV4StateTestBase
{
    @Test
    void shouldMoveFromAutoCommitToReadyOnPull_succ() throws Throwable
    {
        // Given
        BoltStateMachineV4 machine = getBoltStateMachineInAutoCommitState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( newPullMessage( 100L ), recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response ).satisfies( succeeded() );
        assertTrue( response.hasMetadata( "type" ) );
        assertTrue( response.hasMetadata( "t_last" ) );
        assertTrue( response.hasMetadata( "bookmark" ) );
        assertTrue( response.hasMetadata( "db" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @Test
    void shouldMoveFromAutoCommitToReadyOnPull_succ_hasMore() throws Throwable
    {
        // Given
        BoltStateMachineV4 machine = getBoltStateMachineInAutoCommitState( "Unwind [1, 2, 3] as n return n" );

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( newPullMessage( 2L ), recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response ).satisfies( containsRecord( 1L ) );
        assertThat( response ).satisfies( succeededWithMetadata( "has_more", BooleanValue.TRUE ) );
        assertFalse( response.hasMetadata( "db" ) );
        assertFalse( response.hasMetadata( "bookmark" ) );

        machine.process( newPullMessage( 2L ), recorder );
        response = recorder.nextResponse();
        assertThat( response ).satisfies( containsRecord( 3L ) );
        assertTrue( response.hasMetadata( "type" ) );
        assertTrue( response.hasMetadata( "t_last" ) );
        assertTrue( response.hasMetadata( "bookmark" ) );
        assertTrue( response.hasMetadata( "db" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @Test
    void shouldMoveFromAutoCommitToReadyOnDiscardAll_succ() throws Throwable
    {
        // Given
        BoltStateMachineV4 machine = getBoltStateMachineInAutoCommitState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( newDiscardMessage( 2L ), recorder );

        // Then
        RecordedBoltResponse response = recorder.nextResponse();
        assertThat( response).satisfies( succeeded() );
        assertTrue( response.hasMetadata( "bookmark" ) );
        assertTrue( response.hasMetadata( "db" ) );
        assertThat( machine.state() ).isInstanceOf( ReadyState.class );
    }

    @Test
    void shouldMoveFromAutoCommitToInterruptedOnInterrupt() throws Throwable
    {
        // Given
        BoltStateMachineV4 machine = getBoltStateMachineInAutoCommitState();

        // When
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        machine.process( InterruptSignal.INSTANCE, recorder );

        // Then
        assertThat( machine.state() ).isInstanceOf( InterruptedState.class );
    }

    @ParameterizedTest
    @MethodSource( "illegalV4Messages" )
    void shouldCloseConnectionOnIllegalV3MessagesInAutoCommitState( RequestMessage message ) throws Throwable
    {
        shouldThrowExceptionOnIllegalMessagesInAutoCommitState( message );
    }

    private void shouldThrowExceptionOnIllegalMessagesInAutoCommitState( RequestMessage message ) throws Throwable
    {
        // Given
        BoltStateMachineV4 machine = newStateMachine();
        machine.process( newHelloMessage(), nullResponseHandler() );

        machine.process( new RunMessage( "CREATE (n {k:'k'}) RETURN n.k", EMPTY_PARAMS ), nullResponseHandler() );
        assertThat( machine.state() ).isInstanceOf( AutoCommitState.class );

        // when
        BoltResponseRecorder recorder = new BoltResponseRecorder();
        verifyKillsConnection( () -> machine.process( message, recorder ) );

        // then
        assertThat( recorder.nextResponse() ).satisfies( failedWithStatus( Status.Request.Invalid ) );
        assertNull( machine.state() );
    }

    private static Stream<RequestMessage> illegalV4Messages()
    {
        return Stream.of( newHelloMessage(), new RunMessage( "any string" ), new BeginMessage(), ROLLBACK_MESSAGE, COMMIT_MESSAGE, ResetMessage.INSTANCE,
                GOODBYE_MESSAGE, PullAllMessage.INSTANCE, DiscardAllMessage.INSTANCE );
    }

    private BoltStateMachineV4 getBoltStateMachineInAutoCommitState() throws BoltConnectionFatality
    {
        return getBoltStateMachineInAutoCommitState( "CREATE (n {k:'k'}) RETURN n.k" );
    }

    private BoltStateMachineV4 getBoltStateMachineInAutoCommitState( String query ) throws BoltConnectionFatality
    {
        BoltStateMachineV4 machine = newStateMachine();
        machine.process( newHelloMessage(), nullResponseHandler() );

        machine.process( new RunMessage( query, EMPTY_PARAMS ), nullResponseHandler() );
        assertThat( machine.state() ).isInstanceOf( AutoCommitState.class );
        return machine;
    }
}
