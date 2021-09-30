package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorRef;
import java.util.Objects;


public class RemoveReadReplicaNode {


  private final ActorRef mccActorRef;

  public RemoveReadReplicaNode(ActorRef _mccActorRef) {
    this.mccActorRef = _mccActorRef;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RemoveReadReplicaNode _thRemoveReadReplicaNode = (RemoveReadReplicaNode) obj;
      return Objects.equals(this.mccActorRef, _thRemoveReadReplicaNode.mccActorRef);
    } else {
      return false;
    }
  }


  public ActorRef getMccActorRef() {
    return this.mccActorRef;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mccActorRef);
  }


}
