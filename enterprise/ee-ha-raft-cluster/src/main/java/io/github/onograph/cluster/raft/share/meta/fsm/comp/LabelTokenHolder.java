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


public class LabelTokenHolder extends TokenHolderReplicaImpl {

  public LabelTokenHolder(NamedDatabaseId _namedDatabaseId, TokenRegistry _tokenRegistry,
      Syncerator _rpiaoSyncerator, IdGeneratorFactory _idGeneratorFactory,
      Supplier<StorageEngine> _supplierSesStorageEngine, PageCacheTracer _pageCacheTracer,
      DatabaseReadOnlyChecker _rodcDatabaseReadOnlyChecker) {
    super(_namedDatabaseId, _tokenRegistry, _rpiaoSyncerator, _idGeneratorFactory,
        IdType.LABEL_TOKEN, _supplierSesStorageEngine, ReplicaTokenType.RTT_LBL,
        TransactionState::labelDoCreateForName, _pageCacheTracer, _rodcDatabaseReadOnlyChecker);
  }
}
