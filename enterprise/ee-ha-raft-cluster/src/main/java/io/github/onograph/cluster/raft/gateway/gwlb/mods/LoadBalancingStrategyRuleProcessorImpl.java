package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import java.util.Objects;
import java.util.Set;


public class LoadBalancingStrategyRuleProcessorImpl implements LoadBalancingStrategy {


  private final RuleProcessor<LoadBalanceServerMeta> ruleProcessorFleLoadBalanceServerMeta;

  LoadBalancingStrategyRuleProcessorImpl(
      RuleProcessor<LoadBalanceServerMeta> _ruleProcessorFleLoadBalanceServerMeta) {
    this.ruleProcessorFleLoadBalanceServerMeta = _ruleProcessorFleLoadBalanceServerMeta;
  }

  @Override
  public Set<LoadBalanceServerMeta> aplSet(Set<LoadBalanceServerMeta> _setDLoadBalanceServerMeta) {
    return this.ruleProcessorFleLoadBalanceServerMeta.aplSet(_setDLoadBalanceServerMeta);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      LoadBalancingStrategyRuleProcessorImpl _thLoadBalancingStrategyRuleProcessorImpl = (LoadBalancingStrategyRuleProcessorImpl) obj;
      return Objects.equals(this.ruleProcessorFleLoadBalanceServerMeta,
          _thLoadBalancingStrategyRuleProcessorImpl.ruleProcessorFleLoadBalanceServerMeta);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.ruleProcessorFleLoadBalanceServerMeta);
  }


}
