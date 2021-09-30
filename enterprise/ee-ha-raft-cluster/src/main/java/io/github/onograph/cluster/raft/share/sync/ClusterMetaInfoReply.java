package io.github.onograph.cluster.raft.share.sync;

import java.util.List;


public final class ClusterMetaInfoReply {


  private final List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> listRsossInfoReplyMessage;


  private final SyncMeta rrSyncMeta;

  public ClusterMetaInfoReply(
      List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> _listRsossInfoReplyMessage,
      SyncMeta _rrSyncMeta) {
    this.listRsossInfoReplyMessage = _listRsossInfoReplyMessage;
    this.rrSyncMeta = _rrSyncMeta;
  }


  public List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> getListRsossInfoReplyMessage() {
    return this.listRsossInfoReplyMessage;
  }


  public SyncMeta getRrSyncMeta() {
    return this.rrSyncMeta;
  }
}
