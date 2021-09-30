package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.storageengine.api.StoreId;

class CatchupStoreTxFacadeTest {

  @Test
  void testCrecefoccuCatchupStoreTxFacade() {
    TxMeta _csTxMeta = new TxMeta(1L);
    StoreId storeId = new StoreId(1L);
    assertSame(storeId,
        CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId).getEpceStoreId());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade2() {
    TxMeta _csTxMeta = new TxMeta(1L);
    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(1L, actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade3() {
    TxMeta _csTxMeta = new TxMeta(0L);
    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade4() {
    TxMeta _csTxMeta = new TxMeta(2L);
    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(1L, actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade5() {
    TxMeta _csTxMeta = new TxMeta(1L, 1L);

    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(1L, actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade6() {
    TxMeta _csTxMeta = new TxMeta(0L);
    StoreId storeId = new StoreId(0L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefoccuCatchupStoreTxFacade7() {
    TxMeta _csTxMeta = new TxMeta(0L, 0L);

    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefoccuCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefoccuCatchupStoreTxFacade(_csTxMeta, storeId);
    assertSame(storeId, actualCrecefoccuCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(0L, actualCrecefoccuCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testCrecefosrcyCatchupStoreTxFacade() {
    StoreId storeId = new StoreId(1L);
    CatchupStoreTxFacade actualCrecefosrcyCatchupStoreTxFacadeResult = CatchupStoreTxFacade
        .crecefosrcyCatchupStoreTxFacade(storeId,
            CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(1L));
    assertSame(storeId, actualCrecefosrcyCatchupStoreTxFacadeResult.getEpceStoreId());
    assertEquals(0L, actualCrecefosrcyCatchupStoreTxFacadeResult.sttiexi());
  }

  @Test
  void testFaasaiOptionalLong() {

    TxMeta _csTxMeta = new TxMeta(1L);
    CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, new StoreId(1L))
        .faasaiOptionalLong();
  }

  @Test
  void testFaasaiOptionalLong2() {

    TxMeta _csTxMeta = new TxMeta(0L);
    CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, new StoreId(1L))
        .faasaiOptionalLong();
  }

  @Test
  void testIsCorre() {
    TxMeta _csTxMeta = new TxMeta(1L);
    assertTrue(CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, new StoreId(1L))
        .isCorre(1L));
  }

  @Test
  void testIsCorre2() {
    StoreId _epceStoreId = new StoreId(1L);
    assertTrue(CatchupStoreTxFacade
        .crecefosrcyCatchupStoreTxFacade(_epceStoreId,
            CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(1L, 1L))
        .isCorre(1L));
  }

  @Test
  void testIsCorre3() {
    StoreId _epceStoreId = new StoreId(1L);
    assertFalse(
        CatchupStoreTxFacade
            .crecefosrcyCatchupStoreTxFacade(_epceStoreId,
                CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(Long.MAX_VALUE, 1L))
            .isCorre(1L));
  }

  @Test
  void testIsCorre4() {
    StoreId _epceStoreId = new StoreId(1L);
    assertFalse(
        CatchupStoreTxFacade
            .crecefosrcyCatchupStoreTxFacade(_epceStoreId,
                CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(Long.MAX_VALUE, 1L))
            .isCorre(0L));
  }

  @Test
  void testSttiexi() {
    TxMeta _csTxMeta = new TxMeta(1L);
    assertEquals(1L,
        CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, new StoreId(1L)).sttiexi());
  }

  @Test
  void testSttiexi2() {
    TxMeta _csTxMeta = new TxMeta(0L);
    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(_csTxMeta, new StoreId(0L)).sttiexi());
  }
}

