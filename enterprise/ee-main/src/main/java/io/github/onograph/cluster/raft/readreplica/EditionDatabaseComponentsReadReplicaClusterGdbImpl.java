package io.github.onograph.cluster.raft.readreplica;

import java.util.function.Function;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.context.EditionDatabaseComponents;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.graphdb.factory.module.id.IdContextFactory;
import org.neo4j.graphdb.factory.module.id.IdContextFactoryBuilder;
import org.neo4j.io.fs.watcher.DatabaseLayoutWatcher;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.CommitProcessFactory;
import org.neo4j.kernel.impl.api.ReadOnlyTransactionCommitProcess;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.factory.AccessCapabilityFactory;
import org.neo4j.kernel.impl.factory.ReadOnly;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.impl.transaction.stats.DatabaseTransactionStats;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.ReadOnlyTokenCreator;
import org.neo4j.token.TokenHolders;


public class EditionDatabaseComponentsReadReplicaClusterGdbImpl implements
    EditionDatabaseComponents {


  private final AccessCapabilityFactory accessCapabilityFactory;


  private final CommitProcessFactory commitProcessFactory;


  private final DatabaseIdContext databaseIdContext;


  private final Locks mLocks;


  private final ReadReplicaModule meReadReplicaModule;


  private final DatabaseTransactionStats mtDatabaseTransactionStats;


  private final TokenHolders tokenHolders;


  public EditionDatabaseComponentsReadReplicaClusterGdbImpl(ReadReplicaModule _emReadReplicaModule,
      GlobalModule _globalModule, NamedDatabaseId _namedDatabaseId) {
    this.meReadReplicaModule = _emReadReplicaModule;
    this.mLocks = new LocksReadReplicaImpl();

    Config _goaConfig = _globalModule.getGlobalConfig();

    IdContextFactory _idContextFactory = IdContextFactoryBuilder
        .of(_globalModule.getFileSystem(), _globalModule.getJobScheduler(), _goaConfig,
            _globalModule.getTracers().getPageCacheTracer()).build();
    this.databaseIdContext = _idContextFactory.createIdContext(_namedDatabaseId);
    this.tokenHolders = new TokenHolders(new DelegatingTokenHolder(new ReadOnlyTokenCreator(),
        io.github.onograph.TokenConstants.PROPERTY_KEY),
        new DelegatingTokenHolder(new ReadOnlyTokenCreator(),
            io.github.onograph.TokenConstants.LABEL),
        new DelegatingTokenHolder(new ReadOnlyTokenCreator(),
            io.github.onograph.TokenConstants.RELATIONSHIP_TYPE2));
    this.commitProcessFactory = (appender, storageEngine, databaseId, readOnlyDatabaseChecker) ->
    {
      return new ReadOnlyTransactionCommitProcess();
    };
    this.mtDatabaseTransactionStats = _emReadReplicaModule.createTransactionMonitor();
    this.accessCapabilityFactory = AccessCapabilityFactory.fixed(ReadOnly.INSTANCE);
  }

  @Override
  public AccessCapabilityFactory getAccessCapabilityFactory() {
    return this.accessCapabilityFactory;
  }

  @Override
  public CommitProcessFactory getCommitProcessFactory() {
    return this.commitProcessFactory;
  }

  @Override
  public ConstraintSemantics getConstraintSemantics() {
    return this.meReadReplicaModule.getConstraintSemantics();
  }

  @Override
  public DatabaseIdContext getIdContext() {
    return this.databaseIdContext;
  }

  @Override
  public Locks getLocks() {
    return this.mLocks;
  }

  @Override
  public QueryEngineProvider getQueryEngineProvider() {
    return this.meReadReplicaModule.getQueryEngineProvider();
  }

  @Override
  public DatabaseStartupController getStartupController() {
    return this.meReadReplicaModule.getDatabaseStartupController();
  }

  @Override
  public TokenHolders getTokenHolders() {
    return this.tokenHolders;
  }

  @Override
  public DatabaseTransactionStats getTransactionMonitor() {
    return this.mtDatabaseTransactionStats;
  }

  @Override
  public Function<DatabaseLayout, DatabaseLayoutWatcher> getWatcherServiceFactory() {
    return this.meReadReplicaModule.getWatcherServiceFactory();
  }
}
