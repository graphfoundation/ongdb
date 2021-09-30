package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerServiceHandlers;
import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StoreId;


public class TransactionSyncManager {


  private final LifecycleCatchupManagerImpl cucLifecycleCatchupManagerImpl;


  private final Log log;

  public TransactionSyncManager(LifecycleCatchupManagerImpl _cucLifecycleCatchupManagerImpl,
      LogProvider _logProvider) {
    this.cucLifecycleCatchupManagerImpl = _cucLifecycleCatchupManagerImpl;
    this.log = _logProvider.getLog(this.getClass());
  }


  public TransactionChunkingCompleted putrcsTransactionChunkingCompleted(
      SocketAddress _afSocketAddress,
      CatchupAnswerServiceHandlers<TransactionChunkingCompleted> _catchupAnswerServiceHandlersHrTransactionChunkingCompleted,
      CommandReaderFactory _commandReaderFactory, long _lgItp,
      TransactionSyncWatcherProvider _mrpTransactionSyncWatcherProvider,
      NamedDatabaseId _namedDatabaseId, StoreId _storeId) throws Exception {
    _mrpTransactionSyncWatcherProvider.txpurut(_lgItp);
    return this.cucLifecycleCatchupManagerImpl.geceCatchupManagerService(this.log, _afSocketAddress)
        .vCatchupManagerServiceNeedsV4Handler((c) ->
        {
          return c.putrcsCatchupManagerServiceCatchupRequest(
              _commandReaderFactory,
              _lgItp,
              _namedDatabaseId,
              _storeId);
        })
        .vCatchupManagerServiceNeedsV5Handler((c) ->
        {
          return c.putrcsCatchupManagerServiceCatchupRequest(
              _commandReaderFactory,
              _lgItp,
              _namedDatabaseId,
              _storeId);
        }).vCatchupManagerServiceResponseRequestAble((c) ->
        {
          return c.putrcsCatchupManagerServiceCatchupRequest(
              _commandReaderFactory,
              _lgItp,
              _namedDatabaseId,
              _storeId);
        })
        .catchupAnswerServiceHandlersVRESULT(
            _catchupAnswerServiceHandlersHrTransactionChunkingCompleted)
        .reut();
  }
}
