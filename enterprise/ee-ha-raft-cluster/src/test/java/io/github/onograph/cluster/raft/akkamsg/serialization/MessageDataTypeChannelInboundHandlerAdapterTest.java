package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class MessageDataTypeChannelInboundHandlerAdapterTest {

  @Test
  void testConstructor() {

    new MessageDataTypeChannelInboundHandlerAdapter(new ContentTypeRef());
  }

  @Test
  void testChannelRead() {
    MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter = new MessageDataTypeChannelInboundHandlerAdapter(
        new ContentTypeRef());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    assertThrows(IllegalArgumentException.class,
        () -> messageDataTypeChannelInboundHandlerAdapter.channelRead(null, compositeBufferResult));
  }

  @Test
  void testChannelRead2() throws IOException {
    MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter = new MessageDataTypeChannelInboundHandlerAdapter(
        new ContentTypeRef());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeIntLE(42);
    compositeBufferResult.readBytes(new ByteArrayOutputStream(3), 3);
    messageDataTypeChannelInboundHandlerAdapter.channelRead(null, compositeBufferResult);
    assertEquals(0, compositeBufferResult.refCnt());
    assertEquals(4, compositeBufferResult.readerIndex());
  }
}

