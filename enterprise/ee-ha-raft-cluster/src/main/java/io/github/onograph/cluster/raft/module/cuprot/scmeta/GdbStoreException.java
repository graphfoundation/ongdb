package io.github.onograph.cluster.raft.module.cuprot.scmeta;


public class GdbStoreException extends Exception {

  public GdbStoreException(Throwable _cueThrowable) {
    super(_cueThrowable);
  }

  public GdbStoreException(String m) {
    super(m);
  }


  public GdbStoreException(Throwable _cueThrowable, String m) {
    super(m, _cueThrowable);
  }
}
