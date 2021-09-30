package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.remote.artery.tcp.SSLEngineProvider;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.cluster.raft.module.dprot.SSLEngineProviderDefaultImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.config.ClusterMemberLimitAtCreationDTO;
import io.github.onograph.dbms.crash.CrashSignaler;
import java.time.Clock;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;


public class ClusterDiscoveryManagerAkkaImpl implements ClusterDiscoveryManager {


  protected static ActorStackBuilder acsmfoActorStackBuilder(SslPolicyLoader _sslPolicyLoader,
      DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker, Config _config,
      LogProvider _logProvider, ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO) {

    SslPolicy _sslPolicy =
        _sslPolicyLoader.hasPolicyForSource(SslPolicyScope.CLUSTER) ? _sslPolicyLoader.getPolicy(
            SslPolicyScope.CLUSTER) : null;

    Optional<SSLEngineProvider> _optionalPesSSLEngineProvider = Optional.ofNullable(_sslPolicy)
        .map(SSLEngineProviderDefaultImpl::new);
    return new ActorStackBuilder(_optionalPesSSLEngineProvider, _dsfDiscoveryInitialProcChecker,
        _config, _logProvider, clusterMemberLimitAtCreationDTO);
  }


  protected ActorStackManager acsmlcActorStackManager(
      ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO, Config _config,
      DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker, LogProvider _logProvider,
      MemberNodeService _rsleMemberNodeService, ActorLifecycleApproach _srsaaActorLifecycleApproach,
      SslPolicyLoader _sslPolicyLoader) {

    ActorStackBuilder _fsaActorStackBuilder =
        acsmfoActorStackBuilder(_sslPolicyLoader, _dsfDiscoveryInitialProcChecker, _config,
            _logProvider, clusterMemberLimitAtCreationDTO);
    return new ActorStackManager(clusterMemberLimitAtCreationDTO, _config,
        new ClusterJoinOrganizer(_rsleMemberNodeService), _fsaActorStackBuilder,
        _logProvider, _rsleMemberNodeService,
        _srsaaActorLifecycleApproach);
  }

  @Override
  public final AkkaCoreClusterStructureService cotogsvCoreClusterStructureService(Clock _clock,
      Config _config, CoreNodeServerIdentity _imCoreNodeServerIdentity, CrashSignaler crashSignaler,
      DatabaseStateService _databaseStateService,
      DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker,
      DiscoveryRetryManager _carsDiscoveryRetryManager, JobScheduler _jobScheduler,
      LogProvider _logProvider, LogProvider _useLogProvider,
      MemberNodeService _rmrMemberNodeService, Monitors _monitors,
      PointInTimeBackupService pointInTimeBackupService, SslPolicyLoader _sslPolicyLoader) {

    AkkaActorSystemRetry akkaActorSystemRetry = AkkaActorSystemRetry.focfAkkaActorSystemRetry(
        _config);

    ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO = ClusterMemberLimitAtCreationDTO.froClusterMemberLimitAtCreationDTO(
        _config);

    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl
        _srsaaActorLifecycleApproachDefaultImpl =
        new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl(
            _rmrMemberNodeService);

    ActorStackManager _asActorStackManager =
        this.acsmlcActorStackManager(clusterMemberLimitAtCreationDTO, _config,
            _dsfDiscoveryInitialProcChecker, _logProvider, _rmrMemberNodeService,
            _srsaaActorLifecycleApproachDefaultImpl,
            _sslPolicyLoader);
    return new AkkaCoreClusterStructureService(_config, _imCoreNodeServerIdentity,
        _asActorStackManager, _logProvider, _useLogProvider,
        _carsDiscoveryRetryManager, akkaActorSystemRetry,
        pointInTimeBackupService, _jobScheduler, _clock, _monitors, _databaseStateService,
        crashSignaler);
  }

  @Override
  public final AkkaClusterStructureClient rereatlseeClusterStructureService(Clock _clock,
      Config _config, DatabaseStateService _databaseStateService, JobScheduler _jobScheduler,
      LogProvider _logProvider, MemberNodeService _rmrMemberNodeService,
      PointInTimeBackupService pointInTimeBackupService, ServerIdentity _imServerIdentity,
      SslPolicyLoader _sslPolicyLoader) {

    DiscoveryInitialProcCheckerReadReplicaImpl _dsfDiscoveryInitialProcCheckerReadReplicaImpl = new DiscoveryInitialProcCheckerReadReplicaImpl();

    ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO = ClusterMemberLimitAtCreationDTO.froClusterMemberLimitAtCreationDTO(
        _config);

    ActorLifecycleApproach.NoRestartFailure _srsaaNoRestartFailure = new ActorLifecycleApproach.NoRestartFailure();

    ActorStackManager _lsaActorStackManager =
        this.acsmlcActorStackManager(clusterMemberLimitAtCreationDTO, _config,
            _dsfDiscoveryInitialProcCheckerReadReplicaImpl, _logProvider,
            _rmrMemberNodeService, _srsaaNoRestartFailure,
            _sslPolicyLoader);
    return new AkkaClusterStructureClient(_clock, _config,
        _databaseStateService, _imServerIdentity, _jobScheduler, _logProvider,
        _lsaActorStackManager,
        GdbServerPointInTimeImpl::rrsnstGdbServerPointInTimeImpl);
  }

  @Override
  public ClusterStructureService statosrClusterStructureService(Clock _clock, Config _config,
      CrashSignaler crashSignaler, DatabaseStateService _databaseStateService,
      DiscoveryRetryManager _srstDiscoveryRetryManager, JobScheduler _jobScheduler,
      LogProvider _logProvider, LogProvider _usLogProvider, MemberNodeService _rmrMemberNodeService,
      Monitors _monitors, PointInTimeBackupService pointInTimeBackupService,
      ServerIdentity _imServerIdentity, SslPolicyLoader _sslPolicyLoader) {

    AkkaActorSystemRetry akkaActorSystemRetry = AkkaActorSystemRetry.focfAkkaActorSystemRetry(
        _config);

    ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO = new ClusterMemberLimitAtCreationDTO(
        1);

    ActorLifecycleApproach.NoRestartFailure _aasrsNoRestartFailure = new ActorLifecycleApproach.NoRestartFailure();

    ActorStackManager _lsaActorStackManager = this.acsmlcActorStackManager(
        clusterMemberLimitAtCreationDTO, _config, () ->
        {
          return true;
        }, _logProvider, _rmrMemberNodeService, _aasrsNoRestartFailure, _sslPolicyLoader);
    return new LocalClusterStructureService(
        akkaActorSystemRetry, _clock, _config, crashSignaler, _databaseStateService,
        _imServerIdentity, _jobScheduler, _logProvider,
        _lsaActorStackManager, _monitors, pointInTimeBackupService, _srstDiscoveryRetryManager,
        _usLogProvider);
  }
}
