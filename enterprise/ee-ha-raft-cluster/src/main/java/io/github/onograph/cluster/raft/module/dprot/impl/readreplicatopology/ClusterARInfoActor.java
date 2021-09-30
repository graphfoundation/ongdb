package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.client.ClusterClientUnreachable;
import akka.cluster.client.ClusterClientUp;
import akka.cluster.client.ClusterClients;
import akka.cluster.client.SubscribeClusterClients;
import akka.cluster.client.UnsubscribeClusterClients;
import akka.japi.pf.ReceiveBuilder;
import java.util.HashSet;
import java.util.Set;


class ClusterARInfoActor extends AbstractLoggingActor {


  private final ActorRef prnActorRef;


  private final ActorRef rcpinActorRef;


  private final Set<ActorRef> setCcActorRef = new HashSet();

  private ClusterARInfoActor(ActorRef _prnActorRef, ActorRef _rcpinActorRef) {
    this.prnActorRef = _prnActorRef;
    this.rcpinActorRef = _rcpinActorRef;
  }


  static Props prpProps(ActorRef _prnActorRef, ActorRef _rcpinActorRef) {
    return Props.create(ClusterARInfoActor.class, () ->
    {
      return new ClusterARInfoActor(_prnActorRef, _rcpinActorRef);
    });
  }


  private void _haectciForCl(ClusterClients m) {

    this.setCcActorRef.addAll(m.getClusterClients());
    this._sedtpe();
  }


  private void _haectciunhForCl(ClusterClientUnreachable m) {

    this.setCcActorRef.remove(m.clusterClient());
    this._sedtpe();
  }


  private void _haectciupForCl(ClusterClientUp m) {

    this.setCcActorRef.add(m.clusterClient());
    this._sedtpe();
  }


  private void _sedtpe() {
    this.prnActorRef.tell(new ShowClusterActorStructureMeta(this.setCcActorRef), this.getSelf());
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(ClusterClients.class, this::_haectciForCl)
        .match(ClusterClientUp.class, this::_haectciupForCl)
        .match(ClusterClientUnreachable.class, this::_haectciunhForCl).build();
  }

  @Override
  public void postStop() {
    this.rcpinActorRef.tell(UnsubscribeClusterClients.getInstance(), this.getSelf());
  }

  @Override
  public void preStart() {
    this.rcpinActorRef.tell(SubscribeClusterClients.getInstance(), this.getSelf());
  }
}
