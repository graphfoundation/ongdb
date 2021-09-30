package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class EnterpriseClusterIncomingMessageProcessor
    implements
    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      fLIncomingMessageProcessorHdArrivingMessageManager;


  private final Log log;


  private final ConsensusIncomingMessageManager rmdConsensusIncomingMessageManager;


  private AtomicReference<ConsensusMemberGroupId> atomicReferenceIgrbConsensusMemberGroupId = new AtomicReference();

  public EnterpriseClusterIncomingMessageProcessor(
      ConsensusIncomingMessageManager _dmrConsensusIncomingMessageManager,
      FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _fLIncomingMessageProcessorHdArrivingMessageManager,
      LogProvider _logProvider) {
    this.fLIncomingMessageProcessorHdArrivingMessageManager = _fLIncomingMessageProcessorHdArrivingMessageManager;
    this.rmdConsensusIncomingMessageManager = _dmrConsensusIncomingMessageManager;
    this.log = _logProvider.getLog(this.getClass());
  }


  public static IncomingMessageProvider copaeIncomingMessageProvider(
      ConsensusIncomingMessageManager _dmrConsensusIncomingMessageManager,
      LogProvider _logProvider) {
    return (delegate) ->
    {
      return new EnterpriseClusterIncomingMessageProcessor(_dmrConsensusIncomingMessageManager,
          delegate, _logProvider);
    };
  }

  @Override
  public void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> m) {

    ConsensusMemberGroupId consensusMemberGroupId = (ConsensusMemberGroupId) this.atomicReferenceIgrbConsensusMemberGroupId.get();
    if (Objects.isNull(consensusMemberGroupId)) {

    } else if (!Objects.equals(consensusMemberGroupId, m.getConsensusMemberGroupId())) {

    } else {
      this.fLIncomingMessageProcessorHdArrivingMessageManager.hadForM(m);
    }
  }

  @Override
  public void startProcessor(ConsensusMemberGroupId consensusMemberGroupId) throws Exception {

    boolean _isSw = this.atomicReferenceIgrbConsensusMemberGroupId.compareAndSet(null,
        consensusMemberGroupId);
    this.fLIncomingMessageProcessorHdArrivingMessageManager.startProcessor(consensusMemberGroupId);
    if (_isSw) {
      this.rmdConsensusIncomingMessageManager.rethncForCoIn(consensusMemberGroupId, this);
    }
  }

  @Override
  public void stopProcessor() throws Exception {
    try {

      ConsensusMemberGroupId consensusMemberGroupId = (ConsensusMemberGroupId) this.atomicReferenceIgrbConsensusMemberGroupId.getAndSet(
          null);
      if (consensusMemberGroupId != null) {
        this.rmdConsensusIncomingMessageManager.deiheciForCo(consensusMemberGroupId);
      }
    } finally {
      this.fLIncomingMessageProcessorHdArrivingMessageManager.stopProcessor();
    }
  }
}
