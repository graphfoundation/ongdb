package io.github.onograph.cluster.raft.control;

import io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler;
import io.github.onograph.cluster.raft.netty.NettyChannelSetupManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class NettyChannelSetupManagerServerImpl implements NettyChannelSetupManager {


  private final ChannelInitializer<?> channelInitializerIhObject;


  private final HandshakeEventHandler leHandshakeEventHandler;


  private final Log log;


  private final LogProvider logProvider;


  private final PipelineBuilderManager pbfPipelineBuilderManager;


  private final Duration tmotDuration;


  public NettyChannelSetupManagerServerImpl(ChannelInitializer<?> _channelInitializerIhObject,
      HandshakeEventHandler _elHandshakeEventHandler,
      PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider,
      Duration _tmotDuration) {
    this.channelInitializerIhObject = _channelInitializerIhObject;
    this.pbfPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.tmotDuration = _tmotDuration;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.leHandshakeEventHandler = _elHandshakeEventHandler;
  }

  @Override
  public void intcaeForCh(Channel _channel) {
    this.leHandshakeEventHandler.onnincnoForCh(_channel);
    this.pbfPipelineBuilderManager.sevServerPipelineService(_channel, this.log)
        .add(io.github.onograph.TokenConstants.READ_TIMEOUT_HANDLER,
            new ChannelHandler[]{
                new ReadTimeoutHandler(
                    this.tmotDuration
                        .toMillis(),
                    TimeUnit.MILLISECONDS)})
        .add(io.github.onograph.TokenConstants.INIT_SERVER_HANDLER,
            new ChannelHandler[]{
                new ServerNettyReplayingDecoder(this.channelInitializerIhObject,
                    this.pbfPipelineBuilderManager,
                    this.logProvider)})
        .intl();
  }
}
