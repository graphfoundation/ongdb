package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import java.net.InetSocketAddress;
import java.util.concurrent.RejectedExecutionException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ServerNettyChannelInitializer extends ChannelInitializer<SocketChannel> {


  private final CPFProComFamilyProvider<CPFConfigurator.CPFDirection.InProcessor> cPFProComFamilyProviderRipInProcessor;


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final HandshakeEventHandler handshakeEventHandler;


  private final Log log;


  private final ComProFamilyManagerAppImpl rpaComProFamilyManagerAppImpl;


  private final ComProFamilyManagerMutableImpl rpmComProFamilyManagerMutableImpl;

  public ServerNettyChannelInitializer(ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl,
      ComProFamilyManagerMutableImpl _mprComProFamilyManagerMutableImpl,
      CPFProComFamilyProvider<CPFConfigurator.CPFDirection.InProcessor> _cPFProComFamilyProviderRipInProcessor,
      PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider,
      HandshakeEventHandler _leHandshakeEventHandler) {
    this.log = _logProvider.getLog(this.getClass());
    this.rpaComProFamilyManagerAppImpl = _rpaComProFamilyManagerAppImpl;
    this.rpmComProFamilyManagerMutableImpl = _mprComProFamilyManagerMutableImpl;
    this.cPFProComFamilyProviderRipInProcessor = _cPFProComFamilyProviderRipInProcessor;
    this.fbpPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.handshakeEventHandler = _leHandshakeEventHandler;
  }


  private ServerHandshakeSimpleChannelInboundHandler _crehssrServerHandshakeSimpleChannelInboundHandler(
      SocketChannel _socketChannel) {

    ServerComProMessageProcessorHandshakeImpl _shServerComProMessageProcessorHandshakeImpl =
        new ServerComProMessageProcessorHandshakeImpl(
            new NettyChannelImpl(_socketChannel, this.log), this.rpaComProFamilyManagerAppImpl,
            this.rpmComProFamilyManagerMutableImpl);
    _shServerComProMessageProcessorHandshakeImpl.getCompletableFutureFspComProFamilyWrapper()
        .whenComplete((protocolStack, failure) ->
        {
          this._onhdeclForCoSoTh(failure,
              _socketChannel,
              protocolStack);
        });
    return new ServerHandshakeSimpleChannelInboundHandler(
        _shServerComProMessageProcessorHandshakeImpl);
  }


  private SocketAddress _germadsSocketAddress(SocketChannel _socketChannel) {

    InetSocketAddress _arInetSocketAddress = _socketChannel.remoteAddress();
    return _arInetSocketAddress == null ? null
        : new SocketAddress(_arInetSocketAddress.getHostString(), _arInetSocketAddress.getPort());
  }


  private void _onhdeclForCoSoTh(Throwable _fiueThrowable, SocketChannel _socketChannel,
      ComProFamilyWrapper _spComProFamilyWrapper) {
    if (_fiueThrowable != null) {

    } else {
      try {

        this.cPFProComFamilyProviderRipInProcessor.intlfCPFConfigurator(_spComProFamilyWrapper)
            .intlForCh(_socketChannel);
        this._retcaapolForSoCo(_socketChannel, _spComProFamilyWrapper);
      } catch (

          Throwable _throwable) {

      }
    }
  }


  private void _retcaapolForSoCo(SocketChannel _socketChannel,
      ComProFamilyWrapper _spComProFamilyWrapper) {

    SocketAddress _arSocketAddress = this._germadsSocketAddress(_socketChannel);
    if (_arSocketAddress != null) {

      ChannelPipeline _prnChannelPipeline = _socketChannel.parent().pipeline();
      _prnChannelPipeline.fireUserEventTriggered(
          new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started(
              _arSocketAddress,
              _spComProFamilyWrapper));
      _socketChannel.closeFuture().addListener((f) ->
      {
        try {
          _prnChannelPipeline.fireUserEventTriggered(
              new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished(
                  _arSocketAddress));
        } catch (

            RejectedExecutionException _rejectedExecutionException) {
        }
      });
    }
  }

  @Override
  public void initChannel(SocketChannel _socketChannel) {
    this.handshakeEventHandler.onnehaskForSo(_socketChannel);
    this.fbpPipelineBuilderManager.sevServerPipelineService(_socketChannel, this.log)
        .adfmg()
        .add(io.github.onograph.TokenConstants.HANDSHAKE_SERVER_ENCODER,
            new ChannelHandler[]{
                new ServerMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.HANDSHAKE_SERVER_DECODER,
            new ChannelHandler[]{new ServerByteToMessageDecoder()})
        .add(io.github.onograph.TokenConstants.HANDSHAKE_SERVER,
            new ChannelHandler[]{
                this._crehssrServerHandshakeSimpleChannelInboundHandler(_socketChannel)}).intl();
  }
}
