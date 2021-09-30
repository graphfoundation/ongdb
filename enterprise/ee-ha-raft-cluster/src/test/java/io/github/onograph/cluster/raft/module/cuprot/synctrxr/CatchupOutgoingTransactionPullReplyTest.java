package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryStart;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;

class CatchupOutgoingTransactionPullReplyTest {

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

    CatchupOutgoingTransactionPullReply actualCatchupOutgoingTransactionPullReply = new CatchupOutgoingTransactionPullReply(
        KernelVersion.V2_3, storeId, committedTransactionRepresentation);

    assertEquals(KernelVersion.V2_3, actualCatchupOutgoingTransactionPullReply.getKernelVersion());
    assertSame(storeId, actualCatchupOutgoingTransactionPullReply.getStoreId());
    assertSame(committedTransactionRepresentation,
        actualCatchupOutgoingTransactionPullReply.getTCommittedTransactionRepresentation());
  }

  @Test
  void testEquals() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse(
        (new CatchupOutgoingTransactionPullReply(KernelVersion.V2_3, _storeId,
            new CommittedTransactionRepresentation(
                startEntry, transactionRepresentation, new LogEntryCommit(123L, 10L, 1)))).equals(
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
    assertFalse(
        (new CatchupOutgoingTransactionPullReply(KernelVersion.V2_3, _storeId,
            new CommittedTransactionRepresentation(
                startEntry, transactionRepresentation, new LogEntryCommit(123L, 10L, 1))))
            .equals("Different type to CatchupOutgoingTransactionPullReply"));
  }

  @Test
  void testEquals3() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply = new CatchupOutgoingTransactionPullReply(
        KernelVersion.V2_3, _storeId,
        new CommittedTransactionRepresentation(startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));
    assertTrue(catchupOutgoingTransactionPullReply.equals(catchupOutgoingTransactionPullReply));
    int expectedHashCodeResult = catchupOutgoingTransactionPullReply.hashCode();
    assertEquals(expectedHashCodeResult, catchupOutgoingTransactionPullReply.hashCode());
  }

  @Test
  void testEquals4() throws UnsupportedEncodingException {
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply = new CatchupOutgoingTransactionPullReply(
        KernelVersion.V2_3, _storeId,
        new CommittedTransactionRepresentation(startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));
    StoreId _storeId1 = new StoreId(1L);
    byte[] additionalHeader1 = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry1 = new LogEntryStart(10L, 1L, 1, additionalHeader1,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation1 = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    assertFalse(catchupOutgoingTransactionPullReply.equals(
        new CatchupOutgoingTransactionPullReply(KernelVersion.V2_3, _storeId1,
            new CommittedTransactionRepresentation(
                startEntry1, transactionRepresentation1, new LogEntryCommit(123L, 10L, 1)))));
  }
}

