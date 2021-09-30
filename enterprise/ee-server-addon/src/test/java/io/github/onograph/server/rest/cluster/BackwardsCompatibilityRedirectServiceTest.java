package io.github.onograph.server.rest.cluster;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
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

class BackwardsCompatibilityRedirectServiceTest {

  @Test
  void testConstructor() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
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

    OutputFormat _outputFormat = new OutputFormat(new StreamingJsonFormat(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    new BackwardsCompatibilityRedirectService(config, _databaseManagementService, _outputFormat,
        new CommunityDatabaseStateService(null));
  }

  @Test
  void testConstructor2() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
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

    OutputFormat _outputFormat = new OutputFormat(new StreamingJsonFormat(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    new BackwardsCompatibilityRedirectService(config, _databaseManagementService, _outputFormat,
        new CommunityDatabaseStateService(null));
  }

  @Test
  void testConstructor3() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
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

    OutputFormat _outputFormat = new OutputFormat(new StreamingJsonFormat(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    new BackwardsCompatibilityRedirectService(config, _databaseManagementService, _outputFormat,
        new CommunityDatabaseStateService(null));
  }

  @Test
  void testDaalgclrupanPattern() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    BackwardsCompatibilityRedirectService.daalgclrupanPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaalgclrupanPattern2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        URI.create("Str"));
    BackwardsCompatibilityRedirectService.daalgclrupanPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaalgclrupanPattern3() throws URISyntaxException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        new URI("Scheme", "Ssp", "Fragment"));
    BackwardsCompatibilityRedirectService.daalgclrupanPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDaalgclrupanPattern4() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(
            Paths
                .get(
                    System.getProperty(
                        "io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService.compile"),
                    "test.txt")
                .toUri());
    BackwardsCompatibilityRedirectService.daalgclrupanPattern(config);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

