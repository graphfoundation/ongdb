package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ServerInfoRuleProcessorMatchAnyGroupImpl implements
    RuleProcessor<LoadBalanceServerMeta> {


  private final Predicate<LoadBalanceServerMeta> predicateGamLoadBalanceServerMeta;


  private final Set<NodeGroupIdentifier> setGopNodeGroupIdentifier;

  ServerInfoRuleProcessorMatchAnyGroupImpl(Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier) {
    this.predicateGamLoadBalanceServerMeta = (serverInfo) ->
    {

      Stream _stream = serverInfo.getSetGopNodeGroupIdentifier().stream();
      Objects.requireNonNull(_setGopNodeGroupIdentifier);
      return _stream.anyMatch(_setGopNodeGroupIdentifier::contains);
    };
    this.setGopNodeGroupIdentifier = _setGopNodeGroupIdentifier;
  }

  @Override
  public Set<LoadBalanceServerMeta> aplSet(Set<LoadBalanceServerMeta> _setDaLoadBalanceServerMeta) {
    return _setDaLoadBalanceServerMeta.stream().filter(this.predicateGamLoadBalanceServerMeta)
        .collect(Collectors.toSet());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ServerInfoRuleProcessorMatchAnyGroupImpl _thaServerInfoRuleProcessorMatchAnyGroupImpl = (ServerInfoRuleProcessorMatchAnyGroupImpl) obj;
      return Objects.equals(this.setGopNodeGroupIdentifier,
          _thaServerInfoRuleProcessorMatchAnyGroupImpl.setGopNodeGroupIdentifier);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.setGopNodeGroupIdentifier);
  }


}
