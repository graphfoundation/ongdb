package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Set;


public interface ConsensusNodes<MEMBER> extends SyncableData {


  Set<MEMBER> gembsSet();


  interface ConsensusNodesFactory<MEMBER> {


    ConsensusNodes<MEMBER> bulConsensusNodes(Set<MEMBER> _setVaMEMBER);
  }
}
