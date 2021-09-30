package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.channel.Channel;


public class CatchupReplyChannelManager {


  private final Channel channel;

  public CatchupReplyChannelManager(Channel _channel) {
    this.channel = _channel;
  }


  public void closeChannel() {
    this.channel.config().setAutoRead(false);
  }


  public void openChannel() {
    this.channel.config().setAutoRead(true);
  }
}
