package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import org.neo4j.monitoring.Monitors;


public class ConsensusIncomingMessageMonitoringProcessor
    implements
    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final Clock clock;


  private final FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      fLIncomingMessageProcessorDhArrivingMessageManager;


  private final ConsensusProcessingDurationWatcher rmdmConsensusProcessingDurationWatcher;


  public ConsensusIncomingMessageMonitoringProcessor(Clock _clock,
      FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _fLIncomingMessageProcessorHdArrivingMessageManager,
      Monitors _monitors) {
    this.fLIncomingMessageProcessorDhArrivingMessageManager = _fLIncomingMessageProcessorHdArrivingMessageManager;
    this.clock = _clock;
    this.rmdmConsensusProcessingDurationWatcher =
        (ConsensusProcessingDurationWatcher) _monitors.newMonitor(
            ConsensusProcessingDurationWatcher.class, new String[0]);
  }


  public static IncomingMessageProvider copaeIncomingMessageProvider(Clock _clock,
      Monitors _monitors) {
    return (delegate) ->
    {
      return new ConsensusIncomingMessageMonitoringProcessor(_clock, delegate, _monitors);
    };
  }


  private void _lodaForCoIn(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerMiObject,
      Instant _satInstant) {

    Duration _dlyDuration = Duration.between(_arrivingMessageManagerMiObject.getArInstant(),
        _satInstant);
    this.rmdmConsensusProcessingDurationWatcher.sedaForDu(_dlyDuration);
  }


  private void _tiehneForCoIn(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerImObject,
      Instant _satInstant) {

    boolean _isV = false;

    try {
      _isV = true;
      this.fLIncomingMessageProcessorDhArrivingMessageManager.hadForM(
          _arrivingMessageManagerImObject);
      _isV = false;
    } finally {
      if (_isV) {

        Duration _duration = Duration.between(_satInstant, this.clock.instant());
        this.rmdmConsensusProcessingDurationWatcher.upateForCoDu(_duration,
            _arrivingMessageManagerImObject.getM().getTNme());
      }
    }

    Duration _duration2 = Duration.between(_satInstant, this.clock.instant());
    this.rmdmConsensusProcessingDurationWatcher.upateForCoDu(_duration2,
        _arrivingMessageManagerImObject.getM().getTNme());
  }

  @Override
  public synchronized void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerMiObject) {

    Instant _satInstant = this.clock.instant();
    this._lodaForCoIn(_arrivingMessageManagerMiObject, _satInstant);
    this._tiehneForCoIn(_arrivingMessageManagerMiObject, _satInstant);
  }

  @Override
  public void startProcessor(ConsensusMemberGroupId consensusMemberGroupId) throws Exception {
    this.fLIncomingMessageProcessorDhArrivingMessageManager.startProcessor(consensusMemberGroupId);
  }

  @Override
  public void stopProcessor() throws Exception {
    this.fLIncomingMessageProcessorDhArrivingMessageManager.stopProcessor();
  }
}
