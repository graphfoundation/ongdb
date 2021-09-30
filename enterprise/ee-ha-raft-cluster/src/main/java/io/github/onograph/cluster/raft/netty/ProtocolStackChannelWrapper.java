package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.netty.channel.Channel;
import io.netty.channel.pool.ChannelPool;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;


public class ProtocolStackChannelWrapper {


  private final Channel channel;


  private final ChannelPool plNm;


  private final ComProFamilyWrapper spComProFamilyWrapper;

  ProtocolStackChannelWrapper(Channel _channel, ChannelPool plNm,
      ComProFamilyWrapper _spComProFamilyWrapper) {
    this.channel = _channel;
    this.plNm = plNm;
    this.spComProFamilyWrapper = _spComProFamilyWrapper;
  }


  public Future<Void> dipeFuture() {
    this.channel.close();
    return this.plNm.release(this.channel);
  }


  public <ATTR> ATTR gearu(AttributeKey<ATTR> k) {
    return this.channel.attr(k).get();
  }


  public Channel getChannel() {
    return this.channel;
  }


  public ComProFamilyWrapper getSpComProFamilyWrapper() {
    return this.spComProFamilyWrapper;
  }


  public Future<Void> reeeFuture() {
    return this.plNm.release(this.channel);
  }
}
