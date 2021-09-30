package io.github.onograph.cluster.raft.module.cuprot;


public class RefException extends Exception {

  public RefException(String m, Object... _obAArray) {
    super(String.format(m, _obAArray));
  }
}
