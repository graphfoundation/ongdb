package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.cluster.UniqueAddress;
import com.typesafe.config.ConfigFactory;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.AbstractJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.ConsensusDatabaseIdWrapperJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.ConsensusGdbServerCoordinatorSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.CoreGDMCWJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlyJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseReadReplicaClusterStructureJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbDiscoveryMetaReadReplicaImplJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.LeaderMetaJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberIdWrapperJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.RemoveReadReplicaNodeJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.UpdateReadReplicaInfoJSerializer;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.config.ClusterMemberLimitAtCreationDTO;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Level;


public final class TypesafeManagementAdapter {

  static final String ACTOR_PREFIX = "akka.actor";


  static final String DICE_STD_DIPCR = io.github.onograph.TokenConstants.DEFAULT_DISPATCHER;


  static final String DIVISH = io.github.onograph.TokenConstants.DISCOVERY_TO_NEO4J_DISPATCHER;


  static final String LONPE = io.github.onograph.TokenConstants.LOGGING_DISPATCHER;


  private final ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO;


  private final Config config;


  private final DiscoveryInitialProcChecker dsfDiscoveryInitialProcChecker;


  private final io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType taArteryRemotingType;


  public TypesafeManagementAdapter(ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO,
      Config _config, DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker,
      io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType _taArteryRemotingType) {
    this.clusterMemberLimitAtCreationDTO = clusterMemberLimitAtCreationDTO;
    this.config = _config;
    this.dsfDiscoveryInitialProcChecker = _dsfDiscoveryInitialProcChecker;
    this.taArteryRemotingType = _taArteryRemotingType;
  }


  private static Neo4jLogLevelWrapper _loleNeo4jLogLevelWrapper(Config _config) {

    Level _cniueLevel = _config.get(SettingsDeclarationClusterImpl.settingMielneLevel);
    return Neo4jLogLevelWrapper.frmnolelNeo4jLogLevelWrapper(_cniueLevel);
  }


