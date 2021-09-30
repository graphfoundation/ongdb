package io.github.onograph.server.security.systemgraph;

import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;

class SystemInitFileProcessorTest {

  @Test
  void testConstructor() {

    new SystemInitFileProcessor(new DefaultSecurityLog(new BufferingLog()), mock(Config.class));
  }
}

