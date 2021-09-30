package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorPath;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.client.ClusterClientReceptionist;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;


class ReadReplicaClusterClientInfoActor extends AbstractActorLoggingAndTimersImpl {


  static final String RDX_RELA_TOI = io.github.onograph.TokenConstants.RR_TOPIC;


  static final int TIK_BEO_REO_RDX_RELA = 3;


  private static final String TIC_MK = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.var");


  private final Clock clock;


  private final ClusterClientReceptionist clusterClientReceptionist;


  private final Map<ActorPath, ReadReplicaStructureWrapper> mapCtrrrar = new HashMap();


  private final ActorRef prnActorRef;


  private final Duration rfehDuration;


  private ReadReplicaClusterClientInfoActor(Clock _clock,
      ClusterClientReceptionist _clusterClientReceptionist, ActorRef _prnActorRef,
      Duration _rfehDuration) {
    this.clock = _clock;
    this.clusterClientReceptionist = _clusterClientReceptionist;
    this.prnActorRef = _prnActorRef;
    this.rfehDuration = _rfehDuration;
  }


  static Props prpProps(Clock _clock, ClusterClientReceptionist _clusterClientReceptionist,
      ActorRef _prnActorRef, Duration _rfehDuration) {
    return Props.create(ReadReplicaClusterClientInfoActor.class, () ->
    {
      return new ReadReplicaClusterClientInfoActor(_clock, _clusterClientReceptionist, _prnActorRef,
          _rfehDuration);
    });
  }


  private void _hadtkForRe(
      io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment _ticTimerMoment) {

    Instant _atnInstant = Instant.now(this.clock).minus(this.rfehDuration.multipliedBy(3L));

    List<ActorPath> _listRmvActorPath = this.mapCtrrrar.entrySet().stream().filter((entry) ->
        {
          return entry.getValue()
              .getTmsapInstant().isBefore(_atnInstant);
        }).peek((entry) ->
        {

        }).map(Entry::getKey)
        .collect(Collectors.toList());
    if (!_listRmvActorPath.isEmpty()) {

      Map _map = this.mapCtrrrar;
      Objects.requireNonNull(_map);
      _listRmvActorPath.forEach(_map::remove);
      this._seclrv();
    }

    this.prnActorRef.tell(_ticTimerMoment, this.getSelf());
  }


  private void _haeremsForUp(UpdateReadReplicaInfo m) {

    ActorPath _pcActorPath = m.getMccActorRef().path();
    this.mapCtrrrar.put(_pcActorPath, new ReadReplicaStructureWrapper(this.clock, m));
    this._seclrv();
  }


  private void _haervmsForRe(RemoveReadReplicaNode m) {

    ActorPath _pcActorPath = m.getMccActorRef().path();

    ReadReplicaStructureWrapper _rmvdReadReplicaStructureWrapper = this.mapCtrrrar.remove(
        _pcActorPath);

    this._seclrv();
  }


  private void _seclrv() {
    this.prnActorRef.tell(new ShowReadReplicaInfo(this.mapCtrrrar), this.getSelf());
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(UpdateReadReplicaInfo.class, this::_haeremsForUp)
        .match(RemoveReadReplicaNode.class, this::_haervmsForRe)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment.class,
            this::_hadtkForRe)
        .build();
  }

  @Override
  public void postStop() {
    this.clusterClientReceptionist.unregisterSubscriber(io.github.onograph.TokenConstants.RR_TOPIC,
        this.getSelf());
  }

  @Override
  public void preStart() {
    this.clusterClientReceptionist.registerSubscriber(io.github.onograph.TokenConstants.RR_TOPIC,
        this.getSelf());
    this.getTimers().startPeriodicTimer(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.startPeriodicTimer"),
        io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment.IT,
        this.rfehDuration);
  }


  static class TimerMoment {


    public static final io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment IT =
        new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment();

    private TimerMoment() {
    }
  }
}
