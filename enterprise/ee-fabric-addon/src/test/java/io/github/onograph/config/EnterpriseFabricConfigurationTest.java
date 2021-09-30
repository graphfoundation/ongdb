package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting;
import java.net.URI;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GroupSetting;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.logging.Level;

class EnterpriseFabricConfigurationTest {

  @Test
  void testConstructor() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    ArrayList<SocketAddress> socketAddressList = new ArrayList<SocketAddress>();
    EnterpriseFabricConfiguration actualEnterpriseFabricConfiguration = new EnterpriseFabricConfiguration(
        _dataStream,
        defaultDriverSettings, gdbRef, true, true,
        socketAddressList, null, null);

    assertSame(defaultDriverSettings,
        actualEnterpriseFabricConfiguration.getDefaultDriverSettings());
    assertSame(gdbRef, actualEnterpriseFabricConfiguration.getGdbRef());
    assertSame(socketAddressList, actualEnterpriseFabricConfiguration.getListSfSocketAddress());
    assertNull(actualEnterpriseFabricConfiguration.getTrDuration());
  }

  @Test
  void testDefaultDriverSettingsConstructor() {
    EnterpriseFabricConfiguration.DriverSettings driverSettings = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null);

    EnterpriseFabricConfiguration.DefaultDriverSettings actualDefaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        driverSettings, 1, null, null);

    assertNull(actualDefaultDriverSettings.getDiciDuration());
    assertSame(driverSettings, actualDefaultDriverSettings.getDriverSettings());
    assertEquals(1, actualDefaultDriverSettings.getICle());
    assertNull(actualDefaultDriverSettings.getTiDuration());
  }

  @Test
  void testDriverSettingsConstructor() {
    EnterpriseFabricConfiguration.DriverSettings actualDriverSettings = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null);

    assertEquals(GraphDatabaseSettings.DriverApi.RX, actualDriverSettings.getDriverApi());
    assertEquals(1, actualDriverSettings.getISpcm().intValue());
    assertTrue(actualDriverSettings.getIsSll());
    assertNull(actualDriverSettings.getItbctDuration());
    assertNull(actualDriverSettings.getLcmDuration());
    assertEquals(Level.DEBUG, actualDriverSettings.getLgigLevel());
    assertNull(actualDriverSettings.getTacDuration());
    assertNull(actualDriverSettings.getTcDuration());
  }

  @Test
  void testFabricURIConstructor() {
    assertThrows(IllegalArgumentException.class,
        () -> new EnterpriseFabricConfiguration.FabricURI(new ArrayList<URI>()));
  }

  @Test
  void testFabricURIConstructor2() {
    ArrayList<URI> uriList = new ArrayList<URI>();
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    assertThrows(IllegalArgumentException.class,
        () -> new EnterpriseFabricConfiguration.FabricURI(uriList));
  }

  @Test
  void testFabricURIConstructor3() {
    ArrayList<URI> uriList = new ArrayList<URI>();
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    assertThrows(IllegalArgumentException.class,
        () -> new EnterpriseFabricConfiguration.FabricURI(uriList));
  }

  @Test
  void testFabricURIConstructor4() {
    ArrayList<URI> uriList = new ArrayList<URI>();
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    uriList.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    assertThrows(IllegalArgumentException.class,
        () -> new EnterpriseFabricConfiguration.FabricURI(uriList));
  }

  @Test
  void testFabricURICraEnterpriseFabricConfigurationFabricURI() {
    assertThrows(IllegalArgumentException.class,
        () -> EnterpriseFabricConfiguration.FabricURI.craEnterpriseFabricConfigurationFabricURI(
            "foo"));
    assertThrows(IllegalArgumentException.class,
        () -> EnterpriseFabricConfiguration.FabricURI.craEnterpriseFabricConfigurationFabricURI(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }

  @Test
  void testFroEnterpriseFabricConfiguration() {
    HashMap<String, GroupSetting> stringGroupSettingMap = new HashMap<String, GroupSetting>(1);
    stringGroupSettingMap.put("Key", new ClusterLoadBalancingServerPoliciesGroupSetting());
    Config config = mock(Config.class);
    when(config.getGroups((Class<GroupSetting>) any())).thenReturn(stringGroupSettingMap);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    assertThrows(IllegalArgumentException.class,
        () -> EnterpriseFabricConfiguration.froEnterpriseFabricConfiguration(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(config).getGroups((Class<GroupSetting>) any());
  }

  @Test
  void testFroEnterpriseFabricConfiguration2() {
    HashMap<String, GroupSetting> stringGroupSettingMap = new HashMap<String, GroupSetting>(1);
    stringGroupSettingMap.putIfAbsent("Key", new ClusterLoadBalancingServerPoliciesGroupSetting());
    Config config = mock(Config.class);
    when(config.getGroups((Class<GroupSetting>) any())).thenReturn(stringGroupSettingMap);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    assertThrows(IllegalArgumentException.class,
        () -> EnterpriseFabricConfiguration.froEnterpriseFabricConfiguration(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(config).getGroups((Class<GroupSetting>) any());
  }

  @Test
  void testFroEnterpriseFabricConfiguration3() {
    HashMap<String, GroupSetting> stringGroupSettingMap = new HashMap<String, GroupSetting>(1);
    stringGroupSettingMap.put("Key", new ClusterLoadBalancingServerPoliciesGroupSetting());

    HashMap<String, GroupSetting> stringGroupSettingMap1 = new HashMap<String, GroupSetting>(1);
    stringGroupSettingMap1.putAll(stringGroupSettingMap);
    Config config = mock(Config.class);
    when(config.getGroups((Class<GroupSetting>) any())).thenReturn(stringGroupSettingMap1);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    assertThrows(IllegalArgumentException.class,
        () -> EnterpriseFabricConfiguration.froEnterpriseFabricConfiguration(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(config).getGroups((Class<GroupSetting>) any());
  }

  @Test
  void testDriverSettingsEquals() {
    assertFalse(
        (new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null,
            Level.DEBUG, null, null, null)).equals(null));
    assertFalse(
        (new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null,
            Level.DEBUG, null, null, null)).equals("Different type to DriverSettings"));
  }

  @Test
  void testDriverSettingsEquals2() {
    EnterpriseFabricConfiguration.DriverSettings driverSettings = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null);
    assertTrue(driverSettings.equals(driverSettings));
    int expectedHashCodeResult = driverSettings.hashCode();
    assertEquals(expectedHashCodeResult, driverSettings.hashCode());
  }

  @Test
  void testDriverSettingsEquals3() {
    EnterpriseFabricConfiguration.DriverSettings driverSettings = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null);
    EnterpriseFabricConfiguration.DriverSettings driverSettings1 = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null);

    assertTrue(driverSettings.equals(driverSettings1));
    int expectedHashCodeResult = driverSettings.hashCode();
    assertEquals(expectedHashCodeResult, driverSettings1.hashCode());
  }

  @Test
  void testDriverSettingsEquals4() {
    EnterpriseFabricConfiguration.DriverSettings driverSettings = new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.ASYNC, 1, true, null, Level.DEBUG, null, null, null);
    assertFalse(driverSettings.equals(new EnterpriseFabricConfiguration.DriverSettings(
        GraphDatabaseSettings.DriverApi.RX, 1, true, null, Level.DEBUG, null, null, null)));
  }

  @Test
  void testEquals() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    assertFalse(
        (new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings, gdbRef, true, true,
            new ArrayList<SocketAddress>(), null, null)).equals(1));
  }

  @Test
  void testGdbRefEquals() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    assertFalse(
        (new EnterpriseFabricConfiguration.GdbRef(gdbWrappers,
            new NormalizedDatabaseName("Name"))).equals(null));
  }

  @Test
  void testGdbRefEquals2() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    assertFalse(
        (new EnterpriseFabricConfiguration.GdbRef(gdbWrappers, new NormalizedDatabaseName("Name")))
            .equals("Different type to GdbRef"));
  }

  @Test
  void testGdbRefEquals3() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));
    assertTrue(gdbRef.equals(gdbRef));
    int expectedHashCodeResult = gdbRef.hashCode();
    assertEquals(expectedHashCodeResult, gdbRef.hashCode());
  }

  @Test
  void testGdbRefEquals4() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers1 = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef1 = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers1,
        new NormalizedDatabaseName("Name"));

    assertTrue(gdbRef.equals(gdbRef1));
    int expectedHashCodeResult = gdbRef.hashCode();
    assertEquals(expectedHashCodeResult, gdbRef1.hashCode());
  }

  @Test
  void testGdbRefEquals5() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName(
            "org.neo4j.configuration.helpers.NormalizedDatabaseName"));
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers1 = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    assertFalse(
        gdbRef.equals(new EnterpriseFabricConfiguration.GdbRef(gdbWrappers1,
            new NormalizedDatabaseName("Name"))));
  }

  @Test
  void testGdbDriverSettingsConstructor() {
    assertTrue(
        (new EnterpriseFabricConfiguration.GdbDriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, true,
            null, Level.DEBUG, null, null, null)).getIsEs());
  }

  @Test
  void testGdbRefConstructor() {
    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrapperSet = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    NormalizedDatabaseName normalizedDatabaseName = new NormalizedDatabaseName("Name");
    EnterpriseFabricConfiguration.GdbRef actualGdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrapperSet,
        normalizedDatabaseName);

    assertSame(gdbWrapperSet, actualGdbRef.getGdbWrappers());
    assertSame(normalizedDatabaseName, actualGdbRef.getTitle());
  }

  @Test
  void testGdbWrapperConstructor() {
    NormalizedGraphName title = new NormalizedGraphName("Name");
    assertThrows(IllegalArgumentException.class,
        () -> new EnterpriseFabricConfiguration.GdbWrapper(1L, null, " str Dtbs", title,
            new EnterpriseFabricConfiguration.GdbDriverSettings(
                GraphDatabaseSettings.DriverApi.RX, 1, true, true, null,
                Level.DEBUG, null, null, null)));
  }

  @Test
  void testGetFabricDatabaseName() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    assertTrue(
        (new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings, gdbRef, true, true,
            new ArrayList<SocketAddress>(), null, null)).getFabricDatabaseName().isPresent());
  }

  @Test
  void testGetFabricDatabaseName2() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    assertFalse(
        (new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings, null, true, true,
            new ArrayList<SocketAddress>(), null, null)).getFabricDatabaseName().isPresent());
  }

  @Test
  void testSefbsesForLi() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    EnterpriseFabricConfiguration enterpriseFabricConfiguration = new EnterpriseFabricConfiguration(
        _dataStream,
        defaultDriverSettings, gdbRef, true, true,
        new ArrayList<SocketAddress>(), null, null);
    ArrayList<SocketAddress> socketAddressList = new ArrayList<SocketAddress>();
    enterpriseFabricConfiguration.sefbsesForLi(socketAddressList);
    assertSame(socketAddressList, enterpriseFabricConfiguration.getListSfSocketAddress());
  }
}

