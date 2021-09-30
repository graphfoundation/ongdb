package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;

class RequestGdbIdTest {

  @Test
  void testConstructor() {
    assertEquals("Gdb Name", (new RequestGdbId("Gdb Name")).getGdbName());
  }

  @Test
  void testConstructor2() {
    RequestGdbId actualRequestGdbId = new RequestGdbId("Gdb Name");
    assertEquals("Gdb Name", actualRequestGdbId.getGdbName());
    assertEquals(AskMessageType.AMT_GDB_GUID, actualRequestGdbId.getTNme());
  }

  @Test
  void testDecbString() {
    assertEquals("RequestGdbId for Gdb Name", (new RequestGdbId("Gdb Name")).decbString());
    assertEquals(
        "RequestGdbId for io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId"
            + ".decbString",
        (new RequestGdbId(
            "io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId.decbString"))
            .decbString());
  }

  @Test
  void testEquals() {
    assertFalse((new RequestGdbId("Gdb Name")).equals(null));
    assertFalse((new RequestGdbId("Gdb Name")).equals("Different type to RequestGdbId"));
  }

  @Test
  void testEquals2() {
    RequestGdbId requestGdbId = new RequestGdbId("Gdb Name");
    assertTrue(requestGdbId.equals(requestGdbId));
    int expectedHashCodeResult = requestGdbId.hashCode();
    assertEquals(expectedHashCodeResult, requestGdbId.hashCode());
  }

  @Test
  void testEquals3() {
    RequestGdbId requestGdbId = new RequestGdbId("Gdb Name");
    RequestGdbId requestGdbId1 = new RequestGdbId("Gdb Name");
    assertTrue(requestGdbId.equals(requestGdbId1));
    int expectedHashCodeResult = requestGdbId.hashCode();
    assertEquals(expectedHashCodeResult, requestGdbId1.hashCode());
  }

  @Test
  void testEquals4() {
    RequestGdbId requestGdbId = new RequestGdbId(null);
    assertFalse(requestGdbId.equals(new RequestGdbId("Gdb Name")));
  }
}

