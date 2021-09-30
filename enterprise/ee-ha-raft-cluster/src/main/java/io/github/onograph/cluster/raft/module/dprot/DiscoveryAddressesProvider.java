package io.github.onograph.cluster.raft.module.dprot;

import org.neo4j.configuration.helpers.SocketAddress;


public interface DiscoveryAddressesProvider {


  default SocketAddress botadsSocketAddress() {
    return this.contsDiscoverySocketAddresses().cltbasSocketAddress();
  }


  DiscoverySocketAddresses contsDiscoverySocketAddresses();
}
