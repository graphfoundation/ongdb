package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class ConsensusMemberGroupIdTest {

  @Test
  void testConstructor() {
    UUID randomUUIDResult = UUID.randomUUID();
    assertSame(randomUUIDResult, (new ConsensusMemberGroupId(randomUUIDResult)).uuid());
  }

  @Test
  void testFroConsensusMemberGroupId() {

    ConsensusMemberGroupId.froConsensusMemberGroupId(TestDatabaseIdRepository.randomDatabaseId());
  }

  @Test
  void testTodabeiDatabaseId() {

    ConsensusMemberGroupId.todabeiDatabaseId(
        ConsensusMemberGroupId.froConsensusMemberGroupId(
            TestDatabaseIdRepository.randomDatabaseId()));
  }
}

