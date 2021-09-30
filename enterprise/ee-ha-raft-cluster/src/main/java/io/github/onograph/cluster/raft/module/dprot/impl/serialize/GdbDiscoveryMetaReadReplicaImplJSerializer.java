package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;


public class GdbDiscoveryMetaReadReplicaImplJSerializer extends
    AbstractJSerializer<GdbDiscoveryMetaReadReplicaImpl> {

  protected GdbDiscoveryMetaReadReplicaImplJSerializer() {
    super(GdbDiscoveryMetaReadReplicaMarshal.IT, 256, 1006);
  }
}
