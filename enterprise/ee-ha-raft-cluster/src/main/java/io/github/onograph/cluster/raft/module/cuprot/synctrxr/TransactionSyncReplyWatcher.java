package io.github.onograph.cluster.raft.module.cuprot.synctrxr;


public interface TransactionSyncReplyWatcher {


  void ontxrcvForCa(CatchupIncomingTransactionReply _catchupIncomingTransactionReply);
}
