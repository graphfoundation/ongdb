package io.github.onograph.cluster.raft.share.bulk;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import java.util.Comparator;


class BulkPriorityQueueMessageProcessor extends
    ConsensusMessageServiceMeta.ProcessorAdaptor<Integer, RuntimeException>
    implements
    Comparator<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final Integer iBs_ro = 10;


  private int _gepotForCo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerCmObject) {

    Integer _iPirt = _arrivingMessageManagerCmObject.getM().dipc(this);
    return _iPirt == null ? this.iBs_ro : _iPirt;
  }

  @Override
  public int compare(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerAcmObject,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerBcmObject) {

    int _iAp = this._gepotForCo(_arrivingMessageManagerAcmObject);

    int _iBp = this._gepotForCo(_arrivingMessageManagerBcmObject);
    return Integer.compare(_iAp, _iBp);
  }

  @Override
  public Integer process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask) {
    return ask.getEtisConsensusLogEntryArray().length == 0 ? this.iBs_ro : 20;
  }

  @Override
  public Integer process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
    return 30;
  }
}
