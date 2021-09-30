package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.client.ClusterClientReceptionist;
import akka.japi.pf.ReceiveBuilder;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.ReadReplicateGdbMetaManager;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.time.Clock;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class DatabaseReadReplicaClusterStructureLoggingActor extends AbstractLoggingActor {


  public static final String TITLE = io.github.onograph.TokenConstants.CC_RR_TOPOLOGY_ACTOR;


  private final Map<DatabaseId, DatabaseCoreClusterStructure> mapCtdd = new HashMap();


  private final Map<ServerId, ConsensusGdbServerCoordinator> mapMmrsc = new HashMap();


  private final Map<DatabaseId, DatabaseReadReplicaClusterStructure> mapTrrdd = new HashMap();


  private final SourceQueueWithComplete<ReadReplicateGdbMeta> sourceQueueWithCompleteSsdReadReplicateGdbMeta;


  private final SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure;


  private LeaderMeta ildLeaderMeta;


  private Map<DatabaseId, ReadReplicateGdbMeta> mapSdmcdr = new HashMap();


  private Map<DatabaseId, ReadReplicateGdbMeta> mapSdmrdr = new HashMap();


  private Set<ActorRef> setCcmActorRef;


  private ShowReadReplicaInfo vrrShowReadReplicaInfo;


  DatabaseReadReplicaClusterStructureLoggingActor(Clock _clock,
      ClusterClientReceptionist _clusterClientReceptionist, Config _config,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure) {
    this.ildLeaderMeta = LeaderMeta.EMT_LEADER_META;
    this.setCcmActorRef = new HashSet();
    this.vrrShowReadReplicaInfo = ShowReadReplicaInfo.EMT_SHOW_READ_REPLICA_INFO;
    this.sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure = _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure;
    this.sourceQueueWithCompleteSsdReadReplicateGdbMeta = _sourceQueueWithCompleteSsdReadReplicateGdbMeta;

    Duration _rfehDuration = _config.get(SettingsDeclarationClusterImpl.settingCleorsDuration);

    Props _vrrProps = ReadReplicaClusterClientInfoActor.prpProps(_clock, _clusterClientReceptionist,
        this.getSelf(), _rfehDuration);
    this.getContext().actorOf(_vrrProps);

    Props _ccvProps = ClusterARInfoActor.prpProps(this.getSelf(),
        _clusterClientReceptionist.underlying());
    this.getContext().actorOf(_ccvProps);
  }


  public static Props prpProps(Clock _clock, ClusterClientReceptionist _clusterClientReceptionist,
      Config _config,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure) {
    return Props.create(DatabaseReadReplicaClusterStructureLoggingActor.class, () ->
    {
      return new DatabaseReadReplicaClusterStructureLoggingActor(_clock, _clusterClientReceptionist,
          _config,
          _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
          _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure);
    });
  }


  private void _adcrtoForDa(DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure) {
    this.mapCtdd.put(_tcDatabaseCoreClusterStructure.daasidDatabaseId(),
        _tcDatabaseCoreClusterStructure);
  }


  private void _bultolyForDa(DatabaseId _databaseId) {

    DatabaseReadReplicaClusterStructure _rrtDatabaseReadReplicaClusterStructure =
        this.vrrShowReadReplicaInfo.tordritpyDatabaseReadReplicaClusterStructure(_databaseId);

    this.sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure.offer(
        _rrtDatabaseReadReplicaClusterStructure);
    if (_rrtDatabaseReadReplicaClusterStructure.sevsMap().isEmpty()) {
      this.mapTrrdd.remove(_databaseId);
    } else {
      this.mapTrrdd.put(_databaseId, _rrtDatabaseReadReplicaClusterStructure);
    }
  }


  private void _buto() {

    Set<DatabaseId> _setIdrDatabaseId = this.vrrShowReadReplicaInfo.daasidSet();

    Set<DatabaseId> _setIdaDatabaseId = this.mapTrrdd.keySet().stream().filter((id) ->
    {
      return !_setIdrDatabaseId.contains(id);
    }).collect(Collectors.toSet());
    _setIdaDatabaseId.forEach(this::_bultolyForDa);
    _setIdrDatabaseId.forEach(this::_bultolyForDa);
  }


  private void _haectciviForSh(ShowClusterActorStructureMeta m) {
    this.setCcmActorRef = m.getSetCcActorRef();
    this._buto();
  }


  private void _haerrcvwForSh(ShowReadReplicaInfo m) {
    this.vrrShowReadReplicaInfo = m;
    this.mapSdmrdr = m.alrarldasstMap();
    this.mapSdmrdr.forEach((id, state) ->
    {
      this.sourceQueueWithCompleteSsdReadReplicateGdbMeta.offer(state);
    });
    this._buto();
  }


  private Stream<ActorRef> _kntociStream() {
    return this.vrrShowReadReplicaInfo.tooatfokwceStream(this.setCcmActorRef);
  }


  private void _secotpitForAc(ActorRef _cinActorRef) {

    Iterator _iterator = this.mapCtdd.values().iterator();

    while (_iterator.hasNext()) {

      DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure = (DatabaseCoreClusterStructure) _iterator.next();
      _cinActorRef.tell(_tcDatabaseCoreClusterStructure, this.getSelf());
    }
  }


  private void _sedassttForAc(ActorRef _cinActorRef) {

    Iterator _iterator = this.mapSdmcdr.values().iterator();

    ReadReplicateGdbMeta _srReadReplicateGdbMeta;
    while (_iterator.hasNext()) {
      _srReadReplicateGdbMeta = (ReadReplicateGdbMeta) _iterator.next();
      _cinActorRef.tell(_srReadReplicateGdbMeta, this.getSelf());
    }

    _iterator = this.mapSdmrdr.values().iterator();

    while (_iterator.hasNext()) {
      _srReadReplicateGdbMeta = (ReadReplicateGdbMeta) _iterator.next();
      _cinActorRef.tell(_srReadReplicateGdbMeta, this.getSelf());
    }
  }


  private void _sedteleioForLe(LeaderMeta _ilLeaderMeta) {
    this.ildLeaderMeta = _ilLeaderMeta;
  }


  private void _serampForAc(ActorRef _cinActorRef) {

    Iterator _iterator = this.mapMmrsc.values().iterator();

    while (_iterator.hasNext()) {

      ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator = (ConsensusGdbServerCoordinator) _iterator.next();
      _cinActorRef.tell(_mpigConsensusGdbServerCoordinator, this.getSelf());
    }
  }


  private void _sererptotForAc(ActorRef _cinActorRef) {

    Iterator _iterator = this.mapTrrdd.values().iterator();

    while (_iterator.hasNext()) {

      DatabaseReadReplicaClusterStructure _trrDatabaseReadReplicaClusterStructure = (DatabaseReadReplicaClusterStructure) _iterator.next();
      _cinActorRef.tell(_trrDatabaseReadReplicaClusterStructure, this.getSelf());
    }
  }


  private void _setogtocnForRe(
      io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment _inrdTimerMoment) {

    this._kntociStream().forEach((client) ->
    {
      this._sererptotForAc(client);
      this._secotpitForAc(client);
      client.tell(this.ildLeaderMeta, this.getSelf());
      this._sedassttForAc(client);
      this._serampForAc(client);
    });
  }


  private void _upecdasaForRe(ReadReplicateGdbMetaManager m) {
    this.mapSdmcdr = m.getMapDsdr();
  }


  private void _upemidtForCo(ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator) {
    this.mapMmrsc.put(_mpigConsensusGdbServerCoordinator.getServerId(),
        _mpigConsensusGdbServerCoordinator);
  }

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create().match(ReadReplicateGdbMetaManager.class, this::_upecdasaForRe)
        .match(ShowClusterActorStructureMeta.class, this::_haectciviForSh)
        .match(ShowReadReplicaInfo.class, this::_haerrcvwForSh)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClusterClientInfoActor.TimerMoment.class,
            this::_setogtocnForRe).match(DatabaseCoreClusterStructure.class, this::_adcrtoForDa)
        .match(LeaderMeta.class, this::_sedteleioForLe)
        .match(ConsensusGdbServerCoordinator.class, this::_upemidtForCo).build();
  }
}
