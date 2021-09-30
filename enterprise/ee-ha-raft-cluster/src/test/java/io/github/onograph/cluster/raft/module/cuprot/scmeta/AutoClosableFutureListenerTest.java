package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.netty.channel.DefaultChannelProgressivePromise;
import io.netty.channel.DelegatingChannelPromiseNotifier;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.Test;

class AutoClosableFutureListenerTest {

  @Test
  void testAddToList() throws Exception {
    AutoClosableFutureListener autoClosableFutureListener = new AutoClosableFutureListener();
    AutoCloseable autoCloseable = mock(AutoCloseable.class);
    doNothing().when(autoCloseable).close();
    autoClosableFutureListener.<AutoCloseable>addToList(autoCloseable).close();
    verify(autoCloseable).close();
  }

  @Test
  void testClose() {

    (new AutoClosableFutureListener()).close();
  }

  @Test
  void testClose2() throws Exception {

    AutoCloseable autoCloseable = mock(AutoCloseable.class);
    doNothing().when(autoCloseable).close();

    AutoClosableFutureListener autoClosableFutureListener = new AutoClosableFutureListener();
    autoClosableFutureListener.<AutoCloseable>addToList(autoCloseable);
    autoClosableFutureListener.close();
  }

  @Test
  void testOperationComplete() {

    AutoClosableFutureListener autoClosableFutureListener = new AutoClosableFutureListener();
    autoClosableFutureListener.operationComplete(
        new DelegatingChannelPromiseNotifier(
            new DefaultChannelProgressivePromise(new EmbeddedChannel())));
  }

  @Test
  void testOperationComplete2() throws Exception {
    AutoCloseable autoCloseable = mock(AutoCloseable.class);
    doNothing().when(autoCloseable).close();

    AutoClosableFutureListener autoClosableFutureListener = new AutoClosableFutureListener();
    autoClosableFutureListener.<AutoCloseable>addToList(autoCloseable);
    autoClosableFutureListener.operationComplete(
        new DelegatingChannelPromiseNotifier(
            new DefaultChannelProgressivePromise(new EmbeddedChannel())));
    verify(autoCloseable).close();
  }
}

