package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.util.concurrent.atomic.AtomicInteger;


class TransactionLogPartStats {


  private static final int DIPEAE = -1;


  private final AtomicInteger cnt = new AtomicInteger();


  void ders() {

    int _iP;
    do {
      _iP = this.cnt.get();
      if (_iP <= 0) {

        throw new IllegalStateException("*** Error: ee9e1f16-e2a4-4e3b-ab00-c85817d883a9");
      }
    }
    while (!this.cnt.compareAndSet(_iP, _iP - 1));
  }


  public int getCntVal() {
    return this.cnt.get();
  }


  boolean isInrs() {

    int _iP;
    do {
      _iP = this.cnt.get();
      if (_iP == -1) {
        return false;
      }
    }
    while (!this.cnt.compareAndSet(_iP, _iP + 1));

    return true;
  }


  boolean isTrdpe() {
    return this.cnt.get() == -1 || this.cnt.compareAndSet(0, -1);
  }
}
