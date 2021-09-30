package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;


public class ClusterStructureMeta implements ClusterStructureChangeListener, LeaderChangeListener,
    ClusterInitializerMetaChangeListener, GdbMetaChangeListener,
    ConsensusGdbServerCoordinatorUpdateEventHandler {


  private final ConsensusNodeMonitor consensusNodeMonitor;


  private final ConsensusStateCordService consensusStateCordService;


  private final Log log;


  private final ReadReplicateGdbMetaClusterLog lsReadReplicateGdbMetaClusterLog;


  private final ClusterStructureLog ltClusterStructureLog;


  private final Map<DatabaseId, ReadReplicateGdbMeta> mapDbscdr;


  private final Map<DatabaseId, ReadReplicateGdbMeta> mapDbsrrdr;


  private final Map<DatabaseId, DatabaseCoreClusterStructure> mapDbtcdd;


  private final Map<DatabaseId, DatabaseReadReplicaClusterStructure> mapDbtrrdd;


  private volatile Map<ServerId, GdbDiscoveryMetaCoreImpl> mapIsbcsg;


  private volatile Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> mapIsbrrsg;


  private volatile Map<DatabaseId, NodeServerMemberLeaderMeta> mapMldrdn;


  private volatile ClusterInitMeta sbClusterInitMeta;


  ClusterStructureMeta(ConsensusNodeMonitor consensusNodeMonitor, JobScheduler _jobScheduler,
      LogProvider _logProvider) {
    this.sbClusterInitMeta = ClusterInitMeta.EMT_CLUSTER_INIT_META;
    this.mapDbtcdd = new ConcurrentHashMap();
    this.mapDbtrrdd = new ConcurrentHashMap();
    this.mapDbscdr = new ConcurrentHashMap();
    this.mapDbsrrdr = new ConcurrentHashMap();

    ScHolderJobScheduler _stScHolderJobScheduler = new ScHolderJobScheduler(_jobScheduler,
        _logProvider);
    this.log = _logProvider.getLog(this.getClass());
    this.mapIsbcsg = Collections.emptyMap();
    this.mapIsbrrsg = Collections.emptyMap();
    this.mapMldrdn = Collections.emptyMap();
    this.consensusNodeMonitor = consensusNodeMonitor;
    this.consensusStateCordService = new ConsensusStateCordService(this.log);
    this.ltClusterStructureLog = new ClusterStructureLog(this.getClass(), _logProvider,
        _stScHolderJobScheduler, this::_gealdbSet);
    this.lsReadReplicateGdbMetaClusterLog = new ReadReplicateGdbMetaClusterLog(this.getClass(),
        _logProvider, _stScHolderJobScheduler, this::_gealdbSet);
  }


  private static <T extends GdbDiscoveryMeta> Map<ServerId, T> _excsvifMap(
      Map<DatabaseId, ? extends ClusterStructure<T>> _mapTplgedc) {

    Map<ServerId, T> _mapRslst = new HashMap();

    Iterator _iterator = _mapTplgedc.values().iterator();

    while (_iterator.hasNext()) {

      ClusterStructure<T> _clusterStructureTplgT = (ClusterStructure) _iterator.next();

      Iterator _iterator2 = _clusterStructureTplgT.sevsMap().entrySet().iterator();

      while (_iterator2.hasNext()) {

        Entry<ServerId, T> _entryEtyst = (Entry) _iterator2.next();
        _mapRslst.put(_entryEtyst.getKey(), _entryEtyst.getValue());
      }
    }

    return Collections.unmodifiableMap(_mapRslst);
  }


  private static boolean _isHanmeeForCl(ClusterStructure<?> _clusterStructureTplgObject) {
    return _clusterStructureTplgObject.sevsMap().isEmpty();
  }


  private static String _nepdleString() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.nepdleString",
        System.lineSeparator());
  }


  private static String _prlrimString(Map<DatabaseId, NodeServerMemberLeaderMeta> _mapMildn,
      Map<DatabaseId, NodeServerMemberLeaderMeta> _mapMldodn) {

    HashSet<DatabaseId> _hashSetIdaDatabaseId = new HashSet(_mapMildn.keySet());
    _hashSetIdaDatabaseId.addAll(_mapMldodn.keySet());
    return _hashSetIdaDatabaseId.stream().map((dbId) ->
    {

      NodeServerMemberLeaderMeta _olNodeServerMemberLeaderMeta = _mapMldodn.get(dbId);

      NodeServerMemberLeaderMeta _lnNodeServerMemberLeaderMeta = _mapMildn.get(dbId);
      if (_olNodeServerMemberLeaderMeta == null) {
        return _lnNodeServerMemberLeaderMeta == null ? String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.format"),
            dbId) : String
            .format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.format2"),
                _lnNodeServerMemberLeaderMeta.getImConsensusNodeId(),
                _lnNodeServerMemberLeaderMeta.getLgT(), dbId);
      } else if (_lnNodeServerMemberLeaderMeta == null) {
        return String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.format3"),
            dbId,
            _olNodeServerMemberLeaderMeta.getImConsensusNodeId());
      } else if (!Objects.equals(_lnNodeServerMemberLeaderMeta.getImConsensusNodeId(),
          _olNodeServerMemberLeaderMeta.getImConsensusNodeId())) {
        return String
            .format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.format4"),
                dbId, _olNodeServerMemberLeaderMeta.getImConsensusNodeId(),
                _lnNodeServerMemberLeaderMeta.getImConsensusNodeId(),
                _lnNodeServerMemberLeaderMeta.getLgT());
      } else {
        return _lnNodeServerMemberLeaderMeta.getLgT() != _olNodeServerMemberLeaderMeta.getLgT()
            ? String
            .format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.format5"),
                dbId,
                _lnNodeServerMemberLeaderMeta.getImConsensusNodeId(),
                _lnNodeServerMemberLeaderMeta.getLgT()) : null;
      }
    }).filter(Objects::nonNull).collect(Collectors.joining(_nepdleString()));
  }


  private Set<DatabaseId> _gealdbSet() {
    return this.mapDbtcdd.keySet();
  }


  private Optional<DiscoveryGdbOperatorMetaWrapper> _lokstOptional(DatabaseId _databaseId,
      Map<DatabaseId, ReadReplicateGdbMeta> _mapSaedr, ServerId _serverId) {
    return Optional.ofNullable(_mapSaedr.get(_databaseId)).flatMap((replicated) ->
    {
      return replicated.sttfoOptional(_serverId);
    });
  }


  private void _noyrlnForDa(DatabaseId _databaseId) {
    synchronized (this.consensusNodeMonitor) {

      DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure = this.mapDbtcdd.get(
          _databaseId);
      if (_tcDatabaseCoreClusterStructure == null) {

      } else {
        this.consensusNodeMonitor.accept(_databaseId,
            _tcDatabaseCoreClusterStructure.reoeSet(this._revrtmeiorwBiFunction()));
      }
    }
  }


  private BiFunction<DatabaseId, ServerId, ConsensusNodeId> _revrtmeiorwBiFunction() {
    return (databaseId, serverId) ->
    {

      ConsensusNodeId _imConsensusNodeId = this.consensusStateCordService.revrtmefsrConsensusNodeId(
          databaseId, serverId);
      if (_imConsensusNodeId == null) {

      }

      return _imConsensusNodeId;
    };
  }


  public void clredForSe(ServerId _lclServerId) {

    Map<ServerId, GdbDiscoveryMetaCoreImpl> _mapCbsisg = this.mapIsbcsg;

    Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> _mapIsbrrsg = this.mapIsbrrsg;
    this.mapIsbcsg =
        _mapCbsisg.containsKey(_lclServerId) ? Map.of(_lclServerId, _mapCbsisg.get(_lclServerId))
            : Collections.emptyMap();
    this.mapIsbrrsg =
        _mapIsbrrsg.containsKey(_lclServerId) ? Map.of(_lclServerId, _mapIsbrrsg.get(_lclServerId))
            : Collections.emptyMap();
    this.mapMldrdn = Collections.emptyMap();
    this.sbClusterInitMeta = ClusterInitMeta.EMT_CLUSTER_INIT_META;

    ClusterStructureMaintainer _cdrClusterStructureMaintainer = new ClusterStructureMaintainer(
        _lclServerId);

    Objects.requireNonNull(_cdrClusterStructureMaintainer);
    this.mapDbtcdd.replaceAll(
        _cdrClusterStructureMaintainer::reertdactogDatabaseCoreClusterStructure);

    this.mapDbscdr.replaceAll(_cdrClusterStructureMaintainer::reertrledasReadReplicateGdbMeta);

    this.mapDbtrrdd.replaceAll(
        _cdrClusterStructureMaintainer::reertdarreatlsDatabaseReadReplicaClusterStructure);

    this.mapDbsrrdr.replaceAll(_cdrClusterStructureMaintainer::reertrledasReadReplicateGdbMeta);
    this.consensusStateCordService.clredForSe(_lclServerId);
  }


  ReadReplicateGdbMeta costfdteReadReplicateGdbMeta(NamedDatabaseId _namedDatabaseId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();
    return this.mapDbscdr.getOrDefault(_databaseId,
        ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(_databaseId, Map.of()));
  }


  public DatabaseCoreClusterStructure cotogfdaDatabaseCoreClusterStructure(
      NamedDatabaseId _namedDatabaseId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();

    DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure = this.mapDbtcdd.get(
        _databaseId);
    return _tplgDatabaseCoreClusterStructure != null ? _tplgDatabaseCoreClusterStructure
        : DatabaseCoreClusterStructure.emtDatabaseCoreClusterStructure(_databaseId);
  }


  public Optional<GdbDiscoveryMetaCoreImpl> gecrsvifOptional(ConsensusNodeId consensusNodeId) {
    return Optional.ofNullable(this.consensusStateCordService.revsvfrrmrServerId(consensusNodeId))
        .map((id) ->
        {
          return this.mapIsbcsg
              .get(id);
        });
  }


  public NodeServerMemberLeaderMeta geldNodeServerMemberLeaderMeta(
      NamedDatabaseId _namedDatabaseId) {
    return this.mapMldrdn.get(_namedDatabaseId.databaseId());
  }


  public Map<ServerId, GdbDiscoveryMetaCoreImpl> getMapIsbcsg() {
    return this.mapIsbcsg;
  }


  public Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> getMapIsbrrsg() {
    return this.mapIsbrrsg;
  }


  ClusterInitMeta getSbClusterInitMeta() {
    return this.sbClusterInitMeta;
  }

  @Override
  public void handleChange(ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator) {

    Set<DatabaseId> _setIdcDatabaseId = this.consensusStateCordService.upaSet(
        _mpigConsensusGdbServerCoordinator);
    _setIdcDatabaseId.forEach(this::_noyrlnForDa);
  }

  @Override
  public void onbtpseutForCl(ClusterInitMeta _sbnClusterInitMeta) {
    this.sbClusterInitMeta = Objects.requireNonNull(_sbnClusterInitMeta);
  }

  @Override
  public void ondleueForMa(Map<DatabaseId, NodeServerMemberLeaderMeta> _mapMildn) {
    if (!_mapMildn.equals(this.mapMldrdn)) {

      this.mapMldrdn = _mapMildn;
    }
  }

  @Override
  public void ondstupForRe(ReadReplicateGdbMeta _snReadReplicateGdbMeta) {

    String _strDc = _snReadReplicateGdbMeta.getIsSc() ? io.github.onograph.TokenConstants.CORE
        : io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.var");
    _strDc = _strDc + io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.var2");

    Map<DatabaseId, ReadReplicateGdbMeta> _mapDbsdr =
        _snReadReplicateGdbMeta.getIsSc() ? this.mapDbscdr : this.mapDbsrrdr;

    DatabaseId _databaseId = _snReadReplicateGdbMeta.getDatabaseId();

    ReadReplicateGdbMeta _spReadReplicateGdbMeta = _mapDbsdr.put(_databaseId,
        _snReadReplicateGdbMeta);
    if (!Objects.equals(_spReadReplicateGdbMeta, _snReadReplicateGdbMeta)) {
      if (_spReadReplicateGdbMeta == null) {
        _spReadReplicateGdbMeta =
            _snReadReplicateGdbMeta.getIsSc() ? ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
                _databaseId, Map.of())
                : ReadReplicateGdbMeta.ofrerlaReadReplicateGdbMeta(_databaseId, Map.of());
      }

      this.lsReadReplicateGdbMetaClusterLog.locnForStTT(_strDc, _snReadReplicateGdbMeta,
          _spReadReplicateGdbMeta);
    }

    if (_snReadReplicateGdbMeta.isEmy()) {
      _mapDbsdr.remove(_databaseId, _snReadReplicateGdbMeta);
    }
  }

  @Override
  public void ontoueForDa(DatabaseCoreClusterStructure _nctDatabaseCoreClusterStructure) {

    DatabaseId _databaseId = _nctDatabaseCoreClusterStructure.daasidDatabaseId();

    DatabaseCoreClusterStructure _tccDatabaseCoreClusterStructure = this.mapDbtcdd.put(_databaseId,
        _nctDatabaseCoreClusterStructure);
    if (!Objects.equals(_tccDatabaseCoreClusterStructure, _nctDatabaseCoreClusterStructure)) {
      if (_tccDatabaseCoreClusterStructure == null) {
        _tccDatabaseCoreClusterStructure = DatabaseCoreClusterStructure.emtDatabaseCoreClusterStructure(
            _databaseId);
      }

      this.mapIsbcsg = _excsvifMap(this.mapDbtcdd);
      this.ltClusterStructureLog.locnForStTT(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.locnForStTT"),
          _nctDatabaseCoreClusterStructure, _tccDatabaseCoreClusterStructure);
      this._noyrlnForDa(_databaseId);
    }

    if (_isHanmeeForCl(_nctDatabaseCoreClusterStructure)) {
      this.mapDbtcdd.remove(_databaseId, _nctDatabaseCoreClusterStructure);
    }
  }

  @Override
  public void ontoueForDa(
      DatabaseReadReplicaClusterStructure _trrnDatabaseReadReplicaClusterStructure) {

    DatabaseId _databaseId = _trrnDatabaseReadReplicaClusterStructure.daasidDatabaseId();

    DatabaseReadReplicaClusterStructure _trrcDatabaseReadReplicaClusterStructure =
        this.mapDbtrrdd.put(_databaseId, _trrnDatabaseReadReplicaClusterStructure);
    if (!Objects.equals(_trrcDatabaseReadReplicaClusterStructure,
        _trrnDatabaseReadReplicaClusterStructure)) {
      if (_trrcDatabaseReadReplicaClusterStructure == null) {
        _trrcDatabaseReadReplicaClusterStructure = DatabaseReadReplicaClusterStructure.emtDatabaseReadReplicaClusterStructure(
            _databaseId);
      }

      this.mapIsbrrsg = _excsvifMap(this.mapDbtrrdd);
      this.ltClusterStructureLog.locnForStTT(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureMeta.locnForStTT2"),
          _trrnDatabaseReadReplicaClusterStructure, _trrcDatabaseReadReplicaClusterStructure);
    }

    if (_isHanmeeForCl(_trrnDatabaseReadReplicaClusterStructure)) {
      this.mapDbtrrdd.remove(_databaseId, _trrnDatabaseReadReplicaClusterStructure);
    }
  }


  SocketAddress reectsraeSocketAddress(ServerId _serverId) {

    GdbDiscoveryMetaCoreImpl _csiGdbDiscoveryMetaCoreImpl = this.mapIsbcsg.get(_serverId);
    if (_csiGdbDiscoveryMetaCoreImpl != null) {
      return _csiGdbDiscoveryMetaCoreImpl.cacpsrrSocketAddress();
    } else {

      GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl = this.mapIsbrrsg.get(
          _serverId);
      if (_irrGdbDiscoveryMetaReadReplicaImpl != null) {
        return _irrGdbDiscoveryMetaReadReplicaImpl.cacpsrrSocketAddress();
      } else {

        return null;
      }
    }
  }


  ReadReplicateGdbMeta rereasefdaReadReplicateGdbMeta(NamedDatabaseId _namedDatabaseId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();
    return this.mapDbsrrdr
        .getOrDefault(_databaseId,
            ReadReplicateGdbMeta.ofrerlaReadReplicateGdbMeta(_databaseId, Map.of()));
  }


  public DatabaseReadReplicaClusterStructure rereatlfodaDatabaseReadReplicaClusterStructure(
      NamedDatabaseId _namedDatabaseId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();

    DatabaseReadReplicaClusterStructure _tplgDatabaseReadReplicaClusterStructure = this.mapDbtrrdd.get(
        _databaseId);
    return _tplgDatabaseReadReplicaClusterStructure != null
        ? _tplgDatabaseReadReplicaClusterStructure
        : DatabaseReadReplicaClusterStructure.emtDatabaseReadReplicaClusterStructure(_databaseId);
  }


  public ConsensusNodeId revrtmefsrConsensusNodeId(DatabaseId _databaseId, ServerId _serverId) {
    return this.consensusStateCordService.revrtmefsrConsensusNodeId(_databaseId, _serverId);
  }


  public ServerId revsvfrrmrServerId(ConsensusNodeId _imConsensusNodeId) {
    return this.consensusStateCordService.revsvfrrmrServerId(_imConsensusNodeId);
  }


  public ClusterNodeRoleType rolClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();

    DatabaseReadReplicaClusterStructure _trDatabaseReadReplicaClusterStructure = this.mapDbtrrdd.get(
        _databaseId);

    DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure = this.mapDbtcdd.get(_databaseId);
    if (_tcDatabaseCoreClusterStructure != null && _tcDatabaseCoreClusterStructure.sevsMap()
        .containsKey(_serverId)) {

      NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta =
          this.mapMldrdn.getOrDefault(_databaseId,
              NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META);

      ConsensusNodeId consensusNodeId = this.revrtmefsrConsensusNodeId(
          _namedDatabaseId.databaseId(), _serverId);
      return Objects.equals(consensusNodeId, _ilNodeServerMemberLeaderMeta.getImConsensusNodeId())
          ? ClusterNodeRoleType.LEADER
          : ClusterNodeRoleType.FOLLOWER;
    } else {
      return _trDatabaseReadReplicaClusterStructure != null
          && _trDatabaseReadReplicaClusterStructure.sevsMap().containsKey(_serverId)
          ? ClusterNodeRoleType.READ_REPLICA : ClusterNodeRoleType.UNKNOWN;
    }
  }


  DiscoveryGdbOperatorMetaWrapper sttfoDiscoveryGdbOperatorMetaWrapper(
      NamedDatabaseId _namedDatabaseId, ServerId _serverId) {

    DatabaseId _databaseId = _namedDatabaseId.databaseId();
    return this._lokstOptional(_databaseId, this.mapDbscdr, _serverId).or(() ->
        {
          return this
              ._lokstOptional(_databaseId, this.mapDbsrrdr,
                  _serverId);
        })
        .orElse(DiscoveryGdbOperatorMetaWrapper.unnnDiscoveryGdbOperatorMetaWrapper(
            _namedDatabaseId.databaseId()));
  }
}
