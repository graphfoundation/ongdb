package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.consistency.RecordType;

class NodeStoreWrapperFilterSpecTest {

  @Test
  void testConstructor() {

    new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()));
  }

  @Test
  void testFirrthString() {
    assertNull((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).firrthString(1, null));
  }

  @Test
  void testFitleString() {
    assertEquals(0,
        (new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            null, null, null, null, new NodeWrapperInfoMetrics(new BufferingLog())))
            .fitleString(new long[]{1L, 1L, 1L, 1L}, null).length);
    assertEquals(0,
        (new NodeStoreWrapperFilterSpec(new int[]{0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            null, null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).fitleString(
            new long[]{},
            null).length);
  }

  @Test
  void testIsShddtne() {
    assertFalse((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShddtne(
        new long[]{1L, 1L, 1L, 1L}));
    assertFalse((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{0, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShddtne(
        new long[]{1L, 1L, 1L, 1L}));
    assertTrue((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null, null,
        null,
        null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShddtne(
        new long[]{1L, 1L, 1L, 1L}));
    assertTrue((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{}, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, null,
        null, null, null,
        new NodeWrapperInfoMetrics(new BufferingLog()))).isShddtne(new long[]{1L, 1L, 1L, 1L}));
    assertTrue((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShddtne(new long[]{}));
  }

  @Test
  void testIsShdkprForRe() {
    assertTrue((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShdkprForRe(1,
        new long[]{1L, 1L, 1L,
            1L},
        RecordType.NEO_STORE));
    assertFalse((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null,
        null, null, null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShdkprForRe(1,
        new long[]{1L, 1L,
            1L,
            1L},
        RecordType.NODE));
    assertTrue((new NodeStoreWrapperFilterSpec(new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        null, null,
        null,
        null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShdkprForRe(1,
        new long[]{1L, 1L, 1L, 1L},
        RecordType.NODE));
    assertTrue(
        (new NodeStoreWrapperFilterSpec(new int[]{0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{0, 0, 0, 0},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1}, null, null,
            null,
            null, new NodeWrapperInfoMetrics(new BufferingLog()))).isShdkprForRe(1,
            new long[]{1L, 1L, 1L, 1L},
            RecordType.NODE));
  }
}

