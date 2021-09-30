package io.github.onograph.server.security.auth;

import org.eclipse.collections.api.map.primitive.IntObjectMap;
import org.eclipse.collections.api.set.primitive.IntSet;


class Properties {


  private final IntObjectMap<IntSet> intObjectMapPflIntSet;


  private final IntObjectMap<IntSet> intObjectMapPftrIntSet;


  private final boolean isApart;


  private final boolean isLapa;


  private final IntSet lafpnIntSet;


  private final IntSet paflIntSet;


  private final IntSet paftrIntSet;


  private final IntSet tafprIntSet;


  Properties(IntObjectMap<IntSet> _intObjectMapPflIntSet,
      IntObjectMap<IntSet> _intObjectMapPftrIntSet, boolean _isLapa, boolean _isTrapa,
      IntSet _lafpnIntSet, IntSet _paflIntSet, IntSet _paftrIntSet, IntSet _tafprIntSet) {
    this.intObjectMapPflIntSet = _intObjectMapPflIntSet;
    this.intObjectMapPftrIntSet = _intObjectMapPftrIntSet;
    this.isApart = _isTrapa;
    this.isLapa = _isLapa;
    this.lafpnIntSet = _lafpnIntSet;
    this.paflIntSet = _paflIntSet;
    this.paftrIntSet = _paftrIntSet;
    this.tafprIntSet = _tafprIntSet;
  }


  public IntObjectMap<IntSet> getIntObjectMapPflIntSet() {
    return this.intObjectMapPflIntSet;
  }


  public IntObjectMap<IntSet> getIntObjectMapPftrIntSet() {
    return this.intObjectMapPftrIntSet;
  }


  public boolean getIsApart() {
    return this.isApart;
  }


  public boolean getIsLapa() {
    return this.isLapa;
  }


  public IntSet getLafpnIntSet() {
    return this.lafpnIntSet;
  }


  public IntSet getPaflIntSet() {
    return this.paflIntSet;
  }


  public IntSet getPaftrIntSet() {
    return this.paftrIntSet;
  }


  public IntSet getTafprIntSet() {
    return this.tafprIntSet;
  }
}
