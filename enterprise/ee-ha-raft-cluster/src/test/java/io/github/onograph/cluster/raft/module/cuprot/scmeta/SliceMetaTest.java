package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SliceMetaTest {

  @Test
  void testConstructor() {
    SliceMeta actualSliceMeta = new SliceMeta(1, " str Nf");

    assertEquals(1, actualSliceMeta.getIAr());
    assertEquals(" str Nf", actualSliceMeta.getStrNf());
  }

  @Test
  void testConstructor2() {
    SliceMeta actualSliceMeta = new SliceMeta(" str Nf");
    assertEquals(1, actualSliceMeta.getIAr());
    assertEquals(" str Nf", actualSliceMeta.getStrNf());
  }

  @Test
  void testEquals() {
    assertFalse((new SliceMeta(" str Nf")).equals(null));
    assertFalse((new SliceMeta(" str Nf")).equals("Different type to SliceMeta"));
  }

  @Test
  void testEquals2() {
    SliceMeta sliceMeta = new SliceMeta(" str Nf");
    assertTrue(sliceMeta.equals(sliceMeta));
    int expectedHashCodeResult = sliceMeta.hashCode();
    assertEquals(expectedHashCodeResult, sliceMeta.hashCode());
  }

  @Test
  void testEquals3() {
    SliceMeta sliceMeta = new SliceMeta(" str Nf");
    SliceMeta sliceMeta1 = new SliceMeta(" str Nf");
    assertTrue(sliceMeta.equals(sliceMeta1));
    int expectedHashCodeResult = sliceMeta.hashCode();
    assertEquals(expectedHashCodeResult, sliceMeta1.hashCode());
  }

  @Test
  void testEquals4() {
    SliceMeta sliceMeta = new SliceMeta(null);
    assertFalse(sliceMeta.equals(new SliceMeta(" str Nf")));
  }

  @Test
  void testEquals5() {
    SliceMeta sliceMeta = new SliceMeta(-1, " str Nf");
    assertFalse(sliceMeta.equals(new SliceMeta(" str Nf")));
  }
}

