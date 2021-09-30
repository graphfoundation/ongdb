package io.github.onograph.test;

import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter;
import java.util.function.Supplier;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModErrTest0 {

  public static boolean debug = false;

  private GdbStoreStatsAdapter buildMockGdbStoreStatsAdapter() {
    return Mockito.mock(GdbStoreStatsAdapter.class);
  }

  private ConsensusCoreNodeAdapter buildMockConsensusCoreNodeAdapter() {

    Supplier<CoreNodeLeaderCheck> supplier = new Supplier<CoreNodeLeaderCheck>() {
      @Override
      public CoreNodeLeaderCheck get() {
        return Mockito.mock(CoreNodeLeaderCheck.class);
      }
    };

    return
        new ConsensusCoreNodeAdapter("test", Mockito.mock(MonitorsClusterConsensusImpl.class),
            Mockito.mock(MetricRegistryManager.class),
            supplier
        );

  }

  @Test
  public void test01() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test01");
    }

    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter0 = buildMockConsensusCoreNodeAdapter();
    consensusCoreNodeAdapter0.start();
  }

  @Test
  public void test02() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test02");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter0 = buildMockGdbStoreStatsAdapter();
    gdbStoreStatsAdapter0.start();
  }

  @Test
  public void test03() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test03");
    }
    io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter consensusCoreNodeAdapter0 = buildMockConsensusCoreNodeAdapter();
    consensusCoreNodeAdapter0.stop();
  }

  @Test
  public void test04() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test04");
    }
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter.class);
    readReplicaNodeAdapter0.stop();
  }

  @Test
  public void test05() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test05");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.JettyAdapter.class);
    jettyAdapter0.start();
  }

  @Test
  public void test06() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test06");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter0 = buildMockGdbStoreStatsAdapter();
    gdbStoreStatsAdapter0.stop();
  }

  @Test
  public void test07() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test07");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter gdbStoreStatsAdapter0 = buildMockGdbStoreStatsAdapter();
    gdbStoreStatsAdapter0.stop();
  }

  @Test
  public void test08() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test08");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    jVMAdapterMBImpl0.start();
  }

  @Test
  public void test09() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test09");
    }
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter.class);
    cypherPlanAdapter0.stop();
  }

  @Test
  public void test10() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test10");
    }
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    gdbTransactionLogAdapter0.start();
  }

  @Test
  public void test11() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test11");
    }
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.BoltAdapter.class);
    boltAdapter0.stop();
  }

  @Test
  public void test12() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test12");
    }
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    gdbTransactionLogAdapter0.stop();
  }

  @Test
  public void test13() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test13");
    }
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.class);
    gdbActionsAdapter0.stop();
  }

  @Test
  public void test14() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test14");
    }
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.class);
    discoveryCoreNodeAdapter0.stop();
  }

  @Test
  public void test15() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test15");
    }
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    gdbTransactionLogAdapter0.start();
  }

  @Test
  public void test16() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test16");
    }
    io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter cypherPlanAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter.class);
    cypherPlanAdapter0.start();
  }

  @Test
  public void test17() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test17");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    jVMAdapterGarbageCollectionImpl0.stop();
  }

  @Test
  public void test18() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test18");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    memoryPoolsAdapterGdbImpl0.stop();
  }

  @Test
  public void test19() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test19");
    }
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter.class);
    txCatchupAdapter0.start();
  }

  @Test
  public void test20() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test20");
    }
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.class);
    discoveryCoreNodeAdapter0.start();
  }

  @Test
  public void test21() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test21");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    jVMAdapterMBImpl0.stop();
  }

  @Test
  public void test22() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test22");
    }
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter.class);
    gdbElementStatsAdapter0.stop();
  }

  @Test
  public void test23() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test23");
    }
    io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter readReplicaNodeAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter.class);
    readReplicaNodeAdapter0.start();
  }

  @Test
  public void test24() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test24");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl.class);
    jVMAdapterThreadMXImpl0.stop();
  }

  @Test
  public void test25() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test25");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl.class);
    java.lang.String str2 = jVMAdapterPoolImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    jVMAdapterPoolImpl0.stop();
  }

  @Test
  public void test26() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test26");
    }
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter.class);
    checkpointCounterAdapter0.start();
  }

  @Test
  public void test27() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test27");
    }
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter.class);
    neoPageCacheAdapter0.start();
  }

  @Test
  public void test28() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test28");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = Mockito.mock(
        io.github.onograph.metrics.MetricsServiceExtensionFactory.class);
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter1 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    boolean boolean2 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter1);
    gdbTransactionLogAdapter1.start();
  }

  @Test
  public void test29() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test29");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl.class);
    memoryPoolsAdapterNeoStackImpl0.start();
  }

  @Test
  public void test30() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test30");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl.class);
    jVMAdapterPoolImpl0.stop();
  }

  @Test
  public void test31() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test31");
    }
    io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter checkpointCounterAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter.class);
    checkpointCounterAdapter0.stop();
  }

  @Test
  public void test32() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test32");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.JettyAdapter.class);
    jettyAdapter0.stop();
  }

  @Test
  public void test33() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test33");
    }
    io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter gdbElementStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter.class);
    gdbElementStatsAdapter0.start();
  }

  @Test
  public void test34() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test34");
    }
    io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter neoPageCacheAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter.class);
    neoPageCacheAdapter0.stop();
  }

  @Test
  public void test35() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test35");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl.class);
    jVMAdapterSDPImpl0.start();
  }

  @Test
  public void test36() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test36");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl.class);
    jVMAdapterFileStatImpl0.stop();
  }

  @Test
  public void test37() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test37");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.class);
    jVMAdapterMemoryHeapImpl0.stop();
  }

  @Test
  public void test38() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test38");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl.class);
    jVMAdapterThreadMXImpl0.start();
  }

  @Test
  public void test39() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test39");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = Mockito.mock(
        io.github.onograph.metrics.MetricsServiceExtensionFactory.class);
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter1 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    boolean boolean2 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter1);
    gdbTransactionLogAdapter1.stop();
  }

  @Test
  public void test40() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test40");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter.class);
    gdbStatsAdapter0.stop();
  }

  @Test
  public void test41() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test41");
    }
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter.class);
    globalTransactionStatsAdapter0.stop();
  }

  @Test
  public void test42() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test42");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl jVMAdapterSDPImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl.class);
    jVMAdapterSDPImpl0.stop();
  }

  @Test
  public void test43() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test43");
    }
    io.github.onograph.metrics.MetricsServiceExtensionFactory metricsServiceExtensionFactory0 = Mockito.mock(
        io.github.onograph.metrics.MetricsServiceExtensionFactory.class);
    io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter gdbTransactionLogAdapter1 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter.class);
    boolean boolean2 = metricsServiceExtensionFactory0.equals(
        (java.lang.Object) gdbTransactionLogAdapter1);
    gdbTransactionLogAdapter1.shutdown();
    gdbTransactionLogAdapter1.start();
  }

  @Test
  public void test44() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test44");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    java.lang.String str2 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "db.operation.count.failed");
    memoryPoolsAdapterGdbImpl0.stop();
  }

  @Test
  public void test45() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test45");
    }
    io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter gdbActionsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter.class);
    gdbActionsAdapter0.start();
  }

  @Test
  public void test46() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test46");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl jVMAdapterMemoryHeapImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.class);
    jVMAdapterMemoryHeapImpl0.start();
  }

  @Test
  public void test47() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test47");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    jVMAdapterGarbageCollectionImpl0.start();
  }

  @Test
  public void test48() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test48");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.recovered");
    jVMAdapterGarbageCollectionImpl0.start();
  }

  @Test
  public void test49() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test49");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl jVMAdapterThreadMXImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl.class);
    jVMAdapterThreadMXImpl0.start();
  }

  @Test
  public void test50() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test50");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = memoryPoolsAdapterGdbImpl0.getGrp();
    memoryPoolsAdapterGdbImpl0.stop();
  }

  @Test
  public void test51() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test51");
    }
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter.class);
    globalTransactionStatsAdapter0.start();
  }

  @Test
  public void test52() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test52");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter.class);
    gdbStatsAdapter0.start();
  }

  @Test
  public void test53() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test53");
    }
    io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter discoveryCoreNodeAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter.class);
    discoveryCoreNodeAdapter0.stop();
  }

  @Test
  public void test54() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test54");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl jVMAdapterFileStatImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl.class);
    jVMAdapterFileStatImpl0.start();
  }

  @Test
  public void test55() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test55");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.unreachable");
    jVMAdapterGarbageCollectionImpl0.stop();
  }

  @Test
  public void test56() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test56");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.JettyAdapter.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jettyAdapter0.getGrp();
    jettyAdapter0.start();
  }

  @Test
  public void test57() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test57");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl.class);
    java.lang.String str2 = memoryPoolsAdapterNeoStackImpl0.moydmdmineString(
        "db.operation.count.failed");
    memoryPoolsAdapterNeoStackImpl0.stop();
  }

  @Test
  public void test58() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test58");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    jVMAdapterGarbageCollectionImpl0.stop();
  }

  @Test
  public void test59() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test59");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    jVMAdapterGarbageCollectionImpl0.start();
  }

  @Test
  public void test60() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test60");
    }
    io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter globalTransactionStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter.class);
    globalTransactionStatsAdapter0.stop();
  }

  @Test
  public void test61() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test61");
    }
    io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter txCatchupAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter.class);
    txCatchupAdapter0.stop();
  }

  @Test
  public void test62() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test62");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl.class);
    java.lang.String str2 = jVMAdapterPoolImpl0.moydmdmineString("neo4j.count.node");
    jVMAdapterPoolImpl0.stop();
  }

  @Test
  public void test63() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test63");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    java.lang.String str2 = jVMAdapterMBImpl0.moydmdmineString("db.operation.count.drop");
    jVMAdapterMBImpl0.start();
  }

  @Test
  public void test64() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test64");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl.class);
    java.lang.String str2 = memoryPoolsAdapterNeoStackImpl0.moydmdmineString(
        "pool.<pool>.<database>.db.query.execution");
    memoryPoolsAdapterNeoStackImpl0.stop();
  }

  @Test
  public void test65() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test65");
    }
    io.github.onograph.metrics.incoming.gdb.BoltAdapter boltAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.BoltAdapter.class);
    boltAdapter0.start();
  }

  @Test
  public void test66() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test66");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jVMAdapterMBImpl0.getGrp();
    java.lang.String str3 = jVMAdapterMBImpl0.moydmdmineString("vm.heap.max");
    jVMAdapterMBImpl0.start();
  }

  @Test
  public void test67() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test67");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl.class);
    jVMAdapterPoolImpl0.start();
  }

  @Test
  public void test68() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test68");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    java.lang.String str2 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "dbms.pool.<pool>.db.operation.count.create");
    memoryPoolsAdapterGdbImpl0.start();
  }

  @Test
  public void test69() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test69");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.JettyAdapter.class);
    jettyAdapter0.stop();
  }

  @Test
  public void test70() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test70");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    jVMAdapterGarbageCollectionImpl0.start();
  }

  @Test
  public void test71() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test71");
    }
    io.github.onograph.metrics.incoming.JettyAdapter jettyAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.JettyAdapter.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jettyAdapter0.getGrp();
    jettyAdapter0.stop();
  }

  @Test
  public void test72() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test72");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = memoryPoolsAdapterGdbImpl0.getGrp();
    java.lang.String str3 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    memoryPoolsAdapterGdbImpl0.stop();
  }

  @Test
  public void test73() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test73");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = memoryPoolsAdapterGdbImpl0.getGrp();
    memoryPoolsAdapterGdbImpl0.stop();
  }

  @Test
  public void test74() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test74");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = memoryPoolsAdapterGdbImpl0.getGrp();
    java.lang.String str3 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    memoryPoolsAdapterGdbImpl0.start();
  }

  @Test
  public void test75() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test75");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.recovered");
    java.lang.String str6 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.replicated_data");
    jVMAdapterGarbageCollectionImpl0.stop();
  }

  @Test
  public void test76() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test76");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = jVMAdapterGarbageCollectionImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType5 = jVMAdapterGarbageCollectionImpl0.getGrp();
    jVMAdapterGarbageCollectionImpl0.stop();
  }

  @Test
  public void test77() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test77");
    }
    io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter gdbStatsAdapter0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter.class);
    gdbStatsAdapter0.init();
    gdbStatsAdapter0.start();
  }

  @Test
  public void test78() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test78");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl memoryPoolsAdapterNeoStackImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl.class);
    java.lang.String str2 = memoryPoolsAdapterNeoStackImpl0.moydmdmineString(
        "pool.<pool>.<database>.db.query.execution");
    memoryPoolsAdapterNeoStackImpl0.start();
  }

  @Test
  public void test79() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test79");
    }
    io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl memoryPoolsAdapterGdbImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.class);
    java.lang.String str2 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "db.operation.count.failed");
    java.lang.String str4 = memoryPoolsAdapterGdbImpl0.moydmdmineString(
        "pool.<pool>.<database>.db.operation.count.drop");
    memoryPoolsAdapterGdbImpl0.start();
  }

  @Test
  public void test80() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test80");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jVMAdapterMBImpl0.getGrp();
    jVMAdapterMBImpl0.start();
  }

  @Test
  public void test81() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test81");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl jVMAdapterMBImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl.class);
    io.github.onograph.metrics.incoming.EnterpriseMetricsType enterpriseMetricsType1 = jVMAdapterMBImpl0.getGrp();
    java.lang.String str3 = jVMAdapterMBImpl0.moydmdmineString("vm.heap.max");
    jVMAdapterMBImpl0.stop();
  }

  @Test
  public void test82() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test82");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl jVMAdapterGarbageCollectionImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl.class);
    java.lang.String str2 = jVMAdapterGarbageCollectionImpl0.moydmdmineString("db.query.execution");
    jVMAdapterGarbageCollectionImpl0.start();
  }

  @Test
  public void test83() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test83");
    }
    io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl jVMAdapterPoolImpl0 = Mockito.mock(
        io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl.class);
    java.lang.String str2 = jVMAdapterPoolImpl0.moydmdmineString(
        "causal_clustering.core.discovery.cluster.converged");
    jVMAdapterPoolImpl0.start();
  }
}

