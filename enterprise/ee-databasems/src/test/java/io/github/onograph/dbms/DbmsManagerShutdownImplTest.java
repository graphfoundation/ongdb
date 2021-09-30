package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;

class DbmsManagerShutdownImplTest {

  @Test
  void testConstructor() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    assertTrue((new DbmsManagerShutdownImpl(config)).getPrefMap().isEmpty());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(1);
    assertTrue((new DbmsManagerShutdownImpl(config)).getPrefMap().isEmpty());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

