package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SyncStatTest {

  @Test
  void testAtetcu() {
    assertEquals(0L, (new SyncStat()).atetcu());
  }

  @Test
  void testClerut() {
    SyncStat syncStat = new SyncStat();
    syncStat.clerut();
    assertEquals(1L, syncStat.nerptco());
  }

  @Test
  void testFalcu() {
    assertEquals(0L, (new SyncStat()).falcu());
  }

  @Test
  void testMabcot() {
    assertEquals(0L, (new SyncStat()).mabcot());
  }

  @Test
  void testMarc() {
    SyncStat syncStat = new SyncStat();
    syncStat.marc();
    assertEquals(1L, syncStat.mabcot());
  }

  @Test
  void testNerptco() {
    assertEquals(0L, (new SyncStat()).nerptco());
  }

  @Test
  void testNorlad() {
    SyncStat syncStat = new SyncStat();
    syncStat.norlad();
    assertEquals(1L, syncStat.falcu());
  }

  @Test
  void testRecnam() {
    SyncStat syncStat = new SyncStat();
    syncStat.recnam();
    assertEquals(1L, syncStat.atetcu());
  }

  @Test
  void testSucscu() {
    assertEquals(0L, (new SyncStat()).sucscu());
  }

  @Test
  void testSuslrle() {
    SyncStat syncStat = new SyncStat();
    syncStat.suslrle();
    assertEquals(1L, syncStat.sucscu());
  }
}

