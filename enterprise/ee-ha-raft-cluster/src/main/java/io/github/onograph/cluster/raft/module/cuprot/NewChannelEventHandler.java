package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.channel.Channel;


public interface NewChannelEventHandler {


  NewChannelEventHandler DEFAULT = (channel) ->
  {
  };


  void handleNewChannel(Channel _channel);
}
