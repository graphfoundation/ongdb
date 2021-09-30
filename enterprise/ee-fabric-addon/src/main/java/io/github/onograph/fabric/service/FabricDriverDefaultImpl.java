package io.github.onograph.fabric.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;
import org.neo4j.bolt.runtime.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.TransactionConfig;
import org.neo4j.driver.async.AsyncSession;
import org.neo4j.driver.async.AsyncTransaction;
import org.neo4j.driver.async.ResultCursor;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.transaction.FabricTransactionInfo;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class FabricDriverDefaultImpl extends FabricDriver {


  private final Driver driver;


  FabricDriverDefaultImpl(Consumer<FabricDriver> _consumerCrFabricDriver, Driver _driver) {
    super(_consumerCrFabricDriver, _driver);
    this.driver = _driver;
  }


  private CompletionStage<AsyncTransaction> _geditrcCompletionStage(AsyncSession _asyncSession,
      FabricTransactionInfo _fabricTransactionInfo) {

    TransactionConfig _transactionConfig = this.getatcoForFa(_fabricTransactionInfo);
    return _asyncSession.beginTransactionAsync(_transactionConfig);
  }

  @Override
  public Mono<FabricTx> betanMono(AccessMode _accessMode, ExecutionOptions _executionOptions,
      FabricTransactionInfo _fabricTransactionInfo, List<RemoteBookmark> _listBomrsRemoteBookmark,
      Remote _lctoRemote) {

    SessionConfig _sessionConfig = this.cresicnForLoAcLi(_accessMode, _lctoRemote,
        _listBomrsRemoteBookmark);

    AsyncSession _asyncSession = this.driver.asyncSession(_sessionConfig);

    CompletionStage<AsyncTransaction> _completionStageTdAsyncTransaction = this._geditrcCompletionStage(
        _asyncSession, _fabricTransactionInfo);
    return Mono.fromFuture(_completionStageTdAsyncTransaction.toCompletableFuture())
        .onErrorMap(Neo4jException.class, FabricDriverUtilities::trnaeoFabricException).map((tx) ->
        {

          FabricTx
              _tdfFabricTx =
              new FabricTxAsyncImpl(
                  _asyncSession,
                  tx,
                  _executionOptions);
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

    AsyncSession _asyncSession = this.driver.asyncSession(_sessionConfig);

    ParamConversionUtil _cpParamConversionUtil = new ParamConversionUtil();

    Map<String, Object> _mapMpso = (Map) _cpParamConversionUtil.covtvlObject(_prmMapValue);

    TransactionConfig _transactionConfig = this.getatcoForFa(_fabricTransactionInfo);

    Mono<ResultCursor> _monoCrResultCursor = Mono.fromFuture(
        _asyncSession.runAsync(_strQey, _mapMpso, _transactionConfig).toCompletableFuture());
    return new BookmarkableStatementResultImpl(_asyncSession, _executionOptions,
        _monoCrResultCursor);
  }


  private static class BookmarkableStatementResultImpl extends AbstractStatementResult implements
      BookmarkableStatementResult {


    private final AsyncSession asyncSession;


    private final CompletableFuture<RemoteBookmark> completableFutureFbRemoteBookmark;


    private final RecordUtils crRecordUtils;


    private final Mono<ResultCursor> monoCrsResultCursor;


    BookmarkableStatementResultImpl(AsyncSession _asyncSession, ExecutionOptions _executionOptions,
        Mono<ResultCursor> _monoCrsResultCursor) {
      super(_executionOptions,
          _monoCrsResultCursor.map(ResultCursor::keys).flatMapMany(Flux::fromIterable),
          _asyncSession::closeAsync,
          _monoCrsResultCursor.map(ResultCursor::consumeAsync).flatMap(Mono::fromCompletionStage));
      this.completableFutureFbRemoteBookmark = new CompletableFuture<>();
      this.asyncSession = _asyncSession;
      this.monoCrsResultCursor = _monoCrsResultCursor;
      this.crRecordUtils = new RecordUtils(_executionOptions);
    }

    @Override
    protected Flux<Record> dogererFlux() {
      return this.monoCrsResultCursor.flatMapMany((cursor) ->
      {
        return Flux.from(new PublisherRecordImpl(this.crRecordUtils, cursor));
      }).doOnComplete(() ->
      {

        RemoteBookmark _remoteBookmark = FabricDriverUtilities.corbkRemoteBookmark(
            this.asyncSession.lastBookmark());
        this.completableFutureFbRemoteBookmark.complete(_remoteBookmark);
      });
    }

    @Override
    public Mono<RemoteBookmark> gebkrMono() {
      return Mono.fromFuture(this.completableFutureFbRemoteBookmark);
    }
  }
}
