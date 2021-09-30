package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import java.util.Iterator;
import java.util.Map;
import org.neo4j.collection.RawIterator;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.KernelTransaction.Revertable;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.exceptions.Status.Database;
import org.neo4j.kernel.api.exceptions.Status.Procedure;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.procedure.Mode;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;


public class BasicProcedureClusterMakeGdbDefaultImpl extends BasicProcedure {


  private static final String PRMTR_NME = io.github.onograph.TokenConstants.DATABASE_NAME;


  private static final String PROC_NME = io.github.onograph.TokenConstants.SET_DEFAULT_DATABASE;


  private static final String[] PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER};


  private final ClusterStructureService clusterStructureService;


  private final DatabaseIdRepository databaseIdRepository;


  public BasicProcedureClusterMakeGdbDefaultImpl(ClusterStructureService clusterStructureService,
      DatabaseIdRepository _databaseIdRepository) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.SET_DEFAULT_DATABASE))
        .in(io.github.onograph.TokenConstants.DATABASE_NAME, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.RESULT, Neo4jTypes.NTString).description(
            io.github.onograph.I18N.format(
                "io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl.description"))
        .systemProcedure().admin(true).mode(Mode.WRITE).build());
    this.databaseIdRepository = _databaseIdRepository;
    this.clusterStructureService = clusterStructureService;
  }


  protected static NormalizedDatabaseName excdanNormalizedDatabaseName(
      AnyValue[] _iptAnyValueArray) {
    if (_iptAnyValueArray.length != 1) {

      throw new IllegalArgumentException("*** Error: 456b9c0d-a8e4-486a-a3c9-95b2f801b395");
    } else {

      AnyValue _nrAnyValue = _iptAnyValueArray[0];
      if (!(_nrAnyValue instanceof TextValue)) {

        throw new IllegalArgumentException("*** Error: 69ddad77-5606-485f-a73c-ef87a9f5393f");
      } else {
        return new NormalizedDatabaseName(((TextValue) _nrAnyValue).stringValue());
      }
    }
  }


  private void _astodetspForNo(NormalizedDatabaseName _doNormalizedDatabaseName)
      throws ProcedureException {

    NamedDatabaseId _namedDatabaseId = this.databaseIdRepository.getByName(
        _doNormalizedDatabaseName).orElseThrow(() ->
    {
      return new ProcedureException(
          Database.DatabaseNotFound,
          "*** Error: 7c68df5d-b138-4e66-9875-80036f135548");
    });

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapScsd = this.clusterStructureService.alcrstfrdbMap(
        _namedDatabaseId);

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSrsd = this.clusterStructureService.alrarlstfdteMap(
        _namedDatabaseId);

    boolean _isSd = true;

    Iterator _iterator;

    DiscoveryGdbOperatorMetaWrapper _saeDiscoveryGdbOperatorMetaWrapper;
    for (_iterator = _mapScsd.values().iterator(); _iterator.hasNext();
        _isSd &= _saeDiscoveryGdbOperatorMetaWrapper.getOperatorState()
            .equals(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)) {
      _saeDiscoveryGdbOperatorMetaWrapper = (DiscoveryGdbOperatorMetaWrapper) _iterator.next();
    }

    for (_iterator = _mapSrsd.values().iterator(); _iterator.hasNext();
        _isSd &= _saeDiscoveryGdbOperatorMetaWrapper.getOperatorState()
            .equals(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)) {
      _saeDiscoveryGdbOperatorMetaWrapper = (DiscoveryGdbOperatorMetaWrapper) _iterator.next();
    }

    if (!_isSd) {

      throw new ProcedureException(Procedure.ProcedureCallFailed,
          "*** Error: 9d845ac1-90f5-4af1-9aef-c10314064c84");
    }
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {
    if (!_cContext.procedureCallContext().isSystemDatabase()) {

      throw new ProcedureException(Procedure.ProcedureCallFailed,
          "*** Error:  98c0dcc2-8ef2-4e00-bc4e-f55e4ff29217");
    } else {

      NormalizedDatabaseName _nddnNormalizedDatabaseName = excdanNormalizedDatabaseName(
          _iptAnyValueArray);

      InternalTransaction _internalTransaction = _cContext.internalTransaction();

      Revertable _inrRevertable = _internalTransaction.overrideWith(
          SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL);

      RawIterator _rawIterator;
      label55:
      {
        try {
          label60:
          {

            Node _oddNode = _internalTransaction.findNode(
                Label.label(io.github.onograph.TokenConstants.DATABASE2),
                io.github.onograph.TokenConstants.DEFAULT, true);

            Node _ddnNode = _internalTransaction.findNode(
                Label.label(io.github.onograph.TokenConstants.DATABASE2),
                io.github.onograph.TokenConstants.NAME, _nddnNormalizedDatabaseName.name());
            if (_ddnNode == null) {

              throw new ProcedureException(Procedure.ProcedureCallFailed,
                  "*** Error:  a8cf03b5-907e-43e8-933b-7bf8a1dbed92",
                  _nddnNormalizedDatabaseName.name());
            }

            if (_oddNode != null) {
              if (_oddNode.getId() == _ddnNode.getId()) {
                _rawIterator = RawIterator.of(new AnyValue[][]{{Values.stringValue(
                    String.format(io.github.onograph.I18N.format(
                            "io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl.format"),
                        _nddnNormalizedDatabaseName.name()))}});
                break label60;
              }

              NormalizedDatabaseName _nddoNormalizedDatabaseName =
                  new NormalizedDatabaseName(
                      (String) _oddNode.getProperty(io.github.onograph.TokenConstants.NAME));
              this._astodetspForNo(_nddoNormalizedDatabaseName);
              _oddNode.setProperty(io.github.onograph.TokenConstants.DEFAULT, false);
            }

            _ddnNode.setProperty(io.github.onograph.TokenConstants.DEFAULT, true);
            _rawIterator = RawIterator
                .of(new AnyValue[][]{
                    {Values.stringValue(String.format(io.github.onograph.I18N.format(
                            "io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl.format2"),
                        _nddnNormalizedDatabaseName.name()))}});
            break label55;
          }
        } catch (

            Throwable _throwable) {
          if (_inrRevertable != null) {
            try {
              _inrRevertable.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_inrRevertable != null) {
          _inrRevertable.close();
        }

        return _rawIterator;
      }

      if (_inrRevertable != null) {
        _inrRevertable.close();
      }

      return _rawIterator;
    }
  }
}
