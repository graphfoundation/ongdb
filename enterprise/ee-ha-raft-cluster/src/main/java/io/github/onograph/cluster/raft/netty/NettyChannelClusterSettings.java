package io.github.onograph.cluster.raft.netty;

import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.kqueue.KQueue;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import java.util.concurrent.Executor;
import org.neo4j.configuration.Config;


public interface NettyChannelClusterSettings<TYPE extends Channel> {


  static NettyChannelClusterSettings<? extends SocketChannel> clecfNettyChannelClusterSettings(
      Config _config) {
    if (isPrfniForCo(_config)) {
      if (Epoll.isAvailable()) {
        return NettyEpollSettings.epctciNettyEpollSettings();
      }

      if (KQueue.isAvailable()) {
        return NettyKQueueSettings.kqecncfNettyKQueueSettings();
      }
    }

    return NettyNioSettings.nicicoNettyNioSettings();
  }


  static boolean isPrfniForCo(Config _config) {
    return _config.get(SettingsDeclarationClusterSystemImpl.settingUstroBoolean);
  }


  static NettyChannelClusterSettings<? extends ServerSocketChannel> sevcfNettyChannelClusterSettings(
      Config _config) {
    if (isPrfniForCo(_config)) {
      if (Epoll.isAvailable()) {
        return NettyEpollSettings.epsrciNettyEpollSettings();
      }

      if (KQueue.isAvailable()) {
        return NettyKQueueSettings.kqesecfNettyKQueueSettings();
      }
    }

    return NettyNioSettings.nrcoNettyNioSettings();
  }


  Class<TYPE> chnlcaClass();


  EventLoopGroup evnloguEventLoopGroup(Executor _executor);
}
