package io.github.onograph.dbms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


final class ReentrantLockReconcilerManager {


  private final Map<String, Integer> mapWpsi = new HashMap();


  private final ReentrantLock reentrantLock = new ReentrantLock(true);


  private final Condition rtaCondition;


  private final Set<String> setRcniiString = new HashSet();

  ReentrantLockReconcilerManager() {
    this.rtaCondition = this.reentrantLock.newCondition();
  }


  private void _acrpoForSt(String gdbName) throws InterruptedException {
    this.reentrantLock.lock();

    try {
      this._inmprtwtForSt(gdbName);

      while (this.setRcniiString.contains(gdbName)) {
        this.rtaCondition.await();
      }

      this.setRcniiString.add(gdbName);
    } finally {
      this._demprtwtForSt(gdbName);
      this.reentrantLock.unlock();
    }
  }


  private void _acueForSt(String gdbName) throws InterruptedException {
    this.reentrantLock.lock();

    try {
      while (this.setRcniiString.contains(gdbName) || this.mapWpsi.getOrDefault(gdbName, 0) > 0) {
        this.rtaCondition.await();
      }

      this.setRcniiString.add(gdbName);
    } finally {
      this.reentrantLock.unlock();
    }
  }


  private void _demprtwtForSt(String gdbName) {
    this.mapWpsi.compute(gdbName, (key, value) ->
    {
      return value != null && value > 1 ? value - 1 : null;
    });
  }


  private void _inmprtwtForSt(String gdbName) {
    this.mapWpsi.compute(gdbName, (key, value) ->
    {
      return value == null ? 1 : value + 1;
    });
  }


  public void acuelconForDbSt(String gdbName, DbmsResolverAction _rqetDbmsResolverAction)
      throws InterruptedException {
    if (_rqetDbmsResolverAction.isShdbeedapiyfForSt(gdbName)) {
      this._acrpoForSt(gdbName);
    } else {
      this._acueForSt(gdbName);
    }
  }


  public void reeelconForSt(String gdbName) {
    this.reentrantLock.lock();

    try {
      if (!this.setRcniiString.remove(gdbName)) {

        throw new IllegalMonitorStateException("*** Error: 43bdd2fc-08eb-4e1a-9c9b-ee35009b951a");
      }

      this.rtaCondition.signalAll();
    } finally {
      this.reentrantLock.unlock();
    }
  }
}
