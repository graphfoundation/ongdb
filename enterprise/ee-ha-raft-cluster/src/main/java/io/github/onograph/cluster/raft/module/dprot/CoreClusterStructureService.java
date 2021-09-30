package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface CoreClusterStructureService extends ClusterStructureService {


  void adlccrtolnForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _coreStructureHandler);


  void hadspdwForNa(long _lgVa, NamedDatabaseId _namedDatabaseId);


  boolean isCaboadaForNa(NamedDatabaseId _namedDatabaseId);


  boolean isDiboadaForNa(NamedDatabaseId _namedDatabaseId);


  SocketAddress loprasSocketAddress(ConsensusNodeId _consensusNodeId);


  void onrtmekwForNaCo(ConsensusNodeId _consensusNodeId, NamedDatabaseId _namedDatabaseId);


  ConsensusIdStatusType pulhrfidConsensusIdStatusType(
      ConsensusMemberGroupId _consensusMemberGroupId, ConsensusNodeId _consensusNodeId)
      throws TimeoutException;


  void reellctolsrForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _coreStructureHandler);


  void seldForNoNa(NamedDatabaseId _namedDatabaseId,
      NodeServerMemberLeaderMeta _nodeServerMemberLeaderMeta);


  interface CoreStructureHandler {


    NamedDatabaseId nadaiNamedDatabaseId();


    void oncetlchForSe(Set<ConsensusNodeId> _setVConsensusNodeId);
  }
}
