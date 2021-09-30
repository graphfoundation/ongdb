package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderManager;
import java.time.Clock;
import java.util.concurrent.TimeUnit;
import org.neo4j.function.ThrowingAction;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;


public class LeaderNodeScheduleWrapper {


  private final Clock clock;


  private final ConsensusSchedulerTimingSettings ctrConsensusSchedulerTimingSettings;


  private final Log log;


  private final ScHolderJobScheduler stScHolderJobScheduler;


  public volatile NodeElectionTimeTrackerType elitmmdNodeElectionTimeTrackerType;


  private volatile ScHolderJobSchedulerWatcher etScHolderJobSchedulerWatcher;


  private volatile long lgMrel;


  private volatile ScHolderJobSchedulerWatcher thScHolderJobSchedulerWatcher;


  LeaderNodeScheduleWrapper(Clock _clock,
      ConsensusSchedulerTimingSettings _ctrConsensusSchedulerTimingSettings,
      LogProvider _logProvider, ScHolderJobScheduler _stScHolderJobScheduler) {
    this.ctrConsensusSchedulerTimingSettings = _ctrConsensusSchedulerTimingSettings;
    this.clock = _clock;
    this.stScHolderJobScheduler = _stScHolderJobScheduler;
    this.log = _logProvider.getLog(this.getClass());
    this.elitmmdNodeElectionTimeTrackerType = NodeElectionTimeTrackerType.TTT_NOW;
  }


  private ScHolderManager _reenScHolderManager(
      ThrowingAction<Exception> _throwingActionAtoException) {
    return (timeout) ->
    {
      try {
        _throwingActionAtoException.apply();
      } catch (

          Exception _exception) {

      }

      timeout.isRee();
    };
  }


  private NodeElectionTimeTrackerType getElitmmdNodeElectionTimeTrackerType() {
    return this.elitmmdNodeElectionTimeTrackerType;
  }


  boolean isEcto() {
    switch (this.elitmmdNodeElectionTimeTrackerType) {
      case TTT_NOW:
        return true;
      case TTT_CON_ELECT_INPROCESS:
        return this.clock.millis() - this.lgMrel
            >= this.ctrConsensusSchedulerTimingSettings.getWrDurationRangeMin();
      case TTT_ERR_TRACE:
        return this.clock.millis() - this.lgMrel
            >= this.ctrConsensusSchedulerTimingSettings.detwimims();
      default:

        throw new IllegalArgumentException("*** Error: df24e25b-4da6-40e3-a120-e953638dc70c");
    }
  }


  void reeitmForNo(NodeElectionTimeTrackerType _mteNodeElectionTimeTrackerType) {
    this.lgMrel = this.clock.millis();
    this.elitmmdNodeElectionTimeTrackerType = _mteNodeElectionTimeTrackerType;
    if (this.etScHolderJobSchedulerWatcher != null) {
      this.etScHolderJobSchedulerWatcher.isRee();
    }
  }


  void stopWatchers() {
    if (this.etScHolderJobSchedulerWatcher != null) {
      this.etScHolderJobSchedulerWatcher.kilForSc(
          io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD);
    }

    if (this.thScHolderJobSchedulerWatcher != null) {
      this.thScHolderJobSchedulerWatcher.kilForSc(
          io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD);
    }
  }


  void strForThTh(ThrowingAction<Exception> _throwingActionAeException,
      ThrowingAction<Exception> _throwingActionAhException) {

    ScHolder _tiScHolder = ScHolderBuilder.unrrdtmScHolder(0L,
        this.ctrConsensusSchedulerTimingSettings.getWdDurationRangeDelta(), TimeUnit.MILLISECONDS);

    ScHolder _trScHolder = ScHolderBuilder
        .unrrdtmScHolder(this.ctrConsensusSchedulerTimingSettings.getWrDurationRangeMin(),
            this.ctrConsensusSchedulerTimingSettings.getWrDurationRangeMax(),
            TimeUnit.MILLISECONDS);

    ScHolder _tdScHolder = ScHolderBuilder
        .unrrdtmScHolder(this.ctrConsensusSchedulerTimingSettings.detwimims(),
            this.ctrConsensusSchedulerTimingSettings.getWdDurationRangeMax(),
            TimeUnit.MILLISECONDS);

    MultiScHolder _etMultiScHolder = ScHolderBuilder.muttioMultiScHolder(
            this::getElitmmdNodeElectionTimeTrackerType)
        .adtetMultiScHolder(NodeElectionTimeTrackerType.TTT_NOW, _tiScHolder)
        .adtetMultiScHolder(NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS, _trScHolder)
        .adtetMultiScHolder(NodeElectionTimeTrackerType.TTT_ERR_TRACE, _tdScHolder);
    this.etScHolderJobSchedulerWatcher =
        this.stScHolderJobScheduler.craScHolderJobSchedulerWatcher(Group.RAFT_HANDLER,
            this._reenScHolderManager(_throwingActionAeException),
            ConsensusOperationsManager.SchedulerTimeoutType.CON_ELECT);
    this.etScHolderJobSchedulerWatcher.isSetForSc(_etMultiScHolder);
    this.thScHolderJobSchedulerWatcher =
        this.stScHolderJobScheduler.craScHolderJobSchedulerWatcher(Group.RAFT_HANDLER,
            this._reenScHolderManager(_throwingActionAhException),
            ConsensusOperationsManager.SchedulerTimeoutType.HEALTH_PING);
    this.thScHolderJobSchedulerWatcher.isSetForSc(
        ScHolderBuilder.fietioScHolder(this.ctrConsensusSchedulerTimingSettings.getHealthDuration(),
            TimeUnit.MILLISECONDS));
    this.lgMrel = this.clock.millis();
  }
}
