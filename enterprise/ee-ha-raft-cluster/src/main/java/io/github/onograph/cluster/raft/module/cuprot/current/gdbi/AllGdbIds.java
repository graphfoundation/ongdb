package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import java.util.Objects;
import java.util.Set;
import org.neo4j.kernel.database.NamedDatabaseId;


public class AllGdbIds {


  private final Set<NamedDatabaseId> setDiNamedDatabaseId;


  private final int sz;

  public AllGdbIds(Set<NamedDatabaseId> _setIdNamedDatabaseId) {
    this.setDiNamedDatabaseId = _setIdNamedDatabaseId;
    this.sz = _setIdNamedDatabaseId.size();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AllGdbIds _tAllGdbIds = (AllGdbIds) obj;
      return this.sz == _tAllGdbIds.sz && Objects.equals(this.setDiNamedDatabaseId,
          _tAllGdbIds.setDiNamedDatabaseId);
    } else {
      return false;
    }
  }


  public Set<NamedDatabaseId> getSetDiNamedDatabaseId() {
    return this.setDiNamedDatabaseId;
  }


  public int getSz() {
    return this.sz;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.setDiNamedDatabaseId, this.sz);
  }
}
