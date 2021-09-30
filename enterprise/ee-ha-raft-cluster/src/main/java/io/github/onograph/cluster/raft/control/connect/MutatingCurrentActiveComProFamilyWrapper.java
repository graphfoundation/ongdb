package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.List;


public class MutatingCurrentActiveComProFamilyWrapper extends
    CurrentActiveComProFamilyWrapper<String, MutableComProFamily> {

  public MutatingCurrentActiveComProFamilyWrapper(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<MutableComProFamily> _comProFamilyGroupCtgrMutableComProFamily,
      List<String> _listVrinString) {
    super(_comProFamilyGroupCtgrMutableComProFamily, _listVrinString);
  }
}
