package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.action.AddAction;
import io.github.onograph.cluster.raft.share.calg.action.BulkAddAction;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionMitImpl;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.Collection;
import java.util.List;


class AdderRole {

  private AdderRole() {
  }


  static void apdnensForCoCoCo(ConsensusResultService _boConsensusResultService,
      Collection<SyncableData> _collectionCnetSyncableData,
      ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    long begLIdx = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

    long befLT = begLIdx == -1L ? -1L : (begLIdx > _saeConsensusMetaProvider.laloiebowbele()
        ? _saeConsensusMetaProvider.getElecTerm()
        : _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
            .redettm(
                begLIdx));

    ConsensusLogEntry[] _elrConsensusLogEntryArray = _collectionCnetSyncableData.stream()
        .map((content) ->
        {
          return new ConsensusLogEntry(content,
              _saeConsensusMetaProvider.getElecTerm());
        }).toArray((i) ->
        {
          return new ConsensusLogEntry[i];
        });
    InfoCommunicatorRole._sttrpsForCoCoSy(_collectionCnetSyncableData, _boConsensusResultService,
        _saeConsensusMetaProvider);
    _boConsensusResultService.adspcmnConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
                befLT, begLIdx,
                _elrConsensusLogEntryArray))
        .adlcmdConsensusResultService(
            new BulkAddAction(_elrConsensusLogEntryArray, begLIdx + 1L, 0));
  }


  static void apenerForCoCoSy(ConsensusResultService _boConsensusResultService, SyncableData btval,
      ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    long begLIdx = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

    long befLT = begLIdx == -1L ? -1L : (begLIdx > _saeConsensusMetaProvider.laloiebowbele()
        ? _saeConsensusMetaProvider.getElecTerm()
        : _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
            .redettm(
                begLIdx));

    ConsensusLogEntry _nleConsensusLogEntry = new ConsensusLogEntry(btval,
        _saeConsensusMetaProvider.getElecTerm());
    InfoCommunicatorRole._sttrpsForCoCoSy(List.of(btval), _boConsensusResultService,
        _saeConsensusMetaProvider);
    _boConsensusResultService.adspcmnConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
                befLT, begLIdx,
                new ConsensusLogEntry[]{
                    _nleConsensusLogEntry}))
        .adlcmdConsensusResultService(new AddAction(_nleConsensusLogEntry, begLIdx + 1L));
  }


  static void haeanerretForCoCoCo(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask,
      ConsensusResultService _boConsensusResultService,
      ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {

    ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply nReply;
    if (ask.getLgLt() < _saeConsensusMetaProvider.getElecTerm()) {
      nReply = new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
          _saeConsensusMetaProvider.myeConsensusNodeId(), false,
          _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie(), -1L,
          _saeConsensusMetaProvider.getElecTerm());
      _boConsensusResultService.adotgmaConsensusResultService(
          new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
              nReply, ask.getFroConsensusNodeId()));
    } else {
      _boConsensusResultService.sepecoConsensusResultService(false)
          .setmConsensusResultService(ask.getLgLt())
          .seldConsensusResultService(ask.getFroConsensusNodeId())
          .selacoConsensusResultService(ask.getLdrComLng());
      if (!FollowerNodeConsensusMessenger.isLohsmeForCo(ask.getBegLIdx(), ask.getBefLT(),
          _saeConsensusMetaProvider)) {
        assert ask.getBegLIdx() > -1L && ask.getBefLT() > -1L;

        nReply = new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
            _saeConsensusMetaProvider.myeConsensusNodeId(), false,
            _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie(),
            -1L, ask.getLgLt());
        _boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                nReply, ask.getFroConsensusNodeId()));
      } else {

        long _lgBi = ask.getBegLIdx() + 1L;

        int ofst;

        long lgIdx;
        for (ofst = 0; ofst < ask.getEtisConsensusLogEntryArray().length; ++ofst) {
          lgIdx = _lgBi + (long) ofst;

          long _lgTl = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(lgIdx);
          if (lgIdx > _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie()) {
            break;
          }

          if (lgIdx >= _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().prvid() &&
              _lgTl != ask.getEtisConsensusLogEntryArray()[ofst].getLgTe()) {
            if (lgIdx <= _saeConsensusMetaProvider.comie()) {

              throw new IllegalStateException("*** Error: f3f25e3b-ffa0-47ba-bfcd-d4a5d7ffc0eb");
            }

            _boConsensusResultService.adlcmdConsensusResultService(
                new TransactionLogActionMitImpl(lgIdx));
            break;
          }
        }

        if (ofst < ask.getEtisConsensusLogEntryArray().length) {
          _boConsensusResultService.adlcmdConsensusResultService(
              new BulkAddAction(ask.getEtisConsensusLogEntryArray(), _lgBi, ofst));
        }

        FollowerNodeConsensusMessenger.cottlgoudForCoCo(_boConsensusResultService,
            ask.getLdrComLng(),
            ask.getBegLIdx() + (long) ask.getEtisConsensusLogEntryArray().length,
            _saeConsensusMetaProvider);
        lgIdx = ask.getBegLIdx() + (long) ask.getEtisConsensusLogEntryArray().length;
        nReply = new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
            _saeConsensusMetaProvider.myeConsensusNodeId(), true, lgIdx, lgIdx,
            ask.getLgLt());
        InfoCommunicatorRole._sttrpsForCoCoSy(ask, _boConsensusResultService,
            _saeConsensusMetaProvider);
        _boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                nReply, ask.getFroConsensusNodeId()));
      }
    }
  }
}
