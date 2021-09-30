package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LivingCacheMetaTest {

  @Test
  void testCacheHit() {
    LivingCacheMeta livingCacheMeta = new LivingCacheMeta();
    livingCacheMeta.cacheHit();
    assertEquals(1L, livingCacheMeta.gehs());
  }

  @Test
  void testCacheMiss() {
    LivingCacheMeta livingCacheMeta = new LivingCacheMeta();
    livingCacheMeta.cacheMiss();
    assertEquals(1L, livingCacheMeta.gems());
  }

  @Test
  void testGehs() {
    assertEquals(0L, (new LivingCacheMeta()).gehs());
  }

  @Test
  void testGems() {
    assertEquals(0L, (new LivingCacheMeta()).gems());
  }

  @Test
  void testGetICe() {
    assertEquals(0L, (new LivingCacheMeta()).getICe());
  }

  @Test
  void testGetIEm() {
    assertEquals(0L, (new LivingCacheMeta()).getIEm());
  }

  @Test
  void testConstructor() {
    LivingCacheMeta actualLivingCacheMeta = new LivingCacheMeta();
    actualLivingCacheMeta.seeec(1);
    actualLivingCacheMeta.sembe(1L);
    actualLivingCacheMeta.sememt(1);
    actualLivingCacheMeta.setabys(3L);
    assertEquals(1L, actualLivingCacheMeta.getLgBm());
    assertEquals(3L, actualLivingCacheMeta.getSizeCnt());
  }
}

