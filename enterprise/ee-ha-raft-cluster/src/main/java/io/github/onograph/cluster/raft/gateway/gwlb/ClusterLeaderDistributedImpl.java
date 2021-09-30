package io.github.onograph.cluster.raft.gateway.gwlb;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryAddressesProvider;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ClusterLeaderDistributedImpl implements ClusterLeader {


  protected final ClusterStructureService clusterStructureService;


  protected final Log log;

  public ClusterLeaderDistributedImpl(ClusterStructureService clusterStructureService,
      LogProvider _logProvider) {
    this.clusterStructureService = clusterStructureService;
    this.log = _logProvider.getLog(this.getClass());
  }


  private Optional<ConsensusNodeId> _gelaidftosrOptional(NamedDatabaseId _namedDatabaseId) {
    return Optional.ofNullable(
            this.clusterStructureService.geldNodeServerMemberLeaderMeta(_namedDatabaseId))
        .map(NodeServerMemberLeaderMeta::getImConsensusNodeId);
  }


  private Optional<ConsensusNodeId> _lerftoOptional(NamedDatabaseId _namedDatabaseId) {

    Optional<ConsensusNodeId> _optionalIlConsensusNodeId = this._gelaidftosrOptional(
        _namedDatabaseId);

    return _optionalIlConsensusNodeId;
  }


  private Optional<SocketAddress> _revbtaeOptional(ServerId _serverId) {

    Map<ServerId, GdbDiscoveryMetaCoreImpl> _mapIbcsg = this.clusterStructureService.alcesrrMap();

    return Optional.ofNullable(_mapIbcsg.get(_serverId))
        .map(DiscoveryAddressesProvider::botadsSocketAddress);
  }

  @Override
  public Optional<SocketAddress> gelaboadOptional(NamedDatabaseId _namedDatabaseId) {

    Optional<SocketAddress> _optionalAblSocketAddress = this.geldiOptional(_namedDatabaseId)
        .flatMap(this::_revbtaeOptional);

    return _optionalAblSocketAddress;
  }

  @Override
  public Optional<ServerId> geldiOptional(NamedDatabaseId _namedDatabaseId) {

    Optional<ConsensusNodeId> _optionalVr00ConsensusNodeId = this._lerftoOptional(_namedDatabaseId);

    ClusterStructureService _clusterStructureService = this.clusterStructureService;
    Objects.requireNonNull(_clusterStructureService);
    return _optionalVr00ConsensusNodeId.map(_clusterStructureService::revsvfrrmrServerId);
  }
}
