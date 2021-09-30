package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.util.Arrays;


public class CandidateTermWrapper {


  private long[] lgIdxsArray;


  private long lgM;


  private long lgM2;


  private long[] lgTrsArray;


  private int sz;

  CandidateTermWrapper(long befIdx, long befTLng) {
    this.pass(befTLng, befIdx);
  }


  private String _apemseString(long idx, long _lgTer) {
    return String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.calg.cle.parts.CandidateTermWrapper.format"),
        idx,
        _lgTer);
  }


  private int _firacon(long idx) {
    for (

        int cur = 0; cur < this.lgIdxsArray.length; ++cur) {
      if (this.lgIdxsArray[cur] > idx) {
        return cur - 1;
      }

      if (this.lgIdxsArray[cur] == idx) {
        return cur;
      }
    }

    return idx > this.lgIdxsArray[this.lgIdxsArray.length - 1] ? this.lgIdxsArray.length - 1 : -1;
  }


  private void _sese(int _iSn) {
    if (_iSn != this.sz) {
      this.sz = _iSn;
      this.lgIdxsArray = Arrays.copyOf(this.lgIdxsArray, this.sz);
      this.lgTrsArray = Arrays.copyOf(this.lgTrsArray, this.sz);
    }
  }


  synchronized void ape(long idx, long _lgT) {
    if (idx != this.lgM2 + 1L) {

      throw new IllegalStateException("*** Error: a8c23f3c-575f-4512-a118-8ee53e2d95e1");
    } else if (this.sz > 0 && _lgT < this.lgTrsArray[this.sz - 1]) {

      throw new IllegalStateException("*** Error: 57a8f95b-513d-4e43-b811-bfb4078f8773");
    } else {
      this.lgM2 = idx;
      if (this.sz == 0 || _lgT != this.lgTrsArray[this.sz - 1]) {
        this._sese(this.sz + 1);
        this.lgIdxsArray[this.sz - 1] = idx;
        this.lgTrsArray[this.sz - 1] = _lgT;
      }
    }
  }


  synchronized long findLgTrs(long lgIdx) {
    if (lgIdx != -1L && lgIdx >= this.lgM && lgIdx <= this.lgM2) {
      for (

          int cur = this.sz - 1; cur >= 0; --cur) {
        if (lgIdx >= this.lgIdxsArray[cur]) {
          return this.lgTrsArray[cur];
        }
      }

      throw new RuntimeException("*** Error:  7c820577-0f30-4a2c-b77a-03a8f0fcbd04");
    } else {
      return -1L;
    }
  }


  synchronized long lae() {
    return this.sz == 0 ? -1L : this.lgTrsArray[this.sz - 1];
  }


  synchronized void pass(long befTLng, long befIdx) {
    this.lgM = this.lgM2 = befIdx;
    this.sz = 1;
    this.lgIdxsArray = new long[this.sz];
    this.lgTrsArray = new long[this.sz];
    this.lgIdxsArray[0] = befIdx;
    this.lgTrsArray[0] = befTLng;
  }


  synchronized void prn(long _lgItu) {
    this.lgM = Math.max(_lgItu, this.lgM);

    int _iPtl = this._firacon(this.lgM) - 1;
    if (_iPtl >= 0) {
      this.sz = this.lgIdxsArray.length - 1 - _iPtl;
      this.lgIdxsArray = Arrays.copyOfRange(this.lgIdxsArray, _iPtl + 1, this.lgIdxsArray.length);
      this.lgTrsArray = Arrays.copyOfRange(this.lgTrsArray, _iPtl + 1, this.lgTrsArray.length);
    }
  }


  synchronized void trnt(long sourceIdx) {
    if (sourceIdx < 0L) {

      throw new IllegalStateException("*** Error: bc5fbb61-9a37-48c1-85d4-d23012577e97");
    } else if (sourceIdx < this.lgM) {

      throw new IllegalStateException("*** Error: eee8a7b9-931a-4780-83e0-56ba1f956091");
    } else {
      this.lgM2 = sourceIdx - 1L;

      int _iSn;
      for (_iSn = this.sz; _iSn > 0 && this.lgIdxsArray[_iSn - 1] >= sourceIdx; --_iSn) {
      }

      this._sese(_iSn);
    }
  }
}
