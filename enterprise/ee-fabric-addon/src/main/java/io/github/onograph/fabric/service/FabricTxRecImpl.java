package io.github.onograph.fabric.service;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.driver.reactive.RxResult;
import org.neo4j.driver.reactive.RxSession;
import org.neo4j.driver.reactive.RxTransaction;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.FabricException;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


class FabricTxRecImpl implements FabricTx {


  private final AtomicReference<FabricException> atomicReferenceEpFabricException = new AtomicReference();


  private final ParamConversionUtil cpParamConversionUtil = new ParamConversionUtil();


  private final ExecutionOptions executionOptions;


  private final RxSession rxSession;


  private final RxTransaction rxTransaction;


  FabricTxRecImpl(ExecutionOptions _executionOptions, RxSession _rxSession,
      RxTransaction _rxTransaction) {
    this.executionOptions = _executionOptions;
    this.rxSession = _rxSession;
    this.rxTransaction = _rxTransaction;
  }

  @Override
  public Mono<RemoteBookmark> comMono() {
    return Mono.from(this.rxTransaction.commit())
        .onErrorMap(Neo4jException.class, FabricDriverUtilities::trnaeoFabricException)
        .then(Mono.fromSupplier(() ->
        {
          return FabricDriverUtilities
              .corbkRemoteBookmark(
                  this.rxSession
                      .lastBookmark());
        }))
        .doFinally((s) ->
        {
          this.rxSession.close();
        });
  }

  @Override
  public Mono<Void> rolcMono() {
    return Mono.from(this.rxTransaction.rollback()).then().doFinally((s) ->
    {
      this.rxSession.close();
    });
  }

  @Override
  public StatementResult runStatementResult(MapValue _prmMapValue, String _strQey) {

    Map<String, Object> _mapPmso = (Map) this.cpParamConversionUtil.covtvlObject(_prmMapValue);

    RxResult _rsrRxResult = this.rxTransaction.run(_strQey, _mapPmso);
    return new StatementResultDefaultImpl(this.executionOptions, _rsrRxResult);
  }


  private class StatementResultDefaultImpl extends AbstractStatementResult {


    private final RxResult rsrRxResult;


    StatementResultDefaultImpl(ExecutionOptions _executionOptions, RxResult _rsrRxResult) {
      super(FabricTxRecImpl.this.atomicReferenceEpFabricException, _executionOptions,
          Mono.from(_rsrRxResult.keys()).flatMapMany(Flux::fromIterable),
          Mono.from(_rsrRxResult.consume()));
      this.rsrRxResult = _rsrRxResult;
    }

    @Override
    protected Flux<Record> dogererFlux() {
      return this.corrresFlux(Flux.from(this.rsrRxResult.records()));
    }
  }
}
