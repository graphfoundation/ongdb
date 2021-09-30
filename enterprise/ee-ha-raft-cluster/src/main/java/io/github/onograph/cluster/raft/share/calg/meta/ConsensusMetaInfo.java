package io.github.onograph.cluster.raft.share.calg.meta;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Set;


public interface ConsensusMetaInfo {


  long apeie();


  long comie();


  long getElecTerm();


  long getPrevIdxFromLeco();


  Set<ConsensusNodeId> getVoters();


  long ledcm();
}
