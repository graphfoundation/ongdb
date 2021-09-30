package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.UniformReservoir;
import org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor;


public class TransactionSizeMonitorImpl implements TransactionSizeMonitor {


  private final Histogram sthHistogram = new Histogram(new UniformReservoir());


  private final Histogram stnHistogram = new Histogram(new UniformReservoir());

  @Override
  public void addHeapTransactionSize(long _lgHst) {
    this.sthHistogram.update(_lgHst);
  }

  @Override
  public void addNativeTransactionSize(long _lgNst) {
    this.stnHistogram.update(_lgNst);
  }


  Histogram getSthHistogram() {
    return this.sthHistogram;
  }


  Histogram getStnHistogram() {
    return this.stnHistogram;
  }
}
