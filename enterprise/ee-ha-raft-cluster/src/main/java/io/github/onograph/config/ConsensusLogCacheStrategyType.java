package io.github.onograph.config;

import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Config;
import org.neo4j.monitoring.Monitors;


@PublicApi
public enum ConsensusLogCacheStrategyType {


  ST_NOOP {
    @Override
    ConsensusLogCacheService craConsensusLogCacheService(Config _config, Monitors _monitors) {
      return new ConsensusLogCacheServiceNoopImpl();
    }
  },

  ST_FOLLOWING_CT {
    @Override
    ConsensusLogCacheService craConsensusLogCacheService(Config _config, Monitors _monitors) {
      return new ConsensusLogCacheServiceLiveImpl(
          _config.get(SettingsDeclarationClusterImpl.settingIngcxiInteger), false,
          _config.get(SettingsDeclarationClusterImpl.settingIngcxsLong),
          _monitors.newMonitor(LivingCacheObserver.class, new String[0]));
    }
  },

  ST_UNLMT {
    @Override
    ConsensusLogCacheService craConsensusLogCacheService(Config _config, Monitors _monitors) {
      return new ConsensusLogCacheServiceNLImpl();
    }
  };


  abstract ConsensusLogCacheService craConsensusLogCacheService(Config _config, Monitors _monitors);
}
