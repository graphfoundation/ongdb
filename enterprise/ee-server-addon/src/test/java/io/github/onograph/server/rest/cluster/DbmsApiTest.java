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
import org.neo4j.dbms.database.DatabaseManagementServiceImpl;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.time.Clocks;

class DbmsApiTest {

  @Test
  void testConstructor() {

    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    new DbmsApi(new DatabaseManagementServiceImpl(null, globalAvailabilityGuard, globalLife,
        databaseEventListeners,
        transactionEventListeners, new BufferingLog(), mock(Config.class)));
  }

  @Test
  void testAbudmcspaString() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    String actualAbudmcspaStringResult = DbmsApi.abudmcspaString(config);
    assertEquals(String.join("",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString()
                .concat(File.separator), "cluster"),
        actualAbudmcspaStringResult);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testAbudmcspaString2() throws URISyntaxException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        new URI("Scheme", "Ssp", "Fragment"));
    assertEquals("null/cluster", DbmsApi.abudmcspaString(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testAbudmcspaString3() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(Paths
        .get(System.getProperty(
                "io.github.onograph.server.rest.cluster.DbmsApi.abudmcspaString"),
            "test.txt")
        .toUri());

    assertTrue(DbmsApi.abudmcspaString(config).indexOf("/null/test.txt/cluster") != -1);
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDbclrupanPattern() {

    DbmsApi.dbclrupanPattern();
  }
}

