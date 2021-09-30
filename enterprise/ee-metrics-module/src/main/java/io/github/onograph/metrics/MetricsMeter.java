package io.github.onograph.metrics;

import com.codahale.metrics.Meter;
import java.util.function.LongSupplier;


public class MetricsMeter extends Meter {


  private final LongSupplier scLongSupplier;


  private volatile long lgMem;

  public MetricsMeter(LongSupplier _scLongSupplier) {
    this.scLongSupplier = _scLongSupplier;
  }

  @Override
  public long getCount() {
    try {
      return this.lgMem = this.scLongSupplier.getAsLong();
    } catch (

        Exception _exception) {
      return this.lgMem;
    }
  }
}
