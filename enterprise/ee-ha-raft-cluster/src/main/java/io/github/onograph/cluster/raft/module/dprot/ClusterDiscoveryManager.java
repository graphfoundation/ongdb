package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.dbms.crash.CrashSignaler;
import java.time.Clock;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.config.SslPolicyLoader;


public interface ClusterDiscoveryManager {


  CoreClusterStructureService cotogsvCoreClusterStructureService(Clock _clock, Config _config,
      CoreNodeServerIdentity _coreNodeServerIdentity, CrashSignaler _crashSignaler,
      DatabaseStateService _databaseStateService,
      DiscoveryInitialProcChecker _discoveryInitialProcChecker,
      DiscoveryRetryManager _discoveryRetryManager, JobScheduler _jobScheduler,
      LogProvider _logProvider, LogProvider _logProvider2, MemberNodeService _memberNodeService,
      Monitors _monitors, PointInTimeBackupService _pointInTimeBackupService,
      SslPolicyLoader _sslPolicyLoader);


  ClusterStructureService rereatlseeClusterStructureService(Clock _clock, Config _config,
      DatabaseStateService _databaseStateService, JobScheduler _jobScheduler,
      LogProvider _logProvider, MemberNodeService _memberNodeService,
      PointInTimeBackupService _pointInTimeBackupService, ServerIdentity _serverIdentity,
      SslPolicyLoader _sslPolicyLoader);


  ClusterStructureService statosrClusterStructureService(Clock _clock, Config _config,
      CrashSignaler _crashSignaler, DatabaseStateService _databaseStateService,
      DiscoveryRetryManager _discoveryRetryManager, JobScheduler _jobScheduler,
      LogProvider _logProvider, LogProvider _logProvider2, MemberNodeService _memberNodeService,
      Monitors _monitors, PointInTimeBackupService _pointInTimeBackupService,
      ServerIdentity _serverIdentity, SslPolicyLoader _sslPolicyLoader);
}
