package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.graphdb.config.Setting;

class ConfigurableFabricSettingsTest {

  @Test
  void testFabricGroupSettingConstructor() {
    assertEquals("fabric.graph", (new ConfigurableFabricSettings.FabricGroupSetting()).getPrefix());
  }

  @Test
  void testFabricGroupSettingConstructor2() {
    ConfigurableFabricSettings.FabricGroupSetting actualFabricGroupSetting = new ConfigurableFabricSettings.FabricGroupSetting();
    Setting<NormalizedGraphName> setting = actualFabricGroupSetting.title;
    assertTrue(setting instanceof SettingImpl);
    Setting<List<URI>> setting1 = actualFabricGroupSetting.settingUriList;
    assertTrue(setting1 instanceof SettingImpl);
    assertNull(actualFabricGroupSetting.name());
    assertTrue(actualFabricGroupSetting.settingDrremDuration instanceof SettingImpl);
    Setting<Duration> setting2 = actualFabricGroupSetting.settingDrrotimDuration;
    assertTrue(setting2 instanceof SettingImpl);
    Setting<Integer> setting3 = actualFabricGroupSetting.settingDrrotozInteger;
    assertTrue(setting3 instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrrenioeDuration instanceof SettingImpl);
    Setting<Duration> setting4 = actualFabricGroupSetting.settingDrrtecctDuration;
    assertTrue(setting4 instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrvaDriverApi instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDaasString instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrresoBoolean instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingSsebdBoolean instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrrivLevel instanceof SettingImpl);
    assertNull(setting4.defaultValue());
    assertEquals("max_size", ((SettingImpl<Integer>) setting3).suffix());
    assertEquals("fabric.graph.null.driver.connection.pool.max_size", setting3.name());
    assertFalse(setting3.internal());
    assertFalse(((SettingImpl<Integer>) setting3).immutable());
    assertFalse(setting3.dynamic());
    assertNull(setting3.defaultValue());
    assertEquals("max_lifetime", ((SettingImpl<Duration>) setting2).suffix());
    assertEquals("fabric.graph.null.driver.connection.max_lifetime", setting2.name());
    assertFalse(setting2.internal());
    assertFalse(((SettingImpl<Duration>) setting2).immutable());
    assertFalse(setting2.dynamic());
    assertNull(setting2.defaultValue());
    assertEquals("fabric.graph.null.uri", setting1.name());
    assertFalse(setting1.internal());
    assertFalse(((SettingImpl<List<URI>>) setting1).immutable());
    assertNull(setting.defaultValue());
    assertFalse(((SettingImpl<Duration>) setting4).immutable());
    assertNull(setting1.defaultValue());
    assertEquals("name", ((SettingImpl<NormalizedGraphName>) setting).suffix());
    assertEquals("fabric.graph.null.name", setting.name());
    assertFalse(setting.internal());
    assertFalse(((SettingImpl<NormalizedGraphName>) setting).immutable());
    assertFalse(setting.dynamic());
    assertFalse(setting1.dynamic());
    assertFalse(setting4.dynamic());
    assertEquals(
        "fabric.graph.null.driver.connection.max_lifetime, a duration (Valid units are: 'ns', 'μs', 'ms', 's',"
            + " 'm', 'h' and 'd'; default unit is 's')", setting2.toString());
    assertEquals("fabric.graph.null.uri, a ',' separated list with elements of type 'a URI'.",
        setting1.toString());
    assertEquals(
        "fabric.graph.null.name, A valid graph name. Containing only alphabetic characters, numbers, dots and"
            + " dashes, with a length between 3 and 63 characters. It should be starting with an alphabetic character."
            + " The name 'graph' is reserved.", setting.toString());
    assertEquals(
        "fabric.graph.null.driver.connection.pool.idle_test, a duration (Valid units are: 'ns', 'μs', 'ms',"
            + " 's', 'm', 'h' and 'd'; default unit is 's')", setting4.description());
    assertEquals("fabric.graph.null.driver.connection.pool.max_size, an integer",
        setting3.toString());
    assertEquals("uri", ((SettingImpl<List<URI>>) setting1).suffix());
    assertFalse(setting4.internal());
  }

