package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.buffer.PooledByteBufAllocator;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.SimpleMetaDataProvider;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.storageengine.api.StoreId;

class TransactionBlockServiceMemImplTest {

  @Test
  void testConstructor() {
    BufferingLog _log = new BufferingLog();
    ServerRef _poooServerRef = new ServerRef();
    TransactionBlockLimiters _cntanTransactionBlockLimiters = mock(TransactionBlockLimiters.class);
    StoreId _lclStoreId = new StoreId(1L);
    assertEquals(1L,
        (new TransactionBlockServiceMemImpl(_log, _poooServerRef,
            new TransactionSyncEnvironment(_cntanTransactionBlockLimiters, KernelVersion.V2_3,
                _lclStoreId, 1L,
                1L,
                null, new SimpleMetaDataProvider()))).getStartingTransactionId());
  }

  @Test
  void testClose() throws Exception {
    TransactionCursor transactionCursor = mock(TransactionCursor.class);
    doNothing().when(transactionCursor).close();
    TransactionBlockLimiters _cntanTransactionBlockLimiters = mock(TransactionBlockLimiters.class);
    StoreId _lclStoreId = new StoreId(1L);
    TransactionSyncEnvironment _tpcTransactionSyncEnvironment = new TransactionSyncEnvironment(
        _cntanTransactionBlockLimiters, KernelVersion.V2_3, _lclStoreId, 1L, 1L, transactionCursor,
        new SimpleMetaDataProvider());

    BufferingLog _log = new BufferingLog();
    (new TransactionBlockServiceMemImpl(_log, new ServerRef(),
        _tpcTransactionSyncEnvironment)).close();
    verify(transactionCursor).close();
  }

  @Test
  void testGetStartingTransactionId() {
    BufferingLog _log = new BufferingLog();
    ServerRef _poooServerRef = new ServerRef();
    TransactionBlockLimiters _cntanTransactionBlockLimiters = mock(TransactionBlockLimiters.class);
    StoreId _lclStoreId = new StoreId(1L);
    assertEquals(1L,
        (new TransactionBlockServiceMemImpl(_log, _poooServerRef,
            new TransactionSyncEnvironment(_cntanTransactionBlockLimiters, KernelVersion.V2_3,
                _lclStoreId, 1L,
                1L,
                null, new SimpleMetaDataProvider()))).getStartingTransactionId());
  }

  @Test
  void testLength() {
    BufferingLog _log = new BufferingLog();
    ServerRef _poooServerRef = new ServerRef();
    TransactionBlockLimiters _cntanTransactionBlockLimiters = mock(TransactionBlockLimiters.class);
    StoreId _lclStoreId = new StoreId(1L);
    assertEquals(-1L,
        (new TransactionBlockServiceMemImpl(_log, _poooServerRef,
            new TransactionSyncEnvironment(_cntanTransactionBlockLimiters, KernelVersion.V2_3,
                _lclStoreId, 1L,
                1L,
                null, new SimpleMetaDataProvider()))).length());
  }

  @Test
  void testProgress() {
    BufferingLog _log = new BufferingLog();
    ServerRef _poooServerRef = new ServerRef();
    TransactionBlockLimiters _cntanTransactionBlockLimiters = mock(TransactionBlockLimiters.class);
    StoreId _lclStoreId = new StoreId(1L);
    assertEquals(0L,
        (new TransactionBlockServiceMemImpl(_log, _poooServerRef,
            new TransactionSyncEnvironment(_cntanTransactionBlockLimiters, KernelVersion.V2_3,
                _lclStoreId, 1L,
                1L,
                null, new SimpleMetaDataProvider()))).progress());
  }

  @Test
  void testReadChunk() throws Exception {
    TransactionBlockLimiters transactionBlockLimiters = mock(TransactionBlockLimiters.class);
    when(transactionBlockLimiters.isCole(anyLong())).thenReturn(true);
    StoreId _lclStoreId = new StoreId(1L);
    TransactionSyncEnvironment _tpcTransactionSyncEnvironment = new TransactionSyncEnvironment(
        transactionBlockLimiters,
        KernelVersion.V2_3, _lclStoreId, 1L, 1L, null,
        new SimpleMetaDataProvider());

    BufferingLog _log = new BufferingLog();
    TransactionBlockServiceMemImpl transactionBlockServiceMemImpl = new TransactionBlockServiceMemImpl(
        _log,
        new ServerRef(), _tpcTransactionSyncEnvironment);
    assertEquals(AnswerMessageType.AMT_TRX_IS_COMPLETE,
        transactionBlockServiceMemImpl.readChunk(new PooledByteBufAllocator()));
    verify(transactionBlockLimiters).isCole(anyLong());
  }

  @Test
  void testReadChunk2() throws Exception {
    TransactionBlockLimiters transactionBlockLimiters = mock(TransactionBlockLimiters.class);
    when(transactionBlockLimiters.isCole(anyLong())).thenReturn(false);
    StoreId _lclStoreId = new StoreId(1L);
    TransactionSyncEnvironment _tpcTransactionSyncEnvironment = new TransactionSyncEnvironment(
        transactionBlockLimiters,
        KernelVersion.V2_3, _lclStoreId, 1L, 1L, null,
        new SimpleMetaDataProvider());

    BufferingLog _log = new BufferingLog();
    TransactionBlockServiceMemImpl transactionBlockServiceMemImpl = new TransactionBlockServiceMemImpl(
        _log,
        new ServerRef(), _tpcTransactionSyncEnvironment);
    assertEquals(AnswerMessageType.AMT_TRX_IS_COMPLETE,
        transactionBlockServiceMemImpl.readChunk(new PooledByteBufAllocator()));
    verify(transactionBlockLimiters).isCole(anyLong());
  }

  @Test
  void testReadChunk3() throws Exception {
    TransactionBlockLimiters transactionBlockLimiters = mock(TransactionBlockLimiters.class);
    when(transactionBlockLimiters.isCole(anyLong())).thenReturn(true);
    StoreId _lclStoreId = new StoreId(1L);
    TransactionSyncEnvironment _tpcTransactionSyncEnvironment = new TransactionSyncEnvironment(
        transactionBlockLimiters,
        KernelVersion.V2_3, _lclStoreId, 1L, 0L, null,
        new SimpleMetaDataProvider());

    BufferingLog _log = new BufferingLog();
    TransactionBlockServiceMemImpl transactionBlockServiceMemImpl = new TransactionBlockServiceMemImpl(
        _log,
        new ServerRef(), _tpcTransactionSyncEnvironment);
    assertEquals(AnswerMessageType.AMT_TRX_IS_COMPLETE,
        transactionBlockServiceMemImpl.readChunk(new PooledByteBufAllocator()));
    verify(transactionBlockLimiters).isCole(anyLong());
  }
}