  static String hotmString(SocketAddress _socketAddress) {
    return _socketAddress.isIPv6() ? io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.hotmString",
        _socketAddress.getHostname())
        : _socketAddress.getHostname().toLowerCase();
  }


  private <T, M extends AbstractJSerializer<T>> void _adsiirForClClMa(Class<M> _classSraieM,
      Class<T> m, Map<String, Object> _mapMcso) {

    String _strSc = m.getSimpleName() + io.github.onograph.TokenConstants._SERIALIZER;
    _mapMcso.put(ACTOR_PREFIX + ".serializers." + _strSc, _classSraieM.getCanonicalName());
    _mapMcso.put(ACTOR_PREFIX + ".serialization-bindings.\"" + m.getCanonicalName() + "\"", _strSc);
  }


  private com.typesafe.config.Config _clsrcngConfig() {

    Map<String, Object> _mapMcso = new HashMap();
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__CLUSTER__MIN_NR_OF_MEMBERS,
        this.clusterMemberLimitAtCreationDTO.getVal());

    Setting<Duration> _settingCtnsDuration =
        this.dsfDiscoveryInitialProcChecker.isFitsauBoolean()
            ? SettingsDeclarationClusterSystemImpl.settingMieaedenttDuration
            : SettingsDeclarationClusterSystemImpl.settingMieaedeDuration;

    long _lgMtsc = this.config.get(_settingCtnsDuration).toMillis();
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__CLUSTER__SEED_NODE_TIMEOUT,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put4",
            _lgMtsc));
    return ConfigFactory.parseMap(_mapMcso);
  }


  private com.typesafe.config.Config _ditcgConfig() {

    Map<String, Object> _mapMcso = new HashMap();

    Integer _iSp = this.config.get(SettingsDeclarationClusterSystemImpl.settingMieairleInteger);
    this._fojodshForMaInSt(_iSp, _mapMcso,
        io.github.onograph.TokenConstants.DISCOVERY_TO_NEO4J_DISPATCHER);

    Integer _iPd = this.config.get(SettingsDeclarationClusterSystemImpl.settingMieaetlseInteger);
    this._fojodshForMaInSt(_iPd, _mapMcso, io.github.onograph.TokenConstants.DEFAULT_DISPATCHER);
    _mapMcso.put(io.github.onograph.TokenConstants.LOGGING_DISPATCHER__TYPE,
        io.github.onograph.TokenConstants.DISPATCHER);
    _mapMcso.put(io.github.onograph.TokenConstants.LOGGING_DISPATCHER__EXECUTOR,
        io.github.onograph.TokenConstants.THREAD_POOL_EXECUTOR);
    _mapMcso.put(
        io.github.onograph.TokenConstants.LOGGING_DISPATCHER__THREAD_POOL_EXECUTOR__FIXED_POOL_SIZE,
        1);
    _mapMcso.put(io.github.onograph.TokenConstants.LOGGING_DISPATCHER__THROUGHPUT, 1);
    return ConfigFactory.parseMap(_mapMcso);
  }


  private com.typesafe.config.Config _fardecgConfig() {

    Map<String, Object> _mapMcso = new HashMap();

    long _lgMih = this.config.get(SettingsDeclarationClusterSystemImpl.settingAkaeceetlDuration)
        .toMillis();
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__HEARTBEAT_INTERVAL,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put5",
            _lgMih));

    Double _trsodDouble = this.config.get(
        SettingsDeclarationClusterSystemImpl.settingAkaechoDouble);
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__THRESHOLD,
        _trsodDouble);

    Integer _iSsm = this.config.get(SettingsDeclarationClusterSystemImpl.settingAkaecapzInteger);
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MAX_SAMPLE_SIZE,
        _iSsm);

    long _lgMdsm = this.config.get(SettingsDeclarationClusterSystemImpl.settingAkaecidtDuration)
        .toMillis();
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MIN_STD_DEVIATION,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put6",
            _lgMdsm));

    long _lgAhpm =
        this.config.get(SettingsDeclarationClusterSystemImpl.settingAkaeccaeeuDuration).toMillis();
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__ACCEPTABLE_HEARTBEAT_PAUSE,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put7",
            _lgAhpm));

    Integer _iMonbm = this.config.get(
        SettingsDeclarationClusterSystemImpl.settingAkaecornesInteger);
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MONITORED_BY_NR_OF_MEMBERS,
        _iMonbm);

    long _lgEram =
        this.config.get(SettingsDeclarationClusterSystemImpl.settingAkaecxepaDuration).toMillis();
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__EXPECTED_RESPONSE_AFTER,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put8",
            _lgEram));
    return ConfigFactory.parseMap(_mapMcso);
  }


  private void _fojodshForMaInSt(Integer _iPrlei, Map<String, Object> _mapMcso, String _strNd) {
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put9",
        _strNd), io.github.onograph.TokenConstants.DISPATCHER);
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put10",
        _strNd), io.github.onograph.TokenConstants.FORK_JOIN_EXECUTOR);
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put11",
        _strNd), _iPrlei);
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put12",
        _strNd), 1.0D);
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put13",
        _strNd), _iPrlei);
    _mapMcso.put(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put14",
        _strNd), 10);
  }


  private com.typesafe.config.Config _loggcngConfig() {

    HashMap<String, Object> _hashMapMcso = new HashMap();
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__LOGGERS,
        Collections.singletonList(MessageLoggerActor.class.getCanonicalName()));
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__LOGLEVEL,
        _loleNeo4jLogLevelWrapper(this.config).toString());
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__LOGGING_FILTER,
        LoggingFilterImpl.class.getCanonicalName());
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__LOGGERS_DISPATCHER,
        io.github.onograph.TokenConstants.LOGGING_DISPATCHER);
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__LOGGER_STARTUP_TIMEOUT, "15s");
    return ConfigFactory.parseMap(_hashMapMcso);
  }


  private com.typesafe.config.Config _selicnConfig() {

    HashMap<String, Object> _hashMapMcso = new HashMap();
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__ACTOR__ALLOW_JAVA_SERIALIZATION,
        io.github.onograph.TokenConstants.OFF);
    this._adsiirForClClMa(NodeServerMemberLeaderMetaJSerializer.class,
        NodeServerMemberLeaderMeta.class, _hashMapMcso);
    this._adsiirForClClMa(ConsensusDatabaseIdWrapperJSerializer.class, ConsensusMemberGroupId.class,
        _hashMapMcso);
    this._adsiirForClClMa(UniqueAddressJSerializer.class, UniqueAddress.class, _hashMapMcso);
    this._adsiirForClClMa(CoreGDMCWJSerializer.class, GdbDiscoveryMetaCoreWrapper.class,
        _hashMapMcso);
    this._adsiirForClClMa(UpdateReadReplicaInfoJSerializer.class, UpdateReadReplicaInfo.class,
        _hashMapMcso);
    this._adsiirForClClMa(NodeServerMemberIdWrapperJSerializer.class, ConsensusNodeId.class,
        _hashMapMcso);
    this._adsiirForClClMa(GdbDiscoveryMetaReadReplicaImplJSerializer.class,
        GdbDiscoveryMetaReadReplicaImpl.class, _hashMapMcso);
    this._adsiirForClClMa(DatabaseCoreClusterStructureJSerializer.class,
        DatabaseCoreClusterStructure.class, _hashMapMcso);
    this._adsiirForClClMa(RemoveReadReplicaNodeJSerializer.class, RemoveReadReplicaNode.class,
        _hashMapMcso);
    this._adsiirForClClMa(DatabaseReadReplicaClusterStructureJSerializer.class,
        DatabaseReadReplicaClusterStructure.class, _hashMapMcso);
    this._adsiirForClClMa(LeaderMetaJSerializer.class, LeaderMeta.class, _hashMapMcso);
    this._adsiirForClClMa(SyncedLeaderMetaJSerializer.class, SyncedLeaderMeta.class, _hashMapMcso);
    this._adsiirForClClMa(DatabaseIdOnlyJSerializer.class, DatabaseId.class, _hashMapMcso);
    this._adsiirForClClMa(ReadReplicateGdbMetaJSerializer.class, ReadReplicateGdbMeta.class,
        _hashMapMcso);
    this._adsiirForClClMa(GdbServerIdWrapperSerializer.class, GdbServerIdWrapper.class,
        _hashMapMcso);
    this._adsiirForClClMa(DiscoveryGdbOperatorMetaWrapperJSerializer.class,
        DiscoveryGdbOperatorMetaWrapper.class, _hashMapMcso);
    this._adsiirForClClMa(ConsensusGdbServerCoordinatorSerializer.class,
        ConsensusGdbServerCoordinator.class, _hashMapMcso);
    return ConfigFactory.parseMap(_hashMapMcso);
  }


  private com.typesafe.config.Config _shtwcoiConfig() {

    HashMap<String, Object> _hashMapMcso = new HashMap();
    _hashMapMcso.put(io.github.onograph.TokenConstants.AKKA__JVM_SHUTDOWN_HOOKS,
        io.github.onograph.TokenConstants.OFF);
    _hashMapMcso.put(
        io.github.onograph.TokenConstants.AKKA__CLUSTER__RUN_COORDINATED_SHUTDOWN_WHEN_DOWN,
        io.github.onograph.TokenConstants.OFF);
    return ConfigFactory.parseMap(_hashMapMcso);
  }


  private com.typesafe.config.Config _trpcoConfig() {

    SocketAddress _alSocketAddress = this.config.get(
        SettingsDeclarationClusterImpl.settingDiviasSocketAddress);

    SocketAddress _aaSocketAddress = this.config.get(
        SettingsDeclarationClusterImpl.settingDivdidsSocketAddress);

    Map<String, Object> _mapMcso = new HashMap();
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ENABLED, true);
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__TRANSPORT,
        this.taArteryRemotingType.settingVal);
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__CANONICAL__HOSTNAME,
        hotmString(_aaSocketAddress));
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__CANONICAL__PORT,
        _aaSocketAddress.getPort());
    if (this.config.get(SettingsDeclarationClusterSystemImpl.settingMieaoranoBoolean)) {
      _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ADVANCED__INSTRUMENTS,
          List.of(JoinClusterRemoteInstrument.class.getCanonicalName()));
    }

    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__HOSTNAME,
        hotmString(_alSocketAddress));
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__PORT,
        _alSocketAddress.getPort());

    Duration _tbDuration = this.config.get(
        SettingsDeclarationClusterSystemImpl.settingAkimDuration);
    _mapMcso.put(io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__BIND_TIMEOUT,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put",
            _tbDuration.toMillis()));

    Duration _ctDuration = this.config.get(
        SettingsDeclarationClusterSystemImpl.settingAkotitDuration);
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ADVANCED__CONNECTION_TIMEOUT,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put2",
            _ctDuration.toMillis()));

    Duration _thDuration = this.config.get(
        SettingsDeclarationClusterSystemImpl.settingAkaamDuration);
    _mapMcso.put(
        io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ADVANCED__HANDSHAKE_TIMEOUT,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.put3",
            _thDuration.toMillis()));
    return ConfigFactory.parseMap(_mapMcso);
  }


  public com.typesafe.config.Config geetConfig() {

    Path _cePath = this.config.get(SettingsDeclarationClusterSystemImpl.settingMieaxafPath);

    com.typesafe.config.Config _bConfig;
    if (_cePath == null) {
      _bConfig = ConfigFactory.empty();
    } else {
      _bConfig = ConfigFactory.parseFileAnySyntax(_cePath.toFile());
    }

    return _bConfig.withFallback(this._shtwcoiConfig()).withFallback(this._trpcoConfig())
        .withFallback(this._selicnConfig())
        .withFallback(this._fardecgConfig()).withFallback(this._loggcngConfig())
        .withFallback(this._ditcgConfig())
        .withFallback(this._clsrcngConfig()).withFallback(ConfigFactory.defaultReference())
        .resolve();
  }


  public enum ArteryRemotingType {


    RT_AERON(io.github.onograph.TokenConstants.AERON_UDP),

    RT_TCP(io.github.onograph.TokenConstants.TCP),

    RT_TLS_TCP(io.github.onograph.TokenConstants.TLS_TCP);


    private final String settingVal;

    ArteryRemotingType(String _strVc) {
      this.settingVal = _strVc;
    }
  }
}
