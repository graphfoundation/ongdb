package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterRoleBasicProcedureReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ReadReplicaPausingClaBasicProcedure;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.DefaultDbmsReconcilerLifecycleAdapter;
import io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl;
import io.github.onograph.dbms.serverproc.ProcedureManagerService;
import java.util.stream.Stream;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.api.procedure.GlobalProcedures;


public class ReadReplicaProcedureManagerService extends
    ProcedureManagerService.AbstractDefaultProcedureManagerService {

  public ReadReplicaProcedureManagerService(ClusterStructureService clusterStructureService,
      DatabaseManager<?> _databaseManagerMdObject, GlobalModule _globalModule,
      GlobalProcedures _globalProcedures, ServerIdentity _imServerIdentity,
      CurrentProtocolStackManager _iphCurrentProtocolStackManager,
      DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, RemoteMetaService remoteMetaService) {
    super(clusterStructureService, _databaseManagerMdObject, _globalModule, _globalProcedures,
        _iphCurrentProtocolStackManager, _imServerIdentity,
        _mrDefaultDbmsReconcilerLifecycleAdapter, _oqDbmsManagerWatchTagImpl,
        remoteMetaService, () ->
        {
          return Stream.of();
        });
  }

  @Override
  public void reie() throws KernelException {
    this.retcmpru();
    this.retcusfpor();
    this.globalProcedures.register(
        BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
            this.globalModule.getGlobalClock(),
            this.databaseManagerDaamnObject.databaseIdRepository(),
            this.qunotDbmsManagerWatchTagImpl,
            this.globalModule.getGlobalConfig()
                .get(GraphDatabaseSettings.db_timezone)
                .getZoneId()));
    this.globalProcedures.register(
        new ClusterRoleBasicProcedureReadReplicaImpl(this.databaseManagerDaamnObject));
    this.globalProcedures.register(
        new ReadReplicaPausingClaBasicProcedure(this.databaseManagerDaamnObject));
  }
}
