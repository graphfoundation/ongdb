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
package org.neo4j.server;

import org.apache.commons.lang3.ArrayUtils;
import org.bouncycastle.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.BootloaderSettings;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.connectors.HttpsConnector;
import org.neo4j.configuration.ssl.SslPolicyConfig;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.conditions.Conditions;
import org.neo4j.test.server.ExclusiveWebContainerTestBase;
import org.neo4j.test.ssl.SelfSignedCertificateFactory;

import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.forced_kernel_id;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.data_directory;
import static org.neo4j.configuration.GraphDatabaseSettings.log_queries_rotation_threshold;
import static org.neo4j.configuration.GraphDatabaseSettings.logs_directory;
import static org.neo4j.configuration.SettingValueParsers.FALSE;
import static org.neo4j.internal.helpers.collection.Iterators.single;
import static org.neo4j.internal.helpers.collection.MapUtil.store;
import static org.neo4j.internal.helpers.collection.MapUtil.stringMap;
import static org.neo4j.server.WebContainerTestUtils.getDefaultRelativeProperties;
import static org.neo4j.server.WebContainerTestUtils.verifyConnector;
import static org.neo4j.test.assertion.Assert.assertEventually;


public abstract class BaseBootstrapperIT extends ExclusiveWebContainerTestBase
{
    protected NeoBootstrapper bootstrapper;

    @BeforeEach
    void before()
    {
        bootstrapper = newBootstrapper();
        SelfSignedCertificateFactory.create( testDirectory.homePath() );
    }

    @AfterEach
    void after()
    {
        if ( bootstrapper != null )
        {
            bootstrapper.stop();
        }
    }

    protected abstract NeoBootstrapper newBootstrapper();

    @Test
    void shouldStartStopNeoServerWithoutAnyConfigFiles()
    {
        // When
        int resultCode = NeoBootstrapper.start( bootstrapper, withConnectorsOnRandomPortsConfig( getAdditionalArguments() ) );

        // Then
        assertEquals( NeoBootstrapper.OK, resultCode );
        assertEventually( "Server was not started", bootstrapper::isRunning, Conditions.TRUE, 1, TimeUnit.MINUTES );
    }

    protected String[] getAdditionalArguments()
    {
        return new String[]{"--home-dir", testDirectory.directory( "home-dir" ).toAbsolutePath().toString(),
                "-c", configOption( data_directory, testDirectory.absolutePath().toString() ),
                "-c", configOption( logs_directory, testDirectory.absolutePath().toString() )};
    }

    @Test
    void canSpecifyConfigFile() throws Throwable
    {
        // Given
        Path configFile = testDirectory.file( Config.DEFAULT_CONFIG_FILE_NAME );

        Map<String,String> properties = stringMap( forced_kernel_id.name(), "ourcustomvalue" );
        properties.putAll( getDefaultRelativeProperties( testDirectory.homePath() ) );
        properties.putAll( connectorsOnRandomPortsConfig() );

        store( properties, configFile );

        // When
        NeoBootstrapper.start( bootstrapper,
                "--home-dir", testDirectory.directory( "home-dir" ).toAbsolutePath().toString(),
                "--config-dir", configFile.getParent().toAbsolutePath().toString() );

        // Then
        var dependencyResolver = getDependencyResolver();
        assertThat( dependencyResolver.resolveDependency( Config.class ).get( forced_kernel_id ) ).isEqualTo( "ourcustomvalue" );
    }

    @Test
    void canOverrideConfigValues() throws Throwable
    {
        // Given
        Path configFile = testDirectory.file( Config.DEFAULT_CONFIG_FILE_NAME );

        Map<String,String> properties = stringMap( forced_kernel_id.name(), "thisshouldnotshowup" );
        properties.putAll( getDefaultRelativeProperties( testDirectory.homePath() ) );
        properties.putAll( connectorsOnRandomPortsConfig() );

        store( properties, configFile );

        // When
        NeoBootstrapper.start( bootstrapper,
                "--home-dir", testDirectory.directory( "home-dir" ).toAbsolutePath().toString(),
                "--config-dir", configFile.getParent().toAbsolutePath().toString(),
                "-c", configOption( forced_kernel_id, "mycustomvalue" ) );

        // Then
        var dependencyResolver = getDependencyResolver();
        assertThat( dependencyResolver.resolveDependency( Config.class ).get( forced_kernel_id ) ).isEqualTo( "mycustomvalue" );
    }

