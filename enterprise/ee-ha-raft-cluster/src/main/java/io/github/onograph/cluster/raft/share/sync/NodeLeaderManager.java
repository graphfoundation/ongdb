package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.time.Duration;


class NodeLeaderManager {


  private final long lgMt;


  private volatile ConsensusNodeId lcConsensusNodeId;

  NodeLeaderManager(Duration _talDuration) {
    this.lgMt = _talDuration.toMillis();
  }


  private synchronized ConsensusNodeId _watfrlarConsensusNodeId() throws InterruptedException {
    if (this.lcConsensusNodeId == null) {
      this.wait(this.lgMt);
    }

    return this.lcConsensusNodeId;
  }


  ConsensusNodeId awileeConsensusNodeId() throws InterruptedException {

    ConsensusNodeId _laeConsensusNodeId = this.lcConsensusNodeId;
    if (_laeConsensusNodeId != null) {
      return _laeConsensusNodeId;
    } else {
      _laeConsensusNodeId = this._watfrlarConsensusNodeId();
      return _laeConsensusNodeId;
    }
  }


  ConsensusNodeId getLcConsensusNodeId() {
    return this.lcConsensusNodeId;
  }


  synchronized void seldForCo(ConsensusNodeId _laeConsensusNodeId) {
    this.lcConsensusNodeId = _laeConsensusNodeId;
    if (_laeConsensusNodeId != null) {
      this.notifyAll();
    }
  }
}
