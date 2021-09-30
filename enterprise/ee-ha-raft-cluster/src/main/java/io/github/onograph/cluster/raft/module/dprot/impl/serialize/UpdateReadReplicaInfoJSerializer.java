package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.ExtendedActorSystem;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo;


public class UpdateReadReplicaInfoJSerializer extends AbstractJSerializer<UpdateReadReplicaInfo> {

  protected UpdateReadReplicaInfoJSerializer(ExtendedActorSystem _extendedActorSystem) {
    super(new UpdateReadReplicaInfoSafeChannelMarshal(_extendedActorSystem), 256, 1004);
  }
}
