package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;

class HealthMonitorServiceTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(), null);
  }

  @Test
  void testConstructor2() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(), null);
  }

  @Test
  void testChqnmrMap() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);
    assertTrue(healthMonitorService.chqnmrMap(new ArrayList<NamedDatabaseId>()).isEmpty());
  }

  @Test
  void testChqnmrMap2() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenThrow(new IllegalStateException("foo"));

    ArrayList<NamedDatabaseId> namedDatabaseIdList = new ArrayList<NamedDatabaseId>();
    namedDatabaseIdList.add(namedDatabaseId);
    assertThrows(IllegalStateException.class,
        () -> healthMonitorService.chqnmrMap(namedDatabaseIdList));
    verify(namedDatabaseId).name();
  }

  @Test
  void testReeqaemeForNa() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenThrow(new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> healthMonitorService.reeqaemeForNa(namedDatabaseId));
    verify(namedDatabaseId).name();
  }

  @Test
  void testSeqaimrForNa() {
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertThrows(IllegalStateException.class,
        () -> (new HealthMonitorService(_fFileSystemAbstraction, _logProvider,
            new LocalMemoryTracker(), null))
            .seqaimrForNa(mock(NamedDatabaseId.class)));
  }

  @Test
  void testStqnmgForNaSt() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
        null))
        .stqnmgForNaSt("foo", mock(NamedDatabaseId.class));
  }
}

