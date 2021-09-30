package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.control.NettyChannelInitializerClientImpl;
import io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl;
import io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.netty.NettyChannelPoolLifecycleAdapter;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.pool.AbstractChannelPoolHandler;
import io.netty.channel.socket.SocketChannel;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class ConsensusNettyChannelPoolLifecycleAdapter extends
    NettyChannelPoolLifecycleAdapter<LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO> {

  public ConsensusNettyChannelPoolLifecycleAdapter(ByteBufAllocator _acByteBufAllocator, int _iCm,
      JobScheduler _jobScheduler, LogProvider _logProvider,
      NettyChannelClusterSettings<? extends SocketChannel> _nettyChannelClusterSettingsCbSocketChannel,
      NettyChannelInitializerClientImpl _nettyChannelInitializerClientImpl) {
    super(_acByteBufAllocator,
        new io.github.onograph.cluster.raft.akkamsg.ConsensusNettyChannelPoolLifecycleAdapter.NettyChannelPoolHandlerImpl(
            _logProvider.getLog(ConsensusNettyChannelPoolLifecycleAdapter.class),
            _nettyChannelInitializerClientImpl),
        SingleImplNettySimpleChannelPool::new,
        LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO::unostaeInetSocketAddress,
        Group.RAFT_CLIENT, _jobScheduler, _nettyChannelClusterSettingsCbSocketChannel,
        _crepmfcDefaultNettyChannelPoolMapImplNettyPoolGenerator(_iCm));
  }


  private static DefaultNettyChannelPoolMapImpl.NettyPoolGenerator<LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO> _crepmfcDefaultNettyChannelPoolMapImplNettyPoolGenerator(
      int _iCm) {
    return (baseBootstrap, poolHandler, poolFactory, keyToInetAddress) ->
    {
      return new LBNettyChannelPoolMapImpl(baseBootstrap, poolHandler, poolFactory, _iCm);
    };
  }


  private static class NettyChannelPoolHandlerImpl extends AbstractChannelPoolHandler {


    private final Log log;


    private final NettyChannelInitializerClientImpl nettyChannelInitializerClientImpl;

    NettyChannelPoolHandlerImpl(Log _log,
        NettyChannelInitializerClientImpl _nettyChannelInitializerClientImpl) {
      this.log = _log;
      this.nettyChannelInitializerClientImpl = _nettyChannelInitializerClientImpl;
    }

    @Override
    public void channelCreated(io.netty.channel.Channel _channel) {

      _channel.pipeline().addLast(this.nettyChannelInitializerClientImpl);
    }
  }
}
