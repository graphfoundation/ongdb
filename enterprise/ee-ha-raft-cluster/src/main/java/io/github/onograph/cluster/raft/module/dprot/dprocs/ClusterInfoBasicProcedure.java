package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import org.neo4j.collection.RawIterator;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.ListValueBuilder;
import org.neo4j.values.virtual.MapValueBuilder;


public abstract class ClusterInfoBasicProcedure extends BasicProcedure {


  public static final String PROC_NME = io.github.onograph.TokenConstants.OVERVIEW;


  private static final String[] PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER};

  public ClusterInfoBasicProcedure() {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.OVERVIEW))
        .out(io.github.onograph.TokenConstants.ID, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.ADDRESSES, Neo4jTypes.NTList(Neo4jTypes.NTString))
        .out(io.github.onograph.TokenConstants.DATABASES, Neo4jTypes.NTMap)
        .out(io.github.onograph.TokenConstants.GROUPS, Neo4jTypes.NTList(Neo4jTypes.NTString))
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.description"))
        .systemProcedure()
        .build());
  }


  private static AnyValue _fomguAnyValue(
      io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rComparableInfoWrapper) {
    return _rComparableInfoWrapper.setGruNodeGroupIdentifier.stream().sorted()
        .map(NodeGroupIdentifier::getVal).map(Values::utf8Value)
        .collect(ListValueBuilder.collector());
  }


  private static AnyValue _fotaeAnyValue(
      io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rComparableInfoWrapper) {
    return _rComparableInfoWrapper.discoverySocketAddresses.pulultList().stream()
        .map(Values::utf8Value).collect(ListValueBuilder.collector());
  }


  private static AnyValue _fotdbAnyValue(
      io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rComparableInfoWrapper) {

    MapValueBuilder _mapValueBuilder = new MapValueBuilder();

    Iterator _iterator = _rComparableInfoWrapper.mapDaasnc.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<NamedDatabaseId, ClusterNodeRoleType> _entryEtync = (Entry) _iterator.next();

      NamedDatabaseId _namedDatabaseId = _entryEtync.getKey();

      String _strSr = _entryEtync.getValue().toString();
      _mapValueBuilder.add(_namedDatabaseId.name(), Values.utf8Value(_strSr));
    }

    return _mapValueBuilder.build();
  }


  private static AnyValue[] _fotrlrAnyValue(
      io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rComparableInfoWrapper) {
    return new AnyValue[]{Values.utf8Value(_rComparableInfoWrapper.mebiUUID.toString()),
        _fotaeAnyValue(_rComparableInfoWrapper),
        _fotdbAnyValue(_rComparableInfoWrapper), _fomguAnyValue(_rComparableInfoWrapper)};
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker) {

    Stream<AnyValue[]> _avStream = this.prcrurwList().stream().sorted()
        .map(ClusterInfoBasicProcedure::_fotrlrAnyValue);
    return Iterators.asRawIterator(_avStream);
  }


  protected abstract List<io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper> prcrurwList();


  static class ComparableInfoWrapper
      implements
      Comparable<io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper> {

    final DiscoverySocketAddresses discoverySocketAddresses;

    final Map<NamedDatabaseId, ClusterNodeRoleType> mapDaasnc;

    final UUID mebiUUID;

    final Set<NodeGroupIdentifier> setGruNodeGroupIdentifier;


    ComparableInfoWrapper(DiscoverySocketAddresses _discoverySocketAddresses, UUID _imUUID,
        Map<NamedDatabaseId, ClusterNodeRoleType> _mapDtbssnc,
        Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier) {
      this.discoverySocketAddresses = _discoverySocketAddresses;
      this.mapDaasnc = _mapDtbssnc;
      this.mebiUUID = _imUUID;
      this.setGruNodeGroupIdentifier = _setGopNodeGroupIdentifier;
    }

    @Override
    public int compareTo(
        io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _ohrComparableInfoWrapper) {
      return this.mebiUUID.compareTo(_ohrComparableInfoWrapper.mebiUUID);
    }
  }
}
