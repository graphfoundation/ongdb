package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.eclipse.collections.impl.set.mutable.primitive.SynchronizedIntSet;
import org.junit.jupiter.api.Test;

class ProceduresTest {

  @Test
  void testConstructor() {

    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    new Procedures(true, true, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet, new IntHashSet());
  }

  @Test
  void testIsAlseupor() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse(
        (new Procedures(true, true, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
            new IntHashSet())).isAlseupor(1));
  }

  @Test
  void testIsAlseupor2() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue(
        (new Procedures(true, false, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
            new IntHashSet())).isAlseupor(1));
  }

  @Test
  void testIsAlseupor3() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse((new Procedures(false, false, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
        new IntHashSet()))
        .isAlseupor(1));
  }

  @Test
  void testIsAlseupor4() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet(1, 1, 1, 1, 1, 1, 1, 1);
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse(
        (new Procedures(true, false, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
            new IntHashSet())).isAlseupor(1));
  }

  @Test
  void testIsAlseupor5() {
    IntHashSet _peaIntSet = new IntHashSet(1, 1, 1, 1, 1, 1, 1, 1);
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue((new Procedures(false, false, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
        new IntHashSet()))
        .isAlseupor(1));
  }

  @Test
  void testIsAlseupor6() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue((new Procedures(false, false, _peaIntSet, _pedIntSet, true, false, _pbeaIntSet,
        new IntHashSet()))
        .isAlseupor(1));
  }

  @Test
  void testIsAlseupor7() {
    IntHashSet _peaIntSet = new IntHashSet();
    SynchronizedIntSet _pedIntSet = new SynchronizedIntSet(new IntHashSet());
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue(
        (new Procedures(true, false, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
            new IntHashSet())).isAlseupor(1));
  }

  @Test
  void testIsShdbtpe() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse(
        (new Procedures(true, true, _peaIntSet, _pedIntSet, true, true, _pbeaIntSet,
            new IntHashSet())).isShdbtpe(1));
  }

  @Test
  void testIsShdbtpe2() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue(
        (new Procedures(true, true, _peaIntSet, _pedIntSet, true, false, _pbeaIntSet,
            new IntHashSet())).isShdbtpe(1));
  }

  @Test
  void testIsShdbtpe3() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse(
        (new Procedures(true, true, _peaIntSet, _pedIntSet, false, false, _pbeaIntSet,
            new IntHashSet())).isShdbtpe(1));
  }

  @Test
  void testIsShdbtpe4() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertFalse((new Procedures(true, true, _peaIntSet, _pedIntSet, true, false, _pbeaIntSet,
        new IntHashSet(1, 1, 1, 1, 1, 1, 1, 1))).isShdbtpe(1));
  }

  @Test
  void testIsShdbtpe5() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet(1, 1, 1, 1, 1, 1, 1, 1);
    assertTrue(
        (new Procedures(true, true, _peaIntSet, _pedIntSet, false, false, _pbeaIntSet,
            new IntHashSet())).isShdbtpe(1));
  }

  @Test
  void testIsShdbtpe6() {
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    assertTrue((new Procedures(true, true, _peaIntSet, _pedIntSet, true, false, _pbeaIntSet,
        new SynchronizedIntSet(new IntHashSet()))).isShdbtpe(1));
  }
}

