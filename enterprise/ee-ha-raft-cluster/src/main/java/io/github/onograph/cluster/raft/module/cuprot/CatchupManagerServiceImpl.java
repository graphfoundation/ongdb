package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequest;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.cluster.raft.utils.ActionStatsWatcher;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StoreId;


class CatchupManagerServiceImpl implements CatchupManagerService {


  private static final TimeUnit REQ_SEN_LTM_CMPT;


  private static final int REQ_SEN_TMT = 1;

  static {
    REQ_SEN_LTM_CMPT = TimeUnit.MINUTES;
  }


  private final CompletableFuture<PooledChannelFacade> completableFutureCfPooledChannelFacade;


  private final Log log;


  private final Duration tiDuration;


  CatchupManagerServiceImpl(
      CompletableFuture<PooledChannelFacade> _completableFutureFcPooledChannelFacade, Log _log,
      Duration _tiDuration) {
    this.completableFutureCfPooledChannelFacade = _completableFutureFcPooledChannelFacade;
    this.log = _log;
    this.tiDuration = _tiDuration;
  }


  private static <RESULT> CompletableFuture<RESULT> _mablnruCompletableFuture(
      CatchupAnswerServiceHandlers<RESULT> _catchupAnswerServiceHandlersHrRESULT,
      PooledChannelFacade _pooledChannelFacade,
      AbstractCatchupManagementMessageWrapper _rqetAbstractCatchupManagementMessageWrapper) {

    CompletableFuture _completableFuture = new CompletableFuture();

    try {
      _completableFuture.whenComplete(
          new io.github.onograph.cluster.raft.module.cuprot.CatchupManagerServiceImpl.CleanupBiConsumer(
              _pooledChannelFacade));
      _pooledChannelFacade.sersehlForCaCo(_completableFuture,
          _catchupAnswerServiceHandlersHrRESULT);
      _pooledChannelFacade.senForAb(_rqetAbstractCatchupManagementMessageWrapper);
    } catch (

        Exception _exception) {

      _completableFuture.completeExceptionally(new CatchupManagerException(_exception,
          "*** Error:  5e8ffc7a-9451-4bd8-ab5f-ce2a5e974b76"));
    }

    return _completableFuture;
  }

  @Override
  public void close() {
  }

  @Override
  public <RESULT> ReqV400Service<RESULT> vCatchupManagerServiceNeedsV4Handler(
      Function<CatchupServiceV300, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionRvcc) {

    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerServiceImpl.CatchupVersionedManagerImpl<RESULT>
        _catchupVersionedManagerImplBrRESULT =
        new io.github.onograph.cluster.raft.module.cuprot.CatchupManagerServiceImpl.CatchupVersionedManagerImpl(
            this.completableFutureCfPooledChannelFacade, this.log);
    return _catchupVersionedManagerImplBrRESULT.vCatchupManagerService400(_functionRvcc);
  }


  private static class CleanupBiConsumer implements BiConsumer<Object, Throwable> {


    private final PooledChannelFacade cucPooledChannelFacade;

    CleanupBiConsumer(PooledChannelFacade _cucPooledChannelFacade) {
      this.cucPooledChannelFacade = _cucPooledChannelFacade;
    }

    @Override
    public void accept(Object obj, Throwable _throwable) {
      if (_throwable != null) {
        this.cucPooledChannelFacade.dipe();
      } else {
        this.cucPooledChannelFacade.reee();
      }
    }
  }


  private static class V300 implements CatchupServiceV300 {


    private final PooledChannelFacade pooledChannelFacade;

