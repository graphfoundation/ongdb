package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CatchupMDTxsWrapperTest {

  @Test
  void testNocotiCatchupMDTxsWrapper() {
    CatchupMDTxsWrapper actualNocotiCatchupMDTxsWrapperResult = CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(
        1L);
    assertEquals(1L, actualNocotiCatchupMDTxsWrapperResult.getLgIts());
    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        actualNocotiCatchupMDTxsWrapperResult.getLgTr());
  }

  @Test
  void testNocotiCatchupMDTxsWrapper2() {
    CatchupMDTxsWrapper actualNocotiCatchupMDTxsWrapperResult = CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(
        1L);
    assertEquals(1L, actualNocotiCatchupMDTxsWrapperResult.getLgIts());
    assertTrue(actualNocotiCatchupMDTxsWrapperResult.isNoreidti());
  }

  @Test
  void testNocotiCatchupMDTxsWrapper3() {
    assertThrows(IllegalArgumentException.class,
        () -> CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL));
  }

  @Test
  void testReueraeCatchupMDTxsWrapper() {
    CatchupMDTxsWrapper actualReueraeCatchupMDTxsWrapperResult = CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(
        1L, 1L);
    assertEquals(1L, actualReueraeCatchupMDTxsWrapperResult.getLgIts());
    assertFalse(actualReueraeCatchupMDTxsWrapperResult.isNoreidti());
  }

  @Test
  void testReueraeCatchupMDTxsWrapper2() {
    CatchupMDTxsWrapper actualReueraeCatchupMDTxsWrapperResult = CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(
        0L, 0L);
    assertEquals(0L, actualReueraeCatchupMDTxsWrapperResult.getLgIts());
    assertFalse(actualReueraeCatchupMDTxsWrapperResult.isNoreidti());
  }

  @Test
  void testReueraeCatchupMDTxsWrapper3() {
    CatchupMDTxsWrapper actualReueraeCatchupMDTxsWrapperResult = CatchupMDTxsWrapper
        .reueraeCatchupMDTxsWrapper(Long.MAX_VALUE, Long.MAX_VALUE);
    assertEquals(Long.MAX_VALUE, actualReueraeCatchupMDTxsWrapperResult.getLgIts());
    assertFalse(actualReueraeCatchupMDTxsWrapperResult.isNoreidti());
  }

  @Test
  void testIsNoreidti() {
    assertTrue(CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(1L).isNoreidti());
    assertFalse(CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(1L, 1L).isNoreidti());
  }
}

