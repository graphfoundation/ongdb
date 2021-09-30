package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.neo4j.collection.RawIterator;
import org.neo4j.dbms.OperatorState;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.procedures.DatabaseStateProcedure;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.values.AnyValue;


public class DatabaseStateProcedureClusterImpl extends DatabaseStateProcedure {


  private final ClusterStructureService clusterStructureService;


  public DatabaseStateProcedureClusterImpl(ClusterStructureService clusterStructureService,
      DatabaseIdRepository _databaseIdRepository) {
    super(_databaseIdRepository);
    this.clusterStructureService = clusterStructureService;
  }


  private AnyValue[] _retrfayAnyValue(NamedDatabaseId _namedDatabaseId, ServerId _serverId,
      GdbDiscoveryMeta _siGdbDiscoveryMeta) {

    ClusterNodeRoleType r = this.clusterStructureService.lokreClusterNodeRoleType(_namedDatabaseId,
        _serverId);

    String _strSr = r.name().toLowerCase();

    String _strAdes = _siGdbDiscoveryMeta.botadsSocketAddress().toString();

    OperatorState stat = this.clusterStructureService.lopdbstDiscoveryGdbOperatorMetaWrapper(
        _namedDatabaseId, _serverId).getOperatorState();

    Optional<String> _optionalErrString =
        this.clusterStructureService.lopdbstDiscoveryGdbOperatorMetaWrapper(_namedDatabaseId,
            _serverId).faleOptional().map(Throwable::getMessage);
    return this.resultRowFactory(stat, _optionalErrString, _strSr, _strAdes);
  }


  private Stream<AnyValue[]> _retrfeigmeStream(Map<ServerId, ? extends GdbDiscoveryMeta> _mapSisg,
      NamedDatabaseId _namedDatabaseId, ServerId _serverId) {
    return Stream.ofNullable((GdbDiscoveryMeta) _mapSisg.get(_serverId)).map((discoveryInfo) ->
    {
      return this._retrfayAnyValue(_namedDatabaseId, _serverId,
          discoveryInfo);
    });
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {

    NamedDatabaseId _namedDatabaseId = this.extractDatabaseId(_iptAnyValueArray);

    Map<ServerId, GdbDiscoveryMetaCoreImpl> _mapIscsg = this.clusterStructureService.alcesrrMap();

    Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> _mapIsrsg = this.clusterStructureService.alrarlMap();

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapScsd = this.clusterStructureService.alcrstfrdbMap(
        _namedDatabaseId);

    Stream<AnyValue[]> _crRecStream = _mapScsd.keySet().stream().flatMap((member) ->
    {
      return this._retrfeigmeStream(_mapIscsg, _namedDatabaseId,
          member);
    });

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapRssd = this.clusterStructureService.alrarlstfdteMap(
        _namedDatabaseId);

    Stream<AnyValue[]> _slpResStream = _mapRssd.keySet().stream().flatMap((member) ->
    {
      return this._retrfeigmeStream(_mapIsrsg, _namedDatabaseId, member);
    });
    return RawIterator.wrap(Stream.concat(_crRecStream, _slpResStream).iterator());
  }
}
