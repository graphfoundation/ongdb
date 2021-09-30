package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService;
import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import java.util.concurrent.CompletableFuture;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class CoreGdbSyncManager {


  private final LifecycleCatchupManagerImpl fccLifecycleCatchupManagerImpl;


  private final Log log;


  public CoreGdbSyncManager(LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl,
      LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
    this.fccLifecycleCatchupManagerImpl = _fccLifecycleCatchupManagerImpl;
  }


  SnapshotData gecrspSnapshotData(NamedDatabaseId _namedDatabaseId, SocketAddress _socketAddress)
      throws SyncException {

    CatchupManagerService _cinCatchupManagerService = this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(
        this.log, _socketAddress);

    CatchupAnswerManager _hrCatchupAnswerManager = new CatchupAnswerManager<SnapshotData>() {
      @Override
      public void oncospoForCoSn(CompletableFuture<SnapshotData> _completableFutureSgaSnapshotData,
          SnapshotData _rsosSnapshotData) {
        _completableFutureSgaSnapshotData.complete(_rsosSnapshotData);
      }
    };

    try {
      return (SnapshotData) _cinCatchupManagerService.vCatchupManagerServiceNeedsV4Handler((c) ->
          {
            return c.gecrspCatchupManagerServiceCatchupRequest(
                _namedDatabaseId);
          }).vCatchupManagerServiceNeedsV5Handler((c) ->
          {
            return c.gecrspCatchupManagerServiceCatchupRequest(
                _namedDatabaseId);
          })
          .vCatchupManagerServiceResponseRequestAble((c) ->
          {
            return c.gecrspCatchupManagerServiceCatchupRequest(
                _namedDatabaseId);
          })
          .catchupAnswerServiceHandlersVRESULT(_hrCatchupAnswerManager).reut();
    } catch (

        Exception _exception) {

      throw new SyncException(_exception,
          SyncException.FailureType.CRET_ERR, "*** Error: 1cb326b4-3f4d-47c5-8851-0fda972269b6");
    }
  }
}
