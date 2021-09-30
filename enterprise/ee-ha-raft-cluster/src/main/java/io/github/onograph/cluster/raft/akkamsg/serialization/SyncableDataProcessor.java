package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper;
import io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import java.io.IOException;


public interface SyncableDataProcessor {


  void process(AbstractTransactionSync _abstractTransactionSync) throws IOException;


  void process(ConsensusNodeServerMemberIdWrapper _consensusNodeServerMemberIdWrapper)
      throws IOException;


  void process(RequestData _requestData) throws IOException;


  void process(LeaderNodeDataSDWrapper _leaderNodeDataSDWrapper) throws IOException;


  void process(SyncableLeasableCoreNodeData _syncableLeasableCoreNodeData) throws IOException;


  void process(DataSyncClusterAction _dataSyncClusterAction) throws IOException;


  void process(DefaultSDEmptyReq _defaultSDEmptyReq) throws IOException;


  void process(AskState _askState) throws IOException;
}
