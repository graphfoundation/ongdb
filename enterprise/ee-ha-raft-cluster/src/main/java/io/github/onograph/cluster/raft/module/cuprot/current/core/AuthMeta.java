package io.github.onograph.cluster.raft.module.cuprot.current.core;

import java.util.List;
import java.util.Objects;


public class AuthMeta {


  private final List<String> listCmadString;

  public AuthMeta(List<String> _listCmadString) {
    this.listCmadString = _listCmadString;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AuthMeta _thaAuthMeta = (AuthMeta) obj;
      return Objects.equals(this.listCmadString, _thaAuthMeta.listCmadString);
    } else {
      return false;
    }
  }


  public List<String> getListCmadString() {
    return this.listCmadString;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.listCmadString);
  }
}
