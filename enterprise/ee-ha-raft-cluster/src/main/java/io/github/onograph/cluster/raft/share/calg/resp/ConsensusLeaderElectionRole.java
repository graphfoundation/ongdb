package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import java.io.IOException;
import java.util.Set;
import org.neo4j.logging.Log;


public class ConsensusLeaderElectionRole {

  private ConsensusLeaderElectionRole() {
  }


  static boolean isStpeenForCoCoLo(ConsensusResultService _boConsensusResultService, Log _log,
      ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {

    Set<ConsensusNodeId> _setMcConsensusNodeId = _saeConsensusMetaProvider.voimbsSet();
    if (_setMcConsensusNodeId != null && _setMcConsensusNodeId.contains(
        _saeConsensusMetaProvider.myeConsensusNodeId())) {

      ConsensusMessageServiceMeta.VotePreparationMessage.Ask _mfvpAsk =
          new ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
              _saeConsensusMetaProvider.myeConsensusNodeId(),
              _saeConsensusMetaProvider.myeConsensusNodeId(),
              _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie(),
              _saeConsensusMetaProvider.getElecTerm(),
              _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(
                  _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
                      .apeie()));
      _setMcConsensusNodeId.stream().filter((member) ->
      {
        return !member.equals(_saeConsensusMetaProvider.myeConsensusNodeId());
      }).forEach((member) ->
      {
        _boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                _mfvpAsk, member));
      });
      _boConsensusResultService.reeitmConsensusResultService(
          NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS);

      return true;
    } else {

      return false;
    }
  }


  static boolean isStreloForCoCoLo(ConsensusResultService _boConsensusResultService, long _lgTe,
      Log _log, ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    Set<ConsensusNodeId> _setMcConsensusNodeId = _saeConsensusMetaProvider.voimbsSet();
    if (_setMcConsensusNodeId != null && _setMcConsensusNodeId.contains(
        _saeConsensusMetaProvider.myeConsensusNodeId())) {
      ++_lgTe;
      _boConsensusResultService.setmConsensusResultService(_lgTe);

      ConsensusMessageServiceMeta.CandidateVoteMessage.Ask _mfvAsk =
          new ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
              _saeConsensusMetaProvider.myeConsensusNodeId(),
              _saeConsensusMetaProvider.myeConsensusNodeId(),
              _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie(), _lgTe,
              _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(
                  _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie()));
      _setMcConsensusNodeId.stream().filter((member) ->
      {
        return !member.equals(_saeConsensusMetaProvider.myeConsensusNodeId());
      }).forEach((member) ->
      {
        _boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                _mfvAsk, member));
      });
      _boConsensusResultService.sevefoConsensusResultService(
              _saeConsensusMetaProvider.myeConsensusNodeId())
          .reeitmConsensusResultService(NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS);

      return true;
    } else {

      return false;
    }
  }
}
