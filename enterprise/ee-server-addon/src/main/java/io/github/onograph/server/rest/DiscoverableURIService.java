package io.github.onograph.server.rest;

import io.github.onograph.config.MainSettings;
import io.github.onograph.server.rest.cluster.DbmsApi;
import io.github.onograph.server.rest.cluster.GdbClusterApi;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.server.configuration.ConfigurableServerModules;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.rest.discovery.CommunityDiscoverableURIs;
import org.neo4j.server.rest.discovery.DiscoverableURIs;
import org.neo4j.server.rest.discovery.DiscoverableURIs.Builder;


public class DiscoverableURIService {


  private static boolean _isMoalsseoForCo(Config _config) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    switch (mdstr) {
      case CORE:
      case READ_REPLICA:
        return true;
      case SINGLE:
        return _config.get(MainSettings.settingEnetgaoBoolean);
      default:

        throw new IllegalStateException("*** Error: 8454326a-2460-42f0-95e1-95136c412db2");
    }
  }


  public static DiscoverableURIs enpdvlurDiscoverableURIs(Config _config,
      ConnectorPortRegister _connectorPortRegister) {

    Builder _irudBuilder = CommunityDiscoverableURIs.communityDiscoverableURIsBuilder(_config,
        _connectorPortRegister);

    Set<ConfigurableServerModules> _setMeConfigurableServerModules = _config.get(
        ServerSettings.http_enabled_modules);
    if (_setMeConfigurableServerModules.contains(
        ConfigurableServerModules.ENTERPRISE_MANAGEMENT_ENDPOINTS) && _isMoalsseoForCo(_config)) {
      _irudBuilder.addEndpoint(io.github.onograph.TokenConstants.P_DB__CLUSTER,
          GdbClusterApi.abudtectptString(_config));
      _irudBuilder.addEndpoint(io.github.onograph.TokenConstants.P_DBMS__CLUSTER,
          DbmsApi.abudmcspaString(_config));
    }

    return _irudBuilder.build();
  }
}
