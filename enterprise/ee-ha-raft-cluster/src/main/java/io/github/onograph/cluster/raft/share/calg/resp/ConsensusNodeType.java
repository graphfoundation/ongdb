package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessagingService;


public enum ConsensusNodeType {


  CNT_NODE_FOLLOWER(new FollowerNodeConsensusMessenger()),

  CNT_NODE_POT(new CandidateNodeConsensusMessenger()),

  CNT_NODE_LEADER(new LeaderNodeConsensusMessenger());


  public final ConsensusMessagingService consensusMessagingService;

  ConsensusNodeType(ConsensusMessagingService _hnlrConsensusMessagingService) {
    this.consensusMessagingService = _hnlrConsensusMessagingService;
  }
}
