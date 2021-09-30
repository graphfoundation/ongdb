package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl;
import io.github.onograph.cluster.raft.share.sync.SyncMeta;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.kernel.api.exceptions.Status.Cluster;
import org.neo4j.kernel.api.exceptions.Status.General;
import org.neo4j.kernel.api.exceptions.Status.Transaction;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.tracing.CommitEvent;
import org.neo4j.storageengine.api.TransactionApplicationMode;


public class TransactionCommitProcessSyncableDataImpl implements TransactionCommitProcess {


  private final DatabaseReadOnlyChecker cdorDatabaseReadOnlyChecker;


  private final LeaseServiceEnterpriseImpl clLeaseServiceEnterpriseImpl;


  private final NamedDatabaseId namedDatabaseId;


  private final Syncerator rpiaoSyncerator;


  public TransactionCommitProcessSyncableDataImpl(
      DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker,
      LeaseServiceEnterpriseImpl _clLeaseServiceEnterpriseImpl, NamedDatabaseId _namedDatabaseId,
      Syncerator _rpiaoSyncerator) {
    this.cdorDatabaseReadOnlyChecker = _cdorDatabaseReadOnlyChecker;
    this.clLeaseServiceEnterpriseImpl = _clLeaseServiceEnterpriseImpl;
    this.namedDatabaseId = _namedDatabaseId;
    this.rpiaoSyncerator = _rpiaoSyncerator;
  }


  private void _vaitForTrDa(DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker,
      TransactionToApply _tTransactionToApply) throws TransactionFailureException {

    TransactionRepresentation _trTransactionRepresentation = _tTransactionToApply.transactionRepresentation();

    int lsId = _trTransactionRepresentation.getLeaseId();
    if (lsId != -1 && this.clLeaseServiceEnterpriseImpl.isInl(lsId)) {

      throw new TransactionFailureException(Transaction.LeaseExpired,
          "*** Error:  6337d4a2-780d-48fe-b339-0aa245ccadfd");
    } else {
      _cdorDatabaseReadOnlyChecker.check();
    }
  }

  @Override
  public long commit(TransactionToApply _tTransactionToApply, CommitEvent _commitEvent,
      TransactionApplicationMode mdstr)
      throws TransactionFailureException {
    this._vaitForTrDa(this.cdorDatabaseReadOnlyChecker, _tTransactionToApply);

    PhysicalTransactionRepresentation _trPhysicalTransactionRepresentation =
        (PhysicalTransactionRepresentation) _tTransactionToApply.transactionRepresentation();

    int lsId = _trPhysicalTransactionRepresentation.getLeaseId();

    AbstractTransactionSync _abstractTransactionSync =
        new AbstractTransactionSync(_trPhysicalTransactionRepresentation,
            this.namedDatabaseId.databaseId());

    SyncMeta _rrSyncMeta;
    try {
      _rrSyncMeta = this.rpiaoSyncerator.relaSyncMeta(_abstractTransactionSync);
    } catch (

        Throwable _throwable) {
      this.clLeaseServiceEnterpriseImpl.inil(lsId);
      throw new TransactionFailureException(Cluster.ReplicationFailure, _throwable);
    }

    switch (_rrSyncMeta.getReslt()) {
      case SMT_POS_REP:
        this.clLeaseServiceEnterpriseImpl.inil(lsId);
      case SMT_NO_REP:
        throw new TransactionFailureException(Cluster.ReplicationFailure,
            _rrSyncMeta.getFiueThrowable());
      case SMT_COM_OK:
        try {
          return _rrSyncMeta.getSmrFSMData().cose();
        } catch (

            TransactionFailureException _transactionFailureException) {
          throw _transactionFailureException;
        } catch (

            Throwable _throwable2) {

          throw new TransactionFailureException(General.UnknownError,
              "*** Error:  5f9d4e77-f43f-4747-9f66-437acfa45245", _throwable2);
        }
      default:

        throw new TransactionFailureException(General.UnknownError,
            "*** Error: 5e6657d3-8ccd-4763-834b-1f306074a32a");
    }
  }
}
