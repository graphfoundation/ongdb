package io.github.onograph.cluster.raft.module.dprot.impl.directory;

import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;


public class LeaderMeta {


  public static final LeaderMeta EMT_LEADER_META = new LeaderMeta(Collections.emptyMap());


  private final Map<DatabaseId, NodeServerMemberLeaderMeta> mapLaesdn;

  public LeaderMeta(Map<DatabaseId, NodeServerMemberLeaderMeta> _mapLaesdn) {
    this.mapLaesdn = Collections.unmodifiableMap(_mapLaesdn);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      LeaderMeta _tLeaderMeta = (LeaderMeta) obj;
      return Objects.equals(this.mapLaesdn, _tLeaderMeta.mapLaesdn);
    } else {
      return false;
    }
  }


  public Map<DatabaseId, NodeServerMemberLeaderMeta> getMapLaesdn() {
    return this.mapLaesdn;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapLaesdn);
  }


}
