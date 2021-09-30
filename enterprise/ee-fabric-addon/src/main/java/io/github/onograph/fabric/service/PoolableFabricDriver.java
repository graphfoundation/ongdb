package io.github.onograph.fabric.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.neo4j.bolt.runtime.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.TransactionConfig;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.driver.reactive.RxResult;
import org.neo4j.driver.reactive.RxSession;
import org.neo4j.driver.reactive.RxTransaction;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.transaction.FabricTransactionInfo;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


class PoolableFabricDriver extends FabricDriver {


  private final Driver driver;


  PoolableFabricDriver(Consumer<FabricDriver> _consumerRcFabricDriver, Driver _driver) {
    super(_consumerRcFabricDriver, _driver);
    this.driver = _driver;
  }


  private Mono<RxTransaction> _geditrcMono(FabricTransactionInfo _fabricTransactionInfo,
      RxSession _rxSession) {

    TransactionConfig _transactionConfig = this.getatcoForFa(_fabricTransactionInfo);
    return Mono.from(_rxSession.beginTransaction(_transactionConfig));
  }

  @Override
  public Mono<FabricTx> betanMono(AccessMode _accessMode, ExecutionOptions _executionOptions,
      FabricTransactionInfo _fabricTransactionInfo, List<RemoteBookmark> _listBomrsRemoteBookmark,
      Remote _lctoRemote) {

    SessionConfig _sessionConfig = this.cresicnForLoAcLi(_accessMode, _lctoRemote,
        _listBomrsRemoteBookmark);

    RxSession _rxSession = this.driver.rxSession(_sessionConfig);

    Mono<RxTransaction> _monoTdRxTransaction = this._geditrcMono(_fabricTransactionInfo,
        _rxSession);
    return _monoTdRxTransaction.onErrorMap(Neo4jException.class,
        FabricDriverUtilities::trnaeoFabricException).map((tx) ->
    {

      FabricTx _tdfFabricTx =
          new FabricTxRecImpl(
              _executionOptions,
              _rxSession, tx);
      return _tdfFabricTx;
    }).cache();
  }

  @Override
  public BookmarkableStatementResult runBookmarkableStatementResult(AccessMode _accessMode,
      ExecutionOptions _executionOptions, FabricTransactionInfo _fabricTransactionInfo,
      List<RemoteBookmark> _listBomrsRemoteBookmark, MapValue _prmMapValue, Remote _lctoRemote,
      String _strQey) {

    SessionConfig _sessionConfig = this.cresicnForLoAcLi(_accessMode, _lctoRemote,
        _listBomrsRemoteBookmark);

    RxSession _rxSession = this.driver.rxSession(_sessionConfig);

    ParamConversionUtil _cpParamConversionUtil = new ParamConversionUtil();

    Map<String, Object> _mapMpso = (Map) _cpParamConversionUtil.covtvlObject(_prmMapValue);

    TransactionConfig _transactionConfig = this.getatcoForFa(_fabricTransactionInfo);

    RxResult _rxResult = _rxSession.run(_strQey, _mapMpso, _transactionConfig);
    return new BookmarkableStatementResultImpl(_executionOptions, _rxResult, _rxSession);
  }


  private static class BookmarkableStatementResultImpl extends AbstractStatementResult implements
      BookmarkableStatementResult {


    private final CompletableFuture fbCompletableFuture;


    private final RxResult rxResult;


    private final RxSession rxSession;


    BookmarkableStatementResultImpl(ExecutionOptions _executionOptions, RxResult _rxResult,
        RxSession _rxSession) {

      super(_executionOptions, Mono.from(_rxResult.keys()).flatMapMany(Flux::fromIterable),
          _rxSession::close, Mono.from(_rxResult.consume()));

      this.fbCompletableFuture = new CompletableFuture<>();
      this.rxSession = _rxSession;
      this.rxResult = _rxResult;
    }

    @Override
    protected Flux<Record> dogererFlux() {
      return this.corrresFlux(Flux.from(this.rxResult.records())).doOnComplete(() ->
      {

        RemoteBookmark _remoteBookmark =
            FabricDriverUtilities.corbkRemoteBookmark(
                this.rxSession.lastBookmark());
        this.fbCompletableFuture.complete(_remoteBookmark);
      });
    }

    @Override
    public Mono<RemoteBookmark> gebkrMono() {
      return Mono.fromFuture(this.fbCompletableFuture);
    }
  }
}
