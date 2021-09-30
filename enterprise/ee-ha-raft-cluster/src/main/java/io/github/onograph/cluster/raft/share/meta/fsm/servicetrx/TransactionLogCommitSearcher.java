package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.kernel.impl.transaction.log.NoSuchTransactionException;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.TransactionIdStore;


public class TransactionLogCommitSearcher {


  private final Log log;


  private final LogicalTransactionStore logicalTransactionStore;


  private final TransactionIdStore transactionIdStore;


  public TransactionLogCommitSearcher(LogProvider _logProvider,
      LogicalTransactionStore _logicalTransactionStore, TransactionIdStore _transactionIdStore) {
    this.transactionIdStore = _transactionIdStore;
    this.logicalTransactionStore = _logicalTransactionStore;
    this.log = _logProvider.getLog(this.getClass());
  }


  public long gelscmdix() {

    long _lgItl = this.transactionIdStore.getLastCommittedTransactionId();

    CommittedTransactionRepresentation _tlCommittedTransactionRepresentation = null;

    try {

      TransactionCursor _tasciTransactionCursor = this.logicalTransactionStore.getTransactions(
          _lgItl);

      try {
        while (_tasciTransactionCursor.next()) {
          _tlCommittedTransactionRepresentation = _tasciTransactionCursor.get();
        }
      } catch (

          Throwable _throwable) {
        if (_tasciTransactionCursor != null) {
          try {
            _tasciTransactionCursor.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_tasciTransactionCursor != null) {
        _tasciTransactionCursor.close();
      }
    } catch (

        NoSuchTransactionException _noSuchTransactionException) {
      if (_tlCommittedTransactionRepresentation != null) {
        throw new IllegalStateException(_noSuchTransactionException);
      }
    } catch (

        Exception _exception) {
      throw new RuntimeException(_exception);
    }

    if (_tlCommittedTransactionRepresentation == null) {

      throw new RuntimeException("*** Error:  9afe8443-3eda-4d4a-9e74-660a27be937b");
    } else {

      byte[] _fhlByteArray = _tlCommittedTransactionRepresentation.getStartEntry()
          .getAdditionalHeader();

      long _lgLci = TransactionLogHeadWrapper.deelinfrthr(_fhlByteArray);

      return _lgLci;
    }
  }
}
