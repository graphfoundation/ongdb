package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachException;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class UpstreamSocketAddressService {


  private final ClusterStructureService clusterStructureService;


  private final NamedServiceApproachManager ssNamedServiceApproachManager;


  UpstreamSocketAddressService(ClusterStructureService clusterStructureService,
      NamedServiceApproachManager _ssNamedServiceApproachManager) {
    this.clusterStructureService = clusterStructureService;
    this.ssNamedServiceApproachManager = _ssNamedServiceApproachManager;
  }


  public Collection<SocketAddress> lopaefdteCollection(NamedDatabaseId _namedDatabaseId)
      throws CatchupNodeNotFoundException {
    try {

      Collection<ServerId> _collectionSuServerId = this.ssNamedServiceApproachManager.beupasvfodaCollection(
          _namedDatabaseId);

      ArrayList<SocketAddress> _arrayListAuSocketAddress = new ArrayList();

      Iterator _iterator = _collectionSuServerId.iterator();

      while (_iterator.hasNext()) {

        ServerId _serverId = (ServerId) _iterator.next();
        _arrayListAuSocketAddress.add(this.clusterStructureService.lopchadSocketAddress(_serverId));
      }

      return _arrayListAuSocketAddress;
    } catch (

        NamedServiceApproachException _namedServiceApproachException) {
      throw new CatchupNodeNotFoundException(_namedServiceApproachException);
    }
  }


  public SocketAddress lopaefrdbSocketAddress(NamedDatabaseId _namedDatabaseId)
      throws CatchupNodeNotFoundException {
    try {

      ServerId _suServerId = this.ssNamedServiceApproachManager.beupasvfrdbServerId(
          _namedDatabaseId);
      return this.clusterStructureService.lopchadSocketAddress(_suServerId);
    } catch (

        NamedServiceApproachException _namedServiceApproachException) {
      throw new CatchupNodeNotFoundException(_namedServiceApproachException);
    }
  }
}
