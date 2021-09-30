package io.github.onograph.cluster.raft.control.connect;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class HandshakeLogger implements HandshakeEventHandler {


  private final Log log;


  private volatile boolean isLs;

  public HandshakeLogger(LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
  }


  public void loggeae(boolean _isLs) {
    this.isLs = _isLs;
  }

  @Override
  public void onnehaskForSo(SocketChannel _socketChannel) {
    if (this.isLs) {

    }
  }

  @Override
  public void onnincnoForCh(Channel _channel) {
    if (this.isLs) {

    }
  }
}
