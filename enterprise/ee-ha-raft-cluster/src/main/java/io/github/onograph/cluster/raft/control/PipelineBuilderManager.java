package io.github.onograph.cluster.raft.control;

import io.netty.channel.Channel;
import org.neo4j.logging.Log;
import org.neo4j.ssl.SslPolicy;


public class PipelineBuilderManager {


  private final SslPolicy sslPolicy;

  public PipelineBuilderManager(SslPolicy _sslPolicy) {
    this.sslPolicy = _sslPolicy;
  }


  public static PipelineBuilderManager inerPipelineBuilderManager() {
    return new PipelineBuilderManager(null);
  }


  public ClientPipelineService cleClientPipelineService(Channel _channel, Log _log) {
    return AbstractNettyChannelPipelineService.cleClientPipelineService(_channel.pipeline(), _log,
        this.sslPolicy);
  }


  public ServerPipelineService sevServerPipelineService(Channel _channel, Log _log) {
    return AbstractNettyChannelPipelineService.sevServerPipelineService(_channel.pipeline(), _log,
        this.sslPolicy);
  }
}
