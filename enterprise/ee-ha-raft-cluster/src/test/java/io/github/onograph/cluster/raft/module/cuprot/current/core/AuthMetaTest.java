package io.github.onograph.cluster.raft.module.cuprot.current.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AuthMetaTest {

  @Test
  void testConstructor() {
    ArrayList<String> stringList = new ArrayList<String>();
    assertSame(stringList, (new AuthMeta(stringList)).getListCmadString());
  }

  @Test
  void testEquals() {
    assertFalse((new AuthMeta(new ArrayList<String>())).equals(null));
    assertFalse((new AuthMeta(new ArrayList<String>())).equals("Different type to AuthMeta"));
  }

  @Test
  void testEquals2() {
    AuthMeta authMeta = new AuthMeta(new ArrayList<String>());
    assertTrue(authMeta.equals(authMeta));
    int expectedHashCodeResult = authMeta.hashCode();
    assertEquals(expectedHashCodeResult, authMeta.hashCode());
  }

  @Test
  void testEquals3() {
    AuthMeta authMeta = new AuthMeta(new ArrayList<String>());
    AuthMeta authMeta1 = new AuthMeta(new ArrayList<String>());
    assertTrue(authMeta.equals(authMeta1));
    int expectedHashCodeResult = authMeta.hashCode();
    assertEquals(expectedHashCodeResult, authMeta1.hashCode());
  }

  @Test
  void testEquals4() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    AuthMeta authMeta = new AuthMeta(stringList);
    assertFalse(authMeta.equals(new AuthMeta(new ArrayList<String>())));
  }
}

