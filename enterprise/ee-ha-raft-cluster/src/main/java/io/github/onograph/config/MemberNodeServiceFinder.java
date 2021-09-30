package io.github.onograph.config;

import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;


public final class MemberNodeServiceFinder {

  private MemberNodeServiceFinder() {
  }


  public static MemberNodeService choroeMemberNodeService(Config _config, LogService _logService) {
    if (_config.get(GraphDatabaseSettings.mode) == Mode.SINGLE) {

      SocketAddress _socketAddress = (SocketAddress) _config.get(
          SettingsDeclarationClusterImpl.settingDivdidsSocketAddress);

      LogProvider _logProvider = _logService.getInternalLogProvider();

      return DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
          List.of(_socketAddress));
    } else {

      ClusterDiscoveryMode _tdClusterDiscoveryMode =
          (ClusterDiscoveryMode) _config.get(
              SettingsDeclarationClusterImpl.settingDiceteClusterDiscoveryMode);
      return _tdClusterDiscoveryMode.gehserlMemberNodeService(_config, _logService);
    }
  }
}
