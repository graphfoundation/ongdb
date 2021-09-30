package io.github.onograph.dbms;

import java.util.concurrent.Executor;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class GdbReconcilerExecutorWrapper {


  private final Executor sadrExecutor;


  private final Executor ubudExecutor;


  GdbReconcilerExecutorWrapper(Config _config, JobScheduler _jobScheduler) {

    int _iPrlei = _config.get(GraphDatabaseSettings.reconciler_maximum_parallelism);
    _jobScheduler.setParallelism(Group.DATABASE_RECONCILER, _iPrlei);
    this.sadrExecutor = _jobScheduler.executor(Group.DATABASE_RECONCILER);
    this.ubudExecutor = _jobScheduler.executor(Group.DATABASE_RECONCILER_UNBOUND);
  }


  Executor excoExecutor(NamedDatabaseId _namedDatabaseId,
      DbmsResolverAction _rqetDbmsResolverAction) {

    boolean _isSi = _namedDatabaseId.isSystemDatabase();

    boolean _isPhi = _rqetDbmsResolverAction.isShdbeedapiyfForSt(_namedDatabaseId.name());
    return !_isSi && !_isPhi ? this.sadrExecutor : this.ubudExecutor;
  }


  Executor getUbudExecutor() {
    return this.ubudExecutor;
  }
}
