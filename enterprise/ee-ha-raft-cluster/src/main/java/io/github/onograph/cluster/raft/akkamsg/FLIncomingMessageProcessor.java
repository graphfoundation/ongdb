package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;


public interface FLIncomingMessageProcessor<M> extends
    io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<M> {


  void startProcessor(ConsensusMemberGroupId _consensusMemberGroupId) throws Exception;


  void stopProcessor() throws Exception;
}
