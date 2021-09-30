package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
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
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;


abstract class AbstractClusterRoleBasicProcedure extends BasicProcedure {


  private static final String OP_NME = io.github.onograph.TokenConstants.ROLE;


  private static final String PRMTR_NME = io.github.onograph.TokenConstants.DATABASE;


  private static final String PROC_NME = io.github.onograph.TokenConstants.ROLE;


  private static final String[] PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      io.github.onograph.TokenConstants.CLUSTER};


  protected final DatabaseManager<?> databaseManagerDaamnObject;

  AbstractClusterRoleBasicProcedure(DatabaseManager<?> _databaseManagerMdObject) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.ROLE))
        .in(io.github.onograph.TokenConstants.DATABASE, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.ROLE, Neo4jTypes.NTString)
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.dprocs.AbstractClusterRoleBasicProcedure.description"))
        .systemProcedure().build());
    this.databaseManagerDaamnObject = _databaseManagerMdObject;
  }


  private static ProcedureException _daantfdepProcedureException(String gdbName) {
    return new ProcedureException(Database.DatabaseNotFound,
        "*** Error: 1dfe52b2-a364-4712-b572-d9b164b982ef");
  }


  private void _chcavllForDa(DatabaseContext _databaseContext) throws ProcedureException {
    if (!_databaseContext.database().getDatabaseAvailabilityGuard().isAvailable()) {

      throw new ProcedureException(Database.DatabaseUnavailable,
          "*** Error: d42fe2e0-c767-4f9e-96b0-6a416fd59d5e");
    }
  }


  private DatabaseContext _excdacxDatabaseContext(AnyValue[] _iptAnyValueArray)
      throws ProcedureException {
    if (_iptAnyValueArray.length != 1) {

      throw new IllegalArgumentException("*** Error: 482253b1-1500-4e86-8a6f-ba6f829c683b");
    } else {

      AnyValue val = _iptAnyValueArray[0];
      if (val instanceof TextValue) {

        String gdbName = ((TextValue) val).stringValue();
        return this.databaseManagerDaamnObject.getDatabaseContext(gdbName).orElseThrow(() ->
        {
          return _daantfdepProcedureException(
              gdbName);
        });
      } else {

        throw new IllegalArgumentException("*** Error: e4893fdd-49ac-47ee-b0ae-25641653bf3b");
      }
    }
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {

    DatabaseContext _databaseContext = this._excdacxDatabaseContext(_iptAnyValueArray);
    this._chcavllForDa(_databaseContext);

    ClusterNodeRoleType r = this.rolClusterNodeRoleType(_databaseContext);
    return RawIterator.of(new AnyValue[][]{{Values.utf8Value(r.toString())}});
  }


  abstract ClusterNodeRoleType rolClusterNodeRoleType(DatabaseContext _databaseContext)
      throws ProcedureException;
}
