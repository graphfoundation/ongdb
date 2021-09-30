package io.github.onograph.cluster.raft.akkamsg;

import java.util.concurrent.Future;
import org.neo4j.logging.Log;


public class NettyChannelImpl implements NettyChannel {


  private final io.netty.channel.Channel channel;


  private final Log log;


  private volatile boolean isDsoe;

  public NettyChannelImpl(io.netty.channel.Channel _channel, Log _log) {
    this.channel = _channel;
    this.log = _log;
  }


  private void _chcdiod() {
    if (this.isDsoe) {

      throw new IllegalStateException("*** Error:  613f749d-1644-402f-b494-2d057f8d36a8");
    }
  }

  @Override
  public synchronized void dipe() {

    this.isDsoe = true;
    this.channel.close();
  }

  @Override
  public boolean isChannelDis() {
    return this.isDsoe;
  }

  @Override
  public boolean isChannelOpen() {
    return this.channel.isOpen();
  }

  @Override
  public Future<Void> wrtFuture(Object m) {
    this._chcdiod();
    return this.channel.write(m);
  }

  @Override
  public Future<Void> wrtanflhFuture(Object m) {
    this._chcdiod();
    return this.channel.writeAndFlush(m);
  }
}
