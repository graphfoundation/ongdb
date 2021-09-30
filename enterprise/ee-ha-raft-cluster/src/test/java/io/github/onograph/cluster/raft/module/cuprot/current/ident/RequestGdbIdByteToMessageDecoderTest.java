package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class RequestGdbIdByteToMessageDecoderTest {

  @Test
  void testDecode() throws Exception {
    RequestGdbIdByteToMessageDecoder requestGdbIdByteToMessageDecoder = new RequestGdbIdByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(-1);
    ArrayList<Object> objectList = new ArrayList<Object>();
    requestGdbIdByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(4, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertNull(((RequestGdbId) objectList.get(0)).getGdbName());
    assertEquals(AskMessageType.AMT_GDB_GUID, ((RequestGdbId) objectList.get(0)).getTNme());
  }
}

