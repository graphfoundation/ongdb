package io.github.onograph.cluster.raft.share.meta.pit;


public class SyncException extends Exception {


  private final FailureType failureType;


  SyncException(Throwable _cueThrowable, FailureType failureType, String m) {
    super(_meseString(failureType, m), _cueThrowable);
    this.failureType = failureType;
  }


  SyncException(FailureType failureType, String m) {
    super(_meseString(failureType, m));
    this.failureType = failureType;
  }


  private static String _meseString(FailureType failureType, String m) {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.pit.SyncException.format"),
        failureType.name(), m);
  }


  FailureType getFailureType() {
    return this.failureType;
  }


  enum FailureType {


    CRET_ERR,

    FT_ERR,

    FATAL_ERR
  }
}