    @Test
    void shouldStartWithHttpHttpsAndBoltDisabled()
    {
        testStartupWithConnectors( false, false, false );
    }

    @Test
    void shouldStartWithHttpEnabledAndHttpsBoltDisabled()
    {
        testStartupWithConnectors( true, false, false );
    }

    @Test
    void shouldStartWithHttpsEnabledAndHttpBoltDisabled()
    {
        testStartupWithConnectors( false, true, false );
    }

    @Test
    void shouldStartWithBoltEnabledAndHttpHttpsDisabled()
    {
        testStartupWithConnectors( false, false, true );
    }

    @Test
    void shouldStartWithHttpHttpsEnabledAndBoltDisabled()
    {
        testStartupWithConnectors( true, true, false );
    }

    @Test
    void shouldStartWithHttpBoltEnabledAndHttpsDisabled()
    {
        testStartupWithConnectors( true, false, true );
    }

    @Test
    void shouldStartWithHttpsBoltEnabledAndHttpDisabled()
    {
        testStartupWithConnectors( false, true, true );
    }

    @Test
    void shouldHaveSameLayoutAsEmbedded()
    {
        Path serverDir = testDirectory.directory( "server-dir" );
        NeoBootstrapper.start( bootstrapper, withConnectorsOnRandomPortsConfig( "--home-dir", serverDir.toAbsolutePath().toString() ) );
        assertEventually( "Server was not started", bootstrapper::isRunning, Conditions.TRUE, 1, TimeUnit.MINUTES );
        var databaseAPI = (GraphDatabaseAPI) bootstrapper.getDatabaseManagementService().database( DEFAULT_DATABASE_NAME );
        var serverLayout = databaseAPI.databaseLayout().getNeo4jLayout();
        bootstrapper.stop();

        Path embeddedDir = testDirectory.directory( "embedded-dir" );
        DatabaseManagementService dbms = newEmbeddedDbms( embeddedDir );
        Neo4jLayout embeddedLayout = ((GraphDatabaseAPI) dbms.database( DEFAULT_DATABASE_NAME )).databaseLayout().getNeo4jLayout();
        dbms.shutdown();

        assertEquals( serverDir.relativize( serverLayout.homeDirectory() ), embeddedDir.relativize( embeddedLayout.homeDirectory() ) );
        assertEquals( serverDir.relativize( serverLayout.databasesDirectory() ), embeddedDir.relativize( embeddedLayout.databasesDirectory() ) );
        assertEquals( serverDir.relativize( serverLayout.transactionLogsRootDirectory() ),
                embeddedDir.relativize( embeddedLayout.transactionLogsRootDirectory() ) );
    }

    @Test
    void shouldOnlyAllowCommandExpansionWhenProvidedAsArgument()
    {
        //Given
        String setting = String.format( "%s=$(%s 100 * 1000)", log_queries_rotation_threshold.name(), IS_OS_WINDOWS ? "cmd.exe /c set /a" : "expr" );
        String[] args = withConnectorsOnRandomPortsConfig( "--home-dir", testDirectory.homePath().toString(), "-c", setting );

        //Then
        assertThatThrownBy( () -> NeoBootstrapper.start( bootstrapper, args ) )
                .hasMessageContaining( "is a command, but config is not explicitly told to expand it" );

        //Also then
        NeoBootstrapper.start( bootstrapper, Arrays.append( args, "--expand-commands" ) );

        GraphDatabaseAPI db = (GraphDatabaseAPI) bootstrapper.getDatabaseManagementService().database( DEFAULT_DATABASE_NAME );
        Config config = db.getDependencyResolver().resolveDependency( Config.class );
        assertThat( config.get( log_queries_rotation_threshold ) ).isEqualTo( 100000L );
    }

