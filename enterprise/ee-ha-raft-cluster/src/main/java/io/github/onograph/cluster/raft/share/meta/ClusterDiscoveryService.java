package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.config.MemberNodeServiceFinder;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.crash.CrashSignaler;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.time.SystemNanoClock;


public class ClusterDiscoveryService {


  private final CrashSignaler crashSignaler;


  private final DatabaseStateService databaseStateService;


  private final ClusterDiscoveryManager fsdClusterDiscoveryManager;


  private final Config goaConfig;


  private final Dependencies goaDependencies;


  private final Monitors goaMonitors;


  private final JobScheduler jobScheduler;


  private final LogProvider ldLogProvider;


  private final LifeSupport lgLifeSupport;


  private final LogService logService;


  private final LogProvider luLogProvider;


  private final SslPolicyLoader sslPolicyLoader;


  private final SystemNanoClock systemNanoClock;


  public ClusterDiscoveryService(CrashSignaler crashSignaler,
      DatabaseStateService _databaseStateService,
      ClusterDiscoveryManager _fsdClusterDiscoveryManager, GlobalModule _globalModule,
      SslPolicyLoader _sslPolicyLoader) {
    this.fsdClusterDiscoveryManager = _fsdClusterDiscoveryManager;
    this.sslPolicyLoader = _sslPolicyLoader;
    this.databaseStateService = _databaseStateService;
    this.crashSignaler = crashSignaler;
    this.lgLifeSupport = _globalModule.getGlobalLife();
    this.goaConfig = _globalModule.getGlobalConfig();
    this.logService = _globalModule.getLogService();
    this.goaDependencies = _globalModule.getGlobalDependencies();
    this.systemNanoClock = _globalModule.getGlobalClock();
    this.jobScheduler = _globalModule.getJobScheduler();
    this.goaMonitors = _globalModule.getGlobalMonitors();
    this.ldLogProvider = this.logService.getInternalLogProvider();
    this.luLogProvider = this.logService.getUserLogProvider();
  }


  private static DiscoveryRetryManager _revsaDiscoveryRetryManager(Config _config) {

    long _lgMpr = _config.get(SettingsDeclarationClusterImpl.settingCleorsDuration).toMillis();

    int _iWrwfp = 2;

    int _iRon = _iWrwfp + 1;

    long _lgMid = _lgMpr / (long) _iWrwfp;
    return new DiscoveryRetryManager(_lgMid, _iRon);
  }


  public CoreClusterStructureService cotogsvCoreClusterStructureService(
      CoreNodeServerIdentity _coreNodeServerIdentity,
      DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker) {

    MemberNodeService _rmrMemberNodeService = MemberNodeServiceFinder.choroeMemberNodeService(
        this.goaConfig, this.logService);

    PointInTimeBackupService pointInTimeBackupService = GdbServerPointInTimeImpl.cosnoftPointInTimeBackupService(
        _coreNodeServerIdentity);

    CoreClusterStructureService _stCoreClusterStructureService = this.fsdClusterDiscoveryManager
        .cotogsvCoreClusterStructureService(this.systemNanoClock, this.goaConfig,
            _coreNodeServerIdentity, this.crashSignaler,
            this.databaseStateService, _dsfDiscoveryInitialProcChecker,
            _revsaDiscoveryRetryManager(this.goaConfig), this.jobScheduler, this.ldLogProvider,
            this.luLogProvider,
            _rmrMemberNodeService, this.goaMonitors, pointInTimeBackupService,
            this.sslPolicyLoader);
    this.lgLifeSupport.add(_stCoreClusterStructureService);
    this.goaDependencies.satisfyDependency(_stCoreClusterStructureService);
    return _stCoreClusterStructureService;
  }


  public ClusterStructureService statosrClusterStructureService(ServerIdentity _serverIdentity) {

    MemberNodeService _rmrMemberNodeService = MemberNodeServiceFinder.choroeMemberNodeService(
        this.goaConfig, this.logService);

    ClusterStructureService clusterStructureService = this.fsdClusterDiscoveryManager
        .statosrClusterStructureService(this.systemNanoClock, this.goaConfig, this.crashSignaler,
            this.databaseStateService,
            _revsaDiscoveryRetryManager(this.goaConfig), this.jobScheduler,
            this.ldLogProvider, this.luLogProvider, _rmrMemberNodeService, this.goaMonitors,
            GdbServerPointInTimeImpl::rrsnstGdbServerPointInTimeImpl, _serverIdentity,
            this.sslPolicyLoader);
    this.lgLifeSupport.add(clusterStructureService);
    this.goaDependencies.satisfyDependency(clusterStructureService);
    return clusterStructureService;
  }
}
