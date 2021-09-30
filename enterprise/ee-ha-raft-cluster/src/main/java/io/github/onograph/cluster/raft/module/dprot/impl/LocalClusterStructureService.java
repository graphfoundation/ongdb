package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.actor.ActorRef;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.SetupLeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import io.github.onograph.dbms.crash.CrashSignaler;
import java.time.Clock;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;


public class LocalClusterStructureService extends DefaultClusterStructureService {


  private final NodeServerMemberLeaderMeta ldNodeServerMemberLeaderMeta;


  public LocalClusterStructureService(AkkaActorSystemRetry akkaActorSystemRetry, Clock _clock,
      Config _config, CrashSignaler crashSignaler, DatabaseStateService _databaseStateService,
      ServerIdentity _imServerIdentity, JobScheduler _jobScheduler, LogProvider _logProvider,
      ActorStackManager _lsaActorStackManager, Monitors _monitors,
      PointInTimeBackupService pointInTimeBackupService,
      DiscoveryRetryManager _sracDiscoveryRetryManager, LogProvider _useLogProvider) {
    super(akkaActorSystemRetry, _clock, _config, crashSignaler, _databaseStateService,
        _imServerIdentity, _jobScheduler, _logProvider,
        _lsaActorStackManager, _monitors, pointInTimeBackupService, _sracDiscoveryRetryManager,
        _useLogProvider);
    this.ldNodeServerMemberLeaderMeta = new NodeServerMemberLeaderMeta(
        new ConsensusNodeId(_imServerIdentity.serverId().uuid()), 1L);
  }


  private void _sedlarifForNoNa(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta,
      NamedDatabaseId _namedDatabaseId) {

    ActorRef _adActorRef = this.dieoActorRef;
    if (_adActorRef != null) {
      _adActorRef.tell(new SetupLeaderMeta(_ilNodeServerMemberLeaderMeta, _namedDatabaseId),
          ActorRef.noSender());
    }
  }

  @Override
  protected GdbServerPointInTime cresespGdbServerPointInTime() {

    Map<DatabaseId, NodeServerMemberLeaderMeta> _mapCletdn =
        this.databaseStateService.stateOfAllDatabases().keySet().stream()
            .map(NamedDatabaseId::databaseId)
            .collect(Collectors.toMap(Function.identity(), (ignored) ->
            {
              return this.ldNodeServerMemberLeaderMeta;
            }));
    return this.pointInTimeBackupService.takePointInTimeImage(this.databaseStateService,
        _mapCletdn);
  }

  @Override
  public ClusterNodeRoleType lokreClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {
    return this.myidtyServerIdentity.serverId().equals(_serverId) ? ClusterNodeRoleType.LEADER
        : this.glltlstClusterStructureMeta.rolClusterNodeRoleType(_namedDatabaseId,
            _serverId);
  }

  @Override
  protected void reeleioForNa(NamedDatabaseId _namedDatabaseId) {
  }

  @Override
  public void sttchgForDaDa(DatabaseState _spDatabaseState, DatabaseState _nsDatabaseState) {
    if (_nsDatabaseState.operatorState() == OperatorStateEnterpriseTypeImpl.SETI_RUNNING) {
      this._sedlarifForNoNa(this.ldNodeServerMemberLeaderMeta, _nsDatabaseState.databaseId());
    }

    super.sttchgForDaDa(_spDatabaseState, _nsDatabaseState);
  }
}
