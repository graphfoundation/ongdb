package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.memory.MemoryPools;
import org.neo4j.server.http.HttpTransactionMemoryPool;

class MemoryPoolsAdapterGdbImplTest {

  @Test
  void testConstructor() {
    MemoryPoolsAdapterGdbImpl actualMemoryPoolsAdapterGdbImpl = new MemoryPoolsAdapterGdbImpl();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, actualMemoryPoolsAdapterGdbImpl.getGrp());
    assertNull(actualMemoryPoolsAdapterGdbImpl.memoryPools);
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new MemoryPoolsAdapterGdbImpl("Mprnm", _metricRegistryManager, new MemoryPools(true),
            "Gdb Name")).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new MemoryPoolsAdapterGdbImpl("", _metricRegistryManager, new MemoryPools(true),
            "Gdb Name")).getGrp());
  }

  @Test
  void testMoydmdmineString() {
    assertEquals("pool.<pool>.<database>. str Mti",
        (new MemoryPoolsAdapterGdbImpl()).moydmdmineString(" str Mti"));
  }

  @Test
  void testNaepomeiString() {
    MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl = new MemoryPoolsAdapterGdbImpl();
    assertEquals("pool.http transaction.. str nm",
        memoryPoolsAdapterGdbImpl.naepomeiString(
            new HttpTransactionMemoryPool(new MemoryPools(true)), " str Nm"));
  }

  @Test
  void testPolList() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertTrue(
        (new MemoryPoolsAdapterGdbImpl("Mprnm", _metricRegistryManager, new MemoryPools(true),
            "Gdb Name")).polList()
            .isEmpty());
  }
}

