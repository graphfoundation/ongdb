package io.github.onograph.fabric.bootstrap;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.config.ConfigurableFabricSettings;
import io.github.onograph.config.EnterpriseClusterSettings;
import io.github.onograph.config.EnterpriseFabricConfiguration;
import io.github.onograph.fabric.AbstractFabricDatabaseManager;
import io.github.onograph.fabric.CallableUserFunctionFabricGraphIdsImpl;
import io.github.onograph.fabric.ClusterCatalogManager;
import io.github.onograph.fabric.EnterpriseSingleCatalogManager;
import io.github.onograph.fabric.FabricDatabaseAccessEnterpriseImpl;
import io.github.onograph.fabric.FabricRemoteExecutorEnterpriseImpl;
import io.github.onograph.fabric.LeaderLookup;
import io.github.onograph.fabric.security.AuthTokenService;
import io.github.onograph.fabric.security.AuthTokenServiceClusterAwareImpl;
import io.github.onograph.fabric.security.AuthTokenServiceExternalImpl;
import io.github.onograph.fabric.service.FabricDriverService;
import io.github.onograph.fabric.service.FabricDriverServiceClusterImpl;
import io.github.onograph.fabric.service.FabricDriverServiceDefaultImpl;
import io.github.onograph.fabric.service.PoolingLifecycleAdapter;
import java.time.Clock;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.exceptions.KernelException;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.fabric.bootstrap.FabricServicesBootstrap;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.fabric.eval.CatalogManager;
import org.neo4j.fabric.executor.FabricDatabaseAccess;
import org.neo4j.fabric.executor.FabricRemoteExecutor;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.internal.LogService;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.config.SslPolicyLoader;


public abstract class AbstractFabricServicesBootstrap extends FabricServicesBootstrap {

  public AbstractFabricServicesBootstrap(AbstractSecurityLog _abstractSecurityLog,
      Dependencies _dependencies, LifeSupport _lifeSupport, LogService _logService) {
    super(_lifeSupport, _dependencies, _logService, _abstractSecurityLog);
  }


  private static void _asensForCoSe(Config _config, Setting<?> _settingStigObject) {
    if (_config.isExplicitlySet(_settingStigObject)) {
      _unpdsiForSt(_settingStigObject.name());
    }
  }


  private static void _unpdsiForSt(String _strNs) {

    throw new IllegalArgumentException("*** Error: 1391d39f-2587-4fc6-88da-62411ed92b91");
  }


  private static void _vaafbsegfceForCo(Config _config) {
    _asensForCoSe(_config, ConfigurableFabricSettings.settingDaasaString);
    _asensForCoSe(_config, ConfigurableFabricSettings.settingFacetList);
    _asensForCoSe(_config, ConfigurableFabricSettings.settingRonsnDuration);
    if (!_config.getGroups(ConfigurableFabricSettings.FabricGroupSetting.class).isEmpty()) {
      _unpdsiForSt(io.github.onograph.TokenConstants.FABRIC__GRAPH);
    }
  }

  @Override
  protected FabricConfig bootstrapFabricConfig() {

    Config _config = this.resolve(Config.class);
    this.vaafbsegForCo(_config);
    return this.register(EnterpriseFabricConfiguration.froEnterpriseFabricConfiguration(_config),
        EnterpriseFabricConfiguration.class);
  }

