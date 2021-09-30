package io.github.onograph.cluster.raft.gateway.gwlb;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers;
import io.github.onograph.cluster.raft.share.calg.MainLeaderNodeEventHandlers;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;


public class ClusterLeaderImpl extends ClusterLeaderDistributedImpl implements
    MainLeaderNodeEventHandlers {


  private final Map<NamedDatabaseId, ConsensusNodeId> mapLcnc = new ConcurrentHashMap();

  public ClusterLeaderImpl(ClusterStructureService clusterStructureService,
      LogProvider _logProvider) {
    super(clusterStructureService, _logProvider);
  }


  private Optional<ConsensusNodeId> _cunldacntraOptional(NamedDatabaseId _namedDatabaseId) {

    Optional<ConsensusNodeId> _optionalLaeConsensusNodeId = Optional.ofNullable(
        this.mapLcnc.get(_namedDatabaseId));
    _optionalLaeConsensusNodeId.ifPresent((l) ->
    {

    });
    return _optionalLaeConsensusNodeId;
  }


  public LeaderNodeEventHandlers cralteLeaderNodeEventHandlers(NamedDatabaseId _namedDatabaseId) {
    return new io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderImpl.LeaderNodeEventHandlersImpl(
        _namedDatabaseId, this);
  }

  @Override
  public Optional<ServerId> geldiOptional(NamedDatabaseId _namedDatabaseId) {

    Optional<ConsensusNodeId> _optionalVr00ConsensusNodeId = this._cunldacntraOptional(
        _namedDatabaseId);

    ClusterStructureService _clusterStructureService = this.clusterStructureService;
    Objects.requireNonNull(_clusterStructureService);
    return _optionalVr00ConsensusNodeId.map(_clusterStructureService::revsvfrrmrServerId).or(() ->
    {
      return super.geldiOptional(_namedDatabaseId);
    });
  }

  @Override
  public void onleeswcForNaNo(NamedDatabaseId _namedDatabaseId,
      NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta) {
    this.mapLcnc.compute(_namedDatabaseId, (namedDatabaseId, memberId) ->
    {
      return _ilNodeServerMemberLeaderMeta.getImConsensusNodeId();
    });
  }

  @Override
  public void onungtForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapLcnc.remove(_namedDatabaseId);
  }


  private static class LeaderNodeEventHandlersImpl implements LeaderNodeEventHandlers {


    private final NamedDatabaseId dfNamedDatabaseId;


    private final MainLeaderNodeEventHandlers llgMainLeaderNodeEventHandlers;

    LeaderNodeEventHandlersImpl(NamedDatabaseId _dfNamedDatabaseId,
        MainLeaderNodeEventHandlers _llgMainLeaderNodeEventHandlers) {
      this.dfNamedDatabaseId = _dfNamedDatabaseId;
      this.llgMainLeaderNodeEventHandlers = _llgMainLeaderNodeEventHandlers;
    }

    @Override
    public void onleeswcForNo(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta) {
      this.llgMainLeaderNodeEventHandlers.onleeswcForNaNo(this.dfNamedDatabaseId,
          _ilNodeServerMemberLeaderMeta);
    }

    @Override
    public void onungt() {
      this.llgMainLeaderNodeEventHandlers.onungtForNa(this.dfNamedDatabaseId);
    }
  }
}
