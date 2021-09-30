package io.github.onograph.cluster.raft.module.cuprot.current.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class GdbAuthActionsTest {

  @Test
  void testConstructor() {
    ArrayList<String> _listSrString = new ArrayList<String>();
    GdbAuthActions actualGdbAuthActions = new GdbAuthActions(_listSrString,
        new ArrayList<String>());

    assertTrue(actualGdbAuthActions.listUsrstString.isEmpty());
    assertTrue(actualGdbAuthActions.listRoestString.isEmpty());
  }

  @Test
  void testGecmdList() {
    ArrayList<String> _listSrString = new ArrayList<String>();
    assertTrue((new GdbAuthActions(_listSrString, new ArrayList<String>())).gecmdList().isEmpty());
  }

  @Test
  void testIsEmy() {
    ArrayList<String> _listSrString = new ArrayList<String>();
    assertTrue((new GdbAuthActions(_listSrString, new ArrayList<String>())).isEmy());
  }

  @Test
  void testIsEmy2() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    assertFalse((new GdbAuthActions(stringList, new ArrayList<String>())).isEmy());
  }

  @Test
  void testIsEmy3() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    assertFalse((new GdbAuthActions(new ArrayList<String>(), stringList)).isEmy());
  }
}