  @Test
  void testFabricGroupSettingConstructor3() {
    ConfigurableFabricSettings.FabricGroupSetting actualFabricGroupSetting = new ConfigurableFabricSettings.FabricGroupSetting(
        "Dr");
    Setting<NormalizedGraphName> setting = actualFabricGroupSetting.title;
    assertTrue(setting instanceof SettingImpl);
    Setting<List<URI>> setting1 = actualFabricGroupSetting.settingUriList;
    assertTrue(setting1 instanceof SettingImpl);
    assertEquals("Dr", actualFabricGroupSetting.name());
    assertTrue(actualFabricGroupSetting.settingDrremDuration instanceof SettingImpl);
    Setting<Duration> setting2 = actualFabricGroupSetting.settingDrrotimDuration;
    assertTrue(setting2 instanceof SettingImpl);
    Setting<Integer> setting3 = actualFabricGroupSetting.settingDrrotozInteger;
    assertTrue(setting3 instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrrenioeDuration instanceof SettingImpl);
    Setting<Duration> setting4 = actualFabricGroupSetting.settingDrrtecctDuration;
    assertTrue(setting4 instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrvaDriverApi instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDaasString instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrresoBoolean instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingSsebdBoolean instanceof SettingImpl);
    assertTrue(actualFabricGroupSetting.settingDrrivLevel instanceof SettingImpl);
    assertNull(setting4.defaultValue());
    assertEquals("max_size", ((SettingImpl<Integer>) setting3).suffix());
    assertEquals("fabric.graph.Dr.driver.connection.pool.max_size", setting3.name());
    assertFalse(setting3.internal());
    assertFalse(((SettingImpl<Integer>) setting3).immutable());
    assertFalse(setting3.dynamic());
    assertNull(setting3.defaultValue());
    assertEquals("max_lifetime", ((SettingImpl<Duration>) setting2).suffix());
    assertEquals("fabric.graph.Dr.driver.connection.max_lifetime", setting2.name());
    assertFalse(setting2.internal());
    assertFalse(((SettingImpl<Duration>) setting2).immutable());
    assertFalse(setting2.dynamic());
    assertNull(setting2.defaultValue());
    assertEquals("fabric.graph.Dr.uri", setting1.name());
    assertFalse(setting1.internal());
    assertFalse(((SettingImpl<List<URI>>) setting1).immutable());
    assertNull(setting.defaultValue());
    assertFalse(((SettingImpl<Duration>) setting4).immutable());
    assertNull(setting1.defaultValue());
    assertEquals("name", ((SettingImpl<NormalizedGraphName>) setting).suffix());
    assertEquals("fabric.graph.Dr.name", setting.name());
    assertFalse(setting.internal());
    assertFalse(((SettingImpl<NormalizedGraphName>) setting).immutable());
    assertFalse(setting.dynamic());
    assertFalse(setting1.dynamic());
    assertFalse(setting4.dynamic());
    assertEquals(
        "fabric.graph.Dr.driver.connection.max_lifetime, a duration (Valid units are: 'ns', 'μs', 'ms', 's',"
            + " 'm', 'h' and 'd'; default unit is 's')", setting2.toString());
    assertEquals("fabric.graph.Dr.uri, a ',' separated list with elements of type 'a URI'.",
        setting1.toString());
    assertEquals(
        "fabric.graph.Dr.name, A valid graph name. Containing only alphabetic characters, numbers, dots and"
            + " dashes, with a length between 3 and 63 characters. It should be starting with an alphabetic character."
            + " The name 'graph' is reserved.", setting.toString());
    assertEquals(
        "fabric.graph.Dr.driver.connection.pool.idle_test, a duration (Valid units are: 'ns', 'μs', 'ms', 's',"
            + " 'm', 'h' and 'd'; default unit is 's')", setting4.description());
    assertEquals("fabric.graph.Dr.driver.connection.pool.max_size, an integer",
        setting3.toString());
    assertEquals("uri", ((SettingImpl<List<URI>>) setting1).suffix());
    assertFalse(setting4.internal());
  }

