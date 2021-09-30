package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.internal.DatabaseLogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;


public class ConsensusNodeGroupWrapperBuilder {


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final Function<NamedDatabaseId, LeaderNodeEventHandlers> functionFlnl;


  private final GlobalModule globalModule;


  private final MemoryTracker memoryTracker;


  private final ClusterMetaTopologyInfo scClusterMetaTopologyInfo;


  private final NodeGroupIdentifierSetSupplier sgsNodeGroupIdentifierSetSupplier;


  private final LeaderGatekeeper stlLeaderGatekeeper;


  public ConsensusNodeGroupWrapperBuilder(ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade,
      Function<NamedDatabaseId, LeaderNodeEventHandlers> _functionFlnl, GlobalModule _globalModule,
      MemoryTracker _memoryTracker, ClusterMetaTopologyInfo _scClusterMetaTopologyInfo,
      NodeGroupIdentifierSetSupplier _sgsNodeGroupIdentifierSetSupplier,
      LeaderGatekeeper _stlLeaderGatekeeper) {
    this.fsClusterSimpleStorageFacade = _fsClusterSimpleStorageFacade;
    this.functionFlnl = _functionFlnl;
    this.globalModule = _globalModule;
    this.memoryTracker = _memoryTracker;
    this.scClusterMetaTopologyInfo = _scClusterMetaTopologyInfo;
    this.sgsNodeGroupIdentifierSetSupplier = _sgsNodeGroupIdentifierSetSupplier;
    this.stlLeaderGatekeeper = _stlLeaderGatekeeper;
  }


  public ConsensusNodeGroupWrapper craConsensusNodeGroupWrapper(
      DbmsReadOnlyChecker _cdorDbmsReadOnlyChecker,
      Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> _consumerCrsInfoReplyMessage,
      DatabaseLogService _databaseLogService, Dependencies _dependencies,
      Lazy<ConsensusNodeId> _lazyImrConsensusNodeId, LifeSupport _lifeSupport,
      SyncableDataChannelMarshal _mcSyncableDataChannelMarshal, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc) {
    return new ConsensusNodeGroupWrapper(_cdorDbmsReadOnlyChecker,
        this.globalModule.getGlobalConfig(), _consumerCrsInfoReplyMessage, _lifeSupport,
        _databaseLogService, _dependencies, this.globalModule.getFileSystem(),
        this.fsClusterSimpleStorageFacade,
        this.globalModule.getGlobalAvailabilityGuard(), this.globalModule.getJobScheduler(),
        _lazyImrConsensusNodeId,
        this.functionFlnl.apply(_namedDatabaseId),
        _mcSyncableDataChannelMarshal, this.memoryTracker, _monitors,
        _namedDatabaseId, _outDirectionOtoncc, this.scClusterMetaTopologyInfo,
        this.sgsNodeGroupIdentifierSetSupplier, this.stlLeaderGatekeeper,
        this.globalModule.getGlobalClock());
  }
}
