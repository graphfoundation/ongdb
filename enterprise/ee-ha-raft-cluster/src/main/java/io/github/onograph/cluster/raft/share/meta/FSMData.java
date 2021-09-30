package io.github.onograph.cluster.raft.share.meta;


public class FSMData {


  private final Exception exception;


  private final Object obRsl;

  private FSMData(Exception _exception) {
    this.exception = _exception;
    this.obRsl = null;
  }

  private FSMData(Object _obRsl) {
    this.obRsl = _obRsl;
    this.exception = null;
  }


  public static FSMData ofFSMData(Object _obRsl) {
    return new FSMData(_obRsl);
  }


  public static FSMData ofFSMData(Exception _exception) {
    return new FSMData(_exception);
  }


  public <T> T cose() throws Exception {
    if (this.exception != null) {
      throw this.exception;
    } else {
      return (T) this.obRsl;
    }
  }


}
