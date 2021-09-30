package io.github.onograph.cluster.raft.module.cuprot;


public class CatchupManagerException extends Exception {

  public CatchupManagerException() {
  }

  CatchupManagerException(String m) {
    super(m);
  }


  CatchupManagerException(Throwable _cueThrowable, String _strOeain) {
    super(_strOeain, _cueThrowable);
  }
}
