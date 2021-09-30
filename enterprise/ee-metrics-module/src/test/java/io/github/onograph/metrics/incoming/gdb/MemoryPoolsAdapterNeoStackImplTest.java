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

class MemoryPoolsAdapterNeoStackImplTest {

  @Test
  void testConstructor() {
    MemoryPoolsAdapterNeoStackImpl actualMemoryPoolsAdapterNeoStackImpl = new MemoryPoolsAdapterNeoStackImpl();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, actualMemoryPoolsAdapterNeoStackImpl.getGrp());
    assertNull(actualMemoryPoolsAdapterNeoStackImpl.memoryPools);
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new MemoryPoolsAdapterNeoStackImpl("Mprnm", _metricRegistryManager,
            new MemoryPools(true))).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new MemoryPoolsAdapterNeoStackImpl("", _metricRegistryManager,
            new MemoryPools(true))).getGrp());
  }

  @Test
  void testMoydmdmineString() {
    assertEquals("dbms.pool.<pool>. str Mti",
        (new MemoryPoolsAdapterNeoStackImpl()).moydmdmineString(" str Mti"));
  }

  @Test
  void testNaepomeiString() {
    MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl = new MemoryPoolsAdapterNeoStackImpl();
    assertEquals("dbms.pool.http transaction. str nm",
        memoryPoolsAdapterNeoStackImpl.naepomeiString(
            new HttpTransactionMemoryPool(new MemoryPools(true)), " str Nm"));
  }

  @Test
  void testPolList() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertTrue((new MemoryPoolsAdapterNeoStackImpl("Mprnm", _metricRegistryManager,
        new MemoryPools(true))).polList()
        .isEmpty());
  }
}

