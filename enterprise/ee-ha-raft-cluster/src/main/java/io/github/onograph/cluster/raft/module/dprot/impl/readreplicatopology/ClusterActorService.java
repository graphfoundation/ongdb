package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.Terminated;
import akka.cluster.client.ClusterClient;
import akka.cluster.client.ClusterClientSettings;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import java.util.function.Supplier;


public class ClusterActorService extends AbstractActorLoggingAndTimersImpl {


  public static final String TITLE = io.github.onograph.TokenConstants.RESTARTING_CLUSTER_CLIENT;


  private final io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder fccClusterActorBuilder;


  private ActorRef ccActorRef;

  private ClusterActorService(
      io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder _fccClusterActorBuilder) {
    this.fccClusterActorBuilder = _fccClusterActorBuilder;
  }


  public static io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder cleceporClusterActorServiceClusterActorBuilder(
      Supplier<ClusterClientSettings> _supplierCsfClusterClientSettings) {
    return (parentContext) ->
    {
      return parentContext.actorOf(ClusterClient.props(_supplierCsfClusterClientSettings.get()),
          io.github.onograph.TokenConstants.CLUSTER_CLIENT);
    };
  }


  public static Props prpProps(
      io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder _fccClusterActorBuilder) {
    return Props.create(ClusterActorService.class, () ->
    {
      return new ClusterActorService(_fccClusterActorBuilder);
    });
  }


  private void _haeormaForOb(Object m) {
    if (!this.getSender().equals(this.ccActorRef)) {
      this.ccActorRef.forward(m, this.getContext());
    }
  }


  private void _rertmeceForTe(Terminated _inrdTerminated) {
    this.log().warning(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.warning"));
    this.ccActorRef = this.fccClusterActorBuilder.craActorRef(this.getContext());
    this.getContext().watch(this.ccActorRef);
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(Terminated.class, this::_rertmeceForTe)
        .matchAny(this::_haeormaForOb).build();
  }

  @Override
  public void preStart() {
    this.ccActorRef = this.fccClusterActorBuilder.craActorRef(this.getContext());
    this.getContext().watch(this.ccActorRef);
  }


  @FunctionalInterface
  public interface ClusterActorBuilder {


    ActorRef craActorRef(ActorContext _actorContext);
  }
}
