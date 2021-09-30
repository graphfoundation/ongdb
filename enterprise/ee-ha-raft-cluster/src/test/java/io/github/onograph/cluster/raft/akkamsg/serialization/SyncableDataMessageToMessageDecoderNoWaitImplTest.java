package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;
import org.neo4j.function.ThrowingFunction;

class SyncableDataMessageToMessageDecoderNoWaitImplTest {

  @Test
  void testConstructor() {

    new SyncableDataMessageToMessageDecoderNoWaitImpl(
        (ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception>) mock(
            ThrowingFunction.class));
  }

  @Test
  void testCoseForDe() throws Exception {
    ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception> throwingFunction =
        (ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception>) mock(
            ThrowingFunction.class);
    when(throwingFunction.apply((DefaultReadableChecksumChannel) any()))
        .thenReturn(DataManagerFactory.emuiDataManagerFactory());
    SyncableDataMessageToMessageDecoderNoWaitImpl syncableDataMessageToMessageDecoderNoWaitImpl = new SyncableDataMessageToMessageDecoderNoWaitImpl(
        throwingFunction);
    syncableDataMessageToMessageDecoderNoWaitImpl
        .coseForDe(new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3)));
    verify(throwingFunction).apply((DefaultReadableChecksumChannel) any());
  }

  @Test
  void testCracttDataManagerFactory() {
    assertThrows(IllegalStateException.class,
        () -> (new SyncableDataMessageToMessageDecoderNoWaitImpl(
            (ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception>) mock(
                ThrowingFunction.class))).cracttDataManagerFactory());
  }
}

