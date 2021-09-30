package io.github.onograph.cluster.raft.id;


class ConsensusServiceException extends Exception {

  ConsensusServiceException(String m) {
    super(m);
  }


  ConsensusServiceException(Throwable _cueThrowable, String m) {
    super(m, _cueThrowable);
  }
}
