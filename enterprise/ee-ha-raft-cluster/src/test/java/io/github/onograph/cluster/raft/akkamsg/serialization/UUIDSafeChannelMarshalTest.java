package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.io.IOException;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class UUIDSafeChannelMarshalTest {

  @Test
  void testMarshal() throws IOException {

    UUIDSafeChannelMarshal uuidSafeChannelMarshal = new UUIDSafeChannelMarshal();
    UUID _uUID = UUID.randomUUID();
    uuidSafeChannelMarshal.marshal(_uUID, new InMemoryClosableChannel());
  }

  @Test
  void testUnmarshal0() throws IOException, EndOfStreamException {

    UUIDSafeChannelMarshal uuidSafeChannelMarshal = new UUIDSafeChannelMarshal();

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.putDouble(10.0);
    uuidSafeChannelMarshal.unmarshal0(inMemoryClosableChannel);
  }
}

