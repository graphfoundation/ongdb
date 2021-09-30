package io.github.onograph.dbms;

import static org.mockito.Mockito.mock;

import java.io.Closeable;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.logging.DuplicatingLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;

class ReconcilerFlowManagerTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    new ReconcilerFlowManager(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null));
  }

  @Test
  void testReeqaeStateChange() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new ReconcilerFlowManager(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null)))
        .reeqaeStateChange();
  }

  @Test
  void testReeqaeStateChange2() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DuplicatingLogProvider _logProvider = new DuplicatingLogProvider(logProvider1,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))));

    (new ReconcilerFlowManager(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null)))
        .reeqaeStateChange();
  }

  @Test
  void testSeqrteStateChange() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new ReconcilerFlowManager(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null)))
        .seqrteStateChange();
  }

  @Test
  void testSeqrteStateChange2() {

    (new ReconcilerFlowManager(null, null)).seqrteStateChange();
  }
}

