package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.ExtendedActorSystem;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode;


public class RemoveReadReplicaNodeJSerializer extends AbstractJSerializer<RemoveReadReplicaNode> {

  protected RemoveReadReplicaNodeJSerializer(ExtendedActorSystem _extendedActorSystem) {
    super(new RemoveReadReplicaNodeSafeChannelMarshal(_extendedActorSystem), 64, 1008);
  }
}
