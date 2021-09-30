package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class TransactionBlockGeneratorTest {

  @Test
  void testSetupConstructor() {
    new TransactionBlockGenerator.Setup(null, CatchupStatusType.CST_OK_STREAM_COMPLETE, 1L);

    assertNull(null);
  }

  @Test
  void testSetupEquals() {
    assertFalse(
        TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
                CatchupStatusType.CST_OK_STREAM_COMPLETE)
            .equals(null));
    assertFalse(
        TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
                CatchupStatusType.CST_OK_STREAM_COMPLETE)
            .equals("Different type to Setup"));
  }

  @Test
  void testSetupEquals2() {
    TransactionBlockGenerator.Setup faiTransactionBlockGeneratorSetupResult = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_OK_STREAM_COMPLETE);
    assertTrue(
        faiTransactionBlockGeneratorSetupResult.equals(faiTransactionBlockGeneratorSetupResult));
    int expectedHashCodeResult = faiTransactionBlockGeneratorSetupResult.hashCode();
    assertEquals(expectedHashCodeResult, faiTransactionBlockGeneratorSetupResult.hashCode());
  }

  @Test
  void testSetupEquals3() {
    TransactionBlockGenerator.Setup faiTransactionBlockGeneratorSetupResult = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_OK_STREAM_COMPLETE);
    TransactionBlockGenerator.Setup faiTransactionBlockGeneratorSetupResult1 = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_OK_STREAM_COMPLETE);
    assertTrue(
        faiTransactionBlockGeneratorSetupResult.equals(faiTransactionBlockGeneratorSetupResult1));
    int expectedHashCodeResult = faiTransactionBlockGeneratorSetupResult.hashCode();
    assertEquals(expectedHashCodeResult, faiTransactionBlockGeneratorSetupResult1.hashCode());
  }

  @Test
  void testSetupEquals4() {
    TransactionBlockGenerator.Setup faiTransactionBlockGeneratorSetupResult = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(null);
    assertFalse(faiTransactionBlockGeneratorSetupResult.equals(
        TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
            CatchupStatusType.CST_OK_STREAM_COMPLETE)));
  }

  @Test
  void testSetupEquals5() {
    TransactionBlockGenerator.Setup nohgtsdTransactionBlockGeneratorSetupResult = TransactionBlockGenerator.Setup
        .nohgtsdTransactionBlockGeneratorSetup(1L);
    assertFalse(nohgtsdTransactionBlockGeneratorSetupResult.equals(
        TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
            CatchupStatusType.CST_OK_STREAM_COMPLETE)));
  }

  @Test
  void testSetupFaiTransactionBlockGeneratorSetup() {

    TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
        CatchupStatusType.CST_OK_STREAM_COMPLETE);
  }

  @Test
  void testSetupNohgtsdTransactionBlockGeneratorSetup() {

    TransactionBlockGenerator.Setup.nohgtsdTransactionBlockGeneratorSetup(1L);
  }

  @Test
  void testSetupOkTransactionBlockGeneratorSetup() {

    TransactionBlockGenerator.Setup.okTransactionBlockGeneratorSetup(null);
  }

  @Test
  void testSetupRepsOptional() {
    Optional<TransactionChunkingCompleted> actualRepsOptionalResult = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_OK_STREAM_COMPLETE)
        .repsOptional();
    assertTrue(actualRepsOptionalResult.isPresent());
    TransactionChunkingCompleted getResult = actualRepsOptionalResult.get();
    assertEquals(-1L, getResult.getLgItl());
    assertEquals(CatchupStatusType.CST_OK_STREAM_COMPLETE, getResult.getStat());
  }

  @Test
  void testSetupRepsOptional2() {
    assertFalse(
        TransactionBlockGenerator.Setup.okTransactionBlockGeneratorSetup(null).repsOptional()
            .isPresent());
  }

  @Test
  void testSetupTxstaOptional() {
    TransactionBlockGenerator.Setup faiTransactionBlockGeneratorSetupResult = TransactionBlockGenerator.Setup
        .faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_OK_STREAM_COMPLETE);
    assertFalse(faiTransactionBlockGeneratorSetupResult.txstaOptional(new ServerRef()).isPresent());
  }
}

