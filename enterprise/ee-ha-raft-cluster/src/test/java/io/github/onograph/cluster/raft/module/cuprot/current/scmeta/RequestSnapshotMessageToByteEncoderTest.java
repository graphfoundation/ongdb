package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class RequestSnapshotMessageToByteEncoderTest {

  @Test
  void testEncode() throws IOException {
    RequestSnapshotMessageToByteEncoder requestSnapshotMessageToByteEncoder = new RequestSnapshotMessageToByteEncoder();
    RequestSnapshotData m = new RequestSnapshotData(TestDatabaseIdRepository.randomDatabaseId());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    requestSnapshotMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(Short.SIZE, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

