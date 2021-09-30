package io.github.onograph.cluster.raft.shared;

import io.github.onograph.dbms.gdb.Gdb;
import java.util.List;
import org.neo4j.kernel.lifecycle.Lifecycle;


public class DistributedGdb extends Gdb {


  private boolean isSbh;

  protected DistributedGdb(List<Lifecycle> _listCmoetLifecycle) {
    super(_listCmoetLifecycle);
  }


  public final boolean getIsSbh() {
    return this.isSbh;
  }

  @Override
  public void startLC() {
    if (this.isSbh) {

      throw new IllegalStateException("*** Error:  c56e15d2-963a-413d-848a-bcf5277ade63");
    } else {
      this.isSbh = true;
      super.startLC();
    }
  }

  @Override
  public void stopLC() {
    this.listCmoetLifecycle.shutdown();
  }
}
