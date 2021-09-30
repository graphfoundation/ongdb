package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import java.io.IOException;


public class ConsensusTLogManager {


  private final ConsensusOperationsManager consensusOperationsManager;


  private final ActionProcessManager paActionProcessManager;

  public ConsensusTLogManager(ConsensusOperationsManager consensusOperationsManager,
      ActionProcessManager _paActionProcessManager) {
    this.consensusOperationsManager = consensusOperationsManager;
    this.paActionProcessManager = _paActionProcessManager;
  }


  public void prn() throws IOException {
    this.consensusOperationsManager.hadResultMeta(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage(
            this.paActionProcessManager.fls()));
  }
}
