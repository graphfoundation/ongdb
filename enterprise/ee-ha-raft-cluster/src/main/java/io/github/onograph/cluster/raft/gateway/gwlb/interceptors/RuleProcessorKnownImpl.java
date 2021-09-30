package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.Set;


public class RuleProcessorKnownImpl<T> implements RuleProcessor<T> {


  public static final RuleProcessorKnownImpl IT = new RuleProcessorKnownImpl();

  private RuleProcessorKnownImpl() {
  }


  public static <T> RuleProcessorKnownImpl<T> asRuleProcessorKnownImpl() {
    return IT;
  }

  @Override
  public Set<T> aplSet(Set<T> _setDT) {
    return _setDT;
  }


}
