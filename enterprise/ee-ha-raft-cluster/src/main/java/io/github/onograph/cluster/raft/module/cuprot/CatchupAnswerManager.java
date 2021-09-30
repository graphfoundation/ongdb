package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.Slice;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseId;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.util.concurrent.CompletableFuture;


public class CatchupAnswerManager<T> implements CatchupAnswerServiceHandlers<T> {


  private <U> void _unltmtForCoU(CompletableFuture<T> _completableFutureSgaT, U _uRsos) {

    _completableFutureSgaT.completeExceptionally(
        new RefException("*** Error:  aefa7f05-9767-41c1-8abd-53ddf03b6999", _uRsos));
  }

  @Override
  public boolean isOnficttForCoSl(CompletableFuture<T> _completableFutureSgaT, Slice _rsosSlice) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosSlice);
    return false;
  }

  @Override
  public void onccerresForCoCa(CatchupProblem _recCatchupProblem,
      CompletableFuture<T> _completableFutureSgaT) {
    _completableFutureSgaT.completeExceptionally(
        new RuntimeException("*** Error: b83773c9-ab91-46e3-ba95-58db2f66d355"));
  }

  @Override
  public void oncospoForCoSn(CompletableFuture<T> _completableFutureSgaT,
      SnapshotData _rsosSnapshotData) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosSnapshotData);
  }

  @Override
  public void onfesaceForCoSt(CompletableFuture<T> _completableFutureSgaT,
      StoreSyncCompleted _rsosStoreSyncCompleted) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosStoreSyncCompleted);
  }

  @Override
  public void onfihdForCoSl(CompletableFuture<T> _completableFutureSgaT, SliceMeta _rsosSliceMeta) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosSliceMeta);
  }

  @Override
  public void ongadteiresForCoAl(AllGdbIds _rsosAllGdbIds,
      CompletableFuture<T> _completableFutureSgaT) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosAllGdbIds);
  }

  @Override
  public void ongdairnForCoGd(CompletableFuture<T> _completableFutureSgaT, GdbId _rsosGdbId) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosGdbId);
  }

  @Override
  public void ongmarseForCoAu(AuthMeta _rsosAuthMeta, CompletableFuture<T> _completableFutureSgaT) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosAuthMeta);
  }

  @Override
  public void ongsirpForCoSt(CompletableFuture<T> _completableFutureSgaT,
      StoreDatabaseId _rsosStoreDatabaseId) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosStoreDatabaseId);
  }

  @Override
  public void oninForCoMe(CompletableFuture<T> _completableFutureSgaT, Meta _rsosMeta) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosMeta);
  }

  @Override
  public void onsrltresForCoSe(CompletableFuture<T> _completableFutureSgaT,
      SetupGdbStoreSyncReply _rsosSetupGdbStoreSyncReply) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosSetupGdbStoreSyncReply);
  }

  @Override
  public void ontpurseForCoCaCa(
      CatchupIncomingTransactionReply _rsosCatchupIncomingTransactionReply,
      CatchupReplyChannelManager catchupReplyChannelManager,
      CompletableFuture<T> _completableFutureSgaT) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosCatchupIncomingTransactionReply);
  }

  @Override
  public void ontstfhrseForCoTr(CompletableFuture<T> _completableFutureSgaT,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    this._unltmtForCoU(_completableFutureSgaT, _rsosTransactionChunkingCompleted);
  }
}
