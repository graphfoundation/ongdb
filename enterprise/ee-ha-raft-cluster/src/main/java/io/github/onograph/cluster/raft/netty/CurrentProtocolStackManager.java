package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.Pair;


@Sharable
public class CurrentProtocolStackManager extends ChannelInboundHandlerAdapter {


  private final ConcurrentMap<SocketAddress, ComProFamilyWrapper> concurrentMapIpsc = new ConcurrentHashMap();


  public Stream<Pair<SocketAddress, ComProFamilyWrapper>> inlproStream() {
    return this.concurrentMapIpsc.entrySet().stream().map((entry) ->
    {
      return Pair.of(entry.getKey(), entry.getValue());
    });
  }

  @Override
  public void userEventTriggered(ChannelHandlerContext _cChannelHandlerContext, Object _obE)
      throws Exception {
    if (_obE instanceof io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started) {

      io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started _cetdStarted =
          (io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started) _obE;
      this.concurrentMapIpsc.put(_cetdStarted.adeidSocketAddress,
          _cetdStarted.prtostkComProFamilyWrapper);
    } else if (_obE instanceof io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished) {

      io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished _coeFinished =
          (io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished) _obE;
      this.concurrentMapIpsc.remove(_coeFinished.adeidSocketAddress);
    } else {
      super.userEventTriggered(_cChannelHandlerContext, _obE);
    }
  }
}
