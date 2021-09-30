package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.config.EntProVer;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.helpers.collection.Pair;

class ChangeComProRequestImplTest {

  @Test
  void testDipcForSe() {

    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(_listPmPair,
        " str Npa",
        new EntProVer(1, 1));
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    changeComProRequestImpl
        .dipcForSe(clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testEquals() {
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(_listPmPair,
        " str Npa",
        new EntProVer(1, 1));
    ArrayList<Pair<String, String>> _listPmPair1 = new ArrayList<Pair<String, String>>();
    ChangeComProRequestImpl changeComProRequestImpl1 = new ChangeComProRequestImpl(_listPmPair1,
        " str Npa",
        new EntProVer(1, 1));

    assertTrue(changeComProRequestImpl.equals(changeComProRequestImpl1));
    int expectedHashCodeResult = changeComProRequestImpl.hashCode();
    assertEquals(expectedHashCodeResult, changeComProRequestImpl1.hashCode());
  }

  @Test
  void testEquals2() {
    ArrayList<Pair<String, String>> pairList = new ArrayList<Pair<String, String>>();
    pairList.add(null);
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(pairList,
        " str Npa",
        new EntProVer(1, 1));
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    assertFalse(
        changeComProRequestImpl.equals(
            new ChangeComProRequestImpl(_listPmPair, " str Npa", new EntProVer(1, 1))));
  }

  @Test
  void testEquals3() {
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(_listPmPair, null,
        new EntProVer(1, 1));
    ArrayList<Pair<String, String>> _listPmPair1 = new ArrayList<Pair<String, String>>();
    assertFalse(
        changeComProRequestImpl.equals(
            new ChangeComProRequestImpl(_listPmPair1, " str Npa", new EntProVer(1, 1))));
  }

  @Test
  void testEquals4() {
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(_listPmPair,
        " str Npa",
        new EntProVer(0, 1));
    ArrayList<Pair<String, String>> _listPmPair1 = new ArrayList<Pair<String, String>>();
    assertFalse(
        changeComProRequestImpl.equals(
            new ChangeComProRequestImpl(_listPmPair1, " str Npa", new EntProVer(1, 1))));
  }

  @Test
  void testEquals5() {
    ChangeComProRequestImpl changeComProRequestImpl = new ChangeComProRequestImpl(
        new ArrayList<Pair<String, String>>(),
        " str Npa", mock(EntProVer.class));
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    assertFalse(
        changeComProRequestImpl.equals(
            new ChangeComProRequestImpl(_listPmPair, " str Npa", new EntProVer(1, 1))));
  }

  @Test
  void testEquals6() {
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    assertFalse(
        (new ChangeComProRequestImpl(_listPmPair, " str Npa", new EntProVer(1, 1))).equals(null));
  }

  @Test
  void testEquals7() {
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    assertFalse(
        (new ChangeComProRequestImpl(_listPmPair, " str Npa", new EntProVer(1, 1))).equals(0));
  }
}

