package io.github.onograph.cluster.raft.netty;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.kqueue.KQueueEventLoopGroup;
import io.netty.channel.kqueue.KQueueServerSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import java.util.concurrent.Executor;


public abstract class NettyKQueueSettings<CHANNEL extends Channel> implements
    NettyChannelClusterSettings<CHANNEL> {


  public static NettyKQueueSettings<KQueueSocketChannel> kqecncfNettyKQueueSettings() {
    return new NettyKQueueSettings<KQueueSocketChannel>() {
      @Override
      public Class<KQueueSocketChannel> chnlcaClass() {
        return KQueueSocketChannel.class;
      }
    };
  }


  public static NettyKQueueSettings<KQueueServerSocketChannel> kqesecfNettyKQueueSettings() {
    return new NettyKQueueSettings<KQueueServerSocketChannel>() {
      @Override
      public Class<KQueueServerSocketChannel> chnlcaClass() {
        return KQueueServerSocketChannel.class;
      }
    };
  }

  @Override
  public EventLoopGroup evnloguEventLoopGroup(Executor _executor) {
    return new KQueueEventLoopGroup(0, _executor);
  }
}
