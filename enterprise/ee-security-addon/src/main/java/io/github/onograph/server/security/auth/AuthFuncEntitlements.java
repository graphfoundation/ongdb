package io.github.onograph.server.security.auth;

import org.eclipse.collections.api.set.primitive.IntSet;


class AuthFuncEntitlements {


  private final IntSet aebfIntSet;


  private final IntSet aefIntSet;


  private final IntSet fabeaIntSet;


  private final IntSet fabedIntSet;


  private final IntSet faeaIntSet;


  private final IntSet faedIntSet;


  private final IntSet fbedIntSet;


  private final IntSet fedIntSet;


  private final boolean isFabea;


  private final boolean isFabed;


  private final boolean isFaea;


  private final boolean isFaed;


  AuthFuncEntitlements(IntSet _fabeaIntSet, IntSet _fabedIntSet, IntSet _faeaIntSet,
      IntSet _faedIntSet, IntSet _fbeaIntSet, IntSet _fbedIntSet, IntSet _feaIntSet,
      IntSet _fedIntSet, boolean _isFabea, boolean _isFabed, boolean _isFaea, boolean _isFaed) {
    this.aebfIntSet = _fbeaIntSet;
    this.aefIntSet = _feaIntSet;
    this.fabeaIntSet = _fabeaIntSet;
    this.fabedIntSet = _fabedIntSet;
    this.faeaIntSet = _faeaIntSet;
    this.faedIntSet = _faedIntSet;
    this.fbedIntSet = _fbedIntSet;
    this.fedIntSet = _fedIntSet;
    this.isFabea = _isFabea;
    this.isFabed = _isFabed;
    this.isFaea = _isFaea;
    this.isFaed = _isFaed;
  }


  boolean isAletarifnn(int _iI) {
    if (!this.isFaed && !this.faedIntSet.contains(_iI)) {
      return this.isFaea || this.faeaIntSet.contains(_iI) || this.isShdbtaenfc(_iI);
    } else {
      return false;
    }
  }


  boolean isAletfc(int _iI) {
    if (!this.isFaed && !this.fedIntSet.contains(_iI)) {
      return this.isFaea || this.aefIntSet.contains(_iI) || this.isShdbtft(_iI);
    } else {
      return false;
    }
  }


  boolean isShdbtaenfc(int _iI) {
    if (!this.isFabed && !this.fabedIntSet.contains(_iI)) {
      return this.isFabea || this.fabeaIntSet.contains(_iI);
    } else {
      return false;
    }
  }


  boolean isShdbtft(int _iI) {
    if (!this.isFabed && !this.fbedIntSet.contains(_iI)) {
      return this.isFabea || this.aebfIntSet.contains(_iI);
    } else {
      return false;
    }
  }
}
