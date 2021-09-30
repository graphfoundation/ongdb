package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import java.time.Clock;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class OutDirectionConsensusMessageImpl
    implements
    OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> {


  private final Clock clock;


  private final ConsensusMemberGroupId consensusMemberGroupId;


  private final io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      incomingMessageProcessorHmlArrivingMessageManager;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final OutDirection<SocketAddress, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>>
      outDirectionOtonsc;


  private final CoreClusterStructureService stcCoreClusterStructureService;


  private final InactiveNodeWatcher uamInactiveNodeWatcher;


  public OutDirectionConsensusMessageImpl(Clock _clock,
      ConsensusMemberGroupId consensusMemberGroupId,
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorHmlArrivingMessageManager,
      Lazy<ConsensusNodeId> _lazyMslConsensusNodeId, long _lgMtl, LogProvider _logProvider,
      OutDirection<SocketAddress, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>> _outDirectionOtonsc,
      CoreClusterStructureService _stcCoreClusterStructureService) {
    this.stcCoreClusterStructureService = _stcCoreClusterStructureService;
    this.outDirectionOtonsc = _outDirectionOtonsc;
    this.consensusMemberGroupId = consensusMemberGroupId;

    Log _log = _logProvider.getLog(this.getClass());
    this.uamInactiveNodeWatcher = new InactiveNodeWatcher(_clock, _lgMtl, _log);
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.clock = _clock;
    this.incomingMessageProcessorHmlArrivingMessageManager = _incomingMessageProcessorHmlArrivingMessageManager;
  }

  @Override
  public void senForMEME(boolean _isBok, ConsensusNodeId _tConsensusNodeId,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m) {
    if (_tConsensusNodeId.equals(this.lazyMslConsensusNodeId.get())) {
      this.incomingMessageProcessorHmlArrivingMessageManager.hadForM(
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
              this.clock.instant(), this.consensusMemberGroupId, m));
    } else {

      SocketAddress _arSocketAddress = this.stcCoreClusterStructureService.loprasSocketAddress(
          _tConsensusNodeId);
      if (_arSocketAddress != null) {
        this.outDirectionOtonsc.senForMEME(_isBok, _arSocketAddress,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager.ofConsensusMessageServiceMetaDepartingMessageManager(
                this.consensusMemberGroupId, m));
      } else {
        this.uamInactiveNodeWatcher.loattsdtmmwinkasForCo(_tConsensusNodeId);
      }
    }
  }
}
