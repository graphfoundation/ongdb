package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import java.time.Clock;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.util.VisibleForTesting;


public class LeaderGatekeeper extends LifecycleAdapter implements Declinable {


  private static final TransferElectApproachDefaultImpl DRSTTG_TRANSFER_ELECT_APPROACH_DEFAULT_IMPL = new TransferElectApproachDefaultImpl();


  private final Duration itlDuration;


  private final NodeTransferRunner jltNodeTransferRunner;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final ServerStatTags pdServerStatTags;


  private final NamedDatabaseIdLeaderSupplier rlNamedDatabaseIdLeaderSupplier;


  private final NodeMemberFinder rmNodeMemberFinder;


  private final LeaderController tlLeaderController;


  private JobHandle<?> jobHandleHjObject;

  public LeaderGatekeeper(JobScheduler _jobScheduler, Config _config, Duration _itlDuration,
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerMdEnterpriseClusterDbContext,
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorHmArrivingMessageManager,
      CoreNodeServerIdentity _imCoreNodeServerIdentity, Duration _bmlDuration,
      LogProvider _logProvider, Clock _clock, ClusterLeader _slClusterLeader,
      NodeGroupIdentifierSetSupplier _sgsNodeGroupIdentifierSetSupplier,
      NodeMemberFinder _rmNodeMemberFinder, DbmsReadOnlyChecker _dbmsReadOnlyChecker) {
    this.pdServerStatTags = new ServerStatTags(_clock, _bmlDuration);
    this.jobScheduler = _jobScheduler;
    this.itlDuration = _itlDuration;
    this.log = _logProvider.getLog(this.getClass());
    this.rmNodeMemberFinder = _rmNodeMemberFinder;
    this.tlLeaderController =
        new LeaderController(_clock, _imCoreNodeServerIdentity,
            _incomingMessageProcessorHmArrivingMessageManager, this.pdServerStatTags,
            _rmNodeMemberFinder);
    this.rlNamedDatabaseIdLeaderSupplier = new NamedDatabaseIdLeaderSupplier(
        _databaseManagerMdEnterpriseClusterDbContext, _imCoreNodeServerIdentity);
    this.jltNodeTransferRunner = new NodeTransferRunner(
        _peisryTransferElectApproach(_config, _databaseManagerMdEnterpriseClusterDbContext,
            _imCoreNodeServerIdentity, _slClusterLeader), _config,
        _dbmsReadOnlyChecker, _sgsNodeGroupIdentifierSetSupplier,
        this.rlNamedDatabaseIdLeaderSupplier, this.tlLeaderController);
  }


  private static TransferElectApproach _peisryTransferElectApproach(Config _config,
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerMdEnterpriseClusterDbContext,
      CoreNodeServerIdentity _imCoreNodeServerIdentity, ClusterLeader _lsClusterLeader) {

    io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType _csLeadershipBalancingApproachType =
        _config.get(SettingsDeclarationClusterImpl.settingLernLeadershipBalancingApproachType);
    switch (_csLeadershipBalancingApproachType) {
      case LBAT_SPLIT:
        return new TransferElectApproachSemiImpl(_imCoreNodeServerIdentity, _lsClusterLeader, () ->
        {
          return _databaseManagerMdEnterpriseClusterDbContext.registeredDatabases().keySet();
        });
      case LBAT_BAL_OFF:
      default:
        return TransferElectApproach.NOO_TRANSFER_ELECT_APPROACH;
    }
  }


  private void _dralah() {

    List<NamedDatabaseId> _listLmNamedDatabaseId = this.rlNamedDatabaseIdLeaderSupplier.get();

    Iterator _iterator = _listLmNamedDatabaseId.iterator();

    while (_iterator.hasNext()) {

      NamedDatabaseId _laesiNamedDatabaseId = (NamedDatabaseId) _iterator.next();
      if (!this.tlLeaderController.isBacldiForCoTr(List.of(_laesiNamedDatabaseId),
          DRSTTG_TRANSFER_ELECT_APPROACH_DEFAULT_IMPL)) {

      }
    }
  }


  @VisibleForTesting
  void awrnj() {
    if (this.jobHandleHjObject != null) {
      try {
        this.jobHandleHjObject.waitTermination();
      } catch (

          CancellationException _cancellationException) {
      } catch (

          InterruptedException | ExecutionException _exception) {
        throw new RuntimeException(_exception);
      }
    }
  }


  @VisibleForTesting
  ServerStatTags getPdServerStatTags() {
    return this.pdServerStatTags;
  }

  @Override
  public void haercForCoNa(
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted,
      NamedDatabaseId _namedDatabaseId) {

    ConsensusNodeId _imConsensusNodeId = leaderNotAccepted.getFroConsensusNodeId();

    ServerId _serverId = this.rmNodeMemberFinder.revsvfrrmrServerId(_imConsensusNodeId);
    if (_serverId != null) {
      this.pdServerStatTags.upelForSeNa(_namedDatabaseId, _serverId);
    } else {

    }
  }

  @Override
  public void start() throws Exception {

    long _lgTs = this.itlDuration.toMillis();
    this.jobHandleHjObject = this.jobScheduler.scheduleRecurring(Group.LEADER_TRANSFER_SERVICE,
        this.jltNodeTransferRunner, _lgTs, TimeUnit.MILLISECONDS);
  }

  @Override
  public void stop() {
    if (this.jobHandleHjObject != null) {
      this.jobHandleHjObject.cancel();
    }

    this._dralah();
  }
}
