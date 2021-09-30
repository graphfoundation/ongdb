package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.collections.api.set.primitive.IntSet;
import org.eclipse.collections.impl.map.mutable.primitive.IntObjectHashMap;
import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.junit.jupiter.api.Test;

class PropertiesTest {

  @Test
  void testConstructor() {
    IntObjectHashMap<IntSet> newMapResult = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> newMapResult1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet intHashSet = new IntHashSet();
    IntHashSet intHashSet1 = new IntHashSet();
    IntHashSet intHashSet2 = new IntHashSet();
    IntHashSet intHashSet3 = new IntHashSet();
    Properties actualProperties = new Properties(newMapResult, newMapResult1, true, true,
        intHashSet, intHashSet1,
        intHashSet2, intHashSet3);

    assertSame(newMapResult, actualProperties.getIntObjectMapPflIntSet());
    assertSame(newMapResult1, actualProperties.getIntObjectMapPftrIntSet());
    assertTrue(actualProperties.getIsApart());
    assertTrue(actualProperties.getIsLapa());
    assertSame(intHashSet, actualProperties.getLafpnIntSet());
    assertSame(intHashSet1, actualProperties.getPaflIntSet());
    assertSame(intHashSet2, actualProperties.getPaftrIntSet());
    assertSame(intHashSet3, actualProperties.getTafprIntSet());
  }
}