    private V300(PooledChannelFacade _pooledChannelFacade) {
      this.pooledChannelFacade = _pooledChannelFacade;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SnapshotData> gecrspCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade,
            new RequestSnapshotData(_namedDatabaseId.databaseId()));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<NamedDatabaseId> gedasidCatchupManagerServiceCatchupRequest(
        String gdbName) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade, new RequestGdbId(gdbName));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreSyncCompleted> gesrfiCatchupManagerServiceCatchupRequest(
        long _lgItr, NamedDatabaseId _namedDatabaseId, StoreId _storeId, Path _pfPath) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl
            ._mablnruCompletableFuture(handler, this.pooledChannelFacade,
                new RequestStoreResource(_namedDatabaseId.databaseId(), _storeId, _lgItr, _pfPath));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreId> gesridCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade,
            new RequestStoreDatabaseIdCatchupManagement(_namedDatabaseId.databaseId()));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SetupGdbStoreSyncReply> prrsrcyCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId, StoreId _storeId) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade,
            new StoreSyncRequest(_namedDatabaseId.databaseId(), _storeId));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<TransactionChunkingCompleted> putrcsCatchupManagerServiceCatchupRequest(
        CommandReaderFactory _commandReaderFactory, long _lgPti, NamedDatabaseId _namedDatabaseId,
        StoreId _storeId) {
      this.pooledChannelFacade.secmrrfoForCo(_commandReaderFactory);
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade,
            new RequestTransactionSync(_namedDatabaseId.databaseId(), _storeId, _lgPti));
      };
    }
  }


  private static class V400 implements CatchupServiceV400 {


    private final PooledChannelFacade pooledChannelFacade;


    private final V300 v300;

    V400(PooledChannelFacade _pooledChannelFacade) {
      this.v300 = new V300(_pooledChannelFacade);
      this.pooledChannelFacade = _pooledChannelFacade;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AllGdbIds> gealdbidCatchupManagerServiceCatchupRequest() {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade, new RequestAllGdbIds());
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SnapshotData> gecrspCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return this.v300.gecrspCatchupManagerServiceCatchupRequest(_namedDatabaseId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<NamedDatabaseId> gedasidCatchupManagerServiceCatchupRequest(
        String gdbName) {
      return this.v300.gedasidCatchupManagerServiceCatchupRequest(gdbName);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AuthMeta> gematCatchupManagerServiceCatchupRequest(
        String gdbName, String _strMi) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade, new RequestAuthMeta(gdbName, _strMi));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<Meta> gerclifCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return (handler) ->
      {
        return CatchupManagerServiceImpl._mablnruCompletableFuture(handler,
            this.pooledChannelFacade, new RequestMeta(_namedDatabaseId));
      };
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreSyncCompleted> gesrfiCatchupManagerServiceCatchupRequest(
        long _lgItr, NamedDatabaseId _namedDatabaseId, StoreId _storeId, Path _path) {
      return this.v300.gesrfiCatchupManagerServiceCatchupRequest(_lgItr, _namedDatabaseId, _storeId,
          _path);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreId> gesridCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return this.v300.gesridCatchupManagerServiceCatchupRequest(_namedDatabaseId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SetupGdbStoreSyncReply> prrsrcyCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId, StoreId _storeId) {
      return this.v300.prrsrcyCatchupManagerServiceCatchupRequest(_namedDatabaseId, _storeId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<TransactionChunkingCompleted> putrcsCatchupManagerServiceCatchupRequest(
        CommandReaderFactory _commandReaderFactory, long _lgItp, NamedDatabaseId _namedDatabaseId,
        StoreId _storeId) {
      return this.v300.putrcsCatchupManagerServiceCatchupRequest(_commandReaderFactory, _lgItp,
          _namedDatabaseId, _storeId);
    }
  }


  private static class V500 implements CatchupServiceV500 {


    private final V400 v400;

    V500(PooledChannelFacade _pooledChannelFacade) {
      this.v400 = new V400(_pooledChannelFacade);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AllGdbIds> gealdbidCatchupManagerServiceCatchupRequest() {
      return this.v400.gealdbidCatchupManagerServiceCatchupRequest();
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SnapshotData> gecrspCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return this.v400.gecrspCatchupManagerServiceCatchupRequest(_namedDatabaseId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<NamedDatabaseId> gedasidCatchupManagerServiceCatchupRequest(
        String gdbName) {
      return this.v400.gedasidCatchupManagerServiceCatchupRequest(gdbName);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AuthMeta> gematCatchupManagerServiceCatchupRequest(
        String gdbName, String _strMi) {
      return this.v400.gematCatchupManagerServiceCatchupRequest(gdbName, _strMi);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<Meta> gerclifCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return this.v400.gerclifCatchupManagerServiceCatchupRequest(_namedDatabaseId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreSyncCompleted> gesrfiCatchupManagerServiceCatchupRequest(
        long _lgRti, NamedDatabaseId _namedDatabaseId, StoreId _storeId, Path _path) {
      return this.v400.gesrfiCatchupManagerServiceCatchupRequest(_lgRti, _namedDatabaseId, _storeId,
          _path);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreId> gesridCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {
      return this.v400.gesridCatchupManagerServiceCatchupRequest(_namedDatabaseId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SetupGdbStoreSyncReply> prrsrcyCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId, StoreId _storeId) {
      return this.v400.prrsrcyCatchupManagerServiceCatchupRequest(_namedDatabaseId, _storeId);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<TransactionChunkingCompleted> putrcsCatchupManagerServiceCatchupRequest(
        CommandReaderFactory _commandReaderFactory, long _lgItp, NamedDatabaseId _namedDatabaseId,
        StoreId _storeId) {
      return this.v400.putrcsCatchupManagerServiceCatchupRequest(_commandReaderFactory, _lgItp,
          _namedDatabaseId, _storeId);
    }
  }


  private class CatchupVersionedManagerImpl<RESULT>
      implements
      io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupVersionedManager<RESULT> {


    private final CompletableFuture<PooledChannelFacade> completableFutureCanlPooledChannelFacade;


    private final Log log;


    private CatchupAnswerServiceHandlers<RESULT> catchupAnswerServiceHandlersHrRESULT;


    private Function<CatchupServiceV300, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> functionRvcc;


    private Function<CatchupServiceV400, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> functionRvcc2;


    private Function<CatchupServiceV500, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> functionVrcc;

    private CatchupVersionedManagerImpl(
        CompletableFuture<PooledChannelFacade> _completableFutureCanlPooledChannelFacade,
        Log _log) {
      this.completableFutureCanlPooledChannelFacade = _completableFutureCanlPooledChannelFacade;
      this.log = _log;
    }


    private ActionStatsWatcher<RESULT> _pefmrqsActionStatsWatcher(
        PooledChannelFacade _ccPooledChannelFacade) {

      ApplicationComProFamily _poooApplicationComProFamily = _ccPooledChannelFacade.prtoApplicationComProFamily();
      if (_poooApplicationComProFamily.equals(ApplicationComProFamilyType.CT_CURRV)) {

        V400 _cinxV400 = new V400(_ccPooledChannelFacade);
        return this._pefmrqsActionStatsWatcher(_ccPooledChannelFacade, _cinxV400,
            this.functionRvcc2, _poooApplicationComProFamily);
      } else {

        String m = "Not a valid catchup version: " + _poooApplicationComProFamily;

        throw new IllegalStateException("*** Error: 78bb7cad-f1b1-4c06-b09a-40a26bf750b7");
      }
    }


    private <CLIENT> ActionStatsWatcher<RESULT> _pefmrqsActionStatsWatcher(
        PooledChannelFacade _ccPooledChannelFacade, CLIENT _cinCin,
        Function<CLIENT, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionRvscc,
        ApplicationComProFamily _poooApplicationComProFamily) {
      if (_functionRvscc != null) {

        io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT> _catchupRequestRqetRESULT =
            _functionRvscc.apply(_cinCin);
        return this._wiprsmiActionStatsWatcher(_ccPooledChannelFacade,
            _catchupRequestRqetRESULT.exceCompletableFuture(
                this.catchupAnswerServiceHandlersHrRESULT));
      } else {

        String m = "Pro Family Error for " + _poooApplicationComProFamily;

        throw new IllegalStateException("*** Error: c85b45ab-3cd0-497a-94e3-9ab61b1ba0dc");
      }
    }


    private ActionStatsWatcher<RESULT> _wiprsmiActionStatsWatcher(
        PooledChannelFacade _ccPooledChannelFacade,
        CompletableFuture<RESULT> _completableFutureRqetRESULT) {

      long _lgVr00 = CatchupManagerServiceImpl.this.tiDuration.toMillis();
      Objects.requireNonNull(_ccPooledChannelFacade);
      return ActionStatsWatcher.ofActionStatsWatcher(_completableFutureRqetRESULT, _lgVr00,
          this.log, _ccPooledChannelFacade::mselrnOptionalLong);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupVersionedManager<RESULT> catchupAnswerServiceHandlersVRESULT(
        CatchupAnswerServiceHandlers<RESULT> _catchupAnswerServiceHandlersRhRESULT) {
      this.catchupAnswerServiceHandlersHrRESULT = _catchupAnswerServiceHandlersRhRESULT;
      return this;
    }

    @Override
    public RESULT reut() throws Exception {
      return (this.completableFutureCanlPooledChannelFacade.thenApply(
              this::_pefmrqsActionStatsWatcher)
          .get(1L, CatchupManagerServiceImpl.REQ_SEN_LTM_CMPT)).findCurrent();
    }

    @Override
    public ReqV400Service<RESULT> vCatchupManagerService400(
        Function<CatchupServiceV300, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionRvcc) {
      this.functionRvcc = _functionRvcc;
      return this;
    }

    @Override
    public ReqV500Service<RESULT> vCatchupManagerServiceNeedsV5Handler(
        Function<CatchupServiceV400, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionRvcc) {
      this.functionRvcc2 = _functionRvcc;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.ResponseRequestAble<RESULT> vCatchupManagerServiceResponseRequestAble(
        Function<CatchupServiceV500, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionRvcc) {
      this.functionVrcc = _functionRvcc;
      return this;
    }
  }
}
