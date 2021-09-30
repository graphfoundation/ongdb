package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.dprocs.DistributedClusterInfoBasicProcedure;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ShowAvailableProComFamBasicProcedure;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.DefaultDbmsReconcilerLifecycleAdapter;
import io.github.onograph.procedure.builtin.DbmsProcedures;
import io.github.onograph.procedure.builtin.Procedures;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.api.procedure.GlobalProcedures;


public interface ProcedureManagerService {


  void reie() throws KernelException;


  abstract class AbstractDefaultProcedureManagerService implements ProcedureManagerService {


    protected final ClusterStructureService clusterStructureService;


    protected final DatabaseManager<?> databaseManagerDaamnObject;


    protected final GlobalModule globalModule;


    protected final GlobalProcedures globalProcedures;


    protected final ServerIdentity idntmolServerIdentity;


    protected final CurrentProtocolStackManager inlprohdCurrentProtocolStackManager;


    protected final DbmsManagerWatchTagImpl qunotDbmsManagerWatchTagImpl;


    protected final DefaultDbmsReconcilerLifecycleAdapter recmeDefaultDbmsReconcilerLifecycleAdapter;


    protected final RemoteMetaService remoteMetaService;


    protected final Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> supplierCltiapcStream;


    protected AbstractDefaultProcedureManagerService(
        ClusterStructureService clusterStructureService,
        DatabaseManager<?> _databaseManagerMdObject, GlobalModule _globalModule,
        GlobalProcedures _globalProcedures,
        CurrentProtocolStackManager _iphCurrentProtocolStackManager,
        ServerIdentity _miServerIdentity,
        DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter,
        DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, RemoteMetaService remoteMetaService,
        Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierPicStream) {
      this.clusterStructureService = clusterStructureService;
      this.databaseManagerDaamnObject = _databaseManagerMdObject;
      this.globalModule = _globalModule;
      this.globalProcedures = _globalProcedures;
      this.idntmolServerIdentity = _miServerIdentity;
      this.inlprohdCurrentProtocolStackManager = _iphCurrentProtocolStackManager;
      this.qunotDbmsManagerWatchTagImpl = _oqDbmsManagerWatchTagImpl;
      this.recmeDefaultDbmsReconcilerLifecycleAdapter = _mrDefaultDbmsReconcilerLifecycleAdapter;
      this.remoteMetaService = remoteMetaService;
      this.supplierCltiapcStream = _supplierPicStream;
    }


    protected void retcmpru() throws KernelException {
      this.globalProcedures.registerProcedure(DbmsProcedures.class, true);
      this.globalProcedures.registerProcedure(Procedures.class, true);
      this.globalProcedures.register(
          BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
              this.globalModule.getGlobalClock(),
              this.databaseManagerDaamnObject.databaseIdRepository(),
              this.qunotDbmsManagerWatchTagImpl,
              this.globalModule.getGlobalConfig()
                  .get(GraphDatabaseSettings.db_timezone)
                  .getZoneId()));
    }


    protected void retcusfpor() throws KernelException {
      this.globalProcedures.register(
          new DistributedClusterInfoBasicProcedure(this.clusterStructureService,
              this.databaseManagerDaamnObject.databaseIdRepository()));

      GlobalProcedures _globalProcedures = this.globalProcedures;

      Supplier _supplier = this.supplierCltiapcStream;

      CurrentProtocolStackManager _currentProtocolStackManager = this.inlprohdCurrentProtocolStackManager;
      Objects.requireNonNull(_currentProtocolStackManager);
      _globalProcedures.register(new ShowAvailableProComFamBasicProcedure(_supplier,
          _currentProtocolStackManager::inlproStream));
      this.globalProcedures.register(
          new DatabaseStateProcedureClusterImpl(this.clusterStructureService,
              this.databaseManagerDaamnObject.databaseIdRepository()));
      this.globalProcedures.register(
          BasicProcedureWaitingImpl.clsrBasicProcedureWaitingImpl(
              this.globalModule.getGlobalClock(), this.clusterStructureService,
              this.globalModule.getLogService().getInternalLogProvider(),
              new MetaService(this.databaseManagerDaamnObject,
                  this.recmeDefaultDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl()),
              this.remoteMetaService,
              this.idntmolServerIdentity));
      this.globalProcedures.registerComponent(DatabaseManager.class, (ignored) ->
      {
        return this.databaseManagerDaamnObject;
      }, false);
    }
  }
}
