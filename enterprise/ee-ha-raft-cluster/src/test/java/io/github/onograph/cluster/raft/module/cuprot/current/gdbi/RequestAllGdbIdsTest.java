package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;

class RequestAllGdbIdsTest {

  @Test
  void testConstructor() {
    assertEquals(AskMessageType.AMT_ALL_GDB_GUID_ASK, (new RequestAllGdbIds()).getTNme());
  }

  @Test
  void testDecbString() {
    assertEquals("RequestAllGdbIds", (new RequestAllGdbIds()).decbString());
  }
}

