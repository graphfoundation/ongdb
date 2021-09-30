package io.github.onograph.cluster.raft.share.calg.meta;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import java.util.Set;


public interface ConsensusMetaProvider {


  long comie();


  ConsensusTransactionLogEntry enrloConsensusTransactionLogEntry();


  ConsensusNodeFollowersMeta<ConsensusNodeId> folesteConsensusNodeFollowersMeta();


  long getElecTerm();


  Set<ConsensusNodeId> hebresSet();


  boolean isArtarlr();


  boolean isArtmstd();


  boolean isPreltn();


  long laloiebowbele();


  ConsensusNodeId ledConsensusNodeId();


  long ledcm();


  NodeServerMemberLeaderMeta ledioNodeServerMemberLeaderMeta();


  ConsensusNodeId myeConsensusNodeId();


  Set<ConsensusNodeId> prvefomeSet();


  Set<ConsensusNodeId> recnmeSet();


  ConsensusNodeId voefoConsensusNodeId();


  Set<ConsensusNodeId> voefomeSet();


  Set<ConsensusNodeId> voimbsSet();
}
