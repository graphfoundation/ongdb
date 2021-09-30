package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionCommitProcessSyncableDataImpl;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.CommitProcessFactory;
import org.neo4j.kernel.impl.api.InternalTransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.transaction.log.TransactionAppender;
import org.neo4j.storageengine.api.StorageEngine;


public class CommitProcessFactoryCoreImpl implements CommitProcessFactory {


  private final LeaseServiceEnterpriseImpl clLeaseServiceEnterpriseImpl;


  private final CoreGdbFSMService mscCoreGdbFSMService;


  private final Syncerator rpiaoSyncerator;


  CommitProcessFactoryCoreImpl(LeaseServiceEnterpriseImpl _clLeaseServiceEnterpriseImpl,
      CoreGdbFSMService _mscCoreGdbFSMService, Syncerator _rpiaoSyncerator) {
    this.clLeaseServiceEnterpriseImpl = _clLeaseServiceEnterpriseImpl;
    this.mscCoreGdbFSMService = _mscCoreGdbFSMService;
    this.rpiaoSyncerator = _rpiaoSyncerator;
  }


  private void _inactpefrsemiForTrSt(StorageEngine _storageEngine,
      TransactionAppender _transactionAppender) {

    InternalTransactionCommitProcess _internalTransactionCommitProcess = new InternalTransactionCommitProcess(
        _transactionAppender, _storageEngine);
    this.mscCoreGdbFSMService.inlcmpoForTr(_internalTransactionCommitProcess);
  }

  @Override
  public TransactionCommitProcess create(TransactionAppender _transactionAppender,
      StorageEngine _storageEngine, NamedDatabaseId _namedDatabaseId,
      DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker) {
    this._inactpefrsemiForTrSt(_storageEngine, _transactionAppender);
    return new TransactionCommitProcessSyncableDataImpl(_cdorDatabaseReadOnlyChecker,
        this.clLeaseServiceEnterpriseImpl, _namedDatabaseId,
        this.rpiaoSyncerator);
  }
}
