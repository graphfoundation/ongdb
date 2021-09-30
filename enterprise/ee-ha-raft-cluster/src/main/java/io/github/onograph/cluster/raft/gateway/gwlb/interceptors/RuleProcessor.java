package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.Set;


@FunctionalInterface
public interface RuleProcessor<T> {


  Set<T> aplSet(Set<T> _setVT);
}
