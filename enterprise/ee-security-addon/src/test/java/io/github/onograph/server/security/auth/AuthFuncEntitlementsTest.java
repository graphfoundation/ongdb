package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.junit.jupiter.api.Test;

class AuthFuncEntitlementsTest {

  @Test
  void testConstructor() {

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet, _faeaIntSet, _faedIntSet, _fbeaIntSet,
        _fbedIntSet, _feaIntSet,
        new IntHashSet(), true, true, true, true);
  }

  @Test
  void testIsAletarifnn() {
    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    assertFalse(
        (new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet, _faeaIntSet, _faedIntSet, _fbeaIntSet,
            _fbedIntSet, _feaIntSet, new IntHashSet(), true, true, true, true)).isAletarifnn(1));
  }

  @Test
  void testIsAletfc() {
    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    assertFalse(
        (new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet, _faeaIntSet, _faedIntSet, _fbeaIntSet,
            _fbedIntSet, _feaIntSet, new IntHashSet(), true, true, true, true)).isAletfc(1));
  }

  @Test
  void testIsShdbtaenfc() {
    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    assertFalse(
        (new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet, _faeaIntSet, _faedIntSet, _fbeaIntSet,
            _fbedIntSet, _feaIntSet, new IntHashSet(), true, true, true, true)).isShdbtaenfc(1));
  }

  @Test
  void testIsShdbtft() {
    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    assertFalse(
        (new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet, _faeaIntSet, _faedIntSet, _fbeaIntSet,
            _fbedIntSet, _feaIntSet, new IntHashSet(), true, true, true, true)).isShdbtft(1));
  }
}

