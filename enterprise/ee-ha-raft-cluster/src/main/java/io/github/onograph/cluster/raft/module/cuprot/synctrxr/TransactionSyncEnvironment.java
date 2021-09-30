package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import java.util.Objects;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;


class TransactionSyncEnvironment {


  private final TransactionBlockLimiters cntanTransactionBlockLimiters;


  private final KernelVersion kernelVersion;


  private final StoreId lclStoreId;


  private final long lgItf;


  private final long lgPit;


  private final TransactionCursor tasciTransactionCursor;


  private final TransactionIdStore transactionIdStore;


  TransactionSyncEnvironment(TransactionBlockLimiters _cntanTransactionBlockLimiters,
      KernelVersion _kernelVersion, StoreId _lclStoreId, long _lgItf, long _lgPit,
      TransactionCursor _tasciTransactionCursor, TransactionIdStore _transactionIdStore) {
    this.cntanTransactionBlockLimiters = _cntanTransactionBlockLimiters;
    this.kernelVersion = _kernelVersion;
    this.lclStoreId = _lclStoreId;
    this.lgItf = _lgItf;
    this.lgPit = _lgPit;
    this.tasciTransactionCursor = _tasciTransactionCursor;
    this.transactionIdStore = _transactionIdStore;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TransactionSyncEnvironment _thTransactionSyncEnvironment = (TransactionSyncEnvironment) obj;
      return this.lgItf == _thTransactionSyncEnvironment.lgItf
          && this.lgPit == _thTransactionSyncEnvironment.lgPit &&
          Objects.equals(this.tasciTransactionCursor,
              _thTransactionSyncEnvironment.tasciTransactionCursor) &&
          Objects.equals(this.lclStoreId, _thTransactionSyncEnvironment.lclStoreId) &&
          Objects.equals(this.transactionIdStore, _thTransactionSyncEnvironment.transactionIdStore)
          &&
          Objects.equals(this.cntanTransactionBlockLimiters,
              _thTransactionSyncEnvironment.cntanTransactionBlockLimiters) &&
          this.kernelVersion == _thTransactionSyncEnvironment.kernelVersion;
    } else {
      return false;
    }
  }


  public TransactionBlockLimiters getCntanTransactionBlockLimiters() {
    return this.cntanTransactionBlockLimiters;
  }


  public KernelVersion getKernelVersion() {
    return this.kernelVersion;
  }


  StoreId getLclStoreId() {
    return this.lclStoreId;
  }


  long getLgItf() {
    return this.lgItf;
  }


  long getLgPit() {
    return this.lgPit;
  }


  TransactionCursor getTasciTransactionCursor() {
    return this.tasciTransactionCursor;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.tasciTransactionCursor, this.lclStoreId, this.lgItf, this.lgPit,
        this.transactionIdStore, this.cntanTransactionBlockLimiters,
        this.kernelVersion);
  }


  long lacottatid() {
    return this.transactionIdStore.getLastCommittedTransactionId();
  }


}
