package io.github.onograph.cluster.raft.id;

import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.dbms.identity.AbstractIdentityModule;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


public class CoreNodeClusterIdentModImpl extends AbstractIdentityModule implements
    CoreNodeServerIdentity {


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final Log log;


  private final Map<DatabaseId, ConsensusNodeId> mapImrdc = new ConcurrentHashMap();


  private final SimpleStorage<ServerId> simpleStorageSisServerId;


  private ServerId serverId;


  public CoreNodeClusterIdentModImpl(FileSystemAbstraction _fFileSystemAbstraction,
      ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade, LogProvider _logProvider,
      MemoryTracker _memoryTracker, Neo4jLayout _neo4jLayout) {
    this.log = _logProvider.getLog(this.getClass());
    this.fsClusterSimpleStorageFacade = _fsClusterSimpleStorageFacade;
    this.simpleStorageSisServerId = createServerIdStorage(_fFileSystemAbstraction,
        _neo4jLayout.serverIdFile(), _memoryTracker);
  }

  @Override
  public void crambiForNaCo(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId) {

    SimpleStorage _simpleStorage = this.fsClusterSimpleStorageFacade.crermroSimpleStorage(
        _namedDatabaseId.name());

    try {
      _simpleStorage.writeState(consensusNodeId);


    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }

    this.mapImrdc.put(_namedDatabaseId.databaseId(), consensusNodeId);
  }

  @Override
  public void init() {
    this.serverId = readOrGenerate(this.simpleStorageSisServerId, this.log, ServerId.class,
        ServerId::new, UUID::randomUUID);
  }

  @Override
  public ConsensusNodeId lodmmriConsensusNodeId(NamedDatabaseId _namedDatabaseId) {

    SimpleStorage _simpleStorage = this.fsClusterSimpleStorageFacade.crermroSimpleStorage(
        _namedDatabaseId.name());

    try {

      ConsensusNodeId _imConsensusNodeId = (ConsensusNodeId) _simpleStorage.readState();
      this.mapImrdc.put(_namedDatabaseId.databaseId(), _imConsensusNodeId);
      return _imConsensusNodeId;
    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }
  }

  @Override
  public ConsensusNodeId ratmmriConsensusNodeId(DatabaseId _databaseId) {

    ConsensusNodeId consensusNodeId = this.mapImrdc.get(_databaseId);
    if (consensusNodeId == null) {

      throw new IllegalStateException("*** Error: c193a56e-dbc0-4316-9780-3015d68a83f2");
    } else {
      return consensusNodeId;
    }
  }

  @Override
  public ConsensusNodeId ratmmriConsensusNodeId(NamedDatabaseId _namedDatabaseId) {
    return this.ratmmriConsensusNodeId(_namedDatabaseId.databaseId());
  }

  @Override
  public ServerId serverId() {
    if (this.serverId == null) {

      throw new IllegalStateException("*** Error:  69291b67-3ccc-4064-bed4-2b9ba44164a9");
    } else {
      return this.serverId;
    }
  }
}
