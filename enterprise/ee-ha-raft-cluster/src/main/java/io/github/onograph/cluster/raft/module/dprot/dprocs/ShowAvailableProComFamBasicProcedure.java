package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.control.ComProFamily;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.collection.RawIterator;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;


public class ShowAvailableProComFamBasicProcedure extends BasicProcedure {


  public static final String PROC_NME = io.github.onograph.TokenConstants.PROTOCOLS;


  private static final String[] PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER};


  private final Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> supplierPicStream;


  private final Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> supplierPisStream;

  public ShowAvailableProComFamBasicProcedure(
      Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierPicStream,
      Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierSipStream) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.PROTOCOLS))
        .out(io.github.onograph.TokenConstants.ORIENTATION, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.REMOTE_ADDRESS, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.APPLICATION_PROTOCOL, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.APPLICATION_PROTOCOL_VERSION, Neo4jTypes.NTInteger)
        .out(io.github.onograph.TokenConstants.MODIFIER_PROTOCOLS, Neo4jTypes.NTString)
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.ShowAvailableProComFamBasicProcedure.description"))
        .systemProcedure().build());
    this.supplierPicStream = _supplierPicStream;
    this.supplierPisStream = _supplierSipStream;
  }


  private <T extends SocketAddress> AnyValue[] _bulroAnyValue(
      Pair<T, ComProFamilyWrapper> _pairCitc, String _strOinai) {

    T _tAs = _pairCitc.first();

    ComProFamilyWrapper _spComProFamilyWrapper = _pairCitc.other();
    return new AnyValue[]{Values.utf8Value(_strOinai), Values.utf8Value(_tAs.toString()),
        Values.utf8Value(_spComProFamilyWrapper.getPaApplicationComProFamily().caerString()),
        Values.utf8Value(
            _spComProFamilyWrapper.getPaApplicationComProFamily().getImpl().toString()),
        Values.utf8Value(this._moiestnString(_spComProFamilyWrapper))};
  }


  private String _moiestnString(ComProFamilyWrapper _spComProFamilyWrapper) {
    return _spComProFamilyWrapper.getListPmMutableComProFamily().stream().map(ComProFamily::getImpl)
        .collect(Collectors.joining(",", "[", "]"));
  }


  private <T extends SocketAddress> Stream<AnyValue[]> _toouuroStream(String _strOinai,
      Supplier<Stream<Pair<T, ComProFamilyWrapper>>> _supplierPiStream) {

    Comparator<Pair<T, ComProFamilyWrapper>> _comparatorCicPair =
        Comparator.comparing((Pair<T, ComProFamilyWrapper> _pairEtytc) ->
        {
          return (_pairEtytc.first()).getHostname();
        }).thenComparing((entry) ->
        {
          return (entry.first()).getPort();
        });
    return (_supplierPiStream.get()).sorted(_comparatorCicPair).map((entry) ->
    {
      return this._bulroAnyValue(entry, _strOinai);
    });
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker) {

    Stream<AnyValue[]> _outStream = this._toouuroStream(io.github.onograph.TokenConstants.OUTBOUND,
        this.supplierPicStream);

    Stream<AnyValue[]> _inStream = this._toouuroStream(io.github.onograph.TokenConstants.INBOUND,
        this.supplierPisStream);
    return Iterators.asRawIterator(Stream.concat(_outStream, _inStream));
  }
}
