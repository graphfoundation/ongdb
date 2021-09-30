package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;
import org.neo4j.logging.Log;


public interface TransactionLogAction {


  void apltoForCoLo(ConsensusTransactionLog _consensusTransactionLog, Log _log)
      throws IOException;


  void apltoForCoLo(ConsensusLogCacheService _consensusLogCacheService, Log _log);


  void dipcForTr(
      io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions _transactionLogActions)
      throws IOException;


  interface TransactionLogActions {


    void apeForCo(long _lgVar, ConsensusLogEntry... _consensusLogEntryArray) throws IOException;


    void prn(long _lgVa);


    void trnt(long _lgV) throws IOException;
  }
}
