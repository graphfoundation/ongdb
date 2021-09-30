package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider;
import io.github.onograph.cluster.raft.share.bulk.BulkIncomingMessageRunner;
import io.github.onograph.cluster.raft.share.calg.ConsensusIncomingMessageMonitoringProcessor;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeScheduleWrapper;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeStatusIncomingMessageProcessor;
import io.github.onograph.cluster.raft.share.calg.ResettableMessageTimer;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.share.meta.ConsensusIncomingMessageProcessor;
import io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter;
import io.github.onograph.dbms.crash.GdbCrashSender;
import java.time.Clock;
import java.util.Objects;
import org.neo4j.configuration.Config;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;


class ConsensusMessageOperationsBuilder {


  private final Clock clock;


  private final Config config;


  private final ConsensusIncomingMessageManager dmrConsensusIncomingMessageManager;


  private final JobScheduler jobScheduler;


  private final LogProvider logProvider;


  private final Monitors monitors;


  private final io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl pacSocketAddressServiceLeaderImpl;


  private final GdbCrashSender pnceGdbCrashSender;


  ConsensusMessageOperationsBuilder(Clock _clock, Config _config,
      ConsensusIncomingMessageManager _dmrConsensusIncomingMessageManager,
      JobScheduler _jobScheduler, LogProvider _logProvider, Monitors _monitors,
      io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl _pacSocketAddressServiceLeaderImpl,
      GdbCrashSender _pnceGdbCrashSender) {
    this.clock = _clock;
    this.config = _config;
    this.dmrConsensusIncomingMessageManager = _dmrConsensusIncomingMessageManager;
    this.jobScheduler = _jobScheduler;
    this.logProvider = _logProvider;
    this.monitors = _monitors;
    this.pacSocketAddressServiceLeaderImpl = _pacSocketAddressServiceLeaderImpl;
    this.pnceGdbCrashSender = _pnceGdbCrashSender;
  }


  FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> cremahncFLIncomingMessageProcessor(
      ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper,
      ActionProcessManager _pacActionProcessManager,
      SyncServiceLifecycleAdapter _sdSyncServiceLifecycleAdapter) {

    ConsensusIncomingMessageProcessor _amConsensusIncomingMessageProcessor =
        new ConsensusIncomingMessageProcessor(this.pacSocketAddressServiceLeaderImpl,
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager(),
            this.logProvider, _pacActionProcessManager,
            this.pnceGdbCrashSender, _sdSyncServiceLifecycleAdapter);

    IncomingMessageProvider _hmIncomingMessageProvider =
        ConsensusIncomingMessageMonitoringProcessor.copaeIncomingMessageProvider(this.clock,
            this.monitors);

    IncomingMessageProvider _hmbIncomingMessageProvider =
        BulkIncomingMessageRunner.copaeIncomingMessageProvider(this.config, this.jobScheduler,
            this.logProvider);

    LeaderNodeScheduleWrapper _leaderNodeScheduleWrapper = _grConsensusNodeGroupWrapper.getTalLeaderNodeScheduleWrapper();

    ResettableMessageTimer _resettableMessageTimer = this.monitors.newMonitor(
        ResettableMessageTimer.class, new String[0]);

    ConsensusOperationsManager _consensusOperationsManager = _grConsensusNodeGroupWrapper.getConsensusOperationsManager();
    Objects.requireNonNull(_consensusOperationsManager);

    IncomingMessageProvider _halIncomingMessageProvider =
        LeaderNodeStatusIncomingMessageProcessor.copaeIncomingMessageProvider(
            _resettableMessageTimer, _leaderNodeScheduleWrapper,
            _consensusOperationsManager::getConsTermLength);

    IncomingMessageProvider _hbcIncomingMessageProvider =
        EnterpriseClusterIncomingMessageProcessor.copaeIncomingMessageProvider(
            this.dmrConsensusIncomingMessageManager, this.logProvider);
    return _hbcIncomingMessageProvider.compose(_halIncomingMessageProvider)
        .compose(_hmbIncomingMessageProvider)
        .compose(_hmIncomingMessageProvider).apply(_amConsensusIncomingMessageProcessor);
  }
}
