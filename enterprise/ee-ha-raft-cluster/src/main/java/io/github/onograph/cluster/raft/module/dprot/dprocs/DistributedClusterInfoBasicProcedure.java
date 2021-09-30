package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DistributedClusterInfoBasicProcedure extends ClusterInfoBasicProcedure {


  private final ClusterStructureService clusterStructureService;


  private final DatabaseIdRepository databaseIdRepository;

  public DistributedClusterInfoBasicProcedure(ClusterStructureService clusterStructureService,
      DatabaseIdRepository _databaseIdRepository) {
    this.clusterStructureService = clusterStructureService;
    this.databaseIdRepository = _databaseIdRepository;
  }


  private io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _bulrelroClusterInfoBasicProcedureComparableInfoWrapper(
      Function<NamedDatabaseId, ClusterNodeRoleType> _functionRslnc,
      GdbDiscoveryMeta _isGdbDiscoveryMeta, ServerId _serverId) {

    Map<NamedDatabaseId, ClusterNodeRoleType> _mapDtbssnc = _isGdbDiscoveryMeta.stedaiSet().stream()
        .flatMap((databaseId) ->
        {
          return this.databaseIdRepository
              .getById(databaseId).stream();
        })
        .collect(Collectors.toMap(Function.identity(), _functionRslnc));
    return new io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper(
        _isGdbDiscoveryMeta.contsDiscoverySocketAddresses(), _serverId.uuid(), _mapDtbssnc,
        _isGdbDiscoveryMeta.gruSet());
  }


  private io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _burtrfoceClusterInfoBasicProcedureComparableInfoWrapper(
      GdbDiscoveryMetaCoreImpl _icGdbDiscoveryMetaCoreImpl, ServerId _serverId) {
    return this._bulrelroClusterInfoBasicProcedureComparableInfoWrapper((databaseId) ->
    {
      return this.clusterStructureService.lokreClusterNodeRoleType(databaseId,
          _serverId);
    }, _icGdbDiscoveryMetaCoreImpl, _serverId);
  }


  private io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _burtrfordriClusterInfoBasicProcedureComparableInfoWrapper(
      GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl, ServerId _serverId) {
    return this._bulrelroClusterInfoBasicProcedureComparableInfoWrapper((ignore) ->
    {
      return ClusterNodeRoleType.READ_REPLICA;
    }, _irrGdbDiscoveryMetaReadReplicaImpl, _serverId);
  }

  @Override
  protected ArrayList<io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper> prcrurwList() {

    ArrayList<io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper>
        _arrayListRrComparableInfoWrapper = new ArrayList();

    Iterator _iterator = this.clusterStructureService.alcesrrMap().entrySet().iterator();

    Entry _entry;

    io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rComparableInfoWrapper;
    while (_iterator.hasNext()) {
      _entry = (Entry) _iterator.next();
      _rComparableInfoWrapper =
          this._burtrfoceClusterInfoBasicProcedureComparableInfoWrapper(
              (GdbDiscoveryMetaCoreImpl) _entry.getValue(), (ServerId) _entry.getKey());
      _arrayListRrComparableInfoWrapper.add(_rComparableInfoWrapper);
    }

    _iterator = this.clusterStructureService.alrarlMap().entrySet().iterator();

    while (_iterator.hasNext()) {
      _entry = (Entry) _iterator.next();
      _rComparableInfoWrapper = this._burtrfordriClusterInfoBasicProcedureComparableInfoWrapper(
          (GdbDiscoveryMetaReadReplicaImpl) _entry.getValue(),
          (ServerId) _entry.getKey());
      _arrayListRrComparableInfoWrapper.add(_rComparableInfoWrapper);
    }

    return _arrayListRrComparableInfoWrapper;
  }
}
