package io.github.onograph.cluster.raft.module.cuprot.current.core;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GdbAuthActions {


  public final List<String> listRoestString;


  public final List<String> listUsrstString;

  public GdbAuthActions(List<String> _listSrString, List<String> _listSuString) {
    this.listRoestString = _listSrString;
    this.listUsrstString = _listSuString;
  }


  public List<String> gecmdList() {
    return Stream.concat(this.listRoestString.stream(), this.listUsrstString.stream())
        .collect(Collectors.toList());
  }


  public boolean isEmy() {
    return this.listRoestString.isEmpty() && this.listUsrstString.isEmpty();
  }
}
