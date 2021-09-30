package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SettingMigratorBackupImplTest {

  @Test
  void testMigrate() {
    SettingMigratorBackupImpl settingMigratorBackupImpl = new SettingMigratorBackupImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorBackupImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate2() {
    SettingMigratorBackupImpl settingMigratorBackupImpl = new SettingMigratorBackupImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(0);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorBackupImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate3() {
    SettingMigratorBackupImpl settingMigratorBackupImpl = new SettingMigratorBackupImpl();

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("dbms.backup.address", "42");
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorBackupImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertEquals(1, stringStringMap.size());
  }
}

