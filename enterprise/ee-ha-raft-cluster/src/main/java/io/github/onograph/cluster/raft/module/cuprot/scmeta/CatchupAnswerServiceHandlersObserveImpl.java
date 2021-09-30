package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerServiceHandlers;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.util.concurrent.CompletableFuture;


class CatchupAnswerServiceHandlersObserveImpl<T> implements CatchupAnswerServiceHandlers<T> {


  private final CatchupAnswerServiceHandlers<T> catchupAnswerServiceHandlersDlgtT;


  private final StoreSyncStatusPusher clbcStoreSyncStatusPusher;

  CatchupAnswerServiceHandlersObserveImpl(
      CatchupAnswerServiceHandlers<T> _catchupAnswerServiceHandlersDlgtT,
      StoreSyncStatusPusher _clbcStoreSyncStatusPusher) {
    this.catchupAnswerServiceHandlersDlgtT = _catchupAnswerServiceHandlersDlgtT;
    this.clbcStoreSyncStatusPusher = _clbcStoreSyncStatusPusher;
  }


  private void _sucs() {
    this.clbcStoreSyncStatusPusher.pushStatus();
  }

  @Override
  public boolean isOnficttForCoSl(CompletableFuture<T> _completableFutureSgaT, Slice _cfSlice) {
    this._sucs();
    return this.catchupAnswerServiceHandlersDlgtT.isOnficttForCoSl(_completableFutureSgaT,
        _cfSlice);
  }

  @Override
  public void onccerresForCoCa(CatchupProblem _recCatchupProblem,
      CompletableFuture<T> _completableFutureSgaT) {
    this.catchupAnswerServiceHandlersDlgtT.onccerresForCoCa(_recCatchupProblem,
        _completableFutureSgaT);
  }

  @Override
  public void oncospoForCoSn(CompletableFuture<T> _completableFutureSgaT,
      SnapshotData _scSnapshotData) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.oncospoForCoSn(_completableFutureSgaT, _scSnapshotData);
  }

  @Override
  public void onfesaceForCoSt(CompletableFuture<T> _completableFutureSgaT,
      StoreSyncCompleted _rsosStoreSyncCompleted) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.onfesaceForCoSt(_completableFutureSgaT,
        _rsosStoreSyncCompleted);
  }

  @Override
  public void onfihdForCoSl(CompletableFuture<T> _completableFutureSgaT, SliceMeta _hfSliceMeta) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.onfihdForCoSl(_completableFutureSgaT, _hfSliceMeta);
  }

  @Override
  public void ongadteiresForCoAl(AllGdbIds _rsosAllGdbIds,
      CompletableFuture<T> _completableFutureSgaT) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ongadteiresForCoAl(_rsosAllGdbIds,
        _completableFutureSgaT);
  }

  @Override
  public void ongdairnForCoGd(CompletableFuture<T> _completableFutureSgaT, GdbId _rsosGdbId) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ongdairnForCoGd(_completableFutureSgaT, _rsosGdbId);
  }

  @Override
  public void ongmarseForCoAu(AuthMeta _rsosAuthMeta, CompletableFuture<T> _completableFutureSgaT) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ongmarseForCoAu(_rsosAuthMeta, _completableFutureSgaT);
  }

  @Override
  public void ongsirpForCoSt(CompletableFuture<T> _completableFutureSgaT,
      StoreDatabaseId _rsosStoreDatabaseId) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ongsirpForCoSt(_completableFutureSgaT,
        _rsosStoreDatabaseId);
  }

  @Override
  public void oninForCoMe(CompletableFuture<T> _completableFutureSorT, Meta _rsosMeta) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.oninForCoMe(_completableFutureSorT, _rsosMeta);
  }

  @Override
  public void onsrltresForCoSe(CompletableFuture<T> _completableFutureSgaT,
      SetupGdbStoreSyncReply _pscrSetupGdbStoreSyncReply) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.onsrltresForCoSe(_completableFutureSgaT,
        _pscrSetupGdbStoreSyncReply);
  }

  @Override
  public void ontpurseForCoCaCa(CatchupIncomingTransactionReply _tCatchupIncomingTransactionReply,
      CatchupReplyChannelManager catchupReplyChannelManager,
      CompletableFuture<T> _completableFutureSgaT) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ontpurseForCoCaCa(_tCatchupIncomingTransactionReply,
        catchupReplyChannelManager, _completableFutureSgaT);
  }

  @Override
  public void ontstfhrseForCoTr(CompletableFuture<T> _completableFutureSgaT,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    this._sucs();
    this.catchupAnswerServiceHandlersDlgtT.ontstfhrseForCoTr(_completableFutureSgaT,
        _rsosTransactionChunkingCompleted);
  }
}
