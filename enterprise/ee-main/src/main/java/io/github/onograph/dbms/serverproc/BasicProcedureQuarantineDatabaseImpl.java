package io.github.onograph.dbms.serverproc;

import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import java.time.Clock;
import java.time.ZoneId;
import java.util.ArrayList;
import org.neo4j.collection.RawIterator;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.DefaultParameterValue;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.exceptions.Status.Procedure;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.builtin.ProceduresTimeFormatHelper;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;


public class BasicProcedureQuarantineDatabaseImpl extends BasicProcedure {


  private static final String[] CLX_PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER};


  private static final String[] NOM_PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS};


  private static final String PRMTR_GDB_NME = io.github.onograph.TokenConstants.DATABASE_NAME;


  private static final String PRMTR_RES = io.github.onograph.TokenConstants.REASON;


  private static final String PRMTR_STAX = io.github.onograph.TokenConstants.SET_STATUS;


  private static final String PROC_NME = io.github.onograph.TokenConstants.QUARANTINE_DATABASE;


  private final Clock clock;


  private final DatabaseIdRepository databaseIdRepository;


  private final DbmsManagerWatchTagImpl oqDbmsManagerWatchTagImpl;


  private final ZoneId zoneId;


  private BasicProcedureQuarantineDatabaseImpl(Clock _clock,
      DatabaseIdRepository _databaseIdRepository,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, String _strBd, String[] _strNmsaeArray,
      ZoneId _zoneId) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(_strNmsaeArray, io.github.onograph.TokenConstants.QUARANTINE_DATABASE))
        .in(io.github.onograph.TokenConstants.DATABASE_NAME, Neo4jTypes.NTString)
        .in(io.github.onograph.TokenConstants.SET_STATUS, Neo4jTypes.NTBoolean)
        .in(io.github.onograph.TokenConstants.REASON, Neo4jTypes.NTString,
            new DefaultParameterValue(
                io.github.onograph.I18N.format(
                    "io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.zoneId"),
                Neo4jTypes.NTString))
        .out(io.github.onograph.TokenConstants.DATABASE_NAME, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.QUARANTINED, Neo4jTypes.NTBoolean)
        .out(io.github.onograph.TokenConstants.RESULT, Neo4jTypes.NTString)
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.description"))
        .systemProcedure()
        .deprecatedBy(_strBd)
        .admin(true).mode(Mode.DBMS).build());
    this.oqDbmsManagerWatchTagImpl = _oqDbmsManagerWatchTagImpl;
    this.databaseIdRepository = _databaseIdRepository;
    this.clock = _clock;
    this.zoneId = _zoneId;
  }


  private static <T extends Value> T _excpar(Class<T> _classCazT, int idx,
      AnyValue[] _iptAnyValueArray, String _strNp) {
    if (_iptAnyValueArray.length <= idx) {

      throw new IllegalArgumentException("*** Error: fe8ab484-a650-4ba7-a59f-194832c36aaa");
    } else {

      AnyValue _nrAnyValue = _iptAnyValueArray[idx];
      if (!_classCazT.isInstance(_nrAnyValue)) {

        throw new IllegalArgumentException("*** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
      } else {
        return _classCazT.cast(_nrAnyValue);
      }
    }
  }


  public static BasicProcedureQuarantineDatabaseImpl clsrBasicProcedureQuarantineDatabaseImpl(
      Clock _clock, DatabaseIdRepository _databaseIdRepository,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, ZoneId _zoneId) {
    return new BasicProcedureQuarantineDatabaseImpl(_clock, _databaseIdRepository,
        _oqDbmsManagerWatchTagImpl,
        io.github.onograph.TokenConstants.DBMS__QUARANTINE_DATABASE, CLX_PROC_NS, _zoneId);
  }


  public static BasicProcedureQuarantineDatabaseImpl stnleBasicProcedureQuarantineDatabaseImpl(
      Clock _clock, DatabaseIdRepository _databaseIdRepository,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, ZoneId _zoneId) {
    return new BasicProcedureQuarantineDatabaseImpl(_clock, _databaseIdRepository,
        _oqDbmsManagerWatchTagImpl, null, NOM_PROC_NS, _zoneId);
  }


  private NamedDatabaseId _daasidNamedDatabaseId(String gdbName) {
    return this.databaseIdRepository.getByName(gdbName).orElseThrow(() ->
    {
      return new IllegalArgumentException(
          "*** Error: 21ea760d-6bd7-4782-a862-02eeee68bd05");
    });
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {

    String gdbName = _excpar(TextValue.class, 0, _iptAnyValueArray,
        io.github.onograph.TokenConstants.DATABASE_NAME).stringValue();

    boolean _isSs = _excpar(BooleanValue.class, 1, _iptAnyValueArray,
        io.github.onograph.TokenConstants.SET_STATUS).booleanValue();
    if (!_cContext.procedureCallContext().isSystemDatabase()) {

      throw new ProcedureException(Procedure.ProcedureCallFailed,
          "*** Error:  f4355b76-b6d1-425e-aced-81ace85858da");
    } else {
      try {

        NamedDatabaseId _namedDatabaseId = this._daasidNamedDatabaseId(gdbName);

        String _strRsl;
        if (_isSs) {

          String _strRao = _excpar(TextValue.class, 2, _iptAnyValueArray,
              io.github.onograph.TokenConstants.REASON).stringValue();

          String _strU = _cContext.securityContext().subject().username();

          String _strT = ProceduresTimeFormatHelper.formatTime(this.clock.instant(), this.zoneId);

          String m = String.format(
              io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.format"),
              _strU, _strT, _strRao);
          _strRsl = this.oqDbmsManagerWatchTagImpl.puitqrnString(m, _namedDatabaseId);
        } else {
          _strRsl = this.oqDbmsManagerWatchTagImpl.reefqnString(_namedDatabaseId);
        }

        ArrayList<AnyValue[]> _rrList = new ArrayList();
        _rrList.add(new AnyValue[]{Values.stringValue(gdbName), Values.booleanValue(_isSs),
            Values.stringValue(_strRsl)});
        return RawIterator.wrap(_rrList.iterator());
      } catch (

          Exception _exception) {

        throw new ProcedureException(Procedure.ProcedureCallFailed, _exception,
            "*** Error:  8775bbe3-bb3c-4a66-ad39-2c1a95d8a47d");
      }
    }
  }
}
