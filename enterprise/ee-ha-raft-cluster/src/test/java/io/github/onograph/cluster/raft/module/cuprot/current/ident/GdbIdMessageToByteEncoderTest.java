package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class GdbIdMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    GdbIdMessageToByteEncoder gdbIdMessageToByteEncoder = new GdbIdMessageToByteEncoder();
    DatabaseId m = TestDatabaseIdRepository.randomDatabaseId();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    gdbIdMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(Short.SIZE, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

