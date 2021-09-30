package io.github.onograph.cluster.raft.gateway.gwlb.mods;


public class FilterException extends Exception {

  FilterException(String m) {
    super(m);
  }


  FilterException(NumberFormatException _cueNumberFormatException, String m) {
    super(m, _cueNumberFormatException);
  }
}
