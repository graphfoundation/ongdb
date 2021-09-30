package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ddata.LWWMap;
import akka.cluster.ddata.LWWMapKey;
import akka.cluster.ddata.LWWRegister;
import akka.cluster.ddata.LWWRegister.Clock;
import akka.cluster.ddata.Replicator.Get;
import akka.cluster.ddata.Replicator.GetSuccess;
import akka.cluster.ddata.Replicator.ReadConsistency;
import akka.cluster.ddata.Replicator.ReadFrom;
import akka.cluster.ddata.Replicator.UpdateFailure;
import akka.cluster.ddata.Replicator.UpdateSuccess;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType;
import io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.neo4j.kernel.database.DatabaseId;


public class ConsensusDatabaseIdActor extends
    AbstractAkkaSyncableDataActor.AbstractASDALWWMap<ConsensusMemberGroupId, ConsensusNodeId> {


  private final Clock<ConsensusNodeId> clockCokConsensusNodeId = LWWRegister.reverseClock();


  private final ActorRef ctaActorRef;


  private final int iSqrm;


  ConsensusDatabaseIdActor(Cluster _cluster, ActorRef _ctaActorRef, int _iCrm,
      ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef) {
    super(_cluster, LWWMapKey::create, ClusterDataType.CDT_CONS_ID_HDLR, _mntrClusterDataWatcher,
        _rpiaoActorRef, LWWMap::create);
    this.ctaActorRef = _ctaActorRef;
    this.iSqrm = _iCrm / 2 + 1;
  }


  public static Props prpProps(ActorRef _atcActorRef, Cluster _cluster, int _iCrm,
      ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef) {
    return Props.create(ConsensusDatabaseIdActor.class, () ->
    {
      return new ConsensusDatabaseIdActor(_cluster, _atcActorRef, _iCrm, _mntrClusterDataWatcher,
          _rpiaoActorRef);
    });
  }


  private LWWMap<ConsensusMemberGroupId, ConsensusNodeId> _adrtiLWWMap(
      LWWMap<ConsensusMemberGroupId, ConsensusNodeId> _lWWMapAcc,
      Entry<DatabaseId, ConsensusNodeId> _entryEtydc) {

    ConsensusMemberGroupId _irConsensusMemberGroupId = new ConsensusMemberGroupId(
        _entryEtydc.getKey().uuid());

    ConsensusNodeId _imConsensusNodeId = _entryEtydc.getValue();
    return _lWWMapAcc.put(this.cluster, _irConsensusMemberGroupId, _imConsensusNodeId,
        this.clockCokConsensusNodeId);
  }


  private void _haeutflForRe(UpdateFailure<?> _updateFailureFuObject) {
    _updateFailureFuObject.getRequest().filter((m) ->
    {
      return m instanceof SetupConsensusDatabaseId;
    }).map((m) ->
    {
      return (SetupConsensusDatabaseId) m;
    }).ifPresent((request) ->
    {

      String m =
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusDatabaseIdActor.format"),
              request);
      this.log().warning(m);
      request.getTrActorRef()
          .tell(ConsensusIdStatusType.POS_COMPUB, this.getSelf());
    });
  }


  private void _haeutscForRe(UpdateSuccess<?> _updateSuccessSuObject) {
    _updateSuccessSuObject.getRequest().filter((m) ->
    {
      return m instanceof SetupConsensusDatabaseId;
    }).map((m) ->
    {
      return (SetupConsensusDatabaseId) m;
    }).ifPresent((m) ->
    {

      ReadConsistency _readConsistency =
          new ReadFrom(this.iSqrm, m.getTmotDuration());

      Get<LWWMap<ConsensusMemberGroupId, ConsensusNodeId>> _getOgLWWMap =
          new Get(this.k, _readConsistency, Optional.of(m));
      this.relarActorRef.tell(_getOgLWWMap, this.getSelf());
    });
  }


  private void _sertiForSe(SetupConsensusDatabaseId m) {

    this.moyriddForKeFuM((map) ->
    {
      return map.put(this.cluster, m.getConsensusMemberGroupId(), m.getPbihrConsensusNodeId(),
          this.clockCokConsensusNodeId);
    }, this.k, m.trActorRef(this.getSender()));
  }


  private void _vaarfiupForRe(
      GetSuccess<LWWMap<ConsensusMemberGroupId, ConsensusNodeId>> _getSuccessSgLWWMap) {

    LWWMap<ConsensusMemberGroupId, ConsensusNodeId> _lWWMapCretcc = _getSuccessSgLWWMap.get(this.k);
    _getSuccessSgLWWMap.getRequest().filter((m) ->
    {
      return m instanceof SetupConsensusDatabaseId;
    }).map((m) ->
    {
      return (SetupConsensusDatabaseId) m;
    }).ifPresent((request) ->
    {

      ConsensusNodeId _psConsensusNodeId =
          _lWWMapCretcc.getEntries().get(request.getConsensusMemberGroupId());

      ConsensusIdStatusType reslt;
      if (_psConsensusNodeId == null) {
        reslt = ConsensusIdStatusType.POS_COMPUB;
      } else if (Objects.equals(_psConsensusNodeId, request.getPbihrConsensusNodeId())) {
        reslt = ConsensusIdStatusType.OK_PUB_CALLER;
      } else {
        reslt = ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER;
      }

      request.getTrActorRef().tell(reslt, this.getSelf());
    });
  }

  @Override
  protected int dameii() {
    return ((LWWMap) this.tDat).underlying().keys().vvector().size();
  }

  @Override
  protected int damevl() {
    return this.tDat.size();
  }

  @Override
  protected void haecoenForRe(ReceiveBuilder _receiveBuilder) {
    _receiveBuilder.match(SetupConsensusDatabaseId.class, this::_sertiForSe)
        .match(UpdateSuccess.class, this::_haeutscForRe)
        .match(GetSuccess.class, this::_vaarfiupForRe)
        .match(UpdateFailure.class, this::_haeutflForRe);
  }

  @Override
  protected void haeimdaForT(LWWMap<ConsensusMemberGroupId, ConsensusNodeId> _lWWMapDncc) {
    this.tDat = _lWWMapDncc;
    this.ctaActorRef.tell(new ConsensusGdbsReady(((LWWMap) this.tDat).getEntries()),
        this.getSelf());
  }

  @Override
  protected void seinldtrloForGd(GdbServerPointInTime gdbServerPointInTime) {

    Predicate<Entry<DatabaseId, ConsensusNodeId>> _predicatePiriEntry = (entry) ->
    {
      return gdbServerPointInTime.daassteMap().containsKey(entry.getKey()) &&
          gdbServerPointInTime.daassteMap().get(entry.getKey()).operatorState()
              != OperatorStateEnterpriseTypeImpl.SETI_IS;
    };

    LWWMap<ConsensusMemberGroupId, ConsensusNodeId> _lWWMapMirlcc = gdbServerPointInTime.daammhMap()
        .entrySet().stream().filter(_predicatePiriEntry)
        .reduce(LWWMap.create(), this::_adrtiLWWMap, LWWMap::merge);
    if (!_lWWMapMirlcc.isEmpty()) {
      this.moyriddForKeFuM((map) ->
      {
        return map.merge(_lWWMapMirlcc);
      }, this.k);
    }
  }
}
