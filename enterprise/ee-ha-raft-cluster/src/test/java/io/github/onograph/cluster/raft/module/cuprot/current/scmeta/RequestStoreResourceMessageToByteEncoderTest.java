package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.netty.buffer.Unpooled;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.storageengine.api.StoreId;

class RequestStoreResourceMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {

    RequestStoreResourceMessageToByteEncoder requestStoreResourceMessageToByteEncoder = new RequestStoreResourceMessageToByteEncoder();
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    RequestStoreResource m = new RequestStoreResource(_databaseId, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    requestStoreResourceMessageToByteEncoder.encode(null, m, Unpooled.compositeBuffer(3));
  }
}

