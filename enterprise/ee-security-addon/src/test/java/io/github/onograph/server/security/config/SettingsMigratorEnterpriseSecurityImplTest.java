package io.github.onograph.server.security.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SettingsMigratorEnterpriseSecurityImplTest {

  @Test
  void testMigrate() {
    SettingsMigratorEnterpriseSecurityImpl settingsMigratorEnterpriseSecurityImpl = new SettingsMigratorEnterpriseSecurityImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingsMigratorEnterpriseSecurityImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate2() {
    SettingsMigratorEnterpriseSecurityImpl settingsMigratorEnterpriseSecurityImpl = new SettingsMigratorEnterpriseSecurityImpl();
    HashMap<String, String> stringStringMap = new HashMap<String, String>(0);
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingsMigratorEnterpriseSecurityImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertTrue(stringStringMap.isEmpty());
  }

  @Test
  void testMigrate3() {
    SettingsMigratorEnterpriseSecurityImpl settingsMigratorEnterpriseSecurityImpl = new SettingsMigratorEnterpriseSecurityImpl();

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("dbms.security.auth_provider", "42");
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingsMigratorEnterpriseSecurityImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertEquals(2, stringStringMap.size());
  }

  @Test
  void testMigrate4() {
    SettingsMigratorEnterpriseSecurityImpl settingsMigratorEnterpriseSecurityImpl = new SettingsMigratorEnterpriseSecurityImpl();

    HashMap<String, String> stringStringMap = new HashMap<String, String>(1);
    stringStringMap.put("dbms.security.ldap.authentication.use_samaccountname", "42");
    HashMap<String, String> _mapVdss = new HashMap<String, String>(1);
    settingsMigratorEnterpriseSecurityImpl.migrate(stringStringMap, _mapVdss, new BufferingLog());
    assertEquals(1, stringStringMap.size());
  }
}

