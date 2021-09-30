package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.control.NettyChannelInitializerClientImpl;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.netty.buffer.PooledByteBufAllocator;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.test.FakeClockJobScheduler;

class ConsensusNettyChannelPoolLifecycleAdapterTest {

  @Test
  void testConstructor() {

    PooledByteBufAllocator _acByteBufAllocator = new PooledByteBufAllocator();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    NettyChannelInitializerClientImpl _channelInitializerIhObject = new NettyChannelInitializerClientImpl(
        null, null,
        new AssertableLogProvider(true), null);

    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    NettyChannelInitializerClientImpl _channelInitializerIhObject1 = new NettyChannelInitializerClientImpl(
        _channelInitializerIhObject, _fbpPipelineBuilderManager, new AssertableLogProvider(true),
        null);

    PipelineBuilderManager _fbpPipelineBuilderManager1 = PipelineBuilderManager.inerPipelineBuilderManager();
    NettyChannelInitializerClientImpl _channelInitializerIhObject2 = new NettyChannelInitializerClientImpl(
        _channelInitializerIhObject1, _fbpPipelineBuilderManager1, new AssertableLogProvider(true),
        null);

    PipelineBuilderManager _fbpPipelineBuilderManager2 = PipelineBuilderManager.inerPipelineBuilderManager();
    new ConsensusNettyChannelPoolLifecycleAdapter(_acByteBufAllocator, 1, _jobScheduler,
        _logProvider, null,
        new NettyChannelInitializerClientImpl(_channelInitializerIhObject2,
            _fbpPipelineBuilderManager2,
            new AssertableLogProvider(true), null));
  }
}

