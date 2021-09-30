package io.github.onograph.dbms;

import static org.mockito.Mockito.mock;

import java.io.Closeable;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;

class ReconcilerFlowManagerClusterImplTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    new ReconcilerFlowManagerClusterImpl(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null));
  }

  @Test
  void test_enedydbexStateChange() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new ReconcilerFlowManagerClusterImpl(null,
        new HealthMonitorService(_fFileSystemAbstraction, _logProvider, new LocalMemoryTracker(),
            null)))
        ._enedydbexStateChange();
  }
}

