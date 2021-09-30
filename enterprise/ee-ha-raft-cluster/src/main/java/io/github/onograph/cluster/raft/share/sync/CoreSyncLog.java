package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import org.neo4j.logging.Log;


class CoreSyncLog {


  private final Log log;


  private int iAtmt;

  CoreSyncLog(Log _log) {
    this.log = _log;
  }


  void neaetForDaCo(ConsensusNodeId _laeConsensusNodeId,
      DataSyncClusterAction _oeainDataSyncClusterAction) {
    ++this.iAtmt;
    if (this.iAtmt > 1) {

    }
  }


  void sucsForDa(DataSyncClusterAction _oeainDataSyncClusterAction) {
    if (this.iAtmt > 1) {

    }
  }
}
