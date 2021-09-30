package io.github.onograph.cluster.raft.shared;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta;
import io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta;
import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.share.meta.fsm.StateStorageLifecycleAdapter;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta;
import io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta;
import io.github.onograph.dbms.WatchTag;
import java.nio.file.Path;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.state.SimpleFileStorage;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.memory.MemoryTracker;


public class ClusterSimpleStorageFacade {


  private final Config config;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider goaLogProvider;


  private final ClusterMetaTopologyInfo lyuClusterMetaTopologyInfo;


  private final MemoryTracker memoryTracker;


  public ClusterSimpleStorageFacade(Config _config, FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _goaLogProvider, ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo,
      MemoryTracker _memoryTracker) {
    this.config = _config;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.goaLogProvider = _goaLogProvider;
    this.lyuClusterMetaTopologyInfo = _lyuClusterMetaTopologyInfo;
    this.memoryTracker = _memoryTracker;
  }


  private <T> StateStorage<T> _credbsoStateStorage(LifeSupport _lifeSupport,
      LogProvider _logProvider, Path _pdPath, MetaWrapper<T> tNme) {

    StateStorageLifecycleAdapter<T> _stateStorageLifecycleAdapterSoaeT =
        new StateStorageLifecycleAdapter(this.fFileSystemAbstraction, tNme.roaosiForCo(this.config),
            _logProvider, this.memoryTracker, tNme,
            _pdPath);
    _lifeSupport.add(_stateStorageLifecycleAdapterSoaeT);
    return _stateStorageLifecycleAdapterSoaeT;
  }


  private <T> SimpleStorage<T> _creslsrSimpleStorage(LogProvider _logProvider, Path _pfPath,
      MetaWrapper<T> tNme) {
    return new SimpleFileStorage(this.fFileSystemAbstraction, _pfPath, tNme.maslSafeStateMarshal(),
        this.memoryTracker);
  }


  public SimpleStorage<ClusterMetaFormat> crectsavrsgSimpleStorage() {
    return this._creslsrSimpleStorage(this.goaLogProvider,
        this.lyuClusterMetaTopologyInfo.clestvsfiPath(),
        MetaWrapper.META_WRAPPER_VESN_CLUSTER_META_FORMAT);
  }


  public StateStorage<LeasableMeta> crelesaStateStorage(DatabaseLogProvider _databaseLogProvider,
      String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.lesdtPath(gdbName),
        MetaWrapper.META_WRAPPER_LES_LEASABLE_META);
  }


  public StateStorage<Long> crelfesrStateStorage(DatabaseLogProvider _databaseLogProvider,
      String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.lafldsedcPath(gdbName), MetaWrapper.FIN_FLSD);
  }


  @Deprecated
  public SimpleStorage<ConsensusNodeId> creomerSimpleStorage() {
    return this._creslsrSimpleStorage(this.goaLogProvider,
        this.lyuClusterMetaTopologyInfo.olmmidsefPath(), MetaWrapper.OLD_CND_MB_UID);
  }


  @Deprecated
  public SimpleStorage<WatchTag> creqaemesrSimpleStorage(String gdbName) {
    return this._creslsrSimpleStorage(this.goaLogProvider,
        this.lyuClusterMetaTopologyInfo.qunmrsefPath(gdbName),
        MetaWrapper.META_WRAPPER_QUNMR_WATCH_TAG);
  }


  public SimpleStorage<ConsensusMemberGroupId> crergrSimpleStorage(
      DatabaseLogProvider _databaseLogProvider, String gdbName) {
    return this._creslsrSimpleStorage(_databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.ragridfPath(gdbName), MetaWrapper.CONS_GRP_UID);
  }


  public SimpleStorage<ConsensusNodeId> crermroSimpleStorage(String gdbName) {
    return this._creslsrSimpleStorage(this.goaLogProvider,
        this.lyuClusterMetaTopologyInfo.rametfePath(gdbName), MetaWrapper.CONS_MB_UID);
  }


  public StateStorage<NodeServerMemberTransactionLogDataMeta> crermrsgStateStorage(
      DatabaseLogProvider _databaseLogProvider, String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.ramesstdioPath(gdbName), MetaWrapper.CONS_MBX);
  }


  public StateStorage<CandidateTermMeta> crertsteStateStorage(
      DatabaseLogProvider _databaseLogProvider, String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.ratesadrrPath(gdbName), MetaWrapper.CONS_TER);
  }


  public StateStorage<CandidateTallyMeta> crervsteStateStorage(
      DatabaseLogProvider _databaseLogProvider, String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.ravosadrrPath(gdbName), MetaWrapper.CONS_VOT);
  }


  public StateStorage<ReplicationSessionManagerMeta> cresitasgStateStorage(
      DatabaseLogProvider _databaseLogProvider, String gdbName, LifeSupport _lifeSupport) {
    return this._credbsoStateStorage(_lifeSupport, _databaseLogProvider,
        this.lyuClusterMetaTopologyInfo.seotcdioPath(gdbName),
        MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META);
  }
}
