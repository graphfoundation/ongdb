package io.github.onograph.cluster.raft.share.calg;

import java.time.Duration;


public interface ConsensusProcessingDurationWatcher {


  void sedaForDu(Duration _duration);


  void upateForCoDu(Duration _duration,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType _raftConsensusMessageType);
}
