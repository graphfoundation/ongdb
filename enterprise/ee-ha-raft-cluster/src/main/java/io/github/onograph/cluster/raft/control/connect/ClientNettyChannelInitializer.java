package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ClientNettyChannelInitializer extends ChannelInitializer<SocketChannel> {


  private final CPFProComFamilyProvider<CPFConfigurator.CPFDirection.OutProcessor> cPFProComFamilyProviderIpOutProcessor;


  private final Log dbgLog;


  private final TimeoutStrategy dhTimeoutStrategy;


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final ComProFamilyManagerAppImpl rpaComProFamilyManagerAppImpl;


  private final ComProFamilyManagerMutableImpl rpmComProFamilyManagerMutableImpl;


  private final Duration tmotDuration;


  private final Log usLog;

  public ClientNettyChannelInitializer(ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl,
      ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl,
      CPFProComFamilyProvider<CPFConfigurator.CPFDirection.OutProcessor> _cPFProComFamilyProviderRipOutProcessor,
      PipelineBuilderManager _pbfPipelineBuilderManager, Duration _thDuration,
      LogProvider _dbgLogProvider, LogProvider _usLogProvider) {
    this.dbgLog = _dbgLogProvider.getLog(this.getClass());
    this.usLog = _usLogProvider.getLog(this.getClass());
    this.rpaComProFamilyManagerAppImpl = _rpaComProFamilyManagerAppImpl;
    this.rpmComProFamilyManagerMutableImpl = _rpmComProFamilyManagerMutableImpl;
    this.tmotDuration = _thDuration;
    this.cPFProComFamilyProviderIpOutProcessor = _cPFProComFamilyProviderRipOutProcessor;
    this.fbpPipelineBuilderManager = _pbfPipelineBuilderManager;
    this.dhTimeoutStrategy = DefaultTimeoutStrategy.exponential(1L, 2000L, TimeUnit.MILLISECONDS);
  }


  private static HandshakeClientMessageProcessorDefaultImpl _nehnkceHandshakeClientMessageProcessorDefaultImpl(
      Channel _channel) {

    CompletableFuture<ComProFamilyWrapper> _completableFutureFpComProFamilyWrapper =
        _channel.attr(ProComAttributeKey.ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE).get();
    if (_completableFutureFpComProFamilyWrapper == null) {

      throw new IllegalStateException("*** Error: 6a3a5949-8ef9-4660-a026-bc8760c233c7");
    } else {
      return new HandshakeClientMessageProcessorDefaultImpl(
          _completableFutureFpComProFamilyWrapper);
    }
  }


  private void _inahnkForChHa(Channel _channel,
      HandshakeClientMessageProcessorDefaultImpl _handshakeClientMessageProcessorDefaultImpl) {

    NettyChannelImpl _wcNettyChannelImpl = new NettyChannelImpl(_channel, this.dbgLog);
    _handshakeClientMessageProcessorDefaultImpl.inttForNeCoCo(_wcNettyChannelImpl,
        this.rpaComProFamilyManagerAppImpl,
        this.rpmComProFamilyManagerMutableImpl);
    _handshakeClientMessageProcessorDefaultImpl.getCompletableFuturePfComProFamilyWrapper()
        .whenComplete((protocolStack, failure) ->
        {
          this._onhdeclForCoChTh(_channel, failure,
              protocolStack);
        });
  }


  private void _inlhdForChHa(Channel _channel,
      HandshakeClientMessageProcessorDefaultImpl _handshakeClientMessageProcessorDefaultImpl)
      throws Exception {
    this.fbpPipelineBuilderManager
        .cleClientPipelineService(_channel, this.dbgLog).adfmg()
        .add(io.github.onograph.TokenConstants.HANDSHAKE_CLIENT_ENCODER,
            new ChannelHandler[]{new ClientMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.HANDSHAKE_CLIENT_DECODER,
            new ChannelHandler[]{new ClientByteToMessageDecoder()})
        .add(io.github.onograph.TokenConstants.HANDSHAKE_CLIENT,
            new ChannelHandler[]{new ClientHandshakeSimpleChannelInboundHandler(
                _handshakeClientMessageProcessorDefaultImpl)}).adge((msg) ->
        {
          return !(msg instanceof HandshakeMessageService);
        }).intl();
  }


  private void _onhdeclForCoChTh(Channel _channel, Throwable _fiueThrowable,
      ComProFamilyWrapper _spComProFamilyWrapper) {
    if (_fiueThrowable != null) {

      _channel.pipeline().fireUserEventTriggered(
          MessageChannelDuplexHandlerAction.gefleMessageChannelDuplexHandlerAction());
      _channel.close();
    } else {
      try {
        this._usrlgForCoCh(_channel, _spComProFamilyWrapper);

        this.cPFProComFamilyProviderIpOutProcessor.intlfCPFConfigurator(_spComProFamilyWrapper)
            .intlForCh(_channel);
        _channel.pipeline().fireUserEventTriggered(
            MessageChannelDuplexHandlerAction.gescsMessageChannelDuplexHandlerAction());
        _channel.flush();
      } catch (

          Exception _exception) {

        _channel.close();
      }
    }
  }


  private void _scuhnkForSoHaTi(Timeout _dhTimeout,
      HandshakeClientMessageProcessorDefaultImpl _handshakeClientMessageProcessorDefaultImpl,
      SocketChannel _socketChannel) {
    _socketChannel.eventLoop().schedule(() ->
    {
      if (_socketChannel.isActive()) {
        this._inahnkForChHa(_socketChannel, _handshakeClientMessageProcessorDefaultImpl);
      } else if (_socketChannel.isOpen()) {
        _dhTimeout.increment();
        this._scuhnkForSoHaTi(_dhTimeout, _handshakeClientMessageProcessorDefaultImpl,
            _socketChannel);
      }
    }, _dhTimeout.getMillis(), TimeUnit.MILLISECONDS);
  }


  private void _scutmForSoHa(
      HandshakeClientMessageProcessorDefaultImpl _handshakeClientMessageProcessorDefaultImpl,
      SocketChannel _socketChannel) {
    _socketChannel.eventLoop().schedule(() ->
    {
      _handshakeClientMessageProcessorDefaultImpl.getCompletableFuturePfComProFamilyWrapper()
          .completeExceptionally(new TimeoutException(
              "*** Error: c79ef820-6ad0-441b-a4da-99c6423b224a"));
    }, this.tmotDuration.toMillis(), TimeUnit.MILLISECONDS);
  }


  private void _usrlgForCoCh(Channel _channel, ComProFamilyWrapper _psComProFamilyWrapper) {

    this.usLog.info(String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.control.connect.ClientNettyChannelInitializer.format"),
        _psComProFamilyWrapper, _channel.remoteAddress()));
    _channel.closeFuture().addListener((f) ->
    {

      this.usLog.info(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.control.connect.ClientNettyChannelInitializer.format2"),
          _psComProFamilyWrapper, _channel.remoteAddress()));
    });
  }

  @Override
  protected void initChannel(SocketChannel _socketChannel) {

    HandshakeClientMessageProcessorDefaultImpl _handshakeClientMessageProcessorDefaultImpl =
        _nehnkceHandshakeClientMessageProcessorDefaultImpl(_socketChannel);

    try {
      this._inlhdForChHa(_socketChannel, _handshakeClientMessageProcessorDefaultImpl);
    } catch (

        Exception _exception) {
      _handshakeClientMessageProcessorDefaultImpl.getCompletableFuturePfComProFamilyWrapper()
          .completeExceptionally(_exception);
    }

    this._scuhnkForSoHaTi(this.dhTimeoutStrategy.newTimeout(),
        _handshakeClientMessageProcessorDefaultImpl, _socketChannel);
    this._scutmForSoHa(_handshakeClientMessageProcessorDefaultImpl, _socketChannel);
  }
}
