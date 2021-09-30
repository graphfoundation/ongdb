package io.github.onograph.cluster.raft.share.calg.cle;

import java.io.IOException;


public interface ConsensusTransactionLog extends ConsensusTransactionLogEntry {


  long apeForCo(ConsensusLogEntry... _consensusLogEntryArray) throws IOException;


  long pass(long _lgV, long _lgVar) throws IOException;


  long prn(long _lgVar) throws IOException;


  void trnt(long _lgVa) throws IOException;
}
