package io.github.onograph.cluster.raft.control;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.ReplayingDecoder;
import java.util.List;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class ServerNettyReplayingDecoder extends ReplayingDecoder<Void> {


  static final String TITLE = io.github.onograph.TokenConstants.INIT_SERVER_HANDLER;


  private final ChannelInitializer<?> channelInitializerIhObject;


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final Log log;


  private final LogProvider logProvider;

  ServerNettyReplayingDecoder(ChannelInitializer<?> _channelInitializerIhObject,
      PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider) {
    this.channelInitializerIhObject = _channelInitializerIhObject;
    this.fbpPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    String _strVmr = SanityCheckingUtilities.redmgvuString(_iByteBuf);
    if (SanityCheckingUtilities.isCrmavaForSt(_strVmr)) {

      Channel _channel = _cChannelHandlerContext.channel();

      _channel.writeAndFlush(SanityCheckingUtilities.maivaebfByteBuf(), _channel.voidPromise());
      this.fbpPipelineBuilderManager.sevServerPipelineService(_channel,
              this.logProvider.getLog(this.channelInitializerIhObject.getClass()))
          .adfmg()
          .add(io.github.onograph.TokenConstants.HANDSHAKE_INITIALIZER,
              new ChannelHandler[]{this.channelInitializerIhObject})
          .intl();
    } else {
      _cChannelHandlerContext.close();

      throw new DecoderException("*** Error: 99d3d06e-6b1b-491c-8e00-e66dfb3013fc");
    }
  }
}
