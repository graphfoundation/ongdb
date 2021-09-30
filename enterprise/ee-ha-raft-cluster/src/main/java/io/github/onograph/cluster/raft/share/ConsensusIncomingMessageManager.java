package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.time.Clock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.CappedLogger;


public class ConsensusIncomingMessageManager implements
    io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final CappedLogger cappedLogger;


  private final Map<ConsensusMemberGroupId, io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>>
      mapIbhci = new ConcurrentHashMap();


  ConsensusIncomingMessageManager(Clock _clock, LogProvider _logProvider) {
    this.cappedLogger = this._crecelgCappedLogger(_clock, _logProvider);
  }


  private CappedLogger _crecelgCappedLogger(Clock _clock, LogProvider _logProvider) {
    return new CappedLogger(_logProvider.getLog(this.getClass()), 5L, TimeUnit.SECONDS, _clock);
  }


  void deiheciForCo(ConsensusMemberGroupId _consensusMemberGroupId) {
    this.mapIbhci.remove(_consensusMemberGroupId);
  }

  @Override
  public void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> m) {

    ConsensusMemberGroupId _consensusMemberGroupId = m.getConsensusMemberGroupId();

    io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
        _incomingMessageProcessorHeaArrivingMessageManager = this.mapIbhci.get(
        _consensusMemberGroupId);
    if (_incomingMessageProcessorHeaArrivingMessageManager == null) {

    } else {
      _incomingMessageProcessorHeaArrivingMessageManager.hadForM(m);
    }
  }


  void rethncForCoIn(ConsensusMemberGroupId _consensusMemberGroupId,
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorHeaArrivingMessageManager) {

    io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
        _incomingMessageProcessorHeArrivingMessageManager =
        this.mapIbhci.putIfAbsent(_consensusMemberGroupId,
            _incomingMessageProcessorHeaArrivingMessageManager);
    if (_incomingMessageProcessorHeArrivingMessageManager != null) {

      throw new IllegalArgumentException("*** Error: c0c87f6d-a1f9-42f6-93b1-8aba286ca0f4");
    }
  }
}
