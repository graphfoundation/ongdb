package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.DatabaseLogService;


public final class ClusterConInfoManager {


  private final InfoReplyMessageConsumer cletrInfoReplyMessageConsumer;


  private final ConsensusOperationsManager consensusOperationsManager;


  private final Executor executor;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final Log log;


  private final NamedDatabaseId namedDatabaseId;


  private final ConsensusSynceratorImpl rrConsensusSynceratorImpl;


  private final Duration wmrcDuration;


  public ClusterConInfoManager(InfoReplyMessageConsumer _cletrInfoReplyMessageConsumer,
      ConsensusOperationsManager consensusOperationsManager, DatabaseLogService _databaseLogService,
      Executor _executor, Lazy<ConsensusNodeId> _lazyMslConsensusNodeId,
      NamedDatabaseId _namedDatabaseId, ConsensusSynceratorImpl _rrConsensusSynceratorImpl,
      Duration _wmrcDuration) {
    this.namedDatabaseId = _namedDatabaseId;
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.consensusOperationsManager = consensusOperationsManager;
    this.rrConsensusSynceratorImpl = _rrConsensusSynceratorImpl;
    this.log = _databaseLogService.getInternalLog(this.getClass());
    this.cletrInfoReplyMessageConsumer = _cletrInfoReplyMessageConsumer;
    this.executor = _executor;
    this.wmrcDuration = _wmrcDuration;
  }


  public CompletableFuture<ClusterMetaInfoReply> clsrsasCompletableFuture(UUID _dirUUID) {

    int _iCre = this.consensusOperationsManager.recnmeSet().size();
    this.cletrInfoReplyMessageConsumer.extfostefForUU(_iCre, _dirUUID);
    return CompletableFuture.supplyAsync(() ->
    {
      return this.rrConsensusSynceratorImpl.relaSyncMeta(
          new AskState(this.namedDatabaseId.databaseId(), this.lazyMslConsensusNodeId.get(),
              _dirUUID));
    }, this.executor).thenApply((replicationResult) ->
    {
      try {

        List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>
            _listRsossInfoReplyMessage = this.cletrInfoReplyMessageConsumer
            .geasteList(_dirUUID, this.wmrcDuration);
        return new ClusterMetaInfoReply(_listRsossInfoReplyMessage,
            replicationResult);
      } catch (

          InterruptedException _interruptedException) {
        throw new CompletionException(_interruptedException);
      }
    }).whenComplete((ignored, throwable) ->
    {
      if (throwable != null) {

      }
    });
  }
}
