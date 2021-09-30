package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Optional;
import org.neo4j.kernel.database.NamedDatabaseId;


public class LeaderOperations {


  private final ClusterStructureService clusterStructureService;


  private final ConsensusLeaderNodeService llConsensusLeaderNodeService;


  public LeaderOperations(ClusterStructureService clusterStructureService,
      ConsensusLeaderNodeService _llConsensusLeaderNodeService) {
    this.clusterStructureService = clusterStructureService;
    this.llConsensusLeaderNodeService = _llConsensusLeaderNodeService;
  }


  public ConsensusNodeId geldConsensusNodeId(NamedDatabaseId _namedDatabaseId) {

    NodeServerMemberLeaderMeta _dfmlNodeServerMemberLeaderMeta = this.clusterStructureService.geldNodeServerMemberLeaderMeta(
        _namedDatabaseId);

    Optional<NodeServerMemberLeaderMeta> _optionalLfmlNodeServerMemberLeaderMeta = this.llConsensusLeaderNodeService.geldioOptional();
    return _optionalLfmlNodeServerMemberLeaderMeta.filter((leadMember) ->
    {
      return _dfmlNodeServerMemberLeaderMeta == null ||
          leadMember.getLgT() >= _dfmlNodeServerMemberLeaderMeta.getLgT();
    }).map(NodeServerMemberLeaderMeta::getImConsensusNodeId).orElseGet(() ->
    {
      return _dfmlNodeServerMemberLeaderMeta !=
          null &&
          _dfmlNodeServerMemberLeaderMeta.getImConsensusNodeId() !=
              null
          ? _dfmlNodeServerMemberLeaderMeta.getImConsensusNodeId()
          : null;
    });
  }
}
