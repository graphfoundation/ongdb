package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WaitingReplyMetaTypeTest {

  @Test
  void testValueOf() {
    assertEquals(WaitingReplyMetaType.CaughtUp, WaitingReplyMetaType.valueOf("CaughtUp"));
  }

  @Test
  void testValues() {
    WaitingReplyMetaType[] actualValuesResult = WaitingReplyMetaType.values();
    assertEquals(3, actualValuesResult.length);
    assertEquals(WaitingReplyMetaType.CaughtUp, actualValuesResult[0]);
    assertEquals(WaitingReplyMetaType.Incomplete, actualValuesResult[1]);
    assertEquals(WaitingReplyMetaType.Failed, actualValuesResult[2]);
  }
}

