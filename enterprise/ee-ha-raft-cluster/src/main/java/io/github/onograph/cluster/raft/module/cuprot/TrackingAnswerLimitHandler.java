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
import io.netty.channel.Channel;
import java.nio.channels.ClosedChannelException;
import java.time.Clock;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;


class TrackingAnswerLimitHandler implements CatchupAnswerLimitHandler {


  private static final CompletableFuture<Object> COMPLETABLE_FUTURE_ILELTE_OBJECT =
      CompletableFuture.failedFuture(
          new IllegalStateException("*** Error:  1767d3b2-cf5f-4718-bbdf-71022a58652d"));


  private static final CatchupAnswerManager ILEL_EVXHDLR = new CatchupAnswerManager();


  private static final long NO_REPS_LTM = 1L;


  private final CatchupReplyChannelManager catchupReplyChannelManager;


  private final Clock clock;


  private CompletableFuture<?> completableFutureSorObject;


  private CatchupAnswerServiceHandlers dlgtCatchupAnswerServiceHandlers;


  private volatile boolean isCoe;


  private long lgTrl = 1L;

  TrackingAnswerLimitHandler(Clock _clock, Channel _fcChannel) {
    this.clock = _clock;
    this.catchupReplyChannelManager = new CatchupReplyChannelManager(_fcChannel);
    this.clrnhn();
  }


  private void _ifnocaeeForRu(Runnable _runnable) {
    if (!this.completableFutureSorObject.isCancelled()) {
      this._redlrn();
      _runnable.run();
    }
  }


  private void _redlrn() {
    this.lgTrl = this.clock.millis();
  }


  private void _silcncoForCo(CompletableFuture<?> _completableFutureSorObject) {
    _completableFutureSorObject.completeExceptionally(new ClosedChannelException());
  }


  void clrnhn() {
    this.completableFutureSorObject = COMPLETABLE_FUTURE_ILELTE_OBJECT;
    this.dlgtCatchupAnswerServiceHandlers = ILEL_EVXHDLR;
    this.lgTrl = 1L;
  }

  @Override
  public boolean isOnficttForSl(Slice _cfSlice) {
    if (!this.completableFutureSorObject.isCancelled()) {
      this._redlrn();
      return this.dlgtCatchupAnswerServiceHandlers.isOnficttForCoSl(this.completableFutureSorObject,
          _cfSlice);
    } else {
      return true;
    }
  }


  OptionalLong mselrnOptionalLong() {
    return this.lgTrl == 1L ? OptionalLong.empty()
        : OptionalLong.of(this.clock.millis() - this.lgTrl);
  }

  @Override
  public void onccerresForCa(CatchupProblem _recCatchupProblem) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.onccerresForCoCa(_recCatchupProblem,
          this.completableFutureSorObject);
    });
  }

  @Override
  public synchronized void oncle() {
    this.isCoe = true;
    this._silcncoForCo(this.completableFutureSorObject);
  }

  @Override
  public void oncospoForSn(SnapshotData _scSnapshotData) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.oncospoForCoSn(this.completableFutureSorObject,
          _scSnapshotData);
    });
  }

  @Override
  public void onfesaceForSt(StoreSyncCompleted _rsosStoreSyncCompleted) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.onfesaceForCoSt(this.completableFutureSorObject,
          _rsosStoreSyncCompleted);
    });
  }

  @Override
  public void onfihdForSl(SliceMeta _hfSliceMeta) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.onfihdForCoSl(this.completableFutureSorObject,
          _hfSliceMeta);
    });
  }

  @Override
  public void ongadteiresForAl(AllGdbIds _rsosAllGdbIds) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ongadteiresForCoAl(_rsosAllGdbIds,
          this.completableFutureSorObject);
    });
  }

  @Override
  public void ongdairnForGd(GdbId _rsosGdbId) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ongdairnForCoGd(this.completableFutureSorObject,
          _rsosGdbId);
    });
  }

  @Override
  public void ongmarseForAu(AuthMeta _rsosAuthMeta) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ongmarseForCoAu(_rsosAuthMeta,
          this.completableFutureSorObject);
    });
  }

  @Override
  public void ongsirpForSt(StoreDatabaseId _rsosStoreDatabaseId) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ongsirpForCoSt(this.completableFutureSorObject,
          _rsosStoreDatabaseId);
    });
  }

  @Override
  public void oninForMe(Meta _rsosMeta) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.oninForCoMe(this.completableFutureSorObject, _rsosMeta);
    });
  }

  @Override
  public void onsrltresForSe(SetupGdbStoreSyncReply _rlsSetupGdbStoreSyncReply) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.onsrltresForCoSe(this.completableFutureSorObject,
          _rlsSetupGdbStoreSyncReply);
    });
  }

  @Override
  public void ontpurseForCa(CatchupIncomingTransactionReply _tCatchupIncomingTransactionReply) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ontpurseForCoCaCa(_tCatchupIncomingTransactionReply,
          this.catchupReplyChannelManager,
          this.completableFutureSorObject);
    });
  }

  @Override
  public void ontstfhrseForTr(TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    this._ifnocaeeForRu(() ->
    {
      this.dlgtCatchupAnswerServiceHandlers.ontstfhrseForCoTr(this.completableFutureSorObject,
          _rsosTransactionChunkingCompleted);
    });
  }


  synchronized void sersehlForCaCo(CompletableFuture<?> _completableFutureSorObject,
      CatchupAnswerServiceHandlers _rhCatchupAnswerServiceHandlers) {
    if (this.isCoe) {
      this._silcncoForCo(_completableFutureSorObject);
    } else {
      this.dlgtCatchupAnswerServiceHandlers = _rhCatchupAnswerServiceHandlers;
      this.completableFutureSorObject = _completableFutureSorObject;
      this.lgTrl = 1L;
    }
  }
}
