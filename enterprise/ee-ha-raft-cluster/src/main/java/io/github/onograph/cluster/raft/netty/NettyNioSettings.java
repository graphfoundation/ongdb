package io.github.onograph.cluster.raft.netty;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.AbstractNioChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.concurrent.Executor;


public abstract class NettyNioSettings<CHANNEL extends AbstractNioChannel> implements
    NettyChannelClusterSettings<CHANNEL> {


  public static NettyNioSettings<NioSocketChannel> nicicoNettyNioSettings() {
    return new NettyNioSettings<NioSocketChannel>() {
      @Override
      public Class<NioSocketChannel> chnlcaClass() {
        return NioSocketChannel.class;
      }
    };
  }


  public static NettyNioSettings<NioServerSocketChannel> nrcoNettyNioSettings() {
    return new NettyNioSettings<NioServerSocketChannel>() {
      @Override
      public Class<NioServerSocketChannel> chnlcaClass() {
        return NioServerSocketChannel.class;
      }
    };
  }

  @Override
  public EventLoopGroup evnloguEventLoopGroup(Executor _executor) {
    return new NioEventLoopGroup(0, _executor);
  }
}
