package io.github.onograph.config;

import java.util.Map;
import org.neo4j.configuration.SettingMigrator;
import org.neo4j.configuration.SettingMigrators;
import org.neo4j.logging.Log;


public class SettingMigratorBackupImpl implements SettingMigrator {

  @Override
  public void migrate(Map<String, String> valArr, Map<String, String> _mapVdss, Log _log) {
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.DBMS__BACKUP__ADDRESS,
        Backup.settingOneutdSocketAddress);
  }
}
