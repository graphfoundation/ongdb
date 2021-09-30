package io.github.onograph.cluster.raft.netty;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import java.util.concurrent.Executor;


public abstract class NettyEpollSettings<CHANNEL extends Channel> implements
    NettyChannelClusterSettings<CHANNEL> {


  public static NettyEpollSettings<EpollSocketChannel> epctciNettyEpollSettings() {
    return new NettyEpollSettings<EpollSocketChannel>() {
      @Override
      public Class<EpollSocketChannel> chnlcaClass() {
        return EpollSocketChannel.class;
      }
    };
  }


  public static NettyEpollSettings<EpollServerSocketChannel> epsrciNettyEpollSettings() {
    return new NettyEpollSettings<EpollServerSocketChannel>() {
      @Override
      public Class<EpollServerSocketChannel> chnlcaClass() {
        return EpollServerSocketChannel.class;
      }
    };
  }

  @Override
  public EventLoopGroup evnloguEventLoopGroup(Executor _executor) {
    return new EpollEventLoopGroup(0, _executor);
  }
}
