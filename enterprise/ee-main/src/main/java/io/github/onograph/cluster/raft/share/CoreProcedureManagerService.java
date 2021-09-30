package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterRoleBasicProcedureCoreImpl;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.DefaultDbmsReconcilerLifecycleAdapter;
import io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl;
import io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl;
import io.github.onograph.dbms.serverproc.ProcedureManagerService;
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


public class CoreProcedureManagerService extends
    ProcedureManagerService.AbstractDefaultProcedureManagerService {

  public CoreProcedureManagerService(ClusterStructureService clusterStructureService,
      DatabaseManager<?> _databaseManagerMdObject, GlobalModule _globalModule,
      GlobalProcedures _globalProcedures,
      CurrentProtocolStackManager _hpiCurrentProtocolStackManager, ServerIdentity _miServerIdentity,
      DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, RemoteMetaService remoteMetaService,
      Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierPicStream) {
    super(clusterStructureService, _databaseManagerMdObject, _globalModule, _globalProcedures,
        _hpiCurrentProtocolStackManager, _miServerIdentity,
        _mrDefaultDbmsReconcilerLifecycleAdapter, _oqDbmsManagerWatchTagImpl,
        remoteMetaService, _supplierPicStream);
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
        new ClusterRoleBasicProcedureCoreImpl(this.databaseManagerDaamnObject));
    this.globalProcedures.registerProcedure(DataSyncRunnerStatsManager.class);
    this.globalProcedures.register(
        new BasicProcedureClusterMakeGdbDefaultImpl(this.clusterStructureService,
            this.databaseManagerDaamnObject.databaseIdRepository()));
  }
}
