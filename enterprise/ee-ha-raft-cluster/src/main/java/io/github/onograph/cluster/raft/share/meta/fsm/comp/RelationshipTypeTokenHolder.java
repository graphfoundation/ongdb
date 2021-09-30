package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.share.sync.Syncerator;
import java.util.function.Supplier;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.id.IdType;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.txstate.TransactionState;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.token.TokenRegistry;


public class RelationshipTypeTokenHolder extends TokenHolderReplicaImpl {

  public RelationshipTypeTokenHolder(DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker,
      IdGeneratorFactory _idGeneratorFactory, NamedDatabaseId _namedDatabaseId,
      PageCacheTracer _pageCacheTracer, Syncerator _rpiaoSyncerator,
      Supplier<StorageEngine> _supplierSesStorageEngine, TokenRegistry _tokenRegistry) {
    super(_namedDatabaseId, _tokenRegistry, _rpiaoSyncerator, _idGeneratorFactory,
        IdType.RELATIONSHIP_TYPE_TOKEN, _supplierSesStorageEngine,
        ReplicaTokenType.RTT_REL,
        TransactionState::relationshipTypeDoCreateForName, _pageCacheTracer,
        _cdorDatabaseReadOnlyChecker);
  }
}
