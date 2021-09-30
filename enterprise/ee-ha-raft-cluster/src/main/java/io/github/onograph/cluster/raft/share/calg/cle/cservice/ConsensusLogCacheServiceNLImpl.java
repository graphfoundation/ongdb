package io.github.onograph.cluster.raft.share.calg.cle.cservice;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import java.util.HashMap;
import java.util.Map;


public class ConsensusLogCacheServiceNLImpl implements ConsensusLogCacheService {


  private final Map<Long, ConsensusLogEntry> mapMlc = new HashMap();


  private boolean isEald;

  @Override
  public synchronized int elmtcu() {
    return 0;
  }

  @Override
  public synchronized void enb() {
    this.isEald = true;
  }

  @Override
  public synchronized ConsensusLogEntry getConsensusLogEntry(long lgIdx) {
    return !this.isEald ? null : this.mapMlc.get(lgIdx);
  }

  @Override
  public synchronized void prn(long _lgUti) {
    if (this.isEald) {
      this.mapMlc.keySet().removeIf((idx) ->
      {
        return idx <= _lgUti;
      });
    }
  }

  @Override
  public synchronized void putForCo(ConsensusLogEntry _consensusLogEntry, long lgIdx) {
    if (this.isEald) {
      this.mapMlc.put(lgIdx, _consensusLogEntry);
    }
  }

  @Override
  public void retspccac() {
  }

  @Override
  public synchronized long toabys() {
    return 0L;
  }

  @Override
  public synchronized void trnt(long sourceIdx) {
    if (this.isEald) {
      this.mapMlc.keySet().removeIf((idx) ->
      {
        return idx >= sourceIdx;
      });
    }
  }
}
