package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Objects;
import java.util.Set;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;


public class LoadBalanceServerMeta {


  private final SocketAddress abSocketAddress;


  private final ServerId serverId;


  private final Set<NodeGroupIdentifier> setGopNodeGroupIdentifier;

  public LoadBalanceServerMeta(SocketAddress _baSocketAddress, ServerId _serverId,
      Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier) {
    this.abSocketAddress = _baSocketAddress;
    this.serverId = _serverId;
    this.setGopNodeGroupIdentifier = _setGopNodeGroupIdentifier;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      LoadBalanceServerMeta _thaLoadBalanceServerMeta = (LoadBalanceServerMeta) obj;
      return Objects.equals(this.abSocketAddress, _thaLoadBalanceServerMeta.abSocketAddress) &&
          Objects.equals(this.serverId, _thaLoadBalanceServerMeta.serverId) &&
          Objects.equals(this.setGopNodeGroupIdentifier,
              _thaLoadBalanceServerMeta.setGopNodeGroupIdentifier);
    } else {
      return false;
    }
  }


  SocketAddress getAbSocketAddress() {
    return this.abSocketAddress;
  }


  public ServerId getServerId() {
    return this.serverId;
  }


  Set<NodeGroupIdentifier> getSetGopNodeGroupIdentifier() {
    return this.setGopNodeGroupIdentifier;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.abSocketAddress, this.serverId, this.setGopNodeGroupIdentifier);
  }


}
