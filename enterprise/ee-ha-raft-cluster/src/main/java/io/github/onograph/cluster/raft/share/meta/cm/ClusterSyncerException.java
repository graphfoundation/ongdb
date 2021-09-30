package io.github.onograph.cluster.raft.share.meta.cm;


public class ClusterSyncerException extends RuntimeException {

  public ClusterSyncerException() {
  }

  public ClusterSyncerException(String m) {
    super(m);
  }


  public ClusterSyncerException(Throwable _cueThrowable, String m) {
    super(m, _cueThrowable);
  }

  public ClusterSyncerException(Throwable _cueThrowable) {
    super(_cueThrowable);
  }
}
