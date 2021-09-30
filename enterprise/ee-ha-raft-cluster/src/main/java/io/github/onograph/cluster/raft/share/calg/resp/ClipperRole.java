package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionClipImpl;


class ClipperRole {

  private ClipperRole() {
  }


  static void haepereForCoCo(ConsensusResultService _obConsensusResultService,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
    _obConsensusResultService.adlcmdConsensusResultService(
        new TransactionLogActionClipImpl(_rpLogClipRequestMessage.getLgIp()));
  }
}
