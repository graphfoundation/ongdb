package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.storageengine.api.TransactionIdStore;

class GlobalTransactionStatsAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, (new GlobalTransactionStatsAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GlobalTransactionStatsAdapter("Mprnm",
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<TransactionIdStore>) mock(Supplier.class),
            mock(TransactionCounters.class))).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GlobalTransactionStatsAdapter("",
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<TransactionIdStore>) mock(Supplier.class),
            mock(TransactionCounters.class))).getGrp());
  }

  @Test
  void testStart() {
    TransactionCounters transactionCounters = mock(TransactionCounters.class);
    doNothing().when(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new GlobalTransactionStatsAdapter("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<TransactionIdStore>) mock(Supplier.class), transactionCounters)).start();
    verify(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
  }

  @Test
  void testStart2() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    TransactionCounters transactionCounters = mock(TransactionCounters.class);
    doNothing().when(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
    (new GlobalTransactionStatsAdapter("Mprnm", _metricRegistryManager,
        (Supplier<TransactionIdStore>) mock(Supplier.class), transactionCounters)).start();
    verify(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
  }

  @Test
  void testStart3() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    TransactionCounters transactionCounters = mock(TransactionCounters.class);
    doNothing().when(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
    (new GlobalTransactionStatsAdapter("Mprnm", _metricRegistryManager,
        (Supplier<TransactionIdStore>) mock(Supplier.class), transactionCounters)).start();
    verify(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
  }

  @Test
  void testStart4() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    TransactionCounters transactionCounters = mock(TransactionCounters.class);
    doNothing().when(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
    (new GlobalTransactionStatsAdapter("Pattern", _metricRegistryManager,
        (Supplier<TransactionIdStore>) mock(Supplier.class), transactionCounters)).start();
    verify(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
  }

  @Test
  void testStop() {
    TransactionCounters transactionCounters = mock(TransactionCounters.class);
    doNothing().when(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new GlobalTransactionStatsAdapter("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<TransactionIdStore>) mock(Supplier.class), transactionCounters)).stop();
    verify(transactionCounters)
        .setTransactionSizeCallback(
            (org.neo4j.kernel.impl.api.transaction.monitor.TransactionSizeMonitor) any());
  }
}

