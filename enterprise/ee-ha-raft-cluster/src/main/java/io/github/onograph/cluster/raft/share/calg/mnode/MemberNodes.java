package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Set;


public interface MemberNodes {


  MemberNodes EMT_MEMBER_NODES = new MemberNodes() {
    @Override
    public Set<ConsensusNodeId> recnmeSet() {
      return Set.of();
    }

    @Override
    public void retlsrForMe(
        io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener _memberNodeEventListener) {
    }

    @Override
    public Set<ConsensusNodeId> voimbsSet() {
      return Set.of();
    }
  };


  Set<ConsensusNodeId> recnmeSet();


  void retlsrForMe(
      io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener _memberNodeEventListener);


  Set<ConsensusNodeId> voimbsSet();


  interface MemberNodeEventListener {


    void onmbicn();
  }
}
