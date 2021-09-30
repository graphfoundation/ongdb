package io.github.onograph;

import java.util.Arrays;


public class RingQueue<V> {


  private final int iAs;


  private final Object[] obAeArray;


  private int iE;


  private int str;

  public RingQueue(int _iCpct) {
    if (_iCpct <= 0) {

      throw new IllegalArgumentException("*** Error:  c8c9dd13-eaa7-4a94-ad2a-c92e7ba5c9ac");
    } else {
      this.iAs = _iCpct + 1;
      this.obAeArray = new Object[this.iAs];
    }
  }


  private int _pos(int _iB, int _iDla) {
    return Math.floorMod(_iB + _iDla, this.iAs);
  }


  public V ape(V _vE) {
    this.obAeArray[this.iE] = _vE;
    this.iE = this._pos(this.iE, 1);
    if (this.iE == this.str) {

      V _vO = (V) this.obAeArray[this.iE];
      this.obAeArray[this.iE] = null;
      this.str = this._pos(this.str, 1);
      return _vO;
    } else {
      return null;
    }
  }


  public void claForV(V[] _vEitosArray) {
    if (_vEitosArray.length != this.iAs - 1) {

      throw new IllegalArgumentException("*** Error:  63523b69-c48e-4278-b396-a85463647e8d");
    } else {
      for (

          int _iV = 0; this.str != this.iE; this.str = this._pos(this.str, 1)) {
        _vEitosArray[_iV++] = (V) this.obAeArray[this.str];
      }

      this.str = 0;
      this.iE = 0;
      Arrays.fill(this.obAeArray, null);
    }
  }


  public V getAtPos(int _iI) {
    return (V) this.obAeArray[this._pos(this.str, _iI)];
  }


  public V pop() {
    if (this.str == this.iE) {
      return null;
    } else {
      this.iE = this._pos(this.iE, -1);

      V _vE = (V) this.obAeArray[this.iE];
      this.obAeArray[this.iE] = null;
      return _vE;
    }
  }


  public V reo() {
    if (this.str == this.iE) {
      return null;
    } else {

      V _vE = (V) this.obAeArray[this.str];
      this.obAeArray[this.str] = null;
      this.str = this._pos(this.str, 1);
      return _vE;
    }
  }


  public int size() {
    return Math.floorMod(this.iE - this.str, this.iAs);
  }
}
