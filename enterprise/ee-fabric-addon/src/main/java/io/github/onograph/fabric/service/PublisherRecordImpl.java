package io.github.onograph.fabric.service;

import java.util.Objects;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.driver.Value;
import org.neo4j.driver.async.ResultCursor;
import org.neo4j.driver.internal.util.Futures;
import org.neo4j.fabric.stream.Record;
import org.neo4j.fabric.stream.Records;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;


class PublisherRecordImpl implements Publisher<Record> {


  private final RecordUtils crRecordUtils;


  private final AtomicBoolean pouigAtomicBoolean = new AtomicBoolean(false);


  private final AtomicLong rpAtomicLong = new AtomicLong();


  private final ResultCursor saeetResultCursor;


  private Subscriber<? super Record> subscriberSbcieRecord;


  PublisherRecordImpl(RecordUtils _crRecordUtils, ResultCursor _saeetResultCursor) {
    this.crRecordUtils = _crRecordUtils;
    this.saeetResultCursor = _saeetResultCursor;
  }


  private void _mabpru() {
    if (this.rpAtomicLong.get() != 0L && this.pouigAtomicBoolean.compareAndSet(false, true)) {
      this._prde();
    }
  }


  private void _prde() {

    CompletionStage<org.neo4j.driver.Record> _completionStageFrRecord = this.saeetResultCursor.nextAsync();
    _completionStageFrRecord.whenComplete((record, completionError) ->
    {

      Throwable _errThrowable = Futures.completionExceptionCause(completionError);
      if (_errThrowable != null) {
        this.subscriberSbcieRecord.onError(_errThrowable);
      } else if (record == null) {
        this.subscriberSbcieRecord.onComplete();
      } else {

        long _lgPnig = this.rpAtomicLong.decrementAndGet();

        try {

          Record _cnetdRecord = Records.lazy(record.size(), () ->
          {

            Stream<Value> _streamVr00Value = record.values().stream();

            RecordUtils _recordUtils = this.crRecordUtils;
            Objects.requireNonNull(_recordUtils);
            return Records.of(
                _streamVr00Value.map(_recordUtils::_covtvlAnyValue).collect(Collectors.toList()));
          });
          this.subscriberSbcieRecord.onNext(_cnetdRecord);
        } catch (

            Throwable _throwable) {
          this.subscriberSbcieRecord.onError(_throwable);
          return;
        }

        if (_lgPnig > 0L) {
          this._prde();
        } else {
          this.pouigAtomicBoolean.set(false);
          this._mabpru();
        }
      }
    });
  }

  @Override
  public void subscribe(Subscriber<? super Record> _subscriberSbcieRecord) {
    this.subscriberSbcieRecord = _subscriberSbcieRecord;
    _subscriberSbcieRecord.onSubscribe(new Subscription() {
      @Override
      public void cancel() {
        PublisherRecordImpl.this.saeetResultCursor.consumeAsync();
      }

      @Override
      public void request(long _lgL) {
        PublisherRecordImpl.this.rpAtomicLong.addAndGet(_lgL);
        PublisherRecordImpl.this._mabpru();
      }
    });
  }
}
