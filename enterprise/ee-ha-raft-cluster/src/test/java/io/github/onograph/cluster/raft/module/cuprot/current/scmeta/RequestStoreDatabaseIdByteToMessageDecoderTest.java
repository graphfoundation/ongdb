package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;

class RequestStoreDatabaseIdByteToMessageDecoderTest {

  @Test
  void testDecode() throws IOException, EndOfStreamException {
    RequestStoreDatabaseIdByteToMessageDecoder requestStoreDatabaseIdByteToMessageDecoder = new RequestStoreDatabaseIdByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    compositeBufferResult.writeLong(42L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    requestStoreDatabaseIdByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(Short.SIZE, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertEquals(AskMessageType.AMT_STORE_GUID_ASK,
        ((RequestStoreDatabaseIdCatchupManagement) objectList.get(0)).getTNme());
    assertEquals("DatabaseId{2a000000}",
        ((RequestStoreDatabaseIdCatchupManagement) objectList.get(0)).getDatabaseId().toString());
  }
}

