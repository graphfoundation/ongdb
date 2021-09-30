package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import org.junit.jupiter.api.Test;

class TransactionChunkingCompletedTest {

  @Test
  void testConstructor() {
    TransactionChunkingCompleted actualTransactionChunkingCompleted = new TransactionChunkingCompleted(
        1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);

    assertEquals(1L, actualTransactionChunkingCompleted.getLgItl());
    assertEquals(CatchupStatusType.CST_OK_STREAM_COMPLETE,
        actualTransactionChunkingCompleted.getStat());
  }

  @Test
  void testConstructor2() {
    TransactionChunkingCompleted actualTransactionChunkingCompleted = new TransactionChunkingCompleted(
        1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);

    assertEquals(1L, actualTransactionChunkingCompleted.getLgItl());
    assertEquals(CatchupStatusType.CST_OK_STREAM_COMPLETE,
        actualTransactionChunkingCompleted.getStat());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE)).equals(
            null));
    assertFalse((new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE))
        .equals("Different type to TransactionChunkingCompleted"));
  }

  @Test
  void testEquals2() {
    TransactionChunkingCompleted transactionChunkingCompleted = new TransactionChunkingCompleted(1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);
    assertTrue(transactionChunkingCompleted.equals(transactionChunkingCompleted));
    int expectedHashCodeResult = transactionChunkingCompleted.hashCode();
    assertEquals(expectedHashCodeResult, transactionChunkingCompleted.hashCode());
  }

  @Test
  void testEquals3() {
    TransactionChunkingCompleted transactionChunkingCompleted = new TransactionChunkingCompleted(1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);
    TransactionChunkingCompleted transactionChunkingCompleted1 = new TransactionChunkingCompleted(
        1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);

    assertTrue(transactionChunkingCompleted.equals(transactionChunkingCompleted1));
    int expectedHashCodeResult = transactionChunkingCompleted.hashCode();
    assertEquals(expectedHashCodeResult, transactionChunkingCompleted1.hashCode());
  }

  @Test
  void testEquals4() {
    TransactionChunkingCompleted transactionChunkingCompleted = new TransactionChunkingCompleted(0L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);
    assertFalse(transactionChunkingCompleted
        .equals(new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE)));
  }

  @Test
  void testEquals5() {
    TransactionChunkingCompleted transactionChunkingCompleted = new TransactionChunkingCompleted(1L,
        null);
    assertFalse(transactionChunkingCompleted
        .equals(new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE)));
  }
}

