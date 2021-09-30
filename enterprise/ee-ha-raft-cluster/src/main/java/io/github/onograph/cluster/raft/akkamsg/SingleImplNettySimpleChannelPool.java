package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.netty.FutureUtilities;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.pool.ChannelPoolHandler;
import io.netty.channel.pool.SimpleChannelPool;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;


public class SingleImplNettySimpleChannelPool extends SimpleChannelPool {


  private volatile Future<io.netty.channel.Channel> futureCfChannel;

  public SingleImplNettySimpleChannelPool(Bootstrap _bootstrap,
      ChannelPoolHandler _channelPoolHandler) {
    super(_bootstrap, _channelPoolHandler);
  }


  private static void _clsawtForFu(Future<io.netty.channel.Channel> _futureCfChannel) {
    if (_futureCfChannel != null) {
      _futureCfChannel.awaitUninterruptibly();

      io.netty.channel.Channel _channel = _futureCfChannel.getNow();
      if (_channel != null) {
        _channel.close().awaitUninterruptibly();
      }
    }
  }


  private synchronized Future<io.netty.channel.Channel> _acuesnFuture(
      Promise<io.netty.channel.Channel> _promisePoieChannel) {
    if (this.futureCfChannel == null) {
      return this.futureCfChannel = super.acquire(_promisePoieChannel);
    } else if (!this.futureCfChannel.isDone()) {
      return FutureUtilities.chiFuture(this.futureCfChannel, _promisePoieChannel);
    } else {

      io.netty.channel.Channel _channel = this.futureCfChannel.getNow();
      if (_channel != null && _channel.isActive()) {
        _promisePoieChannel.trySuccess(_channel);
        return _promisePoieChannel;
      } else {
        return this.futureCfChannel = super.acquire(_promisePoieChannel);
      }
    }
  }

  @Override
  public Future<io.netty.channel.Channel> acquire(
      Promise<io.netty.channel.Channel> _promisePoieChannel) {

    Future<io.netty.channel.Channel> _futureFcaChannel = this.futureCfChannel;
    if (_futureFcaChannel != null && _futureFcaChannel.isSuccess()) {

      io.netty.channel.Channel _channel = _futureFcaChannel.getNow();
      if (_channel != null && _channel.isActive()) {
        _promisePoieChannel.trySuccess(_channel);
        return _promisePoieChannel;
      }
    }

    return this._acuesnFuture(_promisePoieChannel);
  }

  @Override
  public void close() {
    super.close();
    _clsawtForFu(this.futureCfChannel);
  }

  @Override
  public Future<Void> release(io.netty.channel.Channel _channel, Promise<Void> _promisePoieVoid) {
    _promisePoieVoid.trySuccess(null);
    return _promisePoieVoid;
  }
}
