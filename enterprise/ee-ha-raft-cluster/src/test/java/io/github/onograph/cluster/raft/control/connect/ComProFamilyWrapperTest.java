package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ComProFamilyWrapperTest {

  @Test
  void testComProFamilyBuilderBulComProFamilyWrapper() {
    ComProFamilyWrapper actualBulComProFamilyWrapperResult = ComProFamilyWrapper
        .bulrComProFamilyWrapperComProFamilyBuilder()
        .bulComProFamilyWrapper();
    assertTrue(actualBulComProFamilyWrapperResult.getListPmMutableComProFamily().isEmpty());
    assertNull(actualBulComProFamilyWrapperResult.getPaApplicationComProFamily());
  }

  @Test
  void testComProFamilyBuilderMoieComProFamilyWrapperComProFamilyBuilder() {
    ComProFamilyWrapper.ComProFamilyBuilder bulrComProFamilyWrapperComProFamilyBuilderResult = ComProFamilyWrapper
        .bulrComProFamilyWrapperComProFamilyBuilder();
    assertSame(bulrComProFamilyWrapperComProFamilyBuilderResult,
        bulrComProFamilyWrapperComProFamilyBuilderResult
            .moieComProFamilyWrapperComProFamilyBuilder(mock(MutableComProFamily.class)));
  }

  @Test
  void testConstructor() {
    assertNull((new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(),
        null)).getPaApplicationComProFamily());
  }

  @Test
  void testConstructor2() {
    ComProFamilyWrapper actualComProFamilyWrapper = new ComProFamilyWrapper(
        new ArrayList<MutableComProFamily>(), null);

    assertTrue(actualComProFamilyWrapper.getListPmMutableComProFamily().isEmpty());
    assertNull(actualComProFamilyWrapper.getPaApplicationComProFamily());
  }

  @Test
  void testBulrComProFamilyWrapperComProFamilyBuilder() {

    ComProFamilyWrapper.bulrComProFamilyWrapperComProFamilyBuilder();
  }

  @Test
  void testEquals() {
    assertFalse((new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(), null)).equals(null));
    assertFalse((new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(), null))
        .equals("Different type to ComProFamilyWrapper"));
  }

  @Test
  void testEquals2() {
    ComProFamilyWrapper comProFamilyWrapper = new ComProFamilyWrapper(
        new ArrayList<MutableComProFamily>(), null);
    assertTrue(comProFamilyWrapper.equals(comProFamilyWrapper));
    int expectedHashCodeResult = comProFamilyWrapper.hashCode();
    assertEquals(expectedHashCodeResult, comProFamilyWrapper.hashCode());
  }

  @Test
  void testEquals3() {
    ComProFamilyWrapper comProFamilyWrapper = new ComProFamilyWrapper(
        new ArrayList<MutableComProFamily>(), null);
    ComProFamilyWrapper comProFamilyWrapper1 = new ComProFamilyWrapper(
        new ArrayList<MutableComProFamily>(), null);

    assertTrue(comProFamilyWrapper.equals(comProFamilyWrapper1));
    int expectedHashCodeResult = comProFamilyWrapper.hashCode();
    assertEquals(expectedHashCodeResult, comProFamilyWrapper1.hashCode());
  }

  @Test
  void testEquals4() {
    ArrayList<MutableComProFamily> mutableComProFamilyList = new ArrayList<MutableComProFamily>();
    mutableComProFamilyList.add(null);
    ComProFamilyWrapper comProFamilyWrapper = new ComProFamilyWrapper(mutableComProFamilyList,
        null);
    assertFalse(comProFamilyWrapper.equals(
        new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(), null)));
  }

  @Test
  void testEquals5() {
    ComProFamilyWrapper comProFamilyWrapper = new ComProFamilyWrapper(
        new ArrayList<MutableComProFamily>(),
        mock(ApplicationComProFamily.class));
    assertFalse(comProFamilyWrapper.equals(
        new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(), null)));
  }
}

