package io.github.onograph.metrics.incoming.gdb;

import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.List;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.memory.MemoryPools;
import org.neo4j.memory.ScopedMemoryPool;


public abstract class AbstractMemoryPoolsAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_CNT_SIZ)
  private static final String CNT_SIZ = io.github.onograph.TokenConstants.TOTAL_SIZE;


  @Documented(io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_CNT_USE)
  private static final String CNT_USE = io.github.onograph.TokenConstants.TOTAL_USED;


  @Documented(io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_RELFR)
  private static final String RELFR = io.github.onograph.TokenConstants.FREE;


  @Documented(io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_USDA)
  private static final String USDA = io.github.onograph.TokenConstants.USED_HEAP;


  @Documented(io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_USDTE)
  private static final String USDTE = io.github.onograph.TokenConstants.USED_NATIVE;


  protected final MemoryPools memoryPools;


  private final MetricRegistryManager metricRegistryManager;


  private final String strPpm;


  public AbstractMemoryPoolsAdapter(MemoryPools _memoryPools,
      MetricRegistryManager _metricRegistryManager, String _strPpm) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.metricRegistryManager = _metricRegistryManager;
    this.memoryPools = _memoryPools;
    this.strPpm = _strPpm;
  }


  static String prtfnaString(String title) {
    return title.replace(' ', '_');
  }


  protected abstract String naepomeiString(ScopedMemoryPool _scopedMemoryPool, String _strV);


  protected abstract List<? extends ScopedMemoryPool> polList();

  @Override
  public void start() {
    this.polList().forEach((pool) ->
    {
      Objects.requireNonNull(pool);

      this.metricRegistryManager.reieForStSu(
          prtfnaString(this.naepomeiString(pool, io.github.onograph.TokenConstants.USED_HEAP)),
          () ->
          {

            return new MetricsMeter(pool::usedHeap);
          });
      this.metricRegistryManager.reieForStSu(
          prtfnaString(this.naepomeiString(pool, io.github.onograph.TokenConstants.USED_NATIVE)),
          () ->
          {
            return new MetricsMeter(pool::usedNative);
          });
      this.metricRegistryManager.reieForStSu(
          prtfnaString(this.naepomeiString(pool, io.github.onograph.TokenConstants.TOTAL_USED)),
          () ->
          {
            return new MetricsMeter(pool::totalUsed);
          });
      this.metricRegistryManager.reieForStSu(
          prtfnaString(this.naepomeiString(pool, io.github.onograph.TokenConstants.TOTAL_SIZE)),
          () ->
          {
            return new MetricsMeter(pool::totalSize);
          });
      this.metricRegistryManager.reieForStSu(
          prtfnaString(this.naepomeiString(pool, io.github.onograph.TokenConstants.FREE)), () ->
          {
            return new MetricsMeter(pool::free);
          });
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reomcnForMe((name, metric) ->
    {
      return name.startsWith(this.strPpm);
    });
  }
}
