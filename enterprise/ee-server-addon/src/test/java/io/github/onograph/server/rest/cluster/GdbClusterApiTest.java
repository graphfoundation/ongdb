package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.CommunityDatabaseStateService;
import org.neo4j.dbms.database.DatabaseManagementServiceImpl;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.server.http.cypher.format.output.json.StreamingJsonFormat;
import org.neo4j.server.rest.repr.OutputFormat;
import org.neo4j.time.Clocks;

class GdbClusterApiTest {

  @Test
  void testConstructor() {

    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    DatabaseManagementServiceImpl _databaseManagementService = new DatabaseManagementServiceImpl(
        null,
        globalAvailabilityGuard, globalLife,
        databaseEventListeners, transactionEventListeners,
        new BufferingLog(),
        mock(Config.class));

    CommunityDatabaseStateService _databaseStateService = new CommunityDatabaseStateService(null);
    new GdbClusterApi(_databaseManagementService, _databaseStateService, "Gdb Name",
        new OutputFormat(
            new StreamingJsonFormat(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }

  @Test
  void testConstructor2() {

    DatabaseManager<?> databaseManager = (DatabaseManager<?>) mock(DatabaseManager.class);
    //when( databaseManager.getDatabaseContext( (String) any() ) ).thenReturn( Optional.<?>of( "Value" ) );
    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    DatabaseManagementServiceImpl _databaseManagementService = new DatabaseManagementServiceImpl(
        databaseManager,
        globalAvailabilityGuard, globalLife,
        databaseEventListeners, transactionEventListeners,
        new BufferingLog(),
        mock(Config.class));

    CommunityDatabaseStateService _databaseStateService = new CommunityDatabaseStateService(null);
    new GdbClusterApi(_databaseManagementService, _databaseStateService, "Gdb Name",
        new OutputFormat(
            new StreamingJsonFormat(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }

  @Test
  void testConstructor3() {

    DatabaseManager<?> databaseManager = (DatabaseManager<?>) mock(DatabaseManager.class);
    //when( databaseManager.getDatabaseContext( (String) any() ) ).thenReturn( Optional.<?>empty() );
    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    DatabaseManagementServiceImpl _databaseManagementService = new DatabaseManagementServiceImpl(
        databaseManager,
        globalAvailabilityGuard, globalLife,
        databaseEventListeners, transactionEventListeners,
        new BufferingLog(),
        mock(Config.class));

    CommunityDatabaseStateService _databaseStateService = new CommunityDatabaseStateService(null);
    new GdbClusterApi(_databaseManagementService, _databaseStateService, "Gdb Name",
        new OutputFormat(
            new StreamingJsonFormat(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }

  @Test
  void testAbudtectptString() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    String actualAbudtectptStringResult = GdbClusterApi.abudtectptString(config);
    assertEquals(
        String.join("", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString()
                .concat(File.separator),
            "{databaseName}/cluster"),
        actualAbudtectptStringResult);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testAbudtectptString2() throws URISyntaxException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        new URI("Scheme", "Ssp", "Fragment"));
    assertEquals("null/{databaseName}/cluster", GdbClusterApi.abudtectptString(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testAbudtectptString3() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        Paths
            .get(System.getProperty(
                    "io.github.onograph.server.rest.cluster.GdbClusterApi.abudtectptString"),
                "test.txt")
            .toUri());
    assertTrue(
        GdbClusterApi.abudtectptString(config).indexOf("/null/test.txt/{databaseName}/cluster")
            != -1);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaacuuptPattern() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    GdbClusterApi.daacuuptPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaacuuptPattern2() throws URISyntaxException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        new URI("Scheme", "Ssp", "Fragment"));
    GdbClusterApi.daacuuptPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaacuuptPattern3() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        Paths.get(
                System.getProperty("io.github.onograph.server.rest.cluster.GdbClusterApi.compile"),
                "test.txt")
            .toUri());
    GdbClusterApi.daacuuptPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

