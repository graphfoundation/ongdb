package io.github.onograph.config;

import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import org.neo4j.configuration.Config;
import org.neo4j.monitoring.Monitors;


public final class ConsensusLogCacheServiceBuilder {

  private ConsensusLogCacheServiceBuilder() {
  }


  public static ConsensusLogCacheService craConsensusLogCacheService(Config _config,
      Monitors _monitors) {
    return _config.get(SettingsDeclarationClusterImpl.settingIngcpConsensusLogCacheStrategyType)
        .craConsensusLogCacheService(_config, _monitors);
  }
}
