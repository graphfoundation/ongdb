package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorRef;
import java.util.Objects;
import java.util.Set;


public class ShowClusterActorStructureMeta {


  private final Set<ActorRef> setCcActorRef;

  public ShowClusterActorStructureMeta(Set<ActorRef> _setCcActorRef) {
    this.setCcActorRef = Set.copyOf(_setCcActorRef);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ShowClusterActorStructureMeta _thShowClusterActorStructureMeta = (ShowClusterActorStructureMeta) obj;
      return Objects.equals(this.setCcActorRef, _thShowClusterActorStructureMeta.setCcActorRef);
    } else {
      return false;
    }
  }


  public Set<ActorRef> getSetCcActorRef() {
    return this.setCcActorRef;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.setCcActorRef);
  }


}
