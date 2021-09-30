package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusServiceSupplier;
import io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo;
import io.github.onograph.cluster.raft.share.meta.SetupManager;
import io.github.onograph.cluster.raft.share.meta.SnapshotDataManager;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import java.time.Duration;
import java.util.Optional;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.scheduler.JobHandle;


class ConsensusInitializer extends LifecycleAdapter {


  private final ConsensusServiceSupplier brConsensusServiceSupplier;


  private final Lifecycle crLifecycle;


  private final SetupPreparerContainer dbtSetupPreparerContainer;


  private final DatabaseStartupControllerAbortableImpl dsaDatabaseStartupControllerAbortableImpl;


  private final FLIncomingMessageProcessor<?> fLIncomingMessageProcessorHmrObject;


  private final Database kreDatabase;


  private final DbmsManagerClusterImpl oicDbmsManagerClusterImpl;


  private final SetupManager sbSetupManager;


  private final SyncServiceLifecycleAdapter sdSyncServiceLifecycleAdapter;


  private final SimpleStorage<ConsensusMemberGroupId> simpleStorageRigsConsensusMemberGroupId;


  private final SnapshotDataManager ssSnapshotDataManager;


  ConsensusInitializer(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      ConsensusServiceSupplier _brConsensusServiceSupplier, SetupManager _bsSetupManager,
      SetupPreparerContainer _dbtSetupPreparerContainer,
      FLIncomingMessageProcessor<?> _fLIncomingMessageProcessorHmrObject, Database _kreDatabase,
      DbmsManagerClusterImpl _oicDbmsManagerClusterImpl, Lifecycle _rcLifecycle,
      SyncServiceLifecycleAdapter _sdSyncServiceLifecycleAdapter,
      SimpleStorage<ConsensusMemberGroupId> _simpleStorageSgirConsensusMemberGroupId,
      SnapshotDataManager _ssSnapshotDataManager) {
    this.brConsensusServiceSupplier = _brConsensusServiceSupplier;
    this.crLifecycle = _rcLifecycle;
    this.dbtSetupPreparerContainer = _dbtSetupPreparerContainer;
    this.dsaDatabaseStartupControllerAbortableImpl = _asdDatabaseStartupControllerAbortableImpl;
    this.fLIncomingMessageProcessorHmrObject = _fLIncomingMessageProcessorHmrObject;
    this.kreDatabase = _kreDatabase;
    this.oicDbmsManagerClusterImpl = _oicDbmsManagerClusterImpl;
    this.sbSetupManager = _bsSetupManager;
    this.sdSyncServiceLifecycleAdapter = _sdSyncServiceLifecycleAdapter;
    this.simpleStorageRigsConsensusMemberGroupId = _simpleStorageSgirConsensusMemberGroupId;
    this.ssSnapshotDataManager = _ssSnapshotDataManager;
  }


  private void _awte() throws Exception {

    Duration _twDuration = Duration.ofSeconds(1L);
    this.ssSnapshotDataManager.awteForDaDu(this.dsaDatabaseStartupControllerAbortableImpl,
        _twDuration);

    Optional<JobHandle<?>> _optionalJdJobHandle = this.sdSyncServiceLifecycleAdapter.donajoOptional();
    if (_optionalJdJobHandle.isPresent()) {
      ((JobHandle) _optionalJdJobHandle.get()).waitTermination();
    }
  }


  private void _biansrmshar() throws Exception {
    this.sbSetupManager.reteForDa(this.kreDatabase.getDatabaseLayout());
    this.dbtSetupPreparerContainer.dee();

    ConsensusSnapshotDataInfo _sbConsensusSnapshotDataInfo =
        this.brConsensusServiceSupplier.bidtrtConsensusSnapshotDataInfo(
            this.dsaDatabaseStartupControllerAbortableImpl);
    this.crLifecycle.start();
    if (_sbConsensusSnapshotDataInfo.snpoOptional().isPresent()) {
      this.ssSnapshotDataManager.inlspForSn(
          (SnapshotData) _sbConsensusSnapshotDataInfo.snpoOptional().get());
      this.fLIncomingMessageProcessorHmrObject.startProcessor(
          _sbConsensusSnapshotDataInfo.getConsensusMemberGroupId());
    } else {
      this.fLIncomingMessageProcessorHmrObject.startProcessor(
          _sbConsensusSnapshotDataInfo.getConsensusMemberGroupId());

      try {
        this._awte();
        this.sbSetupManager._claForPa(this.kreDatabase.getDatabaseLayout());
      } catch (

          Exception _exception) {
        this.sdSyncServiceLifecycleAdapter.stop();
        this.fLIncomingMessageProcessorHmrObject.stopProcessor();
        throw _exception;
      }
    }

    if (this.simpleStorageRigsConsensusMemberGroupId.exists()) {

      ConsensusMemberGroupId consensusMemberGroupIdStore = (ConsensusMemberGroupId) this.simpleStorageRigsConsensusMemberGroupId.readState();
      if (!consensusMemberGroupIdStore.equals(
          _sbConsensusSnapshotDataInfo.getConsensusMemberGroupId())) {

        throw new IllegalStateException("*** Error: 6d9e617e-5ca0-44f3-95fb-01a55465bc6b");
      }
    } else {
      this.simpleStorageRigsConsensusMemberGroupId.writeState(
          _sbConsensusSnapshotDataInfo.getConsensusMemberGroupId());
    }
  }

  @Override
  public void start() throws Exception {

    io.github.onograph.dbms.DbmsManagerClusterImpl.IntegrationManager _hbIntegrationManager =
        this.oicDbmsManagerClusterImpl.botrDbmsManagerClusterImplIntegrationManager(
            this.kreDatabase.getNamedDatabaseId());

    try {
      this._biansrmshar();
    } finally {
      _hbIntegrationManager.reee();
      this.dsaDatabaseStartupControllerAbortableImpl.strdForNa(
          this.kreDatabase.getNamedDatabaseId());
    }
  }

  @Override
  public void stop() throws Exception {
    this.fLIncomingMessageProcessorHmrObject.stopProcessor();
    this.crLifecycle.shutdown();
  }
}
