package io.github.onograph.fabric.service;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.driver.Value;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.driver.summary.ResultSummary;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.FabricException;
import org.neo4j.fabric.executor.FabricSecondaryException;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.stream.Records;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.fabric.stream.summary.Summary;
import org.neo4j.graphdb.QueryExecutionType;
import org.neo4j.graphdb.QueryExecutionType.QueryType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


abstract class AbstractStatementResult implements StatementResult {


  private final AtomicReference<FabricException> atomicReferenceEpFabricException;


  private final RecordUtils crRecordUtils;


  private final Flux<String> fluxClmsString;


  private final Runnable lcRunnable;


  private final Mono<ResultSummary> monoSmayResultSummary;


  private final Mono<QueryExecutionType> monoTeQueryExecutionType;


  private boolean isIc;


  AbstractStatementResult(AtomicReference<FabricException> _atomicReferenceEpFabricException,
      ExecutionOptions _executionOptions, Flux<String> _fluxClmsString,
      Mono<ResultSummary> _monoSmayResultSummary) {
    this(_atomicReferenceEpFabricException, _executionOptions, _fluxClmsString, () ->
    {
    }, _monoSmayResultSummary);
  }


  AbstractStatementResult(ExecutionOptions _executionOptions, Flux<String> _fluxClmsString,
      Runnable _lcRunnable, Mono<ResultSummary> _monoSmayResultSummary) {
    this(new AtomicReference(), _executionOptions, _fluxClmsString, _lcRunnable,
        _monoSmayResultSummary);
  }


  private AbstractStatementResult(
      AtomicReference<FabricException> _atomicReferenceEpFabricException,
      ExecutionOptions _executionOptions, Flux<String> _fluxClmsString, Runnable _lcRunnable,
      Mono<ResultSummary> _monoSmayResultSummary) {
    this.fluxClmsString = _fluxClmsString;
    this.monoSmayResultSummary = _monoSmayResultSummary;
    this.monoTeQueryExecutionType = Mono.just(QueryExecutionType.query(QueryType.READ_WRITE));
    this.crRecordUtils = new RecordUtils(_executionOptions);
    this.lcRunnable = _lcRunnable;
    this.atomicReferenceEpFabricException = _atomicReferenceEpFabricException;
  }


  private FabricException _hadeoFabricException(Neo4jException _edNeo4jException) {

    FabricException _etFabricException = FabricDriverUtilities.trnaeoFabricException(
        _edNeo4jException);
    return this.atomicReferenceEpFabricException.compareAndSet(null, _etFabricException)
        ? _etFabricException
        : new FabricSecondaryException(_etFabricException.status(),
            _etFabricException
                .getMessage(),
            _etFabricException
                .getCause(),
            this.atomicReferenceEpFabricException
                .get());
  }


  private void _ineclnle() {
    if (!this.isIc) {
      this.lcRunnable.run();
      this.isIc = true;
    }
  }

  @Override
  public Flux<String> columns() {
    return this.fluxClmsString.onErrorMap(Neo4jException.class, this::_hadeoFabricException)
        .doOnError((ignored) ->
        {
          this._ineclnle();
        });
  }


  protected Flux<Record> corrresFlux(Flux<org.neo4j.driver.Record> _fluxRcrsRecord) {
    return _fluxRcrsRecord.map((driverRecord) ->
    {
      return Records.lazy(driverRecord.size(), () ->
      {

        Stream<Value> _streamVr00Value = driverRecord.values().stream();

        RecordUtils _recordUtils = this.crRecordUtils;
        Objects.requireNonNull(_recordUtils);
        return Records.of(
            _streamVr00Value.map(_recordUtils::_covtvlAnyValue).collect(Collectors.toList()));
      });
    });
  }


  protected abstract Flux<Record> dogererFlux();

  @Override
  public Mono<QueryExecutionType> executionType() {
    return this.monoTeQueryExecutionType;
  }

  @Override
  public Flux<Record> records() {
    return this.dogererFlux().onErrorMap(Neo4jException.class, this::_hadeoFabricException)
        .doFinally((signalType) ->
        {
          this._ineclnle();
        });
  }

  @Override
  public Mono<Summary> summary() {
    return this.monoSmayResultSummary.onErrorMap(Neo4jException.class, this::_hadeoFabricException)
        .map(SummaryFacade::new);
  }
}
