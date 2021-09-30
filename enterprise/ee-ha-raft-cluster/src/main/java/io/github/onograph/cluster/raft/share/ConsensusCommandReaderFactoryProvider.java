package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.configuration.Config;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageEngineFactory;


public class ConsensusCommandReaderFactoryProvider implements CommandReaderFactoryProvider {


  private final StorageEngineFactory esdStorageEngineFactory;


  private final Map<ConsensusMemberGroupId, StorageEngineFactory> mapEscs = new ConcurrentHashMap();

  private ConsensusCommandReaderFactoryProvider(StorageEngineFactory _esdStorageEngineFactory) {
    this.esdStorageEngineFactory = _esdStorageEngineFactory;
  }


  static ConsensusCommandReaderFactoryProvider frmcngConsensusCommandReaderFactoryProvider(
      Config _config) {
    return new ConsensusCommandReaderFactoryProvider(
        StorageEngineFactory.selectStorageEngine(_config));
  }


  private boolean _isNodfsgeiForSt(StorageEngineFactory _storageEngineFactory) {
    return !this.esdStorageEngineFactory.name().equals(_storageEngineFactory.name());
  }

  @Override
  public CommandReaderFactory getCommandReaderFactory(
      ConsensusMemberGroupId consensusMemberGroupId) {
    return this.mapEscs.getOrDefault(consensusMemberGroupId, this.esdStorageEngineFactory)
        .commandReaderFactory();
  }


  public void retsoeeForCoSt(ConsensusMemberGroupId consensusMemberGroupId,
      StorageEngineFactory _storageEngineFactory) {
    if (this._isNodfsgeiForSt(_storageEngineFactory)) {
      this.mapEscs.put(consensusMemberGroupId, _storageEngineFactory);
    }
  }
}
