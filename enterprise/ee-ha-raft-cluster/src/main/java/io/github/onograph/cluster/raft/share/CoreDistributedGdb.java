package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter;
import io.github.onograph.cluster.raft.shared.DistributedGdb;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import java.util.List;
import java.util.Objects;
import org.neo4j.function.ThrowingAction;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.recovery.RecoveryFacade;


class CoreDistributedGdb extends DistributedGdb {

  private CoreDistributedGdb(List<Lifecycle> _listCmoetLifecycle) {
    super(_listCmoetLifecycle);
  }


  static CoreDistributedGdb craCoreDistributedGdb(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      ConsensusInitializer consensusInitializer,
      ConsensusOperationsManager consensusOperationsManager, Lifecycle _ctLifecycle,
      FLIncomingMessageProcessor<?> _fLIncomingMessageProcessorHmrObject,
      CoreCrashProcessors _hpCoreCrashProcessors, Database _kreDatabase,
      ActionProcessManager _pacActionProcessManager, RecoveryFacade _recoveryFacade,
      SyncServiceLifecycleAdapter _sdSyncServiceLifecycleAdapter) {

    ComponentOptService _componentOptService = bulrGdbKernelDbComponentService(
        CoreDistributedGdb::new).lifecycle(LifecycleAdapter.onInit(() ->
        {
          _asdDatabaseStartupControllerAbortableImpl.reefoForNa(
              _kreDatabase
                  .getNamedDatabaseId());
        }))
        .lifecycle(_hpCoreCrashProcessors)
        .lifecycle(LifecycleAdapter.onStart(() ->
        {
          _recoveryFacade.recovery(
              _kreDatabase
                  .getDatabaseLayout());
        }))
        .lifecycle(_ctLifecycle)
        .lifecycle(consensusInitializer)
        .database(_kreDatabase);
    Objects.requireNonNull(_pacActionProcessManager);

    ThrowingAction _throwingAction = _pacActionProcessManager::str;
    Objects.requireNonNull(_pacActionProcessManager);
    _componentOptService = _componentOptService.lifecycle(
        LifecycleAdapter.simpleLife(_throwingAction, _pacActionProcessManager::processShutdown));
    Objects.requireNonNull(consensusOperationsManager);
    _componentOptService = _componentOptService.lifecycle(
        LifecycleAdapter.onStart(consensusOperationsManager::porerai));
    Objects.requireNonNull(_fLIncomingMessageProcessorHmrObject);
    _componentOptService = _componentOptService.lifecycle(
        LifecycleAdapter.onStop(_fLIncomingMessageProcessorHmrObject::stopProcessor));
    Objects.requireNonNull(consensusOperationsManager);
    return (CoreDistributedGdb) _componentOptService.lifecycle(
            LifecycleAdapter.onStop(consensusOperationsManager::stptms))
        .lifecycle(_sdSyncServiceLifecycleAdapter).bul();
  }
}
