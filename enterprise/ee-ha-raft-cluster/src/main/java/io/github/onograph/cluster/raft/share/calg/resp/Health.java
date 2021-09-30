package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import java.io.IOException;
import org.neo4j.logging.Log;


class Health {

  private Health() {
  }


  static void beaForCoCoCoLo(Log _log, ConsensusResultService _obConsensusResultService,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _rqetAliveNoReplyMessage,
      ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {
    if (_rqetAliveNoReplyMessage.getLgLt() >= _saeConsensusMetaProvider.getElecTerm()) {
      _obConsensusResultService.sepecoConsensusResultService(false)
          .setmConsensusResultService(_rqetAliveNoReplyMessage.getLgLt())
          .seldConsensusResultService(_rqetAliveNoReplyMessage.getFroConsensusNodeId())
          .selacoConsensusResultService(_rqetAliveNoReplyMessage.getLgIc())
          .adotgmaConsensusResultService(
              new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                  new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage(
                      _saeConsensusMetaProvider.myeConsensusNodeId()),
                  _rqetAliveNoReplyMessage.getFroConsensusNodeId()));
      if (FollowerNodeConsensusMessenger.isLohsmeForCo(_rqetAliveNoReplyMessage.getLgIc(),
          _rqetAliveNoReplyMessage.getLgTic(),
          _saeConsensusMetaProvider)) {
        FollowerNodeConsensusMessenger.cottlgoudForCoCo(_obConsensusResultService,
            _rqetAliveNoReplyMessage.getLgIc(),
            _rqetAliveNoReplyMessage.getLgIc(), _saeConsensusMetaProvider);
      }
    }
  }
}
