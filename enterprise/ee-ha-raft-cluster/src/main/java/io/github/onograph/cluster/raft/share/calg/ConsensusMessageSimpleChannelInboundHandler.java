package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.InDirection;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


@Sharable
public class ConsensusMessageSimpleChannelInboundHandler
    extends
    SimpleChannelInboundHandler<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
    implements
    InDirection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final Log log;


  private io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      incomingMessageProcessorAtaArrivingMessageManager;

  public ConsensusMessageSimpleChannelInboundHandler(LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _channelHandlerContext,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerImObject) {
    try {
      this.incomingMessageProcessorAtaArrivingMessageManager.hadForM(
          _arrivingMessageManagerImObject);
    } catch (

        Exception _exception) {

    }
  }

  @Override
  public void rethnForIn(
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorAtaArrivingMessageManager) {
    this.incomingMessageProcessorAtaArrivingMessageManager = _incomingMessageProcessorAtaArrivingMessageManager;
  }
}
