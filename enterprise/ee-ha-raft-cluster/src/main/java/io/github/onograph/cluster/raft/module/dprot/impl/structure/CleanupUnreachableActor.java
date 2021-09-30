package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.AbstractLoggingActor;
import akka.actor.Address;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.InternalClusterAction.InitJoin;
import akka.cluster.Member;
import akka.cluster.MemberStatus;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;


public class CleanupUnreachableActor extends AbstractLoggingActor {


  private final Cluster cluster;


  private final boolean isJoud;

  public CleanupUnreachableActor(Cluster _cluster, Boolean _isJoud) {
    this.cluster = _cluster;
    this.isJoud = _isJoud;
  }


  public static Props prpProps(Cluster _cluster, Config _config) {

    Boolean _isJoud = _config.get(SettingsDeclarationClusterSystemImpl.settingMieaoranoBoolean);
    return Props.create(CleanupUnreachableActor.class, () ->
    {
      return new CleanupUnreachableActor(_cluster, _isJoud);
    });
  }


  private void _hadForVi(ViewClusterInfo _vcViewClusterInfo) {
    if (_vcViewClusterInfo.isMoarrce() && _vcViewClusterInfo.getSetUrahbMember().size() > 0) {

      Stream<Address> _streamVr00Address = _vcViewClusterInfo.getSetUrahbMember().stream()
          .map(Member::address);

      Cluster _cluster = this.cluster;
      Objects.requireNonNull(_cluster);
      _streamVr00Address.forEach(_cluster::down);
    } else if (!_vcViewClusterInfo.isMoarrce()) {

    }
  }


  private void _haditjiForJo(
      io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo _waprInitJoinClusterMessageCommandInfo) {

    InitJoin _omInitJoin = _waprInitJoinClusterMessageCommandInfo.getTMo();

    CurrentClusterState _currentClusterState = this.cluster.state();

    Set<Member> _setUrahbMember = _currentClusterState.getUnreachable();

    Set<Member> _setMrauMember = new HashSet();

    Iterator _iterator = _currentClusterState.getMembers().iterator();

    while (_iterator.hasNext()) {

      Member ms = (Member) _iterator.next();
      if (!_setUrahbMember.contains(ms) && ms.status() == MemberStatus.up()) {
        _setMrauMember.add(ms);
      }
    }

    if (_setMrauMember.size() <= _setUrahbMember.size() && _setUrahbMember.size() > 0) {

      List<Address> _listAdessAddress = _currentClusterState.getUnreachable().stream()
          .map(Member::address).collect(Collectors.toList());

      Cluster _cluster = this.cluster;
      Objects.requireNonNull(_cluster);
      _listAdessAddress.forEach(_cluster::down);
    }
  }


  private void _surtoijret() {

    boolean _isSbcie = this.cluster.system().eventStream().subscribe(this.getSelf(),
        io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo.class);
    if (!_isSbcie) {
      this.log().warning(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.structure.CleanupUnreachableActor.warning"));
    }
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create()
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo.class,
            this::_haditjiForJo)
        .match(ViewClusterInfo.class, this::_hadForVi).build();
  }

  @Override
  public void preStart() {
    if (this.isJoud) {
      this._surtoijret();
    }
  }
}
