package io.github.onograph.server.security.config;

import io.github.onograph.config.Security;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.configuration.SettingMigrator;
import org.neo4j.configuration.SettingMigrators;
import org.neo4j.logging.Log;


public class SettingsMigratorEnterpriseSecurityImpl implements SettingMigrator {

  @Override
  public void migrate(Map<String, String> valArr, Map<String, String> _mapVdss, Log _log) {

    String val = valArr.remove(io.github.onograph.TokenConstants.DBMS__SECURITY__AUTH_PROVIDER);
    if (StringUtils.isNotBlank(val)) {

      valArr.putIfAbsent(Security.settingAuntreList.name(), val);
      valArr.putIfAbsent(Security.settingAuriorList.name(), val);
    }

    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__USE_SAMACCOUNTNAME,
        Security.settingLdutieiBoolean);
  }
}
