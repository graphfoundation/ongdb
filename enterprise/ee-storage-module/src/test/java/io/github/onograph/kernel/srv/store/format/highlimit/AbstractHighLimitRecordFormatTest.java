package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import org.neo4j.io.pagecache.ByteArrayPageCursor;

class AbstractHighLimitRecordFormatTest {

  @Test
  void testDeecrdrrForPa() throws UnsupportedEncodingException {
    assertEquals(-82242L, AbstractHighLimitRecordFormat.deecrdrrForPa(1L, 1L, 1,
        new ByteArrayPageCursor("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
    assertEquals(-82242L, AbstractHighLimitRecordFormat.deecrdrrForPa(0L, 1L, 1,
        new ByteArrayPageCursor("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
    assertEquals(1L, AbstractHighLimitRecordFormat.deecrdrrForPa(1L, 0L, 1,
        new ByteArrayPageCursor("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
    assertEquals(1L, AbstractHighLimitRecordFormat.deecrdrrForPa(1L, 0L, 1,
        new ByteArrayPageCursor(new byte[]{})));
    assertEquals(-82242L, AbstractHighLimitRecordFormat
        .deecrdrrForPa(new ByteArrayPageCursor("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))));
  }

  @Test
  void testEnoForPa() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    AbstractHighLimitRecordFormat.enoForPa(1L, byteArrayPageCursor, 1L);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa2() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    AbstractHighLimitRecordFormat.enoForPa(0L, byteArrayPageCursor, 1L);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa3() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    AbstractHighLimitRecordFormat.enoForPa(1L, byteArrayPageCursor, -1L);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa4() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    AbstractHighLimitRecordFormat.enoForPa(Long.MAX_VALUE, byteArrayPageCursor, Long.MAX_VALUE);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa5() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    AbstractHighLimitRecordFormat.enoForPa(byteArrayPageCursor, 1L);
    assertEquals('A', byteArrayPageCursor.getByte());
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
  }

  @Test
  void testEnoForPa6() throws UnsupportedEncodingException {
    ByteArrayPageCursor byteArrayPageCursor = new ByteArrayPageCursor(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), 2,
        3);

    AbstractHighLimitRecordFormat.enoForPa(byteArrayPageCursor, 1L);
    assertEquals(0L, byteArrayPageCursor.getCurrentPageId());
    assertEquals(5, byteArrayPageCursor.getOffset());
  }

  @Test
  void testLeg() {
    assertEquals(3, AbstractHighLimitRecordFormat.leg(1L));
    assertEquals(3, AbstractHighLimitRecordFormat.leg(-1L));
    assertEquals(0, AbstractHighLimitRecordFormat.leg(1L, 1L));
    assertEquals(3, AbstractHighLimitRecordFormat.leg(0L, 1L));
    assertEquals(3, AbstractHighLimitRecordFormat.leg(5L, 1L));
    assertEquals(3, AbstractHighLimitRecordFormat.leg(-1L, 1L));
    assertEquals(3, AbstractHighLimitRecordFormat.leg(1L, -1L));
    assertEquals(0, AbstractHighLimitRecordFormat.leg(Long.MAX_VALUE, Long.MAX_VALUE));
  }

  @Test
  void testSet() {
    assertEquals('A', AbstractHighLimitRecordFormat.set(1L, (byte) 'A', 1, 1L));
    assertEquals('A', AbstractHighLimitRecordFormat.set(0L, (byte) 'A', 1, 1L));
    assertEquals('A', AbstractHighLimitRecordFormat.set(5L, (byte) 'A', 1, 1L));
    assertEquals('A', AbstractHighLimitRecordFormat.set(-1L, (byte) 'A', 1, 1L));
  }
}

