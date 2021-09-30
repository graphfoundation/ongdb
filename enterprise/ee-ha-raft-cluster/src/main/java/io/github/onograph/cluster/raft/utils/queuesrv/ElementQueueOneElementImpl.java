package io.github.onograph.cluster.raft.utils.queuesrv;

import java.util.List;


public class ElementQueueOneElementImpl<E> implements ElementQueue<E> {


  private E eNe;

  @Override
  public boolean isQueueEmpty() {
    return this.eNe == null;
  }

  @Override
  public E poll() {

    E _ePle = this.eNe;
    this.eNe = null;
    return _ePle;
  }

  @Override
  public void recForTry(E _eEeet) {
    if (this.eNe == null) {
      this.eNe = _eEeet;
    }
  }

  @Override
  public void removeAll() {
    this.eNe = null;
  }

  @Override
  public void removeSome(List<E> some) {

  }
}
