package io.github.onograph.module.edition;

import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ForcedLeaderClusterRoleBasicProcedure;
import io.github.onograph.cluster.raft.module.dprot.dprocs.LocalClusterInfoBasicProcedure;
import io.github.onograph.cluster.raft.module.dprot.dprocs.ShowAvailableProComFamBasicProcedure;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.config.EnterpriseClusterSettings;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.DefaultDbmsReconcilerLifecycleAdapter;
import io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl;
import io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl;
import io.github.onograph.dbms.serverproc.ProcedureManagerService;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.dbms.procedures.StandaloneDatabaseStateProcedure;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.api.procedure.GlobalProcedures;


public class DefaultProcedureManagerServiceImpl extends
    ProcedureManagerService.AbstractDefaultProcedureManagerService {

  public DefaultProcedureManagerServiceImpl(ClusterStructureService clusterStructureService,
      DatabaseManager<?> _databaseManagerMdObject, GlobalModule _globalModule,
      GlobalProcedures _globalProcedures,
      CurrentProtocolStackManager _hpiCurrentProtocolStackManager, ServerIdentity _miServerIdentity,
      DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl, RemoteMetaService remoteMetaService) {
    super(clusterStructureService, _databaseManagerMdObject, _globalModule, _globalProcedures,
        _hpiCurrentProtocolStackManager, _miServerIdentity,
        _mrDefaultDbmsReconcilerLifecycleAdapter, _oqDbmsManagerWatchTagImpl,
        remoteMetaService, () ->
        {
          return Stream.of();
        });
  }


  private void _retsaosecpes() throws KernelException {
    this.globalProcedures.register(
        new LocalClusterInfoBasicProcedure(this.globalModule.getGlobalConfig(),
            this.databaseManagerDaamnObject,
            this.idntmolServerIdentity.serverId()));

    GlobalProcedures _globalProcedures = this.globalProcedures;

    Supplier _supplier = () ->
    {
      return Stream.of();
    };

    CurrentProtocolStackManager _currentProtocolStackManager = this.inlprohdCurrentProtocolStackManager;
    Objects.requireNonNull(_currentProtocolStackManager);
    _globalProcedures.register(new ShowAvailableProComFamBasicProcedure(_supplier,
        _currentProtocolStackManager::inlproStream));
    this.globalProcedures.register(
        new StandaloneDatabaseStateProcedure(
            this.recmeDefaultDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl(),
            this.databaseManagerDaamnObject.databaseIdRepository(),
            this.globalModule.getGlobalConfig().get(BoltConnector.advertised_address)
                .toString()));
    this.globalProcedures.register(
        BasicProcedureWaitingImpl.stnleBasicProcedureWaitingImpl(this.globalModule.getGlobalClock(),
            this.globalModule.getLogService().getInternalLogProvider(),
            new ServerId(new UUID(0L, 1L)),
            new MetaService(this.databaseManagerDaamnObject,
                this.recmeDefaultDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl()),
            this.globalModule.getGlobalConfig()
                .get(BoltConnector.advertised_address)));
  }

  @Override
  public void reie() throws KernelException {
    this.retcmpru();
    if (EnterpriseClusterSettings.isCleeeForCo(this.globalModule.getGlobalConfig())) {
      this.retcusfpor();
      this.globalProcedures.register(
          new BasicProcedureClusterMakeGdbDefaultImpl(this.clusterStructureService,
              this.databaseManagerDaamnObject.databaseIdRepository()));
    } else {
      this._retsaosecpes();
    }

    this.globalProcedures.register(
        new ForcedLeaderClusterRoleBasicProcedure(this.databaseManagerDaamnObject));
  }
}
