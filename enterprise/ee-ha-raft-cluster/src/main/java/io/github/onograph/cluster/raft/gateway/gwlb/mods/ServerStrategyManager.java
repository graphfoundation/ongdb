package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting;
import org.neo4j.configuration.Config;
import org.neo4j.logging.Log;


class ServerStrategyManager {

  private ServerStrategyManager() {
  }


  static LoadBalancingStrategies losepiLoadBalancingStrategies(Config _config, Log _log) {

    LoadBalancingStrategies _plceLoadBalancingStrategies = new LoadBalancingStrategies(_log);
    _config.getGroups(ClusterLoadBalancingServerPoliciesGroupSetting.class).forEach((id, policy) ->
    {
      _plceLoadBalancingStrategies.adpiForStLo(
          new LoadBalancingStrategyRuleProcessorImpl(
              _config.get(policy.val)), policy.name());
    });
    return _plceLoadBalancingStrategies;
  }
}