  @Override
  protected FabricRemoteExecutor bootstrapRemoteStack() {

    AuthTokenService _pcAuthTokenService = this.register(this.crecelpvAuthTokenService(),
        AuthTokenService.class);

    EnterpriseFabricConfiguration _enterpriseFabricConfiguration = this.resolve(
        EnterpriseFabricConfiguration.class);

    Config _config = this.resolve(Config.class);

    SslPolicyLoader _sslPolicyLoader = this.resolve(SslPolicyLoader.class);

    FabricDriverService _fcdFabricDriverService = this.credecffcFabricDriverService(_config,
        _enterpriseFabricConfiguration, _sslPolicyLoader);

    JobScheduler _jobScheduler = this.resolve(JobScheduler.class);

    PoolingLifecycleAdapter _pdPoolingLifecycleAdapter = this
        .register(new PoolingLifecycleAdapter(Clock.systemUTC(), _enterpriseFabricConfiguration,
            _fcdFabricDriverService, _jobScheduler,
            _pcAuthTokenService), PoolingLifecycleAdapter.class);
    return this.register(new FabricRemoteExecutorEnterpriseImpl(_pdPoolingLifecycleAdapter),
        FabricRemoteExecutor.class);
  }


  protected abstract AuthTokenService crecelpvAuthTokenService();


  protected abstract FabricDriverService credecffcFabricDriverService(Config _config,
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
      SslPolicyLoader _sslPolicyLoader);


  protected EnterpriseFabricConfiguration gefbcoEnterpriseFabricConfiguration() {
    return this.resolve(EnterpriseFabricConfiguration.class);
  }


  public void retporForGl(GlobalProcedures _globalProcedures) throws KernelException {

    EnterpriseFabricConfiguration _enterpriseFabricConfiguration = this.resolve(
        EnterpriseFabricConfiguration.class);
    if (_enterpriseFabricConfiguration.getGdbRef() != null) {
      _globalProcedures.registerBuiltIn(
          new CallableUserFunctionFabricGraphIdsImpl(_enterpriseFabricConfiguration));
    }
  }


  protected abstract void vaafbsegForCo(Config _config);


  public abstract static class AbstractClusterNode extends AbstractFabricServicesBootstrap {

    public AbstractClusterNode(AbstractSecurityLog _abstractSecurityLog, Dependencies _dependencies,
        LifeSupport _lifeSupport, LogService _logService) {
      super(_abstractSecurityLog, _dependencies, _lifeSupport, _logService);
    }

    @Override
    protected CatalogManager createCatalogManger() {

      EnterpriseFabricConfiguration _enterpriseFabricConfiguration = this.resolve(
          EnterpriseFabricConfiguration.class);

      DatabaseManagementService _databaseManagementService = this.resolve(
          DatabaseManagementService.class);

      ClusterStructureService clusterStructureService = this.resolve(ClusterStructureService.class);

      LeaderLookup _leaderLookup = this.ledlkLeaderLookup(clusterStructureService);
      return new ClusterCatalogManager(this.createDatabaseLookup(), _databaseManagementService,
          _leaderLookup, _enterpriseFabricConfiguration,
          _enterpriseFabricConfiguration.isRoutingEnabled());
    }

    @Override
    protected FabricDatabaseAccess createFabricDatabaseAccess() {
      return FabricDatabaseAccess.NO_RESTRICTION;
    }

    @Override
    protected FabricDatabaseManager createFabricDatabaseManager(FabricConfig _fabricConfig) {

      DatabaseManager<DatabaseContext> _databaseManagerMdDatabaseContext = (DatabaseManager) this.resolve(
          DatabaseManager.class);
      return new AbstractFabricDatabaseManager.MultiFabricDatabaseManager(
          _databaseManagerMdDatabaseContext,
          (EnterpriseFabricConfiguration) _fabricConfig);
    }

    @Override
    protected AuthTokenService crecelpvAuthTokenService() {
      return new AuthTokenServiceClusterAwareImpl();
    }

    @Override
    protected FabricDriverService credecffcFabricDriverService(Config _sreConfig,
        EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
        SslPolicyLoader _sslPolicyLoader) {
      return new FabricDriverServiceClusterImpl(_enterpriseFabricConfiguration, _sreConfig,
          _sslPolicyLoader);
    }


    protected abstract LeaderLookup ledlkLeaderLookup(
        ClusterStructureService _clusterStructureService);

