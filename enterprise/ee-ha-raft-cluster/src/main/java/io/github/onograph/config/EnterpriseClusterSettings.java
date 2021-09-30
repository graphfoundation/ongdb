package io.github.onograph.config;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.graphdb.config.Configuration;


public class EnterpriseClusterSettings {


  public static boolean isCleeeForCo(Configuration _configuration) {

    Mode mdstr = _configuration.get(GraphDatabaseSettings.mode);
    switch (mdstr) {
      case SINGLE:
        return _configuration.get(MainSettings.settingEnetgaoBoolean);
      case CORE:
        return true;
      case READ_REPLICA:
        return true;
      default:

        throw new IllegalStateException("*** Error: 6b8eff71-49cd-4b08-8437-47cda3428b59");
    }
  }
}
