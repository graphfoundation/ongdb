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
package org.neo4j.harness;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.UserFunction;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.test.server.HTTP;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL;
import static org.neo4j.internal.kernel.api.security.AccessMode.Static.READ;
import static org.neo4j.messages.MessageUtil.authDisabled;
import static org.neo4j.messages.MessageUtil.createNodeWithLabelsDenied;
import static org.neo4j.messages.MessageUtil.overriddenMode;
import static org.neo4j.test.server.HTTP.RawPayload.quotedJson;

@TestDirectoryExtension
class JavaFunctionsTestIT
{
    @Inject
    private TestDirectory testDir;

    public static class MyFunctions
    {

        @UserFunction
        public long myFunc()
        {
            return 1337L;
        }

        @UserFunction
        public long funcThatThrows()
        {
            throw new RuntimeException( "This is an exception" );
        }
    }

    public static class MyFunctionsUsingMyService
    {

        @Context
        public SomeService service;

        @UserFunction( "my.hello" )
        public String hello()
        {
            return service.hello();
        }
    }

    public static class MyFunctionsUsingMyCoreAPI
    {
        @Context
        public MyCoreAPI myCoreAPI;

        @Context
        public Transaction transaction;

        @UserFunction( value = "my.willFail" )
        public long willFail() throws ProcedureException
        {
            return myCoreAPI.makeNode( transaction, "Test" );
        }

        @UserFunction( "my.countNodes" )
        public long countNodes()
        {
            return MyCoreAPI.countNodes( transaction );
        }
    }

    private Neo4jBuilder createServer( Class<?> functionClass )
    {
        return Neo4jBuilders.newInProcessBuilder()
                                 .withFunction( functionClass );
    }

    @Test
    void shouldLaunchWithDeclaredFunctions() throws Exception
    {
        // When
        Class<MyFunctions> functionClass = MyFunctions.class;
        try ( Neo4j server = createServer( functionClass ).build() )
        {
            // Then
            HTTP.Response response = HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                    quotedJson(
                            "{ 'statements': [ { 'statement': 'RETURN org.neo4j.harness.myFunc() AS someNumber' } ] " +
                            "}" ) );

            JsonNode result = response.get( "results" ).get( 0 );
            assertEquals( "someNumber", result.get( "columns" ).get( 0 ).asText() );
            assertEquals( 1337, result.get( "data" ).get( 0 ).get( "row" ).get( 0 ).asInt() );
            assertEquals( "[]", response.get( "errors" ).toString() );
        }
    }

    @Test
    void shouldGetHelpfulErrorOnProcedureThrowsException() throws Exception
    {
        // When
        try ( Neo4j server = createServer( MyFunctions.class ).build() )
        {
            // Then
            HTTP.Response response = HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                    quotedJson(
                            "{ 'statements': [ { 'statement': 'RETURN org.neo4j.harness.funcThatThrows()' } ] }" ) );

            String error = response.get( "errors" ).get( 0 ).get( "message" ).asText();
            assertEquals( "Failed to invoke function `org.neo4j.harness.funcThatThrows`: Caused by: java.lang.RuntimeException: This is an exception", error );
        }
    }

    @Test
    void shouldWorkWithInjectableFromExtension() throws Throwable
    {
        // When
        try ( Neo4j server = createServer( MyFunctionsUsingMyService.class ).build() )
        {
            // Then
            HTTP.Response response = HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                    quotedJson( "{ 'statements': [ { 'statement': 'RETURN my.hello() AS result' } ] }" ) );

            assertEquals( "[]", response.get( "errors" ).toString() );
            JsonNode result = response.get( "results" ).get( 0 );
            assertEquals( "result", result.get( "columns" ).get( 0 ).asText() );
            assertEquals( "world", result.get( "data" ).get( 0 ).get( "row" ).get( 0 ).asText() );
        }
    }

    @Test
    void shouldWorkWithInjectableFromExtensionWithMorePower() throws Throwable
    {
        // When
        try ( Neo4j server = createServer( MyFunctionsUsingMyCoreAPI.class ).build() )
        {
            HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                    quotedJson( "{ 'statements': [ { 'statement': 'CREATE (), (), ()' } ] }" ) );

            // Then
            assertQueryGetsValue( server, "RETURN my.countNodes() AS value", 3L );
            assertQueryGetsError( server, "RETURN my.willFail() AS value",
                                  createNodeWithLabelsDenied( "", "ongdb", overriddenMode( authDisabled( FULL.name() ), READ.name() ) ) );
        }
    }

    private static void assertQueryGetsValue( Neo4j server, String query, long value ) throws Throwable
    {
        HTTP.Response response = HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                quotedJson( "{ 'statements': [ { 'statement': '" + query + "' } ] }" ) );

        assertEquals( "[]", response.get( "errors" ).toString() );
        JsonNode result = response.get( "results" ).get( 0 );
        assertEquals( "value", result.get( "columns" ).get( 0 ).asText() );
        assertEquals( value, result.get( "data" ).get( 0 ).get( "row" ).get( 0 ).asLong() );
    }

    private static void assertQueryGetsError( Neo4j server, String query, String error ) throws Throwable
    {
        HTTP.Response response = HTTP.POST( server.httpURI().resolve( "db/ongdb/tx/commit" ).toString(),
                quotedJson( "{ 'statements': [ { 'statement': '" + query + "' } ] }" ) );

        assertThat( response.get( "errors" ).toString() ).contains( error );
    }
}
