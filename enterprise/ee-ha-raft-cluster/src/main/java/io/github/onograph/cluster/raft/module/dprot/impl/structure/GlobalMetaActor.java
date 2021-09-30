package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.cluster.ClusterEvent.ClusterDomainEvent;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.ClusterEvent.LeaderChanged;
import akka.cluster.ClusterEvent.MemberRemoved;
import akka.cluster.ClusterEvent.MemberUp;
import akka.cluster.ClusterEvent.MemberWeaklyUp;
import akka.cluster.ClusterEvent.ReachableMember;
import akka.cluster.ClusterEvent.UnreachableMember;
import akka.cluster.Member;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterMembersWatcher;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.time.Duration;
import org.neo4j.configuration.Config;


public class GlobalMetaActor extends AbstractActorLoggingAndTimersImpl {


  private static final String DONG_SPCLX_MK =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.var");


  private static final String MOIR_TIC_MK =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.var2");


  private final ActorRef adActorRef;


  private final ActorRef amActorRef;


  private final ActorRef atActorRef;


  private final Cluster cluster;


  private final Duration cswDuration;


  private final ClusterMembersWatcher mntrClusterMembersWatcher;


  private ViewClusterInfo vcViewClusterInfo;


  public GlobalMetaActor(ActorRef _adActorRef, ActorRef _atActorRef, Cluster _cluster,
      Config _config, ActorRef _maActorRef, ClusterMembersWatcher _mntrClusterMembersWatcher) {
    this.vcViewClusterInfo = ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    this.cluster = _cluster;
    this.atActorRef = _atActorRef;
    this.adActorRef = _adActorRef;
    this.amActorRef = _maActorRef;
    this.mntrClusterMembersWatcher = _mntrClusterMembersWatcher;
    this.cswDuration = _config.get(SettingsDeclarationClusterSystemImpl.settingAkaeceetlDuration)
        .plus(_config.get(SettingsDeclarationClusterSystemImpl.settingAkaeccaeeuDuration));
  }


  static Props prpProps(ActorRef _adActorRef, ActorRef _amActorRef, ActorRef _atActorRef,
      Cluster _cluster, Config _config, ClusterMembersWatcher _mntrClusterMembersWatcher) {
    return Props.create(GlobalMetaActor.class, () ->
    {
      return new GlobalMetaActor(_adActorRef, _atActorRef, _cluster, _config, _amActorRef,
          _mntrClusterMembersWatcher);
    });
  }


  private void _hadmbuForCl(MemberUp ev) {

    this.vcViewClusterInfo = this.vcViewClusterInfo.member(ev.member());
    this._seclrv();
  }


  private void _haececusForCl(CurrentClusterState ev) {
    this.vcViewClusterInfo = new ViewClusterInfo(ev);

    this._seclrv();
  }


  private void _haelecnForCl(LeaderChanged ev) {

    this.vcViewClusterInfo = this.vcViewClusterInfo.isCnegd(ev.leader().isDefined());
    this._seclrv();
  }


  private void _haemeroForCl(MemberRemoved ev) {

    Member _member = ev.member();
    this.vcViewClusterInfo = this.vcViewClusterInfo.ignoreMember(_member);
    this._seclrv();

    FinishClear _cmFinishClear = new FinishClear(_member.uniqueAddress());
    this.amActorRef.tell(_cmFinishClear, this.getSelf());
  }


  private void _haemewkuForCl(MemberWeaklyUp ev) {

    this.vcViewClusterInfo = this.vcViewClusterInfo.member(ev.member());
    this._seclrv();
  }


  private void _haeorcteeForCl(ClusterDomainEvent ev) {

    this._rednte();
  }


  private void _haerhmrForCl(ReachableMember ev) {

    this.vcViewClusterInfo = this.vcViewClusterInfo.ignoreUnresponsiveMember(ev.member());
    this._seclrv();
  }


  private void _haeualmbForCl(UnreachableMember ev) {

    this.vcViewClusterInfo = this.vcViewClusterInfo.unresponsiveMember(ev.member());
    this._seclrv();
  }


  private void _noydiatForGl(
      io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.ClmiStat _inrdClmiStat) {

    this.adActorRef.tell(this.vcViewClusterInfo, this.getSelf());
  }


  private void _rednte() {
    this.timers().startSingleTimer(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.startSingleTimer"),
        io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.ClmiStat.IT,
        this.cswDuration);
  }


  private void _seclrv() {
    this.atActorRef.tell(this.vcViewClusterInfo, this.getSelf());
    this._upamir();
    this._rednte();
  }


  private void _upamir() {
    this.mntrClusterMembersWatcher.sembs(this.vcViewClusterInfo.getMbrs().size());
    this.mntrClusterMembersWatcher.seuehl(this.vcViewClusterInfo.getSetUrahbMember().size());
    this.mntrClusterMembersWatcher.secvg(this.vcViewClusterInfo.getIsCnegd());
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(CurrentClusterState.class, this::_haececusForCl)
        .match(ReachableMember.class, this::_haerhmrForCl)
        .match(UnreachableMember.class, this::_haeualmbForCl)
        .match(MemberUp.class, this::_hadmbuForCl).match(MemberWeaklyUp.class, this::_haemewkuForCl)
        .match(MemberRemoved.class, this::_haemeroForCl)
        .match(LeaderChanged.class, this::_haelecnForCl)
        .match(ClusterDomainEvent.class, this::_haeorcteeForCl)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.ClmiStat.class,
            this::_noydiatForGl)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.StackWatcherInfo.class,
            (ignored) ->
            {
              this._upamir();
            }).build();
  }

  @Override
  public void postStop() {
    this.cluster.unsubscribe(this.getSelf());
  }

  @Override
  public void preStart() {
    this.cluster.subscribe(this.getSelf(), ClusterEvent.initialStateAsSnapshot(),
        ClusterDomainEvent.class, UnreachableMember.class);
    this.getTimers().startPeriodicTimer(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.startPeriodicTimer"),
        io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.StackWatcherInfo.IT,
        Duration.ofMinutes(1L));
  }


  private static class ClmiStat {


    static final io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.ClmiStat IT =
        new io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.ClmiStat();
  }


  static class StackWatcherInfo {


    static final io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.StackWatcherInfo IT =
        new io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor.StackWatcherInfo();

    private StackWatcherInfo() {
    }
  }
}
