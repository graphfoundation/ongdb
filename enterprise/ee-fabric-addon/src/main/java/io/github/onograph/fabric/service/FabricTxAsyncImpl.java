package io.github.onograph.fabric.service;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.driver.async.AsyncSession;
import org.neo4j.driver.async.AsyncTransaction;
import org.neo4j.driver.async.ResultCursor;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.FabricException;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


class FabricTxAsyncImpl implements FabricTx {


  private final AsyncSession asyncSession;


  private final AsyncTransaction asyncTransaction;


  private final AtomicReference<FabricException> atomicReferenceEpFabricException = new AtomicReference();


  private final ParamConversionUtil cpParamConversionUtil = new ParamConversionUtil();


  private final ExecutionOptions executionOptions;


  FabricTxAsyncImpl(AsyncSession _asyncSession, AsyncTransaction _asyncTransaction,
      ExecutionOptions _executionOptions) {
    this.asyncSession = _asyncSession;
    this.asyncTransaction = _asyncTransaction;
    this.executionOptions = _executionOptions;
  }

  @Override
  public Mono<RemoteBookmark> comMono() {
    return Mono.fromFuture(this.asyncTransaction.commitAsync().toCompletableFuture())
        .onErrorMap(Neo4jException.class, FabricDriverUtilities::trnaeoFabricException)
        .then(Mono.fromSupplier(() ->
        {
          return FabricDriverUtilities.corbkRemoteBookmark(this.asyncSession.lastBookmark());
        })).doFinally((s) ->
        {
          this.asyncSession.closeAsync();
        });
  }

  @Override
  public Mono<Void> rolcMono() {
    return Mono.fromFuture(this.asyncTransaction.rollbackAsync().toCompletableFuture()).then()
        .doFinally((s) ->
        {
          this.asyncSession.closeAsync();
        });
  }

  @Override
  public StatementResult runStatementResult(MapValue _prmMapValue, String _strQey) {

    Map<String, Object> _mapMpso = (Map) this.cpParamConversionUtil.covtvlObject(_prmMapValue);

    Mono<ResultCursor> _monoCrsResultCursor = Mono.fromFuture(
        this.asyncTransaction.runAsync(_strQey, _mapMpso).toCompletableFuture());
    return new DefaultStatementResultImpl(this.executionOptions, _monoCrsResultCursor);
  }


  private class DefaultStatementResultImpl extends AbstractStatementResult {


    private final RecordUtils crRecordUtils;


    private final Mono<ResultCursor> monoCrsResultCursor;


    DefaultStatementResultImpl(ExecutionOptions _executionOptions,
        Mono<ResultCursor> _monoCrsResultCursor) {
      super(FabricTxAsyncImpl.this.atomicReferenceEpFabricException,
          _executionOptions,
          _monoCrsResultCursor.map(ResultCursor::keys).flatMapMany(Flux::fromIterable),
          _monoCrsResultCursor.map(ResultCursor::consumeAsync).flatMap(Mono::fromCompletionStage));
      this.monoCrsResultCursor = _monoCrsResultCursor;
      this.crRecordUtils = new RecordUtils(_executionOptions);
    }

    @Override
    protected Flux<Record> dogererFlux() {
      return this.monoCrsResultCursor.flatMapMany((cursor) ->
      {
        return Flux.from(new PublisherRecordImpl(this.crRecordUtils, cursor));
      });
    }
  }
}
