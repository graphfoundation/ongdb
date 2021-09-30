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


public interface CatchupAnswerServiceHandlers<T> {


  boolean isOnficttForCoSl(CompletableFuture<T> _completableFutureVT, Slice _slice);


  void onccerresForCoCa(CatchupProblem _catchupProblem, CompletableFuture<T> _completableFutureVT);


  void oncospoForCoSn(CompletableFuture<T> _completableFutureVarT, SnapshotData _snapshotData);


  void onfesaceForCoSt(CompletableFuture<T> _completableFutureVT,
      StoreSyncCompleted _storeSyncCompleted);


  void onfihdForCoSl(CompletableFuture<T> _completableFutureVaT, SliceMeta _sliceMeta);


  void ongadteiresForCoAl(AllGdbIds _allGdbIds, CompletableFuture<T> _completableFutureVT);


  void ongdairnForCoGd(CompletableFuture<T> _completableFutureVarT, GdbId _gdbId);


  void ongmarseForCoAu(AuthMeta _authMeta, CompletableFuture<T> _completableFutureVT);


  void ongsirpForCoSt(CompletableFuture<T> _completableFutureVaT, StoreDatabaseId _storeDatabaseId);


  void oninForCoMe(CompletableFuture<T> _completableFutureVarT, Meta _meta);


  void onsrltresForCoSe(CompletableFuture<T> _completableFutureVT,
      SetupGdbStoreSyncReply _setupGdbStoreSyncReply);


  void ontpurseForCoCaCa(CatchupIncomingTransactionReply _catchupIncomingTransactionReply,
      CatchupReplyChannelManager _catchupReplyChannelManager,
      CompletableFuture<T> _completableFutureVaT);


  void ontstfhrseForCoTr(CompletableFuture<T> _completableFutureVarT,
      TransactionChunkingCompleted _transactionChunkingCompleted);
}
