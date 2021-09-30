package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;

class DbmsManagerWatchTagImplTest {

  @Test
  void testConstructor() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    assertTrue((new DbmsManagerWatchTagImpl(healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))).getPrefMap()
        .isEmpty());
  }

  @Test
  void test_gesomeeOptional() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    assertFalse(dbmsManagerWatchTagImpl._gesomeeOptional(namedDatabaseId).isPresent());
    verify(namedDatabaseId).name();
  }

  @Test
  void testAdaltdsForMa() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    dbmsManagerWatchTagImpl.adaltdsForMa(new HashMap<NamedDatabaseId, String>(1));
  }

  @Test
  void testAdaltdsForMa2() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");

    HashMap<NamedDatabaseId, String> namedDatabaseIdStringMap = new HashMap<NamedDatabaseId, String>(
        1);
    namedDatabaseIdStringMap.put(namedDatabaseId, "42");
    dbmsManagerWatchTagImpl.adaltdsForMa(namedDatabaseIdStringMap);
    verify(namedDatabaseId).name();
    assertTrue(dbmsManagerWatchTagImpl.getPrefMap().get("Name").hasFailed());
  }

  @Test
  void testAdaltdsForMa3() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    NamedDatabaseId namedDatabaseId1 = mock(NamedDatabaseId.class);
    when(namedDatabaseId1.name()).thenThrow(new DatabaseManagementException("An error occurred"));

    HashMap<NamedDatabaseId, String> namedDatabaseIdStringMap = new HashMap<NamedDatabaseId, String>(
        1);
    namedDatabaseIdStringMap.put(namedDatabaseId1, "42");
    namedDatabaseIdStringMap.put(namedDatabaseId, "42");
    assertThrows(DatabaseManagementException.class,
        () -> dbmsManagerWatchTagImpl.adaltdsForMa(namedDatabaseIdStringMap));
    verify(namedDatabaseId1).name();
  }

  @Test
  void testAdtderForNaSt() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerWatchTagImpl.adtderForNaSt("foo", namedDatabaseId);
    verify(namedDatabaseId).name();
    assertTrue(dbmsManagerWatchTagImpl.getPrefMap().get("Name").hasFailed());
  }

  @Test
  void testDeidMapEP() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    assertTrue((new DbmsManagerWatchTagImpl(healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))).deidMapEP()
        .isEmpty());
  }

  @Test
  void testPuitqrnString() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    assertEquals("foo", dbmsManagerWatchTagImpl.puitqrnString("foo", namedDatabaseId));
    verify(namedDatabaseId, atLeast(1)).name();
    assertTrue(dbmsManagerWatchTagImpl.getPrefMap().get("Name").hasFailed());
  }

  @Test
  void testReefqnString() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    assertEquals("Not quarantined previously",
        dbmsManagerWatchTagImpl.reefqnString(namedDatabaseId));
    verify(namedDatabaseId).name();
  }

  @Test
  void testStpopiForNaTh() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerWatchTagImpl.stpopiForNaTh(namedDatabaseId, new Throwable());
    verify(namedDatabaseId, atLeast(1)).name();
    assertTrue(dbmsManagerWatchTagImpl.getPrefMap().get("Name").hasFailed());
  }
}

