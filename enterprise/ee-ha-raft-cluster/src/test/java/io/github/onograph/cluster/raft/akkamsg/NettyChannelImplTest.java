package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.channel.DefaultChannelPromise;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class NettyChannelImplTest {

  @Test
  void testConstructor() {
    EmbeddedChannel _channel = new EmbeddedChannel();
    assertFalse((new NettyChannelImpl(_channel, new BufferingLog())).isChannelDis());
  }

  @Test
  void testIsChannelOpen() {
    EmbeddedChannel _channel = new EmbeddedChannel();
    assertTrue((new NettyChannelImpl(_channel, new BufferingLog())).isChannelOpen());
  }

  @Test
  void testWrtFuture() {
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    assertSame(embeddedChannel,
        ((DefaultChannelPromise) (new NettyChannelImpl(embeddedChannel,
            new BufferingLog())).wrtFuture("42"))
            .channel());
  }

  @Test
  void testWrtanflhFuture() {
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    assertSame(embeddedChannel,
        ((DefaultChannelPromise) (new NettyChannelImpl(embeddedChannel,
            new BufferingLog())).wrtanflhFuture("42"))
            .channel());
  }
}

