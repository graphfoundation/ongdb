package io.github.onograph.cluster.raft.share.bulk;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.time.Instant;
import java.util.ArrayList;


class BulkMessageManager {


  private final ArrayList<SyncableData> arrayListBcrSyncableData;


  private final ArrayList<ConsensusLogEntry> arrayListBerConsensusLogEntry;


  private final BulkMessageSettings cbBulkMessageSettings;


  private final MessageStack<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      messageStackQiArrivingMessageManager;

  BulkMessageManager(BulkMessageSettings _cbBulkMessageSettings,
      MessageStack<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _messageStackIqArrivingMessageManager) {
    this.cbBulkMessageSettings = _cbBulkMessageSettings;
    this.arrayListBerConsensusLogEntry = new ArrayList(_cbBulkMessageSettings.mabccot);
    this.arrayListBcrSyncableData = new ArrayList(_cbBulkMessageSettings.mabccot);
    this.messageStackQiArrivingMessageManager = _messageStackIqArrivingMessageManager;
  }


  BulkMessageProcessor baihnBulkMessageProcessor(ConsensusMemberGroupId consensusMemberGroupId,
      Instant _raInstant) {
    this.arrayListBcrSyncableData.clear();
    this.arrayListBerConsensusLogEntry.clear();
    return new BulkMessageProcessor(_raInstant, this.cbBulkMessageSettings, consensusMemberGroupId,
        this.arrayListBcrSyncableData,
        this.arrayListBerConsensusLogEntry, this.messageStackQiArrivingMessageManager);
  }
}
