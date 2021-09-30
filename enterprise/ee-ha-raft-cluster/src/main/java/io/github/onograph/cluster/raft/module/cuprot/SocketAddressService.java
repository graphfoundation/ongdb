package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager;
import io.github.onograph.cluster.raft.share.LeaderOperations;
import java.util.Collection;
import java.util.List;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface SocketAddressService {


  default Collection<SocketAddress> alsoaeCollection(NamedDatabaseId _namedDatabaseId)
      throws CatchupNodeNotFoundException {
    return List.of(this.seoaSocketAddress(_namedDatabaseId));
  }


  SocketAddress prmySocketAddress(NamedDatabaseId _namedDatabaseId)
      throws CatchupNodeNotFoundException;


  SocketAddress seoaSocketAddress(NamedDatabaseId _namedDatabaseId)
      throws CatchupNodeNotFoundException;


  class SocketAddressServiceBasicImpl implements SocketAddressService {


    private final SocketAddress socketAddress;

    public SocketAddressServiceBasicImpl(SocketAddress _socketAddress) {
      this.socketAddress = _socketAddress;
    }

    @Override
    public SocketAddress prmySocketAddress(NamedDatabaseId _namedDatabaseId) {
      return this.socketAddress;
    }

    @Override
    public SocketAddress seoaSocketAddress(NamedDatabaseId _namedDatabaseId) {
      return this.socketAddress;
    }
  }


  class SocketAddressServiceLeaderImpl implements SocketAddressService {


    private final ClusterStructureService clusterStructureService;


    private final UpstreamSocketAddressService lausUpstreamSocketAddressService;


    private final LeaderOperations lpLeaderOperations;


    public SocketAddressServiceLeaderImpl(ClusterStructureService clusterStructureService,
        LeaderOperations _plLeaderOperations,
        NamedServiceApproachManager _ssNamedServiceApproachManager) {
      this.lpLeaderOperations = _plLeaderOperations;
      this.clusterStructureService = clusterStructureService;
      this.lausUpstreamSocketAddressService = new UpstreamSocketAddressService(
          clusterStructureService, _ssNamedServiceApproachManager);
    }

    @Override
    public Collection<SocketAddress> alsoaeCollection(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {
      return this.lausUpstreamSocketAddressService.lopaefdteCollection(_namedDatabaseId);
    }

    @Override
    public SocketAddress prmySocketAddress(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {

      ConsensusNodeId _laeConsensusNodeId = this.lpLeaderOperations.geldConsensusNodeId(
          _namedDatabaseId);
      if (_laeConsensusNodeId == null) {
        throw new CatchupNodeNotFoundException(
            new IllegalStateException(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl.laeConsensusNodeId")));
      } else {

        ServerId _serverId = this.clusterStructureService.revsvfrrmrServerId(_laeConsensusNodeId);
        return this.clusterStructureService.lopchadSocketAddress(_serverId);
      }
    }

    @Override
    public SocketAddress seoaSocketAddress(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {
      return this.lausUpstreamSocketAddressService.lopaefrdbSocketAddress(_namedDatabaseId);
    }
  }


  class SocketAddressServiceLocatorImpl implements SocketAddressService {


    private final UpstreamSocketAddressService lauUpstreamSocketAddressService;

    public SocketAddressServiceLocatorImpl(ClusterStructureService clusterStructureService,
        NamedServiceApproachManager _ssNamedServiceApproachManager) {
      this.lauUpstreamSocketAddressService = new UpstreamSocketAddressService(
          clusterStructureService, _ssNamedServiceApproachManager);
    }

    @Override
    public Collection<SocketAddress> alsoaeCollection(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {
      return this.lauUpstreamSocketAddressService.lopaefdteCollection(_namedDatabaseId);
    }

    @Override
    public SocketAddress prmySocketAddress(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {
      return this.lauUpstreamSocketAddressService.lopaefrdbSocketAddress(_namedDatabaseId);
    }

    @Override
    public SocketAddress seoaSocketAddress(NamedDatabaseId _namedDatabaseId)
        throws CatchupNodeNotFoundException {
      return this.lauUpstreamSocketAddressService.lopaefrdbSocketAddress(_namedDatabaseId);
    }
  }
}