    @Override
    protected void vaafbsegForCo(Config _config) {
      AbstractFabricServicesBootstrap._vaafbsegfceForCo(_config);
    }
  }


  public static class CoreClusterNode extends AbstractClusterNode {

    public CoreClusterNode(AbstractSecurityLog _abstractSecurityLog, Dependencies _dependencies,
        LifeSupport _lifeSupport, LogService _logService) {
      super(_abstractSecurityLog, _dependencies, _lifeSupport, _logService);
    }

    @Override
    protected LeaderLookup ledlkLeaderLookup(ClusterStructureService clusterStructureService) {

      ClusterLeader _lsClusterLeader = this.resolve(ClusterLeader.class);
      return new LeaderLookup.Core(clusterStructureService, _lsClusterLeader);
    }
  }


  public static class DefaultFabricServicesBootstrap extends AbstractFabricServicesBootstrap {


    private final LogService logService;


    public DefaultFabricServicesBootstrap(AbstractSecurityLog _abstractSecurityLog,
        Dependencies _dependencies, LifeSupport _lifeSupport, LogService _logService) {
      super(_abstractSecurityLog, _dependencies, _lifeSupport, _logService);
      this.logService = _logService;
    }


    private void _astctgdbForCo(Config _config) {
      if (EnterpriseClusterSettings.isCleeeForCo(_config)) {
        try {
          AbstractFabricServicesBootstrap._vaafbsegfceForCo(_config);
        } catch (

            Exception _exception) {

          IllegalStateException _illegalStateException =
              new IllegalStateException("*** Error:  5b1cd0cc-ca3c-4537-991e-fdcb1da40827");

          _illegalStateException.addSuppressed(_exception);
          throw _illegalStateException;
        }
      }
    }

    @Override
    protected CatalogManager createCatalogManger() {

      DatabaseManagementService _databaseManagementService = this.resolve(
          DatabaseManagementService.class);
      return new EnterpriseSingleCatalogManager(this.createDatabaseLookup(),
          _databaseManagementService, this.gefbcoEnterpriseFabricConfiguration());
    }

    @Override
    protected FabricDatabaseAccess createFabricDatabaseAccess() {
      return new FabricDatabaseAccessEnterpriseImpl(this.resolve(FabricDatabaseManager.class));
    }

    @Override
    protected FabricDatabaseManager createFabricDatabaseManager(FabricConfig _fabricConfig) {

      DatabaseManager<DatabaseContext> _databaseManagerMdDatabaseContext = (DatabaseManager) this.resolve(
          DatabaseManager.class);
      return new AbstractFabricDatabaseManager.StandardFabricDatabaseManager(
          _databaseManagerMdDatabaseContext,
          (EnterpriseFabricConfiguration) _fabricConfig,
          this.logService.getInternalLogProvider());
    }

    @Override
    protected AuthTokenService crecelpvAuthTokenService() {
      return new AuthTokenServiceExternalImpl();
    }

    @Override
    protected FabricDriverService credecffcFabricDriverService(Config _sreConfig,
        EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
        SslPolicyLoader _sslPolicyLoader) {
      return new FabricDriverServiceDefaultImpl(_enterpriseFabricConfiguration, _sreConfig,
          _sslPolicyLoader);
    }

    @Override
    protected void vaafbsegForCo(Config _config) {
      this._astctgdbForCo(_config);
    }
  }


  public static class ReadReplicaClusterNode extends AbstractClusterNode {

    public ReadReplicaClusterNode(AbstractSecurityLog _abstractSecurityLog,
        Dependencies _dependencies, LifeSupport _lifeSupport, LogService _logService) {
      super(_abstractSecurityLog, _dependencies, _lifeSupport, _logService);
    }

    @Override
    protected LeaderLookup ledlkLeaderLookup(ClusterStructureService clusterStructureService) {
      return new LeaderLookup.ReadReplica(clusterStructureService);
    }
  }
}