    @Test
    @DisabledOnOs( OS.WINDOWS )
    void shouldWriteAndDeletePidFile()
    {
        // When
        int resultCode = NeoBootstrapper.start( bootstrapper, "--home-dir", testDirectory.homePath().toString() );

        // Then
        assertEquals( NeoBootstrapper.OK, resultCode );
        assertEventually( "Server was not started", bootstrapper::isRunning, Conditions.TRUE, 1, TimeUnit.MINUTES );
        Path pidFile = getDependencyResolver().resolveDependency( Config.class ).get( BootloaderSettings.pid_file );
        assertTrue( Files.exists( pidFile ) );

        //When
        bootstrapper.stop();

        //Then
        assertFalse( Files.exists( pidFile ) );
    }

    protected abstract DatabaseManagementService newEmbeddedDbms( Path homeDir );

    private void testStartupWithConnectors( boolean httpEnabled, boolean httpsEnabled, boolean boltEnabled )
    {
        SslPolicyConfig httpsPolicy = SslPolicyConfig.forScope( SslPolicyScope.HTTPS );
        if ( httpsEnabled )
        {
            //create self signed
            SelfSignedCertificateFactory.create( testDirectory.absolutePath() );
        }

        String[] config = { "-c", httpsEnabled ? configOption( httpsPolicy.enabled, SettingValueParsers.TRUE ) : "",
                "-c", httpsEnabled ? configOption( httpsPolicy.base_directory, testDirectory.absolutePath().toString() ) : "",

                "-c", HttpConnector.enabled.name() + "=" + httpEnabled,
                "-c", HttpConnector.listen_address.name() + "=localhost:0",

                "-c", HttpsConnector.enabled.name() + "=" + httpsEnabled,
                "-c", HttpsConnector.listen_address.name() + "=localhost:0",

                "-c", BoltConnector.enabled.name() + "=" + boltEnabled,
                "-c", BoltConnector.listen_address.name() + "=localhost:0" };
        var allConfigOptions = ArrayUtils.addAll( config, getAdditionalArguments() );
        int resultCode = NeoBootstrapper.start( bootstrapper, allConfigOptions );

        assertEquals( NeoBootstrapper.OK, resultCode );
        assertEventually( "Server was not started", bootstrapper::isRunning, Conditions.TRUE, 1, TimeUnit.MINUTES );
        assertDbAccessibleAsEmbedded();

        verifyConnector( db(), HttpConnector.NAME, httpEnabled );
        verifyConnector( db(), HttpsConnector.NAME, httpsEnabled );
        verifyConnector( db(), BoltConnector.NAME, boltEnabled );
    }

    protected static String configOption( Setting<?> setting, String value )
    {
        return setting.name() + "=" + value;
    }

    protected static String[] withConnectorsOnRandomPortsConfig( String... otherConfigs )
    {
        Stream<String> configs = Stream.of( otherConfigs );

        Stream<String> connectorsConfig = connectorsOnRandomPortsConfig().entrySet()
                .stream()
                .map( entry -> entry.getKey() + "=" + entry.getValue() )
                .flatMap( config -> Stream.of( "-c", config ) );

        return Stream.concat( configs, connectorsConfig ).toArray( String[]::new );
    }

    protected static Map<String,String> connectorsOnRandomPortsConfig()
    {
        return stringMap(
                HttpConnector.listen_address.name(), "localhost:0",
                HttpConnector.enabled.name(), SettingValueParsers.TRUE,

                HttpsConnector.listen_address.name(), "localhost:0",
                HttpsConnector.enabled.name(), FALSE,

                BoltConnector.listen_address.name(), "localhost:0",
                BoltConnector.encryption_level.name(), "DISABLED",
                BoltConnector.enabled.name(), SettingValueParsers.TRUE
        );
    }

    private void assertDbAccessibleAsEmbedded()
    {
        GraphDatabaseAPI db = db();

        Label label = () -> "Node";
        String propertyKey = "key";
        String propertyValue = "value";

        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode( label ).setProperty( propertyKey, propertyValue );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            Node node = single( tx.findNodes( label ) );
            assertEquals( propertyValue, node.getProperty( propertyKey ) );
            tx.commit();
        }
    }

    private GraphDatabaseAPI db()
    {
        return (GraphDatabaseAPI) bootstrapper.getDatabaseManagementService().database( DEFAULT_DATABASE_NAME );
    }

    private DependencyResolver getDependencyResolver()
    {
        return db().getDependencyResolver();
    }
}
