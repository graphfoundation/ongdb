package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.Snapshot;
import org.junit.jupiter.api.Test;

class TransactionSizeMonitorImplTest {

  @Test
  void testAddHeapTransactionSize() {
    TransactionSizeMonitorImpl transactionSizeMonitorImpl = new TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl.addHeapTransactionSize(1L);
    Histogram sthHistogram = transactionSizeMonitorImpl.getSthHistogram();
    assertTrue(sthHistogram.getSnapshot() instanceof com.codahale.metrics.UniformSnapshot);
    assertEquals(1L, sthHistogram.getCount());
  }

  @Test
  void testAddNativeTransactionSize() {
    TransactionSizeMonitorImpl transactionSizeMonitorImpl = new TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl.addNativeTransactionSize(1L);
    Histogram stnHistogram = transactionSizeMonitorImpl.getStnHistogram();
    assertTrue(stnHistogram.getSnapshot() instanceof com.codahale.metrics.UniformSnapshot);
    assertEquals(1L, stnHistogram.getCount());
  }

  @Test
  void testConstructor() {
    TransactionSizeMonitorImpl actualTransactionSizeMonitorImpl = new TransactionSizeMonitorImpl();
    Histogram sthHistogram = actualTransactionSizeMonitorImpl.getSthHistogram();
    Snapshot snapshot = sthHistogram.getSnapshot();
    assertTrue(snapshot instanceof com.codahale.metrics.UniformSnapshot);
    Histogram stnHistogram = actualTransactionSizeMonitorImpl.getStnHistogram();
    Snapshot snapshot1 = stnHistogram.getSnapshot();
    assertTrue(snapshot1 instanceof com.codahale.metrics.UniformSnapshot);
    assertEquals(0L, sthHistogram.getCount());
    assertEquals(0L, stnHistogram.getCount());
    long[] values = snapshot1.getValues();
    assertEquals(0, values.length);
    assertArrayEquals(new long[]{}, values);
    assertEquals(0.0, snapshot1.getStdDev());
    assertEquals(0L, snapshot1.getMin());
    assertEquals(0.0, snapshot1.getMedian());
    assertEquals(0.0, snapshot1.getMean());
    assertEquals(0L, snapshot1.getMax());
    long[] values1 = snapshot.getValues();
    assertEquals(0, values1.length);
    assertArrayEquals(new long[]{}, values1);
    assertEquals(0.0, snapshot.getStdDev());
    assertEquals(0L, snapshot.getMin());
    assertEquals(0.0, snapshot.getMedian());
    assertEquals(0.0, snapshot.getMean());
    assertEquals(0L, snapshot.getMax());
    assertEquals(0, snapshot1.size());
    assertEquals(0, snapshot.size());
  }
}

