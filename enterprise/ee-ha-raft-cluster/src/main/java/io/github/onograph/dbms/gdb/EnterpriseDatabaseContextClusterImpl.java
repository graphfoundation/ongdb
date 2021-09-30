package io.github.onograph.dbms.gdb;

import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.shared.DistributedGdb;
import java.util.Optional;
import org.neo4j.collection.Dependencies;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;
import org.neo4j.monitoring.Monitors;


public class EnterpriseDatabaseContextClusterImpl implements EnterpriseClusterDbContext {


  private final Database database;


  private final DatabaseLayout databaseLayout;


  private final DistributedGdb dcDistributedGdb;


  private final Monitors dcMonitors;


  private final GraphDatabaseFacade graphDatabaseFacade;


  private final ConsensusLeaderNodeService llConsensusLeaderNodeService;


  private final NamedDatabaseId namedDatabaseId;


  private volatile Throwable cfThrowable;


  protected EnterpriseDatabaseContextClusterImpl(Database _database,
      DistributedGdb _dcDistributedGdb, Monitors _dcMonitors,
      GraphDatabaseFacade _graphDatabaseFacade,
      ConsensusLeaderNodeService _llConsensusLeaderNodeService) {
    this.database = _database;
    this.graphDatabaseFacade = _graphDatabaseFacade;
    this.databaseLayout = _database.getDatabaseLayout();
    this.namedDatabaseId = _database.getNamedDatabaseId();
    this.dcDistributedGdb = _dcDistributedGdb;
    this.dcMonitors = _dcMonitors;
    this.llConsensusLeaderNodeService = _llConsensusLeaderNodeService;
  }


  public static EnterpriseDatabaseContextClusterImpl corEnterpriseDatabaseContextClusterImpl(
      Database _database, DistributedGdb _dcDistributedGdb, Monitors _dcMonitors,
      GraphDatabaseFacade _graphDatabaseFacade,
      ConsensusLeaderNodeService _llConsensusLeaderNodeService) {
    return new EnterpriseDatabaseContextClusterImpl(_database, _dcDistributedGdb, _dcMonitors,
        _graphDatabaseFacade, _llConsensusLeaderNodeService);
  }


  public static EnterpriseDatabaseContextClusterImpl redrpcEnterpriseDatabaseContextClusterImpl(
      Database _database, DistributedGdb _dcDistributedGdb, Monitors _dcMonitors,
      GraphDatabaseFacade _graphDatabaseFacade) {
    return new EnterpriseDatabaseContextClusterImpl(_database, _dcDistributedGdb, _dcMonitors,
        _graphDatabaseFacade, null);
  }

  @Override
  public NamedDatabaseId daasidNamedDatabaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public DatabaseLayout daaslauDatabaseLayout() {
    return this.databaseLayout;
  }

  @Override
  public Database database() {
    return this.database;
  }

  @Override
  public GraphDatabaseFacade databaseFacade() {
    return this.graphDatabaseFacade;
  }

  @Override
  public Dependencies dependencies() {
    return this.database().getDependencyResolver();
  }

  @Override
  public DistributedGdb enpdaGdb() {
    return this.dcDistributedGdb;
  }


  public void faiForTh(Throwable _fcThrowable) {
    this.cfThrowable = _fcThrowable;
  }


  public Throwable getCfThrowable() {
    return this.cfThrowable;
  }


  public boolean isFae() {
    return this.cfThrowable != null;
  }

  @Override
  public Optional<ConsensusLeaderNodeService> ledlarOptional() {
    return Optional.ofNullable(this.llConsensusLeaderNodeService);
  }

  @Override
  public Monitors moirMonitors() {
    return this.dcMonitors;
  }
}
