package io.github.onograph.cluster.raft.module.cuprot.scmeta;


public class GdbStoreSyncCrlException extends Exception {

  public GdbStoreSyncCrlException(Throwable _cueThrowable) {
    super(_cueThrowable);
  }

  public GdbStoreSyncCrlException(String m) {
    super(m);
  }


  public GdbStoreSyncCrlException(Exception _exception, String m) {
    super(m, _exception);
  }
}
