/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.pushtocloud;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;
import org.mockito.InOrder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.commandline.admin.CommandFailed;
import org.neo4j.commandline.admin.IncorrectUsage;
import org.neo4j.commandline.admin.OutsideWorld;
import org.neo4j.commandline.arguments.common.Database;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.pushtocloud.PushToCloudCommand.Copier;
import org.neo4j.pushtocloud.PushToCloudCommand.DumpCreator;
import org.neo4j.test.TestGraphDatabaseFactory;
import org.neo4j.test.rule.TestDirectory;

import static java.lang.String.format;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.helpers.collection.Iterators.array;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_BOLT_URI;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_DATABASE;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_DUMP;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_DUMP_TO;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_OVERWRITE;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_PASSWORD;
import static org.neo4j.pushtocloud.PushToCloudCommand.ARG_USERNAME;

public class PushToCloudCommandTest
{
    private static final String SOME_EXAMPLE_BOLT_URI = "bolt+routing://database_id.databases.ongdb.com";
    private static final String TEST_DB = "test-db";

    @Rule
    public final TestDirectory directory = TestDirectory.testDirectory();
    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    private Path dump;

    @Before
    public void setUp() throws CommandFailed, IncorrectUsage
    {
        Path configDir = directory.directory( "conf" ).toPath();
        TestGraphDatabaseFactory graphDatabaseFactory = new TestGraphDatabaseFactory()
                .setFileSystem( directory.getFileSystem() );
        // Make two databases so we can test the impact of the --database flag on non-default names
        for ( String database : new String[]{TEST_DB, new Database().defaultValue()} )
        {
            File dbDir = directory.directory().toPath().resolve( "data" ).resolve( "databases" ).resolve( database ).toFile();
            GraphDatabaseService db = graphDatabaseFactory.newImpermanentDatabaseBuilder( dbDir ).newGraphDatabase();
            db.shutdown();
        }

        dump = directory.file( "some-archive.dump" ).toPath();
        ControlledOutsideWorld outsideWorld = new ControlledOutsideWorld( directory.getFileSystem() );
        new RealDumpCreator( directory.directory().toPath(), configDir, outsideWorld ).dumpDatabase( TEST_DB, dump );
    }

