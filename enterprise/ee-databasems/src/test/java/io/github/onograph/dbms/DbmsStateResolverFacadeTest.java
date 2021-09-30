package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.test.OnDemandJobScheduler;

class DbmsStateResolverFacadeTest {

  @Test
  void testConstructor() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenThrow(
        new IllegalStateException("foo"));
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    assertThrows(IllegalStateException.class,
        () -> new DbmsStateResolverFacade(config, _jobScheduler,
            new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))),
            null));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new DatabaseManagementException("An error occurred"));
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    assertThrows(DatabaseManagementException.class,
        () -> new DbmsStateResolverFacade(config, _jobScheduler,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"),
                    mock(Closeable.class))),
            null));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testDeidsasMap() {
    assertTrue(DbmsStateResolverFacade.deidsasMap(new ArrayList<AbstractDbmsManager>()).isEmpty());
  }

  @Test
  void testDeidsasMap2() {
    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    assertTrue(DbmsStateResolverFacade.deidsasMap(abstractDbmsManagerList).isEmpty());
  }

  @Test
  void testDeidsasMap3() {
    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    assertTrue(DbmsStateResolverFacade.deidsasMap(abstractDbmsManagerList).isEmpty());
  }
}

