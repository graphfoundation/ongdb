package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.share.NodeServerInfoLogService;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.util.concurrent.Future;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;


public class ClusterAdapter extends LifecycleAdapter {


  private final ByteBufAllocator acByteBufAllocator;


  private final ConnectorPortRegister connectorPortRegister;


  private final Log dbgLog;


  private final Executor executor;


  private final ChannelInboundHandler hpChannelInboundHandler;


  private final NettyChannelSetupManager icNettyChannelSetupManager;


  private final NettyChannelClusterSettings<? extends ServerSocketChannel> nettyChannelClusterSettingsCbServerSocketChannel;


  private final NodeServerInfoLogService snsNodeServerInfoLogService;


  private final Log uLog;


  private Channel channel;


  private EventLoopGroup gwEventLoopGroup;


  private SocketAddress laSocketAddress;


  public ClusterAdapter(ByteBufAllocator _acByteBufAllocator, SocketAddress _alSocketAddress,
      ConnectorPortRegister _connectorPortRegister, Executor _executor,
      ChannelInboundHandler _hpChannelInboundHandler,
      NettyChannelSetupManager _icNettyChannelSetupManager,
      NettyChannelClusterSettings<? extends ServerSocketChannel> _nettyChannelClusterSettingsCbServerSocketChannel,
      NodeServerInfoLogService _snsNodeServerInfoLogService) {
    this.icNettyChannelSetupManager = _icNettyChannelSetupManager;
    this.hpChannelInboundHandler = _hpChannelInboundHandler;
    this.snsNodeServerInfoLogService = _snsNodeServerInfoLogService;
    this.laSocketAddress = _alSocketAddress;
    this.dbgLog = _snsNodeServerInfoLogService.getInternalLogProvider().getLog(this.getClass());
    this.uLog = _snsNodeServerInfoLogService.getUserLogProvider().getLog(this.getClass());
    this.executor = _executor;
    this.connectorPortRegister = _connectorPortRegister;
    this.nettyChannelClusterSettingsCbServerSocketChannel = _nettyChannelClusterSettingsCbServerSocketChannel;
    this.acByteBufAllocator = _acByteBufAllocator;
  }


  private SocketAddress _acllearSocketAddress(Channel _channel) {

    java.net.SocketAddress _socketAddress = _channel.localAddress();
    if (_socketAddress instanceof InetSocketAddress) {

      InetSocketAddress _aiInetSocketAddress = (InetSocketAddress) _socketAddress;
      return new SocketAddress(_aiInetSocketAddress.getHostString(),
          _aiInetSocketAddress.getPort());
    } else {
      return this.laSocketAddress;
    }
  }


  private void _deilnae() {
    this.connectorPortRegister.deregister(this.snsNodeServerInfoLogService.getStrNs());
  }


  private void _retlsads() {
    this.connectorPortRegister.register(this.snsNodeServerInfoLogService.getStrNs(),
        this.laSocketAddress);
  }


  public SocketAddress getLaSocketAddress() {
    return this.laSocketAddress;
  }


  public String name() {
    return this.snsNodeServerInfoLogService.getStrNs();
  }

  @Override
  public void start() {
    if (this.channel == null) {
      this.gwEventLoopGroup = this.nettyChannelClusterSettingsCbServerSocketChannel.evnloguEventLoopGroup(
          this.executor);

      ServerBootstrap _serverBootstrap =
          (new ServerBootstrap()).group(this.gwEventLoopGroup).channel(
                  this.nettyChannelClusterSettingsCbServerSocketChannel.chnlcaClass())
              .option(ChannelOption.SO_REUSEADDR, Boolean.TRUE)
              .option(ChannelOption.ALLOCATOR, this.acByteBufAllocator)
              .childOption(ChannelOption.ALLOCATOR, this.acByteBufAllocator)
              .localAddress(this.laSocketAddress.socketAddress())
              .childHandler(this.icNettyChannelSetupManager.ascninlChannelInitializer());
      if (this.hpChannelInboundHandler != null) {
        _serverBootstrap.handler(this.hpChannelInboundHandler);
      }

      try {
        this.channel = _serverBootstrap.bind().syncUninterruptibly().channel();
        this.laSocketAddress = this._acllearSocketAddress(this.channel);
        this._retlsads();


      } catch (

          Exception _exception) {

        this.gwEventLoopGroup.shutdownGracefully();
        throw _exception;
      }
    }
  }

  @Override
  public void stop() {
    if (this.channel != null) {

      try {
        this._deilnae();
        this.channel.close().sync();
        this.channel = null;
      } catch (

          InterruptedException _interruptedException) {
        Thread.currentThread().interrupt();


      }

      if (this.gwEventLoopGroup != null) {

        Future<?> _futureSfObject = this.gwEventLoopGroup.shutdownGracefully(100L, 5000L,
            TimeUnit.MILLISECONDS);
        if (!_futureSfObject.awaitUninterruptibly(15000L, TimeUnit.MILLISECONDS)) {

        }
      }

      this.gwEventLoopGroup = null;
    }
  }

  @Override
  public String toString() {
    return String.format("Server[%s]", this.snsNodeServerInfoLogService.getStrNs());
  }
}
