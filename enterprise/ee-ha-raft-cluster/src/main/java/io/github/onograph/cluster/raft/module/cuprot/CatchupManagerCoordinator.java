package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.share.ProFamilyManagementService;
import io.github.onograph.cluster.raft.share.meta.pit.CoreGdbSyncManager;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.netty.buffer.ByteBufAllocator;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.time.SystemNanoClock;


public class CatchupManagerCoordinator {


  private final LifecycleCatchupManagerImpl fccLifecycleCatchupManagerImpl;


  private final LogProvider logProvider;


  private CatchupManagerCoordinator(ByteBufAllocator _cbmhByteBufAllocator,
      SystemNanoClock _cgSystemNanoClock, Config _goaConfig, JobScheduler _jobScheduler,
      LogProvider _logProvider, SslPolicyLoader _sslPolicyLoader) {
    this.logProvider = _logProvider;

    ProFamilyManagementService proFamilyManagementService = new ProFamilyManagementService(
        _goaConfig, _logProvider);
    this.fccLifecycleCatchupManagerImpl = CatchupManagerBuilder.bulrCatchupManagerBuilderCatchupVersionedManagerImpl(
            _jobScheduler)
        .cauptsCatchupManagerBuilderCatchupVersionedManagerImpl(
            proFamilyManagementService.surcappoApplicationCurrentActiveComProFamilyWrapper())
        .moipolCatchupManagerBuilderCatchupVersionedManagerImpl(
            proFamilyManagementService.surmoeptsList())
        .sspiCatchupManagerBuilderCatchupVersionedManagerImpl(
            this._clespySslPolicy(_sslPolicyLoader))
        .inituCatchupManagerBuilderCatchupVersionedManagerImpl(
            _goaConfig.get(SettingsDeclarationClusterImpl.settingCaueaimDuration))
        .botcoCatchupManagerBuilderCatchupVersionedManagerImpl(
            NettyChannelClusterSettings.clecfNettyChannelClusterSettings(_goaConfig))
        .hashtitCatchupManagerBuilderCatchupVersionedManagerImpl(
            _goaConfig.get(SettingsDeclarationClusterImpl.settingHahitDuration))
        .delporCatchupManagerBuilderCatchupVersionedManagerImpl(_logProvider)
        .clcCatchupManagerBuilderCatchupVersionedManagerImpl(_cgSystemNanoClock)
        .cumacCatchupManagerBuilderCatchupVersionedManagerImpl(_cbmhByteBufAllocator)
        .bulLifecycleCatchupManagerImpl();
  }


  public static CatchupManagerCoordinator crechciCatchupManagerCoordinator(
      GlobalModule _globalModule, SslPolicyLoader _sslPolicyLoader) {

    CatchupManagerCoordinator catchupManagerCoordinator = new CatchupManagerCoordinator(
        _globalModule.getCentralBufferMangerHolder().getNettyBufferAllocator(),
        _globalModule.getGlobalClock(), _globalModule.getGlobalConfig(),
        _globalModule.getJobScheduler(),
        _globalModule.getLogService().getInternalLogProvider(), _sslPolicyLoader);
    _globalModule.getGlobalLife().add(catchupManagerCoordinator.fccLifecycleCatchupManagerImpl);
    return catchupManagerCoordinator;
  }


  private SslPolicy _clespySslPolicy(SslPolicyLoader _sslPolicyLoader) {
    return _sslPolicyLoader.hasPolicyForSource(SslPolicyScope.CLUSTER) ? _sslPolicyLoader.getPolicy(
        SslPolicyScope.CLUSTER) : null;
  }


  public RemoteMetaService reeictRemoteMetaService() {
    return new RemoteMetaService(this.fccLifecycleCatchupManagerImpl, this.logProvider);
  }


  public CoreGdbSyncManager snhdwdCoreGdbSyncManager() {
    return new CoreGdbSyncManager(this.fccLifecycleCatchupManagerImpl, this.logProvider);
  }


  public StoreService stcclStoreService() {
    return new StoreService(this.fccLifecycleCatchupManagerImpl, this.logProvider);
  }


  public TransactionSyncManager txpuceTransactionSyncManager() {
    return new TransactionSyncManager(this.fccLifecycleCatchupManagerImpl, this.logProvider);
  }
}
