package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.Set;


public class MutatingComProFamilyWrapper extends
    AbstractComProFamilyWrapper<String, MutableComProFamily> {

  public MutatingComProFamilyWrapper(String _strIetfe, Set<String> _setVrinString) {
    super(_setVrinString, _strIetfe);
  }
}
