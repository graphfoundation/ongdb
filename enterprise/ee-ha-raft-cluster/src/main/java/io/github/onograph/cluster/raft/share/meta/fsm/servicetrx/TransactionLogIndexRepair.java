package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import java.util.function.Supplier;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.TransactionIdStore;


public class TransactionLogIndexRepair {


  private final LogProvider logProvider;


  private final Supplier<LogicalTransactionStore> supplierStLogicalTransactionStore;


  private final Supplier<TransactionIdStore> supplierTisTransactionIdStore;


  public TransactionLogIndexRepair(LogProvider _logProvider,
      Supplier<TransactionIdStore> _supplierSitTransactionIdStore,
      Supplier<LogicalTransactionStore> _supplierStLogicalTransactionStore) {
    this.logProvider = _logProvider;
    this.supplierStLogicalTransactionStore = _supplierStLogicalTransactionStore;
    this.supplierTisTransactionIdStore = _supplierSitTransactionIdStore;
  }


  public long filaapi() {
    return (new TransactionLogCommitSearcher(this.logProvider,
        this.supplierStLogicalTransactionStore.get(), this.supplierTisTransactionIdStore.get()))
        .gelscmdix();
  }
}
