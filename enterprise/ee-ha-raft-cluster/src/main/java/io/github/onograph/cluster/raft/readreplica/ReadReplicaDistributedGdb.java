package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.shared.DistributedGdb;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.StructureMetaService;
import java.util.List;
import java.util.Objects;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


class ReadReplicaDistributedGdb extends DistributedGdb {

  private ReadReplicaDistributedGdb(List<Lifecycle> _listCmoetLifecycle) {
    super(_listCmoetLifecycle);
  }


  static ReadReplicaDistributedGdb craReadReplicaDistributedGdb(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      ReadReplicateIntegrator _bosrpReadReplicateIntegrator,
      CatchupNodeTaskCoordinator catchupNodeTaskCoordinator, Lifecycle _ccLifecycle,
      ConsensusIdStorageWrapper _cirConsensusIdStorageWrapper, Database _kreDatabase,
      ReadReplicaCrashServiceAdapter _phReadReplicaCrashServiceAdapter,
      ReadReplicateCatchupManager _ppcReadReplicateCatchupManager,
      StructureMetaService structureMetaService) {

    KernelDbComponentService _kernelDbComponentService =
        bulrGdbKernelDbComponentService(ReadReplicaDistributedGdb::new).lifecycle(
                LifecycleAdapter.onInit(() ->
                {
                  _asdDatabaseStartupControllerAbortableImpl
                      .reefoForNa(
                          _kreDatabase
                              .getNamedDatabaseId());
                }))
            .lifecycle(_phReadReplicaCrashServiceAdapter);
    Objects.requireNonNull(_cirConsensusIdStorageWrapper);
    _kernelDbComponentService =
        _kernelDbComponentService.lifecycle(
                LifecycleAdapter.onInit(_cirConsensusIdStorageWrapper::pefm)).lifecycle(_ccLifecycle)
            .lifecycle(structureMetaService);
    Objects.requireNonNull(_bosrpReadReplicateIntegrator);
    return (ReadReplicaDistributedGdb) _kernelDbComponentService.lifecycle(
            LifecycleAdapter.onStart(_bosrpReadReplicateIntegrator::pefm))
        .database(_kreDatabase)
        .lifecycle(_ppcReadReplicateCatchupManager).lifecycle(catchupNodeTaskCoordinator).bul();
  }
}
