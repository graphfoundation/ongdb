package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.configuration.helpers.SocketAddress;


public class SocketAddressController {


  Set<SocketAddress> setOciadeSocketAddress = ConcurrentHashMap.newKeySet();


  public boolean isTraueForSo(SocketAddress _socketAddress) {
    return this.setOciadeSocketAddress.add(_socketAddress);
  }


  public void reeeForSo(SocketAddress _socketAddress) {
    if (!this.setOciadeSocketAddress.remove(_socketAddress)) {

      throw new UnsupportedOperationException("*** Error: 64f11535-73b2-4b7e-bb5b-73fd38749286");
    }
  }
}
