package io.github.onograph.cluster.raft.control;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import javax.net.ssl.SSLException;
import org.neo4j.logging.Log;
import org.neo4j.ssl.SslPolicy;


public class ClientPipelineService extends
    AbstractNettyChannelPipelineService<CPFConfigurator.CPFDirection.OutProcessor, ClientPipelineService> {


  private static final int LEG_PROP_BTXS = 4;


  ClientPipelineService(ChannelPipeline _channelPipeline, Log _log, SslPolicy _sslPolicy) {
    super(_channelPipeline, _log, _sslPolicy);
  }

  @Override
  public ClientPipelineService adfmg() {
    this.add(io.github.onograph.TokenConstants.FRAME_ENCODER, new LengthFieldPrepender(4));
    this.add(io.github.onograph.TokenConstants.FRAME_DECODER,
        new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
    return this;
  }

  @Override
  ChannelHandler cresharChannelHandler(Channel _channel, SslPolicy _sslPolicy)
      throws SSLException {
    return _sslPolicy.nettyClientHandler(_channel);
  }
}
