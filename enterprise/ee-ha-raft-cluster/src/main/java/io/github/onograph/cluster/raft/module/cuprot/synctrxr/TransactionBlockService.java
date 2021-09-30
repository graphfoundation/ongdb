package io.github.onograph.cluster.raft.module.cuprot.synctrxr;


public interface TransactionBlockService {


  long getEndingTransactionId();


  long getStartingTransactionId();
}
