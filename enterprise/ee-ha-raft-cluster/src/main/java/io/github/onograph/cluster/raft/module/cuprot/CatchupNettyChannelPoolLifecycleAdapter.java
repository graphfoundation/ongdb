package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.control.NettyChannelInitializerClientImpl;
import io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.netty.NettyChannelPoolLifecycleAdapter;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.pool.AbstractChannelPoolHandler;
import io.netty.channel.pool.SimpleChannelPool;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.AttributeKey;
import java.time.Clock;
import java.util.function.Function;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


class CatchupNettyChannelPoolLifecycleAdapter extends
    NettyChannelPoolLifecycleAdapter<SocketAddress> {


  static final AttributeKey<TrackingAnswerLimitHandler> TRCN_REPS_EVXHDLR =
      AttributeKey.valueOf(io.github.onograph.TokenConstants.TRACKING_RESPONSE_HANDLER);


  CatchupNettyChannelPoolLifecycleAdapter(ByteBufAllocator _caByteBufAllocator, Clock _clock,
      Function<CatchupAnswerLimitHandler, NettyChannelInitializerClientImpl> _functionIfcn,
      JobScheduler _jobScheduler,
      NettyChannelClusterSettings<? extends SocketChannel> _nettyChannelClusterSettingsCbSocketChannel,
      NewChannelEventHandler newChannelEventHandler) {
    super(_caByteBufAllocator,
        new io.github.onograph.cluster.raft.module.cuprot.CatchupNettyChannelPoolLifecycleAdapter.ChannelPoolHandlerImpl(
            _clock, _functionIfcn,
            newChannelEventHandler),
        SimpleChannelPool::new,
        FUNCTION_SOKTNSI, Group.CATCHUP_CLIENT,
        _jobScheduler, _nettyChannelClusterSettingsCbSocketChannel,
        DefaultNettyChannelPoolMapImpl::new);
  }


  private static class ChannelPoolHandlerImpl extends AbstractChannelPoolHandler {


    private final Clock clock;


    private final Function<CatchupAnswerLimitHandler, NettyChannelInitializerClientImpl> functionFicn;


    private final NewChannelEventHandler newChannelEventHandler;


    ChannelPoolHandlerImpl(Clock _clock,
        Function<CatchupAnswerLimitHandler, NettyChannelInitializerClientImpl> _functionFicn,
        NewChannelEventHandler newChannelEventHandler) {
      this.clock = _clock;
      this.functionFicn = _functionFicn;
      this.newChannelEventHandler = newChannelEventHandler;
    }

    @Override
    public void channelCreated(Channel _channel) {

      TrackingAnswerLimitHandler _trhTrackingAnswerLimitHandler = new TrackingAnswerLimitHandler(
          this.clock, _channel);
      _channel.pipeline().addLast(this.functionFicn.apply(_trhTrackingAnswerLimitHandler));
      _channel.attr(CatchupNettyChannelPoolLifecycleAdapter.TRCN_REPS_EVXHDLR)
          .set(_trhTrackingAnswerLimitHandler);
      _channel.closeFuture().addListener((f) ->
      {
        _trhTrackingAnswerLimitHandler.oncle();
      });
      this.newChannelEventHandler.handleNewChannel(_channel);
    }

    @Override
    public void channelReleased(Channel _channel) {
      _channel.attr(CatchupNettyChannelPoolLifecycleAdapter.TRCN_REPS_EVXHDLR).get().clrnhn();
    }
  }
}
