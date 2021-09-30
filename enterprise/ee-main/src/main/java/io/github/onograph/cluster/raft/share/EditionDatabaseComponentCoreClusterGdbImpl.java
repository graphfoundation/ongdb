package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper;
import java.util.function.Function;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.graphdb.factory.module.edition.context.EditionDatabaseComponents;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.io.fs.watcher.DatabaseLayoutWatcher;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.impl.api.CommitProcessFactory;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.factory.AccessCapabilityFactory;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.impl.transaction.stats.DatabaseTransactionStats;
import org.neo4j.token.TokenHolders;


public class EditionDatabaseComponentCoreClusterGdbImpl implements EditionDatabaseComponents {


  private final AbstractEditionModule abstractEditionModule;


  private final CoreNodeWrapper ckCoreNodeWrapper;


  private final DatabaseTransactionStats mtDatabaseTransactionStats;

  EditionDatabaseComponentCoreClusterGdbImpl(AbstractEditionModule _abstractEditionModule,
      CoreNodeWrapper _ckCoreNodeWrapper) {
    this.abstractEditionModule = _abstractEditionModule;
    this.ckCoreNodeWrapper = _ckCoreNodeWrapper;
    this.mtDatabaseTransactionStats = _abstractEditionModule.createTransactionMonitor();
  }

  @Override
  public AccessCapabilityFactory getAccessCapabilityFactory() {
    return this.ckCoreNodeWrapper.getAccessCapabilityFactory();
  }

  @Override
  public CommitProcessFactory getCommitProcessFactory() {
    return this.ckCoreNodeWrapper.getCommitProcessFactory();
  }

  @Override
  public ConstraintSemantics getConstraintSemantics() {
    return this.abstractEditionModule.getConstraintSemantics();
  }

  @Override
  public DatabaseIdContext getIdContext() {
    return this.ckCoreNodeWrapper.getDatabaseIdContext();
  }

  @Override
  public Locks getLocks() {
    return this.ckCoreNodeWrapper.getMlLocks();
  }

  @Override
  public QueryEngineProvider getQueryEngineProvider() {
    return this.abstractEditionModule.getQueryEngineProvider();
  }

  @Override
  public DatabaseStartupController getStartupController() {
    return this.abstractEditionModule.getDatabaseStartupController();
  }

  @Override
  public TokenHolders getTokenHolders() {
    return this.ckCoreNodeWrapper.getTokenHolders();
  }

  @Override
  public DatabaseTransactionStats getTransactionMonitor() {
    return this.mtDatabaseTransactionStats;
  }

  @Override
  public Function<DatabaseLayout, DatabaseLayoutWatcher> getWatcherServiceFactory() {
    return this.abstractEditionModule.getWatcherServiceFactory();
  }
}
