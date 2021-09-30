package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType;
import org.junit.jupiter.api.Test;

class ConsensusServiceSupplierTest {

  @Test
  void testMessageSenderTypeIsSuslpldbForCoCo() {
    assertFalse(ConsensusServiceSupplier.MessageSenderType
        .isSuslpldbForCoCo(ConsensusServiceSupplier.MessageSenderType.CURRENT_FOCUS,
            ConsensusIdStatusType.POS_COMPUB));
    assertFalse(ConsensusServiceSupplier.MessageSenderType
        .isSuslpldbForCoCo(ConsensusServiceSupplier.MessageSenderType.ALL,
            ConsensusIdStatusType.POS_COMPUB));
    assertTrue(ConsensusServiceSupplier.MessageSenderType.isSuslpldbForCoCo(
        ConsensusServiceSupplier.MessageSenderType.CURRENT_FOCUS,
        ConsensusIdStatusType.OK_PUB_CALLER));
    assertTrue(ConsensusServiceSupplier.MessageSenderType
        .isSuslpldbForCoCo(ConsensusServiceSupplier.MessageSenderType.ALL,
            ConsensusIdStatusType.OK_PUB_CALLER));
    assertTrue(ConsensusServiceSupplier.MessageSenderType.isSuslpldbForCoCo(
        ConsensusServiceSupplier.MessageSenderType.ALL,
        ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER));
  }
}

