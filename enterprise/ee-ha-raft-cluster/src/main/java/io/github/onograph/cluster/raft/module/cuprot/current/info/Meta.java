package io.github.onograph.cluster.raft.module.cuprot.current.info;

import java.util.Objects;
import java.util.Optional;


public class Meta {


  private final long lgIr;


  private final String m;

  private Meta(long _lgIr, String m) {
    this.lgIr = _lgIr;
    this.m = m;
  }


  public static Meta craMeta(long _lgIr, String _strFr) {
    return new Meta(_lgIr, _strFr);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      Meta _thaMeta = (Meta) obj;
      return this.lgIr == _thaMeta.lgIr && Objects.equals(this.m, _thaMeta.m);
    } else {
      return false;
    }
  }


  public long getLgIr() {
    return this.lgIr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgIr, this.m);
  }


  public Optional<String> rectfaeOptional() {
    return Optional.ofNullable(this.m);
  }


}
