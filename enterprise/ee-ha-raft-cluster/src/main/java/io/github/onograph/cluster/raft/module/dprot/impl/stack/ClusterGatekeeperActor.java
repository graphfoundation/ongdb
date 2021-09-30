package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.ActorRef;
import akka.actor.Address;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.Member;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.config.ClusterMemberLimitAtCreationDTO;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;


public class ClusterGatekeeperActor extends AbstractActorLoggingAndTimersImpl {


  public static final String TITLE = io.github.onograph.TokenConstants.JOINER;


  static final String AKAHE = io.github.onograph.TokenConstants.AKKA;


  private static final String TIE =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.var");


  private final Cluster cluster;


  private final ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO;


  private final boolean isCabtcaa;


  private final MemberNodeService rmrMemberNodeService;


  private final ActorRef rnlaActorRef;


  private final Duration rtyDuration;


  private ClusterGatekeeperActor(ActorRef _alnrActorRef, Cluster _cluster,
      ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO, Config _config,
      MemberNodeService _rmrMemberNodeService) {
    this.cluster = _cluster;
    this.rnlaActorRef = _alnrActorRef;
    this.rmrMemberNodeService = _rmrMemberNodeService;
    this.rtyDuration = _config.get(SettingsDeclarationClusterSystemImpl.settingCledeitDuration);
    this.clusterMemberLimitAtCreationDTO = clusterMemberLimitAtCreationDTO;
    this.isCabtcaa = _config.get(SettingsDeclarationClusterSystemImpl.settingMiealneoaBoolean);
  }


  public static Props prpProps(ActorRef _alnrActorRef, Cluster _cluster,
      ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO, Config _config,
      MemberNodeService _rsleMemberNodeService) {
    return Props.create(ClusterGatekeeperActor.class, () ->
    {
      return new ClusterGatekeeperActor(_alnrActorRef, _cluster, clusterMemberLimitAtCreationDTO,
          _config, _rsleMemberNodeService);
    });
  }


  private boolean _isSeacsyrrinea() {

    CurrentClusterState _currentClusterState = this.cluster.state();

    Member _mslMember = this.cluster.selfMember();
    if (_currentClusterState != null && _currentClusterState.members().size() > 0 &&
        _currentClusterState.members().size() < this.clusterMemberLimitAtCreationDTO.getVal()
        && _currentClusterState.members().contains(_mslMember) &&
        _currentClusterState.getUnreachable().size() == 0) {

      this.rnlaActorRef.tell(
          new io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.PropMagicElmFound(),
          this.self());
      return true;
    } else {
      return false;
    }
  }


  private void _joiForJo(JoinCluster m) {

    if (!this._isSeacsyrrinea()) {
      if (m.getIsRr()) {

        ArrayList<Address> _arrayListNsAddress = this._reoeArrayList();
        _arrayListNsAddress.addAll(m.allList().stream().filter((a) ->
        {
          return !_arrayListNsAddress.contains(a);
        }).collect(Collectors.toList()));

        this.cluster.joinSeedNodes(_arrayListNsAddress);
        this._strtirForJo(this.rmrMemberNodeService.isRevoevjoat() ? m
            : m.collectionNsAddress(_arrayListNsAddress));
      } else {
        if (!m.isHaars()) {

          throw new IllegalStateException("*** Error:  8a6eab47-9a47-443f-9830-994ee290cb32");
        }

        List<Address> _listAdessAddress = m.allList();

        this.cluster.joinSeedNodes(_listAdessAddress);
        this._strtirForJo(this.isCabtcaa ? m.wirodaeJoinCluster() : m);
      }
    }
  }


  private void _lojidieForIt(Iterable<Member> _iterableMmesMember) {

    List<String> _listAmString = new LinkedList();

    Iterator _iterator = _iterableMmesMember.iterator();

    while (_iterator.hasNext()) {

      Member ms = (Member) _iterator.next();

      String _strVr00 = ms.address().host().get();
      _listAmString.add(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.add",
              _strVr00, ms.address().port().get()));
    }


  }


  private ArrayList<Address> _reoeArrayList() {
    return this.rmrMemberNodeService.reoeCollection(this::_toakarsAddress, ArrayList::new);
  }


  private void _strtirForJo(JoinCluster m) {
    this.getTimers().startSingleTimer(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.startSingleTimer"),
        m, this.rtyDuration);
  }


  private Address _toakarsAddress(SocketAddress _arSocketAddress) {
    return new Address(io.github.onograph.TokenConstants.AKKA, this.getContext().getSystem().name(),
        TypesafeManagementAdapter.hotmString(_arSocketAddress),
        _arSocketAddress.getPort());
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(JoinCluster.class, this::_joiForJo).build();
  }

  @Override
  public void preStart() {
    this.cluster.registerOnMemberUp(() ->
    {
      this._lojidieForIt(this.cluster.state().getMembers());
      this.getTimers().cancel(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.cancel"));
      this.getContext().stop(this.getSelf());
    });
  }
}
