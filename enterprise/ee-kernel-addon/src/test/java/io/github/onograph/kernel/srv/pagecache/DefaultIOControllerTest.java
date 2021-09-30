package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.ObjLongConsumer;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;

class DefaultIOControllerTest {

  @Test
  void testConstructor() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    assertEquals(0L,
        (new DefaultIOController(config, (ObjLongConsumer<Object>) mock(ObjLongConsumer.class),
            null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(1);
    assertEquals(0L,
        (new DefaultIOController(config, (ObjLongConsumer<Object>) mock(ObjLongConsumer.class),
            null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor3() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(null);
    assertEquals(0L,
        (new DefaultIOController(config, (ObjLongConsumer<Object>) mock(ObjLongConsumer.class),
            null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor4() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    assertEquals(0L, (new DefaultIOController(config, null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor5() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(1);
    assertEquals(0L, (new DefaultIOController(config, null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor6() {
    Config config = mock(Config.class);
    doNothing().when(config)
        .addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
            (org.neo4j.configuration.SettingChangeListener<Object>) any());
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(null);
    assertEquals(0L, (new DefaultIOController(config, null)).geeeaio());
    verify(config).addListener((org.neo4j.graphdb.config.Setting<Object>) any(),
        (org.neo4j.configuration.SettingChangeListener<Object>) any());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

