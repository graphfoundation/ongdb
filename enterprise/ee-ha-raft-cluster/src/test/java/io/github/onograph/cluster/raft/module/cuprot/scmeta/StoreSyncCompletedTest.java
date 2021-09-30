package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StoreSyncCompletedTest {

  @Test
  void testConstructor() {
    StoreSyncCompleted actualStoreSyncCompleted = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);

    assertEquals(1L, actualStoreSyncCompleted.getLgTcl());
    assertEquals(StoreSyncCompleted.SetupGdbSyncReplyStateType.OK,
        actualStoreSyncCompleted.getStat());
  }

  @Test
  void testConstructor2() {
    StoreSyncCompleted actualStoreSyncCompleted = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);

    assertEquals(1L, actualStoreSyncCompleted.getLgTcl());
    assertEquals(StoreSyncCompleted.SetupGdbSyncReplyStateType.OK,
        actualStoreSyncCompleted.getStat());
  }

  @Test
  void testConstructor3() {
    StoreSyncCompleted actualStoreSyncCompleted = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);

    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL, actualStoreSyncCompleted.getLgTcl());
    assertEquals(StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR,
        actualStoreSyncCompleted.getStat());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK)).equals(
            null));
    assertFalse((new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK))
        .equals("Different type to StoreSyncCompleted"));
  }

  @Test
  void testEquals2() {
    StoreSyncCompleted storeSyncCompleted = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);
    assertTrue(storeSyncCompleted.equals(storeSyncCompleted));
    int expectedHashCodeResult = storeSyncCompleted.hashCode();
    assertEquals(expectedHashCodeResult, storeSyncCompleted.hashCode());
  }

  @Test
  void testEquals3() {
    StoreSyncCompleted storeSyncCompleted = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);
    StoreSyncCompleted storeSyncCompleted1 = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);

    assertTrue(storeSyncCompleted.equals(storeSyncCompleted1));
    int expectedHashCodeResult = storeSyncCompleted.hashCode();
    assertEquals(expectedHashCodeResult, storeSyncCompleted1.hashCode());
  }

  @Test
  void testEquals4() {
    StoreSyncCompleted storeSyncCompleted = new StoreSyncCompleted(0L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);
    assertFalse(
        storeSyncCompleted.equals(
            new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK)));
  }

  @Test
  void testEquals5() {
    StoreSyncCompleted storeSyncCompleted = new StoreSyncCompleted(
        StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);
    assertFalse(storeSyncCompleted
        .equals(new StoreSyncCompleted(1L,
            StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)));
  }
}

