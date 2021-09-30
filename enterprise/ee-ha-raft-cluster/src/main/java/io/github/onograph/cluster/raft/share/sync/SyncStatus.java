package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;


public class SyncStatus {


  private final Semaphore rsSemaphore = new Semaphore(0);


  private final Semaphore srSemaphore = new Semaphore(0);


  private volatile boolean isRi;


  private volatile FSMData rslFSMData;


  public void awirel() throws InterruptedException {
    if (this.rslFSMData == null) {
      this.rsSemaphore.acquire();
    }
  }


  public void awrcn(long _lgTm) throws InterruptedException {
    if (!this.isRi) {
      this.srSemaphore.tryAcquire(_lgTm, TimeUnit.MILLISECONDS);
    }
  }


  public boolean getIsRi() {
    return this.isRi;
  }


  public FSMData getRslFSMData() {
    return this.rslFSMData;
  }


  void reierelForFS(FSMData _rslFSMData) {
    this.rslFSMData = _rslFSMData;
    this.rsSemaphore.release();
  }


  public void serlad() {
    this.isRi = true;
    this.srSemaphore.release();
  }


  public void trerliee() {
    this.srSemaphore.release();
  }
}
