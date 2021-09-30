package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;

class RequestSnapshotByteToMessageDecoderTest {

  @Test
  void testDecode() throws IOException, EndOfStreamException {
    RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder = new RequestSnapshotByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    compositeBufferResult.writeLong(42L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    requestSnapshotByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(Short.SIZE, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertEquals(AskMessageType.AMT_CS_ASK, ((RequestSnapshotData) objectList.get(0)).getTNme());
    assertEquals("DatabaseId{2a000000}",
        ((RequestSnapshotData) objectList.get(0)).getDatabaseId().toString());
  }
}

