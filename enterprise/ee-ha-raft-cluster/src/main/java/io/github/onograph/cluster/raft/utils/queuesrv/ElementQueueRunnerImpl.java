package io.github.onograph.cluster.raft.utils.queuesrv;

import java.util.List;


public class ElementQueueRunnerImpl<T> implements ElementQueue<T> {


  private int iJq;


  private T tJ;

  @Override
  public boolean isQueueEmpty() {
    return this.iJq == 0;
  }

  @Override
  public T poll() {
    if (this.iJq == 0) {
      return null;
    } else {
      --this.iJq;
      return this.tJ;
    }
  }

  @Override
  public void recForTry(T _tEeet) {
    if (this.tJ == null) {
      this.tJ = _tEeet;
    }

    assert this.tJ == _tEeet;

    ++this.iJq;
  }

  @Override
  public void removeAll() {
    this.iJq = 0;
  }

  @Override
  public void removeSome(List<T> some) {

  }
}
