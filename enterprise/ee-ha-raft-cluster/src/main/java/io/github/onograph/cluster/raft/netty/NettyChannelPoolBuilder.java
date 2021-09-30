package io.github.onograph.cluster.raft.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.pool.ChannelPool;
import io.netty.channel.pool.ChannelPoolHandler;


public interface NettyChannelPoolBuilder {


  ChannelPool craChannelPool(Bootstrap _bootstrap, ChannelPoolHandler _channelPoolHandler);
}
