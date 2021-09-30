package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class RequestStoreDatabaseIdCatchupManagementTest {

  @Test
  void testConstructor() {
    DatabaseId randomDatabaseIdResult = TestDatabaseIdRepository.randomDatabaseId();
    RequestStoreDatabaseIdCatchupManagement actualRequestStoreDatabaseIdCatchupManagement = new RequestStoreDatabaseIdCatchupManagement(
        randomDatabaseIdResult);
    assertSame(randomDatabaseIdResult,
        actualRequestStoreDatabaseIdCatchupManagement.getDatabaseId());
    assertEquals(AskMessageType.AMT_STORE_GUID_ASK,
        actualRequestStoreDatabaseIdCatchupManagement.getTNme());
  }
}

