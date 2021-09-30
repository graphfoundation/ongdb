package io.github.onograph.dbms;


class GdbReplicatorDbmsManagerSystemListeningImpl implements
    io.github.onograph.dbms.GdbReplicator.ListenEvents {


  private final KernelDbmsManager osKernelDbmsManager;

  GdbReplicatorDbmsManagerSystemListeningImpl(KernelDbmsManager _osKernelDbmsManager) {
    this.osKernelDbmsManager = _osKernelDbmsManager;
  }

  @Override
  public void strread(long transIdx) {
    this.osKernelDbmsManager.strread(transIdx);
  }

  @Override
  public void tranci(long transIdx) {
    this.osKernelDbmsManager.tranci(transIdx);
  }
}
