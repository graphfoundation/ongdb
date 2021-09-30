package io.github.onograph.fabric;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;

class SystemGraphComponentEnterpriseFabricImplTest {

  @Test
  void testConstructor() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    new SystemGraphComponentEnterpriseFabricImpl(config, null);
  }

  @Test
  void testConstructor2() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    new SystemGraphComponentEnterpriseFabricImpl(config, null);
  }
}

