package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class ConsensusSnapshotDataInfoTest {

  @Test
  void testConstructor() {
    ConsensusMemberGroupId froConsensusMemberGroupIdResult = ConsensusMemberGroupId
        .froConsensusMemberGroupId(TestDatabaseIdRepository.randomDatabaseId());
    assertSame(froConsensusMemberGroupIdResult,
        (new ConsensusSnapshotDataInfo(
            froConsensusMemberGroupIdResult)).getConsensusMemberGroupId());
  }

  @Test
  void testConstructor2() {
    ConsensusMemberGroupId froConsensusMemberGroupIdResult = ConsensusMemberGroupId
        .froConsensusMemberGroupId(TestDatabaseIdRepository.randomDatabaseId());
    assertSame(froConsensusMemberGroupIdResult,
        (new ConsensusSnapshotDataInfo(froConsensusMemberGroupIdResult, new SnapshotData(1L, 1L)))
            .getConsensusMemberGroupId());
  }

  @Test
  void testSnpoOptional() {
    assertFalse((new ConsensusSnapshotDataInfo(
        ConsensusMemberGroupId.froConsensusMemberGroupId(
            TestDatabaseIdRepository.randomDatabaseId()))).snpoOptional()
        .isPresent());
  }
}

