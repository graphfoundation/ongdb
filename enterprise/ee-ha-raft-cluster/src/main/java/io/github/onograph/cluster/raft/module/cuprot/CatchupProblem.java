package io.github.onograph.cluster.raft.module.cuprot;

import java.util.Objects;
import org.neo4j.util.Preconditions;


public class CatchupProblem {


  private final String m;


  private final CatchupStatusType stat;


  public CatchupProblem(String m, CatchupStatusType stat) {
    Preconditions.checkArgument(CatchupStatusType.CST_OK_STREAM_COMPLETE != stat,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.CatchupProblem.checkArgument",
            stat));
    this.stat = stat;
    this.m = m;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      CatchupProblem _thCatchupProblem = (CatchupProblem) obj;
      return this.stat == _thCatchupProblem.stat && Objects.equals(this.m, _thCatchupProblem.m);
    } else {
      return false;
    }
  }


  public String getM() {
    return this.m;
  }


  public CatchupStatusType getStat() {
    return this.stat;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.stat, this.m);
  }


}
