package io.github.onograph.backup;

import static org.mockito.Mockito.mock;

import java.io.Closeable;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class RemoteBackupServiceTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _itraLogProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    new RemoteBackupService(_fFileSystemAbstraction, _itraLogProvider, new BufferingLog());
  }
}

