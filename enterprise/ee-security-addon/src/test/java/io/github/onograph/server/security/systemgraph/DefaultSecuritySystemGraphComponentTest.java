package io.github.onograph.server.security.systemgraph;

import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.auth.FileRoleService;
import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.logging.DuplicatingLog;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.security.auth.FileUserRepository;

class DefaultSecuritySystemGraphComponentTest {

  @Test
  void testConstructor() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    FileUserRepository _radUserRepository = new FileUserRepository(fileSystem, path,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))));

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    new DefaultSecuritySystemGraphComponent(_abstractSecurityLog, null, _radUserRepository,
        new FileRoleService(_fileSystemAbstraction,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testConstructor2() {

    BufferingLog log1 = new BufferingLog();
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(
        new DuplicatingLog(log1, new BufferingLog()));
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    FileUserRepository _radUserRepository = new FileUserRepository(fileSystem, path,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))));

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    new DefaultSecuritySystemGraphComponent(_abstractSecurityLog, null, _radUserRepository,
        new FileRoleService(_fileSystemAbstraction,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

