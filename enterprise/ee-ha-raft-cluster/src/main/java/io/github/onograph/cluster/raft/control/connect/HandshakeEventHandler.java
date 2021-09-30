package io.github.onograph.cluster.raft.control.connect;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;


public interface HandshakeEventHandler {


  HandshakeEventHandler NOO_HANDSHAKE_EVENT_HANDLER = new HandshakeEventHandler() {
    @Override
    public void onnehaskForSo(SocketChannel _socketChannel) {
    }

    @Override
    public void onnincnoForCh(Channel _channel) {
    }
  };


  void onnehaskForSo(SocketChannel _socketChannel);


  void onnincnoForCh(Channel _channel);
}
