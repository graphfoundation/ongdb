package io.github.onograph.server.security.auth;

import org.eclipse.collections.api.set.primitive.IntSet;


class Procedures {


  private final boolean isPabea;


  private final boolean isPabed;


  private final boolean isPaea;


  private final boolean isPaed;


  private final IntSet pbeaIntSet;


  private final IntSet pbedIntSet;


  private final IntSet peaIntSet;


  private final IntSet pedIntSet;

  Procedures(boolean _isPaea, boolean _isDeap, IntSet _peaIntSet, IntSet _pedIntSet,
      boolean _isAebap, boolean _isPabed, IntSet _pbeaIntSet, IntSet _pbedIntSet) {
    this.isPabea = _isAebap;
    this.isPabed = _isPabed;
    this.isPaea = _isPaea;
    this.isPaed = _isDeap;
    this.pbeaIntSet = _pbeaIntSet;
    this.pbedIntSet = _pbedIntSet;
    this.peaIntSet = _peaIntSet;
    this.pedIntSet = _pedIntSet;
  }


  boolean isAlseupor(int _iIp) {
    if (!this.isPaed && !this.pedIntSet.contains(_iIp)) {
      return this.isPaea || this.peaIntSet.contains(_iIp) || this.isShdbtpe(_iIp);
    } else {
      return false;
    }
  }


  boolean isShdbtpe(int _iIp) {
    if (!this.isPabed && !this.pbedIntSet.contains(_iIp)) {
      return this.isPabea || this.pbeaIntSet.contains(_iIp);
    } else {
      return false;
    }
  }
}
