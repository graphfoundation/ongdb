package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelPromise;
import io.netty.channel.DefaultChannelProgressivePromise;
import io.netty.channel.DefaultChannelPromise;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class MessageChannelDuplexHandlerTest {

  @Test
  void testChannelPromiseMessageWrapperConstructor()
      throws InterruptedException, ExecutionException {
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    DefaultChannelProgressivePromise defaultChannelProgressivePromise = new DefaultChannelProgressivePromise(
        embeddedChannel);
    MessageChannelDuplexHandler.ChannelPromiseMessageWrapper actualChannelPromiseMessageWrapper =
        new MessageChannelDuplexHandler.ChannelPromiseMessageWrapper(
            defaultChannelProgressivePromise, "42");

    ChannelPromise channelPromise = actualChannelPromiseMessageWrapper.channelPromise;
    assertTrue(channelPromise instanceof DefaultChannelProgressivePromise);
    assertEquals("42", actualChannelPromiseMessageWrapper.m);
    Channel channelResult = channelPromise.channel();
    Void actualNow = channelPromise.getNow();
    boolean actualIsCancellableResult = channelPromise.isCancellable();
    boolean actualIsCancelledResult = channelPromise.isCancelled();
    boolean actualIsDoneResult = channelPromise.isDone();
    boolean actualIsSuccessResult = channelPromise.isSuccess();
    boolean actualIsVoidResult = channelPromise.isVoid();
    assertSame(embeddedChannel, channelResult);
    assertTrue(channelResult instanceof EmbeddedChannel);
    assertSame(embeddedChannel, channelResult);
    ByteBufAllocator allocResult = channelResult.alloc();
    ChannelConfig configResult = channelResult.config();
    ChannelFuture deregisterResult = channelResult.deregister();
    ChannelFuture disconnectResult = channelResult.disconnect();
    Channel actualFlushResult = channelResult.flush();
    boolean actualIsActiveResult = channelResult.isActive();
    boolean actualIsOpenResult = channelResult.isOpen();
    boolean actualIsRegisteredResult = channelResult.isRegistered();
    ChannelMetadata metadataResult = channelResult.metadata();
    Channel actualParentResult = channelResult.parent();
    String actualToStringResult = channelResult.toString();
    assertFalse(actualIsVoidResult);
    assertNull(actualNow);
    assertFalse(actualIsCancelledResult);
    assertFalse(actualIsDoneResult);
    assertTrue(actualIsCancellableResult);
    assertFalse(actualIsSuccessResult);
    assertFalse(actualIsRegisteredResult);
    assertFalse(actualIsOpenResult);
    assertFalse(actualIsActiveResult);
    assertSame(channelResult, actualFlushResult);
    assertTrue(disconnectResult instanceof DefaultChannelPromise);
    assertTrue(deregisterResult instanceof DefaultChannelPromise);
    Channel actualChannelResult = disconnectResult.channel();
    Void actualGetResult = disconnectResult.get();
    Void actualNow1 = disconnectResult.getNow();
    boolean actualIsCancellableResult1 = disconnectResult.isCancellable();
    boolean actualIsCancelledResult1 = disconnectResult.isCancelled();
    boolean actualIsDoneResult1 = disconnectResult.isDone();
    boolean actualIsSuccessResult1 = disconnectResult.isSuccess();
    boolean actualIsVoidResult1 = disconnectResult.isVoid();
    ChannelFuture actualSyncResult = disconnectResult.sync();
    Channel actualChannelResult1 = deregisterResult.channel();
    Void actualGetResult1 = deregisterResult.get();
    Void actualNow2 = deregisterResult.getNow();
    boolean actualIsCancellableResult2 = deregisterResult.isCancellable();
    boolean actualIsCancelledResult2 = deregisterResult.isCancelled();
    boolean actualIsDoneResult2 = deregisterResult.isDone();
    boolean actualIsSuccessResult2 = deregisterResult.isSuccess();
    boolean actualIsVoidResult2 = deregisterResult.isVoid();
    ChannelFuture actualSyncResult1 = deregisterResult.sync();
    assertTrue(configResult instanceof io.netty.channel.DefaultChannelConfig);
    assertEquals("[id: 0xembedded]", actualToStringResult);
    assertNull(actualParentResult);
    assertTrue(allocResult instanceof io.netty.buffer.PooledByteBufAllocator);
    assertNull(actualGetResult);
    assertFalse(actualIsCancellableResult2);
    assertNull(actualNow2);
    assertNull(actualGetResult1);
    assertSame(channelResult, actualChannelResult1);
    assertSame(disconnectResult, actualSyncResult);
    assertFalse(actualIsVoidResult1);
    assertTrue(actualIsSuccessResult1);
    assertTrue(actualIsDoneResult1);
    assertFalse(actualIsCancelledResult1);
    assertFalse(actualIsCancellableResult1);
    assertNull(actualNow1);
    assertFalse(actualIsVoidResult2);
    assertSame(channelResult, actualChannelResult);
    assertFalse(metadataResult.hasDisconnect());
    assertTrue(actualIsDoneResult2);
    assertTrue(actualIsSuccessResult2);
    assertSame(deregisterResult, actualSyncResult1);
    assertEquals(1, metadataResult.defaultMaxMessagesPerRead());
    assertFalse(actualIsCancelledResult2);
    assertSame(channelPromise, defaultChannelProgressivePromise);
  }

  @Test
  void testConstructor() {

    new MessageChannelDuplexHandler((Predicate<Object>) mock(Predicate.class));
  }
}

