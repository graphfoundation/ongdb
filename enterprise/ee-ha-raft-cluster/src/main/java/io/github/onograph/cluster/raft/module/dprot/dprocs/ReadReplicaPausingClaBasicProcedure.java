package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager;
import java.util.List;
import org.neo4j.collection.RawIterator;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.exceptions.Status.Database;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;


public class ReadReplicaPausingClaBasicProcedure extends BasicProcedure {


  private static final String GDB_PRMTR = io.github.onograph.TokenConstants.DATABASE_NAME;


  private static final String PROC_NME = io.github.onograph.TokenConstants.READ_REPLICA_TOGGLE;


  private static final List<String> PROC_NS = List.of(io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER);


  private static final String PSX_PRMTR = io.github.onograph.TokenConstants.PAUSE;


  private final DatabaseManager<?> databaseManagerMdObject;

  public ReadReplicaPausingClaBasicProcedure(DatabaseManager<?> _databaseManagerMdObject) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.READ_REPLICA_TOGGLE))
        .in(io.github.onograph.TokenConstants.DATABASE_NAME, Neo4jTypes.NTString)
        .in(io.github.onograph.TokenConstants.PAUSE, Neo4jTypes.NTBoolean)
        .out(io.github.onograph.TokenConstants.STATE, Neo4jTypes.NTString)
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.description"))
        .systemProcedure().admin(true).build());
    this.databaseManagerMdObject = _databaseManagerMdObject;
  }


  private void _chpeinForAn(int _iIp, AnyValue[] _iptAnyValueArray) {
    if (_iptAnyValueArray.length == 0) {

      throw new IllegalArgumentException("*** Error: 2aba9a5e-cd23-44b5-96c3-59fe6b4f4c67");
    } else if (_iIp < 0 || _iIp >= _iptAnyValueArray.length) {

      throw new IllegalArgumentException("*** Error: 5676f8ed-9a98-4cff-89b6-b0e93e181ed9");
    }
  }


  private void _chpetyForAnStClSt(Class<? extends AnyValue> _classCpAnyValue, int _iIp,
      AnyValue[] _iptAnyValueArray, String _strEt, String _strNp) {

    AnyValue val = _iptAnyValueArray[_iIp];
    if (!_classCpAnyValue.isInstance(val)) {

      throw new IllegalArgumentException("*** Error: a5827979-4277-409c-a498-08ab43d81980");
    }
  }


  private String _extornString(ReadReplicateCatchupManager _cppReadReplicateCatchupManager,
      boolean _isPue) {
    if (_isPue) {
      try {
        return _cppReadReplicateCatchupManager.isPas() ? io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.extornString2")
            : io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.extornString");
      } catch (

          IllegalStateException _illegalStateException) {
        return io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.extornString3");
      }
    } else {
      return _cppReadReplicateCatchupManager.isReu() ? io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.extornString5")
          : io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure.extornString4");
    }
  }


  private boolean _isExcpsfaForAnSt(int _iIp, AnyValue[] _iptAnyValueArray, String _strNp) {
    this._chpeinForAn(_iIp, _iptAnyValueArray);
    this._chpetyForAnStClSt(BooleanValue.class, _iIp, _iptAnyValueArray,
        io.github.onograph.TokenConstants.BOOLEAN, _strNp);
    return ((BooleanValue) _iptAnyValueArray[_iIp]).booleanValue();
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {

    boolean _isPue = this._isExcpsfaForAnSt(1, _iptAnyValueArray,
        io.github.onograph.TokenConstants.PAUSE);

    NamedDatabaseId _namedDatabaseId = this.excdaiNamedDatabaseId(0, _iptAnyValueArray,
        io.github.onograph.TokenConstants.DATABASE_NAME);

    DatabaseContext _cdDatabaseContext = this.databaseManagerMdObject.getDatabaseContext(
        _namedDatabaseId).orElseThrow(() ->
    {
      return new ProcedureException(
          Database.DatabaseNotFound,
          "*** Error: eef0a2f7-53be-4b89-b351-ef13bef87fb9");
    });

    ReadReplicateCatchupManager _ppcReadReplicateCatchupManager = _cdDatabaseContext.dependencies()
        .resolveDependency(ReadReplicateCatchupManager.class);

    String _strOtu = this._extornString(_ppcReadReplicateCatchupManager, _isPue);
    return RawIterator.of(new AnyValue[][]{{Values.utf8Value(_strOtu)}});
  }


  protected NamedDatabaseId excdaiNamedDatabaseId(int _iIp, AnyValue[] _iptAnyValueArray,
      String _strNp) throws ProcedureException {
    this._chpeinForAn(_iIp, _iptAnyValueArray);
    this._chpetyForAnStClSt(TextValue.class, _iIp, _iptAnyValueArray,
        io.github.onograph.TokenConstants.STRING, _strNp);

    TextValue _nrTextValue = (TextValue) _iptAnyValueArray[_iIp];
    return this.databaseManagerMdObject.databaseIdRepository().getByName(_nrTextValue.stringValue())
        .orElseThrow(() ->
        {
          return new ProcedureException(
              Database.DatabaseNotFound,
              "*** Error: 9c22856c-4bfe-4623-bb10-d7215ad84343");
        });
  }
}