  @Test
  void testFabricGroupSettingOfConfigurableFabricSettingsFabricGroupSetting() {
    ConfigurableFabricSettings.FabricGroupSetting actualOfConfigurableFabricSettingsFabricGroupSettingResult = ConfigurableFabricSettings.FabricGroupSetting
        .ofConfigurableFabricSettingsFabricGroupSetting("Dr");
    Setting<NormalizedGraphName> setting = actualOfConfigurableFabricSettingsFabricGroupSettingResult.title;
    assertTrue(setting instanceof SettingImpl);
    Setting<List<URI>> setting1 = actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingUriList;
    assertTrue(setting1 instanceof SettingImpl);
    assertEquals("Dr", actualOfConfigurableFabricSettingsFabricGroupSettingResult.name());
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrremDuration instanceof SettingImpl);
    Setting<Duration> setting2 = actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrrotimDuration;
    assertTrue(setting2 instanceof SettingImpl);
    Setting<Integer> setting3 = actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrrotozInteger;
    assertTrue(setting3 instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrrenioeDuration instanceof SettingImpl);
    Setting<Duration> setting4 = actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrrtecctDuration;
    assertTrue(setting4 instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrvaDriverApi instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDaasString instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrresoBoolean instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingSsebdBoolean instanceof SettingImpl);
    assertTrue(
        actualOfConfigurableFabricSettingsFabricGroupSettingResult.settingDrrivLevel instanceof SettingImpl);
    assertNull(setting4.defaultValue());
    assertEquals("max_size", ((SettingImpl<Integer>) setting3).suffix());
    assertEquals("fabric.graph.Dr.driver.connection.pool.max_size", setting3.name());
    assertFalse(setting3.internal());
    assertFalse(((SettingImpl<Integer>) setting3).immutable());
    assertFalse(setting3.dynamic());
    assertNull(setting3.defaultValue());
    assertEquals("max_lifetime", ((SettingImpl<Duration>) setting2).suffix());
    assertEquals("fabric.graph.Dr.driver.connection.max_lifetime", setting2.name());
    assertFalse(setting2.internal());
    assertFalse(((SettingImpl<Duration>) setting2).immutable());
    assertFalse(setting2.dynamic());
    assertNull(setting2.defaultValue());
    assertEquals("fabric.graph.Dr.uri", setting1.name());
    assertFalse(setting1.internal());
    assertFalse(((SettingImpl<List<URI>>) setting1).immutable());
    assertNull(setting.defaultValue());
    assertFalse(((SettingImpl<Duration>) setting4).immutable());
    assertNull(setting1.defaultValue());
    assertEquals("name", ((SettingImpl<NormalizedGraphName>) setting).suffix());
    assertEquals("fabric.graph.Dr.name", setting.name());
    assertFalse(setting.internal());
    assertFalse(((SettingImpl<NormalizedGraphName>) setting).immutable());
    assertFalse(setting.dynamic());
    assertFalse(setting1.dynamic());
    assertFalse(setting4.dynamic());
    assertEquals(
        "fabric.graph.Dr.driver.connection.max_lifetime, a duration (Valid units are: 'ns', 'μs', 'ms', 's',"
            + " 'm', 'h' and 'd'; default unit is 's')", setting2.toString());
    assertEquals("fabric.graph.Dr.uri, a ',' separated list with elements of type 'a URI'.",
        setting1.toString());
    assertEquals(
        "fabric.graph.Dr.name, A valid graph name. Containing only alphabetic characters, numbers, dots and"
            + " dashes, with a length between 3 and 63 characters. It should be starting with an alphabetic character."
            + " The name 'graph' is reserved.", setting.toString());
    assertEquals(
        "fabric.graph.Dr.driver.connection.pool.idle_test, a duration (Valid units are: 'ns', 'μs', 'ms', 's',"
            + " 'm', 'h' and 'd'; default unit is 's')", setting4.description());
    assertEquals("fabric.graph.Dr.driver.connection.pool.max_size, an integer",
        setting3.toString());
    assertEquals("uri", ((SettingImpl<List<URI>>) setting1).suffix());
    assertFalse(setting4.internal());
  }
}

