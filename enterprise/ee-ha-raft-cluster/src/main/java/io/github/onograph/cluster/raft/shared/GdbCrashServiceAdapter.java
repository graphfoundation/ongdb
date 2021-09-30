package io.github.onograph.cluster.raft.shared;

import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.DbmsCrashManager;
import java.util.List;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


public abstract class GdbCrashServiceAdapter extends LifecycleAdapter {


  private final CrashManager crashManager;


  private final List<? extends DbmsCrashManager> listLhpDbmsCrashManager;


  private final NamedDatabaseId namedDatabaseId;


  protected GdbCrashServiceAdapter(CrashManager crashManager,
      List<? extends DbmsCrashManager> _listLhpDbmsCrashManager, NamedDatabaseId _namedDatabaseId) {
    this.crashManager = crashManager;
    this.listLhpDbmsCrashManager = _listLhpDbmsCrashManager;
    this.namedDatabaseId = _namedDatabaseId;
  }

  @Override
  public void init() {
    this.crashManager.addtepcethlForNaLi(this.listLhpDbmsCrashManager, this.namedDatabaseId);
  }

  @Override
  public void shutdown() {
    this.crashManager.reedbpaevharForNa(this.namedDatabaseId);
  }
}
