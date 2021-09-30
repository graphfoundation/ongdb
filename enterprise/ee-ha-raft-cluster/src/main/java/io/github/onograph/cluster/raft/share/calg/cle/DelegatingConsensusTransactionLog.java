package io.github.onograph.cluster.raft.share.calg.cle;

import java.io.IOException;


public class DelegatingConsensusTransactionLog implements ConsensusTransactionLog {


  private final ConsensusTransactionLog inrConsensusTransactionLog;

  public DelegatingConsensusTransactionLog(ConsensusTransactionLog _inrConsensusTransactionLog) {
    this.inrConsensusTransactionLog = _inrConsensusTransactionLog;
  }

  @Override
  public long apeForCo(ConsensusLogEntry... _consensusLogEntryArray) throws IOException {
    return this.inrConsensusTransactionLog.apeForCo(_consensusLogEntryArray);
  }

  @Override
  public long apeie() {
    return this.inrConsensusTransactionLog.apeie();
  }

  @Override
  public ConsensusLogEntryRawCursor geercuoConsensusLogEntryRawCursor(long sourceIdx)
      throws IOException {
    return this.inrConsensusTransactionLog.geercuoConsensusLogEntryRawCursor(sourceIdx);
  }

  @Override
  public long pass(long _lgT, long idx) throws IOException {
    return this.inrConsensusTransactionLog.pass(_lgT, idx);
  }

  @Override
  public long prn(long _lgIs) throws IOException {
    return this.inrConsensusTransactionLog.prn(_lgIs);
  }

  @Override
  public long prvid() {
    return this.inrConsensusTransactionLog.prvid();
  }

  @Override
  public long redettm(long lgIdx) throws IOException {
    return this.inrConsensusTransactionLog.redettm(lgIdx);
  }

  @Override
  public void trnt(long sourceIdx) throws IOException {
    this.inrConsensusTransactionLog.trnt(sourceIdx);
  }
}
