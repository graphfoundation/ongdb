package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SettingMigratorEnterpriseImplTest {

  @Test
  void testMigrate() {
    SettingMigratorEnterpriseImpl settingMigratorEnterpriseImpl = new SettingMigratorEnterpriseImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorEnterpriseImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate2() {
    SettingMigratorEnterpriseImpl settingMigratorEnterpriseImpl = new SettingMigratorEnterpriseImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(0);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorEnterpriseImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate3() {
    SettingMigratorEnterpriseImpl settingMigratorEnterpriseImpl = new SettingMigratorEnterpriseImpl();

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("dbms.dynamic.setting.whitelist", "42");
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorEnterpriseImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertEquals(1, stringStringMap.size());
  }
}

