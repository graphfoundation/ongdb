package io.github.onograph.cluster.raft.module.cuprot.scmeta;


public class GdbIsoException extends Exception {

  public GdbIsoException(Exception _exception) {
    super(_exception);
  }

  public GdbIsoException(String desc) {
    super(desc);
  }


  public GdbIsoException(Exception _exception, String m) {
    super(m, _exception);
  }
}
