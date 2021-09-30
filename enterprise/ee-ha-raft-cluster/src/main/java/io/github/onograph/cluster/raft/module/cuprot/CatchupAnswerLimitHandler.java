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
import java.io.IOException;


public interface CatchupAnswerLimitHandler {


  boolean isOnficttForSl(Slice _slice) throws IOException;


  void onccerresForCa(CatchupProblem _catchupProblem);


  void oncle();


  void oncospoForSn(SnapshotData _snapshotData);


  void onfesaceForSt(StoreSyncCompleted _storeSyncCompleted);


  void onfihdForSl(SliceMeta _sliceMeta);


  void ongadteiresForAl(AllGdbIds _allGdbIds);


  void ongdairnForGd(GdbId _gdbId);


  void ongmarseForAu(AuthMeta _authMeta);


  void ongsirpForSt(StoreDatabaseId _storeDatabaseId);


  void oninForMe(Meta _meta);


  void onsrltresForSe(SetupGdbStoreSyncReply _setupGdbStoreSyncReply);


  void ontpurseForCa(CatchupIncomingTransactionReply _catchupIncomingTransactionReply);


  void ontstfhrseForTr(TransactionChunkingCompleted _transactionChunkingCompleted);
}
