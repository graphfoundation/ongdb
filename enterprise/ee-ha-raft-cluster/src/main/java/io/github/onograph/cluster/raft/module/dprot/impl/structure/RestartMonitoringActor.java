package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.ClusterShuttingDown$;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.event.EventStream;
import akka.japi.pf.ReceiveBuilder;
import akka.remote.ThisActorSystemQuarantinedEvent;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach;
import io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler;


public class RestartMonitoringActor extends AbstractActorLoggingAndTimersImpl {


  public static final String SPCLX_MK = io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER_TIMER;


  public static final String TITLE = io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER;


  private final ActorLifecycleApproach asrsActorLifecycleApproach;


  private final Cluster cluster;


  private final EventStream eventStream;


  private final StartScheduler raStartScheduler;


  private RestartMonitoringActor(ActorLifecycleApproach _asrsActorLifecycleApproach,
      Cluster _cluster, EventStream _eventStream, StartScheduler _raStartScheduler) {
    this.asrsActorLifecycleApproach = _asrsActorLifecycleApproach;
    this.cluster = _cluster;
    this.eventStream = _eventStream;
    this.raStartScheduler = _raStartScheduler;
  }


  public static Props prpProps(Cluster _cluster, EventStream _eventStream,
      StartScheduler _raStartScheduler, ActorLifecycleApproach _srsaActorLifecycleApproach) {
    return Props.create(RestartMonitoringActor.class, () ->
    {
      return new RestartMonitoringActor(_srsaActorLifecycleApproach, _cluster, _eventStream,
          _raStartScheduler);
    });
  }


  private void _codrsForOb(Object ev) {
    if (this.asrsActorLifecycleApproach.isRerruForCl(this.cluster)) {
      this._doreaForOb(this.asrsActorLifecycleApproach.gersString());
    }
  }


  private Receive _crestdorcAbstractActorReceive() {
    return ReceiveBuilder.create().match(ThisActorSystemQuarantinedEvent.class, this::_igoForOb)
        .match(ClusterShuttingDown$.class, this::_igoForOb)
        .match(CurrentClusterState.class, (ignore) ->
        {
        }).build();
  }


  private void _doreaForOb(Object ev) {

    this._unucb();
    this.raStartScheduler.restartNow();
    this.getContext().become(this._crestdorcAbstractActorReceive());
  }


  private void _igoForOb(Object ev) {

  }


  private void _unucb() {
    this.eventStream.unsubscribe(this.getSelf(), ThisActorSystemQuarantinedEvent.class);
    this.eventStream.unsubscribe(this.getSelf(),
        io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.PropMagicElmFound.class);
    this.cluster.unsubscribe(this.getSelf(), ClusterShuttingDown$.class);
    this.timers().cancelAll();
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(ThisActorSystemQuarantinedEvent.class, this::_doreaForOb)
        .match(ClusterShuttingDown$.class, this::_doreaForOb)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.PropMagicElmFound.class,
            this::_doreaForOb)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.TimerMoment.class,
            this::_codrsForOb).match(CurrentClusterState.class, (ignore) ->
        {
        }).build();
  }

  @Override
  public void postStop() {
    this.timers().cancelAll();
    this._unucb();
  }

  @Override
  public void preStart() {
    this.eventStream.subscribe(this.getSelf(), ThisActorSystemQuarantinedEvent.class);
    this.cluster.subscribe(this.getSelf(), ClusterShuttingDown$.class);
    this.cluster.registerOnMemberUp(() ->
    {
      this.timers()
          .startPeriodicTimer(
              io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER_TIMER,
              new io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.TimerMoment(),
              this.asrsActorLifecycleApproach.chcfrucDuration());
    });
  }


  public static class PropMagicElmFound {

  }


  public static class TimerMoment {

  }
}
