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
package org.neo4j.bolt.v3.messaging;

import org.junit.jupiter.api.Test;

import org.neo4j.bolt.messaging.BoltResponseMessageWriter;
import org.neo4j.bolt.packstream.PackOutputClosedException;
import org.neo4j.bolt.runtime.BoltConnection;
import org.neo4j.bolt.runtime.Neo4jError;
import org.neo4j.bolt.v3.messaging.response.FailureMessage;
import org.neo4j.bolt.v3.messaging.response.SuccessMessage;
import org.neo4j.graphdb.TransactionTerminatedException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.Log;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.logging.AssertableLogProvider.Level.ERROR;
import static org.neo4j.logging.AssertableLogProvider.Level.WARN;
import static org.neo4j.logging.LogAssertions.assertThat;

public class MessageProcessingHandlerTest
{
    @Test
    void shouldCallHaltOnUnexpectedFailures() throws Exception
    {
        // Given
        BoltResponseMessageWriter msgWriter = newResponseHandlerMock();
        doThrow( new RuntimeException( "Something went horribly wrong" ) ).when( msgWriter ).write(
                any( SuccessMessage.class ) );

        BoltConnection connection = mock( BoltConnection.class );
        MessageProcessingHandler handler =
                new MessageProcessingHandler( msgWriter, connection, mock( Log.class ) );

        // When
        handler.onFinish();

        // Then
        verify( connection ).stop();
    }

    @Test
    void shouldLogOriginalErrorWhenOutputIsClosed() throws Exception
    {
        testLoggingOfOriginalErrorWhenOutputIsClosed( Neo4jError.from( new RuntimeException( "Non-fatal error" ) ) );
    }

    @Test
    void shouldLogOriginalFatalErrorWhenOutputIsClosed() throws Exception
    {
        testLoggingOfOriginalErrorWhenOutputIsClosed( Neo4jError.fatalFrom( new RuntimeException( "Fatal error" ) ) );
    }

    @Test
    void shouldLogWriteErrorAndOriginalErrorWhenUnknownFailure() throws Exception
    {
        testLoggingOfWriteErrorAndOriginalErrorWhenUnknownFailure(
                Neo4jError.from( new RuntimeException( "Non-fatal error" ) ) );
    }

    @Test
    void shouldLogWriteErrorAndOriginalFatalErrorWhenUnknownFailure() throws Exception
    {
        testLoggingOfWriteErrorAndOriginalErrorWhenUnknownFailure(
                Neo4jError.fatalFrom( new RuntimeException( "Fatal error" ) ) );
    }

    @Test
    void shouldLogShortWarningOnClientDisconnectMidwayThroughQuery() throws Exception
    {
        // Connections dying is not exceptional per-se, so we don't need to fill the log with
        // eye-catching stack traces; but it could be indicative of some issue, so log a brief
        // warning in the debug log at least.

        // Given
        PackOutputClosedException outputClosed = new PackOutputClosedException( "Output closed", "<client>" );
        Neo4jError txTerminated =
                Neo4jError.from( new TransactionTerminatedException( Status.Transaction.Terminated ) );

        // When
        AssertableLogProvider logProvider = emulateFailureWritingError( txTerminated, outputClosed );

        // Then
        assertThat( logProvider ).forClass( getClass() ).forLevel( WARN )
                .containsMessageWithArguments(
                "Client %s disconnected while query was running. Session has been cleaned up. " +
                        "This can be caused by temporary network problems, but if you see this often, ensure your " +
                        "applications are properly waiting for operations to complete before exiting.",
                 "<client>" );
    }

    private static void testLoggingOfOriginalErrorWhenOutputIsClosed( Neo4jError original ) throws Exception
    {
        PackOutputClosedException outputClosed = new PackOutputClosedException( "Output closed", "<client>" );
        AssertableLogProvider logProvider = emulateFailureWritingError( original, outputClosed );
        assertThat( logProvider ).forClass( MessageProcessingHandlerTest.class ).forLevel( WARN )
                .containsMessageWithException( "Unable to send error back to the client", original.cause() );
    }

    private static void testLoggingOfWriteErrorAndOriginalErrorWhenUnknownFailure( Neo4jError original )
            throws Exception
    {
        RuntimeException outputError = new RuntimeException( "Output failed" );
        AssertableLogProvider logProvider = emulateFailureWritingError( original, outputError );
        assertThat( logProvider ).forClass( MessageProcessingHandlerTest.class ).forLevel( ERROR )
                .containsMessageWithException( "Unable to send error back to the client", outputError );
        assertThat( outputError ).hasSuppressedException( original.cause() );
    }

    private static AssertableLogProvider emulateFailureWritingError( Neo4jError error, Throwable errorDuringWrite )
            throws Exception
    {
        AssertableLogProvider logProvider = new AssertableLogProvider();
        BoltResponseMessageWriter responseHandler = newResponseHandlerMock( errorDuringWrite );

        MessageProcessingHandler handler =
                new MessageProcessingHandler( responseHandler, mock( BoltConnection.class ),
                        logProvider.getLog( MessageProcessingHandlerTest.class ) );

        handler.markFailed( error );
        handler.onFinish();

        return logProvider;
    }

    private static BoltResponseMessageWriter newResponseHandlerMock( Throwable error ) throws Exception
    {
        BoltResponseMessageWriter handler = newResponseHandlerMock();

        doThrow( error ).when( handler ).write( any( FailureMessage.class ) );
        return handler;
    }

    private static BoltResponseMessageWriter newResponseHandlerMock()
    {
        return mock( BoltResponseMessageWriter.class );
    }
}
