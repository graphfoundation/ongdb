package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.storageengine.api.CommandReaderFactory;

class SyncableDataMessageToMessageDecoderControllerTest {

  @Test
  void testDeorSyncableDataMessageToMessageDecoder() {
    assertTrue(
        (new SyncableDataMessageToMessageDecoderController()).deorSyncableDataMessageToMessageDecoder(
            (byte) 'A',
            mock(
                CommandReaderFactory.class)) instanceof SyncableDataMessageToMessageDecoderNoWaitImpl);
    assertTrue(
        (new SyncableDataMessageToMessageDecoderController()).deorSyncableDataMessageToMessageDecoder(
            (byte) 0, mock(
                CommandReaderFactory.class)) instanceof io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableDataMessageToMessageDecoderImpl);
    assertTrue(
        (new SyncableDataMessageToMessageDecoderController()).deorSyncableDataMessageToMessageDecoder(
            (byte) 8,
            mock(
                CommandReaderFactory.class)) instanceof SyncableDataMessageToMessageDecoderNoopImpl);
    assertThrows(IllegalStateException.class,
        () -> (new SyncableDataMessageToMessageDecoderController())
            .deorSyncableDataMessageToMessageDecoder((byte) 0, null));
  }
}

