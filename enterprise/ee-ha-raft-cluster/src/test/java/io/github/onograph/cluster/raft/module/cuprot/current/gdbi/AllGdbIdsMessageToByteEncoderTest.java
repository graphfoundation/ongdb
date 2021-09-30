package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class AllGdbIdsMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    AllGdbIdsMessageToByteEncoder allGdbIdsMessageToByteEncoder = new AllGdbIdsMessageToByteEncoder();
    AllGdbIds _rsosAllGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    allGdbIdsMessageToByteEncoder.encode(null, _rsosAllGdbIds, compositeBufferResult);
    assertEquals(8, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertFalse(compositeBufferResult.readBoolean());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

