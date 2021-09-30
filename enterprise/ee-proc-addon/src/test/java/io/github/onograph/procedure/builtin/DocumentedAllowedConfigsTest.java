package io.github.onograph.procedure.builtin;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;

class DocumentedAllowedConfigsTest {

  @Test
  void testConstructor() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        new ArrayList<Object>());
    new DocumentedAllowedConfigs(config);
  }

  @Test
  void testConstructor2() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(null);
    new DocumentedAllowedConfigs(config);
  }

  @Test
  void testConstructor3() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(new CopyOnWriteArrayList<Object>(new Object[]{"42", "42", "42"}));
    new DocumentedAllowedConfigs(config);
  }

  @Test
  void testConstructor4() {

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(new CopyOnWriteArrayList<Object>(new Object[]{"*", "42", "42"}));
    new DocumentedAllowedConfigs(config);
  }
}

