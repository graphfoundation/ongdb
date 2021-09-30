package io.github.onograph.cluster.raft.share.bulk;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;


class DataMessageProcessor extends
    ConsensusMessageServiceMeta.ProcessorAdaptor<Long, RuntimeException> {


  private static final DataMessageProcessor IT = new DataMessageProcessor();

  private DataMessageProcessor() {
  }


  static long ofForCo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerCmObject) {

    Long _lgDsac = _arrivingMessageManagerCmObject.getM().dipc(IT);
    return _lgDsac == null ? 0L : _lgDsac;
  }

  @Override
  public Long process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask)
      throws RuntimeException {
    return ask.getBtval().sizOptionalLong().orElse(0L);
  }

  @Override
  public Long process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask)
      throws RuntimeException {

    long _lgSt = 0L;

    ConsensusLogEntry[] _consensusLogEntryArray = ask.getEtisConsensusLogEntryArray();

    int _iVa = _consensusLogEntryArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVa2];
      if (_consensusLogEntry.getBtval().sizOptionalLong().isPresent()) {
        _lgSt += _consensusLogEntry.getBtval().sizOptionalLong().getAsLong();
      }
    }

    return _lgSt;
  }
}
