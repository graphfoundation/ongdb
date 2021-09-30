package io.github.onograph.fabric;

import io.github.onograph.fabric.service.FabricDriver;
import io.github.onograph.fabric.service.FabricTx;
import io.github.onograph.fabric.service.PoolingLifecycleAdapter;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.bolt.runtime.AccessMode;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.bookmark.TransactionBookmarkManager;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.FabricRemoteExecutor;
import org.neo4j.fabric.executor.Location;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.fabric.executor.SingleDbTransaction;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.fabric.transaction.CompositeTransaction;
import org.neo4j.fabric.transaction.FabricTransactionInfo;
import org.neo4j.fabric.transaction.TransactionMode;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Mono;


public class FabricRemoteExecutorEnterpriseImpl implements FabricRemoteExecutor {


  private final PoolingLifecycleAdapter pdPoolingLifecycleAdapter;

  public FabricRemoteExecutorEnterpriseImpl(PoolingLifecycleAdapter _pdPoolingLifecycleAdapter) {
    this.pdPoolingLifecycleAdapter = _pdPoolingLifecycleAdapter;
  }

  @Override
  public RemoteTransactionContext startTransactionContext(
      CompositeTransaction _compositeTransaction, FabricTransactionInfo _fabricTransactionInfo,
      TransactionBookmarkManager _transactionBookmarkManager) {
    return new FabricRemoteExecutorEnterpriseImpl.RemoteTransactionContextImpl(
        _compositeTransaction, _fabricTransactionInfo,
        _transactionBookmarkManager);
  }


  private static class SingleDbTransactionImpl implements SingleDbTransaction {


    private final Remote lctoRemote;


    private final Mono<FabricTx> monoTdFabricTx;


    private final TransactionBookmarkManager transactionBookmarkManager;


    SingleDbTransactionImpl(Remote _lctoRemote, Mono<FabricTx> _monoTdFabricTx,
        TransactionBookmarkManager _transactionBookmarkManager) {
      this.lctoRemote = _lctoRemote;
      this.monoTdFabricTx = _monoTdFabricTx;
      this.transactionBookmarkManager = _transactionBookmarkManager;
    }

    @Override
    public Mono<Void> commit() {
      return this.monoTdFabricTx.flatMap(FabricTx::comMono).doOnSuccess((bookmark) ->
      {
        this.transactionBookmarkManager
            .remoteTransactionCommitted(this.lctoRemote, bookmark);
      }).then();
    }

    @Override
    public Location getLocation() {
      return this.lctoRemote;
    }

    @Override
    public Mono<Void> rollback() {
      return this.monoTdFabricTx.flatMap(FabricTx::rolcMono).then();
    }

    @Override
    public Mono<Void> terminate(Status _raoStatus) {
      return this.rollback();
    }
  }


  private class RemoteTransactionContextImpl implements RemoteTransactionContext {


    private final CompositeTransaction compositeTransaction;


    private final FabricTransactionInfo fabricTransactionInfo;


    private final Map<Long, FabricDriver> mapDulf = new ConcurrentHashMap();


    private final Map<Long, SingleDbTransactionImpl> mapTdlf = new ConcurrentHashMap();


    private final TransactionBookmarkManager transactionBookmarkManager;

    private RemoteTransactionContextImpl(CompositeTransaction _compositeTransaction,
        FabricTransactionInfo _fabricTransactionInfo,
        TransactionBookmarkManager _transactionBookmarkManager) {
      this.compositeTransaction = _compositeTransaction;
      this.fabricTransactionInfo = _fabricTransactionInfo;
      this.transactionBookmarkManager = _transactionBookmarkManager;
    }


    private Mono<FabricTx> _beidretxMono(AccessMode _accessMode, ExecutionOptions _executionOptions,
        Remote _lctoRemote) {

      FabricDriver _fabricDriver = this._gedvFabricDriver(_lctoRemote);

      List<RemoteBookmark> _listBomrsRemoteBookmark = this.transactionBookmarkManager.getBookmarksForRemote(
          _lctoRemote);
      return _fabricDriver.betanMono(_accessMode, _executionOptions, this.fabricTransactionInfo,
          _listBomrsRemoteBookmark, _lctoRemote);
    }


