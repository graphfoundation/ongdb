package io.github.onograph.server.security;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class DefaultSecurityLogTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    new DefaultSecurityLog(_config, new DefaultFileSystemAbstraction());
  }

  @Test
  void testConstructor2() {
    assertTrue((new DefaultSecurityLog(new BufferingLog())).isDebugEnabled());
  }
}

