package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import java.util.Set;


class RuleProcessorForceStopImpl implements RuleProcessor<LoadBalanceServerMeta> {


  public static final RuleProcessorForceStopImpl IT = new RuleProcessorForceStopImpl();

  private RuleProcessorForceStopImpl() {
  }

  @Override
  public Set<LoadBalanceServerMeta> aplSet(Set<LoadBalanceServerMeta> _setDLoadBalanceServerMeta) {
    throw new UnsupportedOperationException();
  }
}
