package io.github.onograph.cluster.raft.module.dprot;

import java.util.Collection;
import org.neo4j.configuration.helpers.SocketAddress;


public interface DiscoverySocketAddressManager {


  default boolean isUsord() {
    return false;
  }


  Collection<SocketAddress> reoeCollection(SocketAddress _socketAddress);
}