    private FabricDriver _gedvFabricDriver(Remote _lctoRemote) {

      DefaultLoginContext _defaultLoginContext = (DefaultLoginContext) this.fabricTransactionInfo.getLoginContext();
      return (FabricDriver) this.mapDulf.computeIfAbsent(_lctoRemote.getGraphId(), (gid) ->
      {
        return FabricRemoteExecutorEnterpriseImpl.this.pdPoolingLifecycleAdapter.gedvFabricDriver(
            _defaultLoginContext, _lctoRemote);
      });
    }


    private Mono<FabricTx> _geocrttxMono(ExecutionOptions _executionOptions, Remote _lctoRemote,
        TransactionMode _transactionMode) {

      SingleDbTransactionImpl _teSingleDbTransactionImpl =
          (SingleDbTransactionImpl) this.mapTdlf.get(_lctoRemote.getGraphId());
      if (_teSingleDbTransactionImpl != null) {
        this._maudtwrgtsoForFaTr(_teSingleDbTransactionImpl, _transactionMode);
        return _teSingleDbTransactionImpl.monoTdFabricTx;
      } else {
        return ((SingleDbTransactionImpl) this.mapTdlf.computeIfAbsent(_lctoRemote.getGraphId(),
            (locationId) ->
            {
              switch (_transactionMode) {
                case DEFINITELY_WRITE:
                  return (SingleDbTransactionImpl) this.compositeTransaction.startWritingTransaction(
                      _lctoRemote, () ->
                      {

                        Mono<FabricTx> _monoTFabricTx = this._beidretxMono(AccessMode.WRITE,
                            _executionOptions, _lctoRemote);
                        return new SingleDbTransactionImpl(_lctoRemote, _monoTFabricTx,
                            this.transactionBookmarkManager);
                      });
                case MAYBE_WRITE:
                  return (SingleDbTransactionImpl) this.compositeTransaction.startReadingTransaction(
                      _lctoRemote, () ->
                      {

                        Mono<FabricTx> _monoTFabricTx2 = this._beidretxMono(AccessMode.WRITE,
                            _executionOptions, _lctoRemote);
                        return new SingleDbTransactionImpl(_lctoRemote, _monoTFabricTx2,
                            this.transactionBookmarkManager);
                      });
                case DEFINITELY_READ:
                  return (SingleDbTransactionImpl) this.compositeTransaction.startReadingOnlyTransaction(
                      _lctoRemote, () ->
                      {

                        Mono<FabricTx> _monoTFabricTx3 = this._beidretxMono(AccessMode.READ,
                            _executionOptions, _lctoRemote);
                        return new SingleDbTransactionImpl(_lctoRemote, _monoTFabricTx3,
                            this.transactionBookmarkManager);
                      });
                default:

                  throw new IllegalArgumentException(
                      "*** Error: 68bc70f8-41af-4a80-bac6-21b0f5b3555e");
              }
            })).monoTdFabricTx;
      }
    }


    private void _maudtwrgtsoForFaTr(SingleDbTransactionImpl _tSingleDbTransactionImpl,
        TransactionMode _transactionMode) {
      if (_transactionMode == TransactionMode.DEFINITELY_WRITE) {
        this.compositeTransaction.upgradeToWritingTransaction(_tSingleDbTransactionImpl);
      }
    }


    private Mono<StatementResult> _ruitxMono(Mono<FabricTx> _monoTFabricTx, MapValue _prmMapValue,
        String _strQey) {
      return _monoTFabricTx.map((rxTransaction) ->
      {
        return rxTransaction.runStatementResult(_prmMapValue, _strQey);
      }).cache();
    }

    @Override
    public void close() {
      this.mapDulf.values().forEach(FabricDriver::reee);
    }

    @Override
    public boolean isEmptyContext() {
      return this.mapDulf.isEmpty();
    }

    @Override
    public Mono<StatementResult> run(Remote _lctoRemote, ExecutionOptions _executionOptions,
        String _strQey, TransactionMode _transactionMode, MapValue _prmMapValue) {

      Mono<FabricTx> _monoTdFabricTx = this._geocrttxMono(_executionOptions, _lctoRemote,
          _transactionMode);
      return this._ruitxMono(_monoTdFabricTx, _prmMapValue, _strQey);
    }
  }
}
