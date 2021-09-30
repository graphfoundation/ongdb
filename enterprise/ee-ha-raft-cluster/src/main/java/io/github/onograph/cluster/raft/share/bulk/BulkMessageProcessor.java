package io.github.onograph.cluster.raft.share.bulk;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;
import org.neo4j.internal.helpers.ArrayUtil;


class BulkMessageProcessor extends
    ConsensusMessageServiceMeta.ProcessorAdaptor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>, RuntimeException> {


  private final Instant arInstant;


  private final BulkMessageSettings cbBulkMessageSettings;


  private final ConsensusMemberGroupId consensusMemberGroupId;


  private final List<SyncableData> listBcSyncableData;


  private final List<ConsensusLogEntry> listBeConsensusLogEntry;


  private final MessageStack<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      messageStackIqArrivingMessageManager;


  BulkMessageProcessor(Instant _arInstant, BulkMessageSettings _cbBulkMessageSettings,
      ConsensusMemberGroupId consensusMemberGroupId, List<SyncableData> _listBcSyncableData,
      List<ConsensusLogEntry> _listEbConsensusLogEntry,
      MessageStack<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _messageStackQiArrivingMessageManager) {
    this.arInstant = _arInstant;
    this.cbBulkMessageSettings = _cbBulkMessageSettings;
    this.consensusMemberGroupId = consensusMemberGroupId;
    this.listBcSyncableData = _listBcSyncableData;
    this.listBeConsensusLogEntry = _listEbConsensusLogEntry;
    this.messageStackIqArrivingMessageManager = _messageStackQiArrivingMessageManager;
  }


  private static long _adagseForCoLi(ConsensusLogEntry[] _etisConsensusLogEntryArray,
      List<ConsensusLogEntry> _listBeConsensusLogEntry) {

    long sizeCnt = 0L;

    ConsensusLogEntry[] _consensusLogEntryArray = _etisConsensusLogEntryArray;

    int _iVa = _etisConsensusLogEntryArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVa2];
      sizeCnt += _geseForSy(_consensusLogEntry.getBtval());
      _listBeConsensusLogEntry.add(_consensusLogEntry);
    }

    return sizeCnt;
  }


  private static long _geseForSy(ConsensusLogEntry[] _etisConsensusLogEntryArray) {
    return Arrays.stream(_etisConsensusLogEntryArray).flatMapToLong((raftLogEntry) ->
    {
      return raftLogEntry.getBtval().sizOptionalLong().stream();
    }).sum();
  }


  private static long _geseForSy(SyncableData btval) {
    return btval.sizOptionalLong().orElse(0L);
  }


  private static boolean _isCoceoiForCoCo(
      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask, int _iCs,
      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask isStrt) {
    if (ask.getLgLt() != isStrt.getLgLt()) {
      return false;
    } else {
      return ask.getBegLIdx() == isStrt.getBegLIdx() + (long) _iCs;
    }
  }


  private static Predicate<ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask> _vaadeiplPredicate(
      int _iSc, int _iSm, ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask isStrt,
      long _lgBc, long _lgBm) {

    Predicate<ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask> _predicateCoAsk = (request) ->
    {
      return request.getEtisConsensusLogEntryArray().length != 0 && _isCoceoiForCoCo(request, _iSc,
          isStrt);
    };

    Predicate<ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask> _predicateClAsk = (request) ->
    {
      return request.getEtisConsensusLogEntryArray().length + _iSc <= _iSm;
    };

    Predicate<ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask> _predicateScAsk = (request) ->
    {

      long _lgBr = _geseForSy(request.getEtisConsensusLogEntryArray());
      return _lgBr <= 0L || _lgBc + _lgBr <= _lgBm;
    };
    return _predicateCoAsk.and(_predicateClAsk).and(_predicateScAsk);
  }


  private ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask _baadeiConsensusMessageServiceMetaTransactionLogAddMessageAsk(
      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask isStrt) {

    long sizeCnt = _adagseForCoLi(isStrt.getEtisConsensusLogEntryArray(),
        this.listBeConsensusLogEntry);

    long ldrComLng = isStrt.getLdrComLng();

    ConsensusLogEntry[] _etisConsensusLogEntryArray;
    for (

        long _lgTl = ArrayUtil.lastOf(isStrt.getEtisConsensusLogEntryArray()).getLgTe();
        this.listBeConsensusLogEntry.size() < this.cbBulkMessageSettings.mabccot;
        _lgTl = ArrayUtil.lastOf(_etisConsensusLogEntryArray).getLgTe()) {

      Optional<ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask> _optionalRoAsk =
          this._polnxOptional(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask.class,
              _vaadeiplPredicate(this.listBeConsensusLogEntry.size(),
                  this.cbBulkMessageSettings.mabccot, isStrt,
                  sizeCnt,
                  this.cbBulkMessageSettings.mabcbys));
      if (_optionalRoAsk.isEmpty()) {
        break;
      }

      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask = _optionalRoAsk.get();

      assert _lgTl == ask.getBefLT();

      _etisConsensusLogEntryArray = ask.getEtisConsensusLogEntryArray();
      sizeCnt += _adagseForCoLi(_etisConsensusLogEntryArray, this.listBeConsensusLogEntry);
      ldrComLng = Long.max(ldrComLng, ask.getLdrComLng());
    }

    return new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(isStrt.getBefLT(),
        isStrt.getBegLIdx(),
        this.listBeConsensusLogEntry.toArray(
            ConsensusLogEntry.emtConsensusLogEntryArray),
        isStrt.getFroConsensusNodeId(), ldrComLng, isStrt.getLgLt());
  }


  private ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk _banetConsensusMessageServiceMetaMsgCreatorServiceBulkAsk(
      ConsensusMessageServiceMeta.MsgCreatorService.Ask isStrt) {
    this.listBcSyncableData.add(isStrt.getBtval());

    MutableInt _stMutableInt = new MutableInt(_geseForSy(isStrt.getBtval()));

    while (this.listBcSyncableData.size() < this.cbBulkMessageSettings.mabccot) {

      Optional<ConsensusMessageServiceMeta.MsgCreatorService.Ask> _optionalOrAsk =
          this._polnxOptional(ConsensusMessageServiceMeta.MsgCreatorService.Ask.class, (request) ->
          {
            return (long) _stMutableInt.addAndGet(_geseForSy(request.getBtval()))
                <= this.cbBulkMessageSettings.mabcbys;
          });
      if (_optionalOrAsk.isEmpty()) {
        break;
      }

      this.listBcSyncableData.add(_optionalOrAsk.get().getBtval());
    }

    return new ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk(this.listBcSyncableData);
  }


  private <M> Optional<M> _polnxOptional(Class<M> _classTaM, Predicate<M> _predicatePaM) {
    return this.messageStackIqArrivingMessageManager.poliOptional(
        this._tyesfpoPredicate(_classTaM, _predicatePaM)).map((r) ->
    {
      return _classTaM.cast(
          r.getM());
    });
  }


  private <M> Predicate<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _tyesfpoPredicate(
      Class<M> _classTiM, Predicate<M> _predicatePaM) {
    return (InboundRaftMessageContainer) ->
    {
      return _classTiM.isInstance(InboundRaftMessageContainer.getM()) &&
          _predicatePaM.test(_classTiM.cast(InboundRaftMessageContainer.getM()));
    };
  }

  @Override
  public io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> process(
      ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) throws RuntimeException {

    ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk _benBulkAsk = this._banetConsensusMessageServiceMetaMsgCreatorServiceBulkAsk(
        ask);
    return io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
        this.arInstant, this.consensusMemberGroupId, _benBulkAsk);
  }

  @Override
  public io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> process(
      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask)
      throws RuntimeException {
    if (ask.getEtisConsensusLogEntryArray().length == 0) {
      return null;
    } else {

      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask _beaAsk = this._baadeiConsensusMessageServiceMetaTransactionLogAddMessageAsk(
          ask);
      return io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
          this.arInstant, this.consensusMemberGroupId, _beaAsk);
    }
  }
}
