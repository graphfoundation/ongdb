package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;

class MessageRequestCIHAManagerTest {

  @Test
  void testConstructor() {

    ContentTypeRef _refPoooMessageDataType = new ContentTypeRef();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder _consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());

    Supplier<SyncableDataByteToMessageDecoder> supplier = (Supplier<SyncableDataByteToMessageDecoder>) mock(
        Supplier.class);
    when(supplier.get())
        .thenReturn(new SyncableDataByteToMessageDecoder(true,
            new SyncableDataMessageToMessageDecoderController()));
    new MessageRequestCIHAManager(_refPoooMessageDataType, _logProvider,
        _consensusByteToMessageDecoder, supplier);
  }
}

