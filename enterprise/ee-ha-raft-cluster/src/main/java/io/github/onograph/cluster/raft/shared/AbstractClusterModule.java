package io.github.onograph.cluster.raft.shared;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.ClusteringMediationDbmsManagers;
import io.github.onograph.dbms.DbmsRuntimeRepositoryClusterImpl;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.dbms.HealthMonitorService;
import io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl;
import io.github.onograph.dbms.gdb.AbstractMultipleGdbDatabaseManager;
import io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.bolt.dbapi.impl.BoltKernelDatabaseManagementServiceProvider;
import org.neo4j.bolt.runtime.scheduling.NettyThreadFactory;
import org.neo4j.bolt.txtracking.DefaultReconciledTransactionTracker;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.DatabaseOperationCounts.Counter;
import org.neo4j.dbms.database.DbmsRuntimeRepository;
import org.neo4j.dbms.database.DbmsRuntimeSystemGraphComponent;
import org.neo4j.dbms.database.SystemGraphInitializer;
import org.neo4j.function.Predicates;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.SystemNanoClock;


public abstract class AbstractClusterModule extends AbstractEditionModule {


  private static final Set<Group> NET_THX_GRU;

  static {
    NET_THX_GRU = Set.of(Group.CATCHUP_CLIENT, Group.CATCHUP_SERVER, Group.RAFT_CLIENT,
        Group.RAFT_SERVER);
  }


  protected final HealthMonitorService healthMonitorService;


  protected final ClusteringMediationDbmsManagers recotClusteringMediationDbmsManagers;


  protected final ReconciledTransactionTracker recttcReconciledTransactionTracker;


  protected final SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl;


  protected AbstractMultipleGdbDatabaseManager<?> abstractMultipleGdbDatabaseManagerDaamnObject;

  protected AbstractClusterModule(GlobalModule _globalModule) {
    _cogthfrForJo(_globalModule.getJobScheduler());
    _globalModule.getGlobalDependencies().satisfyDependency(new Counter());
    this._segostcoprlForGl(_globalModule);
    this.recttcReconciledTransactionTracker = new DefaultReconciledTransactionTracker(
        _globalModule.getLogService());

    Supplier<GraphDatabaseService> _supplierSdsGraphDatabaseService = () ->
    {
      return this.abstractMultipleGdbDatabaseManagerDaamnObject.getDatabaseContext(
              DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).orElseThrow()
          .databaseFacade();
    };
    this.systemGraphDbmsModelClusterImpl = new SystemGraphDbmsModelClusterImpl(
        _supplierSdsGraphDatabaseService);
    this.healthMonitorService =
        new HealthMonitorService(_globalModule.getFileSystem(),
            _globalModule.getLogService().getInternalLogProvider(),
            _globalModule.getOtherMemoryPool().getPoolMemoryTracker(),
            _globalModule.getNeo4jLayout());
    this.recotClusteringMediationDbmsManagers =
        new ClusteringMediationDbmsManagers(this.systemGraphDbmsModelClusterImpl, _globalModule,
            this.healthMonitorService,
            this.recttcReconciledTransactionTracker);
  }


  private static void _cogthfrForJo(JobScheduler _jobScheduler) {

    Iterator _iterator = NET_THX_GRU.iterator();

    while (_iterator.hasNext()) {

      Group grp = (Group) _iterator.next();
      _jobScheduler.setThreadFactory(grp, NettyThreadFactory::new);
    }
  }


  public static Predicate<String> fiwarfnfiPredicate() {
    return Predicates.any(TransactionLogFilesHelper.DEFAULT_FILENAME_PREDICATE, (filename) ->
    {
      return filename.endsWith(io.github.onograph.TokenConstants.__CACHEPROF);
    });
  }


  private void _segostcoprlForGl(GlobalModule _globalModule) {

    Config _config = _globalModule.getGlobalConfig();

    Integer _iPcs = _config.get(SettingsDeclarationClusterImpl.settingStcaeInteger);
    _globalModule.getJobScheduler().setParallelism(Group.STORE_COPY_CLIENT, _iPcs);
  }

  @Override
  public DbmsRuntimeRepository createAndRegisterDbmsRuntimeRepository(GlobalModule _globalModule,
      DatabaseManager<?> _databaseManagerMdObject, Dependencies _dependencies,
      DbmsRuntimeSystemGraphComponent _dbmsRuntimeSystemGraphComponent) {

    DbmsRuntimeRepositoryClusterImpl _dbmsRuntimeRepositoryClusterImpl =
        new DbmsRuntimeRepositoryClusterImpl(_databaseManagerMdObject,
            _dbmsRuntimeSystemGraphComponent);

    GdbReplicator _sedrGdbReplicator =
        _dependencies.resolveDependency(GdbReplicator.class);
    _sedrGdbReplicator.retlsrForNaGd(_dbmsRuntimeRepositoryClusterImpl,
        DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
    return _dbmsRuntimeRepositoryClusterImpl;
  }

  @Override
  public BoltGraphDatabaseManagementServiceSPI createBoltDatabaseManagementServiceProvider(
      Dependencies _dependencies, DatabaseManagementService _databaseManagementService,
      Monitors _monitors, SystemNanoClock _systemNanoClock, LogService _logService) {

    Config _config = _dependencies.resolveDependency(Config.class);

    Duration _abDuration = _config.get(GraphDatabaseSettings.bookmark_ready_timeout);
    return new BoltKernelDatabaseManagementServiceProvider(_databaseManagementService, _monitors,
        _systemNanoClock, _abDuration);
  }

  @Override
  public SystemGraphInitializer createSystemGraphInitializer(GlobalModule _globalModule) {
    return _globalModule.getGlobalDependencies().satisfyDependency(SystemGraphInitializer.NO_OP);
  }


  protected void edoiatForGlDe(Dependencies _dependencies, GlobalModule _globalModule) {
    this.constraintSemantics = new ConstraintSemanticsEnterpriseImpl();
    this.connectionTracker = _dependencies.satisfyDependency(this.createConnectionTracker());
  }
}
