package io.github.onograph.cluster.raft.akkamsg;

import java.util.function.Function;


@FunctionalInterface
public interface IncomingMessageProvider extends
    Function<FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>, FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>> {

  @Override
  FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> apply(
      FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _fLIncomingMessageProcessorVArrivingMessageManager);
}
