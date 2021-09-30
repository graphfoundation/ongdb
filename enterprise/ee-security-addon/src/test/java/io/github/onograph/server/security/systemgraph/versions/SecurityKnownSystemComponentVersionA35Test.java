package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.auth.FileRoleService;
import io.github.onograph.server.security.systemgraph.SystemInitFileProcessor;
import java.io.Closeable;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class SecurityKnownSystemComponentVersionA35Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SystemInitFileProcessor _iscSystemInitFileProcessor = new SystemInitFileProcessor(
        new DefaultSecurityLog(new BufferingLog()), null);

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    SecurityKnownSystemComponentVersionA35 actualSecurityKnownSystemComponentVersionA35 =
        new SecurityKnownSystemComponentVersionA35(
            _abstractSecurityLog, _iscSystemInitFileProcessor,
            new FileRoleService(_fileSystemAbstraction,
                new Log4jLogProvider(
                    new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    assertEquals(0, actualSecurityKnownSystemComponentVersionA35.version);
    assertEquals("Neo4j 3.5", actualSecurityKnownSystemComponentVersionA35.description);
    assertFalse(actualSecurityKnownSystemComponentVersionA35.isCurrent());
  }
}

