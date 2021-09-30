package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import java.util.Set;


public interface LoadBalancingStrategy {


  Set<LoadBalanceServerMeta> aplSet(Set<LoadBalanceServerMeta> _setVLoadBalanceServerMeta);
}
