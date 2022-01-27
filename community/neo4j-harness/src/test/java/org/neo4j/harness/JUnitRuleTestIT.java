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

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.model.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.harness.extensionpackage.MyUnmanagedExtension;
import org.neo4j.harness.junit.rule.Neo4jRule;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.LogTimeZone;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.SuppressOutput;
import org.neo4j.test.server.HTTP;

import static java.time.ZoneOffset.UTC;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.test.server.HTTP.RawPayload.quotedJson;

public class JUnitRuleTestIT
{
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public Neo4jRule neo4j = new Neo4jRule()
            .withFixture( "CREATE (u:User)" )
            .withConfig( GraphDatabaseSettings.db_timezone, LogTimeZone.SYSTEM )
            .withFixture( graphDatabaseService ->
            {
                try ( Transaction tx = graphDatabaseService.beginTx() )
                {
                    tx.createNode( Label.label( "User" ) );
                    tx.commit();
                }
                return null;
            } )
            .withUnmanagedExtension( "/test", MyUnmanagedExtension.class );

    private final SuppressOutput suppressOutput = SuppressOutput.suppressAll();
    private boolean success;

    @Before
    public void setUp() throws Exception
    {
        suppressOutput.captureVoices();
    }

    @After
    public void tearDown() throws Exception
    {
        suppressOutput.releaseVoices( !success );
    }

    @Test
    public void shouldExtensionWork()
    {
        // Given the rule in the beginning of this class

        // When I run this test

        // Then
        assertThat( HTTP.GET( neo4j.httpURI().resolve( "test/myExtension" ).toString() ).status() ).isEqualTo( 234 );
        success = true;
    }

    @Test
    public void shouldFixturesWork() throws Exception
    {
        // Given the rule in the beginning of this class

        // When I run this test

        // Then
        HTTP.Response response = HTTP.POST( neo4j.httpURI() + "db/neo4j/tx/commit",
                quotedJson( "{'statements':[{'statement':'MATCH (n:User) RETURN n'}]}" ) );

        assertThat( response.get( "results" ).get( 0 ).get( "data" ).size() ).isEqualTo( 2 );
        success = true;
    }

    @Test
    public void shouldGraphDatabaseServiceBeAccessible()
    {
        // Given the rule in the beginning of this class
        // When I run this test

        final GraphDatabaseService graphDatabaseService = neo4j.defaultDatabaseService();
        try ( Transaction transaction = graphDatabaseService.beginTx() )
        {
            // Then
            assertEquals( 2, Iterators.count( transaction.execute( "MATCH (n:User) RETURN n" ) ) );
            transaction.commit();
        }
        success = true;
    }

    @Test
    public void shouldRuleWorkWithExistingDirectory() throws Throwable
    {
        // given a root folder, create /databases/neo4j folders.
        Path oldLayout = folder.newFolder( "old").toPath();
        DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( oldLayout ).build();
        GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );

        try ( Transaction transaction = db.beginTx() )
        {
            transaction.execute( "CREATE ()" );
            transaction.commit();
        }
        finally
        {
            managementService.shutdown();
        }

        // When a rule with an pre-populated graph db directory is used
        Path newLayout = folder.newFolder( "new").toPath();
        final Neo4jRule ruleWithDirectory = new Neo4jRule( newLayout ).copyFrom( oldLayout );
        Statement statement = ruleWithDirectory.apply( new Statement()
        {
            @Override
            public void evaluate()
            {
                // Then the database is not empty
                final GraphDatabaseService graphDatabaseService = ruleWithDirectory.defaultDatabaseService();
                try ( Transaction transaction = graphDatabaseService.beginTx() )
                {
                    try ( Result result = transaction.execute( "MATCH (n) RETURN count(n) AS " + "count" ) )
                    {
                        List<Object> column = Iterators.asList( result.columnAs( "count" ) );
                        assertEquals( 1, column.size() );
                        assertEquals( 1L, column.get( 0 ) );
                    }
                }
            }
        }, null );

        // Then
        statement.evaluate();
        success = true;
    }

    @Test
    public void shouldUseSystemTimeZoneForLogging() throws Exception
    {
        String currentOffset = currentTimeZoneOffsetString();

        assertThat( contentOf( "neo4j.log" ) ).contains( currentOffset );
        assertThat( contentOf( "debug.log" ) ).contains( currentOffset );
        success = true;
    }

    private String contentOf( String file ) throws IOException
    {
        GraphDatabaseAPI api = (GraphDatabaseAPI) neo4j.defaultDatabaseService();
        Config config = api.getDependencyResolver().resolveDependency( Config.class );
        Path homeDir = config.get( GraphDatabaseSettings.neo4j_home );
        return Files.readString( homeDir.resolve( file ) );
    }

    private static String currentTimeZoneOffsetString()
    {
        ZoneOffset offset = OffsetDateTime.now().getOffset();
        return offset.equals( UTC ) ? "+0000" : offset.toString().replace( ":", "" );
    }
}
