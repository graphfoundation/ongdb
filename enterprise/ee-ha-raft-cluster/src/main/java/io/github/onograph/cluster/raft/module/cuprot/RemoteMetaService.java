package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import java.util.concurrent.CompletableFuture;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class RemoteMetaService {


  private final LifecycleCatchupManagerImpl fccLifecycleCatchupManagerImpl;


  private final Log log;

  public RemoteMetaService(LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl,
      LogProvider _logProvider) {
    this.fccLifecycleCatchupManagerImpl = _fccLifecycleCatchupManagerImpl;
    this.log = _logProvider.getLog(this.getClass());
  }


  public Meta geioMeta(NamedDatabaseId _namedDatabaseId, SocketAddress _treSocketAddress)
      throws Exception {
    return this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(this.log,
            _treSocketAddress).vCatchupManagerServiceNeedsV4Handler((cli) ->
        {
          return cli.gerclifCatchupManagerServiceCatchupRequest(
              _namedDatabaseId);
        })
        .vCatchupManagerServiceNeedsV5Handler((cli) ->
        {
          return cli.gerclifCatchupManagerServiceCatchupRequest(
              _namedDatabaseId);
        }).vCatchupManagerServiceResponseRequestAble((cli) ->
        {
          return cli.gerclifCatchupManagerServiceCatchupRequest(
              _namedDatabaseId);
        })
        .catchupAnswerServiceHandlersVRESULT(new CatchupAnswerManager<Meta>() {
          @Override
          public void oninForCoMe(CompletableFuture<Meta> _completableFutureSgaMeta,
              Meta _rsosMeta) {
            _completableFutureSgaMeta.complete(_rsosMeta);
          }
        }).reut();
  }
}
