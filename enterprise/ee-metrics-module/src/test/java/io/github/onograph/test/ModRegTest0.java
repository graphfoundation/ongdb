package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest0 {

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0001");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.CLX_UNEHL_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.core.discovery.cluster.unreachable" + "'", str0,
        "causal_clustering.core.discovery.cluster.unreachable");
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) '#', (int) '4', compressionOption5,
          rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType0 = io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC;
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType0 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC + "'",
        enterpriseMetricsType0.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC));
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver0 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    org.junit.Assert.assertNotNull(livingCacheObserver0);
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0005");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_DRO_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.drop" + "'", str0,
        "db.operation.count.drop");
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter0 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter();
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType0 = io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_CLUSTER;
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType0 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_CLUSTER + "'",
        enterpriseMetricsType0.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_CLUSTER));
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter.FIN_LED_MSX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.core.last_leader_message" + "'", str0,
        "causal_clustering.core.last_leader_message");
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0009");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl3 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "", metricRegistryManager1, monitors2);
    try {
      jVMAdapterSDPImpl3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0010");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter4 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "hi!", metricRegistryManager1, storeEntityCountersSupplier2, pageCacheTracer3);
    try {
      gdbStatsAdapter4.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.function.ThrowingAction throwingAction1 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle2 = org.neo4j.kernel.lifecycle.LifecycleAdapter.simpleLife(
        throwingAction0, throwingAction1);
    org.junit.Assert.assertNotNull(lifecycle2);
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) 1, (int) (byte) 10,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0013");
    }
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter0 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter();
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0014");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl3 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "", metricRegistryManager1, monitors2);
    try {
      jVMAdapterSDPImpl3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0015");
    }
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter0 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter();
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0016");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters2 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter3 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "db.operation.count.drop", metricRegistryManager1, checkpointCounters2);
    try {
      checkpointCounterAdapter3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter0 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter();
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.CLX_CVGX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.core.discovery.cluster.converged" + "'", str0,
        "causal_clustering.core.discovery.cluster.converged");
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "hi!", metricRegistryManager1);
    try {
      jVMAdapterFileStatImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter4 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "hi!", metricRegistryManager1, storeEntityCountersSupplier2, pageCacheTracer3);
    gdbStatsAdapter4.shutdown();
    try {
      gdbStatsAdapter4.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    try {
      io.github.onograph.metrics.MetricsServiceLifecycle metricsServiceLifecycle2 = new io.github.onograph.metrics.MetricsServiceLifecycle(
          requiredComponents0, extensionContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl();
    java.lang.String str2 = jVMAdapterPoolImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "causal_clustering.core.discovery.cluster.converged" + "'", str2,
        "causal_clustering.core.discovery.cluster.converged");
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0023");
    }
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType0 = io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM;
    java.lang.Class<?> wildcardClass1 = enterpriseMetricsType0.getClass();
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType0 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM + "'",
        enterpriseMetricsType0.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM));
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter0 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter();
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0025");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_FAL_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.failed" + "'", str0,
        "db.operation.count.failed");
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.memory.MemoryPools memoryPools2 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl3 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.drop", metricRegistryManager1, memoryPools2);
    try {
      memoryPoolsAdapterNeoStackImpl3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter0 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter();
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter.CON_REL_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j.count.relationship" + "'", str0,
        "neo4j.count.relationship");
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_BEG_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.start" + "'", str0,
        "db.operation.count.start");
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0030");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onInit(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0031");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.HEA_LIMT_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.heap.max" + "'", str0, "vm.heap.max");
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0032");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0033");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl();
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0034");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "", metricRegistryManager1);
    try {
      jVMAdapterThreadMXImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.COPD_DAX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.core.discovery.replicated_data" + "'", str0,
        "causal_clustering.core.discovery.replicated_data");
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager2 = null;
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter3 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "", monitors1, metricRegistryManager2);
    try {
      readReplicaNodeAdapter3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl();
    java.lang.Class<?> wildcardClass1 = jVMAdapterGarbageCollectionImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_RCOX_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.recovered" + "'",
        str0, "db.operation.count.recovered");
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0039");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter3 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager1, monitors2);
    try {
      boltAdapter3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0040");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.HEA_USE_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.heap.used" + "'", str0,
        "vm.heap.used");
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0041");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onShutdown(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.drop", metricRegistryManager1);
    try {
      jVMAdapterMBImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = new io.github.onograph.metrics.incoming.JettyAdapter();
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jettyAdapter0.getGrp();
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType1 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC + "'",
        enterpriseMetricsType1.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC));
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.start", metricRegistryManager1);
    try {
      jVMAdapterGarbageCollectionImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0045");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_CRA_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.create" + "'", str0,
        "db.operation.count.create");
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager2 = null;
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter3 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "", monitors1, metricRegistryManager2);
    try {
      readReplicaNodeAdapter3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0047");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl();
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager6, storeEntityCountersSupplier10,
        pageCacheTracer11);
    try {
      java.util.SortedSet<java.lang.String> strSet13 = metricRegistryManager6.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl();
    java.lang.Class<?> wildcardClass1 = jVMAdapterFileStatImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0050");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter7 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager5,
        monitors6);
    try {
      metricRegistryManager5.reoForSt("db.operation.count.recovered");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.connectors.ConnectorPortRegister connectorPortRegister1 = null;
    io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.logging.Log log4 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport5 = null;
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.outgoing.ReportingService reportingService7 = new io.github.onograph.metrics.outgoing.ReportingService(
        config0, connectorPortRegister1, csvScheduledReporter2, fileSystemAbstraction3, log4,
        lifeSupport5, metricRegistry6);
    try {
      boolean boolean8 = reportingService7.isCofu();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter0 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter();
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0053");
    }
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter0 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter();
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "db.operation.count.drop");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0055");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl.PRF;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.query.execution" + "'", str0,
        "db.query.execution");
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter0 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter();
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0057");
    }
    java.util.function.Supplier<com.codahale.metrics.Reservoir> reservoirSupplier0 = null;
    try {
      io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craunConsensusMessageStats(
          reservoirSupplier0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0058");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    org.neo4j.scheduler.JobScheduler jobScheduler13 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction14 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager7,
        jobScheduler13, fileSystemAbstraction14, databaseLayout15);
    try {
      gdbStoreStatsAdapter16.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0059");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager6, monitors10);
    java.lang.Class<?> wildcardClass12 = metricRegistryManager6.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0060");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager7, databaseOperationCounts14);
    try {
      gdbActionsAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter0 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter();
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl();
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter4 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "hi!", metricRegistryManager1, storeEntityCountersSupplier2, pageCacheTracer3);
    gdbStatsAdapter4.shutdown();
    try {
      gdbStatsAdapter4.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager7, monitors11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager7);
    try {
      java.util.SortedSet<java.lang.String> strSet14 = metricRegistryManager7.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0065");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0066");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (short) 10, (int) (short) 0,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    org.neo4j.kernel.impl.query.QueryExecutionMonitor queryExecutionMonitor0 = org.neo4j.kernel.impl.query.QueryExecutionMonitor.NO_OP;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryExecutionMonitor0.beforeEnd(executingQuery1, true);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryExecutionMonitor0.beforeEnd(executingQuery4, true);
    org.junit.Assert.assertNotNull(queryExecutionMonitor0);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    java.time.Duration duration3 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration3, raftConsensusMessageType4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager9, monitors19);
    org.neo4j.memory.MemoryPools memoryPools21 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl22 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager9, memoryPools21);
    try {
      java.util.SortedSet<java.lang.String> strSet23 = metricRegistryManager9.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0070");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter7 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager5,
        monitors6);
    try {
      cypherPlanAdapter7.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "", metricRegistryManager1);
    try {
      jVMAdapterThreadMXImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        jobScheduler14, fileSystemAbstraction15, databaseLayout16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter19 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager8, monitors18);
    try {
      boltAdapter19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter10 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors1, metricRegistryManager7);
    try {
      metricRegistryManager7.reoForSt(
          "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        jobScheduler14, fileSystemAbstraction15, databaseLayout16);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        storeEntityCountersSupplier18);
    try {
      gdbElementStatsAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0075");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager8);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        transactionIdStoreSupplier15, transactionCounters16);
    try {
      globalTransactionStatsAdapter17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0076");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager8);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        transactionIdStoreSupplier15, transactionCounters16);
    try {
      globalTransactionStatsAdapter17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager7, jobScheduler14,
        fileSystemAbstraction15, databaseLayout16);
    try {
      gdbStoreStatsAdapter17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0078");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.memory.MemoryPools memoryPools6 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl8 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager5, memoryPools6,
        "causal_clustering.core.discovery.cluster.unreachable");
    try {
      memoryPoolsAdapterGdbImpl8.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0079");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.CLX_MEBS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.core.discovery.cluster.members" + "'", str0,
        "causal_clustering.core.discovery.cluster.members");
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0080");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter7 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager5,
        monitors6);
    try {
      cypherPlanAdapter7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0081");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents2 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle3 = metricsServiceExtensionFactory0.newInstance(
          extensionContext1, requiredComponents2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0082");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter13 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.recovered", metricRegistryManager8, pageCacheCounters12);
    try {
      neoPageCacheAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "hi!", metricRegistryManager6);
    try {
      jVMAdapterMemoryHeapImpl10.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0084");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter13 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.recovered", metricRegistryManager8, pageCacheCounters12);
    try {
      neoPageCacheAdapter13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (short) 1, (int) (short) -1,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.query.execution", metricRegistryManager7, memoryPools13,
        "pool.<pool>.<database>.db.operation.count.start");
    try {
      memoryPoolsAdapterGdbImpl15.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager6);
    jVMAdapterPoolImpl10.start();
    try {
      jVMAdapterPoolImpl10.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0088");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.memory.MemoryPools memoryPools2 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl3 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.drop", metricRegistryManager1, memoryPools2);
    try {
      memoryPoolsAdapterNeoStackImpl3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0089");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType3, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType1, 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0091");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "causal_clustering.core.discovery.cluster.members");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter.CON_ND_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j.count.node" + "'", str0,
        "neo4j.count.node");
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    try {
      queryExecutionMonitorMetricsImpl15.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0094");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType3, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "hi!", metricRegistryManager1);
    jVMAdapterFileStatImpl2.init();
    try {
      jVMAdapterFileStatImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    try {
      queryExecutionMonitorMetricsImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.GDB_SD_CSZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count.stop" + "'", str0,
        "db.operation.count.stop");
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0098");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    java.time.Duration duration2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType3 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration2, raftConsensusMessageType3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager8, databaseOperationCounts15);
    org.neo4j.memory.MemoryPools memoryPools17 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl19 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager8, memoryPools17,
        "db.operation.count.create");
    try {
      metricRegistryManager8.reoForSt("neo4j.count.node");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0100");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager9);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, jobScheduler17, fileSystemAbstraction18,
        databaseLayout19);
    try {
      gdbStoreStatsAdapter20.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (short) 1, (int) (short) 1,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0102");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter8 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager6,
        monitors7);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier9 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer10 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter11 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager6, storeEntityCountersSupplier9,
        pageCacheTracer10);
    try {
      gdbStatsAdapter11.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    java.lang.String str1 = metricsServiceExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext2 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents3 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle4 = metricsServiceExtensionFactory0.newInstance(
          extensionContext2, requiredComponents3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:MetricsServiceExtensionFactory[globalMetrics]" + "'",
        str1, "Extension:MetricsServiceExtensionFactory[globalMetrics]");
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "hi!", metricRegistryManager6);
    try {
      metricRegistryManager6.reoForSt("pool.<pool>.<database>.db.operation.count.start");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager7);
    java.lang.String str15 = jVMAdapterThreadMXImpl13.moydmdmineString("vm.heap.used");
    try {
      jVMAdapterThreadMXImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "vm.heap.used" + "'", str15,
        "vm.heap.used");
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager6);
    try {
      jVMAdapterPoolImpl10.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0107");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStart(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter0 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter();
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "db.operation.count.failed");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager8);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "vm.heap.max", metricRegistryManager8);
    try {
      jVMAdapterMBImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, 0L, (int) (short) 0, compressionOption5,
          rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager6, monitors10);
    try {
      cypherPlanAdapter11.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0113");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter1 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter();
    boolean boolean2 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter1);
    gdbTransactionLogAdapter1.shutdown();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager9);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, jobScheduler17, fileSystemAbstraction18,
        databaseLayout19);
    try {
      gdbStoreStatsAdapter20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0115");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier14 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter15 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager8, webContainerThreadInfoSupplier14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager8, monitors16);
    try {
      jVMAdapterSDPImpl17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter19 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors1, metricRegistryManager9);
    try {
      txCatchupAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl transactionSizeMonitorImpl0 = new io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) ' ');
    transactionSizeMonitorImpl0.addHeapTransactionSize((long) 'a');
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter13 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.recovered", metricRegistryManager8, pageCacheCounters12);
    try {
      metricRegistryManager8.reoForSt("neo4j.count.relationship");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0119");
    }
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter0 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter();
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0120");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager1);
    try {
      jVMAdapterFileStatImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.memory.MemoryPools memoryPools22 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager10, memoryPools22);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier24 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter26 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        transactionIdStoreSupplier24, transactionCounters25);
    try {
      globalTransactionStatsAdapter26.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter0 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter();
    gdbStatsAdapter0.init();
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    java.lang.String str0 = io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.HEA_CMTX_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.heap.committed" + "'", str0,
        "vm.heap.committed");
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0124");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.start();
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "hi!", metricRegistryManager6);
    com.codahale.metrics.MetricFilter metricFilter11 = null;
    try {
      metricRegistryManager6.reomcnForMe(metricFilter11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0126");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (short) 0, (int) '#',
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0127");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType3, 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl();
    java.lang.String str2 = memoryPoolsAdapterNeoStackImpl0.moydmdmineString(
        "db.operation.count.failed");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "dbms.pool.<pool>.db.operation.count.failed" + "'", str2,
        "dbms.pool.<pool>.db.operation.count.failed");
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0129");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter12 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors3, metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter13 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "neo4j.count.node", monitors1, metricRegistryManager9);
    try {
      txCatchupAdapter13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer();
    com.codahale.metrics.Timer timer3 = consensusMessageStats0.getTimer();
    java.time.Duration duration4 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType5 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration4, raftConsensusMessageType5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertNotNull(timer2);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(duration4);
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl3, metricRegistryManager10,
        coreNodeLeaderCheckSupplier16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.recovered", monitorsClusterConsensusImpl1, metricRegistryManager10,
        coreNodeLeaderCheckSupplier18);
    try {
      consensusCoreNodeAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.shutdown();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0133");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    java.time.Duration duration2 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType3 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration2, raftConsensusMessageType3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertNotNull(duration2);
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0134");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "hi!", metricRegistryManager8, jobScheduler19, fileSystemAbstraction20, databaseLayout21);
    try {
      gdbStoreStatsAdapter22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager8);
    java.lang.String str21 = jVMAdapterGarbageCollectionImpl19.moydmdmineString(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    java.lang.Class<?> wildcardClass22 = jVMAdapterGarbageCollectionImpl19.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str21, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    java.lang.Class<?> wildcardClass19 = queryExecutionMonitorMetricsImpl15.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0137");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier6 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters7 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter8 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager5,
        transactionIdStoreSupplier6, transactionCounters7);
    try {
      globalTransactionStatsAdapter8.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0138");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager10, databaseOperationCounts17);
    org.neo4j.memory.MemoryPools memoryPools19 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl21 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager10, memoryPools19,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager10, monitors22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl25 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors24);
    try {
      queryExecutionMonitorMetricsImpl25.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl6 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.stop", metricRegistryManager5);
    try {
      jVMAdapterMBImpl6.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "db.operation.count.start");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter3 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager1, monitors2);
    try {
      boltAdapter3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0142");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager8, databaseOperationCounts15);
    org.neo4j.memory.MemoryPools memoryPools17 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl19 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager8, memoryPools17,
        "db.operation.count.create");
    java.lang.Class<?> wildcardClass20 = memoryPoolsAdapterGdbImpl19.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0143");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    livingCacheMeta0.seeec((int) (short) 100);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0144");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    try {
      queryExecutionMonitorMetricsImpl15.endSuccess(executingQuery16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    try {
      queryExecutionMonitorMetricsImpl15.endSuccess(executingQuery19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0146");
    }
    io.github.onograph.metrics.incoming.cluster.PetConsensusLogApplied petConsensusLogApplied0 = new io.github.onograph.metrics.incoming.cluster.PetConsensusLogApplied();
    long long1 = petConsensusLogApplied0.apldid();
    long long2 = petConsensusLogApplied0.apldid();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    livingCacheMeta0.sememt(0);
    livingCacheMeta0.sememt((int) (byte) 10);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.memory.MemoryPools memoryPools6 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl8 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager5, memoryPools6,
        "causal_clustering.core.discovery.cluster.unreachable");
    try {
      memoryPoolsAdapterGdbImpl8.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    long long4 = consensusMessageStats0.dea();
    java.time.Duration duration5 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType6 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration5, raftConsensusMessageType6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0151");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    try {
      jVMAdapterThreadMXImpl17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager7);
    try {
      jVMAdapterThreadMXImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier15 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter16 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager9, webContainerThreadInfoSupplier15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager9, monitors17);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager9, storeEntityCountersSupplier19);
    gdbElementStatsAdapter20.start();
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0154");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType5, (int) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    long long4 = consensusMessageStats0.dea();
    java.time.Duration duration5 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType6 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration5, raftConsensusMessageType6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertNotNull(duration5);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0157");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager7, monitors11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.recovered", metricRegistryManager7);
    com.codahale.metrics.MetricFilter metricFilter14 = null;
    try {
      metricRegistryManager7.reomcnForMe(metricFilter14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0158");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl12 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter13 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors1, metricRegistryManager8);
    try {
      discoveryCoreNodeAdapter13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0159");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier14 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter15 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl1, metricRegistryManager8,
        coreNodeLeaderCheckSupplier14);
    try {
      consensusCoreNodeAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl17 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9,
        monitors16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl1,
        metricRegistryManager9, coreNodeLeaderCheckSupplier18);
    try {
      consensusCoreNodeAdapter19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier16 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter17 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager10, webContainerThreadInfoSupplier16);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "hi!", metricRegistryManager10, storeEntityCountersSupplier18, pageCacheTracer19);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter21 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "db.operation.count.recovered", monitors1, metricRegistryManager10);
    try {
      discoveryCoreNodeAdapter21.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0162");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl20 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "", metricRegistryManager8, monitors19);
    try {
      metricRegistryManager8.reoForSt("vm.heap.committed");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType5, (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0164");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager1);
    try {
      jVMAdapterFileStatImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(10L);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0166");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.memory.MemoryPools memoryPools14 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl16 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager13, memoryPools14,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager13, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager13, databaseOperationCounts20);
    gdbActionsAdapter21.start();
    gdbActionsAdapter21.start();
    boolean boolean24 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbActionsAdapter21);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext25 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents26 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle27 = metricsServiceExtensionFactory0.newInstance(
          extensionContext25, requiredComponents26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager9);
    org.neo4j.memory.MemoryPools memoryPools17 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl18 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.start", metricRegistryManager9, memoryPools17);
    try {
      memoryPoolsAdapterNeoStackImpl18.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier17 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter18 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl4, metricRegistryManager11,
        coreNodeLeaderCheckSupplier17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter20 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager11, monitors19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter22 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager11, monitors21);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier23 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager11, storeEntityCountersSupplier23,
        pageCacheTracer24);
    java.lang.Class<?> wildcardClass26 = metricRegistryManager11.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters2 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter3 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "db.operation.count.drop", metricRegistryManager1, checkpointCounters2);
    try {
      checkpointCounterAdapter3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0170");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.shutdown();
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl11 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager7);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager7, databaseOperationCounts12);
    try {
      gdbActionsAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0172");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.drop", metricRegistryManager1);
    try {
      jVMAdapterGarbageCollectionImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) 10, (int) (short) -1,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0174");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl();
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType5 = jVMAdapterGarbageCollectionImpl0.getGrp();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "db.operation.count.failed" + "'", str2,
        "db.operation.count.failed");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "causal_clustering.core.discovery.cluster.converged" + "'", str4,
        "causal_clustering.core.discovery.cluster.converged");
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType5 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM + "'",
        enterpriseMetricsType5.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM));
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl3, metricRegistryManager10,
        coreNodeLeaderCheckSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter19 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager10, monitors18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.create", metricRegistryManager10);
    try {
      jVMAdapterPoolImpl20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.memory.MemoryPools memoryPools22 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager10, memoryPools22);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.query.execution", metricRegistryManager10);
    com.codahale.metrics.MetricFilter metricFilter25 = null;
    try {
      metricRegistryManager10.reomcnForMe(metricFilter25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager7);
    try {
      metricRegistryManager7.reoForSt("causal_clustering.core.discovery.replicated_data");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl17 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9,
        monitors16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl1,
        metricRegistryManager9, coreNodeLeaderCheckSupplier18);
    com.codahale.metrics.MetricFilter metricFilter20 = null;
    try {
      metricRegistryManager9.reomcnForMe(metricFilter20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager10, databaseOperationCounts17);
    org.neo4j.memory.MemoryPools memoryPools19 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl21 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager10, memoryPools19,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager10, monitors22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl25 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    try {
      queryExecutionMonitorMetricsImpl25.endSuccess(executingQuery26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters22 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter23 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager10, pageCacheCounters22);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.create", metricRegistryManager10);
    try {
      jVMAdapterMBImpl24.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0181");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    com.codahale.metrics.Timer timer5 = consensusMessageStats0.getTimer(raftConsensusMessageType4);
    java.time.Duration duration6 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType7 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration6, raftConsensusMessageType7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNull(timer5);
    org.junit.Assert.assertNotNull(duration6);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager9, monitors19);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters21 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter22 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager9, pageCacheCounters21);
    try {
      neoPageCacheAdapter22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0183");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl11 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "hi!", metricRegistryManager7);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter13 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "neo4j.count.relationship", metricRegistryManager7, checkpointCounters12);
    try {
      checkpointCounterAdapter13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "hi!", metricRegistryManager9, jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters24 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter25 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager9, pageCacheCounters24);
    try {
      neoPageCacheAdapter25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) 'a', 1, compressionOption5,
          rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.memory.MemoryPools memoryPools12 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl14 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager11, memoryPools12,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager11, storeEntityCountersSupplier15,
        pageCacheTracer16);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager11, databaseOperationCounts18);
    org.neo4j.memory.MemoryPools memoryPools20 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl22 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager11, memoryPools20,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager11, monitors23);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter26 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager11,
        transactionLogCounters25);
    org.neo4j.monitoring.Monitors monitors27 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter28 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager11, monitors27);
    try {
      cypherPlanAdapter28.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter8 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager6,
        monitors7);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier9 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer10 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter11 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager6, storeEntityCountersSupplier9,
        pageCacheTracer10);
    try {
      gdbStatsAdapter11.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.getSizeCnt();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0189");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery19, "db.query.execution");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    try {
      queryExecutionMonitorMetricsImpl15.endSuccess(executingQuery22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    try {
      queryExecutionMonitorMetricsImpl13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.drop", metricRegistryManager1);
    java.lang.String str4 = jVMAdapterMBImpl2.moydmdmineString("vm.heap.max");
    try {
      jVMAdapterMBImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "vm.heap.max" + "'", str4, "vm.heap.max");
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0192");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter12 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors3, metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter13 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "neo4j.count.node", monitors1, metricRegistryManager9);
    try {
      txCatchupAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl17 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager14, memoryPools15,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager14, storeEntityCountersSupplier18,
        pageCacheTracer19);
    org.neo4j.scheduler.JobScheduler jobScheduler21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout23 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter24 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager14, jobScheduler21,
        fileSystemAbstraction22, databaseLayout23);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter26 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "", metricRegistryManager14, transactionLogCounters25);
    gdbTransactionLogAdapter26.start();
    boolean boolean28 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter26);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext29 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents30 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle31 = metricsServiceExtensionFactory0.newInstance(
          extensionContext29, requiredComponents30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0194");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl18 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl2,
        metricRegistryManager10, coreNodeLeaderCheckSupplier19);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters21 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter22 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "vm.heap.used", metricRegistryManager10, pageCacheCounters21);
    try {
      neoPageCacheAdapter22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "hi!", metricRegistryManager8, jobScheduler19, fileSystemAbstraction20, databaseLayout21);
    try {
      gdbStoreStatsAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0197");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    java.time.Duration duration1 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType2 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration1, raftConsensusMessageType2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNotNull(duration1);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0198");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl20 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "", metricRegistryManager8, monitors19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    try {
      queryExecutionMonitorMetricsImpl20.endSuccess(executingQuery21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    org.neo4j.scheduler.JobScheduler jobScheduler13 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction14 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager7,
        jobScheduler13, fileSystemAbstraction14, databaseLayout15);
    try {
      gdbStoreStatsAdapter16.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0200");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType5, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    org.neo4j.scheduler.JobScheduler jobScheduler18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12,
        jobScheduler18, fileSystemAbstraction19, databaseLayout20);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter22 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors4, metricRegistryManager12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier23 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter24 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager12, webContainerThreadInfoSupplier23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.drop", metricRegistryManager12);
    org.neo4j.monitoring.Monitors monitors26 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl27 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager12, monitors26);
    try {
      jVMAdapterSDPImpl27.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0202");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager7, databaseOperationCounts14);
    gdbActionsAdapter15.start();
    gdbActionsAdapter15.start();
    try {
      gdbActionsAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0203");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager14, monitors15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager14,
        jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter25 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager14, monitors24);
    org.neo4j.memory.MemoryPools memoryPools26 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl27 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager14, memoryPools26);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier28 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer29 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter30 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier28,
        pageCacheTracer29);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier31 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter32 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl3, metricRegistryManager14,
        coreNodeLeaderCheckSupplier31);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters33 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter34 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager14, checkpointCounters33);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters35 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter36 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager14,
        checkpointCounters35);
    try {
      checkpointCounterAdapter36.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0204");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager8, monitors19);
    try {
      jVMAdapterSDPImpl20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier16 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters17 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        transactionIdStoreSupplier16, transactionCounters17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager9, monitors19);
    try {
      boltAdapter20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0206");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager9, monitors19);
    org.neo4j.memory.MemoryPools memoryPools21 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl22 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager9, memoryPools21);
    java.lang.String str24 = memoryPoolsAdapterNeoStackImpl22.moydmdmineString(
        "neo4j.count.relationship");
    try {
      memoryPoolsAdapterNeoStackImpl22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "dbms.pool.<pool>.neo4j.count.relationship" + "'", str24,
        "dbms.pool.<pool>.neo4j.count.relationship");
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "hi!", metricRegistryManager9, jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters24 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter25 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager9, pageCacheCounters24);
    try {
      neoPageCacheAdapter25.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl transactionSizeMonitorImpl0 = new io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) ' ');
    transactionSizeMonitorImpl0.addHeapTransactionSize(100L);
    transactionSizeMonitorImpl0.addHeapTransactionSize((long) (short) 100);
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) (short) 10);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0209");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager7, jobScheduler14,
        fileSystemAbstraction15, databaseLayout16);
    try {
      gdbStoreStatsAdapter17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    com.codahale.metrics.Timer timer4 = consensusMessageStats0.getTimer();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats5 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long6 = consensusMessageStats5.dea();
    java.time.Duration duration7 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats5.sedaForDu(duration7);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType9 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration7, raftConsensusMessageType9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertNotNull(consensusMessageStats5);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertNotNull(duration7);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.start", metricRegistryManager1);
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl2.moydmdmineString(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
    try {
      jVMAdapterGarbageCollectionImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "pool.<pool>.<database>.causal_clustering.core.last_leader_message"
            + "'", str4, "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager10, databaseOperationCounts17);
    org.neo4j.memory.MemoryPools memoryPools19 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl21 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager10, memoryPools19,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager10, monitors22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl25 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors24);
    try {
      queryExecutionMonitorMetricsImpl25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (byte) 0, (int) (byte) 10,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery19, "db.query.execution");
    try {
      queryExecutionMonitorMetricsImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0216");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    java.time.Duration duration3 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration3, raftConsensusMessageType4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertNotNull(duration3);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    try {
      queryExecutionMonitorMetricsImpl13.endSuccess(executingQuery14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    org.neo4j.scheduler.JobScheduler jobScheduler18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12,
        jobScheduler18, fileSystemAbstraction19, databaseLayout20);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter22 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors4, metricRegistryManager12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier23 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter24 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager12, webContainerThreadInfoSupplier23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.drop", metricRegistryManager12);
    org.neo4j.monitoring.Monitors monitors26 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl27 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager12, monitors26);
    try {
      jVMAdapterSDPImpl27.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier14 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter15 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager8, webContainerThreadInfoSupplier14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.create", metricRegistryManager8);
    try {
      metricRegistryManager8.reoForSt(
          "pool.<pool>.<database>.causal_clustering.core.discovery.replicated_data");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.getLgBm();
    livingCacheMeta0.seeec((int) (byte) 100);
    livingCacheMeta0.seeec(0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager10, databaseOperationCounts17);
    org.neo4j.memory.MemoryPools memoryPools19 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl21 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager10, memoryPools19,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager10, monitors22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl25 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryExecutionMonitorMetricsImpl25.startProcessing(executingQuery26);
    try {
      queryExecutionMonitorMetricsImpl25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl6 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.stop", metricRegistryManager5);
    try {
      java.util.SortedSet<java.lang.String> strSet7 = metricRegistryManager5.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "hi!", metricRegistryManager1);
    try {
      jVMAdapterFileStatImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors2, metricRegistryManager9);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager9,
        databaseOperationCounts15);
    gdbActionsAdapter16.start();
    try {
      gdbActionsAdapter16.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager7, monitors11);
    boolean boolean13 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) metricRegistryManager7);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext14 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents15 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle16 = metricsServiceExtensionFactory0.newInstance(
          extensionContext14, requiredComponents15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl6 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "causal_clustering.core.last_leader_message", metricRegistryManager5);
    try {
      jVMAdapterGarbageCollectionImpl6.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0227");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.seeec(100);
    livingCacheMeta0.sememt((int) (short) 1);
    livingCacheMeta0.sembe((long) 0);
    long long8 = livingCacheMeta0.getSizeCnt();
    livingCacheMeta0.sememt((-1));
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter3 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager1, monitors2);
    try {
      cypherPlanAdapter3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        storeEntityCountersSupplier20);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter22 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "hi!", monitors1, metricRegistryManager10);
    try {
      discoveryCoreNodeAdapter22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0230");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager8, monitors12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.recovered", metricRegistryManager8);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl17 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, memoryPools15,
        "db.operation.count.create");
    try {
      memoryPoolsAdapterGdbImpl17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.members", monitors1, metricRegistryManager8);
    try {
      discoveryCoreNodeAdapter14.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    org.neo4j.memory.MemoryPools memoryPools6 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl8 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager5, memoryPools6,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.lang.String str10 = memoryPoolsAdapterGdbImpl8.moydmdmineString(
        "db.operation.count.start");
    try {
      memoryPoolsAdapterGdbImpl8.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "pool.<pool>.<database>.db.operation.count.start" + "'", str10,
        "pool.<pool>.<database>.db.operation.count.start");
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.start", metricRegistryManager1);
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl2.moydmdmineString(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
    java.lang.String str6 = jVMAdapterGarbageCollectionImpl2.moydmdmineString(
        "causal_clustering.core.discovery.replicated_data");
    java.lang.String str8 = jVMAdapterGarbageCollectionImpl2.moydmdmineString("");
    try {
      jVMAdapterGarbageCollectionImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "pool.<pool>.<database>.causal_clustering.core.last_leader_message"
            + "'", str4, "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "causal_clustering.core.discovery.replicated_data" + "'", str6,
        "causal_clustering.core.discovery.replicated_data");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0234");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark((long) (-1));
    metricsMeter1.mark();
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager9);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager9, databaseOperationCounts14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager9, storeEntityCountersSupplier16);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters18 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter19 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "globalMetrics", metricRegistryManager9, checkpointCounters18);
    try {
      checkpointCounterAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager7, monitors11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager7);
    java.lang.String str15 = jVMAdapterPoolImpl13.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    java.lang.String str17 = jVMAdapterPoolImpl13.moydmdmineString("db.operation.count.drop");
    java.lang.String str19 = jVMAdapterPoolImpl13.moydmdmineString("db.operation.count.stop");
    try {
      jVMAdapterPoolImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "causal_clustering.core.discovery.cluster.converged" + "'", str15,
        "causal_clustering.core.discovery.cluster.converged");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "db.operation.count.drop" + "'", str17,
        "db.operation.count.drop");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "db.operation.count.stop" + "'", str19,
        "db.operation.count.stop");
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0237");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge6 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType5);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType7 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType7, 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
    org.junit.Assert.assertNotNull(intGauge6);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0238");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.failed", metricRegistryManager9);
    try {
      jVMAdapterGarbageCollectionImpl21.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl12 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter13 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.members", monitors1, metricRegistryManager8);
    try {
      discoveryCoreNodeAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0240");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType5, (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager6, monitors10);
    try {
      cypherPlanAdapter11.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl18 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl2,
        metricRegistryManager10, coreNodeLeaderCheckSupplier19);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10,
        databaseOperationCounts21);
    gdbActionsAdapter22.start();
    try {
      gdbActionsAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.memory.MemoryPools memoryPools22 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager10, memoryPools22);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier24 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter26 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        transactionIdStoreSupplier24, transactionCounters25);
    try {
      globalTransactionStatsAdapter26.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    com.codahale.metrics.Timer timer5 = consensusMessageStats0.getTimer(raftConsensusMessageType4);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType6 = null;
    com.codahale.metrics.Timer timer7 = consensusMessageStats0.getTimer(raftConsensusMessageType6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType8 = null;
    com.codahale.metrics.Timer timer9 = consensusMessageStats0.getTimer(raftConsensusMessageType8);
    java.time.Duration duration10 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType11 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration10, raftConsensusMessageType11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNull(timer5);
    org.junit.Assert.assertNull(timer7);
    org.junit.Assert.assertNull(timer9);
    org.junit.Assert.assertNotNull(duration10);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    io.github.onograph.metrics.incoming.cluster.PetConsensusLogApplied petConsensusLogApplied0 = new io.github.onograph.metrics.incoming.cluster.PetConsensusLogApplied();
    petConsensusLogApplied0.apldid((long) (short) 100);
    petConsensusLogApplied0.apldid((long) 0);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager13);
    org.neo4j.scheduler.JobScheduler jobScheduler21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout23 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter24 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager13, jobScheduler21, fileSystemAbstraction22,
        databaseLayout23);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter25 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors3, metricRegistryManager13);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter26 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "db.operation.count.failed", monitors1, metricRegistryManager13);
    try {
      readReplicaNodeAdapter26.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) (byte) 0);
    long long6 = livingCacheMeta0.getICe();
    long long7 = livingCacheMeta0.getIEm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0248");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl6 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "causal_clustering.core.last_leader_message", metricRegistryManager5);
    try {
      java.util.SortedSet<java.lang.String> strSet7 = metricRegistryManager5.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0249");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    org.neo4j.memory.MemoryPools memoryPools21 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager9, memoryPools21,
        "pool.<pool>.<database>.db.operation.count.start");
    try {
      memoryPoolsAdapterGdbImpl23.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0250");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager10, jobScheduler17,
        fileSystemAbstraction18, databaseLayout19);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.failed", metricRegistryManager10);
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl24 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryExecutionMonitorMetricsImpl24.startProcessing(executingQuery25);
    try {
      queryExecutionMonitorMetricsImpl24.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager7);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType14 = jVMAdapterFileStatImpl13.getGrp();
    jVMAdapterFileStatImpl13.start();
    try {
      jVMAdapterFileStatImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType14 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM + "'",
        enterpriseMetricsType14.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM));
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0252");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier16 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters17 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        transactionIdStoreSupplier16, transactionCounters17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager9, monitors19);
    try {
      boltAdapter20.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0253");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager9);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager9, databaseOperationCounts14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager9, storeEntityCountersSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager9, monitors18);
    try {
      jVMAdapterSDPImpl19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager7, monitors11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager7);
    java.lang.String str15 = jVMAdapterPoolImpl13.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    try {
      jVMAdapterPoolImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "causal_clustering.core.discovery.cluster.converged" + "'", str15,
        "causal_clustering.core.discovery.cluster.converged");
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0255");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier6 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters7 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter8 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager5,
        transactionIdStoreSupplier6, transactionCounters7);
    try {
      globalTransactionStatsAdapter8.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery19, "db.query.execution");
    queryExecutionMonitorMetricsImpl15.shutdown();
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    try {
      queryExecutionMonitorMetricsImpl15.endSuccess(executingQuery23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryExecutionMonitorMetricsImpl13.endFailure(executingQuery14, throwable15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    try {
      queryExecutionMonitorMetricsImpl13.endSuccess(executingQuery17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    io.github.onograph.metrics.incoming.cluster.SyncStat syncStat0 = new io.github.onograph.metrics.incoming.cluster.SyncStat();
    syncStat0.marc();
    syncStat0.norlad();
    syncStat0.marc();
    syncStat0.recnam();
    syncStat0.clerut();
    syncStat0.clerut();
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier17 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter18 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl4, metricRegistryManager11,
        coreNodeLeaderCheckSupplier17);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier19 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager11,
        storeEntityCountersSupplier19, pageCacheTracer20);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, transactionLogCounters22);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "neo4j.count.node", metricRegistryManager11, databaseOperationCounts24);
    try {
      gdbActionsAdapter25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryExecutionMonitorMetricsImpl13.endFailure(executingQuery14, throwable15);
    try {
      queryExecutionMonitorMetricsImpl13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer();
    java.time.Duration duration3 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration3, raftConsensusMessageType4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertNotNull(timer2);
    org.junit.Assert.assertNotNull(duration3);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0262");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    java.time.Duration duration3 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats1.sedaForDu(duration3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType5 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration3, raftConsensusMessageType5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(duration3);
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0263");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager10, jobScheduler17,
        fileSystemAbstraction18, databaseLayout19);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.failed", metricRegistryManager10);
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl24 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryExecutionMonitorMetricsImpl24.startProcessing(executingQuery25);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery27 = null;
    try {
      queryExecutionMonitorMetricsImpl24.endSuccess(executingQuery27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager8);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager8);
    jVMAdapterMemoryHeapImpl15.start();
    try {
      jVMAdapterMemoryHeapImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    org.neo4j.scheduler.JobScheduler jobScheduler18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12,
        jobScheduler18, fileSystemAbstraction19, databaseLayout20);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter22 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors4, metricRegistryManager12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier23 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter24 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager12, webContainerThreadInfoSupplier23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "db.operation.count.stop", metricRegistryManager12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts26 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter27 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager12,
        databaseOperationCounts26);
    try {
      gdbActionsAdapter27.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "globalMetrics");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl5, metricRegistryManager12,
        coreNodeLeaderCheckSupplier18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter21 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager12, monitors20);
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter23 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager12, monitors22);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter24 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager12);
    try {
      txCatchupAdapter24.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    livingCacheMeta0.setabys((long) (short) 1);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl22 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "db.operation.count.create", metricRegistryManager9, monitors21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    try {
      queryExecutionMonitorMetricsImpl22.endSuccess(executingQuery23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    livingCacheMeta0.sememt(0);
    long long3 = livingCacheMeta0.getIEm();
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl7 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.stop", metricRegistryManager6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl9 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager6, monitors8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    java.lang.Throwable throwable11 = null;
    queryExecutionMonitorMetricsImpl9.endFailure(executingQuery10, throwable11);
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory1 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    boolean boolean14 = metricsServiceExtensionFactory1.equals(
        (java.lang.Object) metricRegistryManager8);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager8);
    jVMAdapterMBImpl15.start();
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.start();
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl12 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter13 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors1, metricRegistryManager8);
    try {
      discoveryCoreNodeAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0275");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterMembersCount clusterMembersCount0 = new io.github.onograph.metrics.incoming.cluster.ClusterMembersCount();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge1 = clusterMembersCount0.mebsGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.seuehl((int) (byte) 0);
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge5 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.secvg(true);
    org.junit.Assert.assertNotNull(intGauge1);
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge5);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.drop", metricRegistryManager1);
    try {
      jVMAdapterGarbageCollectionImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager7);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType14 = jVMAdapterFileStatImpl13.getGrp();
    try {
      jVMAdapterFileStatImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType14 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM + "'",
        enterpriseMetricsType14.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_JVM));
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager11,
        jobScheduler17, fileSystemAbstraction18, databaseLayout19);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager11,
        transactionLogCounters21);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier23 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter24 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "vm.heap.committed", monitorsClusterConsensusImpl2, metricRegistryManager11,
        coreNodeLeaderCheckSupplier23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager11);
    jVMAdapterFileStatImpl25.start();
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl3, metricRegistryManager10,
        coreNodeLeaderCheckSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter19 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager10, monitors18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager10,
        jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    try {
      gdbStoreStatsAdapter23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters22 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter23 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager10, pageCacheCounters22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "dbms.pool.<pool>.dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager10,
        monitors24);
    try {
      jVMAdapterSDPImpl25.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryExecutionMonitorMetricsImpl13.startProcessing(executingQuery14);
    try {
      queryExecutionMonitorMetricsImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        jobScheduler14, fileSystemAbstraction15, databaseLayout16);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "causal_clustering.core.last_leader_message", metricRegistryManager8);
    com.codahale.metrics.MetricFilter metricFilter19 = null;
    try {
      metricRegistryManager8.reomcnForMe(metricFilter19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors2, metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "db.operation.count.recovered", metricRegistryManager9, transactionIdStoreSupplier15,
        transactionCounters16);
    try {
      globalTransactionStatsAdapter17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "neo4j.count.relationship", metricRegistryManager1);
    try {
      jVMAdapterFileStatImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager8);
    try {
      jVMAdapterFileStatImpl19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter13 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.recovered", metricRegistryManager8, pageCacheCounters12);
    try {
      java.util.SortedSet<java.lang.String> strSet14 = metricRegistryManager8.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    io.github.onograph.metrics.incoming.cluster.SyncStat syncStat0 = new io.github.onograph.metrics.incoming.cluster.SyncStat();
    syncStat0.marc();
    syncStat0.norlad();
    syncStat0.marc();
    syncStat0.clerut();
    syncStat0.clerut();
    syncStat0.recnam();
    syncStat0.norlad();
    syncStat0.marc();
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "vm.heap.committed");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "causal_clustering.core.discovery.cluster.unreachable");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    double double4 = metricsMeter1.getMeanRate();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter13 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors4, metricRegistryManager10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter14 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "neo4j.count.node", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "databaseMetrics", metricRegistryManager10, storeEntityCountersSupplier15,
        pageCacheTracer16);
    gdbStatsAdapter17.start();
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer();
    com.codahale.metrics.Timer timer3 = consensusMessageStats0.getTimer();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats4 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType5 = null;
    com.codahale.metrics.Timer timer6 = consensusMessageStats4.getTimer(raftConsensusMessageType5);
    long long7 = consensusMessageStats4.dea();
    long long8 = consensusMessageStats4.dea();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats9 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long10 = consensusMessageStats9.dea();
    java.time.Duration duration11 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats9.sedaForDu(duration11);
    consensusMessageStats4.sedaForDu(duration11);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType14 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration11, raftConsensusMessageType14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertNotNull(timer2);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(consensusMessageStats4);
    org.junit.Assert.assertNull(timer6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    org.junit.Assert.assertNotNull(consensusMessageStats9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    org.junit.Assert.assertNotNull(duration11);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    io.github.onograph.metrics.MetricsReportProvider metricsReportProvider0 = new io.github.onograph.metrics.MetricsReportProvider();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    metricsReportProvider0.init(fileSystemAbstraction1, "db.operation.count.drop", config3, path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    metricsReportProvider0.init(fileSystemAbstraction6, "", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    metricsReportProvider0.init(fileSystemAbstraction11,
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", config13, path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    metricsReportProvider0.init(fileSystemAbstraction16, "globalMetrics", config18, path19);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType1, (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gems();
    livingCacheMeta0.sembe((long) '4');
    long long6 = livingCacheMeta0.getIEm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0296");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter13 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.discovery.cluster.members", metricRegistryManager8, monitors12);
    try {
      boltAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager8, databaseOperationCounts15);
    org.neo4j.memory.MemoryPools memoryPools17 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl19 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager8, memoryPools17,
        "db.operation.count.create");
    java.lang.String str21 = memoryPoolsAdapterGdbImpl19.moydmdmineString(
        "causal_clustering.core.discovery.replicated_data");
    try {
      memoryPoolsAdapterGdbImpl19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "pool.<pool>.<database>.causal_clustering.core.discovery.replicated_data" + "'", str21,
        "pool.<pool>.<database>.causal_clustering.core.discovery.replicated_data");
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0298");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.drop", metricRegistryManager1);
    jVMAdapterMBImpl2.shutdown();
    try {
      jVMAdapterMBImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager9, monitors19);
    org.neo4j.memory.MemoryPools memoryPools21 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl22 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager9, memoryPools21);
    memoryPoolsAdapterNeoStackImpl22.init();
    try {
      memoryPoolsAdapterNeoStackImpl22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    metricsMeter1.mark();
    metricsMeter1.mark((long) 10);
    double double7 = metricsMeter1.getMeanRate();
    double double8 = metricsMeter1.getMeanRate();
    double double9 = metricsMeter1.getOneMinuteRate();
    double double10 = metricsMeter1.getOneMinuteRate();
    double double11 = metricsMeter1.getFiveMinuteRate();
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl4 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl6 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl6, metricRegistryManager13,
        coreNodeLeaderCheckSupplier19);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier21 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter22 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.recovered", monitorsClusterConsensusImpl4, metricRegistryManager13,
        coreNodeLeaderCheckSupplier21);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "", metricRegistryManager13);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter26 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager13,
        checkpointCounters25);
    try {
      checkpointCounterAdapter26.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0302");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager9);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager9, databaseOperationCounts14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager9, storeEntityCountersSupplier16);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters18 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter19 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "globalMetrics", metricRegistryManager9, checkpointCounters18);
    try {
      checkpointCounterAdapter19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager12, memoryPools13,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors5, metricRegistryManager12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager12,
        databaseOperationCounts18);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors2, metricRegistryManager12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier21 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager12,
        storeEntityCountersSupplier21, pageCacheTracer22);
    com.codahale.metrics.MetricFilter metricFilter24 = null;
    try {
      metricRegistryManager12.reomcnForMe(metricFilter24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType5, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0305");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager11);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager11, jobScheduler19, fileSystemAbstraction20,
        databaseLayout21);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter23 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager11);
    try {
      txCatchupAdapter23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl();
    java.lang.String str2 = memoryPoolsAdapterNeoStackImpl0.moydmdmineString(
        "db.operation.count.create");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "dbms.pool.<pool>.db.operation.count.create" + "'", str2,
        "dbms.pool.<pool>.db.operation.count.create");
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents2 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle3 = extensionFactoryGdbMetricsImpl0.newInstance(
        extensionContext1, dependentComponents2);
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager12, memoryPools13,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter17 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager12, monitors16);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter18 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "db.query.execution", monitors5, metricRegistryManager12);
    boolean boolean19 = extensionFactoryGdbMetricsImpl0.equals(
        (java.lang.Object) readReplicaNodeAdapter18);
    java.lang.String str20 = extensionFactoryGdbMetricsImpl0.getName();
    java.lang.String str21 = extensionFactoryGdbMetricsImpl0.toString();
    org.junit.Assert.assertNotNull(lifecycle3);
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "databaseMetrics" + "'", str20,
        "databaseMetrics");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str21, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier19 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter20 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager13, webContainerThreadInfoSupplier19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager13, monitors21);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier23 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter24 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager13, storeEntityCountersSupplier23);
    org.neo4j.memory.MemoryPools memoryPools25 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl27 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager13,
        memoryPools25, "db.operation.count.stop");
    org.neo4j.scheduler.JobScheduler jobScheduler28 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction29 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout30 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter31 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.recovered", metricRegistryManager13, jobScheduler28,
        fileSystemAbstraction29, databaseLayout30);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier32 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter33 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "pool.<pool>.<database>.db.operation.count.failed", monitorsClusterConsensusImpl1,
        metricRegistryManager13, coreNodeLeaderCheckSupplier32);
    try {
      consensusCoreNodeAdapter33.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier16 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters17 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        transactionIdStoreSupplier16, transactionCounters17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager9, monitors19);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType21 = boltAdapter20.getGrp();
    try {
      boltAdapter20.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType21 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC + "'",
        enterpriseMetricsType21.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC));
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager7, databaseOperationCounts14);
    gdbActionsAdapter15.start();
    gdbActionsAdapter15.start();
    java.lang.String str19 = gdbActionsAdapter15.moydmdmineString("");
    try {
      gdbActionsAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier7 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters8 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter9 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager6,
        transactionIdStoreSupplier7, transactionCounters8);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl10 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager6);
    try {
      jVMAdapterMBImpl10.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0312");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    com.codahale.metrics.MetricFilter metricFilter23 = null;
    try {
      metricRegistryManager10.reomcnForMe(metricFilter23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.start", metricRegistryManager1);
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl2.moydmdmineString(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
    java.lang.String str6 = jVMAdapterGarbageCollectionImpl2.moydmdmineString(
        "causal_clustering.core.discovery.replicated_data");
    java.lang.String str8 = jVMAdapterGarbageCollectionImpl2.moydmdmineString("");
    try {
      jVMAdapterGarbageCollectionImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "pool.<pool>.<database>.causal_clustering.core.last_leader_message"
            + "'", str4, "pool.<pool>.<database>.causal_clustering.core.last_leader_message");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "causal_clustering.core.discovery.replicated_data" + "'", str6,
        "causal_clustering.core.discovery.replicated_data");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType3, 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterMembersCount clusterMembersCount0 = new io.github.onograph.metrics.incoming.cluster.ClusterMembersCount();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge1 = clusterMembersCount0.mebsGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.seuehl((int) (short) -1);
    clusterMembersCount0.sembs((int) (byte) 1);
    clusterMembersCount0.secvg(false);
    clusterMembersCount0.sembs(10);
    clusterMembersCount0.sembs((int) (byte) 1);
    clusterMembersCount0.secvg(false);
    clusterMembersCount0.secvg(true);
    org.junit.Assert.assertNotNull(intGauge1);
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats3 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long4 = consensusMessageStats3.dea();
    java.time.Duration duration5 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats3.sedaForDu(duration5);
    consensusMessageStats0.sedaForDu(duration5);
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats8 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType9 = null;
    com.codahale.metrics.Timer timer10 = consensusMessageStats8.getTimer(raftConsensusMessageType9);
    long long11 = consensusMessageStats8.dea();
    long long12 = consensusMessageStats8.dea();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats13 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long14 = consensusMessageStats13.dea();
    java.time.Duration duration15 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats13.sedaForDu(duration15);
    consensusMessageStats8.sedaForDu(duration15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType18 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration15, raftConsensusMessageType18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertNotNull(consensusMessageStats3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertNotNull(duration5);
    org.junit.Assert.assertNotNull(consensusMessageStats8);
    org.junit.Assert.assertNull(timer10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    org.junit.Assert.assertNotNull(consensusMessageStats13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    org.junit.Assert.assertNotNull(duration15);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents2 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle3 = extensionFactoryGdbMetricsImpl0.newInstance(
        extensionContext1, dependentComponents2);
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager12, memoryPools13,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter17 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager12, monitors16);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter18 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "db.query.execution", monitors5, metricRegistryManager12);
    boolean boolean19 = extensionFactoryGdbMetricsImpl0.equals(
        (java.lang.Object) readReplicaNodeAdapter18);
    try {
      readReplicaNodeAdapter18.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(lifecycle3);
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery19, "db.query.execution");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryExecutionMonitorMetricsImpl15.beforeEnd(executingQuery22, false);
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier8 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters9 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter10 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        transactionIdStoreSupplier8, transactionCounters9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl11 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager7);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier12 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters13 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "vm.heap.used", metricRegistryManager7, transactionIdStoreSupplier12,
        transactionCounters13);
    try {
      globalTransactionStatsAdapter14.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors2, metricRegistryManager9);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9, monitors15);
    try {
      jVMAdapterSDPImpl16.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier16 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters17 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        transactionIdStoreSupplier16, transactionCounters17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter20 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager9, monitors19);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType21 = boltAdapter20.getGrp();
    try {
      boltAdapter20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + enterpriseMetricsType21 + "' != '"
            + io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC + "'",
        enterpriseMetricsType21.equals(
            io.github.onograph.metrics.incoming.EnterpriseMetricsType.EMT_GENERIC));
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl transactionSizeMonitorImpl0 = new io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) ' ');
    transactionSizeMonitorImpl0.addHeapTransactionSize(100L);
    transactionSizeMonitorImpl0.addNativeTransactionSize(0L);
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) (byte) 1);
    transactionSizeMonitorImpl0.addHeapTransactionSize((long) (byte) 1);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter12 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors3, metricRegistryManager9);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl14 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager9, monitors13);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl17 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        memoryPools15, "pool.<pool>.<database>.causal_clustering.core.discovery.replicated_data");
    try {
      memoryPoolsAdapterGdbImpl17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0324");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.stop();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0325");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager11);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager11, jobScheduler19, fileSystemAbstraction20,
        databaseLayout21);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter23 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager11);
    try {
      txCatchupAdapter23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0326");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager10, databaseOperationCounts17);
    org.neo4j.memory.MemoryPools memoryPools19 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl21 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.operation.count.drop", metricRegistryManager10, memoryPools19,
        "db.operation.count.create");
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager10, monitors22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl25 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryExecutionMonitorMetricsImpl25.startProcessing(executingQuery26);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    try {
      queryExecutionMonitorMetricsImpl25.endSuccess(executingQuery28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry6);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier8 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter9 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager7,
        storeEntityCountersSupplier8);
    gdbElementStatsAdapter9.start();
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl5, metricRegistryManager12,
        coreNodeLeaderCheckSupplier18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager12,
        storeEntityCountersSupplier20, pageCacheTracer21);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters23 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter24 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, transactionLogCounters23);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts25 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter26 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "neo4j.count.node", metricRegistryManager12, databaseOperationCounts25);
    org.neo4j.monitoring.Monitors monitors27 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl28 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "db.operation.count.start", metricRegistryManager12, monitors27);
    try {
      metricRegistryManager12.reoForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.startProcessing(executingQuery19);
    try {
      queryExecutionMonitorMetricsImpl15.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager7, databaseOperationCounts14);
    gdbActionsAdapter15.start();
    try {
      gdbActionsAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType3, (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl1, metricRegistryManager9,
        coreNodeLeaderCheckSupplier16);
    try {
      consensusCoreNodeAdapter17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0334");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager9,
        storeEntityCountersSupplier17, pageCacheTracer18);
    gdbStatsAdapter19.start();
    try {
      gdbStatsAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl();
    java.lang.String str2 = jVMAdapterMBImpl0.moydmdmineString("db.operation.count.drop");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "db.operation.count.drop" + "'", str2,
        "db.operation.count.drop");
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.shutdown();
    jettyAdapter22.start();
    jettyAdapter22.start();
    jettyAdapter22.shutdown();
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory1 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    boolean boolean14 = metricsServiceExtensionFactory1.equals(
        (java.lang.Object) metricRegistryManager8);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "dbms.pool.<pool>.db.operation.count.create", metricRegistryManager8,
        transactionLogCounters15);
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0338");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager8,
        storeEntityCountersSupplier15, pageCacheTracer16);
    com.codahale.metrics.MetricFilter metricFilter18 = null;
    try {
      metricRegistryManager8.reomcnForMe(metricFilter18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.memory.MemoryPools memoryPools14 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl16 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager13, memoryPools14,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager13, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager13, databaseOperationCounts20);
    gdbActionsAdapter21.start();
    gdbActionsAdapter21.start();
    boolean boolean24 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbActionsAdapter21);
    java.util.function.LongSupplier longSupplier25 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter26 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier25);
    metricsMeter26.mark(100L);
    metricsMeter26.mark();
    metricsMeter26.mark((long) 10);
    double double32 = metricsMeter26.getMeanRate();
    double double33 = metricsMeter26.getMeanRate();
    metricsMeter26.mark();
    metricsMeter26.mark();
    boolean boolean36 = metricsServiceExtensionFactory0.equals((java.lang.Object) metricsMeter26);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext37 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents38 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle39 = metricsServiceExtensionFactory0.newInstance(
          extensionContext37, requiredComponents38);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusLogAdditions consensusLogAdditions0 = new io.github.onograph.metrics.incoming.cluster.ConsensusLogAdditions();
    long long1 = consensusLogAdditions0.apeie();
    consensusLogAdditions0.apeie(10L);
    long long4 = consensusLogAdditions0.apeie();
    long long5 = consensusLogAdditions0.apeie();
    consensusLogAdditions0.apeie((long) 100);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "db.operation.count.start", metricRegistryManager9, monitors17);
    try {
      jVMAdapterSDPImpl18.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType5, 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    double double4 = metricsMeter1.getFiveMinuteRate();
    metricsMeter1.mark((-1L));
    long long7 = metricsMeter1.getCount();
    metricsMeter1.mark();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager9, monitors20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "causal_clustering.core.last_leader_message", metricRegistryManager9);
    java.lang.Class<?> wildcardClass23 = metricRegistryManager9.getClass();
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory1 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager8, monitors12);
    boolean boolean14 = metricsServiceExtensionFactory1.equals(
        (java.lang.Object) metricRegistryManager8);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager8);
    try {
      jVMAdapterMBImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusLogAdditions consensusLogAdditions0 = new io.github.onograph.metrics.incoming.cluster.ConsensusLogAdditions();
    long long1 = consensusLogAdditions0.apeie();
    consensusLogAdditions0.apeie(10L);
    long long4 = consensusLogAdditions0.apeie();
    long long5 = consensusLogAdditions0.apeie();
    consensusLogAdditions0.apeie(0L);
    long long8 = consensusLogAdditions0.apeie();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl3, metricRegistryManager10,
        coreNodeLeaderCheckSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter19 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager10, monitors18);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager10,
        transactionLogCounters20);
    gdbTransactionLogAdapter21.start();
    try {
      gdbTransactionLogAdapter21.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.query.execution", metricRegistryManager7, memoryPools13,
        "pool.<pool>.<database>.db.operation.count.start");
    java.lang.String str17 = memoryPoolsAdapterGdbImpl15.moydmdmineString("vm.heap.used");
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "pool.<pool>.<database>.vm.heap.used" + "'", str17,
        "pool.<pool>.<database>.vm.heap.used");
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.failed", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter16 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager9);
    try {
      txCatchupAdapter16.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0350");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType2 = null;
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer(raftConsensusMessageType2);
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats4 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long5 = consensusMessageStats4.dea();
    java.time.Duration duration6 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats4.sedaForDu(duration6);
    consensusMessageStats1.sedaForDu(duration6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType9 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration6, raftConsensusMessageType9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertNull(timer3);
    org.junit.Assert.assertNotNull(consensusMessageStats4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertNotNull(duration6);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    try {
      queryExecutionMonitorMetricsImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry6);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier8 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter9 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager7,
        storeEntityCountersSupplier8);
    try {
      gdbElementStatsAdapter9.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0353");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl();
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString("db.query.execution");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "db.query.execution" + "'", str2,
        "db.query.execution");
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.getLgBm();
    long long4 = livingCacheMeta0.getSizeCnt();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.create", metricRegistryManager1);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier11 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters12 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        transactionIdStoreSupplier11, transactionCounters12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "vm.heap.used", metricRegistryManager10, transactionIdStoreSupplier15,
        transactionCounters16);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters18 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter19 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "db.operation.count.drop", metricRegistryManager10, checkpointCounters18);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", monitors1,
        metricRegistryManager10);
    com.codahale.metrics.MetricFilter metricFilter21 = null;
    try {
      metricRegistryManager10.reomcnForMe(metricFilter21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter15 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "db.query.execution", monitors2, metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager9, storeEntityCountersSupplier16);
    gdbElementStatsAdapter17.start();
    java.lang.String str20 = gdbElementStatsAdapter17.moydmdmineString(
        "pool.<pool>.<database>.vm.heap.used");
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "pool.<pool>.<database>.vm.heap.used" + "'", str20,
        "pool.<pool>.<database>.vm.heap.used");
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors2, metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "db.operation.count.recovered", metricRegistryManager9, transactionIdStoreSupplier15,
        transactionCounters16);
    try {
      globalTransactionStatsAdapter17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    java.lang.String str6 = metricsServiceExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext7 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents8 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle9 = metricsServiceExtensionFactory0.newInstance(
          extensionContext7, requiredComponents8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "globalMetrics" + "'", str6,
        "globalMetrics");
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    io.github.onograph.metrics.incoming.cluster.SubmittedConsensusLogCommitIndexMetric submittedConsensusLogCommitIndexMetric0 = new io.github.onograph.metrics.incoming.cluster.SubmittedConsensusLogCommitIndexMetric();
    long long1 = submittedConsensusLogCommitIndexMetric0.comie();
    submittedConsensusLogCommitIndexMetric0.comie((long) (short) -1);
    submittedConsensusLogCommitIndexMetric0.comie((long) (short) 100);
    long long6 = submittedConsensusLogCommitIndexMetric0.comie();
    long long7 = submittedConsensusLogCommitIndexMetric0.comie();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.start();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    livingCacheMeta0.sembe((long) (byte) 0);
    livingCacheMeta0.setabys((long) '4');
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "", metricRegistryManager8, transactionLogCounters19);
    gdbTransactionLogAdapter20.start();
    try {
      gdbTransactionLogAdapter20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.stop();
    gdbMetricsLifecycle2.start();
    try {
      gdbMetricsLifecycle2.init();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager10);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager10, databaseOperationCounts15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager10, storeEntityCountersSupplier17);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters19 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter20 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "globalMetrics", metricRegistryManager10, checkpointCounters19);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10);
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    java.lang.String str1 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str2 = extensionFactoryGdbMetricsImpl0.toString();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    boolean boolean15 = extensionFactoryGdbMetricsImpl0.equals(
        (java.lang.Object) "db.operation.count.start");
    java.lang.String str16 = extensionFactoryGdbMetricsImpl0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext17 = null;
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents18 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle19 = extensionFactoryGdbMetricsImpl0.newInstance(
        extensionContext17, dependentComponents18);
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str1, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str2, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str16, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertNotNull(lifecycle19);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0367");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl18 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl2,
        metricRegistryManager10, coreNodeLeaderCheckSupplier19);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters21 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter22 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "vm.heap.used", metricRegistryManager10, pageCacheCounters21);
    java.lang.String str24 = neoPageCacheAdapter22.moydmdmineString(
        "causal_clustering.core.discovery.cluster.members");
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "causal_clustering.core.discovery.cluster.members" + "'", str24,
        "causal_clustering.core.discovery.cluster.members");
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager8);
    jVMAdapterThreadMXImpl19.start();
    try {
      jVMAdapterThreadMXImpl19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl3, metricRegistryManager10,
        coreNodeLeaderCheckSupplier16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.recovered", monitorsClusterConsensusImpl1, metricRegistryManager10,
        coreNodeLeaderCheckSupplier18);
    try {
      consensusCoreNodeAdapter19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "hi!", metricRegistryManager1);
    jVMAdapterFileStatImpl2.init();
    java.lang.String str5 = jVMAdapterFileStatImpl2.moydmdmineString("vm.heap.max");
    try {
      jVMAdapterFileStatImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "vm.heap.max" + "'", str5, "vm.heap.max");
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray1 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList2 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        globbingPatternArray1);
    com.codahale.metrics.MetricRegistry metricRegistry4 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager5 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList2,
        metricRegistry4);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl6 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.stop", metricRegistryManager5);
    jVMAdapterMBImpl6.start();
    try {
      jVMAdapterMBImpl6.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl6 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl6, metricRegistryManager13,
        coreNodeLeaderCheckSupplier19);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier21 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager13,
        storeEntityCountersSupplier21, pageCacheTracer22);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, transactionLogCounters24);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts26 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter27 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "neo4j.count.node", metricRegistryManager13, databaseOperationCounts26);
    org.neo4j.monitoring.Monitors monitors28 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl29 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "db.operation.count.start", metricRegistryManager13, monitors28);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl30 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "dbms.pool.<pool>.vm.heap.max", metricRegistryManager13);
    try {
      jVMAdapterPoolImpl30.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0373");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager8, monitors19);
    try {
      jVMAdapterSDPImpl20.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0374");
    }
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter13 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors4, metricRegistryManager10);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors14);
    org.neo4j.memory.MemoryPools memoryPools16 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl18 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, memoryPools16,
        "pool.<pool>.<database>.causal_clustering.core.discovery.replicated_data");
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters19 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter20 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.create", metricRegistryManager10, pageCacheCounters19);
    try {
      neoPageCacheAdapter20.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0375");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl18 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl2,
        metricRegistryManager10, coreNodeLeaderCheckSupplier19);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters21 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter22 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "vm.heap.used", metricRegistryManager10, pageCacheCounters21);
    try {
      neoPageCacheAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    try {
      queryExecutionMonitorMetricsImpl13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    java.lang.String str1 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str2 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str3 = extensionFactoryGdbMetricsImpl0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext4 = null;
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents5 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle6 = extensionFactoryGdbMetricsImpl0.newInstance(
        extensionContext4, dependentComponents5);
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str1, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str2, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str3, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertNotNull(lifecycle6);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    metricsMeter1.mark();
    metricsMeter1.mark((long) 10);
    double double7 = metricsMeter1.getMeanRate();
    double double8 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    metricsMeter1.mark(0L);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0379");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager10,
        transactionLogCounters20);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier22 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter23 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "vm.heap.committed", monitorsClusterConsensusImpl1, metricRegistryManager10,
        coreNodeLeaderCheckSupplier22);
    try {
      consensusCoreNodeAdapter23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    org.neo4j.memory.MemoryPools memoryPools21 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager9, memoryPools21,
        "pool.<pool>.<database>.db.operation.count.start");
    java.lang.String str25 = memoryPoolsAdapterGdbImpl23.moydmdmineString(
        "db.operation.count.drop");
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "pool.<pool>.<database>.db.operation.count.drop" + "'", str25,
        "pool.<pool>.<database>.db.operation.count.drop");
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0381");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge6 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType5);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType7 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType7, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
    org.junit.Assert.assertNotNull(intGauge6);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.gehs();
    livingCacheMeta0.sembe((long) 'a');
    long long5 = livingCacheMeta0.getSizeCnt();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    java.lang.String str1 = metricsServiceExtensionFactory0.toString();
    java.lang.String str2 = metricsServiceExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext3 = null;
    io.github.onograph.metrics.MetricsServiceExtensionFactory.RequiredComponents requiredComponents4 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle5 = metricsServiceExtensionFactory0.newInstance(
          extensionContext3, requiredComponents4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:MetricsServiceExtensionFactory[globalMetrics]" + "'",
        str1, "Extension:MetricsServiceExtensionFactory[globalMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:MetricsServiceExtensionFactory[globalMetrics]" + "'",
        str2, "Extension:MetricsServiceExtensionFactory[globalMetrics]");
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dependentComponents0 = null;
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.metrics.gdb.GdbMetricsLifecycle gdbMetricsLifecycle2 = new io.github.onograph.metrics.gdb.GdbMetricsLifecycle(
        dependentComponents0, extensionContext1);
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.start();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
    gdbMetricsLifecycle2.shutdown();
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier9 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters10 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter11 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager8,
        transactionIdStoreSupplier9, transactionCounters10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl12 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager8);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier13 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters14 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "vm.heap.used", metricRegistryManager8, transactionIdStoreSupplier13,
        transactionCounters14);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters16 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter17 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "db.operation.count.drop", metricRegistryManager8, checkpointCounters16);
    try {
      checkpointCounterAdapter17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter21 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager10, monitors20);
    org.neo4j.memory.MemoryPools memoryPools22 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl23 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager10, memoryPools22);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.query.execution", metricRegistryManager10);
    jVMAdapterFileStatImpl24.start();
    jVMAdapterFileStatImpl24.start();
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0387");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    java.lang.String str1 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str2 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.Object obj3 = null;
    boolean boolean4 = extensionFactoryGdbMetricsImpl0.equals(obj3);
    java.lang.String str5 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str6 = extensionFactoryGdbMetricsImpl0.toString();
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str1, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str2, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str5, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str6, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0388");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.start();
    jettyAdapter22.init();
    jettyAdapter22.start();
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.getLgBm();
    long long2 = livingCacheMeta0.getICe();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    metricsMeter1.mark();
    metricsMeter1.mark((long) 10);
    double double7 = metricsMeter1.getMeanRate();
    double double8 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    metricsMeter1.mark((long) '4');
    double double12 = metricsMeter1.getMeanRate();
    double double13 = metricsMeter1.getFiveMinuteRate();
    double double14 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    double double16 = metricsMeter1.getOneMinuteRate();
    double double17 = metricsMeter1.getMeanRate();
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0391");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter18 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors17);
    try {
      boltAdapter18.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl11 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager7);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager7, databaseOperationCounts12);
    try {
      gdbActionsAdapter13.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0393");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    long long2 = livingCacheMeta0.getIEm();
    long long3 = livingCacheMeta0.gems();
    long long4 = livingCacheMeta0.getSizeCnt();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier2 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters3 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter4 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "causal_clustering.core.discovery.cluster.members", metricRegistryManager1,
        transactionIdStoreSupplier2, transactionCounters3);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType3, (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) (byte) 100);
    long long4 = livingCacheMeta0.gehs();
    livingCacheMeta0.setabys(1L);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier19 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters20 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager10,
        transactionIdStoreSupplier19, transactionCounters20);
    try {
      globalTransactionStatsAdapter21.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    metricsMeter1.mark();
    metricsMeter1.mark((long) 10);
    double double7 = metricsMeter1.getMeanRate();
    double double8 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    metricsMeter1.mark((long) '4');
    double double12 = metricsMeter1.getMeanRate();
    metricsMeter1.mark((long) ' ');
    double double15 = metricsMeter1.getFiveMinuteRate();
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0399");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter20 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors2, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier21 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter22 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager10, webContainerThreadInfoSupplier21);
    jettyAdapter22.start();
    jettyAdapter22.init();
    try {
      jettyAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
    }
    com.codahale.metrics.MetricRegistry metricRegistry0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.config.Metrics.CompressionOption compressionOption5 = null;
    io.github.onograph.metrics.outgoing.RotatingLogFileWriterService rotatingLogFileWriterService6 = null;
    org.neo4j.logging.Log log7 = null;
    try {
      io.github.onograph.metrics.outgoing.CsvScheduledReporter csvScheduledReporter8 = new io.github.onograph.metrics.outgoing.CsvScheduledReporter(
          metricRegistry0, fileSystemAbstraction1, path2, (long) (byte) -1, (int) (short) 0,
          compressionOption5, rotatingLogFileWriterService6, log7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: registry == null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0401");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) '#');
    livingCacheMeta0.cacheMiss();
    livingCacheMeta0.sembe(0L);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl5, metricRegistryManager12,
        coreNodeLeaderCheckSupplier18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter21 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager12, monitors20);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager12,
        transactionLogCounters22);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter24 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "databaseMetrics", monitors1, metricRegistryManager12);
    try {
      discoveryCoreNodeAdapter24.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl transactionSizeMonitorImpl0 = new io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) ' ');
    transactionSizeMonitorImpl0.addHeapTransactionSize(100L);
    transactionSizeMonitorImpl0.addNativeTransactionSize(0L);
    transactionSizeMonitorImpl0.addNativeTransactionSize((-1L));
    transactionSizeMonitorImpl0.addHeapTransactionSize((-1L));
    transactionSizeMonitorImpl0.addHeapTransactionSize((-1L));
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark((long) (-1));
    double double4 = metricsMeter1.getFifteenMinuteRate();
    double double5 = metricsMeter1.getFifteenMinuteRate();
    double double6 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.members", monitors2, metricRegistryManager9);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier15 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter16 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "db.query.execution", metricRegistryManager9, webContainerThreadInfoSupplier15);
    try {
      jettyAdapter16.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    org.neo4j.scheduler.JobScheduler jobScheduler18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12,
        jobScheduler18, fileSystemAbstraction19, databaseLayout20);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter22 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors4, metricRegistryManager12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier23 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter24 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager12, webContainerThreadInfoSupplier23);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter25 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "db.operation.count.stop", monitors1, metricRegistryManager12);
    try {
      discoveryCoreNodeAdapter25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier19 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        storeEntityCountersSupplier19, pageCacheTracer20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    jVMAdapterGarbageCollectionImpl22.start();
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    long long2 = livingCacheMeta0.getSizeCnt();
    livingCacheMeta0.setabys((long) 1);
    long long5 = livingCacheMeta0.getLgBm();
    long long6 = livingCacheMeta0.getLgBm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager8);
    try {
      jVMAdapterThreadMXImpl19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.getLgBm();
    livingCacheMeta0.sememt(10);
    long long6 = livingCacheMeta0.getIEm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter13 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.discovery.cluster.members", metricRegistryManager8, monitors12);
    try {
      boltAdapter13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0412");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.memory.MemoryPools memoryPools12 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl14 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager11, memoryPools12,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager11, monitors15);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager11);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier18 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters19 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, transactionIdStoreSupplier18, transactionCounters19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter22 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager11, monitors21);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "vm.heap.used", metricRegistryManager11);
    org.neo4j.scheduler.JobScheduler jobScheduler24 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction25 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout26 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter27 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager11, jobScheduler24,
        fileSystemAbstraction25, databaseLayout26);
    try {
      gdbStoreStatsAdapter27.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl extensionFactoryGdbMetricsImpl0 = new io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl();
    java.lang.String str1 = extensionFactoryGdbMetricsImpl0.toString();
    java.lang.String str2 = extensionFactoryGdbMetricsImpl0.toString();
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors13);
    boolean boolean15 = extensionFactoryGdbMetricsImpl0.equals(
        (java.lang.Object) "db.operation.count.start");
    io.github.onograph.metrics.incoming.cluster.SyncStat syncStat16 = new io.github.onograph.metrics.incoming.cluster.SyncStat();
    syncStat16.marc();
    syncStat16.norlad();
    syncStat16.marc();
    syncStat16.clerut();
    syncStat16.clerut();
    syncStat16.recnam();
    syncStat16.suslrle();
    syncStat16.recnam();
    syncStat16.clerut();
    syncStat16.norlad();
    boolean boolean27 = extensionFactoryGdbMetricsImpl0.equals((java.lang.Object) syncStat16);
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str1, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]" + "'",
        str2, "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]");
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType5, (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager10, monitors14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.recovered", metricRegistryManager10);
    org.neo4j.memory.MemoryPools memoryPools17 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl19 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, memoryPools17,
        "db.operation.count.create");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "db.operation.count.create", metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier21 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "", metricRegistryManager10, storeEntityCountersSupplier21, pageCacheTracer22);
    try {
      gdbStatsAdapter23.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        jobScheduler16, fileSystemAbstraction17, databaseLayout18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10,
        storeEntityCountersSupplier20);
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors22);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters24 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter25 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "pool.<pool>.<database>.vm.heap.used", metricRegistryManager10, pageCacheCounters24);
    com.codahale.metrics.MetricFilter metricFilter26 = null;
    try {
      metricRegistryManager10.reomcnForMe(metricFilter26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl17 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.query.execution", metricRegistryManager9, memoryPools15,
        "pool.<pool>.<database>.db.operation.count.start");
    org.neo4j.scheduler.JobScheduler jobScheduler18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "dbms.pool.<pool>.dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager9,
        jobScheduler18, fileSystemAbstraction19, databaseLayout20);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters22 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter23 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager9,
        checkpointCounters22);
    try {
      checkpointCounterAdapter23.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier14 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter15 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl1, metricRegistryManager8,
        coreNodeLeaderCheckSupplier14);
    try {
      consensusCoreNodeAdapter15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "db.operation.count.start", metricRegistryManager9, monitors17);
    try {
      metricRegistryManager9.reoForSt("pool.<pool>.<database>.db.query.execution");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl18 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10,
        monitors17);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier19 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter20 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitorsClusterConsensusImpl2,
        metricRegistryManager10, coreNodeLeaderCheckSupplier19);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "causal_clustering.core.last_leader_message", metricRegistryManager10);
    try {
      metricRegistryManager10.reoForSt("db.operation.count.drop");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType5, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier16 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter17 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager10, webContainerThreadInfoSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager10, monitors18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager10, storeEntityCountersSupplier20);
    org.neo4j.scheduler.JobScheduler jobScheduler22 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "", metricRegistryManager10, jobScheduler22, fileSystemAbstraction23, databaseLayout24);
    try {
      gdbStoreStatsAdapter25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10,
        storeEntityCountersSupplier17, pageCacheTracer18);
    org.neo4j.memory.MemoryPools memoryPools20 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl22 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager10,
        memoryPools20, "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters23 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter24 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "dbms.pool.<pool>.db.operation.count.create", metricRegistryManager10,
        checkpointCounters23);
    try {
      checkpointCounterAdapter24.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.seivldasForCl(clusterDataType5, (int) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0425");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager10);
    org.neo4j.memory.MemoryPools memoryPools18 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl19 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.start", metricRegistryManager10, memoryPools18);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters20 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter21 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "db.operation.count.recovered", metricRegistryManager10, pageCacheCounters20);
    try {
      neoPageCacheAdapter21.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "dbms.pool.<pool>.pool.<pool>.<database>.db.query.execution", metricRegistryManager1);
    try {
      jVMAdapterThreadMXImpl2.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) (byte) 100);
    long long4 = livingCacheMeta0.getSizeCnt();
    long long5 = livingCacheMeta0.getLgBm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0428");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    java.lang.Class<?> wildcardClass4 = consensusMessageStats0.getClass();
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier17 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter18 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager11, webContainerThreadInfoSupplier17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager11, monitors19);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager11, storeEntityCountersSupplier21);
    org.neo4j.memory.MemoryPools memoryPools23 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl25 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager11,
        memoryPools23, "db.operation.count.stop");
    org.neo4j.memory.MemoryPools memoryPools26 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl27 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.start", metricRegistryManager11, memoryPools26);
    try {
      java.util.SortedSet<java.lang.String> strSet28 = metricRegistryManager11.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    io.github.onograph.metrics.incoming.cluster.SyncStat syncStat0 = new io.github.onograph.metrics.incoming.cluster.SyncStat();
    syncStat0.marc();
    syncStat0.norlad();
    syncStat0.marc();
    syncStat0.suslrle();
    syncStat0.marc();
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl2 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "dbms.pool.<pool>.pool.<pool>.<database>.db.query.execution", metricRegistryManager1);
    try {
      jVMAdapterThreadMXImpl2.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str2 = io.github.onograph.metrics.gdb.GdbMetricsEngine.daamtpxString(config0,
          "causal_clustering.core.discovery.replicated_data");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterMembersCount clusterMembersCount0 = new io.github.onograph.metrics.incoming.cluster.ClusterMembersCount();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge1 = clusterMembersCount0.mebsGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.seuehl((int) (short) -1);
    clusterMembersCount0.sembs((int) (byte) 1);
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge7 = clusterMembersCount0.covgGauge();
    clusterMembersCount0.secvg(true);
    clusterMembersCount0.seuehl((int) ' ');
    org.junit.Assert.assertNotNull(intGauge1);
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge7);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery19, "db.query.execution");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryExecutionMonitorMetricsImpl15.startExecution(executingQuery22);
    queryExecutionMonitorMetricsImpl15.init();
    try {
      queryExecutionMonitorMetricsImpl15.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.memory.MemoryPools memoryPools13 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl15 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager12, memoryPools13,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.converged", monitors5, metricRegistryManager12);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager12,
        databaseOperationCounts18);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier20 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter21 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager12, webContainerThreadInfoSupplier20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "pool.<pool>.<database>.vm.heap.used", metricRegistryManager12);
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager8, monitors12);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter14 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "db.query.execution", monitors1, metricRegistryManager8);
    try {
      readReplicaNodeAdapter14.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0437");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl5, metricRegistryManager12,
        coreNodeLeaderCheckSupplier18);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier20 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter21 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.recovered", monitorsClusterConsensusImpl3, metricRegistryManager12,
        coreNodeLeaderCheckSupplier20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager12);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters23 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter24 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "vm.heap.max", metricRegistryManager12, pageCacheCounters23);
    try {
      neoPageCacheAdapter24.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0438");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.recovered", metricRegistryManager9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter16 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", monitors1,
        metricRegistryManager9);
    try {
      txCatchupAdapter16.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.memory.MemoryPools memoryPools14 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl16 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager13, memoryPools14,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager13, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.query.execution", metricRegistryManager13, databaseOperationCounts20);
    gdbActionsAdapter21.start();
    gdbActionsAdapter21.start();
    boolean boolean24 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbActionsAdapter21);
    try {
      gdbActionsAdapter21.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0440");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager9);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager9, databaseOperationCounts14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager9, storeEntityCountersSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager9, monitors18);
    try {
      jVMAdapterSDPImpl19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier16 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter17 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager10, webContainerThreadInfoSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager10, monitors18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager10, storeEntityCountersSupplier20);
    org.neo4j.scheduler.JobScheduler jobScheduler22 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "", metricRegistryManager10, jobScheduler22, fileSystemAbstraction23, databaseLayout24);
    gdbStoreStatsAdapter25.shutdown();
    try {
      gdbStoreStatsAdapter25.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        storeEntityCountersSupplier19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9,
        monitors21);
    try {
      jVMAdapterSDPImpl22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager11);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.drop", metricRegistryManager11, jobScheduler19, fileSystemAbstraction20,
        databaseLayout21);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter23 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager11);
    try {
      txCatchupAdapter23.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0444");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.memory.MemoryPools memoryPools12 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl14 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager11, memoryPools12,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.drop", metricRegistryManager11);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "db.operation.count.failed", metricRegistryManager11, databaseOperationCounts16);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "globalMetrics", metricRegistryManager11, storeEntityCountersSupplier18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "hi!", metricRegistryManager11, monitors20);
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter22 = new io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter(
        "globalMetrics", monitors1, metricRegistryManager11);
    try {
      readReplicaNodeAdapter22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0445");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType1 = null;
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer(raftConsensusMessageType1);
    long long3 = consensusMessageStats0.dea();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType4 = null;
    com.codahale.metrics.Timer timer5 = consensusMessageStats0.getTimer(raftConsensusMessageType4);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType6 = null;
    com.codahale.metrics.Timer timer7 = consensusMessageStats0.getTimer(raftConsensusMessageType6);
    java.time.Duration duration8 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType9 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration8, raftConsensusMessageType9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertNull(timer2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNull(timer5);
    org.junit.Assert.assertNull(timer7);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager11,
        jobScheduler17, fileSystemAbstraction18, databaseLayout19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter22 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager11, monitors21);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters23 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter24 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager11, pageCacheCounters23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.create", metricRegistryManager11);
    org.neo4j.monitoring.Monitors monitors26 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter27 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.query.execution", metricRegistryManager11, monitors26);
    try {
      cypherPlanAdapter27.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray2 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList3 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        globbingPatternArray2);
    com.codahale.metrics.MetricRegistry metricRegistry5 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager6 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList3,
        metricRegistry5);
    org.neo4j.memory.MemoryPools memoryPools7 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl9 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager6, memoryPools7,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager6, monitors10);
    try {
      java.util.SortedSet<java.lang.String> strSet12 = metricRegistryManager6.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager8);
    jVMAdapterFileStatImpl19.start();
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0449");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gehs();
    livingCacheMeta0.sembe((long) (short) 1);
    long long6 = livingCacheMeta0.gems();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) '#');
    livingCacheMeta0.cacheMiss();
    long long5 = livingCacheMeta0.getICe();
    long long6 = livingCacheMeta0.getICe();
    livingCacheMeta0.setabys((long) 100);
    livingCacheMeta0.setabys((long) (byte) 100);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter11 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors2, metricRegistryManager8);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl13 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager8, monitors12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryExecutionMonitorMetricsImpl13.endFailure(executingQuery14, throwable15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryExecutionMonitorMetricsImpl13.beforeEnd(executingQuery17, true);
    try {
      queryExecutionMonitorMetricsImpl13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter18 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.start", metricRegistryManager9, monitors17);
    try {
      boltAdapter18.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    io.github.onograph.metrics.incoming.cluster.SyncStat syncStat0 = new io.github.onograph.metrics.incoming.cluster.SyncStat();
    syncStat0.marc();
    syncStat0.norlad();
    syncStat0.recnam();
    syncStat0.norlad();
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) '#');
    long long4 = livingCacheMeta0.getSizeCnt();
    long long5 = livingCacheMeta0.gems();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        jobScheduler14, fileSystemAbstraction15, databaseLayout16);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        storeEntityCountersSupplier18);
    gdbElementStatsAdapter19.start();
    gdbElementStatsAdapter19.shutdown();
    try {
      gdbElementStatsAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.monitoring.Monitors monitors12 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter13 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, monitors12);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager11, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager11,
        jobScheduler17, fileSystemAbstraction18, databaseLayout19);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager11,
        storeEntityCountersSupplier21);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter23 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "hi!", monitors2, metricRegistryManager11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl24 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl(
        "db.operation.count.start", metricRegistryManager11);
    try {
      jVMAdapterFileStatImpl24.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0457");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats0 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long1 = consensusMessageStats0.dea();
    com.codahale.metrics.Timer timer2 = consensusMessageStats0.getTimer();
    com.codahale.metrics.Timer timer3 = consensusMessageStats0.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats0.getTimer();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats5 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long6 = consensusMessageStats5.dea();
    com.codahale.metrics.Timer timer7 = consensusMessageStats5.getTimer();
    com.codahale.metrics.Timer timer8 = consensusMessageStats5.getTimer();
    java.time.Duration duration9 = io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.UPAIEA_DURATION;
    consensusMessageStats5.sedaForDu(duration9);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType11 = null;
    try {
      consensusMessageStats0.upateForCoDu(duration9, raftConsensusMessageType11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats0);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertNotNull(timer2);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertNotNull(consensusMessageStats5);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertNotNull(timer7);
    org.junit.Assert.assertNotNull(timer8);
    org.junit.Assert.assertNotNull(duration9);
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager14, monitors15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager14,
        jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter25 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager14, monitors24);
    org.neo4j.memory.MemoryPools memoryPools26 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl27 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager14, memoryPools26);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier28 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer29 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter30 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier28,
        pageCacheTracer29);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier31 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter32 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl3, metricRegistryManager14,
        coreNodeLeaderCheckSupplier31);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters33 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter34 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager14, checkpointCounters33);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters35 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter36 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager14,
        checkpointCounters35);
    try {
      checkpointCounterAdapter36.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) (byte) 0);
    long long6 = livingCacheMeta0.getICe();
    livingCacheMeta0.seeec((int) (short) 10);
    long long9 = livingCacheMeta0.gehs();
    long long10 = livingCacheMeta0.gems();
    long long11 = livingCacheMeta0.getIEm();
    long long12 = livingCacheMeta0.gehs();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl16 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.start", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl18 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier19 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters20 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager10,
        transactionIdStoreSupplier19, transactionCounters20);
    try {
      globalTransactionStatsAdapter21.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager9,
        jobScheduler15, fileSystemAbstraction16, databaseLayout17);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier19 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        storeEntityCountersSupplier19, pageCacheTracer20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "db.operation.count.stop", metricRegistryManager9);
    jVMAdapterThreadMXImpl22.init();
    try {
      jVMAdapterThreadMXImpl22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gems();
    livingCacheMeta0.sememt((int) (byte) 0);
    long long6 = livingCacheMeta0.getSizeCnt();
    long long7 = livingCacheMeta0.gems();
    long long8 = livingCacheMeta0.getSizeCnt();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "vm.heap.max", metricRegistryManager8);
    try {
      metricRegistryManager8.reoForSt("causal_clustering.core.last_leader_message");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager8);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl16 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "db.operation.count.start", metricRegistryManager8, memoryPools15);
    java.lang.String str18 = memoryPoolsAdapterNeoStackImpl16.moydmdmineString("vm.heap.max");
    java.lang.String str20 = memoryPoolsAdapterNeoStackImpl16.moydmdmineString("vm.heap.used");
    try {
      memoryPoolsAdapterNeoStackImpl16.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dbms.pool.<pool>.vm.heap.max" + "'",
        str18, "dbms.pool.<pool>.vm.heap.max");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dbms.pool.<pool>.vm.heap.used" + "'",
        str20, "dbms.pool.<pool>.vm.heap.used");
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager14, monitors15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager14,
        jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    org.neo4j.monitoring.Monitors monitors24 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter25 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager14, monitors24);
    org.neo4j.memory.MemoryPools memoryPools26 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl27 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager14, memoryPools26);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier28 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer29 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter30 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier28,
        pageCacheTracer29);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier31 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter32 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl3, metricRegistryManager14,
        coreNodeLeaderCheckSupplier31);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters33 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter34 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager14, checkpointCounters33);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier35 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter36 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "db.operation.count.recovered", metricRegistryManager14, storeEntityCountersSupplier35);
    try {
      gdbElementStatsAdapter36.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getSizeCnt();
    long long3 = livingCacheMeta0.gems();
    long long4 = livingCacheMeta0.gems();
    long long5 = livingCacheMeta0.getIEm();
    long long6 = livingCacheMeta0.getLgBm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0467");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl16 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager8,
        monitors15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter18 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors17);
    try {
      boltAdapter18.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl14 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager10);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter15 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "causal_clustering.core.discovery.cluster.members", monitors3, metricRegistryManager10);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier16 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter17 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "db.query.execution", metricRegistryManager10, webContainerThreadInfoSupplier16);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters18 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter19 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager10, pageCacheCounters18);
    try {
      neoPageCacheAdapter19.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0469");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl20 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.failed", metricRegistryManager9);
    java.lang.String str23 = jVMAdapterGarbageCollectionImpl21.moydmdmineString(
        "db.operation.count.failed");
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "db.operation.count.failed" + "'", str23,
        "db.operation.count.failed");
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter12 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors3, metricRegistryManager9);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter14 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.discovery.cluster.members", metricRegistryManager9, monitors13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager9);
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier14 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter15 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager8, webContainerThreadInfoSupplier14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "hi!", metricRegistryManager8, storeEntityCountersSupplier16, pageCacheTracer17);
    try {
      gdbStatsAdapter18.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter10 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager8,
        monitors9);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager8, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.scheduler.JobScheduler jobScheduler14 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        jobScheduler14, fileSystemAbstraction15, databaseLayout16);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager8,
        storeEntityCountersSupplier18);
    gdbElementStatsAdapter19.start();
    gdbElementStatsAdapter19.start();
    try {
      gdbElementStatsAdapter19.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager13,
        jobScheduler19, fileSystemAbstraction20, databaseLayout21);
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter24 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager13, monitors23);
    org.neo4j.memory.MemoryPools memoryPools25 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl26 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl(
        "hi!", metricRegistryManager13, memoryPools25);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier27 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer28 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter29 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier27,
        pageCacheTracer28);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier30 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter31 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl2, metricRegistryManager13,
        coreNodeLeaderCheckSupplier30);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters32 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter33 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager13, checkpointCounters32);
    checkpointCounterAdapter33.shutdown();
    try {
      checkpointCounterAdapter33.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType5, 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterMembersCount clusterMembersCount0 = new io.github.onograph.metrics.incoming.cluster.ClusterMembersCount();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge1 = clusterMembersCount0.mebsGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.seuehl((int) (byte) 0);
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge5 = clusterMembersCount0.unehlGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge6 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.secvg(true);
    org.junit.Assert.assertNotNull(intGauge1);
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge5);
    org.junit.Assert.assertNotNull(intGauge6);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    double double2 = metricsMeter1.getOneMinuteRate();
    double double3 = metricsMeter1.getFifteenMinuteRate();
    double double4 = metricsMeter1.getOneMinuteRate();
    org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter12 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "causal_clustering.core.last_leader_message", monitors3, metricRegistryManager9);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl14 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager9, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "dbms.pool.<pool>.pool.<pool>.<database>.db.query.execution", metricRegistryManager9,
        storeEntityCountersSupplier15, pageCacheTracer16);
    try {
      gdbStatsAdapter17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray4 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        globbingPatternArray4);
    com.codahale.metrics.MetricRegistry metricRegistry7 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager8 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList5,
        metricRegistry7);
    org.neo4j.memory.MemoryPools memoryPools9 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl11 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager8, memoryPools9,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager8, storeEntityCountersSupplier12,
        pageCacheTracer13);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager8, jobScheduler15,
        fileSystemAbstraction16, databaseLayout17);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "dbms.pool.<pool>.db.operation.count.failed", metricRegistryManager8);
    jVMAdapterThreadMXImpl19.start();
    jVMAdapterThreadMXImpl19.start();
    org.junit.Assert.assertNotNull(globbingPatternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl5 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray8 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList9 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        globbingPatternArray8);
    com.codahale.metrics.MetricRegistry metricRegistry11 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager12 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList9,
        metricRegistry11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter14 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager12, monitors13);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier15 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer16 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter17 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager12, storeEntityCountersSupplier15,
        pageCacheTracer16);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier18 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter19 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl5, metricRegistryManager12,
        coreNodeLeaderCheckSupplier18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter21 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager12, monitors20);
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter23 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "hi!", metricRegistryManager12, monitors22);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter24 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "dbms.pool.<pool>.neo4j.count.relationship", monitors1, metricRegistryManager12);
    try {
      java.util.SortedSet<java.lang.String> strSet25 = metricRegistryManager12.geneSortedSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0480");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier8 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters9 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter10 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        transactionIdStoreSupplier8, transactionCounters9);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl11 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager7);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier12 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters13 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "vm.heap.used", metricRegistryManager7, transactionIdStoreSupplier12,
        transactionCounters13);
    com.codahale.metrics.MetricFilter metricFilter15 = null;
    try {
      metricRegistryManager7.reomcnForMe(metricFilter15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterMembersCount clusterMembersCount0 = new io.github.onograph.metrics.incoming.cluster.ClusterMembersCount();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge1 = clusterMembersCount0.mebsGauge();
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterMembersCount0.unehlGauge();
    clusterMembersCount0.seuehl((int) (byte) 0);
    clusterMembersCount0.seuehl(1);
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge7 = clusterMembersCount0.unehlGauge();
    org.junit.Assert.assertNotNull(intGauge1);
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge7);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.memory.MemoryPools memoryPools11 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl13 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager10, memoryPools11,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier14 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter16 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager10, storeEntityCountersSupplier14,
        pageCacheTracer15);
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager10, jobScheduler17,
        fileSystemAbstraction18, databaseLayout19);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager10);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "db.operation.count.failed", metricRegistryManager10);
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl24 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "pool.<pool>.<database>.db.operation.count.failed", metricRegistryManager10, monitors23);
    queryExecutionMonitorMetricsImpl24.init();
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray9 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList10 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        globbingPatternArray9);
    com.codahale.metrics.MetricRegistry metricRegistry12 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager13 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList10,
        metricRegistry12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter15 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager13, monitors14);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier16 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer17 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter18 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager13, storeEntityCountersSupplier16,
        pageCacheTracer17);
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager13,
        jobScheduler19, fileSystemAbstraction20, databaseLayout21);
    org.neo4j.monitoring.Monitors monitors23 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter24 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager13, monitors23);
    org.neo4j.io.pagecache.monitoring.PageCacheCounters pageCacheCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter26 = new io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter(
        "", metricRegistryManager13, pageCacheCounters25);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl27 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl(
        "db.operation.count.create", metricRegistryManager13);
    org.neo4j.monitoring.Monitors monitors28 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter29 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.query.execution", metricRegistryManager13, monitors28);
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter30 = new io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter(
        "db.operation.count.drop", monitors1, metricRegistryManager13);
    try {
      discoveryCoreNodeAdapter30.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType3, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl transactionSizeMonitorImpl0 = new io.github.onograph.metrics.incoming.gdb.TransactionSizeMonitorImpl();
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) ' ');
    transactionSizeMonitorImpl0.addHeapTransactionSize(100L);
    transactionSizeMonitorImpl0.addNativeTransactionSize(0L);
    transactionSizeMonitorImpl0.addNativeTransactionSize((-1L));
    transactionSizeMonitorImpl0.addNativeTransactionSize((long) (byte) 0);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    metricsMeter1.mark();
    metricsMeter1.mark((long) 10);
    double double7 = metricsMeter1.getMeanRate();
    double double8 = metricsMeter1.getMeanRate();
    metricsMeter1.mark();
    metricsMeter1.mark((long) '4');
    double double12 = metricsMeter1.getFiveMinuteRate();
    double double13 = metricsMeter1.getFifteenMinuteRate();
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl clusterDataWatcherMetricsImpl0 = new io.github.onograph.metrics.incoming.cluster.ClusterDataWatcherMetricsImpl();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge2 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType1);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType3 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge4 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType3);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType5 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge6 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType5);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType7 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge8 = clusterDataWatcherMetricsImpl0.gevsdsiGauge(
        clusterDataType7);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType9 = null;
    com.codahale.metrics.Gauge<java.lang.Integer> intGauge10 = clusterDataWatcherMetricsImpl0.geivldasGauge(
        clusterDataType9);
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType11 = null;
    try {
      clusterDataWatcherMetricsImpl0.sevsdsiForCl(clusterDataType11, (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intGauge2);
    org.junit.Assert.assertNotNull(intGauge4);
    org.junit.Assert.assertNotNull(intGauge6);
    org.junit.Assert.assertNotNull(intGauge8);
    org.junit.Assert.assertNotNull(intGauge10);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.memory.MemoryPools memoryPools8 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl10 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager7, memoryPools8,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier11 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer12 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter13 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager7, storeEntityCountersSupplier11,
        pageCacheTracer12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl queryExecutionMonitorMetricsImpl15 = new io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl(
        "Extension:MetricsServiceExtensionFactory[globalMetrics]", metricRegistryManager7,
        monitors14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryExecutionMonitorMetricsImpl15.endFailure(executingQuery16,
        "pool.<pool>.<database>.db.operation.count.failed");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryExecutionMonitorMetricsImpl15.startExecution(executingQuery19);
    try {
      queryExecutionMonitorMetricsImpl15.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.memory.MemoryPools memoryPools16 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl18 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "db.query.execution", metricRegistryManager10, memoryPools16,
        "pool.<pool>.<database>.db.operation.count.start");
    org.neo4j.scheduler.JobScheduler jobScheduler19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout21 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter22 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "dbms.pool.<pool>.dbms.pool.<pool>.neo4j.count.relationship", metricRegistryManager10,
        jobScheduler19, fileSystemAbstraction20, databaseLayout21);
    org.neo4j.kernel.impl.transaction.stats.CheckpointCounters checkpointCounters23 = null;
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter24 = new io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter(
        "causal_clustering.core.discovery.replicated_data", metricRegistryManager10,
        checkpointCounters23);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl25 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "db.operation.count.create", metricRegistryManager10);
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray7 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList8 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        globbingPatternArray7);
    com.codahale.metrics.MetricRegistry metricRegistry10 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager11 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList8,
        metricRegistry10);
    org.neo4j.memory.MemoryPools memoryPools12 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl14 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager11, memoryPools12,
        "causal_clustering.core.discovery.cluster.unreachable");
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "db.operation.count.start", metricRegistryManager11, monitors15);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl17 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager11);
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier18 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters19 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager11, transactionIdStoreSupplier18, transactionCounters19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter22 = new io.github.onograph.metrics.incoming.gdb.BoltAdapter(
        "db.operation.count.stop", metricRegistryManager11, monitors21);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl23 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl(
        "vm.heap.used", metricRegistryManager11);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "neo4j.count.relationship", metricRegistryManager11, databaseOperationCounts24);
    try {
      gdbActionsAdapter25.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.memory.MemoryPools memoryPools10 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl12 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager9, memoryPools10,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager9, storeEntityCountersSupplier13,
        pageCacheTracer14);
    org.neo4j.scheduler.JobScheduler jobScheduler16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager9, jobScheduler16,
        fileSystemAbstraction17, databaseLayout18);
    org.neo4j.monitoring.Monitors monitors20 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl21 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager9, monitors20);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl22 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl(
        "db.operation.count.start", metricRegistryManager9);
    java.lang.String str24 = jVMAdapterPoolImpl22.moydmdmineString("db.query.execution");
    jVMAdapterPoolImpl22.start();
    try {
      jVMAdapterPoolImpl22.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "db.query.execution" + "'", str24,
        "db.query.execution");
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray3 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList4 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        globbingPatternArray3);
    com.codahale.metrics.MetricRegistry metricRegistry6 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager7 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList4,
        metricRegistry6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter9 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager7,
        monitors8);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter12 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager7, storeEntityCountersSupplier10,
        pageCacheTracer11);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl13 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager7);
    com.codahale.metrics.MetricFilter metricFilter14 = null;
    try {
      metricRegistryManager7.reomcnForMe(metricFilter14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    java.util.function.LongSupplier longSupplier0 = null;
    io.github.onograph.metrics.MetricsMeter metricsMeter1 = new io.github.onograph.metrics.MetricsMeter(
        longSupplier0);
    metricsMeter1.mark(100L);
    double double4 = metricsMeter1.getFifteenMinuteRate();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager1 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier2 = null;
    org.neo4j.kernel.impl.transaction.stats.TransactionCounters transactionCounters3 = null;
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter4 = new io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter(
        "causal_clustering.core.discovery.cluster.converged", metricRegistryManager1,
        transactionIdStoreSupplier2, transactionCounters3);
    try {
      globalTransactionStatsAdapter4.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl1 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl15 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "pool.<pool>.<database>.db.operation.count.start", metricRegistryManager9);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier16 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter17 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "db.operation.count.failed", monitorsClusterConsensusImpl1, metricRegistryManager9,
        coreNodeLeaderCheckSupplier16);
    try {
      consensusCoreNodeAdapter17.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter16 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager14, monitors15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager14, storeEntityCountersSupplier17,
        pageCacheTracer18);
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout22 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter23 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "causal_clustering.core.discovery.cluster.unreachable", metricRegistryManager14,
        jobScheduler20, fileSystemAbstraction21, databaseLayout22);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter24 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "", monitors6, metricRegistryManager14);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier25 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter26 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "", metricRegistryManager14, webContainerThreadInfoSupplier25);
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl27 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl(
        "db.operation.count.stop", metricRegistryManager14);
    org.neo4j.dbms.database.DatabaseOperationCounts databaseOperationCounts28 = null;
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter29 = new io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter(
        "causal_clustering.core.last_leader_message", metricRegistryManager14,
        databaseOperationCounts28);
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter30 = new io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter(
        "db.query.execution", monitors1, metricRegistryManager14);
    try {
      txCatchupAdapter30.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0497");
    }
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray6 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        globbingPatternArray6);
    com.codahale.metrics.MetricRegistry metricRegistry9 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager10 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList7,
        metricRegistry9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter12 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message",
        metricRegistryManager10, monitors11);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter15 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.drop", metricRegistryManager10, storeEntityCountersSupplier13,
        pageCacheTracer14);
    java.util.function.Supplier<org.neo4j.server.web.WebContainerThreadInfo> webContainerThreadInfoSupplier16 = null;
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter17 = new io.github.onograph.metrics.incoming.JettyAdapter(
        "vm.heap.max", metricRegistryManager10, webContainerThreadInfoSupplier16);
    org.neo4j.monitoring.Monitors monitors18 = null;
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl19 = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl(
        "vm.heap.used", metricRegistryManager10, monitors18);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier20 = null;
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter21 = new io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter(
        "", metricRegistryManager10, storeEntityCountersSupplier20);
    org.neo4j.scheduler.JobScheduler jobScheduler22 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout24 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter25 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "", metricRegistryManager10, jobScheduler22, fileSystemAbstraction23, databaseLayout24);
    try {
      gdbStoreStatsAdapter25.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(globbingPatternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    io.github.onograph.metrics.incoming.cluster.LivingCacheMeta livingCacheMeta0 = new io.github.onograph.metrics.incoming.cluster.LivingCacheMeta();
    long long1 = livingCacheMeta0.gehs();
    long long2 = livingCacheMeta0.getLgBm();
    long long3 = livingCacheMeta0.getLgBm();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = new io.github.onograph.metrics.MetricsServiceExtensionFactory();
    io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats consensusMessageStats1 = io.github.onograph.metrics.incoming.cluster.ConsensusMessageStats.craConsensusMessageStats();
    long long2 = consensusMessageStats1.dea();
    com.codahale.metrics.Timer timer3 = consensusMessageStats1.getTimer();
    com.codahale.metrics.Timer timer4 = consensusMessageStats1.getTimer();
    boolean boolean5 = metricsServiceExtensionFactory0.equals((java.lang.Object) timer4);
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray10 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList11 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        globbingPatternArray10);
    com.codahale.metrics.MetricRegistry metricRegistry13 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager14 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList11,
        metricRegistry13);
    org.neo4j.memory.MemoryPools memoryPools15 = null;
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl17 = new io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl(
        "vm.heap.used", metricRegistryManager14, memoryPools15,
        "causal_clustering.core.discovery.cluster.unreachable");
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier18 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer19 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter20 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "neo4j.count.relationship", metricRegistryManager14, storeEntityCountersSupplier18,
        pageCacheTracer19);
    org.neo4j.scheduler.JobScheduler jobScheduler21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout23 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter24 = new io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter(
        "db.operation.count.failed", metricRegistryManager14, jobScheduler21,
        fileSystemAbstraction22, databaseLayout23);
    org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters transactionLogCounters25 = null;
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter26 = new io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter(
        "", metricRegistryManager14, transactionLogCounters25);
    gdbTransactionLogAdapter26.start();
    boolean boolean28 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter26);
    try {
      gdbTransactionLogAdapter26.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusMessageStats1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(timer3);
    org.junit.Assert.assertNotNull(timer4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(globbingPatternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = null;
    org.neo4j.configuration.helpers.GlobbingPattern[] globbingPatternArray5 = new org.neo4j.configuration.helpers.GlobbingPattern[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern> globbingPatternList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.GlobbingPattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        globbingPatternArray5);
    com.codahale.metrics.MetricRegistry metricRegistry8 = null;
    io.github.onograph.metrics.MetricRegistryManager metricRegistryManager9 = new io.github.onograph.metrics.MetricRegistryManager(
        (java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>) globbingPatternList6,
        metricRegistry8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter11 = new io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter(
        "pool.<pool>.<database>.causal_clustering.core.last_leader_message", metricRegistryManager9,
        monitors10);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter14 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "db.operation.count.start", metricRegistryManager9, storeEntityCountersSupplier12,
        pageCacheTracer13);
    java.util.function.Supplier<io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck> coreNodeLeaderCheckSupplier15 = null;
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter16 = new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter(
        "hi!", monitorsClusterConsensusImpl2, metricRegistryManager9,
        coreNodeLeaderCheckSupplier15);
    java.util.function.Supplier<org.neo4j.kernel.impl.store.stats.StoreEntityCounters> storeEntityCountersSupplier17 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer18 = null;
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter19 = new io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter(
        "Extension:ExtensionFactoryGdbMetricsImpl[databaseMetrics]", metricRegistryManager9,
        storeEntityCountersSupplier17, pageCacheTracer18);
    gdbStatsAdapter19.start();
    gdbStatsAdapter19.start();
    gdbStatsAdapter19.start();
    org.junit.Assert.assertNotNull(globbingPatternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }
}

