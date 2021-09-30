package io.github.onograph.cluster.raft.share.calg.cle.cservice;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;


public interface ConsensusLogCacheService {


  int elmtcu();


  void enb();


  ConsensusLogEntry getConsensusLogEntry(long _lgVa);


  void prn(long _lgV);


  void putForCo(ConsensusLogEntry _consensusLogEntry, long _lgV);


  void retspccac();


  long toabys();


  void trnt(long _lgVa);
}
