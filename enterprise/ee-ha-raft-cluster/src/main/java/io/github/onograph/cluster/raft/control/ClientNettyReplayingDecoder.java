package io.github.onograph.cluster.raft.control;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.ReplayingDecoder;
import java.util.List;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class ClientNettyReplayingDecoder extends ReplayingDecoder<Void> {


  static final String TITLE = io.github.onograph.TokenConstants.INIT_CLIENT_HANDLER;


  private final ChannelInitializer<?> channelInitializerIhObject;


  private final Log log;


  private final LogProvider logProvider;


  private final PipelineBuilderManager pbfPipelineBuilderManager;

  ClientNettyReplayingDecoder(ChannelInitializer<?> _channelInitializerIhObject,
      PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider) {
    this.channelInitializerIhObject = _channelInitializerIhObject;
    this.pbfPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.setSingleDecode(true);
  }

  @Override
  public void channelActive(ChannelHandlerContext _cChannelHandlerContext) {
    _cChannelHandlerContext.writeAndFlush(SanityCheckingUtilities.maivaebfByteBuf(),
        _cChannelHandlerContext.voidPromise());
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    String _strVmr = SanityCheckingUtilities.redmgvuString(_iByteBuf);
    if (SanityCheckingUtilities.isCrmavaForSt(_strVmr)) {

      this.pbfPipelineBuilderManager.cleClientPipelineService(_cChannelHandlerContext.channel(),
              this.logProvider.getLog(this.channelInitializerIhObject.getClass()))
          .adfmg()
          .add(io.github.onograph.TokenConstants.HANDSHAKE_INITIALIZER,
              new ChannelHandler[]{this.channelInitializerIhObject})
          .intl();
    } else {
      _cChannelHandlerContext.close();

      throw new DecoderException("*** Error: 7d114135-eca6-4e5f-9028-48dfa49826d0");
    }
  }
}
