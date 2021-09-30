package io.github.onograph.dbms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.event.DatabaseEventListenerAdapter;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.graphdb.security.URLAccessRule;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.monitoring.Monitors;

class ClusteringDBMSBuilderTest {

  @Test
  void testAddDatabaseListener() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.addDatabaseListener(new DatabaseEventListenerAdapter()));
  }

  @Test
  void testAddURLAccessRule() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.addURLAccessRule("https://github.io/example",
            mock(URLAccessRule.class)));
  }

  @Test
  void testAugmentConfig() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Config config = mock(Config.class);
    when(config.get(any())).thenThrow(new IllegalArgumentException("foo"));
    doNothing().when(config)
        .addListener(any(),
            any());
    assertThrows(IllegalArgumentException.class, () -> clusteringDBMSBuilder.augmentConfig(config));
    verify(config).addListener(any(),
        any());
    verify(config).get(any());
  }

  @Test
  void testAugmentConfig2() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Config config = mock(Config.class);
    doNothing().when(config).set(any(), any());
    when(config.get(any())).thenReturn(0L);
    doNothing().when(config)
        .addListener(any(),
            any());
    clusteringDBMSBuilder.augmentConfig(config);
    verify(config).addListener(any(),
        any());
    verify(config).get(any());
    verify(config).set(any(), any());
  }

  @Test
  void testAugmentConfig3() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Config config = mock(Config.class);
    doNothing().when(config).set(any(), any());
    when(config.get(any())).thenReturn(2L);
    doNothing().when(config)
        .addListener(any(),
            any());
    clusteringDBMSBuilder.augmentConfig(config);
    verify(config).addListener(any(),
        any());
    verify(config).get(any());
  }

  @Test
  void testBuild() {
    assertThrows(IllegalArgumentException.class,
        () -> (new ClusteringDBMSBuilder(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()))
            .build());
  }

  @Test
  void testConstructor() {
    assertEquals("enterprise",
        (new ClusteringDBMSBuilder(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).getEdition());
  }

  @Test
  void testGetDbmsInfo() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Config config = mock(Config.class);
    when(config.get(any())).thenThrow(new IllegalArgumentException("foo"));
    assertThrows(IllegalArgumentException.class, () -> clusteringDBMSBuilder.getDbmsInfo(config));
    verify(config).get(any());
  }

  @Test
  void testLoadPropertiesFromFile() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.loadPropertiesFromFile(" str Nf"));
  }

  @Test
  void testLoadPropertiesFromFile2() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.loadPropertiesFromFile(""));
  }

  @Test
  void testLoadPropertiesFromFile3() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.loadPropertiesFromFile(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testLoadPropertiesFromFile4() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.loadPropertiesFromFile(
            Paths.get(System.getProperty("Key"), "test.txt")));
  }

  @Test
  void testLoadPropertiesFromFile5() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.loadPropertiesFromFile(
            Paths.get(System.getProperty("java.io.tmpdir"), "More")));
  }

  @Test
  void testLoadPropertiesFromFile6() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.loadPropertiesFromFile(
            Paths.get(System.getProperty("java.io.tmpdir"), "")));
  }

  @Test
  void testLoadPropertiesFromFile7() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.loadPropertiesFromFile((Path) null));
  }

  @Test
  void testNewDatabaseManagementService() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Config config = mock(Config.class);
    when(config.get(any())).thenThrow(new IllegalArgumentException("foo"));
    doNothing().when(config).set(any(), any());
    assertThrows(IllegalArgumentException.class,
        () -> clusteringDBMSBuilder.newDatabaseManagementService(config,
            GraphDatabaseDependencies.newDependencies()));
    verify(config).get(any());
    verify(config).set(any(), any());
  }

  @Test
  void testSetConfig() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.setConfig(new HashMap<Setting<?>, Object>(1)));
  }

  @Test
  void testSetConfig2() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Setting<?> setting = (Setting<?>) mock(Setting.class);
    when(setting.name()).thenReturn("Name");

    HashMap<Setting<?>, Object> settingObjectMap = new HashMap<Setting<?>, Object>(1);
    settingObjectMap.put(setting, "Value");
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setConfig(settingObjectMap));
    verify(setting).name();
  }

  @Test
  void testSetConfig3() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Setting<?> setting = (Setting<?>) mock(Setting.class);
    when(setting.name()).thenReturn("Name");
    Setting<?> setting1 = (Setting<?>) mock(Setting.class);
    when(setting1.name()).thenReturn("Name");

    HashMap<Setting<?>, Object> settingObjectMap = new HashMap<Setting<?>, Object>(1);
    settingObjectMap.put(setting1, "Value");
    settingObjectMap.put(setting, "Value");
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setConfig(settingObjectMap));
    verify(setting1).name();
    verify(setting).name();
  }

  @Test
  void testSetConfig4() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    Setting<Object> setting = (Setting<Object>) mock(Setting.class);
    when(setting.name()).thenReturn("Name");
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setConfig(setting, "Val"));
    verify(setting).name();
  }

  @Test
  void testSetConfigRaw() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.setConfigRaw(new HashMap<String, String>(1)));
  }

  @Test
  void testSetConfigRaw2() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("Key", "42");
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setConfigRaw(stringStringMap));
  }

  @Test
  void testSetConfigRaw3() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("42", "42");
    stringStringMap.put("Key", "42");
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setConfigRaw(stringStringMap));
  }

  @Test
  void testSetExternalDependencies() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder,
        clusteringDBMSBuilder.setExternalDependencies(new Dependencies()));
  }

  @Test
  void testSetMonitors() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setMonitors(new Monitors()));
  }

  @Test
  void testSetUserLogProvider() {
    ClusteringDBMSBuilder clusteringDBMSBuilder = new ClusteringDBMSBuilder(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    assertSame(clusteringDBMSBuilder, clusteringDBMSBuilder.setUserLogProvider(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
  }
}

