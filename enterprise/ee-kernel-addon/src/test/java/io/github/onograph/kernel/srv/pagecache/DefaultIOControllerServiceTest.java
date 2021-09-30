package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.time.SystemNanoClock;

class DefaultIOControllerServiceTest {

  @Test
  void testCreateIOController() {
    DefaultIOControllerService defaultIOControllerService = new DefaultIOControllerService();
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    assertEquals(0L,
        ((DefaultIOController) defaultIOControllerService.createIOController(config,
            mock(SystemNanoClock.class)))
            .geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testCreateIOController2() {
    DefaultIOControllerService defaultIOControllerService = new DefaultIOControllerService();
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(1);
    assertEquals(0L,
        ((DefaultIOController) defaultIOControllerService.createIOController(config,
            mock(SystemNanoClock.class)))
            .geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testGetPriority() {
    assertEquals(10, (new DefaultIOControllerService()).getPriority());
  }
}

