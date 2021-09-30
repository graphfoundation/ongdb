package io.github.onograph.cluster.raft.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;


public interface NettyChannelSetupManager {


  default ChannelInitializer<Channel> ascninlChannelInitializer() {
    return new ChannelInitializer<Channel>() {
      @Override
      protected void initChannel(Channel _channel) throws Exception {
        NettyChannelSetupManager.this.intcaeForCh(_channel);
      }
    };
  }


  void intcaeForCh(Channel _channel) throws Exception;
}
