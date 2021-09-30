package io.github.onograph.cluster.raft.share.calg;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;


public class ConsensusMessageToMessageEncoder
    extends
    MessageToMessageEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>> {


  private final ConsensusMessageServiceMeta.Processor<Boolean, ?> isSupportedProcessor;

  public ConsensusMessageToMessageEncoder(
      ConsensusMessageServiceMeta.Processor<Boolean, ?> isSupportedProcessor) {
    this.isSupportedProcessor = isSupportedProcessor;
  }

  @Override
  protected void encode(ChannelHandlerContext _channelHandlerContext,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> _departingMessageManagerOtonObject,
      List<Object> _listLiObject)
      throws Exception {

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m = _departingMessageManagerOtonObject.getM();
    if (m.dipc(this.isSupportedProcessor)) {
      _listLiObject.add(_departingMessageManagerOtonObject);
    }
  }
}
