package io.github.onograph.cluster.raft.control;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ProComAttributeKey;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.nio.channels.ClosedChannelException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class NettyChannelInitializerClientImpl extends ChannelInitializer<Channel> {


  private final ChannelInitializer<?> channelInitializerIhObject;


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final Log log;


  private final LogProvider logProvider;


  private final Duration tmotDuration;


  public NettyChannelInitializerClientImpl(ChannelInitializer<?> _channelInitializerIhObject,
      PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider,
      Duration _tmotDuration) {
    this.channelInitializerIhObject = _channelInitializerIhObject;
    this.fbpPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.tmotDuration = _tmotDuration;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void initChannel(Channel _channel) {

    CompletableFuture<ComProFamilyWrapper> _completableFutureFpComProFamilyWrapper = new CompletableFuture();
    _channel.attr(ProComAttributeKey.ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE)
        .set(_completableFutureFpComProFamilyWrapper);
    _channel.closeFuture().addListener((ignore) ->
    {
      _completableFutureFpComProFamilyWrapper.completeExceptionally(new ClosedChannelException());
    });
    this.fbpPipelineBuilderManager.cleClientPipelineService(_channel, this.log)
        .add(io.github.onograph.TokenConstants.READ_TIMEOUT_HANDLER,
            new ChannelHandler[]{
                new ReadTimeoutHandler(
                    this.tmotDuration
                        .toMillis(),
                    TimeUnit.MILLISECONDS)})
        .add(io.github.onograph.TokenConstants.INIT_CLIENT_HANDLER,
            new ChannelHandler[]{
                new ClientNettyReplayingDecoder(this.channelInitializerIhObject,
                    this.fbpPipelineBuilderManager,
                    this.logProvider)})
        .intl();
  }
}
