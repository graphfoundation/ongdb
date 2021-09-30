package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SettingMigratorMetricImplTest {

  @Test
  void testMigrate() {
    SettingMigratorMetricImpl settingMigratorMetricImpl = new SettingMigratorMetricImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingMigratorMetricImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }
}

