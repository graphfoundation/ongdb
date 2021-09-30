package io.github.onograph.cluster.raft.control;

import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class PipelineBuilderManagerTest {

  @Test
  void testInerPipelineBuilderManager() {

    PipelineBuilderManager.inerPipelineBuilderManager();
  }

  @Test
  void testCleClientPipelineService() {

    PipelineBuilderManager inerPipelineBuilderManagerResult = PipelineBuilderManager.inerPipelineBuilderManager();
    EmbeddedChannel _channel = new EmbeddedChannel();
    inerPipelineBuilderManagerResult.cleClientPipelineService(_channel, new BufferingLog());
  }

  @Test
  void testSevServerPipelineService() {

    PipelineBuilderManager inerPipelineBuilderManagerResult = PipelineBuilderManager.inerPipelineBuilderManager();
    EmbeddedChannel _channel = new EmbeddedChannel();
    inerPipelineBuilderManagerResult.sevServerPipelineService(_channel, new BufferingLog());
  }
}