    @Test
    public void shouldReadUsernameAndPasswordFromUserInput() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        String username = "ongdb";
        char[] password = {'a', 'b', 'c'};
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPromptResponse( username )
                .withPasswordResponse( password );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        // then
        verify( targetCommunicator ).authenticate( anyBoolean(), any(), eq( username ), eq( password ), anyBoolean() );
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), any(), eq( false ), any() );
    }

    @Test
    public void shouldAcceptConfirmationViaCommandLine() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        String username = "ongdb";
        char[] password = {'a', 'b', 'c'};
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPromptResponse( username )
                .withPasswordResponse( password );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ),
                arg( ARG_OVERWRITE, "true" ) ) );

        // then
        verify( targetCommunicator ).authenticate( anyBoolean(), any(), eq( username ), eq( password ), eq( true  ) );
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), any(), eq( false ), any() );
    }

    @Test
    public void shouldAcceptEmptyConfirmationViaCommandLine() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        String username = "ongdb";
        char[] password = {'a', 'b', 'c'};
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPromptResponse( username )
                .withPasswordResponse( password );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ),
                format( "--%s", ARG_OVERWRITE ) ) ); // add --overwrite

        // then
        verify( targetCommunicator ).authenticate( anyBoolean(), any(), eq( username ), eq( password ), eq( true  ) );
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), any(), eq( false ), any() );
    }

    @Test
    public void shouldAcceptDumpAsSource() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        PushToCloudCommand command = command().copier( targetCommunicator ).build();

        // when
        PushToCloudCommand.Uploader uploader = command.makeDumpUploader( dump.toFile() );
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        // then
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), eq( uploader.source ), eq( false ), any() );
    }

    @Test
    public void shouldAcceptDatabaseNameAsSource() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        DumpCreator dumpCreator = mockedDumpCreator();
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .dumpCreator( dumpCreator )
                .build();

        // when
        String databaseName = TEST_DB;
        command.execute( array(
                arg( ARG_DATABASE, databaseName ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        // then
        verify( dumpCreator ).dumpDatabase( eq( databaseName ), any() );
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), any(), eq( true ), any() );
    }

    @Test
    public void shouldAcceptDatabaseNameAsSourceUsingGivenDumpTarget() throws Exception
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        DumpCreator dumpCreator = mockedDumpCreator();
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .dumpCreator( dumpCreator )
                .build();

        // when
        String databaseName = TEST_DB;
        Path dumpFile = directory.file( "some-dump-file" ).toPath();
        command.execute( array(
                arg( ARG_DATABASE, databaseName ),
                arg( ARG_DUMP_TO, dumpFile.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        // then
        verify( dumpCreator ).dumpDatabase( databaseName, dumpFile );
        verify( targetCommunicator ).copy( anyBoolean(), any(), any(), any(), eq( true ), any() );
    }

    @Test
    public void shouldFailOnDatabaseNameAsSourceUsingExistingDumpTarget() throws IOException, IncorrectUsage, CommandFailed
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        DumpCreator dumpCreator = mockedDumpCreator();
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .dumpCreator( dumpCreator )
                .build();

        // when
        Path dumpFile = directory.file( "some-dump-file" ).toPath();
        Files.write( dumpFile, "some data".getBytes() );
        try
        {
            command.execute( array(
                    arg( ARG_DATABASE, TEST_DB ),
                    arg( ARG_DUMP_TO, dumpFile.toString() ),
                    arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );
            fail( "Should have failed" );
        }
        catch ( CommandFailed commandFailed )
        {
            // then
            assertThat( commandFailed.getMessage(), containsString( "already exists" ) );
        }
    }

    @Test
    public void shouldNotAcceptBothDumpAndDatabaseNameAsSource() throws IOException, CommandFailed
    {
        // given
        PushToCloudCommand command = command().copier( mockedTargetCommunicator() ).build();

        // when
        try
        {
            command.execute( array(
                    arg( ARG_DUMP, directory.file( "some-dump-file" ).toPath().toString() ),
                    arg( ARG_DATABASE, "ongdb" ),
                    arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );
            fail( "Should have failed" );
        }
        catch ( IncorrectUsage incorrectUsage )
        {
            // then good
        }
    }

    @Test
    public void shouldAcceptPasswordViaArgAndEnvAndPromptForUsername() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        String username = "ongdb";
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPromptResponse( username );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when

        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_PASSWORD, "pass" ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        environmentVariables.set("ONGDB_USERNAME", null);
        environmentVariables.set("ONGDB_PASSWORD", "pass");
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

    }

    @Test
    public void shouldAcceptUsernameViaArgAndEnvAndPromptForPassword() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        char[] password = {'a', 'b', 'c'};
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPasswordResponse( password );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_USERNAME, "user" ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        assertTrue( dump.toFile().exists() );

        environmentVariables.set("ONGDB_USERNAME", "ongdb");
        environmentVariables.set("ONGDB_PASSWORD", null);
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        assertTrue( dump.toFile().exists() );

    }

    @Test
    public void shouldAcceptOnlyUsernameAndPasswordFromEnvAndCli() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier targetCommunicator = mockedTargetCommunicator();
        String username = "ongdb";
        char[] password = {'a', 'b', 'c'};
        OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() )
                .withPromptResponse( username )
                .withPasswordResponse( password );
        PushToCloudCommand command = command()
                .copier( targetCommunicator )
                .outsideWorld( outsideWorld )
                .build();

        // when
        environmentVariables.set("ONGDB_USERNAME", "ongdbenv");
        environmentVariables.set("ONGDB_PASSWORD", "passenv");
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_USERNAME, "ongdbcli" ),
                arg( ARG_PASSWORD, "passcli" ),
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        verify( targetCommunicator ).authenticate( anyBoolean(), anyString(), eq( "ongdbcli" ), eq( "passcli".toCharArray() ), anyBoolean() );
    }

    @Test
    public void shouldChooseToDumpDefaultDatabaseIfNeitherDumpNorDatabaseIsGiven() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        DumpCreator dumpCreator = mockedDumpCreator();
        Copier copier = mock( Copier.class );
        PushToCloudCommand command = command().dumpCreator( dumpCreator ).copier( copier ).build();

        // when
        command.execute( array(
                arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );

        // then
        String defaultDatabase = new Database().defaultValue();
        verify( dumpCreator ).dumpDatabase( eq( defaultDatabase ), any() );
        verify( copier ).copy( anyBoolean(), any(), any(), any(), eq( true ), any() );
    }

    @Test
    public void shouldFailOnDumpPointingToMissingFile() throws IOException, IncorrectUsage, CommandFailed
    {
        // given
        PushToCloudCommand command = command().copier( mockedTargetCommunicator() ).build();

        // when
        try
        {
            File dumpFile = directory.file( "some-dump-file" );
            command.execute( array(
                    arg( ARG_DUMP, dumpFile.getAbsolutePath() ),
                    arg( ARG_BOLT_URI, SOME_EXAMPLE_BOLT_URI ) ) );
            fail( "Should have failed" );
        }
        catch ( CommandFailed commandFailed )
        {
            // then good
        }
    }

    // TODO: 2019-08-07 shouldFailOnDumpPointingToInvalidDumpFile

    @Test
    public void shouldRecognizeBothEnvironmentAndDatabaseIdFromBoltURI() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier copier = mock( Copier.class );
        PushToCloudCommand command = command().copier( copier ).build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, "bolt+routing://mydbid-testenvironment.databases.ongdb.com" ) ) );

        // then
        verify( copier ).copy( anyBoolean(), eq( "https://console-testenvironment.ongdb.com/v1/databases/mydbid" ),
                eq( "bolt+routing://mydbid-testenvironment.databases.ongdb.com" ), any(), eq( false ), any() );
    }

    @Test
    public void shouldRecognizeDatabaseIdFromBoltURI() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier copier = mock( Copier.class );
        PushToCloudCommand command = command().copier( copier ).build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, "bolt+routing://mydbid.databases.ongdb.com" ) ) );

        // then
        verify( copier ).copy( anyBoolean(), eq( "https://console.ongdb.com/v1/databases/mydbid" ),
                eq( "bolt+routing://mydbid.databases.ongdb.com" ), any(), eq( false ), any() );
    }

    @Test
    public void shouldRecognizeDatabaseIdFromNeo4jBoltURI() throws IOException, CommandFailed, IncorrectUsage
    {
        // given
        Copier copier = mock( Copier.class );
        PushToCloudCommand command = command().copier( copier ).build();

        // when
        command.execute( array(
                arg( ARG_DUMP, dump.toString() ),
                arg( ARG_BOLT_URI, "neo4j://mydbid.databases.ongdb.com" ) ) );

        // then
        verify( copier ).copy( anyBoolean(), eq( "https://console.ongdb.com/v1/databases/mydbid" ),
                eq( "neo4j://mydbid.databases.ongdb.com" ), any(), eq( false ), any() );
    }

    @Test
    public void shouldAuthenticateBeforeDumping() throws CommandFailed, IOException, IncorrectUsage
    {
        // given
        Copier copier = mockedTargetCommunicator();
        DumpCreator dumper = mockedDumpCreator();
        PushToCloudCommand command = command().copier( copier ).dumpCreator( dumper ).build();

        // when
        command.execute( array( arg( ARG_BOLT_URI, "bolt+routing://mydbid.databases.ongdb.com" ) ) );

        // then
        InOrder inOrder = inOrder( copier, dumper );
        inOrder.verify( copier ).authenticate( anyBoolean(), anyString(), anyString(), any(), eq( false ) );
        inOrder.verify( dumper ).dumpDatabase( anyString(), any() );
        inOrder.verify( copier ).copy( anyBoolean(), anyString(), eq( "bolt+routing://mydbid.databases.ongdb.com" ), any(),
                eq( true ), anyString() );
    }

    private DumpCreator mockedDumpCreator()
    {
        try
        {
            DumpCreator dumpCreator = mock( DumpCreator.class );
            when( dumpCreator.dumpDatabase( anyString(), any() ) ).thenReturn( dump.toFile() );
            return dumpCreator;
        }
        catch ( Exception e )
        {
            throw new RuntimeException( "Cannot mock the DumpCreator: " + e.getMessage(), e );
        }
    }

    private Copier mockedTargetCommunicator() throws CommandFailed
    {
        Copier copier = mock( Copier.class );
        when( copier.authenticate( anyBoolean(), any(), any(), any(), anyBoolean() ) ).thenReturn( "abc" );
        return copier;
    }

    private String arg( String key, String value )
    {
        return format( "--%s=%s", key, value );
    }

    private Builder command()
    {
        return new Builder();
    }

    private class Builder
    {
        private final Path homeDir = directory.directory().toPath();
        private final Path configDir = directory.directory( "conf" ).toPath();
        private OutsideWorld outsideWorld = new ControlledOutsideWorld( new DefaultFileSystemAbstraction() );
        private DumpCreator dumpCreator = mockedDumpCreator();
        private Copier targetCommunicator;
        private final Map<Setting<?>,String> settings = new HashMap<>();

        Builder config( Setting<?> setting, String value )
        {
            settings.put( setting, value );
            return this;
        }

        Builder copier( Copier targetCommunicator )
        {
            this.targetCommunicator = targetCommunicator;
            return this;
        }

        Builder outsideWorld( OutsideWorld outsideWorld )
        {
            this.outsideWorld = outsideWorld;
            return this;
        }

        Builder dumpCreator( DumpCreator dumpCreator )
        {
            this.dumpCreator = dumpCreator;
            return this;
        }

        PushToCloudCommand build() throws IOException
        {
            return new PushToCloudCommand( homeDir, buildConfig(), outsideWorld, targetCommunicator, dumpCreator );
        }

        private Path buildConfig() throws IOException
        {
            StringBuilder configFileContents = new StringBuilder();
            settings.forEach( ( key, value ) -> configFileContents.append( format( "%s=%s%n", key.name(), value ) ) );
            Path configFile = configDir.resolve( "ongdb.conf" );
            Files.write( configFile, configFileContents.toString().getBytes() );
            return configFile.getParent();
        }
    }
}
