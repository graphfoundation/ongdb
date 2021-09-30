package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import org.neo4j.io.pagecache.ByteArrayPageCursor;

class HighLimitEncEnumTest {

  @Test
  void testDeoForPa() throws UnsupportedEncodingException {
    assertEquals(-82242L,
        HighLimitEncEnum.deoForPa(
            new ByteArrayPageCursor("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
  }

  @Test
  void testEnoForPa() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    HighLimitEncEnum.enoForPa(1L, byteArrayPageCursor);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa2() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    HighLimitEncEnum.enoForPa(-1L, byteArrayPageCursor);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa3() throws UnsupportedEncodingException {
    assertThrows(UnsupportedOperationException.class,
        () -> HighLimitEncEnum.enoForPa(Long.MAX_VALUE,
            new ByteArrayPageCursor(
                "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
  }

  @Test
  void testEnoForPa4() {
    assertThrows(UnsupportedOperationException.class,
        () -> HighLimitEncEnum.enoForPa(Long.MAX_VALUE, new ByteArrayPageCursor(new byte[]{})));
  }

  @Test
  void testLeg() {
    assertEquals(3, HighLimitEncEnum.leg(1L));
    assertEquals(3, HighLimitEncEnum.leg(-1L));
    assertThrows(UnsupportedOperationException.class, () -> HighLimitEncEnum.leg(Long.MAX_VALUE));
  }

  @Test
  void testToable() {
    assertEquals(2L, HighLimitEncEnum.toable(1L, 1L));
    assertEquals(1L, HighLimitEncEnum.toable(0L, 1L));
    assertEquals(6L, HighLimitEncEnum.toable(5L, 1L));
    assertEquals(0L, HighLimitEncEnum.toable(-1L, 1L));
    assertEquals(Long.MAX_VALUE, HighLimitEncEnum.toable(Long.MAX_VALUE, 0L));
  }

  @Test
  void testTorete() {
    assertEquals(0L, HighLimitEncEnum.torete(1L, 1L));
    assertEquals(1L, HighLimitEncEnum.torete(0L, 1L));
    assertEquals(-4L, HighLimitEncEnum.torete(5L, 1L));
    assertEquals(2L, HighLimitEncEnum.torete(-1L, 1L));
    assertEquals(Long.MAX_VALUE, HighLimitEncEnum.torete(Long.MIN_VALUE, -1L));
  }
}

