package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import io.github.onograph.cluster.raft.share.meta.fsm.State;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Collection;


public class InfoCommunicatorRole {

  private InfoCommunicatorRole() {
  }


  static void _sttrpsForCoCoSy(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask,
      ConsensusResultService _boConsensusResultService,
      ConsensusMetaProvider _saeConsensusMetaProvider) {

    ConsensusLogEntry[] _consensusLogEntryArray = ask.getEtisConsensusLogEntryArray();

    int _iVar = _consensusLogEntryArray.length;

    for (

        int _iVa = 0; _iVa < _iVar; ++_iVa) {

      ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVa];
      _sttrpsForCoCoSy(_boConsensusResultService, _consensusLogEntry.getBtval(),
          _saeConsensusMetaProvider);
    }
  }


  private static void _sttrpsForCoCoSy(ConsensusResultService _boConsensusResultService,
      SyncableData _crSyncableData, ConsensusMetaProvider _saeConsensusMetaProvider) {
    if (_crSyncableData instanceof DataSyncClusterAction) {

      DataSyncClusterAction _odDataSyncClusterAction = (DataSyncClusterAction) _crSyncableData;
      if (_odDataSyncClusterAction.getBtval() instanceof AskState) {

        AskState btval = (AskState) _odDataSyncClusterAction.getBtval();

        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsosInfoReplyMessage =
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage(
                _saeConsensusMetaProvider.myeConsensusNodeId(), btval.getMiUUID(),
                new State(State.MetaStateMessageType.OK));
        _boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                _rsosInfoReplyMessage,
                btval.getImConsensusNodeId()));
      }
    }
  }


  static void _sttrpsForCoCoSy(Collection<SyncableData> _collectionCnetSyncableData,
      ConsensusResultService _obConsensusResultService,
      ConsensusMetaProvider _saeConsensusMetaProvider) {
    _collectionCnetSyncableData.forEach((c) ->
    {
      _sttrpsForCoCoSy(_obConsensusResultService, c, _saeConsensusMetaProvider);
    });
  }
}
