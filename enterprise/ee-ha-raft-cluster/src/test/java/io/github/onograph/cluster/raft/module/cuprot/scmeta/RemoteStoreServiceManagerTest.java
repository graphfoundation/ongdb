package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.test.FakeClockJobScheduler;

class RemoteStoreServiceManagerTest {

  @Test
  void testConstructor() {

    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    SocketAddressController gSocketAddressController = new SocketAddressController();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    new RemoteStoreServiceManager(_ccsStoreService, _clock, gSocketAddressController, null,
        _jobScheduler,
        new AssertableLogProvider(true));
  }

  @Test
  void testTxIdProcessorConstructor() {

    new RemoteStoreServiceManager.TxIdProcessor(SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
  }

  @Test
  void testTxIdProcessorConstructor2() {

    new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(0L,
            new Path[]{Paths.get(
                System.getProperty("java.io.tmpdir"),
                "test.txt"),
                Paths.get(System.getProperty(
                    "java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty(
                        "java.io.tmpdir"),
                    "test.txt")}));
  }

  @Test
  void testTxIdProcessorHadForSt() {

    RemoteStoreServiceManager.TxIdProcessor txIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    txIdProcessor.hadForSt(
        new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK));
  }

  @Test
  void testTxIdProcessorHadForSt2() {

    RemoteStoreServiceManager.TxIdProcessor txIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    txIdProcessor.hadForSt(
        new StoreSyncCompleted(1L,
            StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
  }

  @Test
  void testTxIdProcessorRertatraCatchupMDTxsWrapper() {
    CatchupMDTxsWrapper actualRertatraCatchupMDTxsWrapperResult = (new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)))
        .rertatraCatchupMDTxsWrapper();
    assertEquals(2L, actualRertatraCatchupMDTxsWrapperResult.getLgIts());
    assertTrue(actualRertatraCatchupMDTxsWrapperResult.isNoreidti());
  }

  @Test
  void testTxIdProcessorRertatraCatchupMDTxsWrapper2() {
    RemoteStoreServiceManager.TxIdProcessor txIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    txIdProcessor.hadForSt(
        new StoreSyncCompleted(Long.MAX_VALUE, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK));
    CatchupMDTxsWrapper actualRertatraCatchupMDTxsWrapperResult = txIdProcessor.rertatraCatchupMDTxsWrapper();
    assertEquals(0L, actualRertatraCatchupMDTxsWrapperResult.getLgIts());
    assertFalse(actualRertatraCatchupMDTxsWrapperResult.isNoreidti());
  }
}

