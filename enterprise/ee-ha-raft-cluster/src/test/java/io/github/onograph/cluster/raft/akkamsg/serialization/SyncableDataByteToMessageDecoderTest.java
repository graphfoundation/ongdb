package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SyncableDataByteToMessageDecoderTest {

  @Test
  void testConstructor() {

    new SyncableDataByteToMessageDecoder(true, new SyncableDataMessageToMessageDecoderController());
  }

  @Test
  void testDecode() {
    SyncableDataByteToMessageDecoder syncableDataByteToMessageDecoder = new SyncableDataByteToMessageDecoder(
        true,
        new SyncableDataMessageToMessageDecoderController());
    CompositeByteBuf _cukByteBuf = Unpooled.compositeBuffer(3);
    assertThrows(DecoderException.class,
        () -> syncableDataByteToMessageDecoder.decode(null, _cukByteBuf, new ArrayList<Object>()));
  }
}

