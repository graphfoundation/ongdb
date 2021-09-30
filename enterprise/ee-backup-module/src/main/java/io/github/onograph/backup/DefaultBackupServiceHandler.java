package io.github.onograph.backup;

import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder;
import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.share.ProFamilyManagementService;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.pagecache.ConfigurableStandalonePageCacheFactory;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.time.SystemNanoClock;


public class DefaultBackupServiceHandler implements AutoCloseable {


  private final LifecycleCatchupManagerImpl fccLifecycleCatchupManagerImpl;


  private final JobScheduler jobScheduler;


  private final PageCache pageCache;


  private DefaultBackupServiceHandler(LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl,
      PageCache _pageCache, JobScheduler _siJobScheduler) {
    this.fccLifecycleCatchupManagerImpl = _fccLifecycleCatchupManagerImpl;
    this.jobScheduler = _siJobScheduler;
    this.pageCache = _pageCache;
  }


  private static LifecycleCatchupManagerImpl _cacupcitLifecycleCatchupManagerImpl(Config _config,
      JobScheduler _jobScheduler, LogProvider _logProvider, SystemNanoClock _systemNanoClock) {

    ProFamilyManagementService proFamilyManagementService = new ProFamilyManagementService(_config,
        _logProvider);

    ApplicationCurrentActiveComProFamilyWrapper _pcsApplicationCurrentActiveComProFamilyWrapper =
        proFamilyManagementService.surcappoApplicationCurrentActiveComProFamilyWrapper();

    SslPolicy _sslPolicy = _lodslplySslPolicy(_config, _logProvider);
    return CatchupManagerBuilder.bulrCatchupManagerBuilderCatchupVersionedManagerImpl(_jobScheduler)
        .cauptsCatchupManagerBuilderCatchupVersionedManagerImpl(
            _pcsApplicationCurrentActiveComProFamilyWrapper)
        .sspiCatchupManagerBuilderCatchupVersionedManagerImpl(_sslPolicy)
        .inituCatchupManagerBuilderCatchupVersionedManagerImpl(
            _config.get(SettingsDeclarationClusterImpl.settingCaueaimDuration))
        .moipolCatchupManagerBuilderCatchupVersionedManagerImpl(
            proFamilyManagementService.surmoeptsList())
        .botcoCatchupManagerBuilderCatchupVersionedManagerImpl(
            NettyChannelClusterSettings.clecfNettyChannelClusterSettings(_config))
        .hashtitCatchupManagerBuilderCatchupVersionedManagerImpl(
            _config.get(SettingsDeclarationClusterImpl.settingHahitDuration))
        .clcCatchupManagerBuilderCatchupVersionedManagerImpl(_systemNanoClock)
        .delporCatchupManagerBuilderCatchupVersionedManagerImpl(_logProvider)
        .bulLifecycleCatchupManagerImpl();
  }


  private static PageCache _crepcPageCache(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, JobScheduler _jobScheduler,
      PageCacheTracer _pageCacheTracer) {
    return ConfigurableStandalonePageCacheFactory.createPageCache(_fileSystemAbstraction, _config,
        _jobScheduler, _pageCacheTracer);
  }


  private static SslPolicy _lodslplySslPolicy(Config _config, LogProvider _logProvider) {

    SslPolicyLoader _sslPolicyLoader = SslPolicyLoader.create(_config, _logProvider);
    return _sslPolicyLoader.hasPolicyForSource(SslPolicyScope.BACKUP) ? _sslPolicyLoader.getPolicy(
        SslPolicyScope.BACKUP) : null;
  }


  public static DefaultBackupServiceHandler strliclDefaultBackupServiceHandler(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider,
      PageCacheTracer _pageCacheTracer, SystemNanoClock _systemNanoClock) {

    JobScheduler _jobScheduler = JobSchedulerFactory.createInitialisedScheduler(_systemNanoClock);

    PageCache _pageCache = _crepcPageCache(_config, _fileSystemAbstraction, _jobScheduler,
        _pageCacheTracer);

    LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl =
        _cacupcitLifecycleCatchupManagerImpl(_config, _jobScheduler, _logProvider,
            _systemNanoClock);

    DefaultBackupServiceHandler defaultBackupServiceHandler = new DefaultBackupServiceHandler(
        _fccLifecycleCatchupManagerImpl, _pageCache, _jobScheduler);
    defaultBackupServiceHandler.fccLifecycleCatchupManagerImpl.init();
    defaultBackupServiceHandler.fccLifecycleCatchupManagerImpl.start();
    return defaultBackupServiceHandler;
  }

  @Override
  public void close() throws Exception {
    this.fccLifecycleCatchupManagerImpl.stop();
    this.fccLifecycleCatchupManagerImpl.shutdown();
    IOUtils.closeAll(this.pageCache, this.jobScheduler);
  }


  public LifecycleCatchupManagerImpl getFccLifecycleCatchupManagerImpl() {
    return this.fccLifecycleCatchupManagerImpl;
  }


  public JobScheduler getJobScheduler() {
    return this.jobScheduler;
  }


  public PageCache getPageCache() {
    return this.pageCache;
  }
}
