package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryStart;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;

class CatchupIncomingTransactionReplyTest {

  @Test
  void testConstructor() throws UnsupportedEncodingException {
    StoreId storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CommittedTransactionRepresentation committedTransactionRepresentation = new CommittedTransactionRepresentation(
        startEntry, transactionRepresentation, new LogEntryCommit(123L, 10L, 1));

    CatchupIncomingTransactionReply actualCatchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        1,
        storeId,
        committedTransactionRepresentation);

    assertEquals(1, actualCatchupIncomingTransactionReply.getISt());
    assertSame(storeId, actualCatchupIncomingTransactionReply.getStoreId());
    assertSame(committedTransactionRepresentation,
        actualCatchupIncomingTransactionReply.getTCommittedTransactionRepresentation());
  }

  @Test
  void testEquals() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse((new CatchupIncomingTransactionReply(1, _storeId,
        new CommittedTransactionRepresentation(startEntry,
            transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)))).equals(
        null));
  }

  @Test
  void testEquals2() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse((new CatchupIncomingTransactionReply(1, _storeId,
        new CommittedTransactionRepresentation(startEntry,
            transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1))))
        .equals("Different type to CatchupIncomingTransactionReply"));
  }

  @Test
  void testEquals3() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupIncomingTransactionReply catchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        1, _storeId,
        new CommittedTransactionRepresentation(
            startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));
    assertTrue(catchupIncomingTransactionReply.equals(catchupIncomingTransactionReply));
    int expectedHashCodeResult = catchupIncomingTransactionReply.hashCode();
    assertEquals(expectedHashCodeResult, catchupIncomingTransactionReply.hashCode());
  }

  @Test
  void testEquals4() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupIncomingTransactionReply catchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        1, _storeId,
        new CommittedTransactionRepresentation(
            startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));
    StoreId _storeId1 = new StoreId(1L);
    byte[] additionalHeader1 = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry1 = new LogEntryStart(10L, 1L, 1, additionalHeader1,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation1 = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse(catchupIncomingTransactionReply
        .equals(new CatchupIncomingTransactionReply(1, _storeId1,
            new CommittedTransactionRepresentation(startEntry1,
                transactionRepresentation1,
                new LogEntryCommit(123L, 10L,
                    1)))));
  }

  @Test
  void testEquals5() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupIncomingTransactionReply catchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        0, _storeId,
        new CommittedTransactionRepresentation(
            startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));
    StoreId _storeId1 = new StoreId(1L);
    byte[] additionalHeader1 = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry1 = new LogEntryStart(10L, 1L, 1, additionalHeader1,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation1 = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse(catchupIncomingTransactionReply
        .equals(new CatchupIncomingTransactionReply(1, _storeId1,
            new CommittedTransactionRepresentation(startEntry1,
                transactionRepresentation1,
                new LogEntryCommit(123L, 10L,
                    1)))));
  }
}

